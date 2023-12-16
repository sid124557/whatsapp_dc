package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.9Xu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C195439Xu implements View.OnClickListener {
    public final /* synthetic */ PaymentView A00;
    public final /* synthetic */ boolean A01;

    public final void onClick(View view) {
        PaymentView paymentView = this.A00;
        boolean z = this.A01;
        C69263Wi r1 = paymentView.A0U;
        int i = R.string.f11nameremoved;
        if (z) {
            i = R.string.f11nameremoved;
        }
        r1.A0E(i);
    }

    public /* synthetic */ C195439Xu(PaymentView paymentView, boolean z) {
        this.A00 = paymentView;
        this.A01 = z;
    }
}
