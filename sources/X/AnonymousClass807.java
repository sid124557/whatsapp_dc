package X;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: X.807  reason: invalid class name */
public class AnonymousClass807 implements C15860s4 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ CoordinatorLayout A02;
    public final /* synthetic */ AppBarLayout.BaseBehavior A03;
    public final /* synthetic */ AppBarLayout A04;

    public AnonymousClass807(View view, CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, int i) {
        this.A03 = baseBehavior;
        this.A02 = coordinatorLayout;
        this.A04 = appBarLayout;
        this.A01 = view;
        this.A00 = i;
    }

    public boolean Bgj(View view, AnonymousClass0KQ r9) {
        AppBarLayout.BaseBehavior baseBehavior = this.A03;
        CoordinatorLayout coordinatorLayout = this.A02;
        AppBarLayout appBarLayout = this.A04;
        View view2 = this.A01;
        int i = this.A00;
        int[] A1Z = C86664Kz.A1Z();
        // fill-array-data instruction
        A1Z[0] = 0;
        A1Z[1] = 0;
        baseBehavior.A0O(view2, coordinatorLayout, appBarLayout, A1Z, i);
        return true;
    }
}
