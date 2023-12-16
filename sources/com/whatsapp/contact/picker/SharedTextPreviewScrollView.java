package com.whatsapp.contact.picker;

import X.AnonymousClass001;
import X.AnonymousClass4GJ;
import X.C116855qy;
import X.C1225764x;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class SharedTextPreviewScrollView extends ScrollView implements AnonymousClass4GJ {
    public C1225764x A00;
    public C116855qy A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public C1225764x getOnEndScrollListener() {
        return this.A00;
    }

    public SharedTextPreviewScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public void fling(int i) {
        super.fling(i);
        this.A03 = true;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (!this.A03 && this.A04) {
            return;
        }
        if (((float) AnonymousClass001.A0A(i2, i4)) < 1.0f || i2 >= getMeasuredHeight() || i2 == 0) {
            C1225764x r0 = this.A00;
            if (r0 != null) {
                r0.BRv();
            }
            this.A03 = false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            this.A04 = false;
            if (!this.A03) {
                this.A00.BRv();
            }
        } else if (motionEvent.getActionMasked() == 2) {
            this.A04 = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean performClick() {
        super.performClick();
        return true;
    }

    public void setOnEndScrollListener(C1225764x r1) {
        this.A00 = r1;
    }

    public SharedTextPreviewScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public SharedTextPreviewScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public SharedTextPreviewScrollView(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }
}
