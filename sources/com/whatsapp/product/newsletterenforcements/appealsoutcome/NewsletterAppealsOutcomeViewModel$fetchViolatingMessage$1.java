package com.whatsapp.product.newsletterenforcements.appealsoutcome;

import X.AnonymousClass001;
import X.AnonymousClass10L;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C624134x;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeViewModel$fetchViolatingMessage$1", f = "NewsletterAppealsOutcomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterAppealsOutcomeViewModel$fetchViolatingMessage$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ long $serverMsdId;
    public int label;
    public final /* synthetic */ AnonymousClass10L this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAppealsOutcomeViewModel$fetchViolatingMessage$1(AnonymousClass10L r2, C84814Du r3, long j) {
        super(r3, 2);
        this.this$0 = r2;
        this.$serverMsdId = j;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            C624134x A02 = this.this$0.A04.A02(this.$serverMsdId);
            if (A02 != null) {
                this.this$0.A01.A0G(A02);
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new NewsletterAppealsOutcomeViewModel$fetchViolatingMessage$1(this.this$0, r6, this.$serverMsdId);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
