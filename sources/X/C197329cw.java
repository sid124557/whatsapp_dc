package X;

import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.List;

/* renamed from: X.9cw  reason: invalid class name and case insensitive filesystem */
public class C197329cw implements C203489nm {
    public final /* synthetic */ AnonymousClass3XA A00;
    public final /* synthetic */ AnonymousClass39Q A01;
    public final /* synthetic */ AnonymousClass9VG A02;
    public final /* synthetic */ ConfirmPaymentFragment A03;
    public final /* synthetic */ AnonymousClass9Bs A04;

    public C197329cw(AnonymousClass3XA r1, AnonymousClass39Q r2, AnonymousClass9VG r3, ConfirmPaymentFragment confirmPaymentFragment, AnonymousClass9Bs r5) {
        this.A04 = r5;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = confirmPaymentFragment;
    }

    public void BPe(View view, View view2, C195319Xg r9, C133676hl r10, C166587yw r11, PaymentBottomSheet paymentBottomSheet) {
        AnonymousClass9Bs r5 = this.A04;
        if (AnonymousClass9DC.A17(r5)) {
            C18270x1.A0j(C620933l.A00(r5.A0P), "pref_p2m_hybrid_last_used_payment_option", "WhatsappPay");
        }
        if (AnonymousClass9W6.A00(r11, r5.A0p)) {
            BXo(paymentBottomSheet, 0);
            return;
        }
        AnonymousClass3XA r4 = this.A00;
        if (r4 != null) {
            r5.Bp9(R.string.f11nameremoved);
            AnonymousClass9WW r3 = r5.A0W;
            r4.A04(new C204999qG(r5, new AnonymousClass9dI(this, paymentBottomSheet), r3, 3), r3.A00.A08);
            return;
        }
        r5.A7y(paymentBottomSheet);
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A1K();
        }
        r5.A80(this.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        if (r2.A0O.A0I(r2.A0D, r2.A0Z, r2.A0g) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BXo(com.whatsapp.payments.ui.PaymentBottomSheet r18, int r19) {
        /*
            r17 = this;
            r3 = r17
            X.9Bs r2 = r3.A04
            X.7yw r1 = r2.A0B
            java.lang.String r0 = r2.A0p
            boolean r6 = X.AnonymousClass9W6.A00(r1, r0)
            boolean r0 = X.AnonymousClass9DC.A17(r2)
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = r2.A0h
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0029
        L_0x001a:
            X.99n r5 = r2.A0O
            X.4uZ r4 = r2.A0D
            java.lang.String r1 = r2.A0Z
            java.lang.String r0 = r2.A0g
            boolean r0 = r5.A0I(r4, r1, r0)
            r5 = 0
            if (r0 == 0) goto L_0x002a
        L_0x0029:
            r5 = 1
        L_0x002a:
            X.39Q r4 = r3.A01
            X.9VG r0 = r3.A02
            X.303 r8 = r2.A7l(r4, r0)
            if (r5 == 0) goto L_0x003c
            X.9ca r1 = r2.A0S
            X.7yw r0 = r2.A0B
            X.303 r8 = r1.A06(r0, r8)
        L_0x003c:
            X.9ca r7 = r2.A0S
            java.lang.Integer r9 = X.AnonymousClass001.A0f()
            r0 = 84
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            if (r6 == 0) goto L_0x0074
            java.lang.String r11 = "add_credential_prompt"
        L_0x004c:
            java.lang.String r12 = r2.A0f
            r15 = 0
            boolean r16 = X.AnonymousClass9DC.A17(r2)
            java.lang.String r13 = r2.A0i
            java.lang.String r14 = r2.A0h
            r7.BKF(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r6 = r18
            if (r5 == 0) goto L_0x0077
            X.2xu r1 = new X.2xu
            r1.<init>()
            r1.A02(r4)
            X.4Fi r0 = X.AnonymousClass1S3.A05
            r1.A02 = r0
            X.39L r1 = r1.A01()
            X.7yw r0 = r2.A0B
            r2.A81(r0, r1, r6)
            return
        L_0x0074:
            java.lang.String r11 = "payment_confirm_prompt"
            goto L_0x004c
        L_0x0077:
            java.util.List r0 = r2.A0i
            com.whatsapp.payments.ui.PaymentMethodsListPickerFragment r1 = com.whatsapp.payments.ui.PaymentMethodsListPickerFragment.A00(r0)
            X.9dA r0 = new X.9dA
            r0.<init>(r2, r1)
            r1.A07 = r0
            X.9d0 r0 = new X.9d0
            r0.<init>(r2)
            r1.A04 = r0
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = r3.A03
            r1.A10(r0, r15)
            r6.A1b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197329cw.BXo(com.whatsapp.payments.ui.PaymentBottomSheet, int):void");
    }

    public void BXs(C166587yw r2, PaymentMethodRow paymentMethodRow) {
        AnonymousClass9Bs.A14(r2, this.A04);
    }

    public void BY0(int i) {
        String str;
        AnonymousClass9Bs r1 = this.A04;
        if (i == 1) {
            str = "p2p";
        } else {
            str = "p2m";
        }
        r1.A0p = str;
    }

    public void BeU(PaymentBottomSheet paymentBottomSheet) {
        AnonymousClass9Bs r4 = this.A04;
        String str = r4.A0R;
        IndiaUpiEditTransactionDescriptionFragment indiaUpiEditTransactionDescriptionFragment = new IndiaUpiEditTransactionDescriptionFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putString("arg_payment_description", str);
        indiaUpiEditTransactionDescriptionFragment.A0u(A08);
        r4.A7M(64, "payment_confirm_prompt");
        indiaUpiEditTransactionDescriptionFragment.A08 = new C204639pg(this, 0);
        paymentBottomSheet.A1b(indiaUpiEditTransactionDescriptionFragment);
    }

    public void BXz(PaymentBottomSheet paymentBottomSheet, int i) {
    }

    public void BXv(PaymentBottomSheet paymentBottomSheet, int i, int i2) {
    }

    public void BUf(PaymentBottomSheet paymentBottomSheet, List list, int i, int i2) {
    }
}
