package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.whatsapp.R;

/* renamed from: X.93p  reason: invalid class name and case insensitive filesystem */
public class C1900393p extends Drawable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Paint A06 = C86604Kt.A0B();

    public final void A00(Canvas canvas, float f, float f2) {
        int i = 0;
        do {
            int i2 = (this.A00 * i) + 50;
            Paint paint = this.A06;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth((float) this.A05);
            paint.setColor(this.A01);
            canvas.drawCircle(f, f2, (float) i2, paint);
            i++;
        } while (i < 62);
    }

    public C1900393p(Context context) {
        this.A05 = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A01 = context.getResources().getColor(R.color.f5nameremoved);
        this.A04 = context.getResources().getColor(R.color.f5nameremoved);
        this.A03 = context.getResources().getColor(R.color.f5nameremoved);
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{this.A04, this.A03});
        float f = (float) this.A02;
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setBounds(0, 0, width, height);
        gradientDrawable.draw(canvas);
        RectF rectF = new RectF(0.0f, 0.0f, (float) width, (float) height);
        Path path = new Path();
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(path);
        float f2 = (float) (height + 120);
        A00(canvas, 100.0f, f2);
        A00(canvas, (float) (width - 100), f2);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
