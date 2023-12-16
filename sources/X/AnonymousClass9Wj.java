package X;

import androidx.fragment.app.DialogFragment;
import com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Wj  reason: invalid class name */
public class AnonymousClass9Wj implements C202439m1 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass9Wj(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public final void BMJ(List list) {
        int i = this.A03;
        Object obj = this.A00;
        switch (i) {
            case 0:
                ((AnonymousClass9A3) obj).A0G.A00((C133736hr) this.A01, (AnonymousClass34V) null, (ArrayList) this.A02, false, false);
                return;
            case 1:
                ((AnonymousClass9A0) obj).A09.A00((C133736hr) this.A01, (AnonymousClass34V) null, (ArrayList) this.A02, false);
                return;
            default:
                DialogFragment dialogFragment = (DialogFragment) this.A02;
                BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = (BrazilConfirmReceivePaymentFragment) ((C204949qB) obj).A00;
                brazilConfirmReceivePaymentFragment.A00.A0D();
                brazilConfirmReceivePaymentFragment.A0m(brazilConfirmReceivePaymentFragment.A0G.A00(brazilConfirmReceivePaymentFragment.A0Q(), (C133736hr) this.A01));
                if (dialogFragment != null) {
                    dialogFragment.A1K();
                    return;
                }
                return;
        }
    }
}
