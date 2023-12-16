package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: X.5Av  reason: invalid class name and case insensitive filesystem */
public class C100415Av {
    public static Bitmap A00(Drawable... drawableArr) {
        int length = drawableArr.length;
        if (length == 0) {
            return null;
        }
        Bitmap A0Y = C86664Kz.A0Y(Math.max(drawableArr[0].getIntrinsicWidth(), 0), Math.max(drawableArr[0].getIntrinsicHeight(), 0));
        Canvas A06 = AnonymousClass4L0.A06(A0Y);
        int i = 0;
        do {
            Drawable drawable = drawableArr[i];
            drawable.setBounds(0, 0, Math.max(drawable.getIntrinsicWidth(), 0), Math.max(drawable.getIntrinsicHeight(), 0));
            drawable.draw(A06);
            i++;
        } while (i < length);
        return A0Y;
    }
}
