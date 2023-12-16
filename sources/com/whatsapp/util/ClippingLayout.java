package com.whatsapp.util;

import X.AnonymousClass4GJ;
import X.C116855qy;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class ClippingLayout extends FrameLayout implements AnonymousClass4GJ {
    public Rect A00;
    public C116855qy A01;
    public boolean A02;

    public boolean drawChild(Canvas canvas, View view, long j) {
        Rect rect = this.A00;
        if (rect != null) {
            canvas.clipRect(rect);
        }
        return super.drawChild(canvas, view, j);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setClipBounds(Rect rect) {
        Rect rect2;
        Rect rect3 = this.A00;
        if (rect != rect3) {
            if (rect == null) {
                rect2 = null;
            } else if (!rect.equals(rect3)) {
                Rect rect4 = this.A00;
                if (rect4 == null) {
                    rect2 = new Rect(rect);
                } else {
                    rect4.set(rect);
                    invalidate();
                }
            } else {
                return;
            }
            this.A00 = rect2;
            invalidate();
        }
    }

    public ClippingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public ClippingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public ClippingLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public ClippingLayout(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }
}
