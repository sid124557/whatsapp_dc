package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity;
import com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView;
import com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel;

/* renamed from: X.9oh  reason: invalid class name and case insensitive filesystem */
public class C204029oh implements TextView.OnEditorActionListener {
    public Object A00;
    public final int A01;

    public C204029oh(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView = (IndiaUpiDisplaySecureQrCodeView) obj;
            if (i != 6) {
                return false;
            }
            IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel = indiaUpiDisplaySecureQrCodeView.A0G;
            indiaUpiSecureQrCodeViewModel.A02.A0H(C18290x4.A0m(indiaUpiDisplaySecureQrCodeView.A0F));
            return true;
        }
        IndiaUpiDebitCardVerificationActivity indiaUpiDebitCardVerificationActivity = (IndiaUpiDebitCardVerificationActivity) obj;
        if (i != 6) {
            return false;
        }
        indiaUpiDebitCardVerificationActivity.A7q();
        return true;
    }
}
