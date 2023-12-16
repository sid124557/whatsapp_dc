package com.whatsapp.product.integrityappeals;

import X.AnonymousClass001;
import X.AnonymousClass1hI;
import X.AnonymousClass1hJ;
import X.AnonymousClass218;
import X.AnonymousClass21L;
import X.AnonymousClass38S;
import X.AnonymousClass4GR;
import X.C28541hH;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import X.C95804uY;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.integrityappeals.NewsletterRequestReviewViewModel$submitReview$1", f = "NewsletterRequestReviewViewModel.kt", i = {}, l = {39, 43, 46}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterRequestReviewViewModel$submitReview$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass38S $appealRequest;
    public final /* synthetic */ String $reason;
    public int label;
    public final /* synthetic */ NewsletterRequestReviewViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterRequestReviewViewModel$submitReview$1(AnonymousClass38S r2, NewsletterRequestReviewViewModel newsletterRequestReviewViewModel, String str, C84814Du r5) {
        super(r5, 2);
        this.this$0 = newsletterRequestReviewViewModel;
        this.$appealRequest = r2;
        this.$reason = str;
    }

    public final Object A09(Object obj) {
        Object A00;
        AnonymousClass218 r1 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            this.this$0.A00.A0G(AnonymousClass21L.PENDING);
            AnonymousClass38S r2 = this.$appealRequest;
            if (r2 instanceof AnonymousClass1hI) {
                NewsletterRequestReviewViewModel newsletterRequestReviewViewModel = this.this$0;
                C95804uY A002 = r2.A00();
                String str = ((AnonymousClass1hI) r2).A01;
                String str2 = this.$reason;
                this.label = 1;
                A00 = AnonymousClass218.A00(C616131n.A00(this, newsletterRequestReviewViewModel.A02, new NewsletterRequestReviewViewModel$submitReview$3(newsletterRequestReviewViewModel, (C84814Du) null, new NewsletterRequestReviewViewModel$submitGeosuspensionReview$2(A002, newsletterRequestReviewViewModel, str, str2, (C84814Du) null))));
            } else if (r2 instanceof C28541hH) {
                NewsletterRequestReviewViewModel newsletterRequestReviewViewModel2 = this.this$0;
                C95804uY A003 = r2.A00();
                String str3 = this.$reason;
                this.label = 2;
                A00 = AnonymousClass218.A00(C616131n.A00(this, newsletterRequestReviewViewModel2.A02, new NewsletterRequestReviewViewModel$submitReview$3(newsletterRequestReviewViewModel2, (C84814Du) null, new NewsletterRequestReviewViewModel$submitSuspensionReview$2(A003, newsletterRequestReviewViewModel2, str3, (C84814Du) null))));
            } else if (r2 instanceof AnonymousClass1hJ) {
                NewsletterRequestReviewViewModel newsletterRequestReviewViewModel3 = this.this$0;
                C95804uY A004 = r2.A00();
                String str4 = ((AnonymousClass1hJ) r2).A01;
                String str5 = this.$reason;
                this.label = 3;
                A00 = AnonymousClass218.A00(C616131n.A00(this, newsletterRequestReviewViewModel3.A02, new NewsletterRequestReviewViewModel$submitReview$3(newsletterRequestReviewViewModel3, (C84814Du) null, new NewsletterRequestReviewViewModel$submitViolatingMessageReview$2(A004, newsletterRequestReviewViewModel3, str4, str5, (C84814Du) null))));
            }
            if (A00 == r1 || C59022wD.A00 == r1) {
                return r1;
            }
        } else if (i == 1 || i == 2 || i == 3) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new NewsletterRequestReviewViewModel$submitReview$1(this.$appealRequest, this.this$0, this.$reason, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
