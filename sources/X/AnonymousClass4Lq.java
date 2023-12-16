package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.whatsapp.util.Log;

/* renamed from: X.4Lq  reason: invalid class name */
public final class AnonymousClass4Lq extends Drawable {
    public boolean A00;
    public boolean A01;
    public final Paint A02;
    public final Paint A03;
    public final Paint A04;
    public final Paint A05;
    public final RectF A06 = AnonymousClass002.A07();
    public final RectF A07 = AnonymousClass002.A07();
    public final RectF A08 = AnonymousClass002.A07();
    public final RectF A09 = AnonymousClass002.A07();
    public final C102785Kg A0A;

    public AnonymousClass4Lq(C102785Kg r4) {
        C162457s7.A0J(r4, 1);
        this.A0A = r4;
        Paint A0a = C86664Kz.A0a(1);
        Paint.Style style = Paint.Style.STROKE;
        A0a.setStyle(style);
        this.A04 = A0a;
        Paint A0a2 = C86664Kz.A0a(1);
        A0a2.setStyle(style);
        this.A03 = A0a2;
        Paint A0a3 = C86664Kz.A0a(1);
        C86624Kv.A0e(r4.A03, A0a3);
        this.A02 = A0a3;
        Paint A0a4 = C86664Kz.A0a(1);
        C86604Kt.A0u(r4.A04, A0a4);
        this.A05 = A0a4;
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        C162457s7.A0J(canvas, 0);
        canvas.drawOval(this.A08, this.A04);
        canvas.drawOval(this.A07, this.A03);
        if (!this.A00) {
            RectF rectF = this.A06;
            canvas2.drawLine(rectF.left, rectF.bottom, rectF.right, rectF.top, this.A02);
            canvas.drawOval(this.A09, this.A05);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1 < 0) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStateChange(int[] r9) {
        /*
            r8 = this;
            r0 = 0
            X.C162457s7.A0J(r9, r0)
            boolean r7 = r8.A01
            r3 = 16842913(0x10100a1, float:2.369401E-38)
            int r2 = r9.length
            r1 = 0
        L_0x000b:
            if (r1 >= r2) goto L_0x0014
            r0 = r9[r1]
            if (r3 != r0) goto L_0x0058
            r0 = 1
            if (r1 >= 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r7 == r0) goto L_0x0051
            r8.A01 = r0
            int r0 = X.C86644Kx.A01(r8)
            r8.A00(r0)
            android.graphics.Rect r0 = r8.getBounds()
            int r3 = r0.left
            android.graphics.Rect r0 = r8.getBounds()
            int r2 = r0.top
            android.graphics.Rect r0 = r8.getBounds()
            int r1 = r0.right
            android.graphics.Rect r0 = r8.getBounds()
            int r6 = r0.bottom
            android.graphics.Paint r0 = r8.A04
            float r5 = r0.getStrokeWidth()
            r0 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r0
            android.graphics.RectF r4 = r8.A08
            float r3 = (float) r3
            float r3 = r3 + r5
            float r2 = (float) r2
            float r2 = r2 + r5
            float r1 = (float) r1
            float r1 = r1 - r5
            float r0 = (float) r6
            float r0 = r0 - r5
            r4.set(r3, r2, r1, r0)
            r8.invalidateSelf()
        L_0x0051:
            boolean r0 = r8.A01
            boolean r0 = X.AnonymousClass001.A1X(r7, r0)
            return r0
        L_0x0058:
            int r1 = r1 + 1
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Lq.onStateChange(int[]):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(int r7) {
        /*
            r6 = this;
            boolean r0 = r6.A01
            r1 = 0
            r5 = 1020054733(0x3ccccccd, float:0.025)
            android.graphics.Paint r4 = r6.A04
            float r3 = (float) r7
            if (r0 == 0) goto L_0x002f
            r0 = 1033476506(0x3d99999a, float:0.075)
            float r0 = r0 * r3
            r4.setStrokeWidth(r0)
            r4.setPathEffect(r1)
            X.5Kg r2 = r6.A0A
            int r0 = r2.A07
        L_0x0019:
            r4.setColor(r0)
        L_0x001c:
            android.graphics.Paint r1 = r6.A03
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x002c
            int r0 = r2.A00
        L_0x0024:
            r1.setColor(r0)
            float r3 = r3 * r5
            r1.setStrokeWidth(r3)
            return
        L_0x002c:
            int r0 = r2.A01
            goto L_0x0024
        L_0x002f:
            float r0 = r3 * r5
            r4.setStrokeWidth(r0)
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x0043
            X.5Kg r2 = r6.A0A
            int r0 = r2.A05
            r4.setColor(r0)
            r4.setPathEffect(r1)
            goto L_0x001c
        L_0x0043:
            r0 = 1027868943(0x3d44090f, float:0.0478602)
            float r1 = r3 * r0
            float[] r2 = X.C86654Ky.A1b(r1)
            r0 = 1
            r2[r0] = r1
            r1 = 0
            android.graphics.DashPathEffect r0 = new android.graphics.DashPathEffect
            r0.<init>(r2, r1)
            r4.setPathEffect(r0)
            X.5Kg r2 = r6.A0A
            int r0 = r2.A06
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Lq.A00(int):void");
    }

    public int getOpacity() {
        return -3;
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        int i5 = i3;
        int i6 = i;
        int i7 = i3 - i;
        int i8 = i2;
        int i9 = i4;
        if (i7 != i4 - i2) {
            Log.w("Only squire bounds are supported");
        }
        A00(i7);
        float strokeWidth = this.A04.getStrokeWidth() * 0.5f;
        float f = (float) i6;
        float f2 = (float) i8;
        float f3 = (float) i5;
        float f4 = (float) i9;
        this.A08.set(f + strokeWidth, f2 + strokeWidth, f3 - strokeWidth, f4 - strokeWidth);
        float f5 = (float) i7;
        float f6 = 0.075f * f5;
        Paint paint = this.A03;
        float strokeWidth2 = (paint.getStrokeWidth() * 0.5f) + f6;
        this.A07.set(f + strokeWidth2, f2 + strokeWidth2, f3 - strokeWidth2, f4 - strokeWidth2);
        this.A02.setStrokeWidth(0.05f * f5);
        float f7 = f5 * 0.8f;
        float sqrt = ((float) Math.sqrt((double) (f7 * f7 * 0.5f))) * 0.5f;
        float f8 = ((float) (i + i3)) * 0.5f;
        float f9 = f8 + sqrt;
        this.A06.set(f8 - sqrt, (((float) (i2 + i4)) * 0.5f) - sqrt, f9, f9);
        float strokeWidth3 = f6 + paint.getStrokeWidth();
        this.A09.set(f + strokeWidth3, f2 + strokeWidth3, f3 - strokeWidth3, f4 - strokeWidth3);
        super.setBounds(i6, i8, i5, i9);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
