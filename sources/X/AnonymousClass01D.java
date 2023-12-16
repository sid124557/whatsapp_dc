package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.01D  reason: invalid class name */
public class AnonymousClass01D extends Drawable {
    public static final float[] A0L = {0.0f, 0.317f, 0.453f, 0.542f, 0.85f, 1.0f};
    public static final int[] A0M = {-15173646, -14298266, -668109, -37796, -6278145, -15173646};
    public Path A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final Bitmap A05;
    public final Bitmap A06;
    public final Paint A07;
    public final Paint A08;
    public final RectF A09;
    public final RectF A0A;
    public final AnonymousClass0GA A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final Paint[] A0I;
    public final Paint[] A0J;
    public final Path[] A0K;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0123, code lost:
        if (r0.A0E != false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0128, code lost:
        if (r0.A0F != false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0228, code lost:
        if (r0.A0E != false) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x022d, code lost:
        if (r0.A0F != false) goto L_0x017e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r0 = r19
            X.0GA r1 = r0.A0B
            boolean r1 = r1.hasFoaStroke
            r13 = r20
            if (r1 == 0) goto L_0x012c
            r4 = 2
            boolean[] r7 = new boolean[r4]
            boolean r6 = r0.A0G
            r10 = 0
            r7[r10] = r6
            boolean r3 = r0.A0D
            r12 = 1
            r7[r12] = r3
            r5 = 0
            r1 = 0
        L_0x0019:
            boolean r2 = r7[r5]
            if (r2 == 0) goto L_0x001f
            int r1 = r1 + 1
        L_0x001f:
            int r5 = r5 + 1
            if (r5 < r4) goto L_0x0019
            r11 = 1073741824(0x40000000, float:2.0)
            if (r6 == 0) goto L_0x0126
            int r7 = r13.save()
            android.graphics.RectF r9 = r0.A09
            float r5 = r9.left
            float r8 = r0.A01
            float r5 = r5 + r8
            float r2 = r9.top
            float r2 = r2 + r8
            r13.translate(r5, r2)
            android.graphics.Path[] r2 = r0.A0K
            r5 = r2[r10]
            android.graphics.Paint[] r2 = r0.A0I
            r2 = r2[r10]
            r13.drawPath(r5, r2)
            r14 = 0
            float r5 = -r8
            float r2 = r0.A02
            float r15 = r5 - r2
            float r16 = r9.width()
            float r8 = r8 * r11
            float r16 = r16 - r8
            android.graphics.Paint[] r2 = r0.A0J
            r18 = r2[r10]
            r17 = r5
            r13.drawRect(r14, r15, r16, r17, r18)
            r13.restoreToCount(r7)
        L_0x005c:
            int r5 = r13.save()
            android.graphics.RectF r8 = r0.A09
            float r10 = r8.right
            float r7 = r0.A01
            float r10 = r10 - r7
            float r9 = r8.top
            boolean r2 = X.AnonymousClass000.A1S(r6)
            float r2 = (float) r2
            float r2 = r2 * r7
            float r9 = r9 + r2
            r13.translate(r10, r9)
            if (r6 == 0) goto L_0x0080
            android.graphics.Path[] r2 = r0.A0K
            r6 = r2[r12]
            android.graphics.Paint[] r2 = r0.A0I
            r2 = r2[r12]
            r13.drawPath(r6, r2)
        L_0x0080:
            boolean r2 = r0.A0F
            if (r2 == 0) goto L_0x0099
            r14 = 0
            float r2 = r0.A02
            float r16 = r7 + r2
            float r17 = r8.height()
            float r2 = (float) r1
            float r2 = r2 * r7
            float r17 = r17 - r2
            android.graphics.Paint[] r2 = r0.A0J
            r18 = r2[r12]
            r15 = r14
            r13.drawRect(r14, r15, r16, r17, r18)
        L_0x0099:
            r13.restoreToCount(r5)
        L_0x009c:
            if (r3 == 0) goto L_0x0121
            int r7 = r13.save()
            android.graphics.RectF r8 = r0.A09
            float r5 = r8.right
            float r6 = r0.A01
            float r5 = r5 - r6
            float r2 = r8.bottom
            float r2 = r2 - r6
            r13.translate(r5, r2)
            android.graphics.Path[] r2 = r0.A0K
            r5 = r2[r4]
            android.graphics.Paint[] r2 = r0.A0I
            r2 = r2[r4]
            r13.drawPath(r5, r2)
            float r2 = r8.width()
            float r14 = -r2
            float r11 = r11 * r6
            float r14 = r14 + r11
            r15 = 0
            float r2 = r0.A02
            float r6 = r6 + r2
            android.graphics.Paint[] r2 = r0.A0J
            r18 = r2[r4]
            r16 = r15
            r17 = r6
            r13.drawRect(r14, r15, r16, r17, r18)
            r13.restoreToCount(r7)
        L_0x00d3:
            int r4 = r13.save()
            android.graphics.RectF r7 = r0.A09
            float r8 = r7.left
            float r5 = r0.A01
            float r8 = r8 + r5
            float r6 = r7.bottom
            boolean r2 = X.AnonymousClass000.A1S(r3)
            float r2 = (float) r2
            float r2 = r2 * r5
            float r6 = r6 - r2
            r13.translate(r8, r6)
            r6 = 3
            if (r3 == 0) goto L_0x00f8
            android.graphics.Path[] r2 = r0.A0K
            r3 = r2[r6]
            android.graphics.Paint[] r2 = r0.A0I
            r2 = r2[r6]
            r13.drawPath(r3, r2)
        L_0x00f8:
            boolean r2 = r0.A0E
            if (r2 == 0) goto L_0x0114
            float r14 = -r5
            float r2 = r0.A02
            float r14 = r14 - r2
            r15 = 0
            float r2 = r7.height()
            float r2 = -r2
            float r1 = (float) r1
            float r1 = r1 * r5
            float r2 = r2 + r1
            android.graphics.Paint[] r1 = r0.A0J
            r18 = r1[r6]
            r16 = r15
            r17 = r2
            r13.drawRect(r14, r15, r16, r17, r18)
        L_0x0114:
            r13.restoreToCount(r4)
        L_0x0117:
            android.graphics.Path r1 = r0.A00
            if (r1 == 0) goto L_0x0231
            android.graphics.Paint r0 = r0.A08
            r13.drawPath(r1, r0)
            return
        L_0x0121:
            boolean r2 = r0.A0E
            if (r2 == 0) goto L_0x0117
            goto L_0x00d3
        L_0x0126:
            boolean r2 = r0.A0F
            if (r2 == 0) goto L_0x009c
            goto L_0x005c
        L_0x012c:
            android.graphics.Path[] r1 = r0.A0K
            r2 = 0
            r4 = r1[r2]
            android.graphics.Paint[] r1 = r0.A0I
            r3 = r1[r2]
            android.graphics.Paint[] r1 = r0.A0J
            r18 = r1[r2]
            r9 = 2
            boolean[] r8 = new boolean[r9]
            boolean r6 = r0.A0G
            r8[r2] = r6
            boolean r2 = r0.A0D
            r1 = 1
            r8[r1] = r2
            r7 = 0
            r1 = 0
        L_0x0147:
            boolean r5 = r8[r7]
            if (r5 == 0) goto L_0x014d
            int r1 = r1 + 1
        L_0x014d:
            int r7 = r7 + 1
            if (r7 < r9) goto L_0x0147
            r12 = 1073741824(0x40000000, float:2.0)
            if (r6 == 0) goto L_0x022b
            int r9 = r13.save()
            android.graphics.RectF r10 = r0.A09
            float r7 = r10.left
            float r8 = r0.A01
            float r7 = r7 + r8
            float r5 = r10.top
            float r5 = r5 + r8
            r13.translate(r7, r5)
            r13.drawPath(r4, r3)
            r14 = 0
            float r7 = -r8
            float r5 = r0.A02
            float r15 = r7 - r5
            float r16 = r10.width()
            float r8 = r8 * r12
            float r16 = r16 - r8
            r17 = r7
            r13.drawRect(r14, r15, r16, r17, r18)
            r13.restoreToCount(r9)
        L_0x017e:
            int r8 = r13.save()
            android.graphics.RectF r9 = r0.A09
            float r11 = r9.right
            float r7 = r0.A01
            float r11 = r11 - r7
            float r10 = r9.top
            boolean r5 = X.AnonymousClass000.A1S(r6)
            float r5 = (float) r5
            float r5 = r5 * r7
            float r10 = r10 + r5
            r13.translate(r11, r10)
            r5 = 1119092736(0x42b40000, float:90.0)
            r13.rotate(r5)
            if (r6 == 0) goto L_0x019f
            r13.drawPath(r4, r3)
        L_0x019f:
            boolean r5 = r0.A0F
            if (r5 == 0) goto L_0x01b6
            r14 = 0
            float r6 = -r7
            float r5 = r0.A02
            float r15 = r6 - r5
            float r16 = r9.height()
            float r5 = (float) r1
            float r5 = r5 * r7
            float r16 = r16 - r5
            r17 = r6
            r13.drawRect(r14, r15, r16, r17, r18)
        L_0x01b6:
            r13.restoreToCount(r8)
        L_0x01b9:
            if (r2 == 0) goto L_0x0226
            int r8 = r13.save()
            android.graphics.RectF r9 = r0.A09
            float r6 = r9.right
            float r7 = r0.A01
            float r6 = r6 - r7
            float r5 = r9.bottom
            float r5 = r5 - r7
            r13.translate(r6, r5)
            r5 = 1127481344(0x43340000, float:180.0)
            r13.rotate(r5)
            r13.drawPath(r4, r3)
            r14 = 0
            float r6 = -r7
            float r5 = r0.A02
            float r15 = r6 - r5
            float r16 = r9.width()
            float r12 = r12 * r7
            float r16 = r16 - r12
            r17 = r6
            r13.drawRect(r14, r15, r16, r17, r18)
            r13.restoreToCount(r8)
        L_0x01e9:
            int r6 = r13.save()
            android.graphics.RectF r8 = r0.A09
            float r10 = r8.left
            float r5 = r0.A01
            float r10 = r10 + r5
            float r9 = r8.bottom
            boolean r7 = X.AnonymousClass000.A1S(r2)
            float r7 = (float) r7
            float r7 = r7 * r5
            float r9 = r9 - r7
            r13.translate(r10, r9)
            r7 = 1132920832(0x43870000, float:270.0)
            r13.rotate(r7)
            if (r2 == 0) goto L_0x020a
            r13.drawPath(r4, r3)
        L_0x020a:
            boolean r2 = r0.A0E
            if (r2 == 0) goto L_0x0221
            r14 = 0
            float r3 = -r5
            float r2 = r0.A02
            float r15 = r3 - r2
            float r16 = r8.height()
            float r1 = (float) r1
            float r1 = r1 * r5
            float r16 = r16 - r1
            r17 = r3
            r13.drawRect(r14, r15, r16, r17, r18)
        L_0x0221:
            r13.restoreToCount(r6)
            goto L_0x0117
        L_0x0226:
            boolean r5 = r0.A0E
            if (r5 == 0) goto L_0x0117
            goto L_0x01e9
        L_0x022b:
            boolean r5 = r0.A0F
            if (r5 == 0) goto L_0x01b9
            goto L_0x017e
        L_0x0231:
            float r3 = r0.A01
            r2 = 0
            int r1 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0254
            float r1 = r0.A03
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0251
            boolean r1 = r0.A0C
            if (r1 == 0) goto L_0x0251
            android.graphics.RectF r2 = r0.A09
            android.graphics.Paint r1 = r0.A07
            r13.drawRoundRect(r2, r3, r3, r1)
            android.graphics.RectF r1 = r0.A0A
        L_0x024b:
            android.graphics.Paint r0 = r0.A08
            r13.drawRoundRect(r1, r3, r3, r0)
            return
        L_0x0251:
            android.graphics.RectF r1 = r0.A09
            goto L_0x024b
        L_0x0254:
            android.graphics.RectF r1 = r0.A09
            android.graphics.Paint r0 = r0.A08
            r13.drawRect(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01D.draw(android.graphics.Canvas):void");
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5 = 0.0f;
        if (this.A0E) {
            f = this.A02;
        } else {
            f = 0.0f;
        }
        if (this.A0F) {
            f2 = this.A02;
        } else {
            f2 = 0.0f;
        }
        boolean z = this.A0G;
        if (z) {
            float f6 = this.A02;
            if (this.A0C) {
                f4 = 0.0f;
            } else {
                f4 = this.A01;
            }
            f3 = f6 + f4;
        } else {
            f3 = 0.0f;
        }
        if (this.A0D) {
            float f7 = this.A02;
            if (!this.A0C) {
                f5 = this.A01;
            }
            f5 += f7;
            if (z) {
                float f8 = this.A03;
                f3 -= f8;
                f5 += f8;
            }
        }
        rect.set((int) f, (int) f3, (int) f2, (int) f5);
        return true;
    }

    /* JADX WARNING: type inference failed for: r11v14, types: [android.graphics.BitmapShader] */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01fe, code lost:
        if (r2 == false) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0200, code lost:
        r12 = r7.A05;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0202, code lost:
        if (r12 == null) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0204, code lost:
        r12.eraseColor(0);
        r8 = new android.graphics.Paint();
        X.AnonymousClass001.A10(r8);
        r8.setDither(true);
        r8.setShader(r24);
        r15 = new android.graphics.Canvas(r12);
        r35 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01bd, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01bd, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBoundsChange(android.graphics.Rect r41) {
        /*
            r40 = this;
            r7 = r40
            r1 = r41
            super.onBoundsChange(r1)
            android.graphics.RectF r3 = r7.A09
            int r0 = r1.left
            float r9 = (float) r0
            float r6 = r7.A02
            float r9 = r9 + r6
            boolean r8 = r7.A0G
            int r0 = r1.top
            float r4 = (float) r0
            if (r8 == 0) goto L_0x0017
            float r4 = r4 + r6
        L_0x0017:
            int r0 = r1.right
            float r2 = (float) r0
            float r2 = r2 - r6
            boolean r5 = r7.A0D
            int r0 = r1.bottom
            float r0 = (float) r0
            if (r5 == 0) goto L_0x0023
            float r0 = r0 - r6
        L_0x0023:
            r3.set(r9, r4, r2, r0)
            android.graphics.RectF r10 = r7.A0A
            int r0 = r1.left
            float r9 = (float) r0
            float r9 = r9 + r6
            int r0 = r1.top
            float r4 = (float) r0
            if (r8 == 0) goto L_0x0035
            float r4 = r4 + r6
            float r0 = r7.A03
            float r4 = r4 - r0
        L_0x0035:
            int r0 = r1.right
            float r2 = (float) r0
            float r2 = r2 - r6
            int r0 = r1.bottom
            float r1 = (float) r0
            if (r5 == 0) goto L_0x0042
            float r1 = r1 - r6
            float r0 = r7.A03
            float r1 = r1 - r0
        L_0x0042:
            r10.set(r9, r4, r2, r1)
            boolean r0 = r7.A0E
            if (r0 == 0) goto L_0x025f
            if (r8 == 0) goto L_0x025f
            boolean r0 = r7.A0F
            if (r0 == 0) goto L_0x025f
            if (r5 == 0) goto L_0x025f
            r0 = 0
            r7.A00 = r0
        L_0x0054:
            float r5 = r7.A01
            float r0 = -r5
            r39 = r0
            android.graphics.RectF r23 = new android.graphics.RectF
            r2 = r0
            r0 = r23
            r0.<init>(r2, r2, r5, r5)
            android.graphics.RectF r22 = new android.graphics.RectF
            r1 = r22
            r1.<init>(r0)
            float r13 = -r6
            r1.inset(r13, r13)
            X.0GA r4 = r7.A0B
            boolean r2 = r7.A0H
            if (r2 == 0) goto L_0x025b
            float r11 = r4.colorAlphaMultiplierDark
        L_0x0074:
            int[] r1 = A0M
            int r0 = r1.length
            int[] r29 = java.util.Arrays.copyOf(r1, r0)
            r10 = 3
            int[] r1 = new int[r10]
            r1 = {-15173646, -15173646, -15173646} // fill-array
            if (r2 == 0) goto L_0x008d
            boolean r0 = r4.hasFoaStroke
            if (r0 == 0) goto L_0x008d
            A00(r1)
            A00(r29)
        L_0x008d:
            int[] r0 = new int[r10]
            r38 = r0
            r3 = 0
            r2 = r1[r3]
            r8 = 1050253722(0x3e99999a, float:0.3)
            float r8 = r8 * r11
            X.AnonymousClass0J6.A01(r0, r8, r2, r3)
            r2 = 1
            r9 = r1[r2]
            r12 = 1036831949(0x3dcccccd, float:0.1)
            float r12 = r12 * r11
            X.AnonymousClass0J6.A01(r0, r12, r9, r2)
            r14 = 2
            r1 = r1[r14]
            r9 = 0
            X.AnonymousClass0J6.A01(r0, r9, r1, r14)
            boolean r1 = r4.hasFoaStroke
            r0 = 4
            if (r1 == 0) goto L_0x023b
            int[] r1 = new int[r10]
            int r0 = r7.A04
            X.AnonymousClass0J6.A01(r1, r8, r0, r3)
            X.AnonymousClass0J6.A01(r1, r12, r0, r2)
            X.AnonymousClass0J6.A01(r1, r9, r0, r14)
            float[] r0 = new float[r10]
            r21 = r0
            r0 = {0, 1056964608, 1065353216} // fill-array
            android.graphics.Rect r0 = r7.getBounds()
            int r0 = r0.width()
            float r10 = (float) r0
            float r8 = r6 + r5
            r0 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 * r0
            float r10 = r10 - r8
            float[] r30 = A0L
            android.graphics.Shader$TileMode r31 = android.graphics.Shader.TileMode.REPEAT
            r8 = 0
            android.graphics.LinearGradient r20 = new android.graphics.LinearGradient
            r26 = r9
            r28 = r9
            r24 = r20
            r25 = r9
            r27 = r10
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
        L_0x00e8:
            float r19 = r5 + r6
            boolean r0 = r4.hasFoaStroke
            r28 = r1
            if (r0 == 0) goto L_0x00f2
            r28 = r38
        L_0x00f2:
            android.graphics.Shader$TileMode r31 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.RadialGradient r18 = new android.graphics.RadialGradient
            r17 = 0
            r26 = r9
            r24 = r18
            r25 = r9
            r27 = r19
            r29 = r21
            r30 = r31
            r24.<init>(r25, r26, r27, r28, r29, r30)
            boolean r0 = r4.hasFoaStroke
            if (r0 == 0) goto L_0x0238
            int r9 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r9 >= r0) goto L_0x0238
        L_0x0111:
            r10 = 0
            r9 = 0
        L_0x0113:
            android.graphics.Path[] r11 = r7.A0K
            int r0 = r11.length
            if (r10 >= r0) goto L_0x02a1
            r0 = r11[r10]
            r0.reset()
            android.graphics.Path$FillType r11 = android.graphics.Path.FillType.EVEN_ODD
            r0.setFillType(r11)
            android.graphics.Paint[] r11 = r7.A0I
            r12 = r11[r10]
            r11 = r18
            r12.setShader(r11)
            r12 = 180(0xb4, float:2.52E-43)
            r11 = 90
            if (r9 == r11) goto L_0x021f
            if (r9 == r12) goto L_0x01e1
            r11 = 270(0x10e, float:3.78E-43)
            if (r9 == r11) goto L_0x01cb
            r11 = r39
            r0.moveTo(r11, r8)
            r0.rLineTo(r13, r8)
            float r28 = r13 - r5
            android.graphics.LinearGradient r11 = new android.graphics.LinearGradient
            r27 = r8
            r24 = r11
            r29 = r1
            r30 = r21
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            boolean r8 = r4.hasFoaStroke
            if (r8 == 0) goto L_0x018f
            if (r2 == 0) goto L_0x018f
            android.graphics.Bitmap r12 = r7.A06
            if (r12 == 0) goto L_0x018f
            r12.eraseColor(r3)
            android.graphics.Paint r8 = new android.graphics.Paint
            r8.<init>()
            X.AnonymousClass001.A10(r8)
            r14 = 1
            r8.setDither(r14)
            r8.setShader(r11)
            android.graphics.Canvas r15 = new android.graphics.Canvas
            r15.<init>(r12)
            r14 = r17
            r11 = r19
            r15.translate(r14, r11)
            float r11 = -r11
            r16 = r11
            r35 = 1065353216(0x3f800000, float:1.0)
            r36 = 0
        L_0x017d:
            r32 = r15
            r33 = r17
            r34 = r16
            r37 = r8
            r32.drawRect(r33, r34, r35, r36, r37)
            android.graphics.Shader$TileMode r8 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.BitmapShader r11 = new android.graphics.BitmapShader
            r11.<init>(r12, r8, r8)
        L_0x018f:
            float r14 = (float) r9
            r12 = 1127481344(0x43340000, float:180.0)
            float r12 = r12 + r14
            r15 = 1119092736(0x42b40000, float:90.0)
            r8 = r22
            r0.arcTo(r8, r12, r15, r3)
            r8 = 1132920832(0x43870000, float:270.0)
            float r14 = r14 + r8
            r12 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r8 = r23
            r0.arcTo(r8, r14, r12, r3)
            r0.close()
            boolean r0 = r4.hasFoaStroke
            if (r0 == 0) goto L_0x01bd
            if (r20 == 0) goto L_0x01bd
            r0 = 180(0xb4, float:2.52E-43)
            if (r9 == r0) goto L_0x01b3
            if (r9 != 0) goto L_0x01bd
        L_0x01b3:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.ComposeShader r8 = new android.graphics.ComposeShader
            r0 = r20
            r8.<init>(r11, r0, r12)
            r11 = r8
        L_0x01bd:
            android.graphics.Paint[] r0 = r7.A0J
            r0 = r0[r10]
            r0.setShader(r11)
            int r9 = r9 + 90
            int r10 = r10 + 1
            r8 = 0
            goto L_0x0113
        L_0x01cb:
            r0.moveTo(r8, r5)
            r0.rLineTo(r8, r6)
            float r27 = r13 - r5
            android.graphics.LinearGradient r11 = new android.graphics.LinearGradient
            r28 = r8
            r24 = r11
            r29 = r38
            r30 = r21
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            goto L_0x018f
        L_0x01e1:
            r0.moveTo(r5, r8)
            r0.rLineTo(r6, r8)
            r16 = 0
            r36 = r19
            android.graphics.LinearGradient r11 = new android.graphics.LinearGradient
            r27 = r8
            r24 = r11
            r28 = r19
            r29 = r1
            r30 = r21
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            boolean r8 = r4.hasFoaStroke
            if (r8 == 0) goto L_0x018f
            if (r2 == 0) goto L_0x018f
            android.graphics.Bitmap r12 = r7.A05
            if (r12 == 0) goto L_0x018f
            r12.eraseColor(r3)
            android.graphics.Paint r8 = new android.graphics.Paint
            r8.<init>()
            X.AnonymousClass001.A10(r8)
            r14 = 1
            r8.setDither(r14)
            r8.setShader(r11)
            android.graphics.Canvas r15 = new android.graphics.Canvas
            r15.<init>(r12)
            r35 = 1065353216(0x3f800000, float:1.0)
            goto L_0x017d
        L_0x021f:
            r11 = r39
            r0.moveTo(r8, r11)
            r0.rLineTo(r8, r13)
            android.graphics.LinearGradient r11 = new android.graphics.LinearGradient
            r28 = r8
            r24 = r11
            r27 = r19
            r29 = r38
            r30 = r21
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            goto L_0x018f
        L_0x0238:
            r2 = 0
            goto L_0x0111
        L_0x023b:
            int[] r1 = new int[r0]
            int r15 = r7.A04
            r16 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 * r16
            X.AnonymousClass0J6.A01(r1, r11, r15, r3)
            X.AnonymousClass0J6.A01(r1, r8, r15, r2)
            X.AnonymousClass0J6.A01(r1, r12, r15, r14)
            X.AnonymousClass0J6.A01(r1, r9, r15, r10)
            float[] r0 = new float[r0]
            r21 = r0
            r0 = {0, 1048576000, 1061158912, 1065353216} // fill-array
            r8 = 0
            r20 = 0
            goto L_0x00e8
        L_0x025b:
            float r11 = r4.colorAlphaMultiplierLight
            goto L_0x0074
        L_0x025f:
            android.graphics.Path r0 = r7.A00
            if (r0 != 0) goto L_0x0269
            android.graphics.Path r0 = X.AnonymousClass002.A06()
            r7.A00 = r0
        L_0x0269:
            r0.reset()
            r4 = 0
            if (r8 == 0) goto L_0x029f
            float r1 = r7.A01
        L_0x0271:
            if (r5 == 0) goto L_0x0275
            float r4 = r7.A01
        L_0x0275:
            r0 = 8
            float[] r2 = new float[r0]
            r0 = 0
            r2[r0] = r1
            r0 = 1
            r2[r0] = r1
            r0 = 2
            r2[r0] = r1
            r0 = 3
            r2[r0] = r1
            r0 = 4
            r2[r0] = r4
            r0 = 5
            r2[r0] = r4
            r0 = 6
            r2[r0] = r4
            r0 = 7
            r2[r0] = r4
            android.graphics.Path r1 = r7.A00
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r1.addRoundRect(r3, r2, r0)
            android.graphics.Path r0 = r7.A00
            r0.close()
            goto L_0x0054
        L_0x029f:
            r1 = 0
            goto L_0x0271
        L_0x02a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01D.onBoundsChange(android.graphics.Rect):void");
    }

    public void setAlpha(int i) {
        for (Paint alpha : this.A0I) {
            alpha.setAlpha(i);
        }
        for (Paint alpha2 : this.A0J) {
            alpha2.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        for (Paint colorFilter2 : this.A0I) {
            colorFilter2.setColorFilter(colorFilter);
        }
        for (Paint colorFilter3 : this.A0J) {
            colorFilter3.setColorFilter(colorFilter);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0094, code lost:
        if (r1 != false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L_0x001a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass01D(android.content.Context r11, X.AnonymousClass0GA r12, X.C153427bI r13, int r14, int r15) {
        /*
            r10 = this;
            r10.<init>()
            float r0 = r12.shadowSizeDp
            float r6 = X.AnonymousClass0J7.A00(r11, r0)
            float r0 = r12.cornerRadiusDp
            float r5 = X.AnonymousClass0J7.A00(r11, r0)
            boolean r0 = r12.hasFoaStroke
            if (r0 == 0) goto L_0x001a
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r0 = 1
            if (r2 < r1) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x002f
            float r6 = r6 + r5
            int r2 = (int) r6
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x002d }
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r3, r2, r0)     // Catch:{ all -> 0x002d }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r2, r0)     // Catch:{ all -> 0x002d }
            r4 = r1
            goto L_0x0030
        L_0x002d:
            X.0GA r12 = X.AnonymousClass0GA.PRIMARY_FALLBACK
        L_0x002f:
            r0 = r4
        L_0x0030:
            r10.A06 = r4
            r10.A05 = r0
            r10.A0B = r12
            float r0 = r12.cornerRadiusDp
            float r0 = X.AnonymousClass0J7.A00(r11, r0)
            r1 = 0
            float r0 = java.lang.Math.max(r1, r0)
            r10.A01 = r0
            float r0 = r12.shadowSizeDp
            float r0 = X.AnonymousClass0J7.A00(r11, r0)
            float r0 = java.lang.Math.max(r1, r0)
            r10.A02 = r0
            int r0 = r12.verticalOffsetDp
            float r0 = (float) r0
            float r0 = X.AnonymousClass0J7.A00(r11, r0)
            float r0 = java.lang.Math.max(r1, r0)
            r10.A03 = r0
            boolean r6 = X.C153867c9.A01(r11, r13)
            r10.A0H = r6
            if (r6 == 0) goto L_0x0119
            int r7 = r12.shadowColorDark
        L_0x0066:
            r10.A04 = r7
            r0 = r15 & 1
            boolean r9 = X.AnonymousClass000.A1U(r0, r3)
            r10.A0G = r9
            r1 = 2
            r0 = r15 & 2
            boolean r8 = X.AnonymousClass000.A1U(r0, r1)
            r10.A0E = r8
            r4 = 4
            r0 = r15 & 4
            boolean r2 = X.AnonymousClass000.A1U(r0, r4)
            r10.A0F = r2
            r1 = 8
            r0 = r15 & 8
            boolean r1 = X.AnonymousClass000.A1U(r0, r1)
            r10.A0D = r1
            r5 = 0
            if (r9 == 0) goto L_0x0096
            if (r8 == 0) goto L_0x0096
            if (r2 == 0) goto L_0x0096
            r0 = 1
            if (r1 != 0) goto L_0x0097
        L_0x0096:
            r0 = 0
        L_0x0097:
            r10.A0C = r0
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r10.A08 = r1
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r1.setStyle(r0)
            r1.setColor(r14)
            r1.setAntiAlias(r3)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r10.A07 = r2
            r2.setStyle(r0)
            r2.setColor(r7)
            r0 = 1050253722(0x3e99999a, float:0.3)
            if (r6 == 0) goto L_0x0116
            float r1 = r12.colorAlphaMultiplierDark
        L_0x00bf:
            float r1 = r1 * r0
            r0 = 1132396544(0x437f0000, float:255.0)
            int r0 = X.AnonymousClass001.A07(r1, r0)
            r2.setAlpha(r0)
            r2.setAntiAlias(r3)
            boolean r0 = r12.hasFoaStroke
            if (r0 != 0) goto L_0x00d1
            r4 = 1
        L_0x00d1:
            android.graphics.Path[] r0 = new android.graphics.Path[r4]
            r10.A0K = r0
            android.graphics.RectF r0 = X.AnonymousClass002.A07()
            r10.A09 = r0
            android.graphics.RectF r0 = X.AnonymousClass002.A07()
            r10.A0A = r0
            android.graphics.Paint[] r0 = new android.graphics.Paint[r4]
            r10.A0I = r0
            android.graphics.Paint[] r0 = new android.graphics.Paint[r4]
            r10.A0J = r0
        L_0x00e9:
            android.graphics.Path[] r1 = r10.A0K
            android.graphics.Path r0 = X.AnonymousClass002.A06()
            r1[r5] = r0
            android.graphics.Paint[] r1 = r10.A0I
            r2 = 4
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r2)
            X.AnonymousClass001.A10(r0)
            r1[r5] = r0
            android.graphics.Paint[] r0 = r10.A0I
            r0 = r0[r5]
            r0.setAntiAlias(r3)
            android.graphics.Paint[] r1 = r10.A0J
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r2)
            X.AnonymousClass001.A10(r0)
            r1[r5] = r0
            int r5 = r5 + 1
            if (r5 < r4) goto L_0x00e9
            return
        L_0x0116:
            float r1 = r12.colorAlphaMultiplierLight
            goto L_0x00bf
        L_0x0119:
            int r7 = r12.shadowColorLight
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01D.<init>(android.content.Context, X.0GA, X.7bI, int, int):void");
    }

    public static void A00(int[] iArr) {
        int A002 = AnonymousClass0J6.A00(-14931149, 0.2f);
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            int alpha = Color.alpha(i2);
            int alpha2 = Color.alpha(A002);
            int i3 = (255 - alpha2) * alpha;
            int i4 = i3 + alpha2;
            iArr[i] = Color.argb(Math.min(255, i4), ((Color.red(i2) * i3) + (Color.red(A002) * alpha2)) / i4, ((Color.green(i2) * i3) + (Color.green(A002) * alpha2)) / i4, ((i3 * Color.blue(i2)) + (Color.blue(A002) * alpha2)) / i4);
        }
    }
}
