package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.813  reason: invalid class name */
public final class AnonymousClass813 implements C184718sP {
    public final /* synthetic */ AnonymousClass81C A00;

    public AnonymousClass813(AnonymousClass81C r1) {
        this.A00 = r1;
    }

    public long B7B() {
        AnonymousClass81C r0 = this.A00;
        return (r0.A07 * SearchActionVerificationClientService.MS_TO_NS) / ((long) r0.A0B.A00);
    }

    public C152137Xr BCa(long j) {
        AnonymousClass81C r8 = this.A00;
        long A0H = AnonymousClass6C7.A0H((long) r8.A0B.A00, j);
        long j2 = r8.A09;
        long j3 = r8.A08;
        C158407jv r1 = new C158407jv(j, Math.max(j2, AnonymousClass6C8.A0P(j3, (j2 + ((A0H * (j3 - j2)) / r8.A07)) - C625635p.A0L)));
        return new C152137Xr(r1, r1);
    }

    public boolean BIq() {
        return true;
    }
}
