package com.whatsapp.camera.bottomsheet;

import X.AnonymousClass5UD;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.camera.CameraBottomSheetBehavior;

public class CameraBottomSheetController$5 extends CameraBottomSheetBehavior {
    public boolean A00;
    public final /* synthetic */ AnonymousClass5UD A01;

    public boolean A0I(View view, CoordinatorLayout coordinatorLayout, int i) {
        this.A00 = true;
        return super.A0I(view, coordinatorLayout, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraBottomSheetController$5(View view, AnonymousClass5UD r2) {
        super(view);
        this.A01 = r2;
    }

    public boolean A0E(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (!this.A00 || !super.A0E(motionEvent, view, coordinatorLayout)) {
            return false;
        }
        if (motionEvent.getPointerCount() < 2 || motionEvent.getY() > ((float) this.A01.A08.getTop())) {
            return true;
        }
        return false;
    }

    public boolean A0F(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (!this.A00 || !super.A0F(motionEvent, view, coordinatorLayout)) {
            return false;
        }
        return true;
    }
}
