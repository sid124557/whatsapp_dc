package X;

import android.text.TextUtils;
import android.view.View;
import com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView;
import com.whatsapp.payments.ui.widget.PaymentAmountInputField;

/* renamed from: X.9pA  reason: invalid class name and case insensitive filesystem */
public class C204319pA implements View.OnFocusChangeListener {
    public Object A00;
    public final int A01;

    public C204319pA(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onFocusChange(View view, boolean z) {
        switch (this.A01) {
            case 0:
                C1905197d r0 = (C1905197d) this.A00;
                if (z) {
                    AnonymousClass94s r1 = r0.A07;
                    C203499no r2 = r1.A07;
                    Integer A0f = AnonymousClass001.A0f();
                    String A0E = r1.A0E();
                    AnonymousClass303 A0K = C1899593h.A0K();
                    A0K.A03("product_flow", "p2m");
                    r2.BKE(A0K, A0f, 116, A0E, (String) null);
                    return;
                }
                return;
            case 1:
                IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView = (IndiaUpiDisplaySecureQrCodeView) this.A00;
                if (z && !TextUtils.isEmpty(indiaUpiDisplaySecureQrCodeView.A0F.getText())) {
                    PaymentAmountInputField paymentAmountInputField = indiaUpiDisplaySecureQrCodeView.A0F;
                    paymentAmountInputField.setSelection(paymentAmountInputField.getText().length());
                    return;
                }
                return;
            default:
                View.OnFocusChangeListener onFocusChangeListener = ((C196409an) this.A00).A00;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(view, z);
                    return;
                }
                return;
        }
    }
}
