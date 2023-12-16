package X;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.6EH  reason: invalid class name */
public class AnonymousClass6EH extends MetricAffectingSpan {
    public final Typeface A00;

    public AnonymousClass6EH(Typeface typeface) {
        this.A00 = typeface;
    }

    public final void A00(Paint paint) {
        int style;
        Typeface typeface = paint.getTypeface();
        if (typeface == null) {
            style = 0;
        } else {
            style = typeface.getStyle();
        }
        Typeface typeface2 = this.A00;
        int i = style & (~typeface2.getStyle());
        if ((i & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((i & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface2);
    }

    public void updateDrawState(TextPaint textPaint) {
        A00(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        A00(textPaint);
    }
}
