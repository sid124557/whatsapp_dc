package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* renamed from: X.5UE  reason: invalid class name */
public class AnonymousClass5UE {
    public float A00;
    public int A01;
    public int A02 = 0;
    public Matrix A03;
    public Rect A04;
    public RectF A05;
    public RectF A06;
    public View A07;
    public boolean A08 = false;
    public boolean A09;
    public boolean A0A = false;
    public final Paint A0B = C86664Kz.A0Z();
    public final Paint A0C = C86664Kz.A0Z();
    public final Paint A0D = C86664Kz.A0Z();

    public Rect A01() {
        RectF rectF = this.A05;
        return new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public Rect A02() {
        Rect rect = this.A04;
        return new Rect(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final Rect A03() {
        RectF rectF = this.A05;
        RectF A092 = AnonymousClass4L0.A09(rectF.left, rectF.top, rectF.right, rectF.bottom);
        this.A03.mapRect(A092);
        return new Rect(Math.round(A092.left), Math.round(A092.top), Math.round(A092.right), Math.round(A092.bottom));
    }

    public AnonymousClass5UE(View view) {
        this.A07 = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (r11 >= (((float) r3.bottom) + r4)) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
        if (r6 == false) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(float r10, float r11) {
        /*
            r9 = this;
            android.graphics.Rect r3 = r9.A03()
            android.view.View r0 = r9.A07
            android.util.DisplayMetrics r0 = X.C86614Ku.A0E(r0)
            float r4 = r0.density
            r0 = 1101004800(0x41a00000, float:20.0)
            float r4 = r4 * r0
            boolean r0 = r9.A08
            r8 = 32
            r1 = 1
            if (r0 == 0) goto L_0x005f
            int r0 = r3.centerX()
            float r0 = (float) r0
            float r10 = r10 - r0
            int r0 = r3.centerY()
            float r0 = (float) r0
            float r11 = r11 - r0
            float r1 = r10 * r10
            float r0 = r11 * r11
            float r1 = r1 + r0
            double r0 = (double) r1
            double r0 = java.lang.Math.sqrt(r0)
            int r2 = (int) r0
            android.graphics.Rect r0 = r9.A04
            int r1 = r0.width()
            r0 = 2
            int r1 = r1 / r0
            int r0 = X.AnonymousClass001.A0A(r2, r1)
            float r0 = (float) r0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x005b
            float r2 = java.lang.Math.abs(r11)
            float r0 = java.lang.Math.abs(r10)
            r1 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0054
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r8 = 16
            if (r0 >= 0) goto L_0x0053
            r8 = 8
        L_0x0053:
            return r8
        L_0x0054:
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            r8 = 4
            if (r0 >= 0) goto L_0x0053
            r8 = 2
            return r8
        L_0x005b:
            if (r2 < r1) goto L_0x0053
            r8 = 1
            return r8
        L_0x005f:
            int r0 = r3.top
            float r5 = (float) r0
            float r0 = r5 - r4
            r7 = 0
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0072
            int r0 = r3.bottom
            float r0 = (float) r0
            float r0 = r0 + r4
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r6 = 1
            if (r0 < 0) goto L_0x0073
        L_0x0072:
            r6 = 0
        L_0x0073:
            int r0 = r3.left
            float r2 = (float) r0
            float r0 = r2 - r4
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0085
            int r0 = r3.right
            float r0 = (float) r0
            float r0 = r0 + r4
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0085
            r7 = 1
        L_0x0085:
            float r0 = X.AnonymousClass002.A00(r2, r10)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0090
            r2 = 3
            if (r6 != 0) goto L_0x0091
        L_0x0090:
            r2 = 1
        L_0x0091:
            int r0 = r3.right
            float r0 = (float) r0
            float r0 = X.AnonymousClass002.A00(r0, r10)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a0
            if (r6 == 0) goto L_0x00a0
            r2 = r2 | 4
        L_0x00a0:
            float r0 = X.AnonymousClass002.A00(r5, r11)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ac
            if (r7 == 0) goto L_0x00ac
            r2 = r2 | 8
        L_0x00ac:
            int r0 = r3.bottom
            float r0 = (float) r0
            float r0 = X.AnonymousClass002.A00(r0, r11)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bb
            if (r7 == 0) goto L_0x00bb
            r2 = r2 | 16
        L_0x00bb:
            if (r2 != r1) goto L_0x00c6
            int r1 = (int) r10
            int r0 = (int) r11
            boolean r0 = r3.contains(r1, r0)
            if (r0 == 0) goto L_0x00c6
            return r8
        L_0x00c6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5UE.A00(float, float):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:195:0x037d, code lost:
        if (r7[1] != 0.0f) goto L_0x037f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(int r14, float r15, float r16) {
        /*
            r13 = this;
            android.graphics.Rect r1 = r13.A03()
            r5 = 1
            if (r14 == r5) goto L_0x0082
            r0 = 32
            r2 = r16
            if (r14 != r0) goto L_0x0083
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r1)
            r4.offset(r15, r2)
            android.graphics.Matrix r1 = X.AnonymousClass002.A05()
            android.graphics.Matrix r0 = r13.A03
            boolean r0 = r0.invert(r1)
            if (r0 == 0) goto L_0x0024
            r1.mapRect(r4)
        L_0x0024:
            float r3 = r4.left
            android.graphics.RectF r2 = r13.A05
            float r0 = r2.left
            float r3 = r3 - r0
            float r1 = r4.top
            float r0 = r2.top
            float r1 = r1 - r0
            android.graphics.Rect r0 = r13.A04
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r0)
            android.graphics.RectF r0 = r13.A05
            r0.offset(r3, r1)
            android.graphics.RectF r4 = r13.A05
            android.graphics.RectF r3 = r13.A06
            float r1 = r3.left
            float r0 = r4.left
            float r1 = r1 - r0
            r6 = 0
            float r2 = java.lang.Math.max(r6, r1)
            float r1 = r3.top
            float r0 = r4.top
            float r1 = r1 - r0
            float r0 = java.lang.Math.max(r6, r1)
            r4.offset(r2, r0)
            android.graphics.RectF r4 = r13.A05
            android.graphics.RectF r3 = r13.A06
            float r1 = r3.right
            float r0 = r4.right
            float r1 = r1 - r0
            float r2 = java.lang.Math.min(r6, r1)
            float r1 = r3.bottom
            float r0 = r4.bottom
            float r1 = r1 - r0
            float r0 = java.lang.Math.min(r6, r1)
            r4.offset(r2, r0)
            android.graphics.Rect r0 = r13.A03()
            r13.A04 = r0
            r5.union(r0)
            r0 = -10
            r5.inset(r0, r0)
            android.view.View r0 = r13.A07
            r0.invalidate(r5)
        L_0x0082:
            return
        L_0x0083:
            r4 = 2
            float[] r1 = new float[r4]
            r9 = 0
            r1[r9] = r15
            r1[r5] = r16
            android.graphics.Matrix r6 = X.AnonymousClass002.A05()
            android.graphics.Matrix r0 = r13.A03
            boolean r0 = r0.invert(r6)
            if (r0 == 0) goto L_0x009a
            r6.mapVectors(r1)
        L_0x009a:
            r3 = r1[r9]
            r2 = r1[r5]
            r0 = r14 & 8
            r1 = 0
            if (r0 == 0) goto L_0x0383
            float[] r7 = new float[r4]
            r7 = {0, 1065353216} // fill-array
            r6.mapVectors(r7)
            r8 = r7[r9]
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0366
            r0 = r7[r5]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0366
            r12 = 3
        L_0x00b8:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x00d2
            float[] r7 = new float[r4]
            r7 = {0, -1082130432} // fill-array
            r6.mapVectors(r7)
            r8 = r7[r9]
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0346
            r0 = r7[r5]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0346
            r12 = r12 | 2
        L_0x00d2:
            r0 = r14 & 4
            if (r0 == 0) goto L_0x00ec
            float[] r7 = new float[r4]
            r7 = {1065353216, 0} // fill-array
            r6.mapVectors(r7)
            r8 = r7[r9]
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0326
            r0 = r7[r5]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0326
            r12 = r12 | 8
        L_0x00ec:
            r0 = r14 & 2
            if (r0 == 0) goto L_0x0106
            float[] r7 = new float[r4]
            r7 = {-1082130432, 0} // fill-array
            r6.mapVectors(r7)
            r4 = r7[r9]
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0306
            r0 = r7[r5]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0306
            r12 = r12 | 8
        L_0x0106:
            r0 = r12 & 6
            if (r0 != 0) goto L_0x010b
            r3 = 0
        L_0x010b:
            r0 = r12 & 24
            if (r0 != 0) goto L_0x0110
            r2 = 0
        L_0x0110:
            boolean r0 = r13.A0A
            if (r0 == 0) goto L_0x011c
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x02fd
            float r0 = r13.A00
            float r2 = r3 / r0
        L_0x011c:
            android.graphics.RectF r0 = r13.A05
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r0)
            boolean r7 = r13.A0A
            if (r7 == 0) goto L_0x0134
            r5 = r12 & 18
            r0 = 18
            if (r5 == r0) goto L_0x0133
            r5 = r12 & 12
            r0 = 12
            if (r5 != r0) goto L_0x0134
        L_0x0133:
            float r2 = -r2
        L_0x0134:
            r11 = r12 & 2
            r10 = 1073741824(0x40000000, float:2.0)
            if (r11 == 0) goto L_0x0157
            float r0 = r4.left
            float r0 = r0 + r3
            r4.left = r0
            if (r7 == 0) goto L_0x0157
            r0 = r12 & 16
            if (r0 != 0) goto L_0x0157
            r0 = r12 & 8
            if (r0 != 0) goto L_0x0157
            float r5 = r4.top
            float r0 = r2 / r10
            float r5 = r5 + r0
            r4.top = r5
            float r5 = r4.bottom
            float r0 = r2 - r0
            float r5 = r5 - r0
            r4.bottom = r5
        L_0x0157:
            r9 = r12 & 4
            if (r9 == 0) goto L_0x0178
            float r0 = r4.right
            float r0 = r0 + r3
            r4.right = r0
            if (r7 == 0) goto L_0x0178
            r0 = r12 & 16
            if (r0 != 0) goto L_0x0178
            r0 = r12 & 8
            if (r0 != 0) goto L_0x0178
            float r6 = r4.top
            float r5 = r2 / r10
            float r0 = r2 - r5
            float r6 = r6 - r0
            r4.top = r6
            float r0 = r4.bottom
            float r0 = r0 + r5
            r4.bottom = r0
        L_0x0178:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x0195
            float r0 = r4.top
            float r0 = r0 + r2
            r4.top = r0
            if (r7 == 0) goto L_0x0195
            if (r11 != 0) goto L_0x0195
            if (r9 != 0) goto L_0x0195
            float r5 = r4.left
            float r0 = r3 / r10
            float r5 = r5 + r0
            r4.left = r5
            float r5 = r4.right
            float r0 = r3 - r0
            float r5 = r5 - r0
            r4.right = r5
        L_0x0195:
            r5 = r12 & 16
            if (r5 == 0) goto L_0x01b1
            float r0 = r4.bottom
            float r0 = r0 + r2
            r4.bottom = r0
            if (r7 == 0) goto L_0x01b1
            if (r11 != 0) goto L_0x01b1
            if (r9 != 0) goto L_0x01b1
            float r0 = r4.left
            float r2 = r3 / r10
            float r3 = r3 - r2
            float r0 = r0 - r3
            r4.left = r0
            float r0 = r4.right
            float r0 = r0 + r2
            r4.right = r0
        L_0x01b1:
            int r0 = r13.A01
            float r2 = (float) r0
            r0 = 1103626240(0x41c80000, float:25.0)
            float r8 = java.lang.Math.max(r0, r2)
            float r0 = r4.width()
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x01c9
            if (r11 == 0) goto L_0x02e7
            float r0 = r4.right
            float r0 = r0 - r8
            r4.left = r0
        L_0x01c9:
            boolean r0 = r13.A0A
            if (r0 == 0) goto L_0x02e4
            float r0 = r13.A00
            float r7 = r8 / r0
        L_0x01d1:
            float r0 = r4.height()
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x01e0
            if (r6 == 0) goto L_0x02ce
            float r0 = r4.bottom
            float r0 = r0 - r7
            r4.top = r0
        L_0x01e0:
            float r2 = r4.width()
            android.graphics.RectF r0 = r13.A06
            float r0 = r0.width()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0208
            android.graphics.RectF r2 = r13.A06
            float r0 = r2.left
            r4.left = r0
            float r0 = r2.right
            r4.right = r0
            boolean r0 = r13.A0A
            if (r0 == 0) goto L_0x0208
            float r3 = r4.top
            float r2 = r2.width()
            float r0 = r13.A00
            float r2 = r2 / r0
            float r3 = r3 + r2
            r4.bottom = r3
        L_0x0208:
            float r2 = r4.height()
            android.graphics.RectF r0 = r13.A06
            float r0 = r0.height()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0230
            android.graphics.RectF r2 = r13.A06
            float r0 = r2.top
            r4.top = r0
            float r0 = r2.bottom
            r4.bottom = r0
            boolean r0 = r13.A0A
            if (r0 == 0) goto L_0x0230
            float r3 = r4.left
            float r2 = r2.height()
            float r0 = r13.A00
            float r2 = r2 * r0
            float r3 = r3 + r2
            r4.right = r3
        L_0x0230:
            float r6 = r4.left
            android.graphics.RectF r2 = r13.A06
            float r5 = r2.left
            int r0 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x02ac
            boolean r0 = r13.A0A
            if (r0 == 0) goto L_0x0299
            float r5 = r5 - r6
            r4.offset(r5, r1)
        L_0x0242:
            float r6 = r4.top
            android.graphics.RectF r2 = r13.A06
            float r5 = r2.top
            int r0 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0278
            boolean r0 = r13.A0A
            if (r0 == 0) goto L_0x0265
            float r5 = r5 - r6
            r4.offset(r1, r5)
        L_0x0254:
            android.graphics.RectF r0 = r13.A05
            r0.set(r4)
            android.graphics.Rect r0 = r13.A03()
            r13.A04 = r0
            android.view.View r0 = r13.A07
            r0.invalidate()
            return
        L_0x0265:
            r4.top = r5
            float r0 = r4.bottom
            float r0 = r0 - r7
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0254
            float r5 = r5 + r7
            float r0 = r2.bottom
            float r0 = java.lang.Math.min(r5, r0)
            r4.bottom = r0
            goto L_0x0254
        L_0x0278:
            float r3 = r4.bottom
            float r2 = r2.bottom
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0254
            boolean r0 = r13.A0A
            if (r0 == 0) goto L_0x028a
            float r3 = r3 - r2
            float r0 = -r3
            r4.offset(r1, r0)
            goto L_0x0254
        L_0x028a:
            r4.bottom = r2
            float r6 = r6 + r7
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0254
            float r2 = r2 - r7
            float r0 = java.lang.Math.max(r2, r5)
            r4.top = r0
            goto L_0x0254
        L_0x0299:
            r4.left = r5
            float r0 = r4.right
            float r0 = r0 - r8
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0242
            float r5 = r5 + r8
            float r0 = r2.right
            float r0 = java.lang.Math.min(r5, r0)
            r4.right = r0
            goto L_0x0242
        L_0x02ac:
            float r3 = r4.right
            float r2 = r2.right
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0242
            boolean r0 = r13.A0A
            if (r0 == 0) goto L_0x02be
            float r3 = r3 - r2
            float r0 = -r3
            r4.offset(r0, r1)
            goto L_0x0242
        L_0x02be:
            r4.right = r2
            float r6 = r6 + r8
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0242
            float r2 = r2 - r8
            float r0 = java.lang.Math.max(r2, r5)
            r4.left = r0
            goto L_0x0242
        L_0x02ce:
            if (r5 == 0) goto L_0x02d7
            float r0 = r4.top
            float r0 = r0 + r7
            r4.bottom = r0
            goto L_0x01e0
        L_0x02d7:
            float r0 = r4.height()
            float r0 = r7 - r0
            float r0 = -r0
            float r0 = r0 / r10
            r4.inset(r1, r0)
            goto L_0x01e0
        L_0x02e4:
            r7 = r8
            goto L_0x01d1
        L_0x02e7:
            if (r9 == 0) goto L_0x02f0
            float r0 = r4.left
            float r0 = r0 + r8
            r4.right = r0
            goto L_0x01c9
        L_0x02f0:
            float r0 = r4.width()
            float r0 = r8 - r0
            float r0 = -r0
            float r0 = r0 / r10
            r4.inset(r0, r1)
            goto L_0x01c9
        L_0x02fd:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x011c
            float r3 = r13.A00
            float r3 = r3 * r2
            goto L_0x011c
        L_0x0306:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0314
            r0 = r7[r5]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0314
            r12 = r12 | 4
            goto L_0x0106
        L_0x0314:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0322
            r0 = r7[r5]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0322
            r12 = r12 | 16
            goto L_0x0106
        L_0x0322:
            r12 = r12 | 2
            goto L_0x0106
        L_0x0326:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0334
            r0 = r7[r5]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0334
            r12 = r12 | 2
            goto L_0x00ec
        L_0x0334:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0342
            r0 = r7[r5]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0342
            r12 = r12 | 16
            goto L_0x00ec
        L_0x0342:
            r12 = r12 | 4
            goto L_0x00ec
        L_0x0346:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0354
            r0 = r7[r5]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0354
            r12 = r12 | 8
            goto L_0x00d2
        L_0x0354:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0362
            r0 = r7[r5]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0362
            r12 = r12 | 4
            goto L_0x00d2
        L_0x0362:
            r12 = r12 | 16
            goto L_0x00d2
        L_0x0366:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0374
            r0 = r7[r5]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0374
            r12 = 17
            goto L_0x00b8
        L_0x0374:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x037f
            r0 = r7[r5]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r12 = 5
            if (r0 == 0) goto L_0x00b8
        L_0x037f:
            r12 = 9
            goto L_0x00b8
        L_0x0383:
            r12 = 1
            goto L_0x00b8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5UE.A04(int, float, float):void");
    }
}
