package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.86q  reason: invalid class name and case insensitive filesystem */
public class C1687586q implements C184868sg {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;

    public long A00(long j) {
        return ((Math.max(0, j - this.A04) * 8) * SearchActionVerificationClientService.MS_TO_NS) / ((long) this.A00);
    }

    public long B7B() {
        return this.A03;
    }

    public C152177Xv BCb(long j) {
        long j2 = this.A02;
        if (j2 == -1) {
            C158437jy r1 = new C158437jy(0, this.A04);
            return new C152177Xv(r1, r1);
        }
        long j3 = (long) this.A01;
        long A0M = this.A04 + AnonymousClass6C9.A0M((((j * ((long) this.A00)) / 8000000) / j3) * j3, j2 - j3);
        long A002 = A00(A0M);
        C158437jy r7 = new C158437jy(A002, A0M);
        if (A002 < j) {
            long j4 = j3 + A0M;
            if (j4 < this.A05) {
                return C152177Xv.A00(r7, A00(j4), j4);
            }
        }
        return new C152177Xv(r7, r7);
    }

    public boolean BIq() {
        return AnonymousClass000.A1S((this.A02 > -1 ? 1 : (this.A02 == -1 ? 0 : -1)));
    }

    public C1687586q(int i, int i2, long j, long j2) {
        long max;
        this.A05 = j;
        this.A04 = j2;
        this.A01 = i2 == -1 ? 1 : i2;
        this.A00 = i;
        if (j == -1) {
            this.A02 = -1;
            max = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.A02 = j3;
            max = ((Math.max(0, j3) * 8) * SearchActionVerificationClientService.MS_TO_NS) / ((long) i);
        }
        this.A03 = max;
    }
}
