package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.9q9  reason: invalid class name and case insensitive filesystem */
public class C204929q9 implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public final int A01;

    public C204929q9(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onGlobalLayout() {
        switch (this.A01) {
            case 0:
                AnonymousClass4Rn r4 = (AnonymousClass4Rn) this.A00;
                View view = (View) r4.A05;
                view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                if (!r4.isShowing()) {
                    r4.showAtLocation(view, 48, 0, 1000000);
                    return;
                }
                return;
            case 1:
                AnonymousClass97C r42 = (AnonymousClass97C) this.A00;
                View view2 = (View) r42.A05;
                view2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (!r42.isShowing()) {
                    r42.showAtLocation(view2, 48, 0, 1000000);
                    C196409an r2 = r42.A0I;
                    r2.A03.setVisibility(8);
                    View view3 = r2.A02;
                    if (view3 != null) {
                        view3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                PaymentView paymentView = (PaymentView) this.A00;
                paymentView.A0y.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                paymentView.A14.A01(1);
                return;
        }
    }
}
