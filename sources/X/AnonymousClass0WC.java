package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;

/* renamed from: X.0WC  reason: invalid class name */
public class AnonymousClass0WC {
    public static final Matrix A0G = AnonymousClass002.A05();
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public Paint A06;
    public Paint A07;
    public PathMeasure A08;
    public Boolean A09;
    public String A0A;
    public final Matrix A0B;
    public final Path A0C;
    public final Path A0D;
    public final AnonymousClass05C A0E;
    public final AnonymousClass0AT A0F;

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0114, code lost:
        if (r1.A00 != 0) goto L_0x0116;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.graphics.Canvas r23, android.graphics.Matrix r24, X.AnonymousClass0AT r25, int r26, int r27) {
        /*
            r22 = this;
            r9 = 0
            r14 = r25
            android.graphics.Matrix r8 = r14.A0B
            r0 = r24
            r8.set(r0)
            android.graphics.Matrix r0 = r14.A0A
            r8.preConcat(r0)
            r15 = r23
            r15.save()
            r7 = 0
        L_0x0015:
            java.util.ArrayList r1 = r14.A0C
            int r0 = r1.size()
            if (r7 >= r0) goto L_0x01e4
            java.lang.Object r6 = r1.get(r7)
            X.0O6 r6 = (X.AnonymousClass0O6) r6
            boolean r0 = r6 instanceof X.AnonymousClass0AT
            r5 = r22
            r2 = r26
            r1 = r27
            if (r0 == 0) goto L_0x0041
            X.0AT r6 = (X.AnonymousClass0AT) r6
            r20 = r2
            r21 = r1
            r18 = r8
            r19 = r6
            r16 = r5
            r17 = r15
            r16.A00(r17, r18, r19, r20, r21)
        L_0x003e:
            int r7 = r7 + 1
            goto L_0x0015
        L_0x0041:
            boolean r0 = r6 instanceof X.AnonymousClass0AS
            if (r0 == 0) goto L_0x003e
            X.0AS r6 = (X.AnonymousClass0AS) r6
            float r2 = (float) r2
            float r0 = r5.A03
            float r2 = r2 / r0
            float r1 = (float) r1
            float r0 = r5.A02
            float r1 = r1 / r0
            float r18 = java.lang.Math.min(r2, r1)
            android.graphics.Matrix r4 = r5.A0B
            r4.set(r8)
            r4.postScale(r2, r1)
            r0 = 4
            float[] r12 = new float[r0]
            r12 = {0, 1065353216, 1065353216, 0} // fill-array
            r8.mapVectors(r12)
            r0 = 0
            r3 = r12[r0]
            double r10 = (double) r3
            r0 = 1
            r2 = r12[r0]
            double r0 = (double) r2
            double r0 = java.lang.Math.hypot(r10, r0)
            float r10 = (float) r0
            r16 = r10
            r0 = 2
            r13 = r12[r0]
            double r10 = (double) r13
            r0 = 3
            r12 = r12[r0]
            double r0 = (double) r12
            double r0 = java.lang.Math.hypot(r10, r0)
            float r10 = (float) r0
            float r3 = r3 * r12
            float r2 = r2 * r13
            float r3 = r3 - r2
            r0 = r16
            float r1 = java.lang.Math.max(r0, r10)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x003e
            float r17 = java.lang.Math.abs(r3)
            float r17 = r17 / r1
            r12 = 0
            int r0 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x003e
            android.graphics.Path r3 = r5.A0C
            r3.reset()
            X.0Wm[] r0 = r6.A03
            if (r0 == 0) goto L_0x00a5
            X.C06160Wm.A01(r3, r0)
        L_0x00a5:
            android.graphics.Path r11 = r5.A0D
            r11.reset()
            boolean r0 = r6.A02()
            if (r0 == 0) goto L_0x00c4
            int r0 = r6.A01
            if (r0 != 0) goto L_0x00c1
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
        L_0x00b6:
            r11.setFillType(r0)
            r11.addPath(r3, r4)
            r15.clipPath(r11)
            goto L_0x003e
        L_0x00c1:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
            goto L_0x00b6
        L_0x00c4:
            X.0AV r6 = (X.AnonymousClass0AV) r6
            float r13 = r6.A06
            r1 = 1065353216(0x3f800000, float:1.0)
            r10 = 1
            int r0 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x00d5
            float r0 = r6.A04
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0108
        L_0x00d5:
            float r0 = r6.A05
            float r13 = r13 + r0
            float r13 = r13 % r1
            float r2 = r6.A04
            float r2 = r2 + r0
            float r2 = r2 % r1
            android.graphics.PathMeasure r1 = r5.A08
            if (r1 != 0) goto L_0x00e8
            android.graphics.PathMeasure r1 = new android.graphics.PathMeasure
            r1.<init>()
            r5.A08 = r1
        L_0x00e8:
            r0 = 0
            r1.setPath(r3, r0)
            android.graphics.PathMeasure r0 = r5.A08
            float r1 = r0.getLength()
            float r13 = r13 * r1
            float r2 = r2 * r1
            r3.reset()
            int r16 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            android.graphics.PathMeasure r0 = r5.A08
            if (r16 <= 0) goto L_0x01df
            r0.getSegment(r13, r1, r3, r10)
            android.graphics.PathMeasure r0 = r5.A08
            r0.getSegment(r12, r2, r3, r10)
        L_0x0105:
            r3.rLineTo(r12, r12)
        L_0x0108:
            r11.addPath(r3, r4)
            X.0Le r1 = r6.A09
            android.graphics.Shader r0 = r1.A02
            if (r0 != 0) goto L_0x0116
            int r0 = r1.A00
            r2 = 0
            if (r0 == 0) goto L_0x0117
        L_0x0116:
            r2 = 1
        L_0x0117:
            r12 = 1132396544(0x437f0000, float:255.0)
            r3 = 255(0xff, float:3.57E-43)
            if (r2 == 0) goto L_0x014f
            android.graphics.Paint r0 = r5.A06
            if (r0 != 0) goto L_0x012b
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r10)
            r5.A06 = r0
            X.AnonymousClass001.A10(r0)
        L_0x012b:
            android.graphics.Paint r2 = r5.A06
            android.graphics.Shader r0 = r1.A02
            if (r0 == 0) goto L_0x01c1
            r0.setLocalMatrix(r4)
            r2.setShader(r0)
            float r0 = r6.A00
            int r0 = X.AnonymousClass001.A07(r0, r12)
            r2.setAlpha(r0)
        L_0x0140:
            r2.setColorFilter(r9)
            int r0 = r6.A01
            if (r0 != 0) goto L_0x01be
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
        L_0x0149:
            r11.setFillType(r0)
            r15.drawPath(r11, r2)
        L_0x014f:
            X.0Le r1 = r6.A0A
            android.graphics.Shader r0 = r1.A02
            if (r0 != 0) goto L_0x0159
            int r0 = r1.A00
            if (r0 == 0) goto L_0x003e
        L_0x0159:
            android.graphics.Paint r0 = r5.A07
            if (r0 != 0) goto L_0x0169
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>(r10)
            r5.A07 = r2
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r0)
        L_0x0169:
            android.graphics.Paint r2 = r5.A07
            android.graphics.Paint$Join r0 = r6.A08
            if (r0 == 0) goto L_0x0172
            r2.setStrokeJoin(r0)
        L_0x0172:
            android.graphics.Paint$Cap r0 = r6.A07
            if (r0 == 0) goto L_0x0179
            r2.setStrokeCap(r0)
        L_0x0179:
            float r0 = r6.A02
            r2.setStrokeMiter(r0)
            android.graphics.Shader r0 = r1.A02
            if (r0 == 0) goto L_0x01a2
            r0.setLocalMatrix(r4)
            r2.setShader(r0)
            float r0 = r6.A01
            int r0 = X.AnonymousClass001.A07(r0, r12)
            r2.setAlpha(r0)
        L_0x0191:
            r2.setColorFilter(r9)
            float r18 = r18 * r17
            float r0 = r6.A03
            float r0 = r0 * r18
            r2.setStrokeWidth(r0)
            r15.drawPath(r11, r2)
            goto L_0x003e
        L_0x01a2:
            r2.setShader(r9)
            r2.setAlpha(r3)
            int r4 = r1.A00
            float r3 = r6.A01
            int r1 = android.graphics.Color.alpha(r4)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r0
            float r0 = (float) r1
            float r0 = r0 * r3
            int r0 = (int) r0
            int r0 = r0 << 24
            r4 = r4 | r0
            r2.setColor(r4)
            goto L_0x0191
        L_0x01be:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
            goto L_0x0149
        L_0x01c1:
            r2.setShader(r9)
            r2.setAlpha(r3)
            int r1 = r1.A00
            float r13 = r6.A00
            int r0 = android.graphics.Color.alpha(r1)
            r16 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r16
            float r0 = (float) r0
            float r0 = r0 * r13
            int r0 = (int) r0
            int r0 = r0 << 24
            r1 = r1 | r0
            r2.setColor(r1)
            goto L_0x0140
        L_0x01df:
            r0.getSegment(r13, r2, r3, r10)
            goto L_0x0105
        L_0x01e4:
            r15.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WC.A00(android.graphics.Canvas, android.graphics.Matrix, X.0AT, int, int):void");
    }

    public float getAlpha() {
        return ((float) this.A05) / 255.0f;
    }

    public int getRootAlpha() {
        return this.A05;
    }

    public void setAlpha(float f) {
        this.A05 = (int) (f * 255.0f);
    }

    public AnonymousClass0WC(AnonymousClass0WC r4) {
        this.A0B = AnonymousClass002.A05();
        this.A01 = 0.0f;
        this.A00 = 0.0f;
        this.A03 = 0.0f;
        this.A02 = 0.0f;
        this.A05 = 255;
        this.A0A = null;
        this.A09 = null;
        AnonymousClass05C r2 = new AnonymousClass05C();
        this.A0E = r2;
        this.A0F = new AnonymousClass0AT(r2, r4.A0F);
        this.A0C = new Path(r4.A0C);
        this.A0D = new Path(r4.A0D);
        this.A01 = r4.A01;
        this.A00 = r4.A00;
        this.A03 = r4.A03;
        this.A02 = r4.A02;
        this.A04 = r4.A04;
        this.A05 = r4.A05;
        this.A0A = r4.A0A;
        String str = r4.A0A;
        if (str != null) {
            r2.put(str, this);
        }
        this.A09 = r4.A09;
    }

    public void setRootAlpha(int i) {
        this.A05 = i;
    }

    public AnonymousClass0WC() {
        this.A0B = AnonymousClass002.A05();
        this.A01 = 0.0f;
        this.A00 = 0.0f;
        this.A03 = 0.0f;
        this.A02 = 0.0f;
        this.A05 = 255;
        this.A0A = null;
        this.A09 = null;
        this.A0E = new AnonymousClass05C();
        this.A0F = new AnonymousClass0AT();
        this.A0C = AnonymousClass002.A06();
        this.A0D = AnonymousClass002.A06();
    }
}
