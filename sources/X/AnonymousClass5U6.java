package X;

/* renamed from: X.5U6  reason: invalid class name */
public class AnonymousClass5U6 {
    public long A00;
    public C94824ry A01;
    public final C56612sH A02;
    public final C56892sj A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass4FV A05;
    public final C989053r A06;

    public void A00() {
        C626936e.A06(this.A01);
        this.A05.BhD(this.A01);
    }

    public final void A01() {
        C626936e.A06(this.A01);
        C94824ry r6 = this.A01;
        long j = 0;
        if (this.A00 != 0) {
            j = this.A02.A0H() - this.A00;
        }
        r6.A05 = Long.valueOf(j);
        this.A00 = this.A02.A0H();
    }

    public void A02(int i) {
        C94824ry r1;
        if (this.A04.A0X(2914) && (r1 = this.A01) != null && r1.A02.intValue() == i) {
            r1.A01 = C18290x4.A0a();
            A01();
            A00();
            this.A00 = 0;
            if (this.A01 != null) {
                this.A01 = null;
            }
        }
    }

    public void A03(int i) {
        C94824ry r1;
        if (this.A04.A0X(2914) && (r1 = this.A01) != null && r1.A02.intValue() == i) {
            r1.A01 = C18280x3.A0S();
            A01();
            A00();
            this.A00 = 0;
            if (this.A01 != null) {
                this.A01 = null;
            }
        }
    }

    public void A04(C95814uZ r4) {
        if (this.A04.A0X(2914)) {
            this.A00 = 0;
            if (this.A01 != null) {
                this.A01 = null;
            }
            C94824ry r2 = new C94824ry();
            this.A01 = r2;
            if (r4 != null) {
                boolean A0K = C627336j.A0K(r4);
                r2.A00 = Boolean.valueOf(A0K);
                if (A0K) {
                    r2.A03 = Integer.valueOf(AnonymousClass36M.A04(this.A03.A09.A03((C28011fL) r4)));
                }
            }
            A01();
            C94824ry r1 = this.A01;
            Integer A0f = AnonymousClass001.A0f();
            r1.A01 = A0f;
            r1.A02 = A0f;
            A00();
        }
    }

    public AnonymousClass5U6(C56612sH r1, C56892sj r2, AnonymousClass1VX r3, AnonymousClass4FV r4, C989053r r5) {
        this.A02 = r1;
        this.A04 = r3;
        this.A05 = r4;
        this.A06 = r5;
        this.A03 = r2;
    }
}
