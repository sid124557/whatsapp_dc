package X;

import com.facebook.android.exoplayer2.util.Util;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.817  reason: invalid class name */
public class AnonymousClass817 implements C184718sP, C184738sR {
    public long A00 = -1;
    public long A01 = -1;
    public long[] A02;
    public long[] A03;
    public final /* synthetic */ C125826Jq A04;

    public AnonymousClass817(C125826Jq r3) {
        this.A04 = r3;
    }

    public C184718sP B11() {
        return this;
    }

    public long B7B() {
        AnonymousClass7NQ r4 = this.A04.A00;
        return (r4.A04 * SearchActionVerificationClientService.MS_TO_NS) / ((long) r4.A03);
    }

    public C152137Xr BCa(long j) {
        C125826Jq r4 = this.A04;
        int A032 = Util.A03(this.A02, AnonymousClass6C7.A0H((long) r4.A00, j), true);
        long[] jArr = this.A02;
        long j2 = jArr[A032] * SearchActionVerificationClientService.MS_TO_NS;
        long j3 = (long) r4.A00;
        long j4 = j2 / j3;
        long j5 = this.A00;
        long[] jArr2 = this.A03;
        C158407jv r10 = new C158407jv(j4, j5 + jArr2[A032]);
        if (j4 >= j || A032 == jArr.length - 1) {
            return new C152137Xr(r10, r10);
        }
        int i = A032 + 1;
        return new C152137Xr(r10, new C158407jv((jArr[i] * SearchActionVerificationClientService.MS_TO_NS) / j3, j5 + jArr2[i]));
    }

    public boolean BIq() {
        return true;
    }

    public long BiF(C153437bJ r9) {
        long j = this.A01;
        if (j < 0) {
            return -1;
        }
        long j2 = -(j + 2);
        this.A01 = -1;
        return j2;
    }

    public void Bpw(long j) {
        this.A01 = this.A02[Util.A03(this.A02, j, true)];
    }
}
