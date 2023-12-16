package com.whatsapp.bloks.ui.widgets.rangeslider;

import X.AnonymousClass5Yj;
import X.AnonymousClass945;
import X.AnonymousClass9JY;
import X.AnonymousClass9TN;
import X.C18290x4;
import X.C192469Jw;
import X.C196199aS;
import X.C196309ad;
import X.C202079lL;
import X.C202089lM;
import X.C202419lz;
import X.C202429m0;
import X.C86624Kv;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.whatsapp.R;

public class WaRangeSeekBar extends FrameLayout implements C202419lz, C202429m0, C202079lL {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public Paint A07;
    public Paint A08;
    public Paint A09;
    public Paint A0A;
    public Paint A0B;
    public AnonymousClass9TN A0C;
    public C202089lM A0D;
    public AnonymousClass9JY A0E;

    private float getCurrentPosition() {
        if (this.A0E == AnonymousClass9JY.START) {
            return getStartThumbX();
        }
        return getEndThumbX();
    }

    private float getEndThumbX() {
        float f = this.A02;
        float f2 = this.A01;
        float f3 = this.A00;
        float f4 = (float) this.A04;
        return (((f - f2) / (f3 - f2)) * (((float) (getWidth() - this.A04)) - f4)) + f4;
    }

    private float getStartThumbX() {
        float f = this.A03;
        float f2 = this.A01;
        float f3 = this.A00;
        float f4 = (float) this.A04;
        return (((f - f2) / (f3 - f2)) * (((float) (getWidth() - this.A04)) - f4)) + f4;
    }

    private void setCurrentPosition(float f) {
        if (this.A0E != null) {
            float f2 = (float) this.A04;
            float f3 = this.A01;
            float f4 = this.A00;
            float width = (((f - f2) / (((float) (getWidth() - this.A04)) - f2)) * (f4 - f3)) + f3;
            if (this.A0E == AnonymousClass9JY.START) {
                float f5 = this.A02;
                this.A03 = Math.min(Math.max(f3, f5), Math.max(Math.min(f3, f5), width));
            } else {
                float f6 = this.A03;
                this.A02 = Math.min(Math.max(f6, f4), Math.max(Math.min(f6, f4), width));
            }
            invalidate();
            A02();
        }
    }

    public final void A01() {
        C202089lM r0 = this.A0D;
        if (r0 != null) {
            C196309ad r02 = (C196309ad) r0;
            C196199aS.A01(r02.A01, this.A03, this.A02, r02.A00);
        }
    }

    public final void A02() {
        C202089lM r0 = this.A0D;
        if (r0 != null) {
            C196309ad r02 = (C196309ad) r0;
            C196199aS.A01(r02.A01, this.A03, this.A02, r02.A00);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A0C.A02(motionEvent);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        AnonymousClass945 r4 = (AnonymousClass945) parcelable;
        super.onRestoreInstanceState(r4.getSuperState());
        float f = r4.A01;
        float f2 = r4.A00;
        if (f >= this.A01 && f2 <= this.A00 && f <= f2) {
            this.A03 = f;
            this.A02 = f2;
            invalidate();
            A02();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        if (r2 <= 0) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            X.9TN r4 = r7.A0C
            X.9Jh r1 = r4.A0E
            X.9Jh r0 = X.C192349Jh.DRAGGING
            boolean r0 = X.AnonymousClass000.A1Y(r1, r0)
            r3 = 1
            r2 = 3
            if (r0 != 0) goto L_0x001b
            r4.A02(r8)
            X.9Jh r0 = r4.A0E
            int r0 = r0.ordinal()
            if (r0 == r2) goto L_0x00f1
        L_0x0019:
            r0 = 1
            return r0
        L_0x001b:
            X.9lz r0 = r4.A0D
            if (r0 == 0) goto L_0x00f1
            int r0 = r4.A05
            if (r0 <= 0) goto L_0x00f1
            android.view.VelocityTracker r0 = r4.A0B
            if (r0 != 0) goto L_0x002d
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r4.A0B = r0
        L_0x002d:
            r0.addMovement(r8)
            int r1 = r8.getAction()
            float r5 = r8.getX()
            float r6 = r8.getY()
            if (r1 == r3) goto L_0x0067
            r0 = 2
            if (r1 == r0) goto L_0x0044
            if (r1 == r2) goto L_0x0067
            goto L_0x0019
        L_0x0044:
            float r0 = r4.A00
            float r2 = r5 - r0
            float r0 = r4.A01
            float r1 = r6 - r0
            r4.A00 = r5
            r4.A01 = r6
            float r0 = r4.A02
            float r0 = r0 + r2
            r4.A02 = r0
            float r0 = r4.A03
            float r0 = r0 + r1
            r4.A03 = r0
            X.9lz r1 = r4.A0D
            com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar r1 = (com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar) r1
            float r0 = r1.getCurrentPosition()
            float r0 = r0 + r2
            r1.setCurrentPosition(r0)
            goto L_0x0019
        L_0x0067:
            android.view.VelocityTracker r3 = r4.A0B
            r0 = 0
            r4.A0B = r0
            r4.A01()
            int r0 = r4.A06
            float r1 = (float) r0
            r0 = 1000(0x3e8, float:1.401E-42)
            r3.computeCurrentVelocity(r0, r1)
            X.9Jw r1 = r4.A0G
            X.9Jw r0 = X.C192469Jw.LEFT
            if (r1 == r0) goto L_0x00ec
            X.9Jw r0 = X.C192469Jw.RIGHT
            if (r1 == r0) goto L_0x00ec
            float r0 = r3.getYVelocity()
        L_0x0085:
            int r2 = (int) r0
            r4.A01()
            int r1 = r4.A07
            int r0 = java.lang.Math.abs(r2)
            if (r0 <= r1) goto L_0x00a8
            if (r2 < 0) goto L_0x0095
            if (r2 <= 0) goto L_0x009f
        L_0x0095:
            X.9lz r1 = r4.A0D
            com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar r1 = (com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar) r1
            r0 = 0
            r1.A0E = r0
            r1.A01()
        L_0x009f:
            X.9Jh r0 = X.C192349Jh.AT_REST
            r4.A0E = r0
            r3.recycle()
            goto L_0x0019
        L_0x00a8:
            X.9m0 r0 = r4.A0F
            if (r0 == 0) goto L_0x0095
            r4.A01()
            int r1 = r4.A08
            float r0 = r4.A02
            float r0 = java.lang.Math.abs(r0)
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0095
            float r0 = r4.A03
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0095
            X.9m0 r2 = r4.A0F
            com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar r2 = (com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar) r2
            int r0 = r2.getMeasuredHeight()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r6 = r6 - r0
            float r1 = java.lang.Math.abs(r6)
            int r0 = r2.A04
            int r0 = r0 * 2
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x009f
            r2.setCurrentThumb(r5)
            r2.setCurrentPosition(r5)
            r0 = 0
            r2.A0E = r0
            r2.A01()
            goto L_0x009f
        L_0x00ec:
            float r0 = r3.getXVelocity()
            goto L_0x0085
        L_0x00f1:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public WaRangeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    private int getCenterY() {
        return getMeasuredHeight() / 2;
    }

    private int getRightBound() {
        return getWidth() - this.A04;
    }

    private void setCurrentThumb(float f) {
        int i;
        AnonymousClass9JY r0;
        float abs = Math.abs(getEndThumbX() - f);
        float abs2 = Math.abs(getStartThumbX() - f);
        if (abs == abs2) {
            i = (getStartThumbX() > f ? 1 : (getStartThumbX() == f ? 0 : -1));
        } else {
            i = (abs > abs2 ? 1 : (abs == abs2 ? 0 : -1));
        }
        if (i < 0) {
            r0 = AnonymousClass9JY.END;
        } else {
            r0 = AnonymousClass9JY.START;
        }
        this.A0E = r0;
    }

    public final void A00() {
        AnonymousClass9TN r6 = new AnonymousClass9TN(getContext());
        this.A0C = r6;
        int i = 0;
        C192469Jw[] r4 = {C192469Jw.LEFT, C192469Jw.RIGHT};
        int i2 = 0;
        r6.A05 = 0;
        do {
            C192469Jw r0 = r4[i];
            if (r0 != null) {
                int i3 = r0.flag | i2;
                r6.A05 = i3;
                i2 = i3;
            }
            i++;
        } while (i < 2);
        r6.A0C = this;
        r6.A0D = this;
        r6.A0F = this;
        Resources A0G = C18290x4.A0G(this);
        Paint paint = new Paint();
        this.A07 = paint;
        C86624Kv.A0k(A0G, paint, AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        this.A07.setAntiAlias(true);
        this.A07.setStrokeWidth((float) A0G.getDimensionPixelSize(R.dimen.f6nameremoved));
        Paint paint2 = new Paint();
        this.A08 = paint2;
        C86624Kv.A0k(A0G, paint2, R.color.f5nameremoved);
        this.A08.setStrokeWidth((float) A0G.getDimensionPixelSize(R.dimen.f6nameremoved));
        Paint paint3 = new Paint();
        this.A09 = paint3;
        C86624Kv.A0k(A0G, paint3, AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        this.A09.setAlpha(127);
        this.A09.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.A0A = paint4;
        C86624Kv.A0k(A0G, paint4, AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        this.A0A.setAntiAlias(true);
        Paint paint5 = new Paint();
        this.A0B = paint5;
        C86624Kv.A0k(A0G, paint5, AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        this.A0B.setAntiAlias(true);
        this.A04 = A0G.getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A05 = A0G.getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A06 = A0G.getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A03 = Float.NaN;
        this.A02 = Float.NaN;
    }

    public boolean BRd(C192469Jw r3, float f, float f2) {
        setCurrentThumb(f);
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    public boolean Bdy(float f, float f2) {
        if (Math.abs(f2 - ((float) (getMeasuredHeight() / 2))) > ((float) (this.A04 * 2))) {
            return false;
        }
        setCurrentThumb(f);
        setCurrentPosition(f);
        this.A0E = null;
        A01();
        return true;
    }

    public void dispatchDraw(Canvas canvas) {
        float measuredHeight = (float) (getMeasuredHeight() / 2);
        float startThumbX = getStartThumbX();
        float endThumbX = getEndThumbX();
        canvas.save();
        canvas.drawLine((float) this.A04, measuredHeight, (float) (getWidth() - this.A04), measuredHeight, this.A08);
        canvas.drawCircle(startThumbX, measuredHeight, (float) this.A04, this.A09);
        canvas.drawCircle(endThumbX, measuredHeight, (float) this.A04, this.A09);
        Canvas canvas2 = canvas;
        float f = measuredHeight;
        canvas2.drawLine(startThumbX, f, endThumbX, measuredHeight, this.A07);
        canvas.drawCircle(startThumbX, measuredHeight, (float) this.A05, this.A0A);
        canvas.drawCircle(endThumbX, measuredHeight, (float) this.A05, this.A0A);
        canvas.drawCircle(startThumbX, measuredHeight, (float) this.A06, this.A0B);
        canvas.drawCircle(endThumbX, measuredHeight, (float) this.A06, this.A0B);
        canvas.restore();
    }

    public Parcelable onSaveInstanceState() {
        AnonymousClass945 r1 = new AnonymousClass945(super.onSaveInstanceState());
        r1.A01 = this.A03;
        r1.A00 = this.A02;
        return r1;
    }

    private int getLeftBound() {
        return this.A04;
    }

    public float getRangeEndValue() {
        return this.A02;
    }

    public float getRangeStartValue() {
        return this.A03;
    }

    public void setRangeSeekBarChangeListener(C202089lM r1) {
        this.A0D = r1;
    }

    public WaRangeSeekBar(Context context) {
        super(context);
        A00();
    }

    public WaRangeSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
