package com.whatsapp.payments.ui.viewmodel;

import X.AnonymousClass08M;
import X.AnonymousClass4FS;
import X.AnonymousClass7WM;
import X.AnonymousClass9U4;
import X.C05550Ty;
import X.C06270Wx;
import X.C162457s7;
import X.C172148Ju;
import X.C18260x0;
import X.C18290x4;
import X.C190839Aa;
import X.C194649Ty;

public final class BrazilPixKeySettingViewModel extends C05550Ty {
    public final AnonymousClass08M A00 = new AnonymousClass08M((Object) null);
    public final AnonymousClass08M A01 = new AnonymousClass08M(C18290x4.A0Z());
    public final AnonymousClass9U4 A02;
    public final C190839Aa A03;
    public final AnonymousClass7WM A04;
    public final C194649Ty A05;
    public final AnonymousClass4FS A06;

    public final void A0D(String str) {
        C162457s7.A0J(str, 0);
        C06270Wx.A04(this.A01, 1);
        this.A02.A09().A01().A03(new C172148Ju(this, str));
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [X.5SE] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel r6, java.lang.String r7) {
        /*
            X.9U4 r0 = r6.A02
            X.8EA r0 = r0.A0B()
            X.7yw r2 = r0.A08(r7)
            if (r2 == 0) goto L_0x0066
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Found payment by credential id "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " : "
            X.C18260x0.A1P(r1, r0, r2)
            boolean r0 = r2 instanceof X.C133726hq
            if (r0 == 0) goto L_0x0066
            X.6hx r5 = r2.A08
            boolean r0 = r5 instanceof X.AnonymousClass99F
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.payments.data.BrazilCustomPaymentMethodData"
            X.C162457s7.A0K(r5, r0)
            X.6ht r5 = (X.C133756ht) r5
            java.util.HashMap r1 = r5.A03
            java.lang.String r0 = "pix_key_type"
            java.lang.Object r0 = r1.get(r0)
            X.7yO r0 = (X.C166257yO) r0
            r4 = 0
            if (r0 == 0) goto L_0x0061
            java.lang.String r3 = r0.A01
            if (r3 == 0) goto L_0x0061
            java.util.HashMap r1 = r5.A03
            java.lang.String r0 = "pix_key"
            java.lang.Object r0 = r1.get(r0)
            X.7yO r0 = (X.C166257yO) r0
            if (r0 == 0) goto L_0x0067
            java.lang.String r2 = r0.A01
        L_0x004d:
            java.util.HashMap r1 = r5.A03
            java.lang.String r0 = "pix_display_name"
            java.lang.Object r0 = r1.get(r0)
            X.7yO r0 = (X.C166257yO) r0
            if (r0 == 0) goto L_0x005b
            java.lang.String r4 = r0.A01
        L_0x005b:
            X.5SE r0 = new X.5SE
            r0.<init>(r3, r2, r4)
            r4 = r0
        L_0x0061:
            X.08M r0 = r6.A00
            r0.A0G(r4)
        L_0x0066:
            return
        L_0x0067:
            r2 = r4
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel.A00(com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        if (r2 >= 0) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel r7, java.lang.String r8) {
        /*
            X.9U4 r0 = r7.A02
            X.8EA r1 = r0.A0B()
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r6 = 0
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = "PAY: PaymentStore removePaymentMethod called with empty credentialId"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0012:
            X.08M r1 = r7.A01
            r0 = 2
            if (r6 == 0) goto L_0x0018
            r0 = 3
        L_0x0018:
            X.C06270Wx.A04(r1, r0)
            return
        L_0x001c:
            X.1RD r0 = r1.A00
            X.4Fq r5 = r0.A0C()
            java.lang.String r4 = "removePaymentMethod/DELETE_SCHEMA_PAY_METHODS"
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0053 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0053 }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0053 }
            r2[r6] = r8     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = "methods"
            java.lang.String r0 = "credential_id=?"
            int r2 = r3.A07(r1, r0, r4, r2)     // Catch:{ all -> 0x0053 }
            r0 = 1
            if (r2 != r0) goto L_0x0043
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = "PAY: PaymentStore removePaymentMethod deleted: "
            X.C18260x0.A0s(r0, r8, r1)     // Catch:{ all -> 0x0053 }
            goto L_0x004e
        L_0x0043:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = "PAY: PaymentStore removePaymentMethod could not delete: "
            X.C18260x0.A0t(r0, r8, r1)     // Catch:{ all -> 0x0053 }
            if (r2 < 0) goto L_0x004f
        L_0x004e:
            r6 = 1
        L_0x004f:
            r5.close()
            goto L_0x0012
        L_0x0053:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0058 }
            throw r1
        L_0x0058:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel.A01(com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel, java.lang.String):void");
    }

    public BrazilPixKeySettingViewModel(AnonymousClass9U4 r3, C190839Aa r4, AnonymousClass7WM r5, C194649Ty r6, AnonymousClass4FS r7) {
        C18260x0.A0Q(r7, r3);
        C162457s7.A0J(r6, 4);
        this.A06 = r7;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
    }
}
