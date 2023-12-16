package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.5C7  reason: invalid class name */
public final class AnonymousClass5C7 {
    public static final Bitmap A00(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (drawable.getIntrinsicHeight() <= 0 || drawable.getIntrinsicWidth() <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.RGB_565);
        C162457s7.A0D(createBitmap);
        Canvas A06 = AnonymousClass4L0.A06(createBitmap);
        drawable.setBounds(0, 0, A06.getWidth(), A06.getHeight());
        drawable.draw(A06);
        return createBitmap;
    }
}
