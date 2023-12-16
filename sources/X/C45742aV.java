package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2aV  reason: invalid class name and case insensitive filesystem */
public class C45742aV {
    public final C116985rC A00;
    public final C69263Wi A01;
    public final AnonymousClass1VX A02;
    public final C49952hM A03;

    public boolean A00(Context context, Intent intent, AnonymousClass4FU r11, String str, boolean z) {
        Intent A012;
        if (z) {
            ArrayList A0s = AnonymousClass001.A0s();
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (queryIntentActivities != null) {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    String str2 = activityInfo.name;
                    String str3 = activityInfo.applicationInfo.packageName;
                    Intent intent2 = new Intent(intent);
                    intent2.setClassName(str3, str2);
                    intent2.setPackage(str3);
                    if (str3.contains("gm") || str3.contains("email") || str3.contains("fsck.k9") || str3.contains("maildroid") || str3.contains("hotmail") || str3.contains("android.mail") || str3.contains("com.baydin.boomerang") || str3.contains("yandex.mail") || str3.contains("com.google.android.apps.inbox") || str3.contains("com.microsoft.office.outlook") || str3.contains("com.asus.email") || str3.equals("org.kman.AquaMail")) {
                        A0s.add(intent2);
                    }
                }
            }
            int size = A0s.size();
            if (size != 0) {
                if (size == 1) {
                    A012 = (Intent) A0s.get(0);
                } else {
                    int i = size - 1;
                    Object obj = A0s.get(i);
                    A0s.remove(i);
                    A0s.add(0, obj);
                    A012 = C107395bF.A01((IntentSender) null, str, A0s);
                }
                context.startActivity(A012);
                return true;
            } else if (r11 != null) {
                r11.Bot(R.string.f11nameremoved);
                return false;
            } else {
                this.A01.A0H(R.string.f11nameremoved, 0);
                return false;
            }
        } else {
            try {
                context.startActivity(Intent.createChooser(intent, str));
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("email-sender/start-activity ", e);
                this.A01.A0H(R.string.f11nameremoved, 0);
                return false;
            }
        }
    }

    public C45742aV(C116985rC r1, C69263Wi r2, AnonymousClass1VX r3, C49952hM r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }
}
