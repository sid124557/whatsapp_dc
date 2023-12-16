package com.whatsapp.newsletter;

import X.AnonymousClass10Y;
import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.NewsletterInfoIntegrityViewModel$updateHasChannelAlerts$1", f = "NewsletterInfoIntegrityViewModel.kt", i = {1}, l = {39, 41}, m = "invokeSuspend", n = {"showGeosuspensionAlerts"}, s = {"Z$0"})
public final class NewsletterInfoIntegrityViewModel$updateHasChannelAlerts$1 extends C75003pT implements AnonymousClass4GR {
    public boolean Z$0;
    public int label;
    public final /* synthetic */ AnonymousClass10Y this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterInfoIntegrityViewModel$updateHasChannelAlerts$1(AnonymousClass10Y r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r10) {
        /*
            r9 = this;
            X.218 r6 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r9.label
            r8 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 == r5) goto L_0x004a
            if (r0 != r8) goto L_0x006a
            boolean r7 = r9.Z$0
            X.C57682u2.A01(r10)
        L_0x0011:
            boolean r2 = X.AnonymousClass001.A1Z(r10)
            X.10Y r0 = r9.this$0
            X.1RL r1 = r0.A02
            X.5UP r0 = r0.A04
            boolean r1 = r1.A0M(r0)
            X.10Y r0 = r9.this$0
            X.08M r0 = r0.A01
            if (r2 != 0) goto L_0x002a
            if (r7 != 0) goto L_0x002a
            if (r1 != 0) goto L_0x002a
            r5 = 0
        L_0x002a:
            X.C06270Wx.A05(r0, r5)
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0030:
            X.C57682u2.A01(r10)
            X.10Y r0 = r9.this$0
            X.2Od r4 = r0.A05
            X.4uY r3 = r0.A03
            r9.label = r5
            X.3gB r2 = r4.A02
            r1 = 0
            com.whatsapp.newsletter.integrity.NewsletterGeosuspendedUtils$hasGeosuspensionAlerts$2 r0 = new com.whatsapp.newsletter.integrity.NewsletterGeosuspendedUtils$hasGeosuspensionAlerts$2
            r0.<init>(r3, r4, r1)
            java.lang.Object r10 = X.C616131n.A00(r9, r2, r0)
            if (r10 != r6) goto L_0x004d
            return r6
        L_0x004a:
            X.C57682u2.A01(r10)
        L_0x004d:
            boolean r7 = X.AnonymousClass001.A1Z(r10)
            X.10Y r0 = r9.this$0
            X.2Oe r4 = r0.A07
            X.1RL r3 = r0.A02
            r9.Z$0 = r7
            r9.label = r8
            X.3gB r2 = r4.A02
            r1 = 0
            com.whatsapp.newsletterenforcements.data.NewsletterMessageEnforcementUtils$hasMessageEnforcements$2 r0 = new com.whatsapp.newsletterenforcements.data.NewsletterMessageEnforcementUtils$hasMessageEnforcements$2
            r0.<init>(r3, r4, r1)
            java.lang.Object r10 = X.C616131n.A00(r9, r2, r0)
            if (r10 != r6) goto L_0x0011
            return r6
        L_0x006a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.NewsletterInfoIntegrityViewModel$updateHasChannelAlerts$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new NewsletterInfoIntegrityViewModel$updateHasChannelAlerts$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new NewsletterInfoIntegrityViewModel$updateHasChannelAlerts$1(this.this$0, (C84814Du) obj2));
    }
}
