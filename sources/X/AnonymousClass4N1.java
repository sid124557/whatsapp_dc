package X;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

/* renamed from: X.4N1  reason: invalid class name */
public class AnonymousClass4N1 extends TypefaceSpan {
    public final Typeface A00 = C106905aM.A02();

    public AnonymousClass4N1() {
        super("");
    }

    public void updateDrawState(TextPaint textPaint) {
        A00(textPaint, this.A00);
    }

    public void updateMeasureState(TextPaint textPaint) {
        A00(textPaint, this.A00);
    }

    public static void A00(Paint paint, Typeface typeface) {
        int style;
        Typeface typeface2 = paint.getTypeface();
        if (typeface2 == null) {
            style = 0;
        } else {
            style = typeface2.getStyle();
        }
        if ((style & (~typeface.getStyle()) & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface);
    }
}
