package com.whatsapp.product.newsletterenforcements;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C95804uY;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.NewsletterAlertsLauncherBridgeImpl$checkAndLaunchActivity$1", f = "NewsletterAlertsLauncherBridgeImpl.kt", i = {1}, l = {35, 36}, m = "invokeSuspend", n = {"activityIntent"}, s = {"L$0"})
public final class NewsletterAlertsLauncherBridgeImpl$checkAndLaunchActivity$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C95804uY $newsletterJid;
    public Object L$0;
    public int label;
    public final /* synthetic */ NewsletterAlertsLauncherBridgeImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAlertsLauncherBridgeImpl$checkAndLaunchActivity$1(Context context, C95804uY r3, NewsletterAlertsLauncherBridgeImpl newsletterAlertsLauncherBridgeImpl, C84814Du r5) {
        super(r5, 2);
        this.this$0 = newsletterAlertsLauncherBridgeImpl;
        this.$context = context;
        this.$newsletterJid = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        if (r8 == r6) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r8) {
        /*
            r7 = this;
            X.218 r6 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r7.label
            r5 = 2
            r3 = 1
            if (r0 == 0) goto L_0x001b
            if (r0 == r3) goto L_0x002d
            if (r0 != r5) goto L_0x004a
            java.lang.Object r1 = r7.L$0
            android.content.Intent r1 = (android.content.Intent) r1
            X.C57682u2.A01(r8)
        L_0x0013:
            android.content.Context r0 = r7.$context
            r0.startActivity(r1)
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x001b:
            X.C57682u2.A01(r8)
            com.whatsapp.product.newsletterenforcements.NewsletterAlertsLauncherBridgeImpl r2 = r7.this$0
            android.content.Context r1 = r7.$context
            X.4uY r0 = r7.$newsletterJid
            r7.label = r3
            java.lang.Object r8 = r2.A00(r1, r0, r7)
            if (r8 != r6) goto L_0x0030
        L_0x002c:
            return r6
        L_0x002d:
            X.C57682u2.A01(r8)
        L_0x0030:
            android.content.Intent r8 = (android.content.Intent) r8
            com.whatsapp.product.newsletterenforcements.NewsletterAlertsLauncherBridgeImpl r4 = r7.this$0
            X.3gB r3 = r4.A05
            X.4uY r2 = r7.$newsletterJid
            r1 = 0
            com.whatsapp.product.newsletterenforcements.NewsletterAlertsLauncherBridgeImpl$checkAndLaunchActivity$1$1 r0 = new com.whatsapp.product.newsletterenforcements.NewsletterAlertsLauncherBridgeImpl$checkAndLaunchActivity$1$1
            r0.<init>(r2, r4, r1)
            r7.L$0 = r8
            r7.label = r5
            java.lang.Object r0 = X.C616131n.A00(r7, r3, r0)
            if (r0 == r6) goto L_0x002c
            r1 = r8
            goto L_0x0013
        L_0x004a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.NewsletterAlertsLauncherBridgeImpl$checkAndLaunchActivity$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new NewsletterAlertsLauncherBridgeImpl$checkAndLaunchActivity$1(this.$context, this.$newsletterJid, this.this$0, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
