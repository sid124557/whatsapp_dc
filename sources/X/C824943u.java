package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.product.newsletterenforcements.userreports.detail.NewsletterUserReportDetailFragment;

/* renamed from: X.43u  reason: invalid class name and case insensitive filesystem */
public final class C824943u extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ View $view;
    public final /* synthetic */ NewsletterUserReportDetailFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C824943u(View view, NewsletterUserReportDetailFragment newsletterUserReportDetailFragment) {
        super(1);
        this.this$0 = newsletterUserReportDetailFragment;
        this.$view = view;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C153197aq r3 = (C153197aq) obj;
        View view = this.$view;
        C162457s7.A0H(r3);
        C18280x3.A0F(view, R.id.newsletter_name).setText(r3.A04("channel_name"));
        return C59022wD.A00;
    }
}
