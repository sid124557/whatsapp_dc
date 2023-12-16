package X;

/* renamed from: X.7ce  reason: invalid class name and case insensitive filesystem */
public class C154127ce {
    public static int A00(C153427bI r1, AnonymousClass84O r2) {
        return A01(r1, r2, 0);
    }

    public static int A01(C153427bI r0, AnonymousClass84O r1, int i) {
        try {
            if (r0.A05) {
                String A06 = AnonymousClass84O.A06(r1);
                if (A06 != null) {
                    return C162407s0.A05(A06);
                }
                return i;
            }
            String A07 = AnonymousClass84O.A07(r1);
            if (A07 != null) {
                return C162407s0.A05(A07);
            }
            return i;
        } catch (AnonymousClass6u2 unused) {
            C159737mN.A01("ThemedColorUtils", "Error parsing themed color");
            return i;
        }
    }
}
