package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.whatsapp.R;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.List;

/* renamed from: X.948  reason: invalid class name */
public class AnonymousClass948 extends ArrayAdapter {
    public List A00 = AnonymousClass001.A0s();
    public final C158777kX A01;
    public final C203739oE A02;

    public int getCount() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        PaymentMethodRow paymentMethodRow;
        if (view == null) {
            paymentMethodRow = new PaymentMethodRow(getContext());
        } else {
            paymentMethodRow = (PaymentMethodRow) view;
        }
        C166587yw A0D = C1899693i.A0D(this.A00, i);
        if (A0D != null) {
            this.A01.A03(A0D, this.A02, paymentMethodRow);
        }
        return paymentMethodRow;
    }

    public AnonymousClass948(Context context, C158777kX r4, C203739oE r5) {
        super(context, R.layout.f8nameremoved, AnonymousClass001.A0s());
        this.A01 = r4;
        this.A02 = r5;
    }

    public int getViewTypeCount() {
        return 1;
    }
}
