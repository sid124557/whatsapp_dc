package X;

import com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment;

/* renamed from: X.92S  reason: invalid class name */
public class AnonymousClass92S implements C182848p5 {
    public Object A00;
    public final int A01;

    public AnonymousClass92S(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BXq(int i) {
        C186078ui r1;
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment = (HybridPaymentMethodPickerFragment) obj;
            AnonymousClass7EL r2 = (AnonymousClass7EL) hybridPaymentMethodPickerFragment.A0O.get(i);
            if ((r2 instanceof C137286oR) && (r1 = hybridPaymentMethodPickerFragment.A0C) != null) {
                r1.BXr(((C137286oR) r2).A01);
                return;
            }
            return;
        }
        C125346Hl r12 = (C125346Hl) obj;
        int i3 = r12.A00;
        r12.A00 = i;
        r12.A06(i3);
        r12.A04.BXq(i);
    }
}
