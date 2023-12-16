package X;

import com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel;
import com.whatsapp.product.newsletterenforcements.userreports.list.NewsletterUserReportsListFragment;

/* renamed from: X.437  reason: invalid class name */
public final class AnonymousClass437 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ NewsletterUserReportsListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass437(NewsletterUserReportsListFragment newsletterUserReportsListFragment) {
        super(1);
        this.this$0 = newsletterUserReportsListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        C162457s7.A0J(str, 0);
        NewsletterUserReportsViewModel newsletterUserReportsViewModel = this.this$0.A01;
        if (newsletterUserReportsViewModel == null) {
            throw C18270x1.A0S("viewModel");
        }
        C18260x0.A0s("onReportDetailItemClicked reportId:", str, AnonymousClass001.A0o());
        newsletterUserReportsViewModel.A04.A0G(new AnonymousClass3SB(str));
        return C59022wD.A00;
    }
}
