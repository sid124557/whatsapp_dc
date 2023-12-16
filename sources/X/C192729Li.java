package X;

import androidx.fragment.app.DialogFragment;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;

/* renamed from: X.9Li  reason: invalid class name and case insensitive filesystem */
public class C192729Li implements C182858p6 {
    public Object A00;
    public Object A01;
    public final int A02;

    public C192729Li(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void BQ6(boolean z) {
        AnonymousClass9Bs r1;
        String str;
        String str2;
        int i = this.A02;
        Object obj = this.A00;
        switch (i) {
            case 0:
                r1 = (AnonymousClass9Bs) obj;
                ((DialogFragment) this.A01).A1K();
                break;
            case 1:
                ((DialogFragment) this.A01).A1K();
                r1 = ((C197439dA) obj).A00;
                break;
            default:
                ((DialogFragment) this.A01).A1K();
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = ((AnonymousClass9dS) obj).A00;
                if (z) {
                    str2 = "CREDIT";
                } else {
                    str2 = null;
                }
                indiaUpiSendPaymentActivity.A7x(indiaUpiSendPaymentActivity, str2, true);
                return;
        }
        if (z) {
            str = "CREDIT";
        } else {
            str = null;
        }
        r1.A8B(str);
    }
}
