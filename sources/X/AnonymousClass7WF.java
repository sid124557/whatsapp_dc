package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: X.7WF  reason: invalid class name */
public final class AnonymousClass7WF {
    public int A00 = 0;
    public boolean A01 = false;
    public final View A02;

    public void A01(Bundle bundle) {
        this.A01 = bundle.getBoolean("expanded", false);
        this.A00 = bundle.getInt("expandedComponentIdHint", 0);
        if (this.A01) {
            View view = this.A02;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).A0A(view);
            }
        }
    }

    public AnonymousClass7WF(C178828iA r2) {
        this.A02 = (View) r2;
    }

    public Bundle A00() {
        Bundle A08 = AnonymousClass002.A08();
        A08.putBoolean("expanded", this.A01);
        A08.putInt("expandedComponentIdHint", this.A00);
        return A08;
    }
}
