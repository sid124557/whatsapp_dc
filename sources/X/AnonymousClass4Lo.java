package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;

/* renamed from: X.4Lo  reason: invalid class name */
public class AnonymousClass4Lo extends Drawable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Paint A03;
    public final Paint A04;
    public final Rect A05;
    public final String A06;

    public int getIntrinsicHeight() {
        return this.A00;
    }

    public int getIntrinsicWidth() {
        return this.A01;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.A04.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
    }

    public AnonymousClass4Lo(Typeface typeface, String str, int i, int i2, int i3, int i4, int i5) {
        this.A06 = str;
        this.A02 = i4;
        TextPaint textPaint = new TextPaint();
        this.A04 = textPaint;
        textPaint.setColor(i2);
        Paint A0Z = C86664Kz.A0Z();
        this.A03 = A0Z;
        Paint.Style style = Paint.Style.FILL;
        A0Z.setStyle(style);
        A0Z.setColor(i);
        A0Z.setAntiAlias(true);
        textPaint.setTextSize((float) i3);
        textPaint.setStyle(style);
        textPaint.setColor(i2);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setAntiAlias(true);
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        Rect A0N = AnonymousClass001.A0N();
        this.A05 = A0N;
        textPaint.getTextBounds(str, 0, str.length(), A0N);
        int i6 = i4 * 2;
        this.A01 = A0N.width() + i6 + (i5 * 2);
        this.A00 = A0N.height() + i6;
    }

    public void draw(Canvas canvas) {
        int A012 = C86644Kx.A01(this);
        Rect rect = this.A05;
        int A032 = (C86654Ky.A03(this) / 2) + (rect.height() / 2);
        float f = (float) (A012 / 2);
        float width = f - (((float) rect.width()) / 2.0f);
        int i = this.A02;
        float f2 = (float) i;
        RectF A09 = AnonymousClass4L0.A09(width - f2, (float) ((A032 - rect.height()) - i), width + ((float) rect.width()) + f2, (float) (i + A032));
        float height = ((float) (rect.height() + (i * 2))) / 2.0f;
        canvas.drawRoundRect(A09, height, height, this.A03);
        String str = this.A06;
        canvas.drawText(str, 0, str.length(), f, (float) A032, this.A04);
    }
}
