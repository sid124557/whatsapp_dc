package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: X.0aU  reason: invalid class name and case insensitive filesystem */
public class C07200aU implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ CoordinatorLayout A00;

    public C07200aU(CoordinatorLayout coordinatorLayout) {
        this.A00 = coordinatorLayout;
    }

    public void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.A00.A03;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    public void onChildViewRemoved(View view, View view2) {
        CoordinatorLayout coordinatorLayout = this.A00;
        coordinatorLayout.A08(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.A03;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
