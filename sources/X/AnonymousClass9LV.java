package X;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;

/* renamed from: X.9LV  reason: invalid class name */
public class AnonymousClass9LV {
    public static void A00(C89704el r5, int i) {
        Toolbar A07 = C1899593h.A07(r5);
        r5.setSupportActionBar(A07);
        AnonymousClass0R8 supportActionBar = r5.getSupportActionBar();
        if (supportActionBar != null) {
            C1899593h.A0h(r5);
            r5.getWindow().setStatusBarColor(AnonymousClass0Y8.A04(r5, R.color.f5nameremoved));
            C86604Kt.A0z(r5, A07, AnonymousClass5Yj.A01(r5));
            supportActionBar.A0E(AnonymousClass0RP.A00(r5, i));
            supportActionBar.A0Q(false);
            supportActionBar.A0N(true);
            A07.setOverflowIcon(C107335b8.A0B(AnonymousClass0RP.A00(r5, R.drawable.vec_ic_more), AnonymousClass0Y8.A04(r5, R.color.f5nameremoved)));
            View findViewById = r5.findViewById(R.id.scroll_view);
            if (findViewById != null) {
                findViewById.getViewTreeObserver().addOnScrollChangedListener(new C204419pK(findViewById, supportActionBar, r5, 0));
            }
        }
    }
}
