package X;

import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;

/* renamed from: X.9UF  reason: invalid class name */
public class AnonymousClass9UF implements AnonymousClass4DI {
    public Object A00;
    public final int A01;

    public AnonymousClass9UF(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BXx(C624034w r4) {
        switch (this.A01) {
            case 3:
                ((PaymentTransactionHistoryActivity) this.A00).A75();
                return;
            case 4:
                ((AnonymousClass9bQ) this.A00).A00(false);
                return;
            case 5:
            case 7:
                ((AnonymousClass94y) this.A00).A0O(r4);
                return;
            case 6:
                AnonymousClass94y r2 = (AnonymousClass94y) this.A00;
                r2.A0f.A06("IN- HANDLE_SEND_AGAIN IndiaUpiPaymentTransactionDetailsViewModel#getPaymentTransactionObserver() trying to load the added txn");
                r2.A0O(r4);
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        if (r2 != 421) goto L_0x0005;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BXy(X.C624034w r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x000d;
                case 1: goto L_0x003f;
                case 2: goto L_0x009c;
                case 3: goto L_0x00b4;
                case 4: goto L_0x00bc;
                case 5: goto L_0x0072;
                case 6: goto L_0x00c5;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A00
            X.94y r0 = (X.AnonymousClass94y) r0
            r0.A0O(r6)
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r4 = r5.A00
            X.9TB r4 = (X.AnonymousClass9TB) r4
            X.08M r0 = r4.A01
            r0.A0H(r6)
            int r1 = r6.A02
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x000c
            X.9JQ r0 = X.C195219Wq.A04(r6)
            int r3 = r0.ordinal()
            r2 = 3
            r1 = 0
            r0 = 1
            if (r3 == r0) goto L_0x0038
            r2 = 2
            if (r3 == r2) goto L_0x0038
            if (r3 != r1) goto L_0x000c
            X.08M r1 = r4.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0034:
            r1.A0H(r0)
            return
        L_0x0038:
            X.08M r1 = r4.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x0034
        L_0x003f:
            int r1 = r6.A02
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x000c
            boolean r0 = r6.A0M()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r4 = r5.A00
            com.whatsapp.payments.ui.BrazilPaymentActivity r4 = (com.whatsapp.payments.ui.BrazilPaymentActivity) r4
            X.9B2 r3 = r4.A0O
            r2 = 2
        L_0x0052:
            int r0 = r4.A00
            r3.A04(r0, r2)
            r0 = 0
            r4.A0h = r0
            X.1iY r1 = r4.A0F
            X.4DI r0 = r4.A0j
            r1.A07(r0)
            return
        L_0x0062:
            int r1 = r6.A02
            r0 = 402(0x192, float:5.63E-43)
            java.lang.Object r4 = r5.A00
            com.whatsapp.payments.ui.BrazilPaymentActivity r4 = (com.whatsapp.payments.ui.BrazilPaymentActivity) r4
            X.9B2 r3 = r4.A0O
            r2 = 3
            if (r1 != r0) goto L_0x0052
            r2 = 49
            goto L_0x0052
        L_0x0072:
            int r2 = r6.A02
            r1 = 402(0x192, float:5.63E-43)
            if (r2 == r1) goto L_0x0085
            r0 = 409(0x199, float:5.73E-43)
            if (r2 == r0) goto L_0x0092
            r0 = 411(0x19b, float:5.76E-43)
            if (r2 == r0) goto L_0x0092
            r0 = 421(0x1a5, float:5.9E-43)
            if (r2 == r0) goto L_0x0092
            goto L_0x0005
        L_0x0085:
            java.lang.Object r0 = r5.A00
            X.94y r0 = (X.AnonymousClass94y) r0
            X.9Pj r0 = r0.A06
            X.34w r0 = r0.A01
            int r0 = r0.A02
            if (r0 != r1) goto L_0x0092
            return
        L_0x0092:
            java.lang.Object r1 = r5.A00
            X.94y r1 = (X.AnonymousClass94y) r1
            r0 = 0
            r1.A0c(r0)
            goto L_0x0005
        L_0x009c:
            java.lang.Object r2 = r5.A00
            com.whatsapp.payments.ui.IndiaUpiMandateHistoryActivity r2 = (com.whatsapp.payments.ui.IndiaUpiMandateHistoryActivity) r2
            X.7oG r1 = r2.A05
            java.lang.String r0 = "payment transaction updated"
            r1.A04(r0)
            com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel r2 = r2.A03
            X.4FS r1 = r2.A06
            X.9gv r0 = new X.9gv
            r0.<init>(r2)
            r1.BkM(r0)
            return
        L_0x00b4:
            java.lang.Object r0 = r5.A00
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r0 = (com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r0
            r0.A75()
            return
        L_0x00bc:
            java.lang.Object r1 = r5.A00
            X.9bQ r1 = (X.AnonymousClass9bQ) r1
            r0 = 0
            r1.A00(r0)
            return
        L_0x00c5:
            java.lang.Object r3 = r5.A00
            X.9Fv r3 = (X.C191669Fv) r3
            X.7oG r1 = r3.A0f
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN IndiaUpiPaymentTransactionDetailsViewModel#getPaymentTransactionObserver() txn update event is called"
            r1.A06(r0)
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x010c
            if (r6 == 0) goto L_0x010c
            boolean r0 = r6.A0G()
            if (r0 == 0) goto L_0x010c
            r0 = 101(0x65, float:1.42E-43)
            X.9Fq r2 = new X.9Fq
            r2.<init>(r0)
            java.lang.String r0 = r6.A0L
            r2.A03 = r0
            java.lang.String r0 = r3.A0D
            r2.A06 = r0
            boolean r0 = r6.A0M()
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = "SUCCESS"
        L_0x00f3:
            r2.A05 = r0
            java.lang.String r1 = r6.A0J
            r0 = 0
            int r0 = X.C615531h.A01(r1, r0)
            if (r0 == 0) goto L_0x0106
            java.lang.String r0 = "U13"
        L_0x0100:
            r2.A04 = r0
            X.AnonymousClass94y.A00(r3, r2)
            return
        L_0x0106:
            java.lang.String r0 = "00"
            goto L_0x0100
        L_0x0109:
            java.lang.String r0 = "FAILURE"
            goto L_0x00f3
        L_0x010c:
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN IndiaUpiPaymentTransactionDetailsViewModel#getPaymentTransactionObserver() trying to reload the updated txn"
            r1.A06(r0)
            r3.A0O(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9UF.BXy(X.34w):void");
    }
}
