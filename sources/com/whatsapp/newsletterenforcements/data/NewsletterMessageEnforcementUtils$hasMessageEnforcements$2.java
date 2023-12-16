package com.whatsapp.newsletterenforcements.data;

import X.AnonymousClass1RL;
import X.AnonymousClass4GR;
import X.C42462Oe;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletterenforcements.data.NewsletterMessageEnforcementUtils$hasMessageEnforcements$2", f = "NewsletterMessageEnforcementUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterMessageEnforcementUtils$hasMessageEnforcements$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass1RL $newsletterChat;
    public int label;
    public final /* synthetic */ C42462Oe this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterMessageEnforcementUtils$hasMessageEnforcements$2(AnonymousClass1RL r2, C42462Oe r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r3;
        this.$newsletterChat = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        if (r3.this$0.A01.A01(r1) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.label
            if (r0 != 0) goto L_0x002e
            X.C57682u2.A01(r4)
            X.2Oe r0 = r3.this$0
            X.1VX r2 = r0.A00
            r1 = 4219(0x107b, float:5.912E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r2 = r2.A0Y(r0, r1)
            X.1RL r1 = r3.$newsletterChat
            boolean r0 = r1.A0K()
            if (r2 == 0) goto L_0x0028
            if (r0 == 0) goto L_0x0028
            X.2Oe r0 = r3.this$0
            X.2go r0 = r0.A01
            boolean r1 = r0.A01(r1)
            r0 = 1
            if (r1 != 0) goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x002e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletterenforcements.data.NewsletterMessageEnforcementUtils$hasMessageEnforcements$2.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new NewsletterMessageEnforcementUtils$hasMessageEnforcements$2(this.$newsletterChat, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
