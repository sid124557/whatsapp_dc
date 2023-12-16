package X;

import android.util.Log;

/* renamed from: X.875  reason: invalid class name */
public final class AnonymousClass875 implements C185608tx {
    public int A00;
    public int A01;
    public long A02;
    public C185598tw A03;
    public boolean A04;
    public final C161467pi A05 = C161467pi.A05(10);

    public void Bky() {
        this.A04 = false;
    }

    public void AzY(C161467pi r9) {
        C161487pm.A01(this.A03);
        if (this.A04) {
            int i = r9.A00;
            int i2 = r9.A01;
            int i3 = i - i2;
            int i4 = this.A00;
            if (i4 < 10) {
                int min = Math.min(i3, 10 - i4);
                byte[] bArr = r9.A02;
                C161467pi r4 = this.A05;
                System.arraycopy(bArr, i2, r4.A02, i4, min);
                if (this.A00 + min == 10) {
                    r4.A0S(0);
                    if (73 == r4.A0C() && 68 == r4.A0C() && 51 == r4.A0C()) {
                        r4.A0T(3);
                        this.A01 = r4.A0B() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.A04 = false;
                        return;
                    }
                }
            }
            int A0A = AnonymousClass6C9.A0A(this.A01, this.A00, i3);
            this.A03.Bkc(r9, A0A);
            this.A00 += A0A;
        }
    }

    public void BgP() {
        int i;
        C185598tw r1 = this.A03;
        C161487pm.A01(r1);
        if (this.A04 && (i = this.A01) != 0 && this.A00 == i) {
            r1.Bkh((AnonymousClass7WZ) null, 1, i, 0, this.A02);
            this.A04 = false;
        }
    }

    public void BgQ(long j, int i) {
        if ((i & 4) != 0) {
            this.A04 = true;
            this.A02 = j;
            this.A01 = 0;
            this.A00 = 0;
        }
    }

    public void B19(C187028wK r4, C151897Ws r5) {
        r5.A02();
        r5.A03();
        C185598tw Br0 = r4.Br0(r5.A00, 5);
        this.A03 = Br0;
        C157057he A002 = C157057he.A00();
        r5.A03();
        A002.A0O = r5.A01;
        A002.A0R = "application/id3";
        C166527yp.A01(A002, Br0);
    }
}
