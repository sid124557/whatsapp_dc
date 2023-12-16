package X;

/* renamed from: X.0Qr  reason: invalid class name and case insensitive filesystem */
public class C04790Qr {
    public long A00 = 0;
    public C04790Qr A01;

    public int A00(int i) {
        long j;
        C04790Qr r1 = this.A01;
        if (r1 == null) {
            if (i >= 64) {
                j = this.A00;
            }
            j = this.A00 & ((1 << i) - 1);
        } else {
            if (i >= 64) {
                return r1.A00(i - 64) + Long.bitCount(this.A00);
            }
            j = this.A00 & ((1 << i) - 1);
        }
        return Long.bitCount(j);
    }

    public void A01() {
        this.A00 = 0;
        C04790Qr r0 = this.A01;
        if (r0 != null) {
            r0.A01();
        }
    }

    public final void A02() {
        if (this.A01 == null) {
            this.A01 = new C04790Qr();
        }
    }

    public void A03(int i) {
        if (i >= 64) {
            C04790Qr r0 = this.A01;
            if (r0 != null) {
                r0.A03(i - 64);
                return;
            }
            return;
        }
        this.A00 &= ~(1 << i);
    }

    public void A04(int i) {
        if (i >= 64) {
            A02();
            this.A01.A04(i - 64);
            return;
        }
        this.A00 |= 1 << i;
    }

    public void A05(int i, boolean z) {
        if (i >= 64) {
            A02();
            this.A01.A05(i - 64, z);
            return;
        }
        long j = this.A00;
        boolean A1S = AnonymousClass000.A1S(((Long.MIN_VALUE & j) > 0 ? 1 : ((Long.MIN_VALUE & j) == 0 ? 0 : -1)));
        long j2 = (1 << i) - 1;
        this.A00 = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            A04(i);
        } else {
            A03(i);
        }
        if (A1S || this.A01 != null) {
            A02();
            this.A01.A05(0, A1S);
        }
    }

    public boolean A06(int i) {
        if (i < 64) {
            return AnonymousClass000.A1S(((this.A00 & (1 << i)) > 0 ? 1 : ((this.A00 & (1 << i)) == 0 ? 0 : -1)));
        }
        A02();
        return this.A01.A06(i - 64);
    }

    public boolean A07(int i) {
        if (i >= 64) {
            A02();
            return this.A01.A07(i - 64);
        }
        long j = 1 << i;
        long j2 = this.A00;
        boolean A1S = AnonymousClass000.A1S(((j2 & j) > 0 ? 1 : ((j2 & j) == 0 ? 0 : -1)));
        long j3 = j2 & (~j);
        this.A00 = j3;
        long j4 = j - 1;
        this.A00 = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C04790Qr r0 = this.A01;
        if (r0 != null) {
            if (r0.A06(0)) {
                A04(63);
            }
            this.A01.A07(0);
        }
        return A1S;
    }

    public String toString() {
        C04790Qr r0 = this.A01;
        if (r0 == null) {
            return Long.toBinaryString(this.A00);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1B(r0, A0o);
        A0o.append("xx");
        return AnonymousClass000.A0X(Long.toBinaryString(this.A00), A0o);
    }
}
