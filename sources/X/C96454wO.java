package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.4wO  reason: invalid class name and case insensitive filesystem */
public class C96454wO extends AnonymousClass6mM {
    public /* bridge */ /* synthetic */ void A09(Object obj) {
        View view = this.A0H;
        TextView textView = (TextView) view;
        String str = ((C136166lx) obj).A00;
        if (TextUtils.isEmpty(str)) {
            textView.setText(R.string.f11nameremoved);
        } else {
            textView.setText(C86604Kt.A0m(view.getContext(), str, R.string.f11nameremoved));
        }
    }

    public C96454wO(View view) {
        super(view);
    }
}
