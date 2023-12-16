package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: X.7XF  reason: invalid class name */
public class AnonymousClass7XF {
    public final Path A00 = AnonymousClass002.A06();
    public final Path A01 = AnonymousClass002.A06();
    public final Path A02 = AnonymousClass002.A06();
    public final Path A03 = AnonymousClass002.A06();
    public final PointF A04 = new PointF();
    public final C153027aY A05 = new C153027aY();
    public final float[] A06 = new float[2];
    public final float[] A07 = new float[2];
    public final Matrix[] A08 = new Matrix[4];
    public final Matrix[] A09 = new Matrix[4];
    public final C153027aY[] A0A = new C153027aY[4];

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0139 A[EDGE_INSN: B:63:0x0139->B:37:0x0139 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.graphics.Path r19, android.graphics.RectF r20, X.C161877ql r21, X.C178898iH r22, float r23) {
        /*
            r18 = this;
            r15 = r19
            r15.rewind()
            r9 = r18
            android.graphics.Path r0 = r9.A03
            r17 = r0
            r17.rewind()
            android.graphics.Path r0 = r9.A00
            r16 = r0
            r16.rewind()
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CW
            r10 = r20
            r0.addRect(r10, r1)
            r8 = 0
            r11 = 0
        L_0x001e:
            r12 = r21
            X.8mP r1 = r12.A03
            r0 = 1
            if (r11 == r0) goto L_0x0135
            r0 = 2
            if (r11 == r0) goto L_0x012f
            r0 = 3
            if (r11 == r0) goto L_0x00f3
            X.7Qk r0 = r12.A07
        L_0x002d:
            X.7aY[] r7 = r9.A0A
            r6 = r7[r11]
            float r2 = r1.B60(r10)
            boolean r0 = r0 instanceof X.AnonymousClass6ZB
            r3 = r23
            if (r0 == 0) goto L_0x0102
            r1 = 1119092736(0x42b40000, float:90.0)
            float r13 = r2 * r23
            r5 = 1127481344(0x43340000, float:180.0)
            float r0 = r5 - r1
            r4 = 0
            r6.A02(r13, r5, r0)
            r14 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r14
            float r2 = r2 * r23
            X.6ZF r13 = new X.6ZF
            r13.<init>(r4, r4, r2, r2)
            r13.A03 = r5
            r13.A04 = r1
            java.util.List r0 = r6.A05
            r0.add(r13)
            X.6ZG r3 = new X.6ZG
            r3.<init>(r13)
            float r1 = r1 + r5
            r6.A00(r5)
            java.util.List r0 = r6.A06
            r0.add(r3)
            r6.A00 = r1
            float r3 = r4 + r2
            r0 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r0
            float r2 = r2 - r4
            float r2 = r2 / r14
            double r0 = (double) r1
            double r13 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.cos(r13)
            float r4 = (float) r0
            float r0 = r2 * r4
            float r0 = r0 + r3
            r6.A02 = r0
            double r0 = java.lang.Math.sin(r13)
            float r4 = (float) r0
            float r2 = r2 * r4
            float r3 = r3 + r2
            r6.A03 = r3
        L_0x0089:
            int r14 = r11 + 1
            int r0 = r14 % 4
            int r0 = r0 * 90
            float r3 = (float) r0
            android.graphics.Matrix[] r6 = r9.A08
            r0 = r6[r11]
            r0.reset()
            android.graphics.PointF r4 = r9.A04
            r0 = 1
            if (r11 == r0) goto L_0x00fd
            r0 = 2
            if (r11 == r0) goto L_0x00fa
            r0 = 3
            if (r11 == r0) goto L_0x00f7
            float r1 = r10.right
        L_0x00a4:
            float r0 = r10.top
        L_0x00a6:
            r4.set(r1, r0)
            r2 = r6[r11]
            float r1 = r4.x
            float r0 = r4.y
            r2.setTranslate(r1, r0)
            r0 = r6[r11]
            r0.preRotate(r3)
            float[] r5 = r9.A06
            r1 = r7[r11]
            float r0 = r1.A02
            r5[r8] = r0
            float r0 = r1.A03
            r13 = 1
            r5[r13] = r0
            r0 = r6[r11]
            r0.mapPoints(r5)
            int r0 = r11 + 1
            int r0 = r0 % 4
            int r0 = r0 * 90
            float r3 = (float) r0
            android.graphics.Matrix[] r4 = r9.A09
            r0 = r4[r11]
            r0.reset()
            r2 = r4[r11]
            r1 = r5[r8]
            r0 = r5[r13]
            r2.setTranslate(r1, r0)
            r0 = r4[r11]
            r0.preRotate(r3)
            r11 = r14
            r0 = 4
            if (r14 >= r0) goto L_0x0139
            if (r14 == r13) goto L_0x0133
            r0 = 2
            if (r14 == r0) goto L_0x012d
            r0 = 3
            if (r14 != r0) goto L_0x001e
            X.8mP r1 = r12.A02
        L_0x00f3:
            X.7Qk r0 = r12.A06
            goto L_0x002d
        L_0x00f7:
            float r1 = r10.left
            goto L_0x00a4
        L_0x00fa:
            float r1 = r10.left
            goto L_0x00ff
        L_0x00fd:
            float r1 = r10.right
        L_0x00ff:
            float r0 = r10.bottom
            goto L_0x00a6
        L_0x0102:
            r13 = 1119092736(0x42b40000, float:90.0)
            float r4 = r2 * r23
            r1 = 1127481344(0x43340000, float:180.0)
            float r0 = r1 - r13
            r6.A02(r4, r1, r0)
            double r0 = (double) r13
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.sin(r0)
            double r4 = (double) r2
            double r0 = r0 * r4
            double r2 = (double) r3
            double r0 = r0 * r2
            float r14 = (float) r0
            float r13 = r13 - r13
            double r0 = (double) r13
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.sin(r0)
            double r0 = r0 * r4
            double r0 = r0 * r2
            float r2 = (float) r0
            r6.A01(r14, r2)
            goto L_0x0089
        L_0x012d:
            X.8mP r1 = r12.A00
        L_0x012f:
            X.7Qk r0 = r12.A04
            goto L_0x002d
        L_0x0133:
            X.8mP r1 = r12.A01
        L_0x0135:
            X.7Qk r0 = r12.A05
            goto L_0x002d
        L_0x0139:
            r2 = r7[r8]
            r0 = 0
            r1 = 0
            r5[r1] = r0
            float r0 = r2.A04
            r11 = 1
            r5[r11] = r0
            r0 = r6[r8]
            r0.mapPoints(r5)
            r1 = r5[r1]
            r0 = r5[r11]
            if (r8 != 0) goto L_0x0268
            r15.moveTo(r1, r0)
        L_0x0152:
            r1 = r7[r8]
            r0 = r6[r8]
            r1.A03(r0, r15)
            if (r22 == 0) goto L_0x0184
            r12 = r7[r8]
            r1 = r6[r8]
            r0 = r22
            X.8By r0 = (X.C170118By) r0
            X.6D7 r3 = r0.A00
            java.util.BitSet r2 = r3.A0K
            r0 = 0
            r2.set(r8, r0)
            X.7hw[] r3 = r3.A0L
            float r0 = r12.A01
            r12.A00(r0)
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>(r1)
            java.util.List r0 = r12.A06
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r0)
            X.6ZH r0 = new X.6ZH
            r0.<init>(r2, r12, r1)
            r3[r8] = r0
        L_0x0184:
            int r0 = r8 + 1
            int r3 = r0 % 4
            r1 = r7[r8]
            float r0 = r1.A02
            r2 = 0
            r5[r2] = r0
            float r0 = r1.A03
            r5[r11] = r0
            r0 = r6[r8]
            r0.mapPoints(r5)
            float[] r0 = r9.A07
            r12 = r7[r3]
            r1 = 0
            r0[r2] = r1
            float r1 = r12.A04
            r0[r11] = r1
            r1 = r6[r3]
            r1.mapPoints(r0)
            r12 = r5[r2]
            r1 = r0[r2]
            float r12 = r12 - r1
            double r12 = (double) r12
            r1 = r5[r11]
            r0 = r0[r11]
            float r1 = r1 - r0
            double r0 = (double) r1
            double r0 = java.lang.Math.hypot(r12, r0)
            float r13 = (float) r0
            r0 = 981668463(0x3a83126f, float:0.001)
            float r13 = r13 - r0
            r12 = 0
            float r0 = java.lang.Math.max(r13, r12)
            r13 = r7[r8]
            float r1 = r13.A02
            r5[r2] = r1
            float r1 = r13.A03
            r5[r11] = r1
            r1 = r6[r8]
            r1.mapPoints(r5)
            if (r8 == r11) goto L_0x0263
            r1 = 3
            if (r8 == r1) goto L_0x0263
            r10.centerY()
        L_0x01d9:
            X.7aY r1 = r9.A05
            r13 = 1132920832(0x43870000, float:270.0)
            r1.A02(r12, r13, r12)
            r13 = 0
            r1.A01(r0, r12)
            android.graphics.Path r12 = r9.A02
            r12.reset()
            r0 = r4[r8]
            r1.A03(r0, r12)
            boolean r0 = r9.A01(r12, r8)
            if (r0 != 0) goto L_0x0242
            boolean r0 = r9.A01(r12, r3)
            if (r0 != 0) goto L_0x0242
            r0 = r4[r8]
            r1.A03(r0, r15)
        L_0x01ff:
            if (r22 == 0) goto L_0x0229
            r12 = r4[r8]
            r0 = r22
            X.8By r0 = (X.C170118By) r0
            X.6D7 r11 = r0.A00
            java.util.BitSet r3 = r11.A0K
            int r0 = r8 + 4
            r3.set(r0, r2)
            X.7hw[] r11 = r11.A0M
            float r0 = r1.A01
            r1.A00(r0)
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>(r12)
            java.util.List r0 = r1.A06
            java.util.ArrayList r2 = X.AnonymousClass002.A0J(r0)
            X.6ZH r0 = new X.6ZH
            r0.<init>(r3, r1, r2)
            r11[r8] = r0
        L_0x0229:
            int r8 = r8 + 1
            r0 = 4
            if (r8 < r0) goto L_0x0139
            r15.close()
            r17.close()
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x0241
            android.graphics.Path$Op r1 = android.graphics.Path.Op.UNION
            r0 = r17
            r15.op(r0, r1)
        L_0x0241:
            return
        L_0x0242:
            android.graphics.Path$Op r3 = android.graphics.Path.Op.DIFFERENCE
            r0 = r16
            r12.op(r12, r0, r3)
            r5[r2] = r13
            float r0 = r1.A04
            r5[r11] = r0
            r0 = r4[r8]
            r0.mapPoints(r5)
            r12 = r5[r2]
            r3 = r5[r11]
            r0 = r17
            r0.moveTo(r12, r3)
            r3 = r4[r8]
            r1.A03(r3, r0)
            goto L_0x01ff
        L_0x0263:
            r10.centerX()
            goto L_0x01d9
        L_0x0268:
            r15.lineTo(r1, r0)
            goto L_0x0152
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7XF.A00(android.graphics.Path, android.graphics.RectF, X.7ql, X.8iH, float):void");
    }

    public final boolean A01(Path path, int i) {
        Path path2 = this.A01;
        path2.reset();
        this.A0A[i].A03(this.A08[i], path2);
        RectF A072 = AnonymousClass002.A07();
        path.computeBounds(A072, true);
        path2.computeBounds(A072, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(A072, true);
        if (!A072.isEmpty() || (A072.width() > 1.0f && A072.height() > 1.0f)) {
            return true;
        }
        return false;
    }

    public AnonymousClass7XF() {
        int i = 0;
        do {
            this.A0A[i] = new C153027aY();
            this.A08[i] = new Matrix();
            this.A09[i] = new Matrix();
            i++;
        } while (i < 4);
    }
}
