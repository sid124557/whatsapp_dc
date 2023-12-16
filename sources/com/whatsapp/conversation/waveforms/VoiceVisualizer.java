package com.whatsapp.conversation.waveforms;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass4L0;
import X.AnonymousClass5YI;
import X.AnonymousClass5ZT;
import X.AnonymousClass78o;
import X.AnonymousClass7PA;
import X.AnonymousClass8G4;
import X.C179248iq;
import X.C626936e;
import X.C86634Kw;
import X.C86664Kz;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class VoiceVisualizer extends View {
    public static final int[] A0L = C86664Kz.A1Z();
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public C179248iq A08;
    public boolean A09;
    public boolean A0A;
    public final float A0B;
    public final float A0C;
    public final float A0D;
    public final float A0E;
    public final Paint A0F;
    public final Paint A0G;
    public final Paint A0H;
    public final LinkedList A0I;
    public final List A0J;
    public final List A0K;

    public void setPlaybackPercentage(float f) {
        if (f >= 0.0f && f <= 1.0f) {
            this.A00 = f;
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: finally extract failed */
    public VoiceVisualizer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0I = AnonymousClass0x9.A18();
        this.A0K = AnonymousClass001.A0s();
        this.A0J = AnonymousClass001.A0s();
        Paint A0a = C86664Kz.A0a(5);
        this.A0G = A0a;
        Paint A0a2 = C86664Kz.A0a(5);
        this.A0H = A0a2;
        Paint A0a3 = C86664Kz.A0a(5);
        this.A0F = A0a3;
        this.A07 = 166;
        this.A09 = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass78o.A01, 0, 0);
        try {
            AnonymousClass7PA r1 = new AnonymousClass7PA();
            r1.A06 = obtainStyledAttributes.getColor(5, -7829368);
            r1.A05 = obtainStyledAttributes.getColor(4, -16711936);
            r1.A03 = obtainStyledAttributes.getColor(0, -16711936);
            r1.A04 = obtainStyledAttributes.getColor(2, 0);
            r1.A01 = (float) obtainStyledAttributes.getDimensionPixelOffset(6, AnonymousClass5YI.A04(context, 5.0f));
            r1.A02 = (float) obtainStyledAttributes.getDimensionPixelOffset(7, AnonymousClass5YI.A04(context, 3.0f));
            r1.A00 = (float) obtainStyledAttributes.getDimensionPixelOffset(1, AnonymousClass5YI.A04(context, 0.0f));
            float dimensionPixelSize = (float) obtainStyledAttributes.getDimensionPixelSize(3, AnonymousClass5YI.A04(context, 0.0f));
            Paint.Cap cap = Paint.Cap.ROUND;
            int i2 = r1.A06;
            int i3 = r1.A05;
            int i4 = r1.A03;
            float f = r1.A01;
            float f2 = r1.A02;
            float f3 = r1.A00;
            int i5 = r1.A04;
            obtainStyledAttributes.recycle();
            A0a.setStrokeCap(cap);
            A0a2.setStrokeCap(cap);
            this.A0D = f;
            this.A0C = 1.8f * f;
            this.A0B = f * 2.0f;
            this.A0E = f2;
            this.A01 = f3;
            this.A02 = dimensionPixelSize;
            A0a3.setStrokeWidth(dimensionPixelSize);
            setSegmentColor(i2);
            setProgressColor(i3);
            this.A04 = i4;
            this.A05 = i5;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private int getDesiredWidth() {
        return (int) (((float) this.A0J.size()) * this.A0D);
    }

    private void setProgressColor(int i) {
        this.A0G.setColor(i);
    }

    private void setSegmentColor(int i) {
        this.A0H.setColor(i);
    }

    public final float A00(MotionEvent motionEvent) {
        int[] iArr = A0L;
        getLocationInWindow(iArr);
        return Math.max(Math.min((motionEvent.getRawX() - ((float) C86664Kz.A0F(this, iArr[0]))) / (((float) (getWidth() - C86664Kz.A0F(this, getPaddingRight()))) * getScaleX()), 1.0f), 0.0f);
    }

    public final void A01(Canvas canvas, Paint paint, float f, int i) {
        float A002;
        double pow;
        Canvas canvas2 = canvas;
        int A052 = AnonymousClass000.A05(this, canvas2.getHeight());
        float f2 = this.A0D;
        float f3 = f * f2;
        float A032 = ((float) AnonymousClass4L0.A03(this, canvas2.getWidth())) - f3;
        List list = this.A0J;
        Paint paint2 = paint;
        if (!list.isEmpty()) {
            int i2 = 0;
            for (int i3 = i - 1; i3 >= 0; i3--) {
                A03(canvas2, paint2, 1.0f, AnonymousClass001.A05(list.get(i3)), A032, A052, i2);
                i2++;
            }
            return;
        }
        Iterator descendingIterator = this.A0I.descendingIterator();
        boolean z = false;
        int i4 = 0;
        while (descendingIterator.hasNext()) {
            float A053 = AnonymousClass001.A05(descendingIterator.next());
            if (z) {
                descendingIterator.remove();
            } else {
                float f4 = (((float) i4) * f2) + f3;
                float width = ((float) (canvas2.getWidth() - getPaddingLeft())) - f4;
                if (width < f4) {
                    A002 = C86664Kz.A00(width, this.A0C, 1.0f);
                } else {
                    A002 = C86664Kz.A00(f4, this.A0B, 1.0f);
                }
                if (A002 < 0.5f) {
                    pow = (double) (4.0f * A002 * A002 * A002);
                } else {
                    pow = 1.0d - (Math.pow((double) ((A002 * -2.0f) + 2.0f), 3.0d) / 2.0d);
                }
                if (A03(canvas2, paint2, (float) pow, A053, A032, A052, i4)) {
                    i4++;
                } else {
                    descendingIterator.remove();
                    z = true;
                }
            }
        }
    }

    public void A02(List list, float f) {
        C626936e.A0B(this.A0I.isEmpty());
        List list2 = this.A0K;
        list2.clear();
        List list3 = this.A0J;
        list3.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            list2.add(Float.valueOf(number.floatValue()));
            list3.add(Float.valueOf(number.floatValue()));
        }
        setPlaybackPercentage(f);
        requestLayout();
    }

    public final boolean A03(Canvas canvas, Paint paint, float f, float f2, float f3, int i, int i2) {
        float f4 = f3 - (this.A0D * ((float) i2));
        float f5 = this.A0E;
        if (f4 < ((float) getPaddingLeft()) - f5) {
            return false;
        }
        float f6 = (float) i;
        float max = Math.max(0.006f, f2) * f6 * f;
        float paddingTop = ((float) getPaddingTop()) + ((f6 - max) / 2.0f);
        paint.setStrokeWidth(f5);
        Canvas canvas2 = canvas;
        float f7 = f4;
        canvas2.drawLine(f4, paddingTop, f7, paddingTop + max, paint);
        return true;
    }

    public float getPlaybackPercentage() {
        return this.A00;
    }

    public float getSegmentSpacingPx() {
        return this.A0D;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.A08 == null) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 1) {
            if (this.A09) {
                this.A09 = false;
                AnonymousClass5ZT.A01(((AnonymousClass8G4) this.A08).A00);
            }
        } else if (actionMasked == 2) {
            float A002 = A00(motionEvent);
            if (!this.A09) {
                if (AnonymousClass002.A00(A002, this.A03) >= 0.015f) {
                    this.A09 = true;
                    setPlaybackPercentage(A002);
                    AnonymousClass5ZT r6 = ((AnonymousClass8G4) this.A08).A00;
                    r6.A1G.A02++;
                    if (r6.A0K != null) {
                        r6.A0T.removeCallbacks(r6.A1P);
                        r6.A04 = -1;
                    }
                }
                return true;
            }
            setPlaybackPercentage(A002);
            AnonymousClass5ZT r3 = ((AnonymousClass8G4) this.A08).A00;
            AnonymousClass5ZT.A02(r3, (int) (((float) r3.A05) * A002), true);
            return true;
        } else if (actionMasked == 0) {
            this.A03 = A00(motionEvent);
            return true;
        }
        return false;
    }

    public void setProgressBubbleRadius(float f) {
        this.A01 = f;
        invalidate();
    }

    public void setProgressBubbleStokeWidth(float f) {
        this.A02 = f;
        invalidate();
    }

    private void setProgressBubbleColor(int i) {
        this.A04 = i;
    }

    private void setProgressBubbleStrokeColor(int i) {
        this.A05 = i;
    }

    public void onDraw(Canvas canvas) {
        int size;
        super.onDraw(canvas);
        LinkedList linkedList = this.A0I;
        if (!linkedList.isEmpty() || !this.A0J.isEmpty()) {
            List list = this.A0J;
            float f = 1.0f;
            if (list.isEmpty()) {
                size = linkedList.size();
                long j = this.A06;
                if (j != 0) {
                    f = (((float) AnonymousClass0x7.A0E(j)) * 1.0f) / ((float) this.A07);
                } else {
                    f = 0.0f;
                }
            } else {
                size = list.size();
            }
            A01(canvas, this.A0H, f, size);
            if (this.A00 > 0.0f) {
                canvas.save();
                canvas.clipRect(((float) getPaddingLeft()) - this.A0D, 0.0f, (((float) AnonymousClass000.A06(this, getWidth())) * this.A00) + ((float) getPaddingLeft()), C86664Kz.A02(this));
                A01(canvas, this.A0G, f, size);
                canvas.restore();
            }
            if (this.A01 != 0.0f) {
                float f2 = this.A0E / 2.0f;
                float A062 = ((((float) AnonymousClass000.A06(this, getWidth())) - f2) * this.A00) + (((float) getPaddingLeft()) - f2);
                float A022 = C86664Kz.A02(this) / 2.0f;
                Paint paint = this.A0F;
                AnonymousClass001.A10(paint);
                paint.setColor(this.A04);
                canvas.drawCircle(A062, A022, this.A01, paint);
                C86634Kw.A17(paint);
                paint.setColor(this.A05);
                canvas.drawCircle(A062, A022, this.A01 + this.A02, paint);
            }
            if (this.A0A) {
                invalidate();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r6 >= 100000) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            int r2 = android.view.View.MeasureSpec.getMode(r9)
            int r6 = android.view.View.MeasureSpec.getSize(r9)
            java.util.List r3 = r8.A0K
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x003a
            r5 = r6
        L_0x0011:
            r4 = 1
            if (r6 <= 0) goto L_0x001a
            r0 = 100000(0x186a0, float:1.4013E-40)
            r1 = 1
            if (r6 < r0) goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            int r0 = X.AnonymousClass001.A0A(r5, r6)
            float r0 = (float) r0
            float r7 = r8.A0D
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0027
            r4 = 0
        L_0x0027:
            if (r1 == 0) goto L_0x0068
            if (r4 == 0) goto L_0x0068
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0068
            float r0 = (float) r6
            float r0 = r0 / r7
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            int r5 = (int) r0
            goto L_0x003f
        L_0x003a:
            int r5 = r8.getDesiredWidth()
            goto L_0x0011
        L_0x003f:
            java.util.List r0 = r8.A0J     // Catch:{ Exception | OutOfMemoryError -> 0x0045 }
            X.C380325f.A00(r3, r0, r5)     // Catch:{ Exception | OutOfMemoryError -> 0x0045 }
            goto L_0x0064
        L_0x0045:
            r4 = move-exception
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Object[] r2 = X.AnonymousClass0x9.A1X()
            X.C18270x1.A1Q(r2, r6)
            java.lang.Float r1 = java.lang.Float.valueOf(r7)
            r0 = 1
            r2[r0] = r1
            r0 = 2
            X.AnonymousClass000.A1P(r2, r5, r0)
            java.lang.String r0 = "widthUpperBound %d / segmentSpacing %.2f = maxNumSegments %d"
            java.lang.String r0 = java.lang.String.format(r3, r0, r2)
            com.whatsapp.util.Log.e(r0, r4)
            throw r4
        L_0x0064:
            int r5 = r8.getDesiredWidth()
        L_0x0068:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r2 == r0) goto L_0x0074
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 != r0) goto L_0x007c
            int r6 = java.lang.Math.min(r5, r6)
        L_0x0074:
            int r0 = android.view.View.MeasureSpec.getSize(r10)
            r8.setMeasuredDimension(r6, r0)
            return
        L_0x007c:
            r6 = r5
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.waveforms.VoiceVisualizer.onMeasure(int, int):void");
    }

    public void setOnVoiceVisualizerChangeListener(C179248iq r1) {
        this.A08 = r1;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public VoiceVisualizer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceVisualizer(Context context) {
        this(context, (AttributeSet) null);
    }
}
