package X;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.02F  reason: invalid class name */
public class AnonymousClass02F extends MetricAffectingSpan {
    public final Typeface A00;

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setTypeface(this.A00);
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(this.A00);
    }

    public AnonymousClass02F(Typeface typeface) {
        this.A00 = typeface;
    }
}
