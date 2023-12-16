package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.6Cy  reason: invalid class name and case insensitive filesystem */
public class C124546Cy extends Drawable {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public final Paint A04;
    public final Paint A05 = new Paint(5);
    public final Path A06;
    public final Path A07;
    public final Rect A08;
    public final RectF A09;
    public final RectF A0A;
    public final float[] A0B;

    public void draw(Canvas canvas) {
        if (C159417ln.A02(this.A03)) {
            RectF rectF = this.A0A;
            float f = this.A02;
            canvas.drawRoundRect(rectF, f, f, this.A05);
            Paint paint = this.A04;
            if (paint.getStrokeWidth() != 0.0f) {
                RectF rectF2 = this.A09;
                float f2 = this.A01;
                canvas.drawRoundRect(rectF2, f2, f2, paint);
                return;
            }
            return;
        }
        canvas.drawPath(this.A07, this.A05);
        Paint paint2 = this.A04;
        if (paint2.getStrokeWidth() != 0.0f) {
            canvas.drawPath(this.A06, paint2);
        }
    }

    public int getOpacity() {
        return -1;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.A08, this.A02);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C124546Cy() {
        Paint A0B2 = C86604Kt.A0B();
        this.A04 = A0B2;
        this.A0A = AnonymousClass002.A07();
        this.A08 = AnonymousClass001.A0N();
        this.A09 = AnonymousClass002.A07();
        this.A07 = AnonymousClass002.A06();
        this.A06 = AnonymousClass002.A06();
        this.A0B = new float[8];
        A0B2.setStyle(Paint.Style.STROKE);
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.A0A;
        rectF.set(rect);
        this.A08.set(rect);
        RectF rectF2 = this.A09;
        float f = this.A00;
        rectF2.set(((float) rect.left) + f, ((float) rect.top) + f, ((float) rect.right) - f, ((float) rect.bottom) - f);
        int i = this.A03;
        if (!C159417ln.A02(i)) {
            Path path = this.A07;
            float f2 = this.A02;
            float[] fArr = this.A0B;
            C159417ln.A01(fArr, f2, i);
            path.reset();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            if (this.A04.getStrokeWidth() != 0.0f) {
                Path path2 = this.A06;
                C159417ln.A01(fArr, this.A01, this.A03);
                path2.reset();
                path2.addRoundRect(rectF2, fArr, Path.Direction.CW);
            }
        }
    }
}
