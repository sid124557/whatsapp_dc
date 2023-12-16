package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: X.4l6  reason: invalid class name and case insensitive filesystem */
public class C91794l6 extends C91804l7 {
    public float A00 = 15.0f;
    public int A01 = 3;
    public int A02 = -1728053248;
    public int A03 = -1;
    public int A04 = 17;
    public Paint A05;
    public Rect A06;
    public RectF A07;
    public Drawable A08;
    public TextPaint A09;
    public CharSequence A0A;

    public void A07(Canvas canvas) {
        float f;
        float f2;
        Canvas canvas2 = canvas;
        super.A07(canvas2);
        if (!TextUtils.isEmpty(this.A0A)) {
            if (this.A05 == null) {
                Paint A0Z = C86664Kz.A0Z();
                this.A05 = A0Z;
                A0Z.setAntiAlias(true);
                AnonymousClass001.A10(this.A05);
                this.A05.setColor(this.A02);
            }
            if (this.A09 == null) {
                TextPaint textPaint = new TextPaint();
                this.A09 = textPaint;
                textPaint.setAntiAlias(true);
                this.A09.setColor(this.A03);
                this.A09.setTextSize(this.A00);
                this.A09.setTextAlign(Paint.Align.CENTER);
            }
            if (this.A07 == null) {
                this.A07 = AnonymousClass002.A07();
            }
            if (this.A06 == null) {
                this.A06 = AnonymousClass001.A0N();
            }
            float f3 = this.A00;
            float f4 = f3 * 1.25f;
            float f5 = f4 - f3;
            Path A062 = AnonymousClass002.A06();
            RectF rectF = this.A09;
            A062.moveTo(rectF.left, rectF.bottom - f4);
            A062.lineTo(rectF.right, rectF.bottom - f4);
            A062.lineTo(rectF.right, rectF.bottom - this.A02);
            RectF rectF2 = this.A07;
            float f6 = rectF.right;
            float f7 = this.A02 * 2.0f;
            float f8 = rectF.bottom;
            rectF2.set(f6 - f7, f8 - f7, f6, f8);
            A062.arcTo(this.A07, 0.0f, 90.0f);
            A062.lineTo(rectF.left + this.A02, rectF.bottom);
            RectF rectF3 = this.A07;
            float f9 = rectF.left;
            float f10 = rectF.bottom;
            float f11 = this.A02 * 2.0f;
            rectF3.set(f9, f10 - f11, f11 + f9, f10);
            A062.arcTo(this.A07, 90.0f, 90.0f);
            A062.lineTo(rectF.left, rectF.bottom - f4);
            canvas2.drawPath(A062, this.A05);
            String A0l = C86654Ky.A0l(this.A09, this.A0A, rectF.width() - this.A02);
            TextPaint textPaint2 = this.A09;
            int length = A0l.length();
            textPaint2.getTextBounds(A0l, 0, length, this.A06);
            int i = this.A04;
            if (i != 3) {
                float f12 = rectF.right;
                if (i != 5) {
                    f = (f12 + rectF.left) / 2.0f;
                } else {
                    Rect rect = this.A06;
                    f = (f12 - ((float) ((rect.right - rect.left) / 2))) - f5;
                }
            } else {
                float f13 = rectF.left;
                Rect rect2 = this.A06;
                f = f13 + ((float) ((rect2.right - rect2.left) / 2)) + f5;
            }
            canvas2.drawText(A0l, 0, length, f, ((rectF.bottom - (f4 / 2.0f)) + (this.A00 / 2.0f)) - (this.A09.descent() / 2.0f), this.A09);
            Drawable drawable = this.A08;
            if (drawable != null) {
                float intrinsicWidth = (((float) drawable.getIntrinsicWidth()) * this.A00) / ((float) this.A08.getIntrinsicHeight());
                if (this.A01 != 5) {
                    f2 = rectF.left + f5 + this.A02;
                } else {
                    f2 = ((rectF.right - f5) - this.A02) - intrinsicWidth;
                }
                int i2 = (int) f2;
                Drawable drawable2 = this.A08;
                float f14 = rectF.bottom;
                float f15 = f14 - f4;
                float f16 = (f4 - this.A00) / 2.0f;
                drawable2.setBounds(i2, (int) (f15 + f16), (int) (((float) i2) + intrinsicWidth), (int) (f14 - f16));
                this.A08.draw(canvas2);
            }
        }
    }

    public C91794l6(Context context) {
        super(context);
    }

    public void setIcon(Drawable drawable) {
        this.A08 = drawable;
    }

    public void setIconGravity(int i) {
        this.A01 = i;
    }

    public void setText(CharSequence charSequence) {
        this.A0A = charSequence;
    }

    public void setTextBackgroundColor(int i) {
        this.A02 = i;
    }

    public void setTextColor(int i) {
        this.A03 = i;
    }

    public void setTextGravity(int i) {
        this.A04 = i;
    }

    public void setTextSize(float f) {
        this.A00 = f;
    }
}
