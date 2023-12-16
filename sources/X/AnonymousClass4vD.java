package X;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import org.json.JSONObject;

/* renamed from: X.4vD  reason: invalid class name */
public class AnonymousClass4vD extends C105425Uw {
    public final Paint A00;
    public final Path A01;
    public final PointF A02;
    public final PointF A03;
    public final RectF A04;
    public final RectF A05;
    public final PointF[] A06;

    public void A0M(RectF rectF, float f, float f2, float f3, float f4) {
        float f5 = (f2 + f4) / 2.0f;
        float f6 = (((f3 - f) * 2.0f) / 3.0f) / 2.0f;
        float f7 = f5 - f6;
        float f8 = f5 + f6;
        super.A0M(rectF, f, f7, f3, f8);
    }

    public static void A00(PointF pointF, RectF rectF) {
        pointF.y = rectF.top + rectF.height();
    }

    public static void A01(PointF pointF, RectF rectF, float f) {
        pointF.y = rectF.top + ((rectF.height() * f) / 6.0f);
    }

    public static void A02(RectF rectF, PointF[] pointFArr, int i) {
        pointFArr[i].x = rectF.left + rectF.width();
    }

    public static void A03(RectF rectF, PointF[] pointFArr, int i, int i2) {
        pointFArr[i].x = rectF.left + rectF.width();
        pointFArr[i].y = rectF.top + rectF.height();
        PointF pointF = pointFArr[i2];
        pointF.x = rectF.left;
        pointF.y = rectF.top + rectF.height();
    }

    public static void A04(RectF rectF, PointF[] pointFArr, int i, int i2) {
        PointF pointF = pointFArr[i];
        float f = rectF.left;
        pointF.x = f;
        pointF.y = rectF.top;
        pointFArr[i2].x = f + rectF.width();
        pointFArr[i2].y = rectF.top;
    }

    public void A0G(float f) {
        super.A0G((f * 2.0f) / 3.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0145  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0K(android.graphics.Canvas r24) {
        /*
            r23 = this;
            r7 = r23
            android.graphics.RectF r3 = r7.A02
            r3.sort()
            android.graphics.Path r6 = r7.A01
            r6.reset()
            float r9 = r3.centerX()
            float r0 = r7.A00
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
            double r1 = java.lang.Math.cos(r0)
            float r0 = r3.width()
            double r4 = (double) r0
            double r1 = r1 * r4
            r12 = 4606281698659794944(0x3fecccccc0000000, double:0.8999999761581421)
            double r1 = r1 * r12
            float r0 = (float) r1
            float r9 = r9 + r0
            float r4 = r3.centerY()
            float r0 = r7.A00
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
            double r1 = java.lang.Math.sin(r0)
            float r0 = r3.height()
            double r10 = (double) r0
            double r1 = r1 * r10
            double r1 = r1 * r12
            float r0 = (float) r1
            float r4 = r4 + r0
            android.graphics.RectF r8 = r7.A04
            r8.set(r3)
            float r0 = r8.left
            float r0 = r9 - r0
            float r2 = r8.width()
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r1
            float r0 = r0 - r2
            float r2 = r8.top
            float r22 = r4 - r2
            float r2 = r8.height()
            float r2 = r2 / r1
            float r22 = r22 - r2
            float r21 = r8.height()
            float r2 = r8.width()
            float r21 = r21 / r2
            float r3 = r8.width()
            r12 = 1086324736(0x40c00000, float:6.0)
            float r3 = r3 / r12
            float r2 = r8.height()
            float r20 = X.C86664Kz.A00(r2, r12, r3)
            float r19 = r20 * r1
            android.graphics.PointF[] r5 = r7.A06
            r2 = 0
            r2 = r5[r2]
            r2.x = r9
            r2.y = r4
            r13 = 1082130432(0x40800000, float:4.0)
            r11 = 1077936128(0x40400000, float:3.0)
            r14 = 5
            r10 = 4
            r9 = 3
            r2 = 2
            r4 = 6
            r15 = 1
            r3 = 0
            int r18 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r18 >= 0) goto L_0x024c
            int r16 = (r22 > r3 ? 1 : (r22 == r3 ? 0 : -1))
            if (r16 < 0) goto L_0x024c
            float r0 = -r0
            float r0 = r0 * r21
            int r0 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r0 >= 0) goto L_0x022e
            r13 = r5[r15]
            float r0 = r8.left
            float r16 = r8.width()
            float r16 = r16 * r1
            float r16 = r16 / r12
            float r0 = r0 + r16
            r13.x = r0
            r0 = r5[r15]
            A00(r0, r8)
            r1 = r5[r2]
            float r0 = r8.left
            r1.x = r0
            A00(r1, r8)
            A04(r8, r5, r9, r10)
            A02(r8, r5, r14)
            r0 = r5[r14]
            A00(r0, r8)
            r2 = r5[r4]
            float r1 = r8.left
            float r0 = r8.width()
            float r0 = r0 * r11
        L_0x00cd:
            float r0 = r0 / r12
            float r1 = r1 + r0
            r2.x = r1
            r4 = r5[r4]
            float r2 = r8.top
            float r0 = r8.height()
        L_0x00d9:
            float r2 = r2 + r0
        L_0x00da:
            r4.y = r2
        L_0x00dc:
            r0 = 0
            r0 = r5[r0]
            float r1 = r0.x
            float r0 = r0.y
            r6.moveTo(r1, r0)
            r4 = 0
        L_0x00e7:
            android.graphics.PointF r12 = r7.A02
            r0 = r5[r4]
            float r1 = r0.x
            float r0 = r0.y
            r12.set(r1, r0)
            android.graphics.PointF r9 = r7.A03
            int r4 = r4 + 1
            int r0 = r4 % 7
            r0 = r5[r0]
            float r1 = r0.x
            float r0 = r0.y
            r9.set(r1, r0)
            float r10 = r12.x
            float r0 = r8.left
            r13 = 1119092736(0x42b40000, float:90.0)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0128
            float r11 = r12.y
            float r0 = r8.top
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0128
            float r1 = r10 + r19
            float r0 = r11 + r19
            android.graphics.RectF r2 = r7.A05
            r2.set(r10, r11, r1, r0)
            r1 = 1127481344(0x43340000, float:180.0)
            r0 = 0
            r6.arcTo(r2, r1, r13, r0)
            float r10 = r12.x
            float r10 = r10 + r20
            r12.x = r10
        L_0x0128:
            float r0 = r9.x
            float r2 = r8.left
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x013c
            float r1 = r9.y
            float r0 = r8.top
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x013c
            float r1 = r1 + r20
            r9.y = r1
        L_0x013c:
            float r0 = r8.width()
            float r2 = r2 + r0
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0164
            float r11 = r12.y
            float r0 = r8.top
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0164
            float r10 = r12.x
            float r1 = r10 - r19
            float r0 = r11 + r19
            android.graphics.RectF r2 = r7.A05
            r2.set(r1, r11, r10, r0)
            r1 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r0 = 0
            r6.arcTo(r2, r1, r13, r0)
            float r0 = r12.y
            float r0 = r0 + r20
            r12.y = r0
        L_0x0164:
            float r2 = r9.x
            float r1 = r8.left
            float r0 = r8.width()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x017f
            float r1 = r9.y
            float r0 = r8.top
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x017f
            float r0 = r9.x
            float r0 = r0 - r20
            r9.x = r0
        L_0x017f:
            float r2 = r12.x
            float r1 = r8.left
            float r0 = r8.width()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01b0
            float r2 = r12.y
            float r1 = r8.top
            float r0 = r8.height()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01b0
            float r11 = r12.x
            float r10 = r11 - r19
            float r2 = r12.y
            float r0 = r2 - r19
            android.graphics.RectF r1 = r7.A05
            r1.set(r10, r0, r11, r2)
            r0 = 0
            r6.arcTo(r1, r3, r13, r0)
            float r0 = r12.x
            float r0 = r0 - r20
            r12.x = r0
        L_0x01b0:
            float r2 = r9.x
            float r1 = r8.left
            float r0 = r8.width()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01d0
            float r2 = r9.y
            float r1 = r8.top
            float r0 = r8.height()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01d0
            float r0 = r9.y
            float r0 = r0 - r20
            r9.y = r0
        L_0x01d0:
            float r1 = r12.x
            float r0 = r8.left
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01fc
            float r2 = r12.y
            float r1 = r8.top
            float r0 = r8.height()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01fc
            float r11 = r12.x
            float r10 = r12.y
            float r2 = r10 - r19
            float r0 = r11 + r19
            android.graphics.RectF r1 = r7.A05
            r1.set(r11, r2, r0, r10)
            r0 = 0
            r6.arcTo(r1, r13, r13, r0)
            float r0 = r12.y
            float r0 = r0 - r20
            r12.y = r0
        L_0x01fc:
            float r1 = r9.x
            float r0 = r8.left
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0217
            float r2 = r9.y
            float r1 = r8.top
            float r0 = r8.height()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0217
            float r0 = r9.x
            float r0 = r0 + r20
            r9.x = r0
        L_0x0217:
            float r1 = r9.x
            float r0 = r9.y
            r6.lineTo(r1, r0)
            r0 = 7
            if (r4 < r0) goto L_0x00e7
            android.graphics.Paint r0 = r7.A00
            r1 = r24
            r1.drawPath(r6, r0)
            android.graphics.Paint r0 = r7.A01
            r1.drawPath(r6, r0)
            return
        L_0x022e:
            r1 = r5[r15]
            float r0 = r8.left
            r1.x = r0
            A01(r1, r8, r11)
            A04(r8, r5, r2, r9)
            A03(r8, r5, r10, r14)
            r4 = r5[r4]
            float r0 = r8.left
            r4.x = r0
            float r2 = r8.top
            float r0 = r8.height()
            float r0 = r0 * r13
            goto L_0x0361
        L_0x024c:
            int r17 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r17 < 0) goto L_0x02a4
            int r16 = (r22 > r3 ? 1 : (r22 == r3 ? 0 : -1))
            if (r16 < 0) goto L_0x02a4
            float r0 = r0 * r21
            int r17 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            r1 = r5[r15]
            float r0 = r8.left
            float r16 = r8.width()
            if (r17 >= 0) goto L_0x028e
            float r16 = r16 * r11
            float r16 = r16 / r12
            float r0 = r0 + r16
            r1.x = r0
            r0 = r5[r15]
            A00(r0, r8)
            r1 = r5[r2]
            float r0 = r8.left
            r1.x = r0
            A00(r1, r8)
            A04(r8, r5, r9, r10)
            A02(r8, r5, r14)
            r0 = r5[r14]
            A00(r0, r8)
            r2 = r5[r4]
            float r1 = r8.left
            float r0 = r8.width()
            float r0 = r0 * r13
            goto L_0x00cd
        L_0x028e:
            float r0 = r0 + r16
            r1.x = r0
            r0 = r5[r15]
            A01(r0, r8, r13)
            A03(r8, r5, r2, r9)
            A04(r8, r5, r10, r14)
            A02(r8, r5, r4)
            r4 = r5[r4]
            goto L_0x035a
        L_0x02a4:
            if (r18 >= 0) goto L_0x02ed
            int r16 = (r22 > r3 ? 1 : (r22 == r3 ? 0 : -1))
            if (r16 >= 0) goto L_0x02ed
            float r0 = r0 * r21
            int r16 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            r13 = r5[r15]
            float r0 = r8.left
            if (r16 < 0) goto L_0x0349
            float r16 = r8.width()
            float r16 = r16 * r11
            float r16 = r16 / r12
            float r0 = r0 + r16
            r13.x = r0
            r11 = r5[r15]
            float r0 = r8.top
            r11.y = r0
            A02(r8, r5, r2)
            r2 = r5[r2]
            float r0 = r8.top
            r2.y = r0
            A03(r8, r5, r9, r10)
            r2 = r5[r14]
            float r9 = r8.left
            r2.x = r9
            float r0 = r8.top
            r2.y = r0
            r2 = r5[r4]
            float r0 = r8.width()
            float r0 = r0 * r1
        L_0x02e3:
            float r0 = r0 / r12
            float r9 = r9 + r0
            r2.x = r9
            r4 = r5[r4]
            float r2 = r8.top
            goto L_0x00da
        L_0x02ed:
            if (r17 < 0) goto L_0x0364
            int r16 = (r22 > r3 ? 1 : (r22 == r3 ? 0 : -1))
            if (r16 >= 0) goto L_0x0364
            float r0 = -r0
            float r0 = r0 * r21
            int r0 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r0 < 0) goto L_0x032e
            r1 = r5[r15]
            float r0 = r8.left
            float r16 = r8.width()
            float r16 = r16 * r13
            float r16 = r16 / r12
            float r0 = r0 + r16
            r1.x = r0
            r1 = r5[r15]
            float r0 = r8.top
            r1.y = r0
            A02(r8, r5, r2)
            r1 = r5[r2]
            float r0 = r8.top
            r1.y = r0
            A03(r8, r5, r9, r10)
            r1 = r5[r14]
            float r9 = r8.left
            r1.x = r9
            float r0 = r8.top
            r1.y = r0
            r2 = r5[r4]
            float r0 = r8.width()
            float r0 = r0 * r11
            goto L_0x02e3
        L_0x032e:
            A02(r8, r5, r15)
            r0 = r5[r15]
            A01(r0, r8, r11)
            A03(r8, r5, r2, r9)
            A04(r8, r5, r10, r14)
            A02(r8, r5, r4)
            r4 = r5[r4]
            float r2 = r8.top
            float r0 = r8.height()
            float r0 = r0 * r1
            goto L_0x0361
        L_0x0349:
            r13.x = r0
            A01(r13, r8, r1)
            A04(r8, r5, r2, r9)
            A03(r8, r5, r10, r14)
            r4 = r5[r4]
            float r0 = r8.left
            r4.x = r0
        L_0x035a:
            float r2 = r8.top
            float r0 = r8.height()
            float r0 = r0 * r11
        L_0x0361:
            float r0 = r0 / r12
            goto L_0x00d9
        L_0x0364:
            A04(r8, r5, r15, r2)
            A03(r8, r5, r9, r10)
            r0 = r5[r14]
            float r2 = r8.left
            r0.x = r2
            float r1 = r8.top
            r0.y = r1
            r0 = r5[r4]
            r0.x = r2
            r0.y = r1
            goto L_0x00dc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4vD.A0K(android.graphics.Canvas):void");
    }

    public AnonymousClass4vD(JSONObject jSONObject) {
        this();
        super.A0O(jSONObject);
    }

    public AnonymousClass4vD() {
        this.A01 = AnonymousClass002.A06();
        Paint A0a = C86664Kz.A0a(1);
        this.A00 = A0a;
        this.A04 = AnonymousClass002.A07();
        this.A06 = new PointF[]{new PointF(), new PointF(), new PointF(), new PointF(), new PointF(), new PointF(), new PointF()};
        this.A05 = AnonymousClass002.A07();
        this.A02 = new PointF();
        this.A03 = new PointF();
        this.A00 = 110.0f;
        AnonymousClass001.A10(A0a);
        A0a.setColor(-31);
        C86634Kw.A17(this.A01);
    }
}
