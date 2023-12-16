package com.whatsapp.product.newsletterenforcements.suspension;

import X.AnonymousClass08M;
import X.AnonymousClass1VX;
import X.AnonymousClass1kk;
import X.AnonymousClass66R;
import X.C05550Ty;
import X.C154517dI;
import X.C18260x0;
import X.C18330xA;
import X.C56982ss;
import X.C64773Ex;
import X.C73853gB;
import X.C79403wZ;
import com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient;

public final class NewsletterSuspensionInfoViewModel extends C05550Ty {
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final AnonymousClass08M A02 = C18330xA.A01(AnonymousClass1kk.A00);
    public final C64773Ex A03;
    public final C56982ss A04;
    public final AnonymousClass1VX A05;
    public final NewsletterAppealsClient A06;
    public final AnonymousClass66R A07 = C154517dI.A01(new C79403wZ(this));
    public final C73853gB A08;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0D(X.C95804uY r7, X.C84814Du r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C74263gq
            if (r0 == 0) goto L_0x0022
            r5 = r8
            X.3gq r5 = (X.C74263gq) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r3 = r5.result
            X.218 r4 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r1 = r5.label
            r0 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 != r0) goto L_0x0028
            java.lang.Object r2 = r5.L$0
            com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel r2 = (com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel) r2
            goto L_0x0047
        L_0x0022:
            X.3gq r5 = new X.3gq
            r5.<init>(r6, r8)
            goto L_0x0012
        L_0x0028:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x002d:
            X.C57682u2.A01(r3)
            com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient r3 = r6.A06     // Catch:{ 8SF -> 0x0057 }
            r5.L$0 = r6     // Catch:{ 8SF -> 0x0057 }
            r5.label = r0     // Catch:{ 8SF -> 0x0057 }
            X.3gB r2 = r3.A01     // Catch:{ 8SF -> 0x0057 }
            r1 = 0
            com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient$fetchSuspensionAppeal$2 r0 = new com.whatsapp.newsletterenforcements.data.NewsletterAppealsClient$fetchSuspensionAppeal$2     // Catch:{ 8SF -> 0x0057 }
            r0.<init>(r7, r3, r1)     // Catch:{ 8SF -> 0x0057 }
            java.lang.Object r3 = X.C616131n.A00(r5, r2, r0)     // Catch:{ 8SF -> 0x0057 }
            if (r3 != r4) goto L_0x0045
            return r4
        L_0x0045:
            r2 = r6
            goto L_0x004a
        L_0x0047:
            X.C57682u2.A01(r3)     // Catch:{ 8SF -> 0x0058 }
        L_0x004a:
            X.1hE r3 = (X.C28511hE) r3     // Catch:{ 8SF -> 0x0058 }
            X.08M r1 = r2.A02     // Catch:{ 8SF -> 0x0058 }
            X.1ki r0 = new X.1ki     // Catch:{ 8SF -> 0x0058 }
            r0.<init>(r3)     // Catch:{ 8SF -> 0x0058 }
            r1.A0G(r0)     // Catch:{ 8SF -> 0x0058 }
            goto L_0x005f
        L_0x0057:
            r2 = r6
        L_0x0058:
            X.08M r1 = r2.A02
            X.1kk r0 = X.AnonymousClass1kk.A00
            r1.A0G(r0)
        L_0x005f:
            X.2wD r0 = X.C59022wD.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoViewModel.A0D(X.4uY, X.4Du):java.lang.Object");
    }

    public NewsletterSuspensionInfoViewModel(C64773Ex r2, C56982ss r3, AnonymousClass1VX r4, NewsletterAppealsClient newsletterAppealsClient, C73853gB r6) {
        C18260x0.A0V(r4, r3, r2);
        this.A05 = r4;
        this.A04 = r3;
        this.A03 = r2;
        this.A06 = newsletterAppealsClient;
        this.A08 = r6;
    }
}
