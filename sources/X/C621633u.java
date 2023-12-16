package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.text.TextUtils;

/* renamed from: X.33u  reason: invalid class name and case insensitive filesystem */
public abstract class C621633u {
    @Deprecated
    public static Activity A00(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    @Deprecated
    public static Activity A01(Context context, Class cls) {
        Activity A00 = A00(context);
        if (A00 == null || !cls.isAssignableFrom(A00.getClass())) {
            return null;
        }
        return A00;
    }

    public static void A02(Intent intent) {
        if (!A03(intent)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Intent ");
            A0o.append(intent);
            C18260x0.A1M(A0o, " is implicit. For apps targeting API 34+ (Android 14+) implicit broadcasts will NOT be delivered to un-exported internal broadcast receivers. So, if thisbroadcast is meant for an unexported internal receiver make the receiver exported or make the Intent explicit. More information here https://fburl.com/dxdppmde");
        }
    }

    public static boolean A03(Intent intent) {
        if (!TextUtils.isEmpty(intent.getPackage()) || intent.getComponent() != null) {
            return true;
        }
        return false;
    }
}
