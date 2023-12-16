package X;

/* renamed from: X.5Zk  reason: invalid class name and case insensitive filesystem */
public final class C106545Zk {
    public static boolean A00(AnonymousClass1VX r2) {
        return A04(r2, (C58422vE) null, 4497);
    }

    public static boolean A01(AnonymousClass1VX r2) {
        return A04(r2, (C58422vE) null, 5834);
    }

    public static final boolean A04(AnonymousClass1VX r2, C58422vE r3, int i) {
        boolean A0Y;
        boolean z = false;
        if (r2 != null) {
            z = r2.A0X(3908);
        }
        if (!z) {
            return false;
        }
        if (r3 == null) {
            if (r2 == null) {
                return false;
            }
            A0Y = r2.A0X(i);
        } else if (r2 == null) {
            return false;
        } else {
            A0Y = r2.A0Y(r3, i);
        }
        Boolean valueOf = Boolean.valueOf(A0Y);
        if (valueOf == null || !valueOf.booleanValue()) {
            return false;
        }
        return true;
    }

    public static final boolean A02(AnonymousClass1VX r2) {
        return A04(r2, C58422vE.A01, 5332);
    }

    public static final boolean A03(AnonymousClass1VX r2) {
        if (!C107385bE.A01() || !A04(r2, (C58422vE) null, 4630)) {
            return false;
        }
        return true;
    }
}
