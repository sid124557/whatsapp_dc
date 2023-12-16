package com.whatsapp.qrcode;

import X.AnonymousClass0Y8;
import X.AnonymousClass34K;
import X.AnonymousClass4GJ;
import X.AnonymousClass4L0;
import X.AnonymousClass5Yj;
import X.C107335b8;
import X.C116855qy;
import X.C86604Kt;
import X.C86644Kx;
import X.C86664Kz;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public class QrEducationView extends View implements AnonymousClass4GJ {
    public float A00;
    public float A01;
    public int A02;
    public ValueAnimator A03;
    public Paint A04;
    public RectF A05;
    public Drawable A06;
    public Drawable A07;
    public Drawable A08;
    public Drawable A09;
    public Drawable A0A;
    public C116855qy A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;

    public final void A00() {
        if (this.A03 == null) {
            float[] A0T = AnonymousClass4L0.A0T();
            // fill-array-data instruction
            A0T[0] = 0;
            A0T[1] = 1065353216;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(A0T);
            this.A03 = ofFloat;
            ofFloat.setDuration(8000);
            this.A03.setRepeatCount(-1);
            C86644Kx.A0j(this.A03);
            C86604Kt.A0w(this.A03, this, 30);
        }
        this.A03.start();
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
        Drawable drawable;
        float f;
        float f2;
        float f3;
        int i;
        int i2;
        float f4;
        int width = getWidth();
        int height = getHeight();
        Canvas canvas2 = canvas;
        canvas2.translate((float) (width / 2), (float) (height / 2));
        if (this.A08.getIntrinsicHeight() + (this.A08.getIntrinsicWidth() / 3) > height) {
            float intrinsicHeight = ((float) height) / ((float) (this.A08.getIntrinsicHeight() + (this.A08.getIntrinsicWidth() / 3)));
            canvas2.scale(intrinsicHeight, intrinsicHeight);
        }
        float f5 = this.A00;
        if (f5 < 0.14f) {
            f5 = (f5 * f5) / 0.14f;
        } else if (f5 >= 0.2f && f5 < 0.3f) {
            f5 = ((float) (Math.sqrt((double) (f5 - 0.2f)) * Math.sqrt(0.10000000894069672d))) + 0.2f;
        }
        if (this.A0E) {
            this.A07.setAlpha(255);
            int intrinsicWidth = (int) ((((float) this.A07.getIntrinsicWidth()) * 1.0f) / 2.0f);
            int intrinsicHeight2 = (int) ((((float) this.A07.getIntrinsicHeight()) * 1.0f) / 2.0f);
            this.A07.setBounds(-intrinsicWidth, -intrinsicHeight2, intrinsicWidth, intrinsicHeight2);
            drawable = this.A07;
        } else {
            int intrinsicWidth2 = (int) ((((float) this.A0A.getIntrinsicWidth()) / 2.0f) * 1.3f);
            int intrinsicHeight3 = (int) ((((float) this.A0A.getIntrinsicHeight()) / 2.0f) * 1.3f);
            RectF rectF = this.A05;
            int i3 = intrinsicWidth2 * 2;
            rectF.left = (float) (-i3);
            rectF.top = (float) (intrinsicHeight3 * -2);
            rectF.bottom = (float) (intrinsicHeight3 * 2);
            rectF.right = (float) i3;
            float f6 = this.A01;
            canvas2.drawRoundRect(rectF, f6, f6, this.A04);
            this.A0A.setBounds(-intrinsicWidth2, -intrinsicHeight3, intrinsicWidth2, intrinsicHeight3);
            this.A0A.setColorFilter(this.A02, PorterDuff.Mode.SRC_IN);
            this.A0A.setAlpha(255);
            drawable = this.A0A;
        }
        drawable.draw(canvas2);
        float intrinsicWidth3 = (float) (this.A08.getIntrinsicWidth() / 2);
        float intrinsicHeight4 = (float) (this.A08.getIntrinsicHeight() / 2);
        if (f5 < 0.14f) {
            f2 = 0.0f;
            f = 1.2566371f - 0.0f;
            f3 = 0.0f;
            if (f5 > 0.0f) {
                if (f5 < 0.14f) {
                    f3 = (f5 - 0.0f) / (0.14f - 0.0f);
                }
                f3 = 1.0f;
            }
        } else {
            f2 = 1.2566371f;
            f = 1.5707964f - 1.2566371f;
            if (f5 <= 0.14f) {
                f3 = 0.0f;
            } else {
                if (f5 < 0.2f) {
                    f3 = (f5 - 0.14f) / (0.2f - 0.14f);
                }
                f3 = 1.0f;
            }
        }
        float f7 = f2 + (f * f3);
        float f8 = (-intrinsicWidth3) - ((intrinsicWidth3 * 3.0f) / 4.0f);
        float sin = (((float) Math.sin((double) f7)) * intrinsicWidth3) + f8;
        float f9 = intrinsicWidth3 / 6.0f;
        int i4 = (int) intrinsicWidth3;
        int i5 = (int) sin;
        int i6 = (int) intrinsicHeight4;
        int i7 = (int) f9;
        this.A08.setBounds((-i4) - i5, (-i6) + i7, i4 - i5, i6 + i7);
        this.A08.draw(canvas2);
        int i8 = this.A08.getBounds().left;
        int i9 = this.A08.getBounds().right;
        int i10 = (i9 - i8) / 7;
        canvas2.clipRect(i8 + i10, this.A08.getBounds().top, i9 - i10, this.A08.getBounds().bottom);
        float intrinsicWidth4 = (float) (this.A0A.getIntrinsicWidth() / 2);
        float intrinsicHeight5 = (float) (this.A0A.getIntrinsicHeight() / 2);
        float intrinsicWidth5 = (float) (this.A09.getIntrinsicWidth() / 2);
        float intrinsicHeight6 = (float) (this.A09.getIntrinsicHeight() / 2);
        float sin2 = sin - ((sin - (f8 + (((float) Math.sin(1.5707963267948966d)) * intrinsicWidth3))) / 3.0f);
        int i11 = (int) intrinsicWidth4;
        int i12 = (int) sin2;
        int i13 = (int) intrinsicHeight5;
        int i14 = (int) (f9 - (intrinsicHeight4 / 8.0f));
        this.A0A.setBounds((-i11) - i12, (-i13) + i14, i11 - i12, i13 + i14);
        int i15 = (int) intrinsicWidth5;
        int i16 = (int) intrinsicHeight6;
        this.A09.setBounds((-i15) - i12, (-i16) + i14, i15 - i12, i16 + i14);
        if (f5 > 0.2f) {
            float f10 = 255.0f - 0.0f;
            if (f5 <= 0.2f) {
                f4 = 0.0f;
            } else if (f5 >= 0.3f) {
                f4 = 1.0f;
            } else {
                f4 = (f5 - 0.2f) / (0.3f - 0.2f);
            }
            i2 = (int) (0.0f + (f10 * f4));
            i = (int) (255.0f + ((0.0f - 255.0f) * f4));
        } else {
            i = 255;
            i2 = 0;
        }
        this.A0A.setColorFilter((ColorFilter) null);
        this.A0A.setAlpha(i2);
        this.A09.setAlpha(i);
        this.A0A.draw(canvas2);
        this.A09.draw(canvas2);
        this.A06.setAlpha(((int) (Math.sin((double) (this.A00 * 30.0f)) * 127.0d)) + 127);
        int intrinsicWidth6 = (int) (((float) this.A06.getIntrinsicWidth()) / 2.0f);
        int intrinsicHeight7 = (int) (((float) this.A06.getIntrinsicHeight()) / 2.0f);
        this.A06.setBounds((-intrinsicWidth6) - i5, (-intrinsicHeight7) + i14, intrinsicWidth6 - i5, intrinsicHeight7 + i14);
        this.A06.draw(canvas2);
        canvas2.translate((float) ((-width) / 2), (float) ((-height) / 2));
    }

    public QrEducationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0C) {
            this.A0C = true;
            generatedComponent();
        }
        C86644Kx.A0n(context, this);
    }

    public final void A01(Context context) {
        Resources resources = context.getResources();
        this.A0A = resources.getDrawable(R.drawable.anim_qr_normal);
        this.A09 = resources.getDrawable(R.drawable.anim_qr_blurred);
        this.A07 = resources.getDrawable(R.drawable.anim_laptop);
        this.A08 = resources.getDrawable(R.drawable.anim_phone);
        this.A06 = C107335b8.A04(context, R.drawable.anim_frame, AnonymousClass34K.A01(getContext(), R.attr.f3nameremoved));
        int A032 = AnonymousClass5Yj.A03(getContext(), context, R.attr.f3nameremoved, R.color.f5nameremoved);
        this.A02 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        Paint A0Z = C86664Kz.A0Z();
        this.A04 = A0Z;
        A0Z.setAntiAlias(true);
        this.A04.setColor(A032);
        this.A01 = getResources().getDimension(R.dimen.f6nameremoved);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A00();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.A03 = null;
    }

    public void onMeasure(int i, int i2) {
        int min = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        setMeasuredDimension(min, min);
    }

    public void onVisibilityChanged(View view, int i) {
        if (getVisibility() == 0) {
            A00();
            return;
        }
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.A03 = null;
    }

    public void setShowLaptop(boolean z) {
        this.A0E = z;
    }

    public QrEducationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A0C) {
            this.A0C = true;
            generatedComponent();
        }
        C86644Kx.A0n(context, this);
    }

    public QrEducationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A0C) {
            this.A0C = true;
            generatedComponent();
        }
    }

    public QrEducationView(Context context) {
        super(context);
        if (!this.A0C) {
            this.A0C = true;
            generatedComponent();
        }
        C86644Kx.A0n(context, this);
    }
}
