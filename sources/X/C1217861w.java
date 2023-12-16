package X;

import com.whatsapp.newsletter.NewsletterInfoActivity;

/* renamed from: X.61w  reason: invalid class name and case insensitive filesystem */
public final class C1217861w extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1217861w(NewsletterInfoActivity newsletterInfoActivity) {
        super(1);
        this.this$0 = newsletterInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C104605Rq r7 = (C104605Rq) obj;
        NewsletterInfoActivity newsletterInfoActivity = this.this$0;
        C162457s7.A0H(r7);
        newsletterInfoActivity.BjL();
        int ordinal = r7.A01.ordinal();
        if (ordinal == 3) {
            newsletterInfoActivity.A7a(false);
            C91534kK r0 = newsletterInfoActivity.A0c;
            if (r0 == null) {
                throw C18270x1.A0S("newsletterInfoViewModel");
            }
            r0.A0I(true);
        } else if (ordinal == 2) {
            newsletterInfoActivity.A7a(true);
            C91534kK r02 = newsletterInfoActivity.A0c;
            if (r02 == null) {
                throw C18270x1.A0S("newsletterInfoViewModel");
            }
            r02.A0I(false);
        }
        return C59022wD.A00;
    }
}
