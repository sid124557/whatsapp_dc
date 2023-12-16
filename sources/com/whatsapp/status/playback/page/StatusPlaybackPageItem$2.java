package com.whatsapp.status.playback.page;

import X.AnonymousClass001;
import X.AnonymousClass51x;
import X.C18260x0;
import X.C86604Kt;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class StatusPlaybackPageItem$2 extends BottomSheetBehavior {
    public float A00;
    public boolean A01;
    public final /* synthetic */ AnonymousClass51x A02;

    public boolean A0I(View view, CoordinatorLayout coordinatorLayout, int i) {
        this.A01 = true;
        return super.A0I(view, coordinatorLayout, i);
    }

    public StatusPlaybackPageItem$2(AnonymousClass51x r1) {
        this.A02 = r1;
    }

    public boolean A0E(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (!this.A01 && view.isShown()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            C86604Kt.A1W(A0o, "playbackPage/onInterceptTouchEvent called before onLayoutChild; page=", this);
            C18260x0.A0m(this.A02.A0T.A01, A0o);
        } else if (motionEvent.getPointerCount() < 2) {
            boolean A0E = super.A0E(motionEvent, view, coordinatorLayout);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.A00 = motionEvent.getY();
            } else if (actionMasked == 2 && this.A00 < motionEvent.getY() && this.A0O == 4) {
                return false;
            } else {
                return A0E;
            }
            return A0E;
        }
        return false;
    }
}
