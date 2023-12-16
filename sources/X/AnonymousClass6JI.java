package X;

import com.whatsapp.WaViewPager;
import com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet;

/* renamed from: X.6JI  reason: invalid class name */
public final class AnonymousClass6JI extends C08790f7 {
    public final /* synthetic */ WaViewPager A00;
    public final /* synthetic */ NewsletterReactionsSheet A01;

    public AnonymousClass6JI(WaViewPager waViewPager, NewsletterReactionsSheet newsletterReactionsSheet) {
        this.A00 = waViewPager;
        this.A01 = newsletterReactionsSheet;
    }

    public void BXf(int i) {
        int A0O = this.A00.A0O(i);
        AnonymousClass4Ut r0 = this.A01.A0B;
        if (r0 == null) {
            throw C86604Kt.A0j();
        }
        r0.A0D(A0O);
    }
}
