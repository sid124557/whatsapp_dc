package X;

import android.graphics.Rect;
import android.text.TextPaint;
import android.text.style.SuperscriptSpan;

/* renamed from: X.942  reason: invalid class name */
public class AnonymousClass942 extends SuperscriptSpan {
    public float A00;
    public Rect A01;
    public String A02;

    public AnonymousClass942(String str) {
        this.A02 = str.equals(".") ? ".1" : str;
        this.A00 = 1.0f;
        this.A01 = new Rect();
    }

    public final void A00(TextPaint textPaint) {
        String str = this.A02;
        int length = str.length();
        Rect rect = this.A01;
        textPaint.getTextBounds(str, 0, length, rect);
        int i = rect.top;
        float ascent = textPaint.ascent();
        float textSize = textPaint.getTextSize();
        float f = this.A00;
        textPaint.setTextSize(textSize * f);
        textPaint.getTextBounds(str, 0, length, rect);
        int i2 = rect.top;
        textPaint.baselineShift = (int) (((float) textPaint.baselineShift) + ((float) (i - i2)) + (((((float) i) - ascent) - (((float) i2) - textPaint.ascent())) * f));
    }

    public void updateDrawState(TextPaint textPaint) {
        A00(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        A00(textPaint);
    }
}
