package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.4wa  reason: invalid class name and case insensitive filesystem */
public final class C96574wa extends AnonymousClass6mM {
    public final View A00;
    public final TextView A01;

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        TextView textView;
        int i;
        C136176ly r4 = (C136176ly) obj;
        C162457s7.A0J(r4, 0);
        int i2 = r4.A00;
        if (i2 != 0) {
            textView = this.A01;
            if (i2 != 2) {
                C86634Kw.A1I(textView);
                return;
            }
            i = R.string.f11nameremoved;
        } else {
            textView = this.A01;
            i = R.string.f11nameremoved;
        }
        textView.setText(i);
    }

    public C96574wa(View view) {
        super(view);
        this.A00 = view;
        this.A01 = AnonymousClass0x2.A0I(view, R.id.header);
    }
}
