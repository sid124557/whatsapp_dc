package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeActivity;

/* renamed from: X.42z  reason: invalid class name and case insensitive filesystem */
public final class C822842z extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ NewsletterAppealsOutcomeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C822842z(NewsletterAppealsOutcomeActivity newsletterAppealsOutcomeActivity) {
        super(1);
        this.this$0 = newsletterAppealsOutcomeActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C624134x r6 = (C624134x) obj;
        NewsletterAppealsOutcomeActivity newsletterAppealsOutcomeActivity = this.this$0;
        AnonymousClass5R7 r0 = newsletterAppealsOutcomeActivity.A04;
        if (r0 != null) {
            AnonymousClass3F6 r3 = new AnonymousClass3F6(newsletterAppealsOutcomeActivity, r0);
            C103175Lv r2 = newsletterAppealsOutcomeActivity.A00;
            if (r2 != null) {
                C93314oJ A03 = r2.A00(newsletterAppealsOutcomeActivity.getSupportFragmentManager(), C95894up.A00(newsletterAppealsOutcomeActivity.A04)).A03(this.this$0, r3, r6);
                A03.setRecipientNameVisibility(false);
                ((ViewGroup) this.this$0.A00.findViewById(R.id.newsletter_appeal_outcome_additional_section)).addView(A03);
                return C59022wD.A00;
            }
            throw C18270x1.A0S("conversationRowInflaterFactory");
        }
        throw C18270x1.A0S("conversationRowCustomizers");
    }
}
