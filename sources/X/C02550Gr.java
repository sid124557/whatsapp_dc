package X;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* renamed from: X.0Gr  reason: invalid class name and case insensitive filesystem */
public class C02550Gr {
    public static void A00(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        C07140aO r0 = C07140aO.A0A;
        if (r0 != null && r0.A05 == view) {
            C07140aO.A00((C07140aO) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C07140aO r1 = C07140aO.A09;
            if (r1 != null && r1.A05 == view) {
                r1.A01();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new C07140aO(view, charSequence);
    }
}
