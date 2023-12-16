package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import android.text.style.UpdateLayout;

/* renamed from: X.4My  reason: invalid class name and case insensitive filesystem */
public final class C87064My extends LeadingMarginSpan.Standard implements UpdateLayout {
    public final int A00;
    public final int A01;

    public C87064My(int i, int i2) {
        super(0);
        this.A00 = i;
        this.A01 = i2;
    }

    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        C18260x0.A0O(canvas, paint);
        C162457s7.A0J(charSequence, 7);
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            AnonymousClass001.A10(paint);
            int i8 = this.A00;
            canvas.drawCircle((float) (i + (i2 * i8)), (((float) (i3 + i5)) / 2.0f) + ((float) 2), (float) i8, paint);
            paint.setStyle(style);
        }
    }

    public int getLeadingMargin(boolean z) {
        return this.A01;
    }

    public C87064My() {
        this(4, 2);
    }
}
