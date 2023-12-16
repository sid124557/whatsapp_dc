package com.whatsapp.product.newsletterenforcements;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C95804uY;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.NewsletterAlertsLauncherBridgeImpl$getActivityToLaunch$2", f = "NewsletterAlertsLauncherBridgeImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterAlertsLauncherBridgeImpl$getActivityToLaunch$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C95804uY $newsletterJid;
    public int label;
    public final /* synthetic */ NewsletterAlertsLauncherBridgeImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAlertsLauncherBridgeImpl$getActivityToLaunch$2(Context context, C95804uY r3, NewsletterAlertsLauncherBridgeImpl newsletterAlertsLauncherBridgeImpl, C84814Du r5) {
        super(r5, 2);
        this.this$0 = newsletterAlertsLauncherBridgeImpl;
        this.$newsletterJid = r3;
        this.$context = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (r2.isEmpty() == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r5.this$0.A04.A01(r1) == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            if (r0 != 0) goto L_0x007b
            X.C57682u2.A01(r6)
            com.whatsapp.product.newsletterenforcements.NewsletterAlertsLauncherBridgeImpl r0 = r5.this$0
            X.2ss r1 = r0.A00
            X.4uY r0 = r5.$newsletterJid
            X.31A r1 = X.C56982ss.A00(r1, r0)
            if (r1 == 0) goto L_0x001e
            com.whatsapp.product.newsletterenforcements.NewsletterAlertsLauncherBridgeImpl r0 = r5.this$0
            X.2go r0 = r0.A04
            boolean r0 = r0.A01(r1)
            r3 = 1
            if (r0 != 0) goto L_0x001f
        L_0x001e:
            r3 = 0
        L_0x001f:
            com.whatsapp.product.newsletterenforcements.NewsletterAlertsLauncherBridgeImpl r0 = r5.this$0
            X.1VX r2 = r0.A02
            r1 = 5216(0x1460, float:7.309E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0051
            com.whatsapp.product.newsletterenforcements.NewsletterAlertsLauncherBridgeImpl r0 = r5.this$0
            X.2j9 r1 = r0.A03
            X.4uY r0 = r5.$newsletterJid
            java.util.List r2 = r1.A01(r0)
        L_0x0037:
            if (r3 != 0) goto L_0x0054
            int r1 = r2.size()
            r0 = 1
            if (r1 != r0) goto L_0x005b
            java.lang.Object r0 = X.C73723fy.A03(r2)
            X.2j7 r0 = (X.C51002j7) r0
            java.lang.String r2 = r0.A00
            android.content.Context r1 = r5.$context
            X.4uY r0 = r5.$newsletterJid
            android.content.Intent r4 = X.C627736r.A0d(r1, r0, r2)
            return r4
        L_0x0051:
            X.3d3 r2 = X.C72023d3.A00
            goto L_0x0037
        L_0x0054:
            boolean r0 = r2.isEmpty()
            r3 = 1
            if (r0 != 0) goto L_0x005c
        L_0x005b:
            r3 = 0
        L_0x005c:
            android.content.Context r0 = r5.$context
            X.4uY r2 = r5.$newsletterJid
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            if (r3 == 0) goto L_0x0075
            java.lang.String r0 = "com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesActivity"
            X.C627336j.A0E(r4, r2, r1, r0)
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            r4.addFlags(r0)
            return r4
        L_0x0075:
            java.lang.String r0 = "com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsActivity"
            X.C627336j.A0E(r4, r2, r1, r0)
            return r4
        L_0x007b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.NewsletterAlertsLauncherBridgeImpl$getActivityToLaunch$2.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        NewsletterAlertsLauncherBridgeImpl newsletterAlertsLauncherBridgeImpl = this.this$0;
        return new NewsletterAlertsLauncherBridgeImpl$getActivityToLaunch$2(this.$context, this.$newsletterJid, newsletterAlertsLauncherBridgeImpl, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
