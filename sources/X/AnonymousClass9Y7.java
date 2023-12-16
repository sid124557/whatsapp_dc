package X;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;

/* renamed from: X.9Y7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9Y7 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ListView A01;
    public final /* synthetic */ PaymentMethodsListPickerFragment A02;

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        PaymentMethodsListPickerFragment paymentMethodsListPickerFragment = this.A02;
        ListView listView = this.A01;
        View view2 = this.A00;
        if (view2 == null || i != listView.getPositionForView(view2)) {
            C08310eF A0P = paymentMethodsListPickerFragment.A0P(true);
            PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) paymentMethodsListPickerFragment.A0E;
            C166587yw A0D = C1899693i.A0D(paymentMethodsListPickerFragment.A06.A00, i - listView.getHeaderViewsCount());
            C203509nr r0 = paymentMethodsListPickerFragment.A07;
            if (r0 != null && !r0.BoB(A0D)) {
                if (A0P instanceof C202729mU) {
                    ((C202729mU) A0P).BXr(A0D);
                    if (paymentBottomSheet != null) {
                        paymentBottomSheet.A1b(A0P);
                        return;
                    }
                    return;
                }
                C202729mU r02 = paymentMethodsListPickerFragment.A04;
                if (r02 != null) {
                    r02.BXr(A0D);
                    if (paymentBottomSheet != null) {
                        paymentBottomSheet.A1Y();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C203509nr r03 = paymentMethodsListPickerFragment.A07;
        if (r03 != null) {
            r03.BM8();
        }
    }

    public /* synthetic */ AnonymousClass9Y7(View view, ListView listView, PaymentMethodsListPickerFragment paymentMethodsListPickerFragment) {
        this.A02 = paymentMethodsListPickerFragment;
        this.A01 = listView;
        this.A00 = view;
    }
}
