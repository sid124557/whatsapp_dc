package X;

/* renamed from: X.1uQ  reason: invalid class name and case insensitive filesystem */
public class C34221uQ extends C153387bE {
    public long A00;
    public Integer A01;
    public Integer A02;
    public boolean A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final C56612sH A09;
    public final AnonymousClass1VX A0A;
    public final AnonymousClass4FV A0B;
    public final C104965Ta A0C = new C104965Ta();
    public final C104965Ta A0D = new C104965Ta();

    public void A00() {
        this.A03 = true;
        this.A0C.A02();
    }

    public void A05(boolean z, int i) {
        if (i == 3) {
            if (z) {
                this.A0C.A00();
                this.A0D.A02();
                return;
            }
        } else if (!(i == 1 || i == 4 || i == 2)) {
            return;
        }
        this.A0D.A00();
    }

    public void A01() {
        this.A0D.A00();
    }

    public void A03(int i) {
        int i2;
        if (this.A03) {
            C25741b0 r3 = new C25741b0();
            r3.A04 = this.A02;
            r3.A03 = Integer.valueOf(this.A01);
            C104965Ta r2 = this.A0D;
            r3.A0A = AnonymousClass0x9.A0o(r2.A00, 1000);
            r3.A09 = Long.valueOf(this.A0C.A00);
            long j = this.A07;
            long j2 = -1;
            if (j != -1) {
                j2 = AnonymousClass0x9.A05(j) / 1000;
            }
            r3.A07 = Long.valueOf(j2);
            r3.A08 = Long.valueOf(this.A06);
            r3.A00 = C18330xA.A07(this.A05);
            r3.A0B = Long.valueOf(this.A08);
            r3.A06 = Long.valueOf(this.A04);
            r3.A05 = Long.valueOf(this.A00);
            r3.A01 = Integer.valueOf(this.A00);
            Integer num = this.A01;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 1;
            }
            r3.A02 = Integer.valueOf(i2);
            this.A0B.BhD(r3);
            this.A03 = false;
            r2.A01();
        }
    }

    public C34221uQ(C56612sH r3, AnonymousClass1VX r4, AnonymousClass4FV r5, Integer num, int i, int i2, long j, long j2, long j3, long j4, long j5) {
        super(i2, num.intValue());
        this.A09 = r3;
        this.A0A = r4;
        this.A0B = r5;
        this.A06 = j;
        this.A02 = Integer.valueOf(i);
        this.A07 = j2;
        this.A05 = j3;
        this.A08 = j4;
        this.A04 = j5;
    }

    public void A02() {
    }

    public void A04(Integer num, boolean z) {
        this.A01 = num;
    }
}
