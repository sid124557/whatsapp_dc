package X;

import com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.92Y  reason: invalid class name */
public class AnonymousClass92Y implements C84134Bd {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass92Y(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void AwB(Object obj) {
        if (this.A02 != 0) {
            HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment = (HybridPaymentMethodPickerFragment) this.A01;
            List list = (List) obj;
            C162457s7.A0J(list, 2);
            hybridPaymentMethodPickerFragment.A0K = list;
            if (hybridPaymentMethodPickerFragment.A04 == null && C18310x6.A1X(list)) {
                hybridPaymentMethodPickerFragment.A04 = (C166587yw) C18290x4.A0k(list);
            }
            C125346Hl r2 = hybridPaymentMethodPickerFragment.A0A;
            if (r2 == null) {
                throw C18270x1.A0S("methodListAdapter");
            }
            r2.A0L(hybridPaymentMethodPickerFragment.A1I());
            C125346Hl r0 = hybridPaymentMethodPickerFragment.A0A;
            if (r0 == null) {
                throw C18270x1.A0S("methodListAdapter");
            }
            r0.A05();
            return;
        }
        ((AtomicInteger) obj).addAndGet(((AnonymousClass30M) this.A01).A02.size());
    }
}
