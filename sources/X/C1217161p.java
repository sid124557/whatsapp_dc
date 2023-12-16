package X;

import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.newsletter.NewsletterInfoMembersListViewModel;

/* renamed from: X.61p  reason: invalid class name and case insensitive filesystem */
public final class C1217161p extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1217161p(NewsletterInfoActivity newsletterInfoActivity) {
        super(1);
        this.this$0 = newsletterInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C104595Rp r9 = (C104595Rp) obj;
        NewsletterInfoActivity newsletterInfoActivity = this.this$0;
        C162457s7.A0H(r9);
        C104595Rp r0 = newsletterInfoActivity.A0e;
        if (r0 == null) {
            throw C18270x1.A0S("currentState");
        }
        AnonymousClass1RL r5 = r0.A00;
        AnonymousClass1RL r4 = r9.A00;
        newsletterInfoActivity.A0e = r9;
        if (!(C162457s7.A0P(r5.A0H, r4.A0H) && r5.A05 == r4.A05 && r5.A0C == r4.A0C)) {
            C105065Tl r1 = newsletterInfoActivity.A0K;
            if (r1 != null) {
                AnonymousClass3ZH r02 = newsletterInfoActivity.A0S;
                if (r02 == null) {
                    throw C18270x1.A0S("contact");
                }
                r1.A02(r02);
            }
            if (newsletterInfoActivity.A7d()) {
                NewsletterInfoMembersListViewModel newsletterInfoMembersListViewModel = newsletterInfoActivity.A0b;
                if (newsletterInfoMembersListViewModel != null) {
                    newsletterInfoMembersListViewModel.A0E(C371521d.SHORT, false);
                }
                newsletterInfoActivity.A7U();
            }
        }
        if (!(r4.A0L == r5.A0L && r4.A07 == r5.A07)) {
            if (r5.A07 != r4.A07) {
                newsletterInfoActivity.A7Q();
            }
            if (r5.A0L != r4.A0L) {
                newsletterInfoActivity.A7c(false, false);
            }
        }
        return C59022wD.A00;
    }
}
