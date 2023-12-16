package com.whatsapp.camera;

import X.AnonymousClass6C8;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class CameraBottomSheetBehavior extends BottomSheetBehavior {
    public boolean A00 = true;
    public final View A01;

    public void A0A(View view, View view2, CoordinatorLayout coordinatorLayout, int i) {
        if (this.A0O != 4) {
            super.A0A(view, view2, coordinatorLayout, i);
        }
    }

    public boolean A0E(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (!AnonymousClass6C8.A1R(motionEvent, this.A01, coordinatorLayout) || !this.A00) {
            return false;
        }
        return super.A0E(motionEvent, view, coordinatorLayout);
    }

    public CameraBottomSheetBehavior(View view) {
        this.A01 = view;
    }
}
