package com.whatsapp.calling.views;

import X.AnonymousClass0WM;
import X.AnonymousClass0YY;
import X.AnonymousClass4GJ;
import X.AnonymousClass6Gc;
import X.C06560Yg;
import X.C111685iW;
import X.C116855qy;
import X.C182088nq;
import X.C620633i;
import X.C88864av;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;

public class CallResponseLayout extends FrameLayout implements AnonymousClass4GJ {
    public View A00;
    public View A01;
    public C182088nq A02;
    public C620633i A03;
    public C116855qy A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final ViewConfiguration A08;
    public final AnonymousClass0WM A09;

    public final Object generatedComponent() {
        C116855qy r0 = this.A04;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.A09.A08(motionEvent);
        return true;
    }

    public void setCallResponseSwipeUpHintView(View view) {
        this.A00 = view;
    }

    public void setCallResponseView(View view) {
        this.A01 = view;
    }

    public void setResponseListener(C182088nq r1) {
        this.A02 = r1;
    }

    public void setShowSwipeUpHintByDefault(boolean z) {
        this.A06 = z;
    }

    public void setTouchDownAfterDrag(boolean z) {
        this.A07 = z;
    }

    public CallResponseLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            this.A03 = (C620633i) ((C88864av) ((C111685iW) generatedComponent())).A0K.AYG.get();
        }
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.A09.A0I(true)) {
            AnonymousClass0YY.A05(this);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 3 && actionMasked != 1) {
            return this.A09.A0E(motionEvent);
        }
        this.A09.A03();
        return false;
    }

    public void onVisibilityChanged(View view, int i) {
        int height;
        super.onVisibilityChanged(view, i);
        if (this.A01 != null && i == 0 && (height = (getHeight() - this.A01.getHeight()) - ((int) this.A01.getY())) != 0) {
            C06560Yg.A0J(this.A01, height);
        }
    }

    public CallResponseLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            this.A03 = (C620633i) ((C88864av) ((C111685iW) generatedComponent())).A0K.AYG.get();
        }
        this.A09 = AnonymousClass0WM.A00(this, new AnonymousClass6Gc(this));
        this.A08 = ViewConfiguration.get(getContext());
    }

    public CallResponseLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
