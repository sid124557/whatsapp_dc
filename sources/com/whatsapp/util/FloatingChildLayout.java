package com.whatsapp.util;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass4GJ;
import X.AnonymousClass67I;
import X.AnonymousClass67L;
import X.C100295Aj;
import X.C116855qy;
import X.C626936e;
import X.C86634Kw;
import X.C86664Kz;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;

public class FloatingChildLayout extends FrameLayout implements AnonymousClass4GJ {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ValueAnimator A06;
    public Rect A07;
    public View.OnTouchListener A08;
    public View A09;
    public C116855qy A0A;
    public boolean A0B;

    public void setBackground(Drawable drawable) {
        C626936e.A0D(false, "don't setBackground(), it is managed internally");
    }

    public final void A00(Runnable runnable, boolean z) {
        float f;
        float A042;
        int i;
        float f2 = 1.0f;
        if (z) {
            f = AnonymousClass001.A04(this.A09, (float) this.A07.width());
            A042 = 1.0f;
        } else {
            f = 1.0f;
            A042 = AnonymousClass001.A04(this.A09, (float) this.A07.width());
        }
        if (AnonymousClass000.A1S(this.A04)) {
            float sqrt = ((float) (Math.sqrt(2.0d) * ((double) Math.max(this.A09.getWidth(), this.A09.getHeight())))) / 2.0f;
            float min = (float) Math.min(this.A09.getWidth(), this.A09.getHeight());
            if (this.A04 == 1) {
                min /= 2.0f;
            }
            if (!z) {
                float f3 = min;
                min = sqrt;
                sqrt = f3;
            }
            View view = this.A09;
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, C86664Kz.A0E(view, 2), C86664Kz.A0E(this.A09, 2), sqrt, min);
            createCircularReveal.setDuration((long) this.A01);
            if (z) {
                AnonymousClass67L.A01(createCircularReveal, this, 28);
            }
            createCircularReveal.start();
        }
        int[] iArr = new int[2];
        this.A09.getLocationOnScreen(iArr);
        int i2 = 0;
        Rect rect = this.A07;
        int i3 = rect.left - iArr[0];
        int i4 = rect.top - iArr[1];
        if (!z) {
            i2 = i3;
            i = 0;
            i3 = 0;
        } else {
            i = i4;
            i4 = 0;
        }
        boolean A1S = true ^ AnonymousClass000.A1S(this.A04);
        if (!A1S || z) {
            this.A09.setAlpha(1.0f);
        } else {
            this.A09.setAlpha(this.A00);
        }
        this.A09.setTranslationX((float) i2);
        this.A09.setTranslationY((float) i4);
        this.A09.setPivotX(0.0f);
        this.A09.setPivotY(0.0f);
        this.A09.setScaleX(A042);
        this.A09.setScaleY(A042);
        ViewPropertyAnimator translationY = C86634Kw.A0P(this.A09.animate().setDuration((long) this.A01).setInterpolator(AnimationUtils.loadInterpolator(getContext(), 17563654)), f).translationX((float) i3).translationY((float) i);
        if (A1S && z) {
            f2 = this.A00;
        }
        translationY.alpha(f2).setListener(new AnonymousClass67I(this, runnable, z));
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0A;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public View getChild() {
        return this.A09;
    }

    public int getTopPosition() {
        return this.A05;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int height;
        int centerX;
        int centerY;
        View view = this.A09;
        Rect targetInWindow = getTargetInWindow();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = this.A05;
        if (i5 >= 0) {
            centerX = (getWidth() - measuredWidth) / 2;
            centerY = this.A05;
        } else if (i5 == -1) {
            centerX = targetInWindow.centerX() - (measuredWidth / 2);
            centerY = targetInWindow.centerY() - AnonymousClass001.A07((float) measuredHeight, 0.75f);
        } else if (i5 == -2) {
            width = (getWidth() - measuredWidth) / 2;
            height = (getHeight() - measuredHeight) / 2;
            view.layout(width, height, view.getMeasuredWidth() + width, view.getMeasuredHeight() + height);
        } else {
            return;
        }
        int width2 = getWidth();
        if (measuredWidth > width2) {
            width = (width2 - measuredWidth) / 2;
        } else {
            width = Math.min(Math.max(centerX, 0), width2 - measuredWidth);
        }
        int height2 = getHeight();
        if (measuredHeight > height2) {
            height = (height2 - measuredHeight) / 2;
        } else {
            height = Math.min(Math.max(centerY, 0), height2 - measuredHeight);
        }
        view.layout(width, height, view.getMeasuredWidth() + width, view.getMeasuredHeight() + height);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.A08;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(this, motionEvent);
        }
        return false;
    }

    public void setBackgroundColorAlpha(int i) {
        setBackgroundColor(i << 24);
    }

    public void setChildTargetScreen(Rect rect) {
        this.A07 = rect;
        requestLayout();
    }

    public FloatingChildLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A0B) {
            this.A0B = true;
            generatedComponent();
        }
    }

    private Rect getTargetInWindow() {
        Rect A0N = AnonymousClass001.A0N();
        getWindowVisibleDisplayFrame(A0N);
        Rect rect = new Rect(this.A07);
        rect.offset(-A0N.left, -A0N.top);
        return rect;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(16908290);
        this.A09 = findViewById;
        findViewById.setDuplicateParentStateEnabled(true);
    }

    public void setOnOutsideTouchListener(View.OnTouchListener onTouchListener) {
        this.A08 = onTouchListener;
    }

    public void setRevealAnimation(int i) {
        this.A04 = i;
    }

    public void setStartingAlpha(float f) {
        this.A00 = f;
    }

    public void setTopPosition(int i) {
        this.A05 = i;
    }

    public FloatingChildLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A0B) {
            this.A0B = true;
            generatedComponent();
        }
        this.A07 = AnonymousClass001.A0N();
        this.A02 = 0;
        this.A06 = null;
        this.A03 = 0;
        Resources resources = getResources();
        this.A05 = -1;
        this.A01 = (resources.getInteger(17694720) * 11) / 10;
        int[] A1Z = C86664Kz.A1Z();
        // fill-array-data instruction
        A1Z[0] = 0;
        A1Z[1] = 127;
        ValueAnimator ofInt = ValueAnimator.ofInt(A1Z);
        this.A06 = ofInt;
        C100295Aj.A03(ofInt, this, 26);
        super.setBackgroundDrawable(new ColorDrawable(0));
    }
}
