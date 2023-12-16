package com.whatsapp.components;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass4L0;
import X.C100905Cs;
import X.C124936Em;
import X.C620733j;
import X.C86604Kt;
import X.C86614Ku;
import X.C86664Kz;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public class RoundCornerProgressBar extends C124936Em {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C620733j A05;
    public boolean A06;
    public final Paint A07;
    public final RectF A08;

    public int getProgress() {
        return this.A02;
    }

    public void setProgress(int i) {
        if (i < 0 || i > 100) {
            throw AnonymousClass001.A0c("Progress must be between 0 and 100 inclusive");
        } else if (i != this.A02) {
            this.A02 = i;
            if (!this.A06) {
                this.A00 = (float) i;
            } else if (i > 0) {
                float[] A0T = AnonymousClass4L0.A0T();
                A0T[0] = 0.0f;
                ValueAnimator A0P = C86664Kz.A0P(A0T, (float) i);
                A0P.setDuration((long) ((int) Math.max(200.0f, (((float) this.A02) / 100.0f) * 650.0f)));
                C86614Ku.A0y(A0P);
                C86604Kt.A0w(A0P, this, 19);
                C86614Ku.A0z(A0P, this, 16);
                A0P.setStartDelay(300);
                A0P.start();
                return;
            } else {
                this.A00 = (float) i;
                this.A06 = false;
            }
            invalidate();
        }
    }

    public RoundCornerProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = true;
        this.A00 = 0.0f;
        this.A02 = 0;
        this.A04 = 10;
        this.A03 = getResources().getColor(R.color.f5nameremoved);
        this.A01 = getResources().getColor(R.color.f5nameremoved);
        this.A07 = C86664Kz.A0a(1);
        this.A08 = AnonymousClass002.A07();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100905Cs.A0J);
            this.A04 = obtainStyledAttributes.getDimensionPixelSize(2, this.A04);
            this.A03 = obtainStyledAttributes.getInteger(1, this.A03);
            this.A01 = obtainStyledAttributes.getInteger(0, this.A01);
            obtainStyledAttributes.recycle();
        }
    }

    public void onDraw(Canvas canvas) {
        float f;
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        float f2 = (this.A00 / 100.0f) * ((float) ((width - paddingLeft) - paddingRight));
        if (isInEditMode() || C620733j.A04(this.A05)) {
            f = ((float) paddingLeft) + f2;
        } else {
            f = (((float) width) - f2) - ((float) paddingRight);
        }
        int paddingTop = getPaddingTop() + (AnonymousClass000.A05(this, getHeight()) / 2);
        Paint paint = this.A07;
        C86604Kt.A0u(this.A01, paint);
        RectF rectF = this.A08;
        int i = this.A04 / 2;
        float f3 = (float) (paddingTop - i);
        float f4 = (float) (i + paddingTop);
        rectF.set(0.0f, f3, AnonymousClass4L0.A00(this), f4);
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
        paint.setColor(this.A03);
        if (isInEditMode() || C620733j.A04(this.A05)) {
            rectF.set((float) paddingLeft, f3, f, f4);
        } else {
            rectF.set(f, f3, (float) (width - paddingRight), f4);
        }
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
    }

    public void onMeasure(int i, int i2) {
        int size;
        if (View.MeasureSpec.getMode(i2) == 0) {
            size = getPaddingTop() + this.A04 + getPaddingBottom();
        } else {
            size = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
    }

    public void setBackgroundColor(int i) {
        this.A01 = i;
    }

    public RoundCornerProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundCornerProgressBar(Context context) {
        this(context, (AttributeSet) null);
    }
}
