package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: X.01C  reason: invalid class name */
public class AnonymousClass01C extends Drawable {
    public static final float[] A07 = {0.0f, 0.15428571f, 0.46666667f, 0.6027778f, 0.69166666f, 1.0f};
    public static final int[] A08;
    public static final int[] A09;
    public static final int[] A0A;
    public float A00;
    public float A01;
    public float A02;
    public final float A03;
    public final Paint A04;
    public final RectF A05 = AnonymousClass002.A07();
    public final boolean A06;

    static {
        int A002 = AnonymousClass0J6.A00(-6278145, 0.1f);
        A09 = new int[]{A002, AnonymousClass0J6.A00(-15173646, 0.1f), AnonymousClass0J6.A00(-14298266, 0.1f), AnonymousClass0J6.A00(-668109, 0.1f), AnonymousClass0J6.A00(-37796, 0.1f), A002};
        int[] iArr = new int[6];
        int A003 = AnonymousClass0J6.A00(-7982634, 0.2f);
        iArr[0] = A003;
        AnonymousClass0J6.A01(iArr, 0.2f, -15111988, 1);
        AnonymousClass0J6.A01(iArr, 0.2f, -14438052, 2);
        AnonymousClass0J6.A01(iArr, 0.2f, -3494861, 3);
        AnonymousClass0J6.A01(iArr, 0.2f, -2990252, 4);
        iArr[5] = A003;
        A08 = iArr;
        int[] iArr2 = new int[5];
        iArr2[0] = 16777215;
        iArr2[1] = 16777215;
        AnonymousClass0J6.A01(iArr2, 0.3f, -16777216, 2);
        AnonymousClass0J6.A01(iArr2, 0.2f, -16777216, 3);
        iArr2[4] = 16777215;
        A0A = iArr2;
    }

    public final void A00(Rect rect) {
        int[] iArr;
        ComposeShader composeShader;
        if (this.A06) {
            iArr = A08;
        } else {
            iArr = A09;
        }
        SweepGradient sweepGradient = new SweepGradient(this.A00, this.A01, iArr, A07);
        float f = this.A02;
        if (f > 0.0f) {
            float f2 = this.A03 / f;
            float f3 = 1.0f - f2;
            float f4 = (f2 * 0.25f) + f3;
            if (f4 > 1.0f) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Gradient quarter fraction cannot be greater than 1, value is: ");
                A0o.append(f4);
                C159737mN.A01("CDSCircularShadowDrawable", A0o.toString());
                return;
            }
            float f5 = this.A00;
            float f6 = this.A01;
            int[] iArr2 = A0A;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            RadialGradient radialGradient = new RadialGradient(f5, f6, f, iArr2, new float[]{0.0f, f3, f3, f4, 1.0f}, tileMode);
            if (Build.VERSION.SDK_INT < 28) {
                Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
                float f7 = this.A00;
                float f8 = this.A01;
                float f9 = this.A02;
                Paint paint = new Paint();
                AnonymousClass001.A10(paint);
                paint.setDither(true);
                paint.setShader(radialGradient);
                new Canvas(createBitmap).drawCircle(f7, f8, f9, paint);
                composeShader = new ComposeShader(new BitmapShader(createBitmap, tileMode, tileMode), sweepGradient, PorterDuff.Mode.SRC_IN);
            } else {
                composeShader = new ComposeShader(radialGradient, sweepGradient, PorterDuff.Mode.SRC_IN);
            }
            this.A04.setShader(composeShader);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.A04.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
    }

    public AnonymousClass01C(Context context, C153427bI r4) {
        Paint paint = new Paint();
        this.A04 = paint;
        paint.setAntiAlias(false);
        paint.setDither(true);
        AnonymousClass001.A10(paint);
        this.A03 = AnonymousClass0J7.A00(context, 12.0f);
        this.A06 = r4.A05();
    }

    public void draw(Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(94.0f, this.A00, this.A01);
        canvas.drawCircle(this.A00, this.A01, this.A02, this.A04);
        canvas.restoreToCount(save);
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.A05;
        float f = this.A03;
        rectF.set(((float) rect.left) + f, ((float) rect.top) + f, ((float) rect.right) - f, ((float) rect.bottom) - f);
        this.A00 = rectF.centerX();
        this.A01 = rectF.centerY();
        this.A02 = ((float) rect.width()) / 2.0f;
        A00(rect);
    }
}
