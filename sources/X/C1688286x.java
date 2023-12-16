package X;

/* renamed from: X.86x  reason: invalid class name and case insensitive filesystem */
public final class C1688286x implements C187608xW {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long[] A05;

    public long B6k() {
        return this.A01;
    }

    public long B7B() {
        return this.A04;
    }

    public C152177Xv BCb(long j) {
        C158437jy r2;
        double d;
        long[] jArr = this.A05;
        if (!AnonymousClass000.A1W(jArr)) {
            r2 = new C158437jy(0, this.A03 + ((long) this.A00));
        } else {
            long j2 = this.A04;
            long A0M = AnonymousClass6C9.A0M(j, j2);
            double d2 = (((double) A0M) * 100.0d) / ((double) j2);
            double d3 = 0.0d;
            if (d2 > 0.0d) {
                if (d2 >= 100.0d) {
                    d3 = 256.0d;
                } else {
                    int i = (int) d2;
                    C161487pm.A01(jArr);
                    double d4 = (double) jArr[i];
                    if (i == 99) {
                        d = 256.0d;
                    } else {
                        d = (double) jArr[i + 1];
                    }
                    d3 = d4 + ((d2 - ((double) i)) * (d - d4));
                }
            }
            long j3 = this.A02;
            r2 = new C158437jy(A0M, this.A03 + Math.max((long) this.A00, AnonymousClass6C8.A0P(j3, Math.round((d3 / 256.0d) * ((double) j3)))));
        }
        return new C152177Xv(r2, r2);
    }

    public long BDg(long j) {
        long j2;
        double d;
        long j3 = j - this.A03;
        long[] jArr = this.A05;
        if (!AnonymousClass000.A1W(jArr) || j3 <= ((long) this.A00)) {
            return 0;
        }
        C161487pm.A01(jArr);
        double d2 = (((double) j3) * 256.0d) / ((double) this.A02);
        int A042 = C162387ry.A04(jArr, (long) d2, true);
        long j4 = this.A04;
        long j5 = (j4 * ((long) A042)) / 100;
        long j6 = jArr[A042];
        int i = A042 + 1;
        long j7 = (j4 * ((long) i)) / 100;
        if (A042 == 99) {
            j2 = 256;
        } else {
            j2 = jArr[i];
        }
        if (j6 == j2) {
            d = 0.0d;
        } else {
            d = (d2 - ((double) j6)) / ((double) (j2 - j6));
        }
        return j5 + Math.round(d * ((double) (j7 - j5)));
    }

    public boolean BIq() {
        return AnonymousClass000.A1W(this.A05);
    }

    public C1688286x(long[] jArr, int i, long j, long j2, long j3) {
        this.A03 = j;
        this.A00 = i;
        this.A04 = j2;
        this.A05 = jArr;
        this.A02 = j3;
        this.A01 = j3 != -1 ? j + j3 : -1;
    }
}
