package X;

import com.whatsapp.payments.ui.PaymentSettingsFragment;
import java.util.Iterator;

/* renamed from: X.9fj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C198939fj implements Runnable {
    public final /* synthetic */ C1906699j A00;

    public final void run() {
        Iterator A03 = C61102zi.A03(this.A00);
        while (A03.hasNext()) {
            C194939Vd r0 = ((PaymentSettingsFragment) ((C205039qK) ((C202469m4) A03.next())).A00).A0v;
            if (r0 != null) {
                r0.A03();
            }
        }
    }

    public /* synthetic */ C198939fj(C1906699j r1) {
        this.A00 = r1;
    }
}
