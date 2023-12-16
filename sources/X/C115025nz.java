package X;

import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.newsletter.NewsletterLinkLauncher;
import java.lang.ref.WeakReference;

/* renamed from: X.5nz  reason: invalid class name and case insensitive filesystem */
public final class C115025nz implements C182798p0 {
    public final AnonymousClass59N A00;
    public final NewsletterLinkLauncher A01;
    public final C49122g1 A02;
    public final WeakReference A03;

    public C115025nz(C89654ea r2, AnonymousClass59N r3, NewsletterLinkLauncher newsletterLinkLauncher, C49122g1 r5) {
        C162457s7.A0J(r3, 3);
        this.A01 = newsletterLinkLauncher;
        this.A00 = r3;
        this.A02 = r5;
        this.A03 = AnonymousClass0x9.A14(r2);
    }

    public void BdR(C95814uZ r16, int i, long j) {
        String str;
        C95814uZ r10 = r16;
        C162457s7.A0J(r10, 0);
        C89654ea A0F = C18320x8.A0F(this.A03);
        if (A0F != null) {
            NewsletterLinkLauncher newsletterLinkLauncher = this.A01;
            newsletterLinkLauncher.A04(A0F);
            AnonymousClass59N r0 = this.A00;
            A0F.BjL();
            int A002 = r0.A00();
            AnonymousClass66R r9 = newsletterLinkLauncher.A0F;
            r9.getValue();
            Intent putExtra = C627736r.A08(A0F, A002).putExtra("jid", r10.getRawString()).putExtra("start_t", SystemClock.uptimeMillis());
            C162457s7.A0D(putExtra);
            int i2 = i;
            putExtra.putExtra("extra_forwarded_message_thread_type", i2);
            long j2 = j;
            if (!(j == -1 || j == 0 || !newsletterLinkLauncher.A04.A0X(4682))) {
                C624134x A003 = newsletterLinkLauncher.A08.A00((C95804uY) r10, j2);
                if (A003 != null) {
                    r9.getValue();
                    AnonymousClass2z0 r92 = A003.A1J;
                    putExtra = C627736r.A08(A0F, A002).putExtra("jid", C627336j.A07(r92.A00)).putExtra("start_t", SystemClock.uptimeMillis()).putExtra("row_id", A003.A1L).putExtra("sort_id", A003.A1M);
                    C107395bF.A00(putExtra, r92);
                    C162457s7.A0D(putExtra);
                    putExtra.putExtra("extra_forwarded_message_thread_type", i2);
                    if (C627636p.A0l(A003)) {
                        str = "show_revoked_newsletter_message_dialog";
                    }
                } else {
                    str = "show_expired_newsletter_message_dialog";
                }
                putExtra.putExtra(str, true);
            }
            newsletterLinkLauncher.A01.A0C(A0F, putExtra, "NewsletterLinkLauncher:openNewsletterScreen");
        }
    }
}
