package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.newsletter.NewsletterLinkLauncher;
import java.lang.ref.WeakReference;

/* renamed from: X.63X  reason: invalid class name */
public final class AnonymousClass63X extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ WeakReference $activityWeakReference;
    public final /* synthetic */ String $code;
    public final /* synthetic */ int $messageType;
    public final /* synthetic */ C95804uY $newsletterJid;
    public final /* synthetic */ AnonymousClass59N $newsletterLinkType;
    public final /* synthetic */ long $serverMessageId;
    public final /* synthetic */ NewsletterLinkLauncher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass63X(C95804uY r2, AnonymousClass59N r3, NewsletterLinkLauncher newsletterLinkLauncher, String str, WeakReference weakReference, int i, long j) {
        super(1);
        this.$activityWeakReference = weakReference;
        this.this$0 = newsletterLinkLauncher;
        this.$code = str;
        this.$newsletterJid = r2;
        this.$serverMessageId = j;
        this.$newsletterLinkType = r3;
        this.$messageType = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context A0U = C86664Kz.A0U(this.$activityWeakReference);
        if (A0U != null) {
            NewsletterLinkLauncher newsletterLinkLauncher = this.this$0;
            String str = this.$code;
            C95804uY r6 = this.$newsletterJid;
            long j = this.$serverMessageId;
            AnonymousClass59N r5 = this.$newsletterLinkType;
            int i = this.$messageType;
            C89654ea r4 = (C89654ea) C111095hX.A01(A0U);
            if (!newsletterLinkLauncher.A03.A0F()) {
                r4.Bot(R.string.f11nameremoved);
            } else {
                r4.A06.A00(newsletterLinkLauncher);
                AnonymousClass2LU r2 = new AnonymousClass2LU(r4);
                r4.A6Q(new AnonymousClass37C(r4, r2, newsletterLinkLauncher), 0, R.string.f11nameremoved);
                boolean A1Y = AnonymousClass000.A1Y(r5, AnonymousClass59N.ADMIN_INVITE);
                C115025nz r12 = new C115025nz(r4, r5, newsletterLinkLauncher, newsletterLinkLauncher.A07);
                AnonymousClass495 r0 = newsletterLinkLauncher.A00;
                if (r0 != null) {
                    r0.cancel();
                }
                C70353aM.A00(newsletterLinkLauncher.A0E, newsletterLinkLauncher, r2, new C120965zS(r6, new C114985nv(r12, newsletterLinkLauncher, i, j), newsletterLinkLauncher, str, A1Y), 18);
            }
        }
        return C59022wD.A00;
    }
}
