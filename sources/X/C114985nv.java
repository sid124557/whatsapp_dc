package X;

import com.whatsapp.R;
import com.whatsapp.newsletter.NewsletterLinkLauncher;

/* renamed from: X.5nv  reason: invalid class name and case insensitive filesystem */
public final class C114985nv implements AnonymousClass4DF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C182798p0 A02;
    public final /* synthetic */ NewsletterLinkLauncher A03;

    public void BX8(C95804uY r16) {
        C95804uY r4 = r16;
        C162457s7.A0J(r4, 0);
        NewsletterLinkLauncher newsletterLinkLauncher = this.A03;
        long j = this.A01;
        int i = this.A00;
        C182798p0 r11 = this.A02;
        if (j == -1 || !newsletterLinkLauncher.A04.A0X(4682)) {
            newsletterLinkLauncher.A0C.A00(r4);
            r11.BdR(r4, i, j);
            return;
        }
        C56212rc r3 = newsletterLinkLauncher.A0C;
        r3.A00(r4);
        C120935zP r9 = new C120935zP(r4, r11, i, j);
        if (C106855aH.A04(r3.A02, r4, r3.A07)) {
            r3.A0D.BkM(new C71513cE(r3, r4, r9, 9, j));
        }
    }

    public void onError(Throwable th) {
        int i;
        String A0X;
        C162457s7.A0J(th, 0);
        C115025nz r2 = (C115025nz) this.A02;
        C89654ea A0F = C18320x8.A0F(r2.A03);
        if (A0F != null) {
            r2.A01.A04(A0F);
            A0F.BjL();
            if (th instanceof C136786nG) {
                i = R.string.f11nameremoved;
            } else if (th instanceof C136776nF) {
                int i2 = ((AnonymousClass8SE) th).code;
                if (i2 != 405) {
                    if (i2 == 451) {
                        C49122g1 r1 = r2.A02;
                        String A012 = r1.A01(r1.A00());
                        if (A012 != null) {
                            A0X = AnonymousClass0x2.A0X(A0F, A012, 1, R.string.f11nameremoved);
                            C162457s7.A0H(A0X);
                            A0F.Bov((String) null, A0X);
                        }
                    } else {
                        AnonymousClass59N r12 = r2.A00;
                        AnonymousClass59N r0 = AnonymousClass59N.FORWARDED_MESSAGE;
                        i = R.string.f11nameremoved;
                        if (r12 == r0) {
                            i = R.string.f11nameremoved;
                        }
                    }
                }
                i = R.string.f11nameremoved;
            } else {
                i = R.string.f11nameremoved;
            }
            A0X = A0F.getString(i);
            C162457s7.A0H(A0X);
            A0F.Bov((String) null, A0X);
        }
    }

    public C114985nv(C182798p0 r1, NewsletterLinkLauncher newsletterLinkLauncher, int i, long j) {
        this.A03 = newsletterLinkLauncher;
        this.A01 = j;
        this.A00 = i;
        this.A02 = r1;
    }
}
