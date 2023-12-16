package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.InsetDrawable;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: X.4M6  reason: invalid class name */
public class AnonymousClass4M6 extends InsetDrawable {
    public int A00;
    public int A01;
    public final Rect A02 = AnonymousClass001.A0N();
    public final TextPaint A03;
    public final String A04;

    public AnonymousClass4M6(Context context, String str, int i, int i2) {
        super(AnonymousClass0RP.A00(context, i), 0);
        TextPaint textPaint = new TextPaint();
        this.A03 = textPaint;
        this.A04 = str;
        textPaint.setAntiAlias(true);
        C86614Ku.A10(context, textPaint, 17170443);
        textPaint.setTextSize((float) i2);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        String str = this.A04;
        if (!TextUtils.isEmpty(str)) {
            if (!(this.A01 == C86644Kx.A01(this) && this.A00 == C86654Ky.A03(this))) {
                this.A01 = C86644Kx.A01(this);
                int A032 = C86654Ky.A03(this);
                this.A00 = A032;
                float f = (float) (A032 / 2);
                TextPaint textPaint = this.A03;
                textPaint.setTextSize(f);
                int length = str.length();
                Rect rect = this.A02;
                textPaint.getTextBounds(str, 0, length, rect);
                float f2 = f;
                float f3 = f;
                float f4 = 2.0f;
                while (f2 - f4 > 2.0f) {
                    textPaint.setTextSize(f3);
                    textPaint.getTextBounds(str, 0, length, rect);
                    if (rect.width() >= (this.A01 * 8) / 10 || rect.height() >= this.A00 / 2) {
                        f2 = f3;
                    } else {
                        f4 = f3;
                        if (f == f3) {
                            break;
                        }
                    }
                    f3 = (f4 + f2) / 2.0f;
                }
                textPaint.setTextSize(f4);
            }
            canvas.drawText(str, (float) getBounds().centerX(), (float) (getBounds().centerY() + (this.A02.height() / 2) + (this.A00 / 10)), this.A03);
        }
    }
}
