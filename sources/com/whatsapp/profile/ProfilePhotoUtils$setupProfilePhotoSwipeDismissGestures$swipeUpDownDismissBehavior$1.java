package com.whatsapp.profile;

import X.AnonymousClass0WM;
import X.C162457s7;
import X.C18270x1;
import X.C89654ea;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.gesture.VerticalSwipeDismissBehavior;
import com.whatsapp.mediaview.PhotoView;

public final class ProfilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1 extends VerticalSwipeDismissBehavior {
    public final /* synthetic */ PhotoView A00;

    public boolean A0E(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        C162457s7.A0J(coordinatorLayout, 0);
        C18270x1.A10(view, 1, motionEvent);
        if (motionEvent.getPointerCount() <= 1 && !this.A00.A0B()) {
            return super.A0E(motionEvent, view, coordinatorLayout);
        }
        AnonymousClass0WM r0 = this.A04;
        if (r0 != null) {
            r0.A03();
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1(C89654ea r1, PhotoView photoView) {
        super(r1);
        this.A00 = photoView;
    }
}
