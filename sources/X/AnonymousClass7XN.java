package X;

/* renamed from: X.7XN  reason: invalid class name */
public final class AnonymousClass7XN {
    public int A00;
    public int A01 = 1000;
    public int A02;
    public int A03;
    public int A04;
    public long A05 = Long.MIN_VALUE;
    public long A06 = Long.MIN_VALUE;
    public C166637z1 A07;
    public boolean A08 = true;
    public boolean A09 = true;
    public int[] A0A = new int[1000];
    public int[] A0B = new int[1000];
    public int[] A0C = new int[1000];
    public long[] A0D = new long[1000];
    public long[] A0E = new long[1000];
    public C166637z1[] A0F = new C166637z1[1000];
    public AnonymousClass7WT[] A0G = new AnonymousClass7WT[1000];

    public synchronized boolean A01() {
        return AnonymousClass001.A1X(this.A03, this.A02);
    }

    public final long A00(int i) {
        int i2;
        long j = this.A05;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int i3 = this.A04 + (i - 1);
            int i4 = this.A01;
            if (i3 >= i4) {
                i3 -= i4;
            }
            for (int i5 = 0; i5 < i; i5++) {
                j2 = Math.max(j2, this.A0E[i2]);
                if ((this.A0A[i2] & 1) != 0) {
                    break;
                }
                i2--;
                if (i2 == -1) {
                    i2 = i4 - 1;
                }
            }
        }
        this.A05 = Math.max(j, j2);
        int i6 = this.A02 - i;
        this.A02 = i6;
        this.A00 += i;
        int i7 = this.A04 + i;
        this.A04 = i7;
        int i8 = this.A01;
        if (i7 >= i8) {
            i7 -= i8;
            this.A04 = i7;
        }
        int i9 = this.A03 - i;
        this.A03 = i9;
        if (i9 < 0) {
            this.A03 = 0;
        }
        if (i6 != 0) {
            return this.A0D[i7];
        }
        if (i7 != 0) {
            i8 = i7;
        }
        int i10 = i8 - 1;
        return this.A0D[i10] + ((long) this.A0B[i10]);
    }
}
