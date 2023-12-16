package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.86i  reason: invalid class name and case insensitive filesystem */
public final class C1686786i implements C184868sg {
    public final /* synthetic */ AnonymousClass873 A00;

    public C1686786i(AnonymousClass873 r1) {
        this.A00 = r1;
    }

    public long B7B() {
        AnonymousClass873 r0 = this.A00;
        return (r0.A07 * SearchActionVerificationClientService.MS_TO_NS) / ((long) r0.A0B.A00);
    }

    public C152177Xv BCb(long j) {
        AnonymousClass873 r8 = this.A00;
        long A0H = AnonymousClass6C7.A0H((long) r8.A0B.A00, j);
        long j2 = r8.A09;
        long j3 = r8.A08;
        C158437jy r1 = new C158437jy(j, Math.max(j2, AnonymousClass6C8.A0P(j3, (j2 + ((A0H * (j3 - j2)) / r8.A07)) - C625635p.A0L)));
        return new C152177Xv(r1, r1);
    }

    public boolean BIq() {
        return true;
    }
}
