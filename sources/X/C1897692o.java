package X;

/* renamed from: X.92o  reason: invalid class name and case insensitive filesystem */
public class C1897692o implements C15930sC {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1897692o(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        if (r3.A0R == null) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BOf(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A02
            switch(r0) {
                case 0: goto L_0x0063;
                case 1: goto L_0x008f;
                case 2: goto L_0x00a0;
                case 3: goto L_0x001b;
                case 4: goto L_0x00ae;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A00
            X.4UC r0 = (X.AnonymousClass4UC) r0
            java.lang.Object r3 = r11.A01
            X.0sC r3 = (X.C15930sC) r3
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.A00
            r1 = 1
            r0 = 0
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x001a
            r3.BOf(r12)
        L_0x001a:
            return
        L_0x001b:
            java.lang.Object r3 = r11.A00
            com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity r3 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity) r3
            java.lang.Object r5 = r11.A01
            X.7yt r5 = (X.C166557yt) r5
            X.750 r12 = (X.AnonymousClass750) r12
            boolean r0 = r12 instanceof X.C137196oI
            if (r0 != 0) goto L_0x003c
            boolean r0 = r12 instanceof X.C137206oJ
            if (r0 != 0) goto L_0x003c
            boolean r0 = r12 instanceof X.C137216oK
            if (r0 == 0) goto L_0x00d8
            com.whatsapp.CircularProgressBar r1 = r3.A02
            if (r1 != 0) goto L_0x00c3
            java.lang.String r0 = "progressBar"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x003c:
            r3.A75()
            if (r5 == 0) goto L_0x001a
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r4 = "extra_referral_screen"
            java.lang.String r2 = r0.getStringExtra(r4)
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity> r0 = com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity.class
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r3, r0)
            java.lang.String r0 = "extra_payment_name"
            r1.putExtra(r0, r5)
            r1.putExtra(r4, r2)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r1.setFlags(r0)
            r3.startActivity(r1)
            return
        L_0x0063:
            java.lang.Object r3 = r11.A00
            X.4hu r3 = (X.C90604hu) r3
            java.lang.Object r2 = r11.A01
            android.view.MenuItem r2 = (android.view.MenuItem) r2
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r0 = r12.booleanValue()
            if (r0 == 0) goto L_0x0078
            java.lang.String r1 = r3.A0R
            r0 = 1
            if (r1 != 0) goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            r2.setVisible(r0)
            X.4gy r1 = r3.A0I
            java.lang.Boolean r0 = r1.A01
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x008b
            r1.A01 = r12
            r1.A05()
        L_0x008b:
            r3.A74()
            return
        L_0x008f:
            java.lang.Object r2 = r11.A00
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r2 = (com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel) r2
            java.lang.Object r0 = r11.A01
            X.4xk r0 = (X.C97174xk) r0
            X.5XK r1 = r0.A08()
            r0 = 0
            r2.A0T(r1, r0)
            return
        L_0x00a0:
            java.lang.Object r1 = r11.A00
            com.whatsapp.conversation.ConversationEntryActionButton r1 = (com.whatsapp.conversation.ConversationEntryActionButton) r1
            java.lang.Object r0 = r11.A01
            X.5Xi[] r0 = (X.C106025Xi[]) r0
            X.5Xi r12 = (X.C106025Xi) r12
            com.whatsapp.conversation.ConversationEntryActionButton.A02(r1, r12, r0)
            return
        L_0x00ae:
            java.lang.Object r2 = r11.A00
            com.whatsapp.report.ReportActivity r2 = (com.whatsapp.report.ReportActivity) r2
            java.lang.Object r1 = r11.A01
            X.20h r1 = (X.C369320h) r1
            r2.A76(r1)
            X.20h r0 = X.C369320h.ACCOUNT
            if (r1 != r0) goto L_0x00bf
            X.20h r0 = X.C369320h.NEWSLETTER
        L_0x00bf:
            r2.A77(r0)
            return
        L_0x00c3:
            r0 = 0
            r1.setVisibility(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r3.A07
            if (r1 != 0) goto L_0x00d2
            java.lang.String r0 = "continueButton"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00d2:
            java.lang.String r0 = ""
            r1.setText(r0)
            return
        L_0x00d8:
            boolean r0 = r12 instanceof X.C137176oG
            if (r0 == 0) goto L_0x0148
            X.C162457s7.A0H(r12)
            X.6oG r12 = (X.C137176oG) r12
            X.303 r6 = X.AnonymousClass6C9.A0W()
            int r4 = r12.A00
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "payments_error_code"
            r6.A03(r0, r1)
            java.lang.String r1 = "payments_error_text"
            java.lang.String r0 = r12.A02
            r6.A03(r1, r0)
            X.9ca r5 = r3.A05
            if (r5 == 0) goto L_0x0141
            java.lang.Integer r7 = X.C18290x4.A0b()
            r0 = 51
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.String r9 = "create_numeric_upi_alias"
            java.lang.String r10 = X.AnonymousClass6C7.A0h(r3)
            r5.BKE(r6, r7, r8, r9, r10)
            r3.A75()
            X.9bd r0 = r3.A04
            if (r0 == 0) goto L_0x013a
            r2 = 0
            X.9VW r1 = r0.A04(r2, r4)
            int r0 = r1.A01()
            if (r0 != 0) goto L_0x0123
            r1.A03()
        L_0x0123:
            java.lang.String r1 = r1.A02(r3)
            X.2iE r0 = new X.2iE
            r0.<init>()
            r0.A08 = r1
            androidx.fragment.app.DialogFragment r1 = r0.A00()
            X.0df r0 = r3.getSupportFragmentManager()
            r1.A1O(r0, r2)
            return
        L_0x013a:
            java.lang.String r0 = "indiaUpiErrorHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0141:
            java.lang.String r0 = "fieldStatsLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0148:
            r3.A75()
            java.lang.String r0 = "Unexpected value for indiaUpiMapperLinkEvent"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1897692o.BOf(java.lang.Object):void");
    }
}
