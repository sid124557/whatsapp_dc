package com.whatsapp.newsletter;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C103605Nq;
import X.C115055o2;
import X.C162457s7;
import X.C28491gy;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C91534kK;
import X.C95804uY;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.NewsletterInfoViewModel$fetchPendingAdmins$1", f = "NewsletterInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterInfoViewModel$fetchPendingAdmins$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C95804uY $jid;
    public int label;
    public final /* synthetic */ C91534kK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterInfoViewModel$fetchPendingAdmins$1(C95804uY r2, C91534kK r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r3;
        this.$jid = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            C91534kK r0 = this.this$0;
            C103605Nq r1 = r0.A0B;
            C95804uY r3 = this.$jid;
            C115055o2 r4 = new C115055o2(r0);
            C162457s7.A0J(r3, 0);
            if (r1.A00()) {
                r1.A01.A02(new C28491gy(r3, r4, false, false, true));
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new NewsletterInfoViewModel$fetchPendingAdmins$1(this.$jid, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
