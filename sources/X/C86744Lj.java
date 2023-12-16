package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: X.4Lj  reason: invalid class name and case insensitive filesystem */
public class C86744Lj extends Drawable {
    public final float A00;
    public final Paint A01 = C86664Kz.A0Z();
    public final int[] A02;

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i) {
        this.A01.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
    }

    public C86744Lj(int[] iArr, float f) {
        this.A02 = iArr;
        this.A00 = f;
    }

    public void draw(Canvas canvas) {
        int A012 = C86644Kx.A01(this);
        int A03 = C86654Ky.A03(this);
        Paint paint = this.A01;
        paint.setTextSize(((float) A012) * this.A00);
        AnonymousClass001.A10(paint);
        paint.setAlpha(255);
        paint.setTextAlign(Paint.Align.CENTER);
        int i = A012 / 2;
        int descent = (int) (((float) (A03 / 2)) - ((paint.descent() + paint.ascent()) / 2.0f));
        int[] iArr = this.A02;
        StringBuilder A0o = AnonymousClass001.A0o();
        for (int appendCodePoint : iArr) {
            A0o.appendCodePoint(appendCodePoint);
        }
        String obj = A0o.toString();
        if (!AnonymousClass0S9.A00(paint, obj)) {
            obj = C157857j0.A00;
        }
        canvas.drawText(obj, (float) i, (float) descent, paint);
    }
}
