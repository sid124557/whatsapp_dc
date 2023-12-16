package X;

import com.whatsapp.R;
import com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsActivity;
import com.whatsapp.product.newsletterenforcements.userreports.detail.NewsletterUserReportDetailFragment;
import com.whatsapp.product.newsletterenforcements.userreports.list.NewsletterUserReportsListFragment;

/* renamed from: X.435  reason: invalid class name */
public final class AnonymousClass435 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ NewsletterUserReportsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass435(NewsletterUserReportsActivity newsletterUserReportsActivity) {
        super(1);
        this.this$0 = newsletterUserReportsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C08240dc A0J;
        AnonymousClass48P r5 = (AnonymousClass48P) obj;
        NewsletterUserReportsActivity newsletterUserReportsActivity = this.this$0;
        C162457s7.A0H(r5);
        if (r5 instanceof AnonymousClass3SB) {
            A0J = AnonymousClass0x2.A0J(newsletterUserReportsActivity);
            A0J.A0A(new NewsletterUserReportDetailFragment(((AnonymousClass3SB) r5).A00), R.id.container);
            A0J.A0I("NewsletterUserReportDetailFragment");
            A0J.A0H = true;
        } else {
            if (r5 instanceof AnonymousClass3SC) {
                A0J = AnonymousClass0x2.A0J(newsletterUserReportsActivity);
                A0J.A0A(new NewsletterUserReportsListFragment(), R.id.container);
            }
            return C59022wD.A00;
        }
        A0J.A01();
        return C59022wD.A00;
    }
}
