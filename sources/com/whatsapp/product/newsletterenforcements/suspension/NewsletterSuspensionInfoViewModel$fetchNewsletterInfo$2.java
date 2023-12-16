package com.whatsapp.product.newsletterenforcements.suspension;

import X.AnonymousClass001;
import X.AnonymousClass31A;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C56982ss;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C95804uY;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel$fetchNewsletterInfo$2", f = "NewsletterSuspensionInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterSuspensionInfoViewModel$fetchNewsletterInfo$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C95804uY $newsletterJid;
    public int label;
    public final /* synthetic */ NewsletterSuspensionInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterSuspensionInfoViewModel$fetchNewsletterInfo$2(C95804uY r2, NewsletterSuspensionInfoViewModel newsletterSuspensionInfoViewModel, C84814Du r4) {
        super(r4, 2);
        this.this$0 = newsletterSuspensionInfoViewModel;
        this.$newsletterJid = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            AnonymousClass31A A00 = C56982ss.A00(this.this$0.A04, this.$newsletterJid);
            C162457s7.A0K(A00, "null cannot be cast to non-null type com.whatsapp.data.NewsletterInfo");
            this.this$0.A01.A0G(A00);
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new NewsletterSuspensionInfoViewModel$fetchNewsletterInfo$2(this.$newsletterJid, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
