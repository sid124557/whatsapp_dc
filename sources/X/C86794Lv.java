package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.4Lv  reason: invalid class name and case insensitive filesystem */
public final class C86794Lv extends Drawable {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final Paint A03;
    public final Paint A04;
    public final RectF A05 = AnonymousClass002.A07();
    public final RectF A06 = AnonymousClass002.A07();
    public final C102785Kg A07;

    public C86794Lv(C102785Kg r3) {
        C162457s7.A0J(r3, 1);
        this.A07 = r3;
        Paint A0a = C86664Kz.A0a(1);
        C86634Kw.A17(A0a);
        this.A04 = A0a;
        Paint A0a2 = C86664Kz.A0a(1);
        AnonymousClass001.A10(A0a2);
        this.A03 = A0a2;
    }

    public void draw(Canvas canvas) {
        boolean z;
        C162457s7.A0J(canvas, 0);
        if (this.A01 || this.A02) {
            RectF rectF = this.A05;
            float height = rectF.height() * 0.5f;
            canvas.drawRoundRect(rectF, height, height, this.A03);
        }
        if (this.A01) {
            z = this.A00;
        } else {
            z = this.A02;
        }
        if (!z) {
            RectF rectF2 = this.A06;
            float height2 = rectF2.height() * 0.5f;
            canvas.drawRoundRect(rectF2, height2, height2, this.A04);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1 < 0) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStateChange(int[] r6) {
        /*
            r5 = this;
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            boolean r4 = r5.A02
            r3 = 16842913(0x10100a1, float:2.369401E-38)
            int r2 = r6.length
            r1 = 0
        L_0x000b:
            if (r1 >= r2) goto L_0x0014
            r0 = r6[r1]
            if (r3 != r0) goto L_0x0028
            r0 = 1
            if (r1 >= 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r4 == r0) goto L_0x001f
            r5.A02 = r0
            r5.A00()
            r5.invalidateSelf()
        L_0x001f:
            boolean r0 = r5.A02
            if (r4 == r0) goto L_0x002b
            r5.invalidateSelf()
            r0 = 1
            return r0
        L_0x0028:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x002b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86794Lv.onStateChange(int[]):boolean");
    }

    public final void A01(int i) {
        C102785Kg r2;
        int i2;
        int i3;
        Paint paint = this.A04;
        float f = (float) i;
        paint.setStrokeWidth(0.025f * f);
        if (this.A00) {
            paint.setPathEffect((PathEffect) null);
            r2 = this.A07;
            i2 = r2.A05;
        } else {
            float f2 = f * 0.0478602f;
            float[] A1b = C86654Ky.A1b(f2);
            A1b[1] = f2;
            paint.setPathEffect(new DashPathEffect(A1b, 0.0f));
            r2 = this.A07;
            i2 = r2.A06;
        }
        paint.setColor(i2);
        Paint paint2 = this.A03;
        if (this.A02 || !this.A01) {
            i3 = r2.A07;
        } else {
            i3 = r2.A02;
        }
        paint2.setColor(i3);
    }

    public final void A02(int i, int i2, int i3, int i4) {
        float strokeWidth = this.A04.getStrokeWidth() * 0.5f;
        float f = (float) i;
        float f2 = (float) i2;
        float f3 = (float) i3;
        float f4 = (float) i4;
        this.A06.set(f + strokeWidth, f2 + strokeWidth, f3 - strokeWidth, f4 - strokeWidth);
        this.A05.set(f, f2, f3, f4);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        return true;
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        A01(i3 - i);
        A02(i, i2, i3, i4);
        super.setBounds(i, i2, i3, i4);
    }

    public final void A00() {
        A01(C86644Kx.A01(this));
        A02(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
