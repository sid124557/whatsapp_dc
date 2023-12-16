package X;

import android.graphics.Color;
import android.view.Window;

/* renamed from: X.5CQ  reason: invalid class name */
public final class AnonymousClass5CQ {
    public static final void A00(Window window, int i, boolean z) {
        C162457s7.A0J(window, 0);
        if (C107385bE.A02() || Color.alpha(i) != 255 || !AnonymousClass5Yj.A0D(i)) {
            window.setStatusBarColor(i);
            if (z && Color.alpha(i) == 255) {
                C107405bG.A0C(window, AnonymousClass5Yj.A0D(i));
                return;
            }
            return;
        }
        window.setStatusBarColor(-16777216);
    }
}
