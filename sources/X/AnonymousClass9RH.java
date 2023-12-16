package X;

import com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment;

/* renamed from: X.9RH  reason: invalid class name */
public class AnonymousClass9RH {
    public final AnonymousClass9NH A00;
    public final C160757oG A01 = C160757oG.A00("PaymentsDobManager", "infra", "COMMON");
    public final C106675Zy A02;

    public boolean A00(C89654ea r4, AnonymousClass34V r5) {
        C1899593h.A1H(this.A01, r5, "maybeHandleUnderageError: ", AnonymousClass001.A0o());
        if (r5.A00 != 2896001) {
            return false;
        }
        r4.Boo(PaymentsUnavailableDialogFragment.A01());
        return true;
    }

    public AnonymousClass9RH(AnonymousClass9NH r4, C106675Zy r5) {
        this.A02 = r5;
        this.A00 = r4;
    }
}
