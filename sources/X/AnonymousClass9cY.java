package X;

import com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment;
import java.util.HashMap;

/* renamed from: X.9cY  reason: invalid class name */
public class AnonymousClass9cY implements C203109n8 {
    public final /* synthetic */ C52792m3 A00;
    public final /* synthetic */ AnonymousClass9Bw A01;

    public AnonymousClass9cY(C52792m3 r1, AnonymousClass9Bw r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BS6(AnonymousClass34V r4) {
        int i = r4.A00;
        if (i == 10756) {
            this.A00.A00("on_failure");
        } else if (i == 10755) {
            this.A01.Boo(PaymentsUnavailableDialogFragment.A00());
        } else {
            HashMap A0t = AnonymousClass001.A0t();
            C1899693i.A0v(A0t, i);
            this.A00.A01("on_exception", A0t);
        }
    }

    public void BWr(boolean z) {
        this.A00.A00("on_success");
    }
}
