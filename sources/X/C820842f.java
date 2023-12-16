package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.newsletter.NewsletterInfoActivity;

/* renamed from: X.42f  reason: invalid class name and case insensitive filesystem */
public final class C820842f extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C820842f(NewsletterInfoActivity newsletterInfoActivity) {
        super(1);
        this.this$0 = newsletterInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        NewsletterInfoActivity newsletterInfoActivity = this.this$0;
        View A0E = C18280x3.A0E(newsletterInfoActivity.A00, R.id.channel_alerts_card);
        A0E.setVisibility(AnonymousClass001.A08(newsletterInfoActivity.A7G().A0K() ? 1 : 0));
        C18300x5.A19(A0E, newsletterInfoActivity, 15);
        return C59022wD.A00;
    }
}
