package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;

/* renamed from: X.5Qy  reason: invalid class name and case insensitive filesystem */
public class C104435Qy {
    public float A00;
    public float A01 = 1.0f;
    public int A02;
    public int A03;
    public int A04;
    public Rect A05;
    public RectF A06;
    public RectF A07;
    public DisplayMetrics A08;
    public final Matrix A09 = AnonymousClass002.A05();
    public final Matrix A0A = AnonymousClass002.A05();
    public final RectF A0B = AnonymousClass002.A07();

    public static void A00(Canvas canvas, C104435Qy r4) {
        canvas.concat(r4.A09);
        RectF rectF = r4.A07;
        canvas.translate(-rectF.left, -rectF.top);
    }

    public void A01(C106985aV r4) {
        this.A06 = r4.A02;
        RectF rectF = r4.A01;
        this.A07 = rectF;
        int i = r4.A00;
        this.A02 = i;
        this.A05 = null;
        this.A01 = 1.0f;
        if (rectF != null) {
            C1451774m.A00(this.A09, rectF, (float) i);
        }
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DoodleViewState{bitmapRect=");
        A0o.append(this.A06);
        A0o.append(", cropRect=");
        A0o.append(this.A07);
        A0o.append(", rotate=");
        A0o.append(this.A02);
        A0o.append(", rotateMatrix=");
        A0o.append(this.A09);
        A0o.append(", zoomScale=");
        A0o.append(this.A01);
        A0o.append(", zoomRect=");
        A0o.append(this.A05);
        A0o.append(", zoomMatrix=");
        A0o.append(this.A0A);
        A0o.append(", displayRect=");
        A0o.append(this.A0B);
        A0o.append(", screenScale=");
        A0o.append(this.A00);
        A0o.append(", displayMetrics=");
        A0o.append(this.A08);
        A0o.append(", viewWidth=");
        A0o.append(this.A04);
        A0o.append(", viewHeight=");
        A0o.append(this.A03);
        return AnonymousClass000.A0X("}", A0o);
    }
}
