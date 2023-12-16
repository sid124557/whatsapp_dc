package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.86j  reason: invalid class name and case insensitive filesystem */
public final class C1686886j implements C184868sg {
    public final long A00;
    public final C161727qK A01;

    public long B7B() {
        return this.A01.A02();
    }

    public C152177Xv BCb(long j) {
        C161727qK r1 = this.A01;
        C147827Fw r0 = r1.A0A;
        C161487pm.A01(r0);
        long[] jArr = r0.A01;
        long[] jArr2 = r0.A00;
        long j2 = (long) r1.A07;
        long j3 = 0;
        int A04 = C162387ry.A04(jArr, Math.max(0, Math.min(AnonymousClass6C7.A0H(j, j2), r1.A09 - 1)), false);
        long j4 = 0;
        if (A04 != -1) {
            j3 = jArr[A04];
            if (A04 != -1) {
                j4 = jArr2[A04];
            }
        }
        long j5 = this.A00;
        C158437jy r12 = new C158437jy((j3 * SearchActionVerificationClientService.MS_TO_NS) / j2, j5 + j4);
        if (r12.A01 == j || A04 == jArr.length - 1) {
            return new C152177Xv(r12, r12);
        }
        int i = A04 + 1;
        return C152177Xv.A00(r12, (jArr[i] * SearchActionVerificationClientService.MS_TO_NS) / j2, j5 + jArr2[i]);
    }

    public boolean BIq() {
        return true;
    }

    public C1686886j(C161727qK r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }
}
