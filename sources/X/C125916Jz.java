package X;

import android.net.Uri;
import com.facebook.android.exoplayer2.Timeline;

/* renamed from: X.6Jz  reason: invalid class name and case insensitive filesystem */
public final class C125916Jz extends AnonymousClass81W {
    public final long A00;
    public final C166637z1 A01;
    public final Timeline A02;
    public final C180218kg A03;
    public final C161387pX A04;

    public void A00() {
    }

    public void A01(C153737br r3, boolean z) {
        A02(this.A02, (Object) null);
    }

    public C187418xB B0v(AnonymousClass7Z2 r9, AnonymousClass7ZV r10, long j) {
        C161387pX r5 = this.A04;
        C180218kg r4 = this.A03;
        return new AnonymousClass81U(this.A01, new C160767oH(r9, this.A03.A02, 0), r4, r5, this.A00);
    }

    public void BL3() {
    }

    public void Biu(C187418xB r4) {
        AnonymousClass81U r42 = (AnonymousClass81U) r4;
        C157457iK r2 = r42.A0B;
        AnonymousClass6E2 r1 = r2.A00;
        if (r1 != null) {
            r1.A00(true);
        }
        r2.A02.shutdown();
        r42.A07.A03();
    }

    public C125916Jz(Uri uri, C166637z1 r4, C180218kg r5, long j) {
        this.A03 = r5;
        this.A01 = r4;
        this.A00 = j;
        this.A04 = new C161387pX(uri);
        this.A02 = new C125706Jb(j, true);
    }
}
