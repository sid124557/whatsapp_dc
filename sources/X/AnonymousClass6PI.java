package X;

import android.net.Uri;
import com.google.android.exoplayer2.Timeline;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6PI  reason: invalid class name */
public final class AnonymousClass6PI extends C1690587u {
    public C178288hI A00;
    public final C166527yp A01;
    public final C151877Wq A02;
    public final Timeline A03;
    public final C180778lc A04;
    public final C157677ih A05;
    public final C180788ld A06;

    public void A00() {
    }

    public void A02(C178288hI r2) {
        this.A00 = r2;
        A01(this.A03);
    }

    public C187628xY B0w(AnonymousClass6PS r9, C183888qp r10, long j) {
        C157677ih r5 = this.A05;
        C180778lc r4 = this.A04;
        C178288hI r7 = this.A00;
        return new C1690287r(this.A01, new C159017kx(r9, this.A03.A02, 0), r4, r5, this.A06, r7);
    }

    public C151877Wq B9V() {
        return this.A02;
    }

    public void BL3() {
    }

    public void Biv(C187628xY r4) {
        C157447iJ r2 = ((C1690287r) r4).A09;
        AnonymousClass6E1 r1 = r2.A00;
        if (r1 != null) {
            r1.A00(true);
        }
        r2.A02.shutdown();
    }

    public AnonymousClass6PI(AnonymousClass7WX r10, C180778lc r11, C180788ld r12, String str) {
        List emptyList;
        this.A04 = r11;
        this.A06 = r12;
        AnonymousClass7UC r4 = new AnonymousClass7UC();
        r4.A00 = Uri.EMPTY;
        Uri uri = r10.A01;
        r4.A02 = uri.toString();
        List singletonList = Collections.singletonList(r10);
        if (singletonList == null || singletonList.isEmpty()) {
            emptyList = Collections.emptyList();
        } else {
            emptyList = Collections.unmodifiableList(AnonymousClass002.A0J(singletonList));
        }
        r4.A05 = emptyList;
        r4.A01 = null;
        C151877Wq A002 = r4.A00();
        this.A02 = A002;
        C157057he A003 = C157057he.A00();
        A003.A0O = str;
        A003.A0R = r10.A03;
        A003.A0Q = r10.A02;
        A003.A0E = r10.A00;
        A003.A0B = 0;
        A003.A0P = null;
        this.A01 = C166527yp.A00(A003);
        AnonymousClass7TN r0 = new AnonymousClass7TN();
        r0.A02 = uri;
        r0.A00 = 1;
        this.A05 = r0.A00();
        this.A03 = new AnonymousClass6OP(A002, -9223372036854775807L, true, false);
    }
}
