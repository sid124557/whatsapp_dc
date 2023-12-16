package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.whatsapp.R;
import com.whatsapp.payments.ui.PaymentSettingsFragment;

/* renamed from: X.9Y4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9Y4 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ PaymentSettingsFragment A03;

    public final void onScrollChanged() {
        int i;
        PaymentSettingsFragment paymentSettingsFragment = this.A03;
        View view = this.A00;
        ViewGroup viewGroup = this.A02;
        View view2 = this.A01;
        int scrollY = view.getScrollY();
        Resources A09 = C08310eF.A09(paymentSettingsFragment);
        if (scrollY <= 20) {
            int dimension = (int) (A09.getDimension(R.dimen.f6nameremoved) + 0.5f);
            viewGroup.setPadding(dimension, dimension, dimension, dimension);
            i = 0;
        } else {
            int dimension2 = (int) (A09.getDimension(R.dimen.f6nameremoved) + 0.5f);
            viewGroup.setPadding(dimension2, dimension2, dimension2, dimension2);
            i = 8;
        }
        view2.setVisibility(i);
    }

    public /* synthetic */ AnonymousClass9Y4(View view, View view2, ViewGroup viewGroup, PaymentSettingsFragment paymentSettingsFragment) {
        this.A03 = paymentSettingsFragment;
        this.A00 = view;
        this.A02 = viewGroup;
        this.A01 = view2;
    }
}
