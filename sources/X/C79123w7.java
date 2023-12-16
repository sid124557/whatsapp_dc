package X;

import com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsActivity;
import com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel;

/* renamed from: X.3w7  reason: invalid class name and case insensitive filesystem */
public final class C79123w7 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ NewsletterAlertsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79123w7(NewsletterAlertsActivity newsletterAlertsActivity) {
        super(0);
        this.this$0 = newsletterAlertsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        NewsletterAlertsActivity newsletterAlertsActivity = this.this$0;
        AnonymousClass48N r3 = newsletterAlertsActivity.A05;
        if (r3 != null) {
            C95804uY A00 = C106415Yx.A00(AnonymousClass0x7.A0l(newsletterAlertsActivity));
            AnonymousClass0OA r2 = new AnonymousClass0OA();
            r2.A01(new C824543q(A00, r3), AnonymousClass0x9.A1E(NewsletterAlertsViewModel.class));
            return r2.A00();
        }
        throw C18270x1.A0S("newsletterAlertsViewModelFactory");
    }
}
