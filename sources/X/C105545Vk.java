package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: X.5Vk  reason: invalid class name and case insensitive filesystem */
public final class C105545Vk {
    public static Paint A00;
    public static Paint A01;
    public static Paint A02;
    public static Paint A03;
    public static Paint A04;
    public static TextPaint A05;
    public static TextPaint A06;

    public static final Paint A00(Context context) {
        Paint paint = A00;
        if (paint == null) {
            paint = C86664Kz.A0Z();
            paint.setARGB(255, 255, 255, 255);
            paint.setTextSize(AnonymousClass5YI.A01(context, 12.0f));
            paint.setTextAlign(Paint.Align.LEFT);
            Typeface typeface = C1441770i.A00;
            if (typeface == null) {
                typeface = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Medium.ttf");
                C1441770i.A00 = typeface;
            }
            C626936e.A06(typeface);
            C162457s7.A0D(typeface);
            paint.setTypeface(typeface);
            C86634Kw.A17(paint);
            paint.setStrokeWidth(8.0f);
            A00 = paint;
        }
        return paint;
    }

    public static final Paint A01(Context context) {
        Paint paint = A04;
        if (paint != null) {
            return paint;
        }
        Paint A0Z = C86664Kz.A0Z();
        A0Z.setARGB(255, 255, 255, 255);
        A0Z.setTextSize(AnonymousClass5YI.A01(context, 10.0f));
        A0Z.setTextAlign(Paint.Align.LEFT);
        A0Z.setTypeface(Typeface.DEFAULT);
        C86634Kw.A17(A0Z);
        A0Z.setStrokeWidth(6.0f);
        A04 = A0Z;
        return A0Z;
    }
}
