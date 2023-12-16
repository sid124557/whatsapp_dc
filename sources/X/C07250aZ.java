package X;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: X.0aZ  reason: invalid class name and case insensitive filesystem */
public class C07250aZ implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout A00;

    public C07250aZ(CoordinatorLayout coordinatorLayout) {
        this.A00 = coordinatorLayout;
    }

    public boolean onPreDraw() {
        this.A00.A08(0);
        return true;
    }
}
