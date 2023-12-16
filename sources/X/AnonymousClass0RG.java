package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* renamed from: X.0RG  reason: invalid class name */
public final class AnonymousClass0RG {
    public static Intent A00(Activity activity) {
        Intent A00 = C05730Ur.A00(activity);
        if (A00 != null) {
            return A00;
        }
        try {
            String A01 = A01(activity.getComponentName(), activity);
            if (A01 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, A01);
            try {
                if (A01(componentName, activity) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("getParentActivityIntent: bad parentActivityName '");
                A0o.append(A01);
                Log.e("NavUtils", AnonymousClass000.A0X("' in manifest", A0o));
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String A01(ComponentName componentName, Context context) {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        int i2 = 269222528;
        if (i < 29) {
            i2 = 640;
            if (i >= 24) {
                i2 = 787072;
            }
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i2);
        String str = activityInfo.parentActivityName;
        if (str == null) {
            Bundle bundle = activityInfo.metaData;
            str = null;
            if (!(bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null)) {
                if (string.charAt(0) != '.') {
                    return string;
                }
                return AnonymousClass000.A0V(context.getPackageName(), string, AnonymousClass001.A0o());
            }
        }
        return str;
    }
}
