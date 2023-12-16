package X;

import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoActivity;

/* renamed from: X.43t  reason: invalid class name and case insensitive filesystem */
public final class C824843t extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ WaImageView $channelIconView;
    public final /* synthetic */ NewsletterSuspensionInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C824843t(WaImageView waImageView, NewsletterSuspensionInfoActivity newsletterSuspensionInfoActivity) {
        super(1);
        this.this$0 = newsletterSuspensionInfoActivity;
        this.$channelIconView = waImageView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass3ZH r5 = (AnonymousClass3ZH) obj;
        int dimensionPixelSize = this.this$0.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        NewsletterSuspensionInfoActivity newsletterSuspensionInfoActivity = this.this$0;
        C114015mM r1 = newsletterSuspensionInfoActivity.A01;
        if (r1 != null) {
            r1.A06(newsletterSuspensionInfoActivity, "newsletter-suspension-info-activity").A09(this.$channelIconView, r5, dimensionPixelSize, true);
            return C59022wD.A00;
        }
        throw C18270x1.A0S("contactPhotos");
    }
}
