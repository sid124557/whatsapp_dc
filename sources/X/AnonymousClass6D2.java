package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: X.6D2  reason: invalid class name */
public class AnonymousClass6D2 extends Drawable {
    public Rect A00 = AnonymousClass001.A0N();
    public final int A01;
    public final Paint A02;
    public final Path A03;
    public final Path A04;
    public final Path A05;
    public final Path A06;

    public static Path A00(C140896uh r5, int i) {
        Region region = new Region(((int) r5.left) * i, ((int) r5.top) * i, ((int) r5.right) * i, ((int) r5.bottom) * i);
        Path A062 = AnonymousClass002.A06();
        float f = (float) i;
        A062.addCircle(f, f, f, Path.Direction.CW);
        Region region2 = new Region();
        region2.setPath(A062, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region.getBoundaryPath();
    }

    public int getOpacity() {
        return -2;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass6D2(int i, int i2) {
        this.A01 = i;
        Paint paint = new Paint();
        this.A02 = paint;
        paint.setColor(i2);
        this.A05 = A00(C140896uh.TOP_LEFT, i);
        this.A06 = A00(C140896uh.TOP_RIGHT, i);
        this.A03 = A00(C140896uh.BOTTOM_LEFT, i);
        this.A04 = A00(C140896uh.BOTTOM_RIGHT, i);
    }

    public void draw(Canvas canvas) {
        int width = getBounds().width();
        int i = this.A01 * 2;
        Rect rect = this.A00;
        float f = (float) (((width - i) - rect.left) - rect.right);
        int height = getBounds().height() - i;
        Rect rect2 = this.A00;
        int i2 = rect2.top;
        canvas.translate((float) rect2.left, (float) i2);
        Path path = this.A05;
        Paint paint = this.A02;
        canvas.drawPath(path, paint);
        path.close();
        canvas.translate(f, 0.0f);
        Path path2 = this.A06;
        canvas.drawPath(path2, paint);
        path2.close();
        canvas.translate(0.0f, (float) ((height - i2) - rect2.bottom));
        Path path3 = this.A04;
        canvas.drawPath(path3, paint);
        path3.close();
        canvas.translate(-f, 0.0f);
        Path path4 = this.A03;
        canvas.drawPath(path4, paint);
        path4.close();
    }
}
