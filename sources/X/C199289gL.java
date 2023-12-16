package X;

import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment;

/* renamed from: X.9gL  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C199289gL implements Runnable {
    public final /* synthetic */ HybridPaymentMethodPickerFragment A00;

    public final void run() {
        WaButtonWithLoader waButtonWithLoader = this.A00.A01;
        if (waButtonWithLoader != null) {
            waButtonWithLoader.A06 = false;
            waButtonWithLoader.A00();
        }
    }

    public /* synthetic */ C199289gL(HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment) {
        this.A00 = hybridPaymentMethodPickerFragment;
    }
}
