package com.whatsapp.product.newsletterenforcements.appealsoutcome;

import X.AnonymousClass001;
import X.AnonymousClass10L;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeViewModel$fetchNewsletterContact$1", f = "NewsletterAppealsOutcomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterAppealsOutcomeViewModel$fetchNewsletterContact$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ AnonymousClass10L this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAppealsOutcomeViewModel$fetchNewsletterContact$1(AnonymousClass10L r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            AnonymousClass10L r0 = this.this$0;
            r0.A00.A0G(r0.A02.A07(r0.A03));
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new NewsletterAppealsOutcomeViewModel$fetchNewsletterContact$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new NewsletterAppealsOutcomeViewModel$fetchNewsletterContact$1(this.this$0, (C84814Du) obj2));
    }
}
