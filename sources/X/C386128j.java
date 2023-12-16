package X;

import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: X.28j  reason: invalid class name and case insensitive filesystem */
public class C386128j {
    public static int A00(C620633i r2) {
        TelephonyManager A0N;
        if (Build.VERSION.SDK_INT < 28 || (A0N = r2.A0N()) == null || A0N.getSignalStrength() == null) {
            return 5;
        }
        return A0N.getSignalStrength().getLevel();
    }
}
