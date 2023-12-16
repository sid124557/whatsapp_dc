package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.4wW  reason: invalid class name and case insensitive filesystem */
public class C96534wW extends AnonymousClass6mM {
    public final WaTextView A00;
    public final WaTextView A01;

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        C135976le r4 = (C135976le) obj;
        int i = r4.A00;
        if (i != 1) {
            int i2 = R.string.f11nameremoved;
            if (i != 2) {
                i2 = R.string.f11nameremoved;
            }
            this.A01.setText(i2);
            WaTextView waTextView = this.A00;
            waTextView.setText(R.string.f11nameremoved);
            waTextView.setVisibility(0);
            C626936e.A06(r4.A01);
            C18290x4.A1H(waTextView, r4, 20);
            return;
        }
        this.A01.setText(R.string.f11nameremoved);
        this.A00.setVisibility(8);
    }

    public C96534wW(View view) {
        super(view);
        this.A01 = AnonymousClass0x7.A0L(view, R.id.error_message);
        this.A00 = AnonymousClass0x7.A0L(view, R.id.action_button);
    }
}
