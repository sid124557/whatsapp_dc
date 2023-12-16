package X;

import android.view.View;

/* renamed from: X.910  reason: invalid class name */
public class AnonymousClass910 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass910(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        if (r0.length() == 0) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            int r0 = r8.A02
            switch(r0) {
                case 0: goto L_0x0078;
                case 1: goto L_0x0084;
                case 2: goto L_0x0027;
                case 3: goto L_0x0090;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r7 = r8.A00
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity r7 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity) r7
            java.lang.Object r6 = r8.A01
            android.content.Intent r6 = (android.content.Intent) r6
            r5 = 1
            X.9ca r4 = r7.A02
            if (r4 == 0) goto L_0x0071
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            java.lang.Integer r2 = X.C18290x4.A0c()
            java.lang.String r1 = X.AnonymousClass6C7.A0h(r7)
            java.lang.String r0 = "alias_intro"
            r4.BKB(r3, r2, r0, r1)
            r7.A6T(r6, r5)
        L_0x0026:
            return
        L_0x0027:
            java.lang.Object r6 = r8.A00
            X.7YE r6 = (X.AnonymousClass7YE) r6
            java.lang.Object r5 = r8.A01
            com.whatsapp.payments.ui.BusinessHubActivity r5 = (com.whatsapp.payments.ui.BusinessHubActivity) r5
            r4 = 0
            java.lang.String r0 = r6.A01()
            if (r0 == 0) goto L_0x003e
            int r0 = r0.length()
            r3 = 109(0x6d, float:1.53E-43)
            if (r0 != 0) goto L_0x0040
        L_0x003e:
            r3 = 110(0x6e, float:1.54E-43)
        L_0x0040:
            X.66R r1 = r5.A0D
            java.lang.Object r0 = r1.getValue()
            com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel r0 = (com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel) r0
            r2 = 0
            r0.A0D(r3)
            r1.getValue()
            java.lang.String r0 = r6.A01()
            if (r0 != 0) goto L_0x0069
            X.7yw r0 = r6.A00
            if (r0 == 0) goto L_0x0026
            X.6hx r1 = r0.A08
            if (r1 == 0) goto L_0x0026
            boolean r0 = r1 instanceof X.C133776hv
            if (r0 == 0) goto L_0x0026
            X.6hv r1 = (X.C133776hv) r1
            if (r1 == 0) goto L_0x0026
            java.lang.String r0 = r1.A0B
            if (r0 == 0) goto L_0x0026
        L_0x0069:
            android.content.Intent r0 = X.C627736r.A15(r5, r0, r2, r2, r4)
            r5.startActivity(r0)
            return
        L_0x0071:
            java.lang.String r0 = "fieldStatsLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0078:
            java.lang.Object r1 = r8.A00
            X.4oD r1 = (X.C93254oD) r1
            java.lang.Object r0 = r8.A01
            X.34x r0 = (X.C624134x) r0
            X.C93254oD.A04(r1, r0)
            return
        L_0x0084:
            java.lang.Object r1 = r8.A00
            X.4oD r1 = (X.C93254oD) r1
            java.lang.Object r0 = r8.A01
            X.34x r0 = (X.C624134x) r0
            r1.A0A.A02(r0.A0P.A05())
            return
        L_0x0090:
            java.lang.Object r0 = r8.A00
            com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity r0 = (com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity) r0
            java.lang.Object r5 = r8.A01
            android.app.Dialog r5 = (android.app.Dialog) r5
            java.lang.String r4 = r0.A0e
            if (r4 == 0) goto L_0x00ba
            X.66R r0 = r0.A0B
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationViewModel r1 = (com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationViewModel) r1
            r0 = 184(0xb8, float:2.58E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 1
            X.9ca r2 = r1.A04
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "international_payment_prompt"
            X.6ig r0 = r2.A05(r1, r3, r0, r4)
            r2.BKA(r0)
        L_0x00ba:
            r5.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass910.onClick(android.view.View):void");
    }
}
