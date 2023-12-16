package X;

/* renamed from: X.5Zg  reason: invalid class name and case insensitive filesystem */
public final class C106505Zg {
    public static final int A02(AnonymousClass1VX r2, AnonymousClass581 r3) {
        int A02 = C18320x8.A02(r3, 0);
        if (A02 == 0) {
            return A01(r2);
        }
        if (A02 == 1) {
            String A0Q = r2.A0Q(3810);
            if (A0Q != null) {
                return Integer.parseInt(A0Q);
            }
            return 20601216;
        } else if (A02 == 2) {
            Integer A06 = C829745q.A06(C56952sp.A08(r2, 6498));
            if (A06 != null) {
                return A06.intValue();
            }
            return 20610101;
        } else {
            throw C73153f1.A00();
        }
    }

    public static final int A00(AnonymousClass1VX r1) {
        String A0Q = r1.A0Q(3835);
        if (A0Q != null) {
            return Integer.parseInt(A0Q);
        }
        return 20601218;
    }

    public static final int A01(AnonymousClass1VX r1) {
        String A0Q = r1.A0Q(3834);
        if (A0Q != null) {
            return Integer.parseInt(A0Q);
        }
        return 20601217;
    }
}
