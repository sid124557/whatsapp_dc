package X;

/* renamed from: X.7qy  reason: invalid class name and case insensitive filesystem */
public class C161997qy {
    public final int A00;
    public final C185518to A01;
    public final Object A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public C161997qy(C185518to r3, boolean z) {
        this.A02 = null;
        this.A05 = false;
        this.A04 = z;
        this.A00 = 1;
        this.A03 = true;
        this.A01 = r3;
    }

    public static C161997qy A00(Object obj) {
        return new C161997qy(obj, -1, false, false, true);
    }

    public static C161997qy A01(Object obj) {
        return new C161997qy(obj, -1, false, false, false);
    }

    public static C161997qy A02(Object obj) {
        return new C161997qy(obj, -1, true, true, false);
    }

    public static C161997qy A03(Object obj, int i) {
        boolean z;
        int i2 = i;
        if (i < 400 || !(i < 500 || i == 505 || i == 507)) {
            z = true;
        } else {
            z = false;
        }
        return new C161997qy(obj, i2, false, false, z);
    }

    public static C161997qy A04(Object obj, int i, boolean z) {
        boolean z2;
        int i2 = i;
        if (i < 400 || !(i < 500 || i == 505 || i == 507)) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new C161997qy(obj, i2, false, z, z2);
    }

    public C161997qy(Object obj, int i, boolean z, boolean z2, boolean z3) {
        this.A02 = obj;
        this.A05 = z;
        this.A04 = z2;
        this.A00 = i;
        this.A03 = z3;
        this.A01 = null;
    }
}
