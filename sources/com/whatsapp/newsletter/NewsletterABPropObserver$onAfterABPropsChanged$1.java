package com.whatsapp.newsletter;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C94424rG;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.NewsletterABPropObserver$onAfterABPropsChanged$1", f = "NewsletterABPropObserver.kt", i = {}, l = {49, 54}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterABPropObserver$onAfterABPropsChanged$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ C94424rG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterABPropObserver$onAfterABPropsChanged$1(C94424rG r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (X.C59022wD.A00 != r4) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r9) {
        /*
            r8 = this;
            X.218 r4 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 0
            r5 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0013
            if (r0 == r3) goto L_0x0043
            if (r0 != r5) goto L_0x0073
            X.C57682u2.A01(r9)
        L_0x0010:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0013:
            X.C57682u2.A01(r9)
            X.4rG r0 = r8.this$0
            X.1VX r1 = r0.A04
            r0 = 4219(0x107b, float:5.912E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0046
            X.4rG r0 = r8.this$0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A01
            boolean r0 = r0.compareAndSet(r6, r3)
            if (r0 == 0) goto L_0x0046
            X.4rG r7 = r8.this$0
            r8.label = r3
            X.3gB r2 = r7.A06
            r1 = 0
            com.whatsapp.newsletter.NewsletterABPropObserver$fetchMessageEnforcements$2 r0 = new com.whatsapp.newsletter.NewsletterABPropObserver$fetchMessageEnforcements$2
            r0.<init>(r7, r1)
            java.lang.Object r0 = X.C616131n.A00(r8, r2, r0)
            if (r0 == r4) goto L_0x0042
            X.2wD r0 = X.C59022wD.A00
            if (r0 != r4) goto L_0x0046
        L_0x0042:
            return r4
        L_0x0043:
            X.C57682u2.A01(r9)
        L_0x0046:
            X.4rG r0 = r8.this$0
            X.1VX r1 = r0.A04
            r0 = 5216(0x1460, float:7.309E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0010
            X.4rG r0 = r8.this$0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A00
            boolean r0 = r0.compareAndSet(r6, r3)
            if (r0 == 0) goto L_0x0010
            X.4rG r3 = r8.this$0
            r8.label = r5
            X.3gB r2 = r3.A06
            r1 = 0
            com.whatsapp.newsletter.NewsletterABPropObserver$fetchGeosuspensionCountries$2 r0 = new com.whatsapp.newsletter.NewsletterABPropObserver$fetchGeosuspensionCountries$2
            r0.<init>(r3, r1)
            java.lang.Object r0 = X.C616131n.A00(r8, r2, r0)
            if (r0 == r4) goto L_0x0042
            X.2wD r0 = X.C59022wD.A00
            if (r0 != r4) goto L_0x0010
            return r4
        L_0x0073:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.NewsletterABPropObserver$onAfterABPropsChanged$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new NewsletterABPropObserver$onAfterABPropsChanged$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new NewsletterABPropObserver$onAfterABPropsChanged$1(this.this$0, (C84814Du) obj2));
    }
}
