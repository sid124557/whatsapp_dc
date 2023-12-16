package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass7MV;
import X.C107165ao;
import X.C107855c0;
import X.C626936e;
import X.C86604Kt;
import X.C86614Ku;
import X.C86664Kz;
import X.C89374cS;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class RollingCounterView extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public AnonymousClass7MV A05;
    public AnonymousClass7MV A06;
    public TextEmojiLabel A07;
    public TextEmojiLabel A08;
    public String A09;
    public final ValueAnimator A0A = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    public final ValueAnimator A0B = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    public final Rect A0C = AnonymousClass001.A0N();

    private void setupWidthAnimator(int i) {
        int measuredWidth = this.A07.getMeasuredWidth();
        int measuredHeight = this.A07.getMeasuredHeight();
        ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(this);
        int i2 = A0T.leftMargin;
        int i3 = A0T.rightMargin;
        ValueAnimator valueAnimator = this.A0B;
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.addUpdateListener(new C107855c0(this, i - measuredWidth, measuredWidth, measuredHeight, i2, i3));
    }

    public final void A01() {
        AnonymousClass7MV r0 = this.A05;
        if (r0 == null) {
            C626936e.A0A(AnonymousClass001.A0e("finishedAnimationl called when currentAnimationInfo is null! This should never occur."));
            return;
        }
        int i = r0.A00;
        this.A00 = i;
        TextEmojiLabel textEmojiLabel = this.A07;
        String str = this.A09;
        if (str == null) {
            if (this instanceof C89374cS) {
                C89374cS r2 = (C89374cS) this;
                str = C107165ao.A01(r2.getContext(), r2.A00, i);
            } else {
                str = Integer.toString(i);
            }
        }
        textEmojiLabel.setText(str);
        this.A07.requestLayout();
        this.A08.requestLayout();
        ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(this);
        A0T.leftMargin = this.A01;
        A0T.rightMargin = this.A02;
        setLayoutParams(A0T);
        AnonymousClass7MV r1 = this.A06;
        if (r1 != null) {
            this.A06 = null;
            A02(r1);
            return;
        }
        this.A05 = null;
    }

    public final void A02(AnonymousClass7MV r9) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        this.A05 = r9;
        TextEmojiLabel textEmojiLabel = this.A08;
        String str = this.A09;
        if (str == null) {
            int i = r9.A00;
            if (this instanceof C89374cS) {
                C89374cS r2 = (C89374cS) this;
                str = C107165ao.A01(r2.getContext(), r2.A00, i);
            } else {
                str = Integer.toString(i);
            }
        }
        textEmojiLabel.setText(str);
        C86604Kt.A19(this.A07);
        C86604Kt.A19(this.A08);
        long j = r9.A02;
        if (j == 0 && r9.A03 == 0) {
            int measuredWidth = this.A08.getMeasuredWidth();
            int measuredHeight = this.A08.getMeasuredHeight();
            int i2 = this.A01;
            int i3 = this.A02;
            ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(this);
            A0T.width = measuredWidth;
            A0T.height = measuredHeight;
            A0T.leftMargin = i2;
            A0T.rightMargin = i3;
            this.A0C.set(0, 0, measuredWidth, measuredHeight);
            setLayoutParams(A0T);
            A01();
            return;
        }
        int measuredWidth2 = this.A08.getMeasuredWidth() - this.A07.getMeasuredWidth();
        AnimatorSet A0O = C86664Kz.A0O();
        if (measuredWidth2 != 0) {
            setupWidthAnimator(this.A08.getMeasuredWidth());
            Animator[] animatorArr = new Animator[2];
            if (measuredWidth2 > 0) {
                animatorArr[0] = this.A0B;
                valueAnimator2 = this.A0A;
                valueAnimator = valueAnimator2;
            } else {
                valueAnimator = this.A0A;
                animatorArr[0] = valueAnimator;
                valueAnimator2 = this.A0B;
            }
            animatorArr[1] = valueAnimator2;
            A0O.playSequentially(animatorArr);
        } else {
            valueAnimator = this.A0A;
            A0O.play(valueAnimator);
        }
        this.A0B.setDuration(r9.A03);
        valueAnimator.setDuration(j);
        A0O.start();
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        float f;
        if (view == this.A07 || view == this.A08) {
            AnonymousClass7MV r0 = this.A05;
            if (r0 == null) {
                i = 0;
            } else {
                i = r0.A01;
            }
            ValueAnimator valueAnimator = this.A0A;
            if (valueAnimator.isRunning()) {
                f = AnonymousClass001.A03(valueAnimator);
            } else {
                f = 0.0f;
            }
            if (view == this.A08) {
                i = -i;
                f = 1.0f - f;
            }
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.A0C;
            if (rect.isEmpty()) {
                rect.set(0, 0, getMeasuredWidth(), measuredHeight);
            }
            canvas.save();
            canvas.clipRect(rect);
            canvas.translate(0.0f, ((float) (-measuredHeight)) * f * ((float) i));
            view.draw(canvas);
            canvas.restore();
            if (valueAnimator.isRunning()) {
                invalidate();
                return true;
            }
        } else {
            C626936e.A0A(AnonymousClass001.A0c("drawChild given something other than primary/secondary textview"));
        }
        return false;
    }

    public String getPrimaryText() {
        if (C86664Kz.A1V(this.A07)) {
            return null;
        }
        return C86614Ku.A0u(this.A07);
    }

    public void setAnimationInterpolator(TimeInterpolator timeInterpolator) {
        this.A0A.setInterpolator(timeInterpolator);
        this.A0B.setInterpolator(timeInterpolator);
    }

    public void setTextColor(int i) {
        this.A07.setTextColor(i);
        this.A08.setTextColor(i);
    }

    public RollingCounterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        this.A07 = new TextEmojiLabel(getContext());
        this.A08 = new TextEmojiLabel(getContext());
        super.addView(this.A07);
        super.addView(this.A08);
        C86614Ku.A0z(this.A0A, this, 7);
    }

    public RollingCounterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public RollingCounterView(Context context) {
        super(context);
        A00();
    }
}
