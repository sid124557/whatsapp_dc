package com.facebook.shimmer;

import X.AnonymousClass6NL;
import X.AnonymousClass6NM;
import X.AnonymousClass7QQ;
import X.C1455176e;
import X.C153667bk;
import X.C86664Kz;
import X.C86774Ls;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class ShimmerFrameLayout extends FrameLayout {
    public boolean A00 = true;
    public final Paint A01 = C86664Kz.A0Z();
    public final C86774Ls A02 = new C86774Ls();

    public final void A04(Context context, AttributeSet attributeSet) {
        C153667bk r0;
        setWillNotDraw(false);
        this.A02.setCallback(this);
        if (attributeSet == null) {
            A05(new AnonymousClass6NL().A01());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1455176e.A00, 0, 0);
        try {
            if (!obtainStyledAttributes.hasValue(4) || !obtainStyledAttributes.getBoolean(4, false)) {
                r0 = new AnonymousClass6NL();
            } else {
                r0 = new AnonymousClass6NM();
            }
            r0.A00(obtainStyledAttributes);
            A05(r0.A01());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void A00() {
        if (this.A00) {
            A03();
            this.A00 = false;
            invalidate();
        }
    }

    public void A01() {
        if (!this.A00) {
            this.A00 = true;
            A02();
        }
    }

    public void A02() {
        C86774Ls r1 = this.A02;
        ValueAnimator valueAnimator = r1.A00;
        if (valueAnimator != null && !valueAnimator.isStarted() && r1.getCallback() != null) {
            r1.A00.start();
        }
    }

    public void A03() {
        C86774Ls r1 = this.A02;
        ValueAnimator valueAnimator = r1.A00;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            r1.A00.cancel();
        }
    }

    public void A05(AnonymousClass7QQ r3) {
        int i;
        Paint paint;
        this.A02.A02(r3);
        if (r3 == null || !r3.A0H) {
            i = 0;
            paint = null;
        } else {
            i = 2;
            paint = this.A01;
        }
        setLayerType(i, paint);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A04(context, attributeSet);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.A00) {
            this.A02.draw(canvas);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A02.A00();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A03();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A02.setBounds(0, 0, getWidth(), getHeight());
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A02) {
            return true;
        }
        return false;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A04(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A04(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context) {
        super(context);
        A04(context, (AttributeSet) null);
    }
}
