package X;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.whatsapp.WaImageView;

/* renamed from: X.5AH  reason: invalid class name */
public final class AnonymousClass5AH {
    public static void A00(WaImageView waImageView, int i) {
        boolean z = true;
        if (!(i == 3 || i == 1)) {
            z = false;
        }
        Drawable drawable = waImageView.getDrawable();
        if (!z || drawable == null) {
            C86644Kx.A1A(waImageView);
            waImageView.setRotation(((float) i) * -90.0f);
            return;
        }
        waImageView.setRotation(0.0f);
        waImageView.setScaleType(ImageView.ScaleType.MATRIX);
        Matrix A05 = AnonymousClass002.A05();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int A06 = AnonymousClass000.A06(waImageView, waImageView.getWidth());
        int A052 = AnonymousClass000.A05(waImageView, waImageView.getHeight());
        int i2 = intrinsicWidth * A06;
        int i3 = A052 * intrinsicHeight;
        float f = (float) A052;
        float f2 = f;
        float f3 = (float) intrinsicWidth;
        float f4 = f3;
        if (i2 > i3) {
            f = (float) A06;
            f3 = (float) intrinsicHeight;
        }
        float f5 = f / f3;
        float f6 = (float) intrinsicHeight;
        A05.setRotate(((float) i) * -90.0f, f4 / 2.0f, f6 / 2.0f);
        A05.postScale(f5, f5);
        A05.postTranslate((float) Math.round((((float) A06) - (f4 * f5)) * 0.5f), (float) Math.round((f2 - (f6 * f5)) * 0.5f));
        waImageView.setImageMatrix(A05);
    }
}
