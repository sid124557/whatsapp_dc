package X;

import android.net.Uri;
import com.google.android.exoplayer2.Timeline;
import java.util.concurrent.ExecutorService;

/* renamed from: X.6PK  reason: invalid class name */
public final class AnonymousClass6PK extends C1690587u implements C180728lX {
    public long A00 = -9223372036854775807L;
    public C178288hI A01;
    public boolean A02;
    public boolean A03 = true;
    public boolean A04;
    public final AnonymousClass7WW A05;
    public final C151877Wq A06;
    public final C186718vp A07;
    public final C180658lQ A08;
    public final C180778lc A09;
    public final C180788ld A0A;

    public C187628xY B0w(AnonymousClass6PS r12, C183888qp r13, long j) {
        C187668xc B0Y = this.A09.B0Y();
        C178288hI r0 = this.A01;
        if (r0 != null) {
            B0Y.Awr(r0);
        }
        Uri uri = this.A05.A00;
        C180658lQ r5 = this.A08;
        C186718vp r4 = this.A07;
        return new C1689787m(uri, new C156317gQ(r12, this.A02.A02, 0), r4, r5, new C159017kx(r12, this.A03.A02, 0), this, r13, B0Y, this.A0A);
    }

    public void A00() {
    }

    public void A02(C178288hI r1) {
        this.A01 = r1;
        A03();
    }

    public final void A03() {
        Timeline r1 = new AnonymousClass6OP(this.A06, this.A00, this.A04, this.A02);
        if (this.A03) {
            r1 = new AnonymousClass6PQ(r1, this);
        }
        A01(r1);
    }

    public C151877Wq B9V() {
        return this.A06;
    }

    public void BL3() {
    }

    public void Biv(C187628xY r6) {
        C1689787m r62 = (C1689787m) r6;
        if (r62.A0G) {
            for (C1687886t r1 : r62.A0L) {
                r1.A02();
                if (r1.A0C != null) {
                    r1.A0C = null;
                    r1.A08 = null;
                }
            }
        }
        C157447iJ r2 = r62.A0X;
        AnonymousClass6E1 r12 = r2.A00;
        if (r12 != null) {
            r12.A00(true);
        }
        ExecutorService executorService = r2.A02;
        executorService.execute(new C172668Mf(r62, 24));
        executorService.shutdown();
        r62.A0O.removeCallbacksAndMessages((Object) null);
        r62.A09 = null;
        r62.A0H = true;
    }

    public AnonymousClass6PK(C151877Wq r3, C186718vp r4, C180658lQ r5, C180778lc r6, C180788ld r7) {
        AnonymousClass7WW r0 = r3.A02;
        r0.getClass();
        this.A05 = r0;
        this.A06 = r3;
        this.A09 = r6;
        this.A08 = r5;
        this.A07 = r4;
        this.A0A = r7;
    }

    public void Bbo(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.A00;
        }
        if (this.A03 || this.A00 != j || this.A04 != z || this.A02 != z2) {
            this.A00 = j;
            this.A04 = z;
            this.A02 = z2;
            this.A03 = false;
            A03();
        }
    }
}
