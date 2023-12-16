package X;

import android.os.Parcelable;
import com.whatsapp.product.newsletterenforcements.newsletterguidelines.NewsletterGuidelinesFragment;

/* renamed from: X.3wQ  reason: invalid class name and case insensitive filesystem */
public final class C79313wQ extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ NewsletterGuidelinesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79313wQ(NewsletterGuidelinesFragment newsletterGuidelinesFragment) {
        super(0);
        this.this$0 = newsletterGuidelinesFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Parcelable parcelable = this.this$0.A0H().getParcelable("newsletter-enforcement");
        if (parcelable != null) {
            return parcelable;
        }
        throw C18300x5.A0X();
    }
}
