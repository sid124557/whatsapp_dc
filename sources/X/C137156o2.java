package X;

import android.view.View;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.6o2  reason: invalid class name and case insensitive filesystem */
public final class C137156o2 extends C137106nx {
    public final C182848p5 A00;
    public final PaymentMethodRow A01;

    public static final void A00(C137156o2 r2) {
        r2.A01.setRadioButtonChecked(true);
        r2.A00.BXq(r2.A01());
    }

    public C137156o2(View view, C182848p5 r4) {
        super(view);
        this.A00 = r4;
        PaymentMethodRow paymentMethodRow = new PaymentMethodRow(view.getContext());
        this.A01 = paymentMethodRow;
        this.A00.addView(paymentMethodRow);
    }
}
