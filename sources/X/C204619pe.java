package X;

import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.9pe  reason: invalid class name and case insensitive filesystem */
public class C204619pe implements DialogInterface.OnDismissListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C204619pe(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        DialogFragment dialogFragment;
        int i = this.A02;
        Object obj = this.A00;
        switch (i) {
            case 0:
                dialogFragment = (DialogFragment) this.A01;
                BrazilPaymentActivity brazilPaymentActivity = ((C196999cI) obj).A05;
                brazilPaymentActivity.A01 = 7;
                brazilPaymentActivity.A7E((String) null);
                break;
            case 1:
                dialogFragment = (DialogFragment) this.A01;
                PaymentView paymentView = ((C196999cI) obj).A05.A0W;
                if (paymentView != null) {
                    paymentView.A0y.setText((CharSequence) null);
                    break;
                }
                break;
            case 2:
                FingerprintBottomSheet fingerprintBottomSheet = (FingerprintBottomSheet) this.A01;
                C67993Rl A012 = ((C196999cI) obj).A05.A0J.A01.A01("FB", "PIN");
                boolean A16 = fingerprintBottomSheet.A16();
                if (A012 != null) {
                    if (A16) {
                        fingerprintBottomSheet.A1S();
                        return;
                    }
                    return;
                } else if (A16) {
                    fingerprintBottomSheet.A1L();
                    return;
                } else {
                    return;
                }
            case 3:
                dialogFragment = (DialogFragment) this.A01;
                BrazilPaymentActivity brazilPaymentActivity2 = ((C196989cH) obj).A00.A05;
                brazilPaymentActivity2.A01 = 7;
                brazilPaymentActivity2.A7E((String) null);
                break;
            default:
                dialogFragment = (DialogFragment) this.A01;
                PaymentView paymentView2 = ((C196989cH) obj).A00.A05.A0W;
                if (paymentView2 != null) {
                    paymentView2.A0y.setText((CharSequence) null);
                    break;
                }
                break;
        }
        if (!dialogFragment.A16()) {
            return;
        }
        dialogFragment.A1L();
    }
}
