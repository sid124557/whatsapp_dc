package com.whatsapp.calling.callgrid.view;

import X.AnonymousClass0VX;
import X.AnonymousClass0YG;
import X.AnonymousClass1VX;
import X.AnonymousClass4GJ;
import X.AnonymousClass4L0;
import X.C100855Cn;
import X.C111685iW;
import X.C116855qy;
import X.C64333Db;
import X.C86604Kt;
import X.C86614Ku;
import X.C86654Ky;
import X.C88864av;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.whatsapp.R;
import java.util.Random;

public class VoiceParticipantAudioWave extends View implements AnonymousClass4GJ {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ValueAnimator A06;
    public ValueAnimator A07;
    public Paint A08;
    public Drawable A09;
    public AnonymousClass1VX A0A;
    public C116855qy A0B;
    public boolean A0C;
    public boolean A0D;
    public double[] A0E;
    public double[] A0F;
    public double[] A0G;
    public final Interpolator A0H;
    public final Random A0I;

    public void setAudioLevel(float f) {
        A02(f, true);
    }

    public void A00() {
        if (!this.A0C) {
            this.A0C = true;
            this.A0A = C64333Db.A4B(((C88864av) ((C111685iW) generatedComponent())).A0K);
        }
    }

    public final void A03(Context context, AttributeSet attributeSet) {
        this.A02 = this.A0A.A0N(1106);
        int min = Math.min(this.A0A.A0N(1213), 127);
        this.A04 = min;
        if (min >= 127) {
            this.A04 = 0;
        }
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = C86614Ku.A0C(this).obtainStyledAttributes(attributeSet, C100855Cn.A00, 0, 0);
            try {
                this.A03 = obtainStyledAttributes.getDimensionPixelSize(0, this.A03);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        Paint paint = this.A08;
        paint.setStrokeCap(Paint.Cap.ROUND);
        C86614Ku.A10(getContext(), paint, 17170443);
        paint.setStrokeWidth((float) this.A03);
        A01();
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0B;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        int i;
        Drawable drawable;
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        if (!this.A0D || (drawable = this.A09) == null) {
            i = Integer.MAX_VALUE;
        } else {
            i = (this.A0E.length - 5) / 2;
            int i2 = this.A03;
            int i3 = i2 * 9;
            int i4 = i3 / 2;
            int i5 = this.A03;
            drawable.setBounds(this.A05 + i2 + (i2 * 2 * i), C86654Ky.A04(this) - i4, this.A05 + i5 + (i5 * 2 * i) + i3, C86654Ky.A04(this) + i4);
            this.A09.draw(canvas2);
        }
        for (int i6 = 0; i6 < this.A0E.length; i6++) {
            if (i6 < i || i6 >= i + 5) {
                int i7 = this.A03;
                int i8 = this.A05 + i7 + (i7 * 2 * i6);
                double d = this.A0G[i6];
                double d2 = this.A0F[i6];
                float f = ((float) (((d - d2) * ((double) this.A00)) + d2)) / 2.0f;
                canvas2.drawLine((float) i8, ((float) C86654Ky.A04(this)) - f, (float) (i8 + 1), ((float) C86654Ky.A04(this)) + f, this.A08);
            }
        }
    }

    public void setColor(int i) {
        Paint paint = this.A08;
        paint.setColor(i);
        Drawable drawable = this.A09;
        if (drawable != null) {
            AnonymousClass0YG.A06(drawable, paint.getColor());
        }
        invalidate();
    }

    public void setMuteIconVisibility(boolean z) {
        if (this.A0D != z) {
            this.A0D = z;
            Drawable drawable = this.A09;
            if (drawable == null) {
                drawable = AnonymousClass0VX.A01(getContext(), R.drawable.vec_ic_voip_voice_mute);
                this.A09 = drawable;
            }
            AnonymousClass0YG.A06(drawable, this.A08.getColor());
            invalidate();
        }
    }

    public VoiceParticipantAudioWave(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0I = C86604Kt.A0t(this);
        this.A0H = new LinearInterpolator();
        A03(context, attributeSet);
    }

    private int getLineCount() {
        if (getWidth() == 0) {
            return 0;
        }
        int width = getWidth();
        int i = this.A03;
        int i2 = (width - i) / (i * 2);
        if (i2 % 2 == 0) {
            i2--;
        }
        this.A05 = (getWidth() - ((i2 * 2) * this.A03)) / 2;
        return i2;
    }

    public final void A01() {
        int lineCount = getLineCount();
        if (lineCount > 0) {
            this.A0E = new double[lineCount];
            int i = lineCount / 2;
            double pow = Math.pow(3.0d / ((double) getHeight()), 1.0d / ((double) i));
            this.A0E[i] = (double) getHeight();
            int i2 = 1;
            while (true) {
                int i3 = i - i2;
                if (i3 >= 0) {
                    double[] dArr = this.A0E;
                    double d = dArr[i3 + 1] * pow;
                    dArr[i3] = d;
                    int i4 = i + i2;
                    if (i4 < lineCount) {
                        dArr[i4] = d;
                    }
                    i2++;
                } else {
                    this.A0F = new double[lineCount];
                    this.A0G = new double[lineCount];
                    return;
                }
            }
        }
    }

    public final void A02(float f, boolean z) {
        long j;
        if (getVisibility() == 0) {
            ValueAnimator valueAnimator = this.A06;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.A0F = this.A0G;
            this.A0G = new double[this.A0E.length];
            int i = this.A04;
            float f2 = (float) i;
            float max = Math.max(f, f2);
            float f3 = (max - f2) / ((float) (127 - i));
            int i2 = 1;
            while (true) {
                double[] dArr = this.A0E;
                if (i2 >= dArr.length - 1) {
                    break;
                }
                double[] dArr2 = this.A0G;
                double d = dArr[i2];
                Random random = this.A0I;
                if (random.nextFloat() < 0.3f) {
                    d = ((double) ((random.nextFloat() * 0.7f) + 0.3f)) * d;
                }
                dArr2[i2] = d * ((double) f3);
                i2++;
            }
            float[] A0T = AnonymousClass4L0.A0T();
            // fill-array-data instruction
            A0T[0] = 0;
            A0T[1] = 1065353216;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(A0T);
            this.A06 = ofFloat;
            if (z) {
                j = (long) this.A02;
            } else {
                j = 0;
            }
            ofFloat.setDuration(j);
            this.A06.setInterpolator(this.A0H);
            C86604Kt.A0w(this.A06, this, 14);
            this.A06.start();
            this.A01 = max;
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        A01();
        A02(this.A01, true);
    }

    public VoiceParticipantAudioWave(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0I = C86604Kt.A0t(this);
        this.A0H = new LinearInterpolator();
        A03(context, attributeSet);
    }

    public VoiceParticipantAudioWave(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A0I = C86604Kt.A0t(this);
        this.A0H = new LinearInterpolator();
        A03(context, attributeSet);
    }

    public VoiceParticipantAudioWave(Context context) {
        super(context);
        this.A0I = C86604Kt.A0t(this);
        this.A0H = new LinearInterpolator();
        A03(context, (AttributeSet) null);
    }

    public VoiceParticipantAudioWave(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
