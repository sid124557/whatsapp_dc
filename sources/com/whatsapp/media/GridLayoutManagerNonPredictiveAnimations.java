package com.whatsapp.media;

import X.AnonymousClass0Q1;
import X.C04870Qz;
import X.C162457s7;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.util.Log;

public final class GridLayoutManagerNonPredictiveAnimations extends GridLayoutManager {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GridLayoutManagerNonPredictiveAnimations(Context context, int i) {
        super(i);
        C162457s7.A0J(context, 1);
    }

    public void A0v(C04870Qz r3, AnonymousClass0Q1 r4) {
        try {
            super.A0v(r3, r4);
        } catch (IndexOutOfBoundsException e) {
            Log.e("GridLayoutManagerNonPredictiveAnimations/onLayoutChildren/exception", e);
        }
    }

    public boolean A1B() {
        return false;
    }
}
