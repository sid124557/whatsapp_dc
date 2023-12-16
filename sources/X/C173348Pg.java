package X;

/* renamed from: X.8Pg  reason: invalid class name and case insensitive filesystem */
public final class C173348Pg implements C188078yH {
    public int A00;
    public long A01;
    public C158837kd A02;
    public boolean A03;
    public final C172278Kj A04;
    public final C188558z5 A05;

    public void close() {
        this.A03 = true;
    }

    public long BiH(C172278Kj r15, long j) {
        C158837kd r0;
        C158837kd r02;
        if (!this.A03) {
            C158837kd r1 = this.A02;
            if (r1 == null || (r1 == (r02 = this.A04.A01) && this.A00 == r02.A01)) {
                long j2 = j;
                this.A05.Bjk(this.A01 + j);
                if (this.A02 == null && (r0 = this.A04.A01) != null) {
                    this.A02 = r0;
                    this.A00 = r0.A01;
                }
                C172278Kj r4 = this.A04;
                long j3 = r4.A00;
                long j4 = this.A01;
                long min = Math.min(j2, j3 - j4);
                if (min <= 0) {
                    return -1;
                }
                long j5 = min;
                C1453875h.A00(j3, j4, min);
                if (min != 0) {
                    r15.A00 += min;
                    C158837kd r42 = r4.A01;
                    while (r42 != null) {
                        long j6 = (long) (r42.A00 - r42.A01);
                        if (j4 >= j6) {
                            j4 -= j6;
                            r42 = r42.A02;
                        } else {
                            while (j5 > 0) {
                                if (r42 == null) {
                                    throw C162457s7.A05();
                                }
                                C158837kd A022 = r42.A02();
                                int i = A022.A01 + ((int) j4);
                                A022.A01 = i;
                                A022.A00 = Math.min(i + ((int) j5), A022.A00);
                                C158837kd r2 = r15.A01;
                                if (r2 == null) {
                                    A022.A03 = A022;
                                    A022.A02 = A022;
                                    r15.A01 = A022;
                                } else {
                                    C158837kd r22 = r2.A03;
                                    if (r22 == null) {
                                        throw C162457s7.A05();
                                    }
                                    r22.A03(A022);
                                }
                                j5 -= (long) (A022.A00 - A022.A01);
                                r42 = r42.A02;
                                j4 = 0;
                            }
                        }
                    }
                    throw C162457s7.A05();
                }
                this.A01 += min;
                return min;
            }
            throw AnonymousClass001.A0e("Peek source is invalid because upstream source was used");
        }
        throw AnonymousClass001.A0e("closed");
    }

    public C173348Pg(C188558z5 r2) {
        int i;
        this.A05 = r2;
        C172278Kj B4u = r2.B4u();
        this.A04 = B4u;
        C158837kd r0 = B4u.A01;
        this.A02 = r0;
        if (r0 != null) {
            i = r0.A01;
        } else {
            i = -1;
        }
        this.A00 = i;
    }
}
