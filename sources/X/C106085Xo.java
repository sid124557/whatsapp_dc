package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.5Xo  reason: invalid class name and case insensitive filesystem */
public class C106085Xo {
    public int A00 = 1;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Bitmap A05;
    public Bitmap A06;
    public Bitmap A07;
    public Bitmap A08;
    public C105425Uw A09;
    public boolean A0A;
    public boolean A0B;
    public final Paint A0C = C86664Kz.A0a(1);
    public final PointF A0D = new PointF();
    public final C56612sH A0E;
    public final AnonymousClass7E7 A0F;
    public final C104435Qy A0G;
    public final AnonymousClass5US A0H;

    public void A01() {
        this.A0B = false;
        this.A0F.A00.invalidate();
    }

    public static Bitmap A00(Bitmap bitmap, int i, int i2) {
        String str;
        if (!(bitmap != null && bitmap.getWidth() == i && bitmap.getHeight() == i2)) {
            if (bitmap != null) {
                bitmap.recycle();
            }
            bitmap = null;
            if (i > 0 && i2 > 0) {
                try {
                    return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                } catch (OutOfMemoryError e) {
                    e = e;
                    str = "oom trying to create bitmap cache";
                    Log.i(str, e);
                    return bitmap;
                } catch (NullPointerException e2) {
                    e = e2;
                    str = "NPE trying to create bitmap cache";
                    Log.i(str, e);
                    return bitmap;
                }
            }
        }
        return bitmap;
    }

    public void A02() {
        Bitmap bitmap;
        Bitmap bitmap2 = this.A06;
        if (bitmap2 != null) {
            bitmap2.eraseColor(0);
        }
        Bitmap bitmap3 = this.A05;
        if (bitmap3 != null) {
            bitmap3.eraseColor(0);
        }
        List<C95954vE> A012 = this.A0H.A01();
        if (!A012.isEmpty()) {
            A03(true);
            A04(true);
            for (C95954vE r4 : A012) {
                C106115Xr r3 = r4.A03;
                if (r3 instanceof C135716l8) {
                    bitmap = this.A06;
                } else {
                    bitmap = this.A05;
                }
                PointF pointF = this.A0D;
                int i = this.A00;
                r4.A01 = bitmap;
                r4.A02 = pointF;
                r4.A00 = i;
                r4.A05 = false;
                if (bitmap != null) {
                    r3.A01(bitmap, pointF, i);
                    C106115Xr r1 = r4.A03;
                    Canvas canvas = r1.A00;
                    if (canvas != null) {
                        r1.A02(canvas);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        if (r6 == r3) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(boolean r9) {
        /*
            r8 = this;
            X.5Qy r0 = r8.A0G
            android.graphics.RectF r5 = r0.A07
            android.util.DisplayMetrics r1 = r0.A08
            r7 = 0
            if (r5 == 0) goto L_0x0011
            if (r1 == 0) goto L_0x0011
            android.graphics.Bitmap r0 = r8.A05
            if (r0 != 0) goto L_0x0012
            if (r9 != 0) goto L_0x0012
        L_0x0011:
            return r7
        L_0x0012:
            int r0 = r1.widthPixels
            float r2 = (float) r0
            float r0 = r5.width()
            float r2 = r2 / r0
            int r0 = r1.heightPixels
            float r1 = (float) r0
            float r0 = r5.height()
            float r0 = X.C86664Kz.A00(r1, r0, r2)
            int r0 = (int) r0
            r4 = 1
            int r6 = java.lang.Math.max(r4, r0)
            android.graphics.Bitmap r0 = r8.A05
            if (r0 == 0) goto L_0x0063
            int r2 = r0.getHeight()
            float r1 = r5.height()
            int r0 = r8.A00
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            if (r2 != r0) goto L_0x0063
            android.graphics.Bitmap r0 = r8.A05
            int r2 = r0.getWidth()
            float r1 = r5.width()
            int r3 = r8.A00
            float r0 = (float) r3
            float r1 = r1 * r0
            int r0 = (int) r1
            if (r2 != r0) goto L_0x0063
            android.graphics.PointF r2 = r8.A0D
            float r1 = r2.x
            float r0 = r5.left
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0063
            float r1 = r2.y
            float r0 = r5.top
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0063
            if (r6 == r3) goto L_0x0011
        L_0x0063:
            r8.A00 = r6
            android.graphics.Bitmap r3 = r8.A05
            float r1 = r5.width()
            int r0 = r8.A00
            float r0 = (float) r0
            float r1 = r1 * r0
            int r2 = (int) r1
            float r1 = r5.height()
            int r0 = r8.A00
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            android.graphics.Bitmap r0 = A00(r3, r2, r0)
            r8.A05 = r0
            android.graphics.PointF r2 = r8.A0D
            float r1 = r5.left
            float r0 = r5.top
            r2.set(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106085Xo.A03(boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        if (r6 == r3) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(boolean r9) {
        /*
            r8 = this;
            X.5Qy r0 = r8.A0G
            android.graphics.RectF r5 = r0.A07
            android.util.DisplayMetrics r1 = r0.A08
            r7 = 0
            if (r5 == 0) goto L_0x0011
            if (r1 == 0) goto L_0x0011
            android.graphics.Bitmap r0 = r8.A06
            if (r0 != 0) goto L_0x0012
            if (r9 != 0) goto L_0x0012
        L_0x0011:
            return r7
        L_0x0012:
            int r0 = r1.widthPixels
            float r2 = (float) r0
            float r0 = r5.width()
            float r2 = r2 / r0
            int r0 = r1.heightPixels
            float r1 = (float) r0
            float r0 = r5.height()
            float r0 = X.C86664Kz.A00(r1, r0, r2)
            int r0 = (int) r0
            r4 = 1
            int r6 = java.lang.Math.max(r4, r0)
            android.graphics.Bitmap r0 = r8.A06
            if (r0 == 0) goto L_0x0063
            int r2 = r0.getHeight()
            float r1 = r5.height()
            int r0 = r8.A00
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            if (r2 != r0) goto L_0x0063
            android.graphics.Bitmap r0 = r8.A06
            int r2 = r0.getWidth()
            float r1 = r5.width()
            int r3 = r8.A00
            float r0 = (float) r3
            float r1 = r1 * r0
            int r0 = (int) r1
            if (r2 != r0) goto L_0x0063
            android.graphics.PointF r2 = r8.A0D
            float r1 = r2.x
            float r0 = r5.left
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0063
            float r1 = r2.y
            float r0 = r5.top
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0063
            if (r6 == r3) goto L_0x0011
        L_0x0063:
            r8.A00 = r6
            android.graphics.Bitmap r3 = r8.A06
            float r1 = r5.width()
            int r0 = r8.A00
            float r0 = (float) r0
            float r1 = r1 * r0
            int r2 = (int) r1
            float r1 = r5.height()
            int r0 = r8.A00
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            android.graphics.Bitmap r0 = A00(r3, r2, r0)
            r8.A06 = r0
            android.graphics.PointF r2 = r8.A0D
            float r1 = r5.left
            float r0 = r5.top
            r2.set(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106085Xo.A04(boolean):boolean");
    }

    public C106085Xo(C56612sH r2, AnonymousClass7E7 r3, C104435Qy r4, AnonymousClass5US r5) {
        this.A0E = r2;
        this.A0G = r4;
        this.A0H = r5;
        this.A0F = r3;
    }
}
