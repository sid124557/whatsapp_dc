package X;

import androidx.fragment.app.DialogFragment;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment;

/* renamed from: X.9py  reason: invalid class name and case insensitive filesystem */
public class C204819py implements C202759mX {
    public Object A00;
    public Object A01;
    public final int A02;

    public C204819py(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BS6(AnonymousClass34V r4) {
        AnonymousClass9Ct r1;
        switch (this.A02) {
            case 0:
                r1 = (AnonymousClass9Ct) this.A00;
                ((DialogFragment) this.A01).A1K();
                break;
            case 1:
                AnonymousClass9Ct r2 = (AnonymousClass9Ct) this.A00;
                WaButtonWithLoader waButtonWithLoader = ((HybridPaymentMethodPickerFragment) this.A01).A01;
                if (waButtonWithLoader != null) {
                    waButtonWithLoader.A06 = false;
                    waButtonWithLoader.A00();
                }
                r2.Bou(r2.A8T(r4));
                return;
            default:
                r1 = (AnonymousClass9Ct) this.A00;
                if (this.A01 == null) {
                    r1.A8R(false);
                    break;
                }
                break;
        }
        r1.Bou(r1.A8T(r4));
    }
}
