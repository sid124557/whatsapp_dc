package X;

import java.util.Set;

/* renamed from: X.2uR  reason: invalid class name and case insensitive filesystem */
public final class C57932uR {
    public static final Set A00;

    static {
        Integer[] numArr = new Integer[5];
        AnonymousClass000.A1L(numArr, 401);
        AnonymousClass000.A1M(numArr, 406);
        AnonymousClass000.A1N(numArr, 407);
        AnonymousClass000.A1O(numArr, 403);
        C18280x3.A1P(numArr, 412);
        A00 = C73833g9.A06(numArr);
    }

    public static final boolean A00(C624134x r4) {
        C624034w r0;
        AnonymousClass1S4 r02;
        C624034w r1 = r4.A0P;
        if (r1 != null && r4.A1J.A02) {
            Integer valueOf = Integer.valueOf(r1.A02);
            if (C73723fy.A0U(A00, valueOf) || !(valueOf == null || valueOf.intValue() != 408 || (r0 = r4.A0P) == null || (r02 = r0.A0A) == null || r02.A08() != 403)) {
                return true;
            }
        }
        return false;
    }
}
