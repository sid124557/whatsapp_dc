package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.0Bt  reason: invalid class name and case insensitive filesystem */
public class C01670Bt extends C09320g0 {
    public C04850Qx A00;
    public final Paint A01 = new AnonymousClass00u(3);
    public final Rect A02 = AnonymousClass001.A0N();
    public final Rect A03 = AnonymousClass001.A0N();

    public final Bitmap A0B() {
        Bitmap bitmap;
        Context context;
        String str = this.A0M.A0H;
        AnonymousClass01G r4 = this.A0K;
        AnonymousClass0TI r5 = null;
        if (r4.getCallback() != null) {
            AnonymousClass0TI r2 = r4.A07;
            if (r2 != null) {
                Drawable.Callback callback = r4.getCallback();
                if (callback == null || !(callback instanceof View)) {
                    context = null;
                } else {
                    context = ((View) callback).getContext();
                }
                if (!(context == null && r2.A01 == null) && !r2.A01.equals(context)) {
                    r4.A07 = null;
                }
            }
            r5 = r4.A07;
            if (r5 == null) {
                r5 = new AnonymousClass0TI(r4.getCallback(), r4.A09, r4.A04.A0A);
                r4.A07 = r5;
            }
        }
        if (r5 == null) {
            return null;
        }
        Map map = r5.A03;
        AnonymousClass0MS r9 = (AnonymousClass0MS) map.get(str);
        if (r9 == null) {
            return null;
        }
        Bitmap bitmap2 = r9.A00;
        if (bitmap2 != null) {
            return bitmap2;
        }
        String str2 = r9.A03;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!str2.startsWith("data:") || str2.indexOf("base64,") <= 0) {
            try {
                String str3 = r5.A02;
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        bitmap = BitmapFactory.decodeStream(r5.A01.getAssets().open(AnonymousClass000.A0T(str3, str2)), (Rect) null, options);
                        int i = r9.A02;
                        int i2 = r9.A01;
                        if (!(bitmap.getWidth() == i && bitmap.getHeight() == i2)) {
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                            bitmap.recycle();
                            bitmap = createScaledBitmap;
                        }
                    } catch (IllegalArgumentException e) {
                        AnonymousClass0S3.A01("Unable to decode image.", e);
                        return null;
                    }
                } else {
                    throw AnonymousClass001.A0e("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                }
            } catch (IOException e2) {
                AnonymousClass0S3.A01("Unable to open asset.", e2);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            } catch (IllegalArgumentException e3) {
                AnonymousClass0S3.A01("data URL did not have correct base64 format.", e3);
                return null;
            }
        }
        synchronized (AnonymousClass0TI.A04) {
            ((AnonymousClass0MS) map.get(str)).A00 = bitmap;
        }
        return bitmap;
    }

    public C01670Bt(AnonymousClass01G r3, C04510Oo r4) {
        super(r3, r4);
    }

    public void A07(Canvas canvas, Matrix matrix, int i) {
        Bitmap A0B = A0B();
        if (A0B != null && !A0B.isRecycled()) {
            float A002 = AnonymousClass0Y0.A00();
            Paint paint = this.A01;
            paint.setAlpha(i);
            AnonymousClass001.A11(paint, this.A00);
            canvas.save();
            canvas.concat(matrix);
            Rect rect = this.A03;
            rect.set(0, 0, A0B.getWidth(), A0B.getHeight());
            Rect rect2 = this.A02;
            rect2.set(0, 0, (int) (((float) A0B.getWidth()) * A002), (int) (((float) A0B.getHeight()) * A002));
            canvas.drawBitmap(A0B, rect, rect2, paint);
            canvas.restore();
        }
    }

    public void Aws(C05560Tz r3, Object obj) {
        AnonymousClass0BZ r1;
        super.Aws(r3, obj);
        if (obj == C17150ue.A00) {
            if (r3 == null) {
                r1 = null;
            } else {
                r1 = new AnonymousClass0BZ(r3, (Object) null);
            }
            this.A00 = r1;
        }
    }

    public void B4p(Matrix matrix, RectF rectF, boolean z) {
        super.B4p(matrix, rectF, z);
        Bitmap A0B = A0B();
        if (A0B != null) {
            rectF.set(0.0f, 0.0f, ((float) A0B.getWidth()) * AnonymousClass0Y0.A00(), ((float) A0B.getHeight()) * AnonymousClass0Y0.A00());
            this.A08.mapRect(rectF);
        }
    }
}
