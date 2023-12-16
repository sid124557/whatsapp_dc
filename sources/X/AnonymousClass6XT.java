package X;

/* renamed from: X.6XT  reason: invalid class name */
public class AnonymousClass6XT extends C169838Av {
    public C128766Xj A00;
    public boolean A01 = false;
    public final C128766Xj A02;

    public static void A00(AnonymousClass6XT r1) {
        if (r1.A01) {
            r1.A02();
            r1.A01 = false;
        }
    }

    public void A02() {
        C128766Xj r2 = (C128766Xj) this.A00.A09(4);
        AnonymousClass6C9.A0U(r2).Btg(r2, this.A00);
        this.A00 = r2;
    }

    public /* synthetic */ C187848xu Bu1() {
        if (!this.A01) {
            C128766Xj r1 = this.A00;
            AnonymousClass6C9.A0U(r1).Btp(r1);
            this.A01 = true;
        }
        return this.A00;
    }

    public final /* synthetic */ C187848xu BuK() {
        return this.A02;
    }

    public /* synthetic */ Object clone() {
        AnonymousClass6XT A012 = C128766Xj.A01(this.A02);
        A00(A012);
        C128766Xj r1 = A012.A00;
        AnonymousClass6C9.A0U(r1).Btg(r1, (C128766Xj) Bu1());
        return A012;
    }

    public AnonymousClass6XT(C128766Xj r2) {
        this.A02 = r2;
        this.A00 = (C128766Xj) r2.A09(4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
        if (r1 != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C128766Xj A01() {
        /*
            r3 = this;
            X.8xu r2 = r3.Bu1()
            X.6Xj r2 = (X.C128766Xj) r2
            r0 = 1
            java.lang.Object r0 = r2.A09(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            byte r1 = r0.byteValue()
            r0 = 1
            if (r1 == r0) goto L_0x0024
            if (r1 == 0) goto L_0x0025
            X.8v1 r0 = X.AnonymousClass6C9.A0U(r2)
            boolean r1 = r0.Bty(r2)
            r0 = 2
            r2.A09(r0)
            if (r1 == 0) goto L_0x0025
        L_0x0024:
            return r2
        L_0x0025:
            X.8RR r0 = new X.8RR
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6XT.A01():X.6Xj");
    }
}
