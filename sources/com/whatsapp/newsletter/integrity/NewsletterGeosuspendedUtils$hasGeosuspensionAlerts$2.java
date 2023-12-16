package com.whatsapp.newsletter.integrity;

import X.AnonymousClass4GR;
import X.C42452Od;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C95804uY;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.integrity.NewsletterGeosuspendedUtils$hasGeosuspensionAlerts$2", f = "NewsletterGeosuspendedUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterGeosuspendedUtils$hasGeosuspensionAlerts$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C95804uY $newsletterJid;
    public int label;
    public final /* synthetic */ C42452Od this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterGeosuspendedUtils$hasGeosuspensionAlerts$2(C95804uY r2, C42452Od r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r3;
        this.$newsletterJid = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        if ((!r3.this$0.A01.A01(r3.$newsletterJid).isEmpty()) != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.label
            if (r0 != 0) goto L_0x002f
            X.C57682u2.A01(r4)
            X.2Od r0 = r3.this$0
            X.1VX r2 = r0.A00
            r1 = 5216(0x1460, float:7.309E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x002d
            X.2Od r0 = r3.this$0
            X.2j9 r1 = r0.A01
            X.4uY r0 = r3.$newsletterJid
            java.util.List r0 = r1.A01(r0)
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002d
        L_0x0028:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L_0x002d:
            r1 = 0
            goto L_0x0028
        L_0x002f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.integrity.NewsletterGeosuspendedUtils$hasGeosuspensionAlerts$2.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new NewsletterGeosuspendedUtils$hasGeosuspensionAlerts$2(this.$newsletterJid, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
