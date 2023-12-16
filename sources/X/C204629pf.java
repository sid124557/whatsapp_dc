package X;

import android.content.DialogInterface;

/* renamed from: X.9pf  reason: invalid class name and case insensitive filesystem */
public class C204629pf implements DialogInterface.OnDismissListener {
    public Object A00;
    public final int A01;

    public C204629pf(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a0, code lost:
        r2.BKC(r3, r4, r5, r1.A04, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d3, code lost:
        r1.overridePendingTransition(0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDismiss(android.content.DialogInterface r9) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x0022;
                case 1: goto L_0x002c;
                case 2: goto L_0x0005;
                case 3: goto L_0x0034;
                case 4: goto L_0x000d;
                case 5: goto L_0x0034;
                case 6: goto L_0x0034;
                case 7: goto L_0x003c;
                case 8: goto L_0x0047;
                case 9: goto L_0x0047;
                case 10: goto L_0x0005;
                case 11: goto L_0x0051;
                case 12: goto L_0x0067;
                case 13: goto L_0x0071;
                case 14: goto L_0x0005;
                case 15: goto L_0x008d;
                case 16: goto L_0x00a7;
                case 17: goto L_0x0005;
                case 18: goto L_0x0005;
                case 19: goto L_0x00b3;
                case 20: goto L_0x00c7;
                case 21: goto L_0x00cc;
                case 22: goto L_0x001b;
                case 23: goto L_0x00d8;
                case 24: goto L_0x0034;
                case 25: goto L_0x003c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.A00
            android.app.Activity r0 = (android.app.Activity) r0
        L_0x0009:
            r0.finish()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r1 = r8.A00
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            boolean r0 = r1.A16()
            if (r0 == 0) goto L_0x000c
            r1.A1L()
            return
        L_0x001b:
            java.lang.Object r0 = r8.A00
            X.9d8 r0 = (X.C197419d8) r0
            X.4eZ r0 = r0.A01
            goto L_0x0009
        L_0x0022:
            java.lang.Object r1 = r8.A00
            X.2m3 r1 = (X.C52792m3) r1
            java.lang.String r0 = "on_dismiss"
            r1.A00(r0)
            return
        L_0x002c:
            java.lang.Object r0 = r8.A00
            com.whatsapp.payments.IndiaUpiPaymentInvitePickerActivity r0 = (com.whatsapp.payments.IndiaUpiPaymentInvitePickerActivity) r0
            X.C204629pf.super.onBackPressed()
            return
        L_0x0034:
            java.lang.Object r0 = r8.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1L()
            return
        L_0x003c:
            java.lang.Object r0 = r8.A00
            com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment r0 = (com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment) r0
            com.whatsapp.CodeInputField r1 = r0.A06
            r0 = 0
            r1.setText(r0)
            return
        L_0x0047:
            java.lang.Object r1 = r8.A00
            X.9D7 r1 = (X.AnonymousClass9D7) r1
            com.whatsapp.payments.ui.PaymentBottomSheet r0 = r1.A09
            r1.A7m(r0)
            return
        L_0x0051:
            java.lang.Object r1 = r8.A00
            com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity r1 = (com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r1
            X.94n r0 = r1.A03
            r0.A0D()
            X.9ca r2 = r1.A0S
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            java.lang.Integer r4 = X.C18290x4.A0a()
            java.lang.String r5 = "decline_mandate_dialogue"
            goto L_0x00a0
        L_0x0067:
            java.lang.Object r0 = r8.A00
            com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity r0 = (com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r0
            X.94n r0 = r0.A03
            r0.A0D()
            return
        L_0x0071:
            java.lang.Object r1 = r8.A00
            com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity r1 = (com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r1
            X.94n r0 = r1.A03
            r0.A0D()
            X.9ca r0 = r1.A0S
            java.lang.Integer r1 = X.AnonymousClass001.A0f()
            java.lang.Integer r2 = X.C18290x4.A0a()
            java.lang.String r3 = "approve_mandate_update_request_prompt"
            java.lang.String r4 = "payment_transaction_details"
            r5 = 1
            r0.BKC(r1, r2, r3, r4, r5)
            return
        L_0x008d:
            java.lang.Object r1 = r8.A00
            com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity r1 = (com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r1
            r1.finish()
            X.9ca r2 = r1.A0S
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            java.lang.Integer r4 = X.C18290x4.A0a()
            java.lang.String r5 = "approve_mandate_prompt"
        L_0x00a0:
            java.lang.String r6 = r1.A04
            r7 = 1
            r2.BKC(r3, r4, r5, r6, r7)
            return
        L_0x00a7:
            java.lang.Object r1 = r8.A00
            X.9DC r1 = (X.AnonymousClass9DC) r1
            r0 = 7
            r1.A01 = r0
            r0 = 0
            r1.A7E(r0)
            return
        L_0x00b3:
            java.lang.Object r0 = r8.A00
            com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity r0 = (com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity) r0
            X.94u r2 = r0.A06
            boolean r0 = r2.A02
            r1 = 0
            if (r0 != 0) goto L_0x00c4
            X.4UC r0 = r2.A00
            X.C193639Pk.A00(r0, r1)
            return
        L_0x00c4:
            r2.A02 = r1
            return
        L_0x00c7:
            java.lang.Object r1 = r8.A00
            android.app.Activity r1 = (android.app.Activity) r1
            goto L_0x00d3
        L_0x00cc:
            java.lang.Object r1 = r8.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r1.finish()
        L_0x00d3:
            r0 = 0
            r1.overridePendingTransition(r0, r0)
            return
        L_0x00d8:
            java.lang.Object r0 = r8.A00
            X.9pW r0 = (X.C204539pW) r0
            java.lang.Object r0 = r0.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1K()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204629pf.onDismiss(android.content.DialogInterface):void");
    }
}
