package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.payments.ui.widget.PaymentInteropShimmerRow;

/* renamed from: X.94P  reason: invalid class name */
public abstract class AnonymousClass94P extends LinearLayout implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public void A00() {
        if (!this.A01) {
            this.A01 = true;
            PaymentInteropShimmerRow paymentInteropShimmerRow = (PaymentInteropShimmerRow) this;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            paymentInteropShimmerRow.A03 = C1899593h.A0I(r1);
            paymentInteropShimmerRow.A04 = (C196419ao) r1.A00.A8e.get();
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass94P(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public AnonymousClass94P(Context context) {
        super(context);
        A00();
    }

    public AnonymousClass94P(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
