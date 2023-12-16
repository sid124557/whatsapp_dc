package com.whatsapp.product.integrityappeals;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GQ;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C95804uY;
import com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.integrityappeals.NewsletterRequestReviewViewModel$submitSuspensionReview$2", f = "NewsletterRequestReviewViewModel.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterRequestReviewViewModel$submitSuspensionReview$2 extends C75003pT implements AnonymousClass4GQ {
    public final /* synthetic */ C95804uY $newsletterJid;
    public final /* synthetic */ String $reason;
    public int label;
    public final /* synthetic */ NewsletterRequestReviewViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterRequestReviewViewModel$submitSuspensionReview$2(C95804uY r2, NewsletterRequestReviewViewModel newsletterRequestReviewViewModel, String str, C84814Du r5) {
        super(r5, 1);
        this.this$0 = newsletterRequestReviewViewModel;
        this.$newsletterJid = r2;
        this.$reason = str;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            NewsletterAppealsClient newsletterAppealsClient = this.this$0.A01;
            C95804uY r1 = this.$newsletterJid;
            String str = this.$reason;
            this.label = 1;
            if (newsletterAppealsClient.A05(r1, str, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        NewsletterRequestReviewViewModel newsletterRequestReviewViewModel = this.this$0;
        return C59022wD.A01(new NewsletterRequestReviewViewModel$submitSuspensionReview$2(this.$newsletterJid, newsletterRequestReviewViewModel, this.$reason, (C84814Du) obj));
    }
}
