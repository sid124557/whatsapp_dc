package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.Map;

/* renamed from: X.0Bv  reason: invalid class name and case insensitive filesystem */
public class C01690Bv extends C09320g0 {
    public C04850Qx A00;
    public C04850Qx A01;
    public C04850Qx A02;
    public C04850Qx A03;
    public C04850Qx A04;
    public C04850Qx A05;
    public C04850Qx A06;
    public C04850Qx A07;
    public C04850Qx A08;
    public final Matrix A09 = AnonymousClass002.A05();
    public final Paint A0A = new C17490vf(this, 0);
    public final Paint A0B = new C17490vf(this, 1);
    public final RectF A0C = AnonymousClass002.A07();
    public final C10550i7 A0D = new C10550i7();
    public final AnonymousClass0QL A0E;
    public final AnonymousClass01G A0F;
    public final C01480Ba A0G;
    public final StringBuilder A0H = new StringBuilder(2);
    public final Map A0I = AnonymousClass001.A0t();

    /* JADX WARNING: Code restructure failed: missing block: B:98:0x028e, code lost:
        if (r13 == null) goto L_0x0290;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03d2 A[EDGE_INSN: B:163:0x03d2->B:148:0x03d2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(android.graphics.Canvas r27, android.graphics.Matrix r28, int r29) {
        /*
            r26 = this;
            r11 = r27
            r11.save()
            r10 = r26
            X.01G r0 = r10.A0F
            r24 = r0
            X.0QL r0 = r0.A04
            X.0i5 r0 = r0.A06
            int r0 = r0.A00
            r25 = r28
            if (r0 > 0) goto L_0x001a
            r0 = r25
            r11.concat(r0)
        L_0x001a:
            X.0Ba r0 = r10.A0G
            java.lang.Object r9 = r0.A0A()
            X.0O0 r9 = (X.AnonymousClass0O0) r9
            X.0QL r0 = r10.A0E
            r23 = r0
            java.util.Map r1 = r0.A09
            java.lang.String r0 = r9.A08
            java.lang.Object r13 = r1.get(r0)
            X.0Lq r13 = (X.C03810Lq) r13
            if (r13 == 0) goto L_0x0290
            X.0Qx r0 = r10.A01
            if (r0 != 0) goto L_0x0212
            X.0Qx r0 = r10.A00
            if (r0 != 0) goto L_0x0212
            android.graphics.Paint r8 = r10.A0A
            int r0 = r9.A04
        L_0x003e:
            r8.setColor(r0)
            X.0Qx r0 = r10.A03
            if (r0 != 0) goto L_0x020a
            X.0Qx r0 = r10.A02
            if (r0 != 0) goto L_0x020a
            android.graphics.Paint r7 = r10.A0B
            int r0 = r9.A05
        L_0x004d:
            r7.setColor(r0)
            X.0QZ r0 = r10.A0L
            X.0Qx r0 = r0.A02
            r1 = 100
            if (r0 != 0) goto L_0x0204
            r0 = 100
        L_0x005a:
            int r0 = r0 * 255
            int r0 = r0 / r1
            r8.setAlpha(r0)
            r7.setAlpha(r0)
            X.0Qx r0 = r10.A05
            if (r0 != 0) goto L_0x01fb
            X.0Qx r0 = r10.A04
            if (r0 != 0) goto L_0x01fb
            float r2 = X.AnonymousClass0Y0.A01(r25)
            float r1 = r9.A03
            float r0 = X.AnonymousClass0Y0.A00()
            float r1 = r1 * r0
            float r1 = r1 * r2
            r7.setStrokeWidth(r1)
        L_0x007a:
            r0 = r24
            X.0QL r0 = r0.A04
            X.0i5 r0 = r0.A06
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x021a
            X.0Qx r0 = r10.A06
            if (r0 == 0) goto L_0x01f7
            float r12 = X.C04850Qx.A02(r0)
        L_0x008c:
            r0 = 1120403456(0x42c80000, float:100.0)
            float r12 = r12 / r0
            float r21 = X.AnonymousClass0Y0.A01(r25)
            java.lang.String r1 = r9.A09
            float r0 = r9.A01
            r20 = r0
            float r0 = X.AnonymousClass0Y0.A00()
            float r20 = r20 * r0
            java.lang.String r0 = "\r\n"
            java.lang.String r2 = "\r"
            java.lang.String r1 = r1.replaceAll(r0, r2)
            java.lang.String r0 = "\n"
            java.lang.String r0 = r1.replaceAll(r0, r2)
            java.lang.String[] r0 = r0.split(r2)
            java.util.List r19 = java.util.Arrays.asList(r0)
            int r18 = r19.size()
            r6 = 0
        L_0x00ba:
            r0 = r18
            if (r6 >= r0) goto L_0x0290
            r0 = r19
            java.lang.String r17 = X.AnonymousClass001.A0n(r0, r6)
            r1 = 0
            r14 = 0
        L_0x00c6:
            int r0 = r17.length()
            if (r14 >= r0) goto L_0x00fb
            r0 = r17
            char r3 = r0.charAt(r14)
            java.lang.String r2 = r13.A00
            java.lang.String r0 = r13.A02
            int r3 = X.AnonymousClass001.A0E(r3, r2, r0)
            r0 = r23
            X.0i5 r2 = r0.A06
            r0 = 0
            java.lang.Object r0 = r2.A01(r3, r0)
            X.0Nj r0 = (X.C04240Nj) r0
            if (r0 == 0) goto L_0x00f8
            double r4 = (double) r1
            double r2 = r0.A01
            double r0 = (double) r12
            double r2 = r2 * r0
            float r0 = X.AnonymousClass0Y0.A00()
            double r0 = (double) r0
            double r2 = r2 * r0
            r0 = r21
            double r0 = (double) r0
            double r2 = r2 * r0
            double r4 = r4 + r2
            float r1 = (float) r4
        L_0x00f8:
            int r14 = r14 + 1
            goto L_0x00c6
        L_0x00fb:
            r11.save()
            X.0FL r0 = r9.A07
            int r3 = r0.ordinal()
            r0 = 1
            r2 = 0
            if (r3 == r0) goto L_0x01ed
            r0 = 2
            if (r3 != r0) goto L_0x0112
            float r1 = -r1
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
        L_0x010f:
            r11.translate(r1, r2)
        L_0x0112:
            int r0 = r18 + -1
            float r1 = (float) r0
            float r1 = r1 * r20
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r0 = (float) r6
            float r0 = r0 * r20
            float r0 = r0 - r1
            r11.translate(r2, r0)
            r3 = 0
        L_0x0122:
            int r0 = r17.length()
            if (r3 >= r0) goto L_0x01f0
            r0 = r17
            char r2 = r0.charAt(r3)
            java.lang.String r1 = r13.A00
            java.lang.String r0 = r13.A02
            int r2 = X.AnonymousClass001.A0E(r2, r1, r0)
            r0 = r23
            X.0i5 r1 = r0.A06
            r0 = 0
            java.lang.Object r5 = r1.A01(r2, r0)
            X.0Nj r5 = (X.C04240Nj) r5
            if (r5 == 0) goto L_0x01e9
            java.util.Map r1 = r10.A0I
            boolean r0 = r1.containsKey(r5)
            if (r0 == 0) goto L_0x019a
            java.lang.Object r4 = r1.get(r5)
            java.util.List r4 = (java.util.List) r4
        L_0x0151:
            r14 = 0
        L_0x0152:
            int r0 = r4.size()
            if (r14 >= r0) goto L_0x01c4
            java.lang.Object r0 = r4.get(r14)
            X.0fv r0 = (X.C09270fv) r0
            android.graphics.Path r2 = r0.BAd()
            android.graphics.RectF r1 = r10.A0C
            r0 = 0
            r2.computeBounds(r1, r0)
            android.graphics.Matrix r1 = r10.A09
            r0 = r25
            r1.set(r0)
            float r0 = r9.A00
            float r0 = -r0
            r16 = r0
            float r0 = X.AnonymousClass0Y0.A00()
            float r16 = r16 * r0
            r0 = 0
            r15 = r0
            r0 = r16
            r1.preTranslate(r15, r0)
            r1.preScale(r12, r12)
            r2.transform(r1)
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x0195
            A00(r11, r8, r2)
            r0 = r7
        L_0x018f:
            A00(r11, r0, r2)
            int r14 = r14 + 1
            goto L_0x0152
        L_0x0195:
            A00(r11, r7, r2)
            r0 = r8
            goto L_0x018f
        L_0x019a:
            java.util.List r0 = r5.A04
            r22 = r0
            int r16 = r22.size()
            java.util.ArrayList r4 = X.AnonymousClass002.A0I(r16)
            r2 = 0
        L_0x01a7:
            r0 = r16
            if (r2 >= r0) goto L_0x01c0
            r0 = r22
            java.lang.Object r15 = r0.get(r2)
            X.0gE r15 = (X.C09460gE) r15
            X.0fv r14 = new X.0fv
            r0 = r24
            r14.<init>(r0, r15, r10)
            r4.add(r14)
            int r2 = r2 + 1
            goto L_0x01a7
        L_0x01c0:
            r1.put(r5, r4)
            goto L_0x0151
        L_0x01c4:
            double r0 = r5.A01
            float r2 = (float) r0
            float r2 = r2 * r12
            float r0 = X.AnonymousClass0Y0.A00()
            float r2 = r2 * r0
            float r2 = r2 * r21
            int r0 = r9.A06
            float r1 = (float) r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 / r0
            X.0Qx r0 = r10.A08
            if (r0 != 0) goto L_0x01dd
            X.0Qx r0 = r10.A07
            if (r0 == 0) goto L_0x01e2
        L_0x01dd:
            float r0 = X.C04850Qx.A02(r0)
            float r1 = r1 + r0
        L_0x01e2:
            float r1 = r1 * r21
            float r2 = r2 + r1
            r0 = 0
            r11.translate(r2, r0)
        L_0x01e9:
            int r3 = r3 + 1
            goto L_0x0122
        L_0x01ed:
            float r1 = -r1
            goto L_0x010f
        L_0x01f0:
            r11.restore()
            int r6 = r6 + 1
            goto L_0x00ba
        L_0x01f7:
            float r12 = r9.A02
            goto L_0x008c
        L_0x01fb:
            float r0 = X.C04850Qx.A02(r0)
            r7.setStrokeWidth(r0)
            goto L_0x007a
        L_0x0204:
            int r0 = X.C04850Qx.A03(r0)
            goto L_0x005a
        L_0x020a:
            android.graphics.Paint r7 = r10.A0B
            int r0 = X.C04850Qx.A03(r0)
            goto L_0x004d
        L_0x0212:
            android.graphics.Paint r8 = r10.A0A
            int r0 = X.C04850Qx.A03(r0)
            goto L_0x003e
        L_0x021a:
            X.AnonymousClass0Y0.A01(r25)
            java.lang.String r4 = r13.A00
            java.lang.String r5 = r13.A02
            android.graphics.drawable.Drawable$Callback r0 = r24.getCallback()
            if (r0 == 0) goto L_0x0290
            r0 = r24
            X.0MT r12 = r0.A06
            if (r12 != 0) goto L_0x023a
            android.graphics.drawable.Drawable$Callback r0 = r24.getCallback()
            X.0MT r12 = new X.0MT
            r12.<init>(r0)
            r0 = r24
            r0.A06 = r12
        L_0x023a:
            X.0PN r3 = r12.A02
            r3.A00 = r4
            r3.A01 = r5
            java.util.Map r2 = r12.A04
            java.lang.Object r13 = r2.get(r3)
            android.graphics.Typeface r13 = (android.graphics.Typeface) r13
            if (r13 != 0) goto L_0x0299
            java.util.Map r6 = r12.A03
            java.lang.Object r13 = r6.get(r4)
            android.graphics.Typeface r13 = (android.graphics.Typeface) r13
            if (r13 != 0) goto L_0x026f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "fonts/"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ".ttf"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            android.content.res.AssetManager r0 = r12.A01
            android.graphics.Typeface r13 = android.graphics.Typeface.createFromAsset(r0, r1)
            r6.put(r4, r13)
        L_0x026f:
            java.lang.String r0 = "Italic"
            boolean r1 = r5.contains(r0)
            java.lang.String r0 = "Bold"
            boolean r0 = r5.contains(r0)
            if (r1 == 0) goto L_0x0294
            r1 = 2
            if (r0 == 0) goto L_0x0281
            r1 = 3
        L_0x0281:
            int r0 = r13.getStyle()
            if (r0 == r1) goto L_0x028b
            android.graphics.Typeface r13 = android.graphics.Typeface.create(r13, r1)
        L_0x028b:
            r2.put(r3, r13)
            if (r13 != 0) goto L_0x0299
        L_0x0290:
            r11.restore()
            return
        L_0x0294:
            boolean r1 = X.AnonymousClass000.A1S(r0)
            goto L_0x0281
        L_0x0299:
            java.lang.String r1 = r9.A09
            r8.setTypeface(r13)
            X.0Qx r0 = r10.A06
            if (r0 == 0) goto L_0x03dc
            float r2 = X.C04850Qx.A02(r0)
        L_0x02a6:
            float r0 = X.AnonymousClass0Y0.A00()
            float r0 = r0 * r2
            r8.setTextSize(r0)
            android.graphics.Typeface r0 = r8.getTypeface()
            r7.setTypeface(r0)
            float r0 = r8.getTextSize()
            r7.setTextSize(r0)
            float r14 = r9.A01
            float r0 = X.AnonymousClass0Y0.A00()
            float r14 = r14 * r0
            int r0 = r9.A06
            float r13 = (float) r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r13 = r13 / r0
            X.0Qx r0 = r10.A08
            if (r0 != 0) goto L_0x02d1
            X.0Qx r0 = r10.A07
            if (r0 == 0) goto L_0x02d6
        L_0x02d1:
            float r0 = X.C04850Qx.A02(r0)
            float r13 = r13 + r0
        L_0x02d6:
            float r0 = X.AnonymousClass0Y0.A00()
            float r13 = r13 * r0
            float r13 = r13 * r2
            r0 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 / r0
            java.lang.String r0 = "\r\n"
            java.lang.String r2 = "\r"
            java.lang.String r1 = r1.replaceAll(r0, r2)
            java.lang.String r0 = "\n"
            java.lang.String r0 = r1.replaceAll(r0, r2)
            java.lang.String[] r0 = r0.split(r2)
            java.util.List r18 = java.util.Arrays.asList(r0)
            int r17 = r18.size()
            r12 = 0
        L_0x02fa:
            r0 = r17
            if (r12 >= r0) goto L_0x0290
            r0 = r18
            java.lang.String r6 = X.AnonymousClass001.A0n(r0, r12)
            float r3 = r7.measureText(r6)
            int r0 = r6.length()
            int r0 = r0 + -1
            float r0 = (float) r0
            float r0 = r0 * r13
            float r3 = r3 + r0
            r11.save()
            X.0FL r0 = r9.A07
            int r1 = r0.ordinal()
            r0 = 1
            r2 = 0
            if (r1 == r0) goto L_0x03d9
            r0 = 2
            if (r1 != r0) goto L_0x0328
            float r1 = -r3
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
        L_0x0325:
            r11.translate(r1, r2)
        L_0x0328:
            int r0 = r17 + -1
            float r1 = (float) r0
            float r1 = r1 * r14
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r0 = (float) r12
            float r0 = r0 * r14
            float r0 = r0 - r1
            r11.translate(r2, r0)
            r5 = 0
        L_0x0336:
            int r3 = r6.length()
            if (r5 >= r3) goto L_0x03d2
            r16 = r5
            int r0 = r6.codePointAt(r5)
            int r4 = java.lang.Character.charCount(r0)
            int r4 = r4 + r5
        L_0x0347:
            if (r4 >= r3) goto L_0x037d
            int r15 = r6.codePointAt(r4)
            int r2 = java.lang.Character.getType(r15)
            r1 = 16
            if (r2 == r1) goto L_0x0374
            int r2 = java.lang.Character.getType(r15)
            r1 = 27
            if (r2 == r1) goto L_0x0374
            int r2 = java.lang.Character.getType(r15)
            r1 = 6
            if (r2 == r1) goto L_0x0374
            int r2 = java.lang.Character.getType(r15)
            r1 = 28
            if (r2 == r1) goto L_0x0374
            int r2 = java.lang.Character.getType(r15)
            r1 = 19
            if (r2 != r1) goto L_0x037d
        L_0x0374:
            int r1 = java.lang.Character.charCount(r15)
            int r4 = r4 + r1
            int r0 = r0 * 31
            int r0 = r0 + r15
            goto L_0x0347
        L_0x037d:
            X.0i7 r3 = r10.A0D
            long r0 = (long) r0
            boolean r2 = r3.A0B(r0)
            if (r2 == 0) goto L_0x03ab
            java.lang.Object r2 = X.C10550i7.A00(r3, r0)
            java.lang.String r2 = (java.lang.String) r2
        L_0x038c:
            int r0 = r2.length()
            int r5 = r5 + r0
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x03a6
            A01(r11, r8, r2)
            r0 = r7
        L_0x0399:
            A01(r11, r0, r2)
            float r1 = r8.measureText(r2)
            float r1 = r1 + r13
            r0 = 0
            r11.translate(r1, r0)
            goto L_0x0336
        L_0x03a6:
            A01(r11, r7, r2)
            r0 = r8
            goto L_0x0399
        L_0x03ab:
            java.lang.StringBuilder r2 = r10.A0H
            r19 = r2
            r2 = 0
            r15 = r2
            r2 = r19
            r2.setLength(r15)
        L_0x03b6:
            r2 = r16
            if (r2 >= r4) goto L_0x03ca
            int r15 = r6.codePointAt(r2)
            r2 = r19
            r2.appendCodePoint(r15)
            int r2 = java.lang.Character.charCount(r15)
            int r16 = r16 + r2
            goto L_0x03b6
        L_0x03ca:
            java.lang.String r2 = r19.toString()
            r3.A0A(r0, r2)
            goto L_0x038c
        L_0x03d2:
            r11.restore()
            int r12 = r12 + 1
            goto L_0x02fa
        L_0x03d9:
            float r1 = -r3
            goto L_0x0325
        L_0x03dc:
            float r2 = r9.A02
            goto L_0x02a6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01690Bv.A07(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public C01690Bv(AnonymousClass01G r4, C04510Oo r5) {
        super(r4, r5);
        this.A0F = r4;
        this.A0E = r5.A09;
        C01480Ba r0 = new C01480Ba(r5.A0B.A00);
        this.A0G = r0;
        C04850Qx.A06(r0, this);
        A08(r0);
        AnonymousClass0MC r2 = r5.A0C;
        if (r2 != null) {
            C01560Bi r02 = r2.A00;
            if (r02 != null) {
                C01520Be r03 = new C01520Be(r02.A00);
                this.A00 = r03;
                C04850Qx.A06(r03, this);
                A08(this.A00);
            }
            C01560Bi r04 = r2.A01;
            if (r04 != null) {
                C01520Be r05 = new C01520Be(r04.A00);
                this.A02 = r05;
                C04850Qx.A06(r05, this);
                A08(this.A02);
            }
            C01610Bn r06 = r2.A02;
            if (r06 != null) {
                C01540Bg A002 = AnonymousClass0BW.A00(r06);
                this.A04 = A002;
                C04850Qx.A06(A002, this);
                A08(this.A04);
            }
            C01610Bn r07 = r2.A03;
            if (r07 != null) {
                C01540Bg A003 = AnonymousClass0BW.A00(r07);
                this.A07 = A003;
                C04850Qx.A06(A003, this);
                A08(this.A07);
            }
        }
    }

    public static final void A00(Canvas canvas, Paint paint, Path path) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
            canvas.drawPath(path, paint);
        }
    }

    public static final void A01(Canvas canvas, Paint paint, String str) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
            canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
        }
    }

    public void Aws(C05560Tz r4, Object obj) {
        C04850Qx r0;
        super.Aws(r4, obj);
        if (obj == C17150ue.A0R) {
            C04850Qx r1 = this.A01;
            if (r1 != null) {
                this.A0O.remove(r1);
            }
            if (r4 == null) {
                this.A01 = null;
                return;
            }
            AnonymousClass0BZ r02 = new AnonymousClass0BZ(r4, (Object) null);
            this.A01 = r02;
            C04850Qx.A06(r02, this);
            r0 = this.A01;
        } else if (obj == C17150ue.A0T) {
            C04850Qx r12 = this.A03;
            if (r12 != null) {
                this.A0O.remove(r12);
            }
            if (r4 == null) {
                this.A03 = null;
                return;
            }
            AnonymousClass0BZ r03 = new AnonymousClass0BZ(r4, (Object) null);
            this.A03 = r03;
            C04850Qx.A06(r03, this);
            r0 = this.A03;
        } else if (obj == C17150ue.A0G) {
            C04850Qx r13 = this.A05;
            if (r13 != null) {
                this.A0O.remove(r13);
            }
            if (r4 == null) {
                this.A05 = null;
                return;
            }
            AnonymousClass0BZ r04 = new AnonymousClass0BZ(r4, (Object) null);
            this.A05 = r04;
            C04850Qx.A06(r04, this);
            r0 = this.A05;
        } else if (obj == C17150ue.A0I) {
            C04850Qx r14 = this.A08;
            if (r14 != null) {
                this.A0O.remove(r14);
            }
            if (r4 == null) {
                this.A08 = null;
                return;
            }
            AnonymousClass0BZ r05 = new AnonymousClass0BZ(r4, (Object) null);
            this.A08 = r05;
            C04850Qx.A06(r05, this);
            r0 = this.A08;
        } else if (obj == C17150ue.A0H) {
            C04850Qx r15 = this.A06;
            if (r15 != null) {
                this.A0O.remove(r15);
            }
            if (r4 == null) {
                this.A06 = null;
                return;
            }
            AnonymousClass0BZ r06 = new AnonymousClass0BZ(r4, (Object) null);
            this.A06 = r06;
            C04850Qx.A06(r06, this);
            r0 = this.A06;
        } else {
            return;
        }
        A08(r0);
    }

    public void B4p(Matrix matrix, RectF rectF, boolean z) {
        super.B4p(matrix, rectF, z);
        AnonymousClass0QL r1 = this.A0E;
        rectF.set(0.0f, 0.0f, (float) r1.A04.width(), (float) r1.A04.height());
    }
}
