package X;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.03M  reason: invalid class name */
public class AnonymousClass03M extends FrameLayout implements C16450tQ {
    public final CollapsibleActionView A00;

    public View getWrappedView() {
        return (View) this.A00;
    }

    public void onActionViewCollapsed() {
        this.A00.onActionViewCollapsed();
    }

    public void onActionViewExpanded() {
        this.A00.onActionViewExpanded();
    }

    public AnonymousClass03M(View view) {
        super(view.getContext());
        this.A00 = (CollapsibleActionView) view;
        addView(view);
    }
}
