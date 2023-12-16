package X;

import android.graphics.Bitmap;

/* renamed from: X.5CF  reason: invalid class name */
public final class AnonymousClass5CF {
    public static final Bitmap A00(Bitmap bitmap, int i, int i2) {
        if (!(i == 0 || i2 == 0 || bitmap.getWidth() == 0 || bitmap.getHeight() == 0)) {
            float A00 = C86664Kz.A00((float) i2, (float) bitmap.getHeight(), ((float) i) / ((float) bitmap.getWidth()));
            if (A00 != 1.0f) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * A00), (int) (((float) bitmap.getHeight()) * A00), true);
                C162457s7.A0D(createScaledBitmap);
                if (!createScaledBitmap.equals(bitmap)) {
                    bitmap.recycle();
                }
                return createScaledBitmap;
            }
        }
        return bitmap;
    }
}
