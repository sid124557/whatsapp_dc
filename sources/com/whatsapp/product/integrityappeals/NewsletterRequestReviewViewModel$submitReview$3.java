package com.whatsapp.product.integrityappeals;

import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass218;
import X.AnonymousClass21L;
import X.AnonymousClass4GQ;
import X.AnonymousClass4GR;
import X.AnonymousClass8SF;
import X.C136946nW;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.integrityappeals.NewsletterRequestReviewViewModel$submitReview$3", f = "NewsletterRequestReviewViewModel.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterRequestReviewViewModel$submitReview$3 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4GQ $networkCall;
    public int label;
    public final /* synthetic */ NewsletterRequestReviewViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterRequestReviewViewModel$submitReview$3(NewsletterRequestReviewViewModel newsletterRequestReviewViewModel, C84814Du r3, AnonymousClass4GQ r4) {
        super(r3, 2);
        this.$networkCall = r4;
        this.this$0 = newsletterRequestReviewViewModel;
    }

    public final Object A09(Object obj) {
        AnonymousClass21L r0;
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            try {
                AnonymousClass4GQ r02 = this.$networkCall;
                this.label = 1;
                if (r02.invoke(this) == r2) {
                    return r2;
                }
            } catch (AnonymousClass8SF e) {
                boolean z = e instanceof C136946nW;
                AnonymousClass08M r1 = this.this$0.A00;
                if (z) {
                    r0 = AnonymousClass21L.NO_CONNECTION;
                } else {
                    r0 = AnonymousClass21L.ERROR;
                }
                r1.A0G(r0);
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        this.this$0.A00.A0G(AnonymousClass21L.SUCCESS);
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new NewsletterRequestReviewViewModel$submitReview$3(this.this$0, r5, this.$networkCall);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
