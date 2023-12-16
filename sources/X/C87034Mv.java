package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;

/* renamed from: X.4Mv  reason: invalid class name and case insensitive filesystem */
public class C87034Mv extends ImageSpan {
    public WeakReference A00;

    public C87034Mv(Drawable drawable) {
        super(drawable, 0);
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable;
        WeakReference weakReference = this.A00;
        if (weakReference == null || (drawable = (Drawable) weakReference.get()) == null) {
            drawable = getDrawable();
            this.A00 = AnonymousClass0x9.A14(drawable);
        }
        C86644Kx.A0p(canvas, paint, drawable, f, i4);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Drawable drawable;
        WeakReference weakReference = this.A00;
        if (weakReference == null || (drawable = (Drawable) weakReference.get()) == null) {
            drawable = getDrawable();
            this.A00 = AnonymousClass0x9.A14(drawable);
        }
        Rect bounds = drawable.getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return bounds.right;
    }
}
