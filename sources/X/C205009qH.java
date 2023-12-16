package X;

/* renamed from: X.9qH  reason: invalid class name and case insensitive filesystem */
public class C205009qH implements C84134Bd {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0102, code lost:
        r3.A0S(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0105, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0108, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AwB(java.lang.Object r15) {
        /*
            r14 = this;
            r8 = r15
            int r0 = r14.A02
            switch(r0) {
                case 0: goto L_0x0038;
                case 1: goto L_0x0058;
                case 2: goto L_0x0068;
                case 3: goto L_0x007a;
                case 4: goto L_0x009f;
                case 5: goto L_0x00c0;
                case 6: goto L_0x010c;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r1 = r14.A00
            X.9dS r1 = (X.AnonymousClass9dS) r1
            java.lang.Object r4 = r14.A01
            X.39Q r4 = (X.AnonymousClass39Q) r4
            X.9PL r8 = (X.AnonymousClass9PL) r8
            com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity r3 = r1.A00
            X.9WW r2 = r3.A0W
            X.4uZ r6 = r3.A0E
            X.C626936e.A06(r6)
            com.whatsapp.jid.UserJid r7 = r3.A0G
            long r12 = r3.A02
            com.whatsapp.payments.ui.widget.PaymentView r0 = r3.A0N
            java.lang.String r10 = r0.getPaymentNote()
            com.whatsapp.payments.ui.widget.PaymentView r0 = r3.A0N
            java.util.List r11 = r0.getMentionedJids()
            com.whatsapp.payments.ui.widget.PaymentView r0 = r3.A0N
            X.39R r5 = r0.getPaymentBackground()
            X.9dK r9 = new X.9dK
            r9.<init>(r1)
            r2.A04(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0038:
            java.lang.Object r2 = r14.A00
            X.9Vt r2 = (X.C195069Vt) r2
            boolean r0 = X.AnonymousClass001.A1Z(r15)
            java.lang.String r1 = "BrazilPaymentMerchantHelper"
            if (r0 != 0) goto L_0x004c
            java.lang.String r0 = "triggerMerchantOnboarding -> merchant onboarding failed. Something went wrong"
            java.lang.String r0 = X.C160757oG.A01(r1, r0)
            goto L_0x0108
        L_0x004c:
            X.5rC r0 = r2.A00
            r0.A04()
            java.lang.String r0 = "getOrdersActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0058:
            java.lang.Object r1 = r14.A00
            X.9Ac r1 = (X.C190859Ac) r1
            java.lang.Object r0 = r14.A01
            X.4EY r0 = (X.AnonymousClass4EY) r0
            java.util.List r8 = (java.util.List) r8
            r1.A00 = r8
            r0.BaC(r1)
            return
        L_0x0068:
            java.lang.Object r4 = r14.A00
            X.9QG r4 = (X.AnonymousClass9QG) r4
            java.lang.Object r3 = r14.A01
            X.9U5 r2 = r4.A0B
            r1 = 0
            X.9pU r0 = new X.9pU
            r0.<init>(r3, r1, r4)
            r2.A08(r0)
            return
        L_0x007a:
            java.lang.Object r2 = r14.A00
            X.9Am r2 = (X.C190959Am) r2
            java.lang.Object r1 = r14.A01
            X.4FU r1 = (X.AnonymousClass4FU) r1
            java.util.List r8 = (java.util.List) r8
            int r0 = r8.size()
            if (r0 != 0) goto L_0x008d
            java.lang.String r0 = "PAY: BrazilPaymentService/onAcceptPayment: Can't launch the 'ConfirmReceiveFragment'."
            goto L_0x0108
        L_0x008d:
            int r0 = X.C195169Wk.A01(r8)
            java.lang.Object r0 = r8.get(r0)
            X.6hr r0 = (X.C133736hr) r0
            X.3Wi r3 = r2.A02
            X.9hy r2 = new X.9hy
            r2.<init>(r1, r0)
            goto L_0x0102
        L_0x009f:
            java.lang.Object r4 = r14.A00
            X.0eF r4 = (X.C08310eF) r4
            java.lang.Object r3 = r14.A01
            com.whatsapp.payments.ui.PaymentBottomSheet r3 = (com.whatsapp.payments.ui.PaymentBottomSheet) r3
            java.util.List r8 = (java.util.List) r8
            X.C626936e.A06(r8)
            com.whatsapp.payments.ui.PaymentMethodsListPickerFragment r2 = com.whatsapp.payments.ui.PaymentMethodsListPickerFragment.A00(r8)
            r0 = 0
            r2.A10(r4, r0)
            r1 = 0
            X.9Lj r0 = new X.9Lj
            r0.<init>(r4, r1)
            r2.A07 = r0
            r3.A1b(r2)
            return
        L_0x00c0:
            java.lang.Object r4 = r14.A00
            com.whatsapp.payments.ui.BrazilPaymentActivity r4 = (com.whatsapp.payments.ui.BrazilPaymentActivity) r4
            java.lang.Object r3 = r14.A01
            X.39Q r3 = (X.AnonymousClass39Q) r3
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r2 = r8.iterator()
        L_0x00ce:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00eb
            X.7yw r1 = X.C1899693i.A0C(r2)
            boolean r0 = X.C195169Wk.A08(r1)
            if (r0 == 0) goto L_0x00ce
            X.6hx r0 = r1.A08
            if (r0 == 0) goto L_0x00ce
            int r1 = r1.A00
            r0 = 2
            if (r1 != r0) goto L_0x00ce
            r4.A7L(r3)
            return
        L_0x00eb:
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x0106
            int r0 = X.C195169Wk.A01(r8)
            java.lang.Object r0 = r8.get(r0)
            X.6hr r0 = (X.C133736hr) r0
            X.3Wi r3 = r4.A05
            X.9i0 r2 = new X.9i0
            r2.<init>(r0, r4)
        L_0x0102:
            r3.A0S(r2)
            return
        L_0x0106:
            java.lang.String r0 = "PAY: BrazilPaymentActivity/onRequestPayment: Can't launch ConfirmReceiveFragment"
        L_0x0108:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x010c:
            java.lang.Object r4 = r14.A00
            com.whatsapp.payments.ui.BrazilPaymentActivity r4 = (com.whatsapp.payments.ui.BrazilPaymentActivity) r4
            java.lang.Object r1 = r14.A01
            android.content.Intent r1 = (android.content.Intent) r1
            java.util.List r8 = (java.util.List) r8
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = r4.A0T
            if (r0 == 0) goto L_0x013b
            java.lang.String r0 = "payment_method_credential_id"
            java.lang.String r3 = r1.getStringExtra(r0)
            java.util.Iterator r2 = r8.iterator()
        L_0x0124:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x013b
            X.7yw r1 = X.C1899693i.A0C(r2)
            java.lang.String r0 = r1.A0A
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0124
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = r4.A0T
            r0.BXr(r1)
        L_0x013b:
            X.3XA r0 = r4.A04
            r0.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C205009qH.AwB(java.lang.Object):void");
    }

    public C205009qH(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }
}
