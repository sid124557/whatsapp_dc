package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.6nz  reason: invalid class name and case insensitive filesystem */
public final class C137126nz extends C125686Iz {
    public final View A00;
    public final C620733j A01;
    public final AnonymousClass9U4 A02;
    public final C182848p5 A03;
    public final C158777kX A04;
    public final PaymentMethodRow A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137126nz(View view, C620733j r3, AnonymousClass9U4 r4, C182848p5 r5, C158777kX r6) {
        super(view);
        C162457s7.A0J(view, 1);
        this.A00 = view;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
        this.A05 = (PaymentMethodRow) C18290x4.A0M(view, R.id.payment_method_row);
    }

    public static final void A00(C137126nz r2) {
        r2.A05.setRadioButtonChecked(true);
        r2.A03.BXq(r2.A01());
    }
}
