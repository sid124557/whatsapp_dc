package com.whatsapp.product.newsletterenforcements.alerts;

import X.AnonymousClass08M;
import X.AnonymousClass1VX;
import X.AnonymousClass5UP;
import X.C05550Ty;
import X.C162457s7;
import X.C18260x0;
import X.C49612go;
import X.C51022j9;
import X.C56982ss;
import X.C73853gB;
import X.C95804uY;
import com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient;

public final class NewsletterAlertsViewModel extends C05550Ty {
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();
    public final C56982ss A01;
    public final AnonymousClass1VX A02;
    public final C95804uY A03;
    public final AnonymousClass5UP A04;
    public final C51022j9 A05;
    public final NewsletterAppealsClient A06;
    public final C49612go A07;
    public final C73853gB A08;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0D(X.C84814Du r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C73963gM
            if (r0 == 0) goto L_0x001e
            r6 = r8
            X.3gM r6 = (X.C73963gM) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x001e
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r2 = r6.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r1 = r6.label
            r0 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 != r0) goto L_0x0028
            goto L_0x0024
        L_0x001e:
            X.3gM r6 = new X.3gM
            r6.<init>(r7, r8)
            goto L_0x0012
        L_0x0024:
            X.C57682u2.A01(r2)     // Catch:{ 8SF -> 0x0045 }
            return r2
        L_0x0028:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x002d:
            X.C57682u2.A01(r2)
            com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient r4 = r7.A06     // Catch:{ 8SF -> 0x0045 }
            X.4uY r3 = r7.A03     // Catch:{ 8SF -> 0x0045 }
            r6.label = r0     // Catch:{ 8SF -> 0x0045 }
            X.3gB r2 = r4.A01     // Catch:{ 8SF -> 0x0045 }
            r1 = 0
            com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient$fetchAllAppealsForNewsletter$2 r0 = new com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient$fetchAllAppealsForNewsletter$2     // Catch:{ 8SF -> 0x0045 }
            r0.<init>(r3, r4, r1)     // Catch:{ 8SF -> 0x0045 }
            java.lang.Object r2 = X.C616131n.A00(r6, r2, r0)     // Catch:{ 8SF -> 0x0045 }
            if (r2 != r5) goto L_0x0047
            return r5
        L_0x0045:
            X.3d3 r2 = X.C72023d3.A00
        L_0x0047:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel.A0D(X.4Du):java.lang.Object");
    }

    public NewsletterAlertsViewModel(C56982ss r2, AnonymousClass1VX r3, C95804uY r4, AnonymousClass5UP r5, C51022j9 r6, NewsletterAppealsClient newsletterAppealsClient, C49612go r8, C73853gB r9) {
        C18260x0.A0f(r3, r2, r5, r6, r8);
        C162457s7.A0J(r4, 8);
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
        this.A05 = r6;
        this.A07 = r8;
        this.A06 = newsletterAppealsClient;
        this.A08 = r9;
        this.A03 = r4;
    }
}
