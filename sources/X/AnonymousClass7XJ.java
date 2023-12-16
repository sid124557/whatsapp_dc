package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import com.facebook.animated.webp.WebPImage;

/* renamed from: X.7XJ  reason: invalid class name */
public class AnonymousClass7XJ {
    public int A00 = 0;
    public Bitmap A01;
    public Bitmap A02;
    public Canvas A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Bitmap A08;
    public final Paint A09;
    public final WebPImage A0A;
    public final String A0B;

    public synchronized void finalize() {
        this.A0A.dispose();
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            bitmap.recycle();
            this.A01 = null;
        }
        Bitmap bitmap2 = this.A02;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.A02 = null;
        }
        super.finalize();
    }

    public final void A00(Canvas canvas, AnonymousClass7OK r11) {
        int i = r11.A02;
        float f = this.A04;
        int i2 = r11.A03;
        canvas.drawRect(((float) i) * f, ((float) i2) * f, ((float) (i + r11.A01)) * f, ((float) (i2 + r11.A00)) * f, this.A09);
    }

    public AnonymousClass7XJ(Bitmap bitmap, WebPImage webPImage, String str, int i, int i2) {
        this.A0B = str;
        this.A0A = webPImage;
        this.A08 = bitmap;
        Paint paint = new Paint();
        this.A09 = paint;
        C86604Kt.A0u(0, paint);
        C86634Kw.A18(paint, PorterDuff.Mode.SRC);
        this.A07 = webPImage.getFrameCount();
        this.A06 = i;
        this.A05 = i2;
        this.A04 = ((float) i) / ((float) webPImage.getWidth());
    }
}
