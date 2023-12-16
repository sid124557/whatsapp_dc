package X;

import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;

/* renamed from: X.9oo  reason: invalid class name and case insensitive filesystem */
public class C204099oo implements AnonymousClass49C {
    public Object A00;
    public final int A01;

    public C204099oo(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BaR(boolean z) {
        if (this.A01 != 0) {
            IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = (IndiaUpiSendPaymentActivity) this.A00;
            if (z) {
                indiaUpiSendPaymentActivity.A8K();
            } else {
                C621433s.A01(indiaUpiSendPaymentActivity, 22);
            }
        } else {
            C202979mv r0 = (C202979mv) this.A00;
            if (z) {
                r0.onSuccess();
            } else {
                r0.BSk();
            }
        }
    }
}
