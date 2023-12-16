package X;

import android.graphics.Path;
import java.util.List;

/* renamed from: X.0fu  reason: invalid class name and case insensitive filesystem */
public class C09260fu implements C17340vN, C16230sg, C17360vP {
    public AnonymousClass0N4 A00 = new AnonymousClass0N4();
    public boolean A01;
    public final Path A02 = AnonymousClass002.A06();
    public final AnonymousClass01G A03;
    public final C04850Qx A04;
    public final C04850Qx A05;
    public final C04850Qx A06;
    public final C04850Qx A07;
    public final C04850Qx A08;
    public final C04850Qx A09;
    public final C04850Qx A0A;
    public final AnonymousClass0G9 A0B;
    public final String A0C;
    public final boolean A0D;

    public static double A00(float f, float f2) {
        return (double) ((float) (Math.atan2((double) f, (double) f2) - 1.5707963267948966d));
    }

    public void BfC() {
        this.A01 = false;
        this.A03.invalidateSelf();
    }

    public void Bm3(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            C16780tx r2 = (C16780tx) list.get(i);
            if (r2 instanceof C09200fo) {
                C09200fo r22 = (C09200fo) r2;
                if (r22.A03 == AnonymousClass0FR.SIMULTANEOUSLY) {
                    this.A00.A00.add(r22);
                    r22.A05.add(this);
                }
            }
        }
    }

    public void Aws(C05560Tz r2, Object obj) {
        C04850Qx r0;
        if (obj == C17150ue.A0C) {
            r0 = this.A08;
        } else if (obj == C17150ue.A0D) {
            r0 = this.A0A;
        } else if (obj == C17150ue.A02) {
            r0 = this.A09;
        } else if (obj != C17150ue.A08 || (r0 = this.A04) == null) {
            if (obj == C17150ue.A0A) {
                r0 = this.A06;
            } else if (obj != C17150ue.A09 || (r0 = this.A05) == null) {
                if (obj == C17150ue.A0B) {
                    r0 = this.A07;
                } else {
                    return;
                }
            }
        }
        r0.A0F(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0178, code lost:
        if (r4 != (r23 - 1.0d)) goto L_0x017a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Path BAd() {
        /*
            r36 = this;
            r7 = r36
            boolean r1 = r7.A01
            android.graphics.Path r0 = r7.A02
            r34 = r0
            if (r1 != 0) goto L_0x0252
            r34.reset()
            boolean r0 = r7.A0D
            r2 = 0
            if (r0 != 0) goto L_0x024f
            X.0G9 r0 = r7.A0B
            int r1 = r0.ordinal()
            if (r1 == r2) goto L_0x00d0
            r0 = 1
            if (r1 != r0) goto L_0x0245
            X.0Qx r0 = r7.A08
            float r0 = X.C04850Qx.A02(r0)
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            int r4 = (int) r0
            X.0Qx r0 = r7.A0A
            if (r0 != 0) goto L_0x00c9
            r2 = 0
        L_0x002f:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            double r2 = r2 - r0
            double r21 = java.lang.Math.toRadians(r2)
            double r0 = (double) r4
            r2 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r2 = r2 / r0
            float r9 = (float) r2
            X.0Qx r2 = r7.A07
            float r20 = X.C04850Qx.A02(r2)
            r2 = 1120403456(0x42c80000, float:100.0)
            float r20 = r20 / r2
            X.0Qx r2 = r7.A06
            float r19 = X.C04850Qx.A02(r2)
            r2 = r19
            double r4 = (double) r2
            double r2 = java.lang.Math.cos(r21)
            double r2 = r2 * r4
            float r8 = (float) r2
            double r2 = java.lang.Math.sin(r21)
            double r2 = r2 * r4
            float r6 = (float) r2
            r2 = r34
            r2.moveTo(r8, r6)
            double r2 = (double) r9
            double r21 = r21 + r2
            double r17 = java.lang.Math.ceil(r0)
            r14 = 0
        L_0x006d:
            double r0 = (double) r14
            int r9 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r9 >= 0) goto L_0x0233
            double r0 = java.lang.Math.cos(r21)
            double r0 = r0 * r4
            float r12 = (float) r0
            double r9 = java.lang.Math.sin(r21)
            double r0 = r4 * r9
            float r10 = (float) r0
            r0 = 0
            int r0 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00c3
            double r15 = A00(r6, r8)
            double r0 = java.lang.Math.cos(r15)
            float r9 = (float) r0
            double r0 = java.lang.Math.sin(r15)
            float r11 = (float) r0
            double r15 = A00(r10, r12)
            double r0 = java.lang.Math.cos(r15)
            float r13 = (float) r0
            double r0 = java.lang.Math.sin(r15)
            float r15 = (float) r0
            float r1 = r19 * r20
            r0 = 1048576000(0x3e800000, float:0.25)
            float r1 = r1 * r0
            float r9 = r9 * r1
            float r11 = r11 * r1
            float r13 = r13 * r1
            float r1 = r1 * r15
            float r8 = r8 - r9
            float r6 = r6 - r11
            float r26 = r12 + r13
            float r27 = r10 + r1
            r23 = r34
            r24 = r8
            r25 = r6
            r28 = r12
            r29 = r10
            r23.cubicTo(r24, r25, r26, r27, r28, r29)
        L_0x00bc:
            double r21 = r21 + r2
            int r14 = r14 + 1
            r6 = r10
            r8 = r12
            goto L_0x006d
        L_0x00c3:
            r0 = r34
            r0.lineTo(r12, r10)
            goto L_0x00bc
        L_0x00c9:
            float r0 = X.C04850Qx.A02(r0)
            double r2 = (double) r0
            goto L_0x002f
        L_0x00d0:
            X.0Qx r0 = r7.A08
            float r9 = X.C04850Qx.A02(r0)
            X.0Qx r0 = r7.A0A
            if (r0 != 0) goto L_0x022c
            r2 = 0
        L_0x00dc:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            double r2 = r2 - r0
            double r32 = java.lang.Math.toRadians(r2)
            double r2 = (double) r9
            r4 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r4 = r4 / r2
            float r0 = (float) r4
            r31 = r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r30 = r31 / r0
            int r0 = (int) r9
            float r0 = (float) r0
            float r9 = r9 - r0
            r0 = 0
            int r29 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r29 == 0) goto L_0x0104
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r9
            float r0 = r0 * r30
            double r0 = (double) r0
            double r32 = r32 + r0
        L_0x0104:
            X.0Qx r0 = r7.A06
            float r28 = X.C04850Qx.A02(r0)
            X.0Qx r0 = r7.A04
            float r27 = X.C04850Qx.A02(r0)
            X.0Qx r0 = r7.A05
            r1 = 1120403456(0x42c80000, float:100.0)
            if (r0 == 0) goto L_0x0228
            float r26 = X.C04850Qx.A02(r0)
            float r26 = r26 / r1
        L_0x011c:
            X.0Qx r0 = r7.A07
            if (r0 == 0) goto L_0x0224
            float r25 = X.C04850Qx.A02(r0)
            float r25 = r25 / r1
        L_0x0126:
            if (r29 == 0) goto L_0x0206
            float r11 = r28 - r27
            float r11 = r11 * r9
            float r11 = r11 + r27
            double r0 = (double) r11
            double r12 = java.lang.Math.cos(r32)
            double r4 = r0 * r12
            float r8 = (float) r4
            double r4 = java.lang.Math.sin(r32)
            double r0 = r0 * r4
            float r6 = (float) r0
            r0 = r34
            r0.moveTo(r8, r6)
            float r1 = r31 * r9
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            double r0 = (double) r1
            double r32 = r32 + r0
        L_0x0148:
            double r23 = java.lang.Math.ceil(r2)
            r21 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r23 = r23 * r21
            r10 = 0
            r20 = 0
        L_0x0153:
            double r4 = (double) r10
            int r0 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            if (r0 >= 0) goto L_0x0233
            r12 = r27
            if (r20 == 0) goto L_0x015e
            r12 = r28
        L_0x015e:
            r14 = 0
            int r3 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x0202
            double r1 = r23 - r21
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0202
            float r13 = r31 * r9
            r0 = 1073741824(0x40000000, float:2.0)
            float r13 = r13 / r0
        L_0x016e:
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r3 == 0) goto L_0x017a
            double r1 = r23 - r18
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r35 = r11
            if (r0 == 0) goto L_0x017d
        L_0x017a:
            r35 = r11
            r11 = r12
        L_0x017d:
            double r2 = (double) r11
            double r11 = java.lang.Math.cos(r32)
            double r0 = r2 * r11
            float r12 = (float) r0
            double r0 = java.lang.Math.sin(r32)
            double r2 = r2 * r0
            float r11 = (float) r2
            int r0 = (r26 > r14 ? 1 : (r26 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x01a4
            int r0 = (r25 > r14 ? 1 : (r25 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x01a4
            r0 = r34
            r0.lineTo(r12, r11)
        L_0x0198:
            double r0 = (double) r13
            double r32 = r32 + r0
            r20 = r20 ^ 1
            int r10 = r10 + 1
            r8 = r12
            r6 = r11
            r11 = r35
            goto L_0x0153
        L_0x01a4:
            double r14 = A00(r6, r8)
            double r0 = java.lang.Math.cos(r14)
            float r2 = (float) r0
            double r0 = java.lang.Math.sin(r14)
            float r14 = (float) r0
            double r15 = A00(r11, r12)
            double r0 = java.lang.Math.cos(r15)
            float r3 = (float) r0
            double r0 = java.lang.Math.sin(r15)
            float r15 = (float) r0
            r0 = r25
            r17 = r26
            r16 = r28
            r1 = r27
            if (r20 == 0) goto L_0x01d2
            r0 = r26
            r17 = r25
            r16 = r1
            r1 = r28
        L_0x01d2:
            float r16 = r16 * r0
            r0 = 1056236141(0x3ef4e26d, float:0.47829)
            float r16 = r16 * r0
            float r2 = r2 * r16
            float r16 = r16 * r14
            float r1 = r1 * r17
            float r1 = r1 * r0
            float r3 = r3 * r1
            float r1 = r1 * r15
            if (r29 == 0) goto L_0x01e9
            if (r10 != 0) goto L_0x01f9
            float r2 = r2 * r9
            float r16 = r16 * r9
        L_0x01e9:
            float r8 = r8 - r2
            float r6 = r6 - r16
            float r3 = r3 + r12
            float r4 = r11 + r1
            r0 = r34
            r1 = r8
            r2 = r6
            r5 = r12
            r6 = r11
            r0.cubicTo(r1, r2, r3, r4, r5, r6)
            goto L_0x0198
        L_0x01f9:
            double r14 = r23 - r18
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x01e9
            float r3 = r3 * r9
            float r1 = r1 * r9
            goto L_0x01e9
        L_0x0202:
            r13 = r30
            goto L_0x016e
        L_0x0206:
            r29 = 0
            r0 = r28
            double r0 = (double) r0
            double r4 = java.lang.Math.cos(r32)
            double r4 = r4 * r0
            float r8 = (float) r4
            double r4 = java.lang.Math.sin(r32)
            double r0 = r0 * r4
            float r6 = (float) r0
            r0 = r34
            r0.moveTo(r8, r6)
            r0 = r30
            double r0 = (double) r0
            double r32 = r32 + r0
            r11 = 0
            goto L_0x0148
        L_0x0224:
            r25 = 0
            goto L_0x0126
        L_0x0228:
            r26 = 0
            goto L_0x011c
        L_0x022c:
            float r0 = X.C04850Qx.A02(r0)
            double r2 = (double) r0
            goto L_0x00dc
        L_0x0233:
            X.0Qx r0 = r7.A09
            android.graphics.PointF r0 = X.C04850Qx.A04(r0)
            float r2 = r0.x
            float r1 = r0.y
            r0 = r34
            r0.offset(r2, r1)
            r34.close()
        L_0x0245:
            r34.close()
            X.0N4 r1 = r7.A00
            r0 = r34
            r1.A00(r0)
        L_0x024f:
            r0 = 1
            r7.A01 = r0
        L_0x0252:
            return r34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09260fu.BAd():android.graphics.Path");
    }

    public String getName() {
        return this.A0C;
    }

    public C09260fu(AnonymousClass01G r9, C09420gA r10, C09320g0 r11) {
        C01540Bg r0;
        this.A03 = r9;
        this.A0C = r10.A08;
        AnonymousClass0G9 r7 = r10.A07;
        this.A0B = r7;
        this.A0D = r10.A09;
        C01540Bg A002 = AnonymousClass0BW.A00(r10.A04);
        this.A08 = A002;
        C04850Qx B0O = r10.A06.B0O();
        this.A09 = B0O;
        C01540Bg A003 = AnonymousClass0BW.A00(r10.A05);
        this.A0A = A003;
        C01540Bg A004 = AnonymousClass0BW.A00(r10.A02);
        this.A06 = A004;
        C01540Bg A005 = AnonymousClass0BW.A00(r10.A03);
        this.A07 = A005;
        AnonymousClass0G9 r1 = AnonymousClass0G9.STAR;
        if (r7 == r1) {
            this.A04 = AnonymousClass0BW.A00(r10.A00);
            r0 = AnonymousClass0BW.A00(r10.A01);
        } else {
            r0 = null;
            this.A04 = null;
        }
        this.A05 = r0;
        r11.A08(A002);
        r11.A08(B0O);
        r11.A08(A003);
        r11.A08(A004);
        r11.A08(A005);
        if (r7 == r1) {
            r11.A08(this.A04);
            r11.A08(this.A05);
        }
        C04850Qx.A06(A002, this);
        C04850Qx.A06(B0O, this);
        C04850Qx.A06(A003, this);
        C04850Qx.A06(A004, this);
        C04850Qx.A06(A005, this);
        if (r7 == r1) {
            C04850Qx.A06(this.A04, this);
            C04850Qx.A06(this.A05, this);
        }
    }

    public void Bk4(AnonymousClass0WB r1, AnonymousClass0WB r2, List list, int i) {
        C06100Wg.A01(this, r1, r2, list, i);
    }
}
