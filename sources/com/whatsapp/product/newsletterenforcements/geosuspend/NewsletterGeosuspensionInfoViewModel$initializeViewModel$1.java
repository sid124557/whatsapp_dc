package com.whatsapp.product.newsletterenforcements.geosuspend;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C95804uY;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoViewModel$initializeViewModel$1", f = "NewsletterGeosuspensionInfoViewModel.kt", i = {}, l = {47, 51}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterGeosuspensionInfoViewModel$initializeViewModel$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $countryCode;
    public final /* synthetic */ C95804uY $newsletterJid;
    public int label;
    public final /* synthetic */ NewsletterGeosuspensionInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterGeosuspensionInfoViewModel$initializeViewModel$1(C95804uY r2, NewsletterGeosuspensionInfoViewModel newsletterGeosuspensionInfoViewModel, String str, C84814Du r5) {
        super(r5, 2);
        this.this$0 = newsletterGeosuspensionInfoViewModel;
        this.$newsletterJid = r2;
        this.$countryCode = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r8) {
        /*
            r7 = this;
            X.218 r3 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r1 = r7.label
            r4 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0012
            if (r1 == r0) goto L_0x002a
            if (r1 != r4) goto L_0x004f
            X.C57682u2.A01(r8)
        L_0x000f:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0012:
            X.C57682u2.A01(r8)
            com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoViewModel r6 = r7.this$0
            X.4uY r5 = r7.$newsletterJid
            r7.label = r0
            X.3gB r2 = r6.A06
            r1 = 0
            com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoViewModel$fetchContact$2 r0 = new com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoViewModel$fetchContact$2
            r0.<init>(r5, r6, r1)
            java.lang.Object r0 = X.C616131n.A00(r7, r2, r0)
            if (r0 != r3) goto L_0x002d
            return r3
        L_0x002a:
            X.C57682u2.A01(r8)
        L_0x002d:
            com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoViewModel r0 = r7.this$0
            X.66R r0 = r0.A05
            boolean r0 = X.C18270x1.A1V(r0)
            if (r0 == 0) goto L_0x000f
            com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoViewModel r0 = r7.this$0
            X.08M r1 = r0.A01
            X.1kd r0 = X.C29601kd.A00
            r1.A0G(r0)
            com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoViewModel r2 = r7.this$0
            X.4uY r1 = r7.$newsletterJid
            java.lang.String r0 = r7.$countryCode
            r7.label = r4
            java.lang.Object r0 = r2.A0D(r1, r0, r7)
            if (r0 != r3) goto L_0x000f
            return r3
        L_0x004f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoViewModel$initializeViewModel$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new NewsletterGeosuspensionInfoViewModel$initializeViewModel$1(this.$newsletterJid, this.this$0, this.$countryCode, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
