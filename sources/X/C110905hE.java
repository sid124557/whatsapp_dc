package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/* renamed from: X.5hE  reason: invalid class name and case insensitive filesystem */
public class C110905hE implements C180318kq {
    public Bitmap B0P() {
        Paint A0a = C86664Kz.A0a(1);
        float f = C106915aN.A00 * 10.0f;
        int A07 = AnonymousClass001.A07(2.0f, f);
        int A072 = AnonymousClass001.A07(3.0f, f);
        Bitmap createBitmap = Bitmap.createBitmap(A07 + 10, A072 + 10, Bitmap.Config.ARGB_4444);
        Canvas A06 = AnonymousClass4L0.A06(createBitmap);
        float[] fArr = {240.0f, 1.0f, 1.0f};
        int HSVToColor = Color.HSVToColor(fArr);
        fArr[2] = 0.8f;
        int HSVToColor2 = Color.HSVToColor(fArr);
        fArr[2] = 0.5f;
        int HSVToColor3 = Color.HSVToColor(fArr);
        A0a.setColor(HSVToColor);
        float f2 = 5.0f + f;
        float f3 = (float) (A072 + 5);
        C106915aN.A03(A06, A0a, f2, f3, f);
        A0a.setColor(HSVToColor3);
        A06.drawCircle(f2, f2, f / 2.5f, A0a);
        C86634Kw.A17(A0a);
        A0a.setStrokeWidth(C106915aN.A00);
        A0a.setColor(HSVToColor2);
        C106915aN.A03(A06, A0a, f2, f3, f);
        return createBitmap;
    }
}
