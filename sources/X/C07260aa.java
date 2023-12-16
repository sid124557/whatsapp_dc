package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: X.0aa  reason: invalid class name and case insensitive filesystem */
public class C07260aa implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ C002302s A00;

    public C07260aa(C002302s r1) {
        this.A00 = r1;
    }

    public boolean onPreDraw() {
        View view;
        C002302s r2 = this.A00;
        AnonymousClass0YY.A05(r2);
        ViewGroup viewGroup = r2.A03;
        if (viewGroup == null || (view = r2.A02) == null) {
            return true;
        }
        viewGroup.endViewTransition(view);
        AnonymousClass0YY.A05(r2.A03);
        r2.A03 = null;
        r2.A02 = null;
        return true;
    }
}
