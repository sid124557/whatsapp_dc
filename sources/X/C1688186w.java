package X;

/* renamed from: X.86w  reason: invalid class name and case insensitive filesystem */
public final class C1688186w implements C187608xW {
    public final long A00;
    public final long A01;
    public final long[] A02;
    public final long[] A03;

    public long B6k() {
        return this.A00;
    }

    public long B7B() {
        return this.A01;
    }

    public C152177Xv BCb(long j) {
        long[] jArr = this.A03;
        int A04 = C162387ry.A04(jArr, j, true);
        long j2 = jArr[A04];
        long[] jArr2 = this.A02;
        C158437jy r4 = new C158437jy(j2, jArr2[A04]);
        if (r4.A01 >= j || A04 == jArr.length - 1) {
            return new C152177Xv(r4, r4);
        }
        int i = A04 + 1;
        return C152177Xv.A00(r4, jArr[i], jArr2[i]);
    }

    public long BDg(long j) {
        return this.A03[C162387ry.A04(this.A02, j, true)];
    }

    public boolean BIq() {
        return true;
    }

    public C1688186w(long[] jArr, long[] jArr2, long j, long j2) {
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A01 = j;
        this.A00 = j2;
    }
}
