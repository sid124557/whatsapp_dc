package com.whatsapp.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class LockableBottomSheetBehavior extends BottomSheetBehavior {
    public boolean A00 = true;

    public void A0A(View view, View view2, CoordinatorLayout coordinatorLayout, int i) {
        if (this.A00) {
            super.A0A(view, view2, coordinatorLayout, i);
        }
    }

    public void A0B(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3) {
        if (this.A00) {
            super.A0B(view, view2, coordinatorLayout, iArr, i, i2, i3);
        }
    }

    public boolean A0E(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (!this.A00) {
            return false;
        }
        return super.A0E(motionEvent, view, coordinatorLayout);
    }

    public boolean A0F(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (!this.A00) {
            return false;
        }
        return super.A0F(motionEvent, view, coordinatorLayout);
    }

    public boolean A0H(View view, View view2, CoordinatorLayout coordinatorLayout, float f, float f2) {
        if (!this.A00) {
            return false;
        }
        return super.A0H(view, view2, coordinatorLayout, f, f2);
    }

    public LockableBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LockableBottomSheetBehavior() {
    }
}
