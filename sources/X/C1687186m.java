package X;

/* renamed from: X.86m  reason: invalid class name and case insensitive filesystem */
public final class C1687186m implements C184868sg {
    public final long A00;
    public final boolean A01;
    public final long[] A02;
    public final long[] A03;

    public long B7B() {
        return this.A00;
    }

    public C152177Xv BCb(long j) {
        if (!this.A01) {
            C158437jy r1 = C158437jy.A02;
            return new C152177Xv(r1, r1);
        }
        long[] jArr = this.A03;
        int A04 = C162387ry.A04(jArr, j, true);
        long j2 = jArr[A04];
        long[] jArr2 = this.A02;
        C158437jy r4 = new C158437jy(j2, jArr2[A04]);
        if (r4.A01 == j || A04 == jArr.length - 1) {
            return new C152177Xv(r4, r4);
        }
        int i = A04 + 1;
        return C152177Xv.A00(r4, jArr[i], jArr2[i]);
    }

    public boolean BIq() {
        return this.A01;
    }

    public C1687186m(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        C161487pm.A03(AnonymousClass000.A1U(length, length2));
        boolean A1W = AnonymousClass001.A1W(length2);
        this.A01 = A1W;
        if (!A1W || jArr2[0] <= 0) {
            this.A02 = jArr;
            this.A03 = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.A02 = jArr3;
            long[] jArr4 = new long[i];
            this.A03 = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.A00 = j;
    }
}
