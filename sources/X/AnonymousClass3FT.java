package X;

/* renamed from: X.3FT  reason: invalid class name */
public class AnonymousClass3FT implements AnonymousClass4E8 {
    public final C22931Qq A00;
    public final C53412n3 A01;
    public final C64383Dg A02;

    public void BQW() {
        this.A00.A01();
        AnonymousClass1kB r7 = ((C22961Qt) this.A02).A01;
        for (C60712z2 r5 : r7.A07()) {
            if (System.currentTimeMillis() - r5.A00 > C60712z2.A03) {
                r7.A09(AnonymousClass32Y.A0A(r5.A02));
            }
        }
    }

    public void BQX() {
        C53412n3 r1 = this.A01;
        r1.A02(r1.A01);
        r1.A02(r1.A00);
    }

    public AnonymousClass3FT(C22931Qq r1, C53412n3 r2, C64383Dg r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public String BDW() {
        return "CtwaLoggingCleanUpDailyCron";
    }
}
