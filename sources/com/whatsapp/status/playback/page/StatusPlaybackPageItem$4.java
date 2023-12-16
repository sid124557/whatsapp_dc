package com.whatsapp.status.playback.page;

import X.AnonymousClass51x;
import X.C06560Yg;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class StatusPlaybackPageItem$4 extends BottomSheetBehavior {
    public final /* synthetic */ AnonymousClass51x A00;

    public StatusPlaybackPageItem$4(AnonymousClass51x r1) {
        this.A00 = r1;
    }

    public boolean A0E(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (this.A00.A00.A0O == 3 || motionEvent.getPointerCount() >= 2 || !super.A0E(motionEvent, view, coordinatorLayout)) {
            return false;
        }
        return true;
    }

    public boolean A0F(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (this.A00.A00.A0O == 3) {
            return false;
        }
        try {
            return super.A0F(motionEvent, view, coordinatorLayout);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public boolean A0I(View view, CoordinatorLayout coordinatorLayout, int i) {
        super.A0I(view, coordinatorLayout, i);
        C06560Yg.A0J(view, -view.getTop());
        return true;
    }
}
