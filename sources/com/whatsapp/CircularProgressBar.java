package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass4GJ;
import X.C106905aM;
import X.C116855qy;
import X.C162457s7;
import X.C86604Kt;
import X.C86624Kv;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import java.util.Map;

public class CircularProgressBar extends ProgressBar implements AnonymousClass4GJ {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public Rect A0E;
    public C116855qy A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public final Paint A0J;
    public final RectF A0K;

    public final Object generatedComponent() {
        C116855qy r0 = this.A0F;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0F = r0;
        }
        return r0.generatedComponent();
    }

    public String getCenterText() {
        return this.A0G;
    }

    public int getFillColor() {
        return this.A09;
    }

    public boolean getKnobEnabled() {
        return this.A0I;
    }

    public float getPaintStrokeFactor() {
        return this.A06;
    }

    public int getProgressBarBackgroundColor() {
        return this.A0B;
    }

    public int getProgressBarColor() {
        return this.A0C;
    }

    public void onDraw(Canvas canvas) {
        float f;
        Paint paint = this.A0J;
        paint.setAntiAlias(true);
        Canvas canvas2 = canvas;
        if (this.A09 != 0) {
            AnonymousClass001.A10(paint);
            paint.setColor(this.A09);
            canvas2.drawArc(this.A0K, 0.0f, 360.0f, true, paint);
        }
        paint.setStrokeCap(Paint.Cap.ROUND);
        if (isIndeterminate()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.A0D;
            if (j == 0) {
                this.A0D = uptimeMillis;
                j = uptimeMillis;
            }
            long j2 = uptimeMillis - j;
            float f2 = (((float) (j2 % 1333)) * 1.0f) / 1333.0f;
            if (f2 < 0.5f) {
                float sin = (float) Math.sin(((double) f2) * 3.141592653589793d);
                f = (((sin * sin) * sin) * sin) / 2.0f;
            } else {
                float sin2 = (float) Math.sin(((double) (f2 - 0.5f)) * 3.141592653589793d);
                f = ((((sin2 * sin2) * sin2) * sin2) / 2.0f) + 0.5f;
            }
            if (f < 0.5f) {
                this.A00 = f * 2.0f * 280.0f;
                this.A02 = -1.0f;
            } else {
                float f3 = this.A02;
                if (f3 < 0.0f) {
                    f3 = this.A01;
                    this.A02 = f3;
                }
                this.A00 = (1.0f - f) * 2.0f * 280.0f;
                this.A01 = f3 + ((f - 0.5f) * 2.0f * 280.0f);
            }
            canvas2.rotate(((((float) (j2 % 2200)) * 1.0f) / 2200.0f) * 360.0f, (float) C86664Kz.A0B(this), (float) C86654Ky.A04(this));
            paint.setAntiAlias(true);
            int i = this.A0B;
            if (i != 0) {
                C86624Kv.A0e(i, paint);
                canvas2.drawArc(this.A0K, 0.0f, 360.0f, false, paint);
            }
            int i2 = this.A0A;
            if (i2 != 0) {
                C86624Kv.A0e(i2, paint);
                paint.setStrokeWidth((this.A04 / this.A06) + (this.A03 * 2.0f));
                canvas2.drawArc(this.A0K, this.A01, this.A00, false, paint);
            }
            C86624Kv.A0e(this.A0C, paint);
            paint.setStrokeWidth(this.A04 / this.A06);
            canvas2.drawArc(this.A0K, this.A01, this.A00, false, paint);
            invalidate();
            return;
        }
        C86634Kw.A17(paint);
        if (this.A0B != 0) {
            paint.setStrokeWidth(this.A04 / this.A06);
            paint.setColor(this.A0B);
            canvas2.drawArc(this.A0K, ((((float) getProgress()) * 360.0f) / ((float) getMax())) + 270.0f, 360.0f - ((((float) getProgress()) * 360.0f) / ((float) getMax())), false, paint);
        }
        int i3 = this.A0A;
        if (i3 != 0) {
            paint.setColor(i3);
            paint.setStrokeWidth((this.A04 / this.A06) + (this.A03 * 2.0f));
            canvas2.drawArc(this.A0K, -90.0f, (((float) getProgress()) * 360.0f) / ((float) getMax()), false, paint);
        }
        paint.setStrokeWidth(this.A04 / this.A06);
        paint.setColor(this.A0C);
        RectF rectF = this.A0K;
        canvas2.drawArc(rectF, -90.0f, (((float) getProgress()) * 360.0f) / ((float) getMax()), false, paint);
        if (this.A0I) {
            C86604Kt.A0u(this.A0B, paint);
            double progress = (double) (((float) getProgress()) * ((float) (6.283185307179586d / ((double) getMax()))));
            canvas2.drawCircle((float) (((double) rectF.centerX()) + (((double) this.A04) * Math.sin(progress))), (float) (((double) rectF.centerY()) - (((double) this.A04) * Math.cos(progress))), 10.0f, paint);
        }
        if (this.A0G != null) {
            paint.setColor(this.A08);
            paint.setTextSize(this.A07);
            paint.setTextAlign(Paint.Align.CENTER);
            getContext();
            Map map = C106905aM.A00;
            Object obj = map.get("sans_serif_light");
            if (obj == null) {
                obj = Typeface.create("sans-serif-light", 0);
                C162457s7.A0H(obj);
                map.put("sans_serif_light", obj);
            }
            paint.setTypeface((Typeface) obj);
            String str = this.A0G;
            int length = str.length();
            Rect rect = this.A0E;
            paint.getTextBounds(str, 0, length, rect);
            AnonymousClass001.A10(paint);
            String str2 = this.A0G;
            canvas2.drawText(str2, 0, str2.length(), rectF.centerX(), rectF.centerY() + (((float) rect.height()) * 0.5f), paint);
        }
    }

    public void setCenterText(String str) {
        this.A0G = str;
        this.A07 = C86664Kz.A01(getResources(), R.dimen.f6nameremoved);
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0H) {
            this.A0H = true;
            generatedComponent();
        }
        this.A0K = AnonymousClass002.A07();
        this.A0J = C86664Kz.A0Z();
        this.A0G = null;
        C86624Kv.A0g(context, attributeSet, this);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int paddingLeft = getPaddingLeft();
        float min = ((float) Math.min((i - paddingLeft) - getPaddingRight(), (i2 - getPaddingTop()) - getPaddingBottom())) / 2.0f;
        float f = min - (this.A05 * min);
        this.A04 = f;
        float f2 = (float) (i / 2);
        float f3 = (float) (i2 / 2);
        this.A0K.set(f2 - f, f3 - f, f2 + f, f3 + f);
    }

    public void setFillColor(int i) {
        this.A09 = i;
    }

    public void setKnobEnabled(boolean z) {
        this.A0I = z;
    }

    public void setPaintStrokeFactor(float f) {
        this.A06 = f;
    }

    public void setProgressBarBackgroundColor(int i) {
        this.A0B = i;
    }

    public void setProgressBarColor(int i) {
        this.A0C = i;
    }

    public void setRadiusFactor(float f) {
        this.A05 = f;
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A0H) {
            this.A0H = true;
            generatedComponent();
        }
        this.A0K = AnonymousClass002.A07();
        this.A0J = C86664Kz.A0Z();
        this.A0G = null;
        C86624Kv.A0g(context, attributeSet, this);
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A0H) {
            this.A0H = true;
            generatedComponent();
        }
    }

    public CircularProgressBar(Context context) {
        super(context);
        if (!this.A0H) {
            this.A0H = true;
            generatedComponent();
        }
        this.A0K = AnonymousClass002.A07();
        this.A0J = C86664Kz.A0Z();
        this.A0G = null;
        C86624Kv.A0g(context, (AttributeSet) null, this);
    }
}
