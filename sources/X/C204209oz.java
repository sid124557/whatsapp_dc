package X;

import android.view.View;

/* renamed from: X.9oz  reason: invalid class name and case insensitive filesystem */
public class C204209oz implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C204209oz(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0112, code lost:
        r4.A1Y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0115, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
        r0.A0H(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            int r0 = r9.A03
            switch(r0) {
                case 0: goto L_0x00ad;
                case 1: goto L_0x00ca;
                case 2: goto L_0x0033;
                case 3: goto L_0x00e6;
                case 4: goto L_0x00fe;
                case 5: goto L_0x0116;
                case 6: goto L_0x012d;
                case 7: goto L_0x0144;
                case 8: goto L_0x016c;
                case 9: goto L_0x0034;
                case 10: goto L_0x0079;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r9.A00
            X.94y r4 = (X.AnonymousClass94y) r4
            java.lang.Object r3 = r9.A01
            X.1S4 r3 = (X.AnonymousClass1S4) r3
            java.lang.Object r2 = r9.A02
            X.34w r2 = (X.C624034w) r2
            r0 = 21
            X.9QJ r1 = X.AnonymousClass9QJ.A00(r0)
            X.39U r0 = r3.A02
            X.C626936e.A06(r0)
            java.lang.String r0 = r0.A01
            r1.A0D = r0
            r1.A05 = r2
            X.9Pj r0 = r4.A06
            X.1n7 r0 = r0.A03
            if (r0 == 0) goto L_0x002a
            r1.A08 = r0
        L_0x002a:
            int r0 = r4.A00
            r1.A01 = r0
            X.4UC r0 = r4.A08
        L_0x0030:
            r0.A0H(r1)
        L_0x0033:
            return
        L_0x0034:
            java.lang.Object r6 = r9.A00
            X.94y r6 = (X.AnonymousClass94y) r6
            java.lang.Object r3 = r9.A01
            X.34w r3 = (X.C624034w) r3
            java.lang.Object r2 = r9.A02
            X.99L r2 = (X.AnonymousClass99L) r2
            X.9U4 r1 = r6.A0b
            java.lang.String r0 = r3.A0G
            X.9SU r1 = r1.A0F(r0)
            if (r1 == 0) goto L_0x0077
            java.lang.String r0 = r3.A0I
            X.9oC r0 = r1.A01(r0)
        L_0x0050:
            android.content.Context r5 = r10.getContext()
            java.lang.String r4 = r2.A0L
            java.lang.String r3 = "payment_transaction_details"
            int r2 = r6.A00
            if (r0 == 0) goto L_0x0033
            java.lang.Class r0 = r0.BBC()
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r5, r0)
            java.lang.String r0 = "extra_transaction_id"
            r1.putExtra(r0, r4)
            java.lang.String r0 = "referral_screen"
            r1.putExtra(r0, r3)
            java.lang.String r0 = "extra_payment_flow_entry_point"
            r1.putExtra(r0, r2)
            r5.startActivity(r1)
            return
        L_0x0077:
            r0 = 0
            goto L_0x0050
        L_0x0079:
            java.lang.Object r8 = r9.A00
            X.94y r8 = (X.AnonymousClass94y) r8
            java.lang.Object r7 = r9.A01
            X.34w r7 = (X.C624034w) r7
            java.lang.Object r6 = r9.A02
            X.9nv r6 = (X.C203549nv) r6
            X.9Tp r5 = r8.A0h
            X.5dt r4 = r8.A03
            if (r6 == 0) goto L_0x0033
            java.lang.String r0 = r7.A0J
            if (r0 == 0) goto L_0x0033
            r3 = -1
            int r2 = X.C615531h.A01(r0, r3)
            int r1 = r7.A02
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L_0x009e
            r0 = 108(0x6c, float:1.51E-43)
            if (r1 != r0) goto L_0x0033
        L_0x009e:
            int r0 = r6.B69(r4, r5, r2)
            if (r0 == r3) goto L_0x0033
            X.9QJ r1 = X.AnonymousClass9QJ.A00(r0)
            r1.A05 = r7
            X.4UC r0 = r8.A08
            goto L_0x0030
        L_0x00ad:
            java.lang.Object r0 = r9.A00
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r3 = r9.A01
            X.9T5 r3 = (X.AnonymousClass9T5) r3
            java.lang.Object r2 = r9.A02
            X.9T5 r2 = (X.AnonymousClass9T5) r2
            android.view.View r1 = r0.getRootView()
            r0 = 8
            r1.setVisibility(r0)
            X.9mr r1 = r3.A01
            X.3ZO r0 = r2.A02
            r1.BRL(r0)
            return
        L_0x00ca:
            java.lang.Object r0 = r9.A00
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r3 = r9.A01
            X.9oC r3 = (X.C203719oC) r3
            java.lang.Object r2 = r9.A02
            X.34w r2 = (X.C624034w) r2
            android.content.Context r1 = r0.getContext()
            java.lang.Class<X.4ea> r0 = X.C89654ea.class
            android.app.Activity r0 = X.C111095hX.A03(r1, r0)
            X.4FU r0 = (X.AnonymousClass4FU) r0
            r3.BLt(r1, r0, r2)
            return
        L_0x00e6:
            java.lang.Object r0 = r9.A00
            X.9ct r0 = (X.C197299ct) r0
            java.lang.Object r3 = r9.A01
            X.303 r3 = (X.AnonymousClass303) r3
            java.lang.Object r4 = r9.A02
            com.whatsapp.payments.ui.PaymentBottomSheet r4 = (com.whatsapp.payments.ui.PaymentBottomSheet) r4
            X.9mT r2 = r0.A06
            java.lang.Integer r1 = X.AnonymousClass001.A0f()
            java.lang.String r0 = "payment_confirm_prompt"
            r2.BKD(r3, r1, r1, r0)
            goto L_0x0112
        L_0x00fe:
            java.lang.Object r0 = r9.A00
            X.9cs r0 = (X.C197289cs) r0
            java.lang.Object r3 = r9.A01
            X.303 r3 = (X.AnonymousClass303) r3
            java.lang.Object r4 = r9.A02
            com.whatsapp.payments.ui.PaymentBottomSheet r4 = (com.whatsapp.payments.ui.PaymentBottomSheet) r4
            X.9Bs r2 = r0.A05
            r1 = 1
            java.lang.String r0 = "payment_confirm_prompt"
            r2.A87(r3, r0, r1)
        L_0x0112:
            r4.A1Y()
            return
        L_0x0116:
            java.lang.Object r3 = r9.A00
            com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity r3 = (com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity) r3
            java.lang.Object r0 = r9.A01
            com.whatsapp.payments.ui.widget.PaymentMethodRow r0 = (com.whatsapp.payments.ui.widget.PaymentMethodRow) r0
            java.lang.Object r2 = r9.A02
            com.whatsapp.payments.ui.widget.PaymentMethodRow r2 = (com.whatsapp.payments.ui.widget.PaymentMethodRow) r2
            r1 = 0
            r0.setRadioButtonChecked(r1)
            r0 = 1
            r2.setRadioButtonChecked(r0)
            r3.A00 = r1
            return
        L_0x012d:
            java.lang.Object r3 = r9.A00
            com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity r3 = (com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity) r3
            java.lang.Object r2 = r9.A01
            com.whatsapp.payments.ui.widget.PaymentMethodRow r2 = (com.whatsapp.payments.ui.widget.PaymentMethodRow) r2
            java.lang.Object r1 = r9.A02
            com.whatsapp.payments.ui.widget.PaymentMethodRow r1 = (com.whatsapp.payments.ui.widget.PaymentMethodRow) r1
            r0 = 0
            r2.setRadioButtonChecked(r0)
            r0 = 1
            r1.setRadioButtonChecked(r0)
            r3.A00 = r0
            return
        L_0x0144:
            java.lang.Object r4 = r9.A00
            X.947 r4 = (X.AnonymousClass947) r4
            java.lang.Object r1 = r9.A01
            X.3ZH r1 = (X.AnonymousClass3ZH) r1
            java.lang.Object r3 = r9.A02
            X.9Pf r3 = (X.C193589Pf) r3
            r2 = 0
            java.lang.Class<X.4uZ> r0 = X.C95814uZ.class
            com.whatsapp.jid.Jid r0 = r1.A0I(r0)
            X.4uZ r0 = (X.C95814uZ) r0
            X.5XB r1 = new X.5XB
            r1.<init>((android.view.View) r10, (X.C95814uZ) r0, (java.lang.Integer) r2)
            android.widget.ImageView r0 = r3.A00
            java.lang.String r0 = X.AnonymousClass0YZ.A06(r0)
            r1.A04 = r0
            com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity r0 = r4.A02
            r1.A02(r0)
            return
        L_0x016c:
            java.lang.Object r4 = r9.A00
            com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2 r4 = (com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2) r4
            java.lang.Object r3 = r9.A01
            X.9Rl r3 = (X.C194069Rl) r3
            java.lang.Object r2 = r9.A02
            X.9QL r2 = (X.AnonymousClass9QL) r2
            android.content.Context r1 = r10.getContext()
            java.lang.String r0 = "order_details"
            r4.A01(r1, r3, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204209oz.onClick(android.view.View):void");
    }
}
