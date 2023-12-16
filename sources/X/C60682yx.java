package X;

/* renamed from: X.2yx  reason: invalid class name and case insensitive filesystem */
public class C60682yx {
    public final C55992rF A00 = new C55992rF();
    public final C55992rF A01 = new C55992rF();
    public volatile boolean A02 = false;

    public static final boolean A00(C55992rF r3, boolean z) {
        boolean z2;
        synchronized (r3) {
            z2 = false;
            if (r3.A00 > 3) {
                z2 = true;
            }
        }
        if (z2) {
            return false;
        }
        if (z) {
            r3.A01();
            return true;
        }
        r3.A02();
        return true;
    }

    public final boolean A01() {
        boolean A1T;
        boolean A1T2;
        C55992rF r1 = this.A01;
        synchronized (r1) {
            A1T = AnonymousClass001.A1T(r1.A00);
        }
        if (A1T) {
            C55992rF r2 = this.A00;
            synchronized (r2) {
                A1T2 = AnonymousClass001.A1T(r2.A00);
            }
            if (!A1T2) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A02() {
        boolean A1U;
        boolean A1U2;
        C55992rF r2 = this.A01;
        synchronized (r2) {
            A1U = AnonymousClass000.A1U(r2.A00, 5);
        }
        if (A1U) {
            C55992rF r22 = this.A00;
            synchronized (r22) {
                A1U2 = AnonymousClass000.A1U(r22.A00, 5);
            }
            if (!A1U2) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A03() {
        boolean A1U;
        boolean A1U2;
        C55992rF r2 = this.A01;
        synchronized (r2) {
            A1U = AnonymousClass000.A1U(r2.A00, 4);
        }
        if (!A1U) {
            C55992rF r22 = this.A00;
            synchronized (r22) {
                A1U2 = AnonymousClass000.A1U(r22.A00, 4);
            }
            if (A1U2 || A02()) {
                return true;
            }
            return false;
        }
        return true;
    }
}
