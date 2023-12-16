package X;

import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: X.5Bh  reason: invalid class name and case insensitive filesystem */
public final class C100535Bh {
    public static final boolean A00(C620633i r5, AnonymousClass1VW r6, int i) {
        TelephonyManager A0N;
        int A1U = C18270x1.A1U(r5, r6);
        boolean A0X = r6.A0X(4431);
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 28;
        if (A0X) {
            i3 = 23;
        }
        if (!C18280x3.A1U(i2, i3) || (((A0N = r5.A0N()) != null && A0N.getSimState() == A1U) || i < A1U)) {
            return false;
        }
        return true;
    }
}
