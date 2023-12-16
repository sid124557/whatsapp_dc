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

@DebugMetadata(c = "com.whatsapp.product.integrityappeals.NewsletterRequestReviewViewModel$submitViolatingMessageReview$2", f = "NewsletterRequestReviewViewModel.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterRequestReviewViewModel$submitViolatingMessageReview$2 extends C75003pT implements AnonymousClass4GQ {
    public final /* synthetic */ C95804uY $newsletterJid;
    public final /* synthetic */ String $reason;
    public final /* synthetic */ String $serverMsdId;
    public int label;
    public final /* synthetic */ NewsletterRequestReviewViewModel this$0;

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        NewsletterRequestReviewViewModel newsletterRequestReviewViewModel = this.this$0;
        return C59022wD.A01(new NewsletterRequestReviewViewModel$submitViolatingMessageReview$2(this.$newsletterJid, newsletterRequestReviewViewModel, this.$serverMsdId, this.$reason, (C84814Du) obj));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterRequestReviewViewModel$submitViolatingMessageReview$2(C95804uY r2, NewsletterRequestReviewViewModel newsletterRequestReviewViewModel, String str, String str2, C84814Du r6) {
        super(r6, 1);
        this.this$0 = newsletterRequestReviewViewModel;
        this.$newsletterJid = r2;
        this.$serverMsdId = str;
        this.$reason = str2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            NewsletterAppealsClient newsletterAppealsClient = this.this$0.A01;
            C95804uY r2 = this.$newsletterJid;
            String str = this.$serverMsdId;
            String str2 = this.$reason;
            this.label = 1;
            if (newsletterAppealsClient.A04(r2, str, str2, this) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }
}
