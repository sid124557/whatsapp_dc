package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.4Ll  reason: invalid class name */
public final class AnonymousClass4Ll extends Drawable {
    public final int A00;
    public final int A01;
    public final Bitmap A02;
    public final Matrix A03 = AnonymousClass002.A05();
    public final Paint A04;
    public final Paint A05;

    public void draw(Canvas canvas) {
        C162457s7.A0J(canvas, 0);
        canvas.drawRect(getBounds(), this.A04);
        canvas.drawBitmap(this.A02, this.A03, this.A05);
    }

    public void onBoundsChange(Rect rect) {
        float f;
        float f2;
        C162457s7.A0J(rect, 0);
        super.onBoundsChange(rect);
        int A012 = C86644Kx.A01(this);
        int A032 = C86654Ky.A03(this);
        int i = this.A01;
        int i2 = i * A032;
        int i3 = this.A00;
        float f3 = 0.0f;
        if (i2 > A012 * i3) {
            f = ((float) A032) / ((float) i3);
            f3 = (((float) A012) - (((float) i) * f)) * 0.5f;
            f2 = 0.0f;
        } else {
            f = ((float) A012) / ((float) i);
            f2 = (((float) A032) - (((float) i3) * f)) * 0.5f;
        }
        Matrix matrix = this.A03;
        matrix.setScale(f, f);
        matrix.postTranslate(f3, f2);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.A04.setAlpha(i);
        this.A05.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
    }

    public AnonymousClass4Ll(int i, int i2, Bitmap bitmap) {
        this.A02 = bitmap;
        Paint A0Z = C86664Kz.A0Z();
        A0Z.setColor(i);
        this.A04 = A0Z;
        Paint A0Z2 = C86664Kz.A0Z();
        A0Z2.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        this.A05 = A0Z2;
        this.A01 = bitmap.getWidth();
        this.A00 = bitmap.getHeight();
    }
}
