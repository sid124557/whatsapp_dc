package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.4wZ  reason: invalid class name and case insensitive filesystem */
public class C96564wZ extends AnonymousClass6mM {
    public final WaTextView A00;
    public final WaTextView A01;

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        WaTextView waTextView;
        int i;
        C136016li r5 = (C136016li) obj;
        int i2 = r5.A00;
        if (i2 != 0) {
            WaTextView waTextView2 = this.A00;
            if (i2 != 1) {
                waTextView2.setText(R.string.f11nameremoved);
                waTextView = this.A01;
                waTextView.setVisibility(0);
                waTextView.setText(R.string.f11nameremoved);
                i = 18;
            } else {
                waTextView2.setText(R.string.f11nameremoved);
                waTextView = this.A01;
                waTextView.setVisibility(0);
                waTextView.setText(R.string.f11nameremoved);
                i = 17;
            }
            C18300x5.A18(waTextView, r5, i);
            return;
        }
        this.A00.setText(R.string.f11nameremoved);
        this.A01.setVisibility(8);
    }

    public C96564wZ(View view) {
        super(view);
        this.A00 = AnonymousClass0x7.A0L(view, R.id.error_message);
        this.A01 = AnonymousClass0x7.A0L(view, R.id.load_categories_btn);
    }
}
