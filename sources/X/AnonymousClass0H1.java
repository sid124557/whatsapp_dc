package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0H1  reason: invalid class name */
public class AnonymousClass0H1 {
    public static String A00(Context context, List list, boolean z) {
        ArrayList arrayList;
        PackageManager packageManager = context.getPackageManager();
        if (list == null) {
            arrayList = AnonymousClass001.A0s();
        } else {
            arrayList = list;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        ArrayList arrayList2 = arrayList;
        if (!z) {
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            arrayList2 = arrayList;
            if (resolveActivity != null) {
                String str = resolveActivity.activityInfo.packageName;
                ArrayList A0I = AnonymousClass002.A0I(arrayList.size() + 1);
                A0I.add(str);
                arrayList2 = A0I;
                if (list != null) {
                    A0I.addAll(list);
                    arrayList2 = A0I;
                }
            }
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            intent2.setPackage(A0m);
            if (packageManager.resolveService(intent2, 0) != null) {
                return A0m;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }
}
