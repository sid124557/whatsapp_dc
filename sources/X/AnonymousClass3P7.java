package X;

/* renamed from: X.3P7  reason: invalid class name */
public class AnonymousClass3P7 implements AnonymousClass4D1 {
    public final C56452s0 A00;
    public final C103265Mf A01;
    public final C46112b6 A02;
    public final C45602aH A03;
    public final /* synthetic */ C56452s0 A04;

    public AnonymousClass3P7(C56452s0 r1, C56452s0 r2, C103265Mf r3, C46112b6 r4, C45602aH r5) {
        this.A04 = r1;
        this.A03 = r5;
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public void BYx(C95814uZ r9, String str, int i, long j) {
        C45602aH r1 = this.A03;
        r1.A01.A01(r9);
        r1.A02.A01(r9);
        int i2 = i;
        this.A00.A00(r9, i);
        int i3 = 6;
        if (i == 401) {
            i3 = 7;
        }
        this.A01.A00((Double) null, C18310x6.A0f(System.currentTimeMillis(), j), i3, C18280x3.A01("preview".equals(str) ? 1 : 0), i2);
    }

    public void BYy(AnonymousClass2T0 r3, long j) {
        C46112b6 r1 = this.A02;
        if (r1 != null) {
            r1.A00(2);
        }
        this.A04.A04(r3, j);
    }
}
