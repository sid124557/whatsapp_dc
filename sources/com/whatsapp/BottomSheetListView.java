package com.whatsapp;

import X.AnonymousClass4GJ;
import X.C116855qy;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;

public class BottomSheetListView extends ListView implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public void A00() {
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public BottomSheetListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public boolean A01() {
        if (getChildCount() <= 0) {
            return false;
        }
        if (getFirstVisiblePosition() == 0 && getChildAt(0).getTop() == 0 && getLastVisiblePosition() != getChildCount()) {
            return false;
        }
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (A01()) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    public BottomSheetListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public BottomSheetListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
    }

    public BottomSheetListView(Context context) {
        super(context, (AttributeSet) null);
        A00();
    }

    public BottomSheetListView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
