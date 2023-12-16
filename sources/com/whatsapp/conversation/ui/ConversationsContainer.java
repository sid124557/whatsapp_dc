package com.whatsapp.conversation.ui;

import X.AnonymousClass673;
import X.C117645sG;
import X.C162457s7;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.whatsapp.HomeActivity;
import com.whatsapp.util.Log;

public final class ConversationsContainer extends LinearLayout {
    public AnonymousClass673 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationsContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AnonymousClass673 r3;
        if (!(motionEvent == null || motionEvent.getAction() != 0 || (r3 = this.A00) == null)) {
            HomeActivity homeActivity = (HomeActivity) r3;
            homeActivity.A04.BkM(new C117645sG(homeActivity, 26));
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            Log.e((Throwable) e);
            return false;
        }
    }

    public final void setTouchCallback(AnonymousClass673 r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationsContainer(Context context) {
        super(context);
        C162457s7.A0J(context, 1);
    }
}
