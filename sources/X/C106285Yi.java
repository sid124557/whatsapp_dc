package X;

import android.graphics.Paint;
import android.os.Build;

/* renamed from: X.5Yi  reason: invalid class name and case insensitive filesystem */
public class C106285Yi {
    public static final C04840Qw A00 = new C04840Qw(50);

    public static Paint.FontMetricsInt A00(Paint paint) {
        int i;
        if (Build.VERSION.SDK_INT > 23 || !Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
            return paint.getFontMetricsInt();
        }
        int floatToIntBits = (((((Float.floatToIntBits(paint.getTextSize()) + 31) * 31) + Float.floatToIntBits(paint.getTextSkewX())) * 31) + Float.floatToIntBits(C86634Kw.A00(paint.isFakeBoldText() ? 1 : 0))) * 31;
        if (paint.getTypeface() != null) {
            i = paint.getTypeface().hashCode();
        } else {
            i = 0;
        }
        C04840Qw r2 = A00;
        Integer valueOf = Integer.valueOf(floatToIntBits + i);
        Paint.FontMetricsInt fontMetricsInt = (Paint.FontMetricsInt) r2.A04(valueOf);
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        r2.A08(valueOf, fontMetricsInt2);
        return fontMetricsInt2;
    }
}
