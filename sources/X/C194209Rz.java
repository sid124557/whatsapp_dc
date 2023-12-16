package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.9Rz  reason: invalid class name and case insensitive filesystem */
public class C194209Rz {
    public IndiaUpiSendPaymentToVpaFragment A00;
    public PaymentBottomSheet A01;
    public final Activity A02;
    public final Context A03;
    public final AnonymousClass4FU A04;
    public final C195909Zz A05;
    public final C193999Re A06;
    public final String A07;
    public final boolean A08;

    public void A00(PaymentBottomSheet paymentBottomSheet) {
        IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment = this.A00;
        if (indiaUpiSendPaymentToVpaFragment == null) {
            String str = this.A07;
            Bundle A082 = AnonymousClass002.A08();
            A082.putParcelable("extra_payment_handle", (Parcelable) null);
            A082.putString("extra_referral_screen", str);
            indiaUpiSendPaymentToVpaFragment = new IndiaUpiSendPaymentToVpaFragment();
            indiaUpiSendPaymentToVpaFragment.A0u(A082);
            this.A00 = indiaUpiSendPaymentToVpaFragment;
        }
        indiaUpiSendPaymentToVpaFragment.A0J = this;
        if (paymentBottomSheet != null) {
            this.A01 = paymentBottomSheet;
            paymentBottomSheet.A1b(indiaUpiSendPaymentToVpaFragment);
            return;
        }
        PaymentBottomSheet paymentBottomSheet2 = new PaymentBottomSheet();
        this.A01 = paymentBottomSheet2;
        paymentBottomSheet2.A02 = this.A00;
        this.A04.Boo(paymentBottomSheet2);
    }

    public C194209Rz(Activity activity, AnonymousClass4FU r2, C195909Zz r3, C193999Re r4, String str, boolean z) {
        this.A02 = activity;
        this.A03 = activity;
        this.A07 = str;
        this.A04 = r2;
        this.A06 = r4;
        this.A05 = r3;
        this.A08 = z;
    }
}
