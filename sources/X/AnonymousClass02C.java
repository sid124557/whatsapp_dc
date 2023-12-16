package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* renamed from: X.02C  reason: invalid class name */
public class AnonymousClass02C extends CharacterStyle {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.A02, this.A00, this.A01, this.A03);
    }

    public AnonymousClass02C(float f, float f2, float f3, int i) {
        this.A02 = f;
        this.A00 = f2;
        this.A01 = f3;
        this.A03 = i;
    }
}
