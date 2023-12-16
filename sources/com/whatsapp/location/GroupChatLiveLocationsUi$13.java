package com.whatsapp.location;

import X.C111445i6;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class GroupChatLiveLocationsUi$13 extends BottomSheetBehavior {
    public final /* synthetic */ C111445i6 A00;

    public GroupChatLiveLocationsUi$13(C111445i6 r1) {
        this.A00 = r1;
    }

    public boolean A0E(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (this.A00.A0Z.A0O != 5 || !super.A0E(motionEvent, view, coordinatorLayout)) {
            return false;
        }
        return true;
    }
}
