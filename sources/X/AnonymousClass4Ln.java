package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.4Ln  reason: invalid class name */
public class AnonymousClass4Ln extends Drawable {
    public int A00;
    public final Paint A01 = C86604Kt.A0B();
    public final Path A02 = AnonymousClass002.A06();
    public final Rect A03 = AnonymousClass001.A0N();
    public final RectF A04 = AnonymousClass002.A07();

    public int getOpacity() {
        return -3;
    }

    public AnonymousClass4Ln(int i) {
        this.A00 = i;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int width = bounds.width();
        Rect rect = this.A03;
        int max = Math.max(0, (width - rect.left) - rect.right);
        int A0C = AnonymousClass001.A0C(bounds.height() - rect.top, rect.bottom, 0);
        Path path = this.A02;
        path.rewind();
        if (max > A0C) {
            int i = A0C / 2;
            float f = (float) i;
            path.moveTo(f, 0.0f);
            path.lineTo((float) (max - i), 0.0f);
            RectF rectF = this.A04;
            float f2 = (float) A0C;
            rectF.set((float) (max - A0C), 0.0f, (float) max, f2);
            path.arcTo(rectF, -90.0f, 180.0f);
            path.lineTo(f, f2);
            rectF.set(0.0f, 0.0f, f2, f2);
            path.arcTo(rectF, 90.0f, 180.0f);
        } else if (max < A0C) {
            int i2 = max / 2;
            float f3 = (float) i2;
            path.moveTo(0.0f, f3);
            path.lineTo(0.0f, (float) (A0C - i2));
            RectF rectF2 = this.A04;
            float f4 = (float) max;
            rectF2.set(0.0f, (float) (A0C - max), f4, (float) A0C);
            path.arcTo(rectF2, -180.0f, -180.0f);
            path.lineTo(f4, f3);
            rectF2.set(0.0f, 0.0f, f4, f4);
            path.arcTo(rectF2, 0.0f, -180.0f);
        } else {
            RectF rectF3 = this.A04;
            rectF3.set(0.0f, 0.0f, (float) max, (float) A0C);
            path.addOval(rectF3, Path.Direction.CW);
        }
        path.close();
        path.setFillType(Path.FillType.WINDING);
        Paint paint = this.A01;
        C86604Kt.A0u(this.A00, paint);
        canvas.translate((float) (bounds.left + rect.left), (float) (bounds.top + rect.top));
        canvas.drawPath(path, paint);
        canvas.translate((float) (-(bounds.left + rect.left)), (float) (-(bounds.top + rect.top)));
    }

    public boolean isStateful() {
        return AnonymousClass000.A1S(super.isStateful() ? 1 : 0);
    }

    public boolean onStateChange(int[] iArr) {
        return false;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
