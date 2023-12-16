package X;

import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.4wS  reason: invalid class name and case insensitive filesystem */
public class C96494wS extends AnonymousClass6mM {
    public final WaTextView A00;

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        C96324wB r5 = (C96324wB) obj;
        String str = r5.A01;
        boolean isEmpty = TextUtils.isEmpty(str);
        WaTextView waTextView = this.A00;
        if (!isEmpty) {
            waTextView.setText(C86604Kt.A0m(C86664Kz.A0T(this), str, R.string.f11nameremoved));
        } else {
            waTextView.setText(R.string.f11nameremoved);
        }
        this.A0H.setOnClickListener(r5.A00);
    }

    public C96494wS(View view) {
        super(view);
        this.A00 = AnonymousClass0x7.A0L(view, R.id.title);
        C18300x5.A0G(view, R.id.description).setText(R.string.f11nameremoved);
    }
}
