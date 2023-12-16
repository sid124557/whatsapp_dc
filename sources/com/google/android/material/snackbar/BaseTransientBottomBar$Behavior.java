package com.google.android.material.snackbar;

import X.AnonymousClass6C8;
import X.AnonymousClass7BY;
import X.C158937ko;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior {
    public final AnonymousClass7BY A00 = new AnonymousClass7BY(this);

    public boolean A0E(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        AnonymousClass7BY r2 = this.A00;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                C158937ko.A00().A03(r2.A00);
            }
        } else if (AnonymousClass6C8.A1R(motionEvent, view, coordinatorLayout)) {
            C158937ko.A00().A02(r2.A00);
        }
        return super.A0E(motionEvent, view, coordinatorLayout);
    }
}
