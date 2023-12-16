package com.whatsapp.product.newsletterenforcements.geosuspend;

import X.AnonymousClass001;
import X.AnonymousClass3ZH;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C95804uY;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoViewModel$fetchContact$2", f = "NewsletterGeosuspensionInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterGeosuspensionInfoViewModel$fetchContact$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C95804uY $newsletterJid;
    public int label;
    public final /* synthetic */ NewsletterGeosuspensionInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterGeosuspensionInfoViewModel$fetchContact$2(C95804uY r2, NewsletterGeosuspensionInfoViewModel newsletterGeosuspensionInfoViewModel, C84814Du r4) {
        super(r4, 2);
        this.this$0 = newsletterGeosuspensionInfoViewModel;
        this.$newsletterJid = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            AnonymousClass3ZH A07 = this.this$0.A02.A07(this.$newsletterJid);
            if (A07 == null) {
                return null;
            }
            this.this$0.A00.A0G(A07);
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new NewsletterGeosuspensionInfoViewModel$fetchContact$2(this.$newsletterJid, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
