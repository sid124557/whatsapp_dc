package X;

import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeActivity;

/* renamed from: X.430  reason: invalid class name */
public final class AnonymousClass430 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ NewsletterAppealsOutcomeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass430(NewsletterAppealsOutcomeActivity newsletterAppealsOutcomeActivity) {
        super(1);
        this.this$0 = newsletterAppealsOutcomeActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass3ZH r5 = (AnonymousClass3ZH) obj;
        NewsletterAppealsOutcomeActivity newsletterAppealsOutcomeActivity = this.this$0;
        C114015mM r1 = newsletterAppealsOutcomeActivity.A02;
        if (r1 != null) {
            C105365Uq A06 = r1.A06(newsletterAppealsOutcomeActivity, "newsletter-appeals-outcome-activity");
            A06.A09(AnonymousClass0x9.A0F(this.this$0.A00, R.id.channel_icon), r5, this.this$0.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), true);
            ImageView A0F = AnonymousClass0x9.A0F(this.this$0.A00, R.id.profile_picture);
            if (A0F != null) {
                A06.A08(A0F, r5);
            }
            return C59022wD.A00;
        }
        throw C18270x1.A0S("contactPhotos");
    }
}
