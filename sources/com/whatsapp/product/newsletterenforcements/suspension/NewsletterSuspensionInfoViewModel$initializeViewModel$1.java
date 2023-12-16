package com.whatsapp.product.newsletterenforcements.suspension;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C95804uY;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel$initializeViewModel$1", f = "NewsletterSuspensionInfoViewModel.kt", i = {}, l = {53, 54, 58}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterSuspensionInfoViewModel$initializeViewModel$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C95804uY $newsletterJid;
    public int label;
    public final /* synthetic */ NewsletterSuspensionInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterSuspensionInfoViewModel$initializeViewModel$1(C95804uY r2, NewsletterSuspensionInfoViewModel newsletterSuspensionInfoViewModel, C84814Du r4) {
        super(r4, 2);
        this.this$0 = newsletterSuspensionInfoViewModel;
        this.$newsletterJid = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (X.C616131n.A00(r8, r6.A08, new com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel$fetchContact$2(r5, r6, (X.C84814Du) null)) == r3) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r9) {
        /*
            r8 = this;
            X.218 r3 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r1 = r8.label
            r4 = 3
            r7 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0015
            if (r1 == r0) goto L_0x002d
            if (r1 == r7) goto L_0x0049
            if (r1 != r4) goto L_0x006c
            X.C57682u2.A01(r9)
        L_0x0012:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0015:
            X.C57682u2.A01(r9)
            com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel r6 = r8.this$0
            X.4uY r5 = r8.$newsletterJid
            r8.label = r0
            X.3gB r2 = r6.A08
            r1 = 0
            com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel$fetchContact$2 r0 = new com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel$fetchContact$2
            r0.<init>(r5, r6, r1)
            java.lang.Object r0 = X.C616131n.A00(r8, r2, r0)
            if (r0 != r3) goto L_0x0030
        L_0x002c:
            return r3
        L_0x002d:
            X.C57682u2.A01(r9)
        L_0x0030:
            com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel r6 = r8.this$0
            X.4uY r5 = r8.$newsletterJid
            r8.label = r7
            X.3gB r2 = r6.A08
            r1 = 0
            com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel$fetchNewsletterInfo$2 r0 = new com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel$fetchNewsletterInfo$2
            r0.<init>(r5, r6, r1)
            java.lang.Object r0 = X.C616131n.A00(r8, r2, r0)
            if (r0 == r3) goto L_0x002c
            X.2wD r0 = X.C59022wD.A00
            if (r0 != r3) goto L_0x004c
            return r3
        L_0x0049:
            X.C57682u2.A01(r9)
        L_0x004c:
            com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel r0 = r8.this$0
            X.66R r0 = r0.A07
            boolean r0 = X.C18270x1.A1V(r0)
            if (r0 == 0) goto L_0x0012
            com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel r0 = r8.this$0
            X.08M r1 = r0.A02
            X.1kj r0 = X.C29631kj.A00
            r1.A0G(r0)
            com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel r1 = r8.this$0
            X.4uY r0 = r8.$newsletterJid
            r8.label = r4
            java.lang.Object r0 = r1.A0D(r0, r8)
            if (r0 != r3) goto L_0x0012
            return r3
        L_0x006c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel$initializeViewModel$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new NewsletterSuspensionInfoViewModel$initializeViewModel$1(this.$newsletterJid, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
