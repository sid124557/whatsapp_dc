package X;

import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity;

/* renamed from: X.9om  reason: invalid class name and case insensitive filesystem */
public class C204079om implements AnonymousClass49C {
    public Object A00;
    public Object A01;
    public final int A02;

    public C204079om(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BaR(boolean z) {
        switch (this.A02) {
            case 0:
                C194209Rz r5 = (C194209Rz) this.A00;
                C166557yt r3 = (C166557yt) this.A01;
                if (z) {
                    String str = r5.A07;
                    Bundle A08 = AnonymousClass002.A08();
                    A08.putParcelable("extra_payment_handle", r3);
                    A08.putString("extra_referral_screen", str);
                    IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment = new IndiaUpiSendPaymentToVpaFragment();
                    indiaUpiSendPaymentToVpaFragment.A0u(A08);
                    r5.A00 = indiaUpiSendPaymentToVpaFragment;
                    r5.A00((PaymentBottomSheet) null);
                    return;
                }
                AnonymousClass4FU r4 = r5.A04;
                Object[] A0L = AnonymousClass002.A0L();
                A0L[0] = r5.A03.getString(R.string.f11nameremoved);
                r4.Box(A0L, 0, R.string.f11nameremoved);
                return;
            case 1:
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = (IndiaUpiSendPaymentActivity) this.A00;
                Runnable runnable = (Runnable) this.A01;
                if (z) {
                    runnable.run();
                    return;
                } else if (indiaUpiSendPaymentActivity.A0L) {
                    indiaUpiSendPaymentActivity.A00 = 3;
                    indiaUpiSendPaymentActivity.A8H();
                    return;
                } else {
                    C621433s.A01(indiaUpiSendPaymentActivity, 22);
                    return;
                }
            default:
                AnonymousClass94y r42 = ((PaymentTransactionDetailsListActivity) this.A00).A0P;
                String str2 = ((AnonymousClass9QJ) this.A01).A0F;
                AnonymousClass9QJ A002 = AnonymousClass9QJ.A00(8);
                Context context = r42.A0O.A00;
                int i = R.string.f11nameremoved;
                if (z) {
                    i = R.string.f11nameremoved;
                }
                A002.A0C = C86604Kt.A0m(context, str2, i);
                AnonymousClass94y.A00(r42, A002);
                return;
        }
    }
}
