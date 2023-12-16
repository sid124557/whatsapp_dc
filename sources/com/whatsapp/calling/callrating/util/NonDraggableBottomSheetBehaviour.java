package com.whatsapp.calling.callrating.util;

import X.C162457s7;
import X.C18260x0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.bottomsheet.LockableBottomSheetBehavior;

public final class NonDraggableBottomSheetBehaviour extends LockableBottomSheetBehavior {
    public void A0A(View view, View view2, CoordinatorLayout coordinatorLayout, int i) {
        C162457s7.A0J(coordinatorLayout, 0);
        C18260x0.A0Q(view, view2);
        if (this.A00) {
            super.A0A(view, view2, coordinatorLayout, i);
        }
    }

    public void A0B(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3) {
        C162457s7.A0J(coordinatorLayout, 0);
        C18260x0.A0Q(view, view2);
        C162457s7.A0J(iArr, 5);
        if (this.A00) {
            super.A0B(view, view2, coordinatorLayout, iArr, i, i2, i3);
        }
    }

    public boolean A0E(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        C162457s7.A0J(coordinatorLayout, 0);
        C18260x0.A0Q(view, motionEvent);
        if (!this.A00 || !super.A0E(motionEvent, view, coordinatorLayout)) {
            return false;
        }
        return true;
    }

    public boolean A0F(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        C162457s7.A0J(coordinatorLayout, 0);
        C18260x0.A0Q(view, motionEvent);
        if (!this.A00 || !super.A0F(motionEvent, view, coordinatorLayout)) {
            return false;
        }
        return true;
    }

    public boolean A0H(View view, View view2, CoordinatorLayout coordinatorLayout, float f, float f2) {
        C162457s7.A0J(view2, 2);
        if (!this.A00 || !super.A0H(view, view2, coordinatorLayout, f, f2)) {
            return false;
        }
        return true;
    }

    public NonDraggableBottomSheetBehaviour(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NonDraggableBottomSheetBehaviour() {
        super((Context) null, (AttributeSet) null);
    }
}
