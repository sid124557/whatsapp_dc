package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.54J  reason: invalid class name */
public class AnonymousClass54J extends C87044Mw {
    public Paint.FontMetricsInt A00;
    public C86714Le A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final CharSequence A05;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r2[0] == r6) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A07(java.lang.CharSequence r7, int r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof android.text.Spanned
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L_0x002b
            r2 = r7
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.CharSequence r0 = r6.A05
            int r1 = r0.length()
            int r1 = r1 + r8
            java.lang.Class<X.54J> r0 = X.AnonymousClass54J.class
            java.lang.Object[] r2 = r2.getSpans(r8, r1, r0)
            X.54J[] r2 = (X.AnonymousClass54J[]) r2
            char r1 = r7.charAt(r8)
            r0 = 65532(0xfffc, float:9.183E-41)
            if (r1 != r0) goto L_0x002b
            if (r2 == 0) goto L_0x002b
            int r0 = r2.length
            if (r0 <= 0) goto L_0x002b
            r0 = r2[r4]
            if (r0 != r6) goto L_0x002b
        L_0x002a:
            return r5
        L_0x002b:
            r3 = 0
        L_0x002c:
            java.lang.CharSequence r1 = r6.A05
            int r0 = r1.length()
            if (r3 >= r0) goto L_0x002a
            int r2 = r8 + r3
            int r0 = r7.length()
            if (r2 >= r0) goto L_0x002a
            char r1 = r1.charAt(r3)
            char r0 = r7.charAt(r2)
            if (r1 == r0) goto L_0x0047
            return r4
        L_0x0047:
            int r3 = r3 + 1
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54J.A07(java.lang.CharSequence, int):boolean");
    }

    public AnonymousClass54J(Context context, Paint.FontMetricsInt fontMetricsInt, Drawable drawable, CharSequence charSequence) {
        super(drawable);
        this.A05 = charSequence;
        this.A04 = AnonymousClass0Y8.A04(context, C18290x4.A00(context));
        this.A03 = (int) C86604Kt.A00(context);
        this.A00 = fontMetricsInt;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (A07(charSequence, i)) {
            Canvas canvas2 = canvas;
            float f2 = f;
            int i6 = i4;
            Paint paint2 = paint;
            if (this.A02) {
                C86714Le r10 = this.A01;
                if (r10 == null) {
                    r10 = new C86714Le(this.A04, paint2);
                    this.A01 = r10;
                }
                float f3 = (float) (A06().getBounds().right + this.A03);
                float f4 = ((float) i6) + r10.A00 + (r10.A01 / 2.0f);
                canvas2.drawLine(f2, f4, f + f3, f4, r10);
            }
            C86644Kx.A0p(canvas, paint2, A06(), f2, i6);
        }
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = A06().getBounds();
        if (fontMetricsInt != null) {
            int height = bounds.height();
            Paint.FontMetricsInt fontMetricsInt2 = this.A00;
            int i3 = fontMetricsInt2.descent;
            int i4 = fontMetricsInt2.ascent;
            int max = Math.max(0, (height - i3) + i4);
            fontMetricsInt.ascent = i4 - max;
            fontMetricsInt.descent = i3 + max;
            fontMetricsInt.top = fontMetricsInt2.top - max;
            fontMetricsInt.bottom = fontMetricsInt2.bottom + max;
        }
        if (A07(charSequence, i)) {
            return bounds.right + this.A03;
        }
        return 0;
    }
}
