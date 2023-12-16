package com.whatsapp.product.newsletterenforcements.enforcedmessages;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C95804uY;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesViewModel$initializeViewModel$1", f = "EnforcedMessagesViewModel.kt", i = {}, l = {51, 54}, m = "invokeSuspend", n = {}, s = {})
public final class EnforcedMessagesViewModel$initializeViewModel$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C95804uY $newsletterJid;
    public int label;
    public final /* synthetic */ EnforcedMessagesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnforcedMessagesViewModel$initializeViewModel$1(C95804uY r2, EnforcedMessagesViewModel enforcedMessagesViewModel, C84814Du r4) {
        super(r4, 2);
        this.this$0 = enforcedMessagesViewModel;
        this.$newsletterJid = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r8) {
        /*
            r7 = this;
            X.218 r6 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r1 = r7.label
            r5 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0012
            if (r1 == r0) goto L_0x002a
            if (r1 != r5) goto L_0x0044
            X.C57682u2.A01(r8)
        L_0x000f:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0012:
            X.C57682u2.A01(r8)
            com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesViewModel r4 = r7.this$0
            X.4uY r3 = r7.$newsletterJid
            r7.label = r0
            X.3gB r2 = r4.A06
            r1 = 0
            com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesViewModel$fetchContact$2 r0 = new com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesViewModel$fetchContact$2
            r0.<init>(r3, r4, r1)
            java.lang.Object r0 = X.C616131n.A00(r7, r2, r0)
            if (r0 != r6) goto L_0x002d
            return r6
        L_0x002a:
            X.C57682u2.A01(r8)
        L_0x002d:
            com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesViewModel r0 = r7.this$0
            X.66R r0 = r0.A05
            boolean r0 = X.C18270x1.A1V(r0)
            if (r0 == 0) goto L_0x000f
            com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesViewModel r1 = r7.this$0
            X.4uY r0 = r7.$newsletterJid
            r7.label = r5
            java.lang.Object r0 = r1.A0D(r0, r7)
            if (r0 != r6) goto L_0x000f
            return r6
        L_0x0044:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesViewModel$initializeViewModel$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new EnforcedMessagesViewModel$initializeViewModel$1(this.$newsletterJid, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
