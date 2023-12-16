package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.86n  reason: invalid class name and case insensitive filesystem */
public final class C1687286n implements C184868sg {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final AnonymousClass7OS A04;

    public long B7B() {
        return this.A02;
    }

    public C152177Xv BCb(long j) {
        AnonymousClass7OS r2 = this.A04;
        long j2 = (long) r2.A03;
        long j3 = (long) this.A00;
        long j4 = (j2 * j) / (j3 * SearchActionVerificationClientService.MS_TO_NS);
        long j5 = this.A01 - 1;
        long A0M = AnonymousClass6C9.A0M(j4, j5);
        long j6 = this.A03;
        long j7 = (long) r2.A01;
        long A05 = C162387ry.A05(A0M * j3, SearchActionVerificationClientService.MS_TO_NS, j2);
        C158437jy r10 = new C158437jy(A05, j6 + (j7 * A0M));
        if (A05 >= j || A0M == j5) {
            return new C152177Xv(r10, r10);
        }
        long j8 = A0M + 1;
        return C152177Xv.A00(r10, C162387ry.A05(j8 * j3, SearchActionVerificationClientService.MS_TO_NS, j2), j6 + (j7 * j8));
    }

    public boolean BIq() {
        return true;
    }

    public C1687286n(AnonymousClass7OS r9, int i, long j, long j2) {
        this.A04 = r9;
        this.A00 = i;
        this.A03 = j;
        long j3 = (j2 - j) / ((long) r9.A01);
        this.A01 = j3;
        this.A02 = C162387ry.A05(j3 * ((long) i), SearchActionVerificationClientService.MS_TO_NS, (long) r9.A03);
    }
}
