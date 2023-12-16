package X;

/* renamed from: X.0hQ  reason: invalid class name and case insensitive filesystem */
public class C10120hQ implements C835348u {
    public final C835348u A00;

    public static final void A01(C153317b2 r2, float f) {
        r2.A02((double) f);
    }

    /* renamed from: A03 */
    public Object B2m(C131266dJ r5, C157967jD r6, C146787Bp r7) {
        String str = r7.A00;
        switch (str.hashCode()) {
            case -600206934:
                if (str.equals("bk.action.animation.spring.GetCurrentValue")) {
                    return C159427lo.A00(A00((C153317b2) r6.A03(0)));
                }
                break;
            case -512481856:
                if (str.equals("bk.action.animation.spring.Create")) {
                    return A02(r5, C155787fV.A00(r6.A04(0)));
                }
                break;
            case 1371463060:
                if (str.equals("bk.action.animation.spring.SetEndValue")) {
                    A01((C153317b2) r6.A03(0), AnonymousClass001.A05(r6.A04(1)));
                    return null;
                }
                break;
        }
        return this.A00.B2m(r6, r7, r5);
    }

    public C10120hQ(C835348u r1) {
        this.A00 = r1;
    }

    public static final double A00(C153317b2 r1) {
        return r1.A00();
    }

    public final C153317b2 A02(C131266dJ r4, C835248t r5) {
        C153317b2 A01 = C158147jV.A00().A01();
        C152057Xj r1 = new C152057Xj();
        r1.A05(A01, 0);
        A01.A03(new C01890Cp(this, r4, r1.A03(), r5));
        return A01;
    }
}
