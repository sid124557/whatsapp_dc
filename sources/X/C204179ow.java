package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.9ow  reason: invalid class name and case insensitive filesystem */
public class C204179ow implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public C204179ow(Context context, C624034w r2, C1907299p r3, String str, int i) {
        this.A04 = i;
        this.A00 = r3;
        this.A01 = context;
        this.A02 = r2;
        this.A03 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0093, code lost:
        r1 = X.AnonymousClass0x9.A08(r3, com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity.class);
        r1.putExtra("extra_setup_mode", 1);
        X.AnonymousClass5VI.A00(r1, "mandateRequest");
        r3.startActivity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00a6, code lost:
        r3 = r5.A07;
        r4 = 1;
        r5 = 104;
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00b4, code lost:
        r5.A06.A01(r3, r4, new X.C196799bl(r3, r4, r5, r6, r7), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00de, code lost:
        r5 = java.lang.Integer.valueOf(r0);
        r7 = null;
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00e4, code lost:
        r3.BKC(r4, r5, r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00e7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x008a, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0091, code lost:
        if (r5.A05.A0D() != false) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            int r0 = r9.A04
            switch(r0) {
                case 0: goto L_0x002b;
                case 1: goto L_0x004b;
                case 2: goto L_0x006a;
                case 3: goto L_0x007b;
                case 4: goto L_0x00c0;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r9.A00
            X.99p r3 = (X.C1907299p) r3
            java.lang.Object r2 = r9.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r9.A02
            X.34w r0 = (X.C624034w) r0
            java.lang.String r5 = r9.A03
            r1 = 3
            android.content.Intent r0 = com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity.A0C(r2, r0, r5, r1)
            r2.startActivity(r0)
            X.9ca r2 = r3.A07
            r7 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r6 = 0
            r2.BKC(r3, r4, r5, r6, r7)
            return
        L_0x002b:
            java.lang.Object r3 = r9.A00
            X.99p r3 = (X.C1907299p) r3
            java.lang.Object r2 = r9.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r9.A02
            X.34w r1 = (X.C624034w) r1
            java.lang.String r6 = r9.A03
            r0 = 5
            android.content.Intent r0 = com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity.A0C(r2, r1, r6, r0)
            r2.startActivity(r0)
            X.9ca r3 = r3.A07
            java.lang.Integer r4 = X.AnonymousClass001.A0f()
            r0 = 117(0x75, float:1.64E-43)
            goto L_0x00de
        L_0x004b:
            java.lang.Object r3 = r9.A00
            X.99p r3 = (X.C1907299p) r3
            java.lang.Object r2 = r9.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r9.A02
            X.34w r1 = (X.C624034w) r1
            java.lang.String r6 = r9.A03
            r0 = 6
            android.content.Intent r0 = com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity.A0C(r2, r1, r6, r0)
            r2.startActivity(r0)
            X.9ca r3 = r3.A07
            java.lang.Integer r4 = X.AnonymousClass001.A0f()
            r0 = 118(0x76, float:1.65E-43)
            goto L_0x00de
        L_0x006a:
            java.lang.Object r5 = r9.A00
            X.99p r5 = (X.C1907299p) r5
            java.lang.Object r3 = r9.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r4 = r9.A02
            X.34w r4 = (X.C624034w) r4
            java.lang.String r6 = r9.A03
            r7 = 8
            goto L_0x008a
        L_0x007b:
            java.lang.Object r5 = r9.A00
            X.99p r5 = (X.C1907299p) r5
            java.lang.Object r3 = r9.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r4 = r9.A02
            X.34w r4 = (X.C624034w) r4
            java.lang.String r6 = r9.A03
            r7 = 1
        L_0x008a:
            X.99l r0 = r5.A05
            boolean r0 = r0.A0D()
            r8 = 1
            if (r0 != 0) goto L_0x00b4
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity> r0 = com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity.class
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r3, r0)
            java.lang.String r0 = "extra_setup_mode"
            r1.putExtra(r0, r8)
            java.lang.String r0 = "mandateRequest"
            X.AnonymousClass5VI.A00(r1, r0)
            r3.startActivity(r1)
        L_0x00a6:
            X.9ca r3 = r5.A07
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r0 = 104(0x68, float:1.46E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r7 = 0
            goto L_0x00e4
        L_0x00b4:
            X.9Tr r1 = r5.A06
            X.9bl r2 = new X.9bl
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 0
            r1.A01(r3, r4, r2, r0)
            goto L_0x00a6
        L_0x00c0:
            java.lang.Object r3 = r9.A00
            X.99p r3 = (X.C1907299p) r3
            java.lang.Object r2 = r9.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r9.A02
            X.34w r1 = (X.C624034w) r1
            java.lang.String r6 = r9.A03
            r0 = 2
            android.content.Intent r0 = com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity.A0C(r2, r1, r6, r0)
            r2.startActivity(r0)
            X.9ca r3 = r3.A07
            java.lang.Integer r4 = X.AnonymousClass001.A0f()
            r0 = 105(0x69, float:1.47E-43)
        L_0x00de:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r7 = 0
            r8 = 1
        L_0x00e4:
            r3.BKC(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204179ow.onClick(android.view.View):void");
    }
}
