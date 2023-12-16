package X;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: X.73n  reason: invalid class name and case insensitive filesystem */
public class C1449373n {
    public static long A00(AnonymousClass84O r5) {
        Object A05 = AnonymousClass84O.A05(r5, 35);
        if (A05 != null) {
            if (A05 instanceof String) {
                String str = (String) A05;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        return Long.parseLong(str);
                    } catch (NumberFormatException e) {
                        Log.e("WaRcCountDownTimer", AnonymousClass000.A0P(A05, "Invalid long value:", AnonymousClass001.A0o()), e);
                        return 0;
                    }
                }
            } else if (A05 instanceof Number) {
                return C18310x6.A0B(A05);
            } else {
                throw AnonymousClass001.A0c("Attempting to extract unrecognized type from countdown timer component");
            }
        }
        return 0;
    }
}
