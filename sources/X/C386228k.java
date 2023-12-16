package X;

import android.text.TextUtils;

/* renamed from: X.28k  reason: invalid class name and case insensitive filesystem */
public class C386228k {
    public static boolean A00(C56612sH r5, AnonymousClass33p r6) {
        long A0H = r5.A0H();
        C183538qC r3 = r6.A01;
        if (A0H >= AnonymousClass0x2.A0B(C18300x5.A0B(r3), "device_switching_code_expiry") || TextUtils.isEmpty(C18280x3.A0Z(C18300x5.A0B(r3), "device_switching_code"))) {
            return false;
        }
        return true;
    }
}
