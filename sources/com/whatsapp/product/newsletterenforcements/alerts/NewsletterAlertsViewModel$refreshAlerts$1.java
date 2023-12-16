package com.whatsapp.product.newsletterenforcements.alerts;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel$refreshAlerts$1", f = "NewsletterAlertsViewModel.kt", i = {}, l = {90, 91}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterAlertsViewModel$refreshAlerts$1 extends C75003pT implements AnonymousClass4GR {
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ NewsletterAlertsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAlertsViewModel$refreshAlerts$1(NewsletterAlertsViewModel newsletterAlertsViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = newsletterAlertsViewModel;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067 A[LOOP:1: B:14:0x0061->B:16:0x0067, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0084 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r9) {
        /*
            r8 = this;
            X.218 r7 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r1 = r8.label
            r6 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 == r0) goto L_0x0050
            if (r1 != r6) goto L_0x0095
            java.lang.Object r5 = r8.L$1
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r4 = r8.L$0
            X.0Wx r4 = (X.C06270Wx) r4
            X.C57682u2.A01(r9)
        L_0x0017:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r3 = X.C73783g4.A0d(r9)
            java.util.Iterator r2 = r9.iterator()
        L_0x0021:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0085
            java.lang.Object r1 = r2.next()
            X.38T r1 = (X.AnonymousClass38T) r1
            X.1ka r0 = new X.1ka
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x0021
        L_0x0036:
            X.C57682u2.A01(r9)
            com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel r3 = r8.this$0
            X.08M r4 = r3.A00
            r8.L$0 = r4
            r8.label = r0
            X.3gB r2 = r3.A08
            r1 = 0
            com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel$fetchAlerts$2 r0 = new com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel$fetchAlerts$2
            r0.<init>(r3, r1)
            java.lang.Object r9 = X.C616131n.A00(r8, r2, r0)
            if (r9 != r7) goto L_0x0057
            return r7
        L_0x0050:
            java.lang.Object r4 = r8.L$0
            X.0Wx r4 = (X.C06270Wx) r4
            X.C57682u2.A01(r9)
        L_0x0057:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r5 = X.C73783g4.A0d(r9)
            java.util.Iterator r2 = r9.iterator()
        L_0x0061:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r1 = r2.next()
            X.28E r1 = (X.AnonymousClass28E) r1
            X.1kY r0 = new X.1kY
            r0.<init>(r1)
            r5.add(r0)
            goto L_0x0061
        L_0x0076:
            com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel r0 = r8.this$0
            r8.L$0 = r4
            r8.L$1 = r5
            r8.label = r6
            java.lang.Object r9 = r0.A0D(r8)
            if (r9 != r7) goto L_0x0017
            return r7
        L_0x0085:
            r0 = 31
            java.util.List r0 = X.C73723fy.A0H(r3, r0)
            java.util.List r0 = X.C73723fy.A0K(r0, r5)
            r4.A0G(r0)
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0095:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel$refreshAlerts$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new NewsletterAlertsViewModel$refreshAlerts$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new NewsletterAlertsViewModel$refreshAlerts$1(this.this$0, (C84814Du) obj2));
    }
}
