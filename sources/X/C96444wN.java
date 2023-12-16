package X;

import android.view.View;
import com.whatsapp.R;

/* renamed from: X.4wN  reason: invalid class name and case insensitive filesystem */
public class C96444wN extends AnonymousClass6mM {
    public /* bridge */ /* synthetic */ void A09(Object obj) {
        View view = this.A0H;
        View A02 = C06560Yg.A02(view, R.id.progress_bar);
        int dimensionPixelSize = C18290x4.A0G(view).getDimensionPixelSize(R.dimen.f6nameremoved);
        if (((C136146lv) obj).A00 == 1) {
            dimensionPixelSize = C18290x4.A0G(view).getDimensionPixelSize(R.dimen.f6nameremoved);
        }
        A02.getLayoutParams().width = dimensionPixelSize;
        C86624Kv.A0w(A02, dimensionPixelSize);
    }

    public C96444wN(View view) {
        super(view);
    }
}
