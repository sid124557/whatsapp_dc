package X;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import java.util.ArrayList;

/* renamed from: X.6KV  reason: invalid class name */
public abstract class AnonymousClass6KV extends C110815h5 {
    public static final ArrayList A0C = AnonymousClass002.A0I(5);
    public static final String[] A0D;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public AnonymousClass7XB A08 = new AnonymousClass7XB();
    public final C157467iL A09 = new C157467iL();
    public final C153297b0 A0A;
    public final int[] A0B = C86664Kz.A1Z();

    public abstract C160697o9 A0C(int i, int i2, int i3);

    public void A0E(int i, int i2, int i3, int i4) {
        String str;
        int i5 = this.A07;
        C160697o9 r4 = new C160697o9(i5, i5);
        r4.A02 = i;
        r4.A03 = i2;
        r4.A04 = i3;
        r4.A0B = 1;
        this.A0A.A02(r4);
        C125976Kf r2 = new C125976Kf(this, r4, i, i2, i3, i4);
        if (i3 >= 0) {
            String[] strArr = A0D;
            if (i3 < strArr.length) {
                str = strArr[i3];
                C161847qe.A01(r2);
                AnonymousClass7FF.A00(r2, str);
            }
        }
        str = "INVALID_ZOOM_LEVEL";
        C161847qe.A01(r2);
        AnonymousClass7FF.A00(r2, str);
    }

    static {
        String[] strArr = new String[22];
        A0D = strArr;
        int i = 0;
        do {
            strArr[i] = String.valueOf(i);
            i++;
        } while (i <= 21);
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(android.graphics.Canvas r36) {
        /*
            r35 = this;
            r9 = r35
            X.5hC r0 = r9.A09
            X.4PH r8 = r0.A0R
            r0 = 0
            r9.A07 = r0
            r9.A06 = r0
            int r0 = r8.A0G
            int r2 = r9.A05
            if (r0 == r2) goto L_0x001d
            if (r2 < 0) goto L_0x0224
            java.lang.String[] r1 = A0D
            int r0 = r1.length
            if (r2 >= r0) goto L_0x0224
            r0 = r1[r2]
        L_0x001a:
            X.C161847qe.A03(r0)
        L_0x001d:
            int r0 = r8.A0G
            r9.A05 = r0
            X.5a3 r0 = r9.A0A
            X.7iL r6 = r9.A09
            r0.A07(r6)
            double r12 = r8.A02
            double r1 = r6.A01
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0037
            double r0 = r8.A00
            double r0 = java.lang.Math.ceil(r0)
            double r12 = r12 + r0
        L_0x0037:
            double r14 = r8.A03
            r29 = r36
            r29.save()
            float r3 = r8.A0A
            float r2 = r8.A04
            float r1 = r8.A05
            r0 = r29
            r0.rotate(r3, r2, r1)
            float r3 = r8.A0B
            float r2 = r8.A04
            float r1 = r8.A05
            r0.scale(r3, r3, r2, r1)
            int r0 = r8.A0E
            double r4 = (double) r0
            double r2 = r6.A01
            double r0 = r4 * r2
            int r2 = (int) r0
            r28 = r2
            double r2 = r6.A03
            double r0 = r4 * r2
            int r2 = (int) r0
            r27 = r2
            double r2 = r6.A02
            double r0 = r4 * r2
            int r2 = (int) r0
            r26 = r2
            double r0 = r6.A00
            double r4 = r4 * r0
            int r0 = (int) r4
            r25 = r0
            int r1 = r9.A03
            r0 = r28
            if (r1 != r0) goto L_0x0086
            int r1 = r9.A04
            r0 = r27
            if (r1 != r0) goto L_0x0086
            int r1 = r9.A01
            if (r1 != r2) goto L_0x0086
            int r1 = r9.A02
            r0 = r25
            if (r1 == r0) goto L_0x0094
        L_0x0086:
            int r2 = r8.A0G
            if (r2 < 0) goto L_0x0220
            java.lang.String[] r1 = A0D
            int r0 = r1.length
            if (r2 >= r0) goto L_0x0220
            r0 = r1[r2]
        L_0x0091:
            X.C161847qe.A03(r0)
        L_0x0094:
            r0 = r28
            r9.A03 = r0
            r0 = r27
            r9.A04 = r0
            r0 = r26
            r9.A01 = r0
            r0 = r25
            r9.A02 = r0
            int r10 = r8.A0E
            int r24 = r10 + -1
            int r0 = r26 - r28
            r1 = 1
            int r7 = r0 + 1
            int r0 = r25 - r27
            int r6 = r0 + 1
            r23 = r6
            if (r7 <= r6) goto L_0x00b7
            r23 = r7
        L_0x00b7:
            int r23 = r23 * r23
            int r7 = r7 - r1
            int r7 = r7 >> r1
            int r7 = r7 + r28
            int r6 = r6 - r1
            int r6 = r6 >> r1
            int r6 = r6 + r27
            long r0 = r8.A0J
            double r4 = (double) r0
            double r2 = (double) r7
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 * r16
            double r10 = (double) r10
            double r2 = r2 / r10
            double r2 = r2 - r12
            double r0 = r4 * r2
            float r2 = r8.A04
            double r2 = (double) r2
            double r0 = r0 + r2
            float r2 = (float) r0
            r22 = r2
            double r0 = (double) r6
            double r0 = r0 * r16
            double r0 = r0 / r10
            double r0 = r0 - r14
            double r4 = r4 * r0
            float r0 = r8.A05
            double r0 = (double) r0
            double r4 = r4 + r0
            float r0 = (float) r4
            r21 = r0
            r11 = -1
            r20 = 0
            r10 = 0
            r5 = 0
            r17 = 0
        L_0x00e9:
            r1 = r20
            r0 = r23
            if (r1 >= r0) goto L_0x0228
            int r4 = r10 + r7
            int r3 = r5 + r6
            int r1 = r9.A07
            int r0 = r10 * r1
            float r0 = (float) r0
            float r19 = r22 + r0
            int r0 = r5 * r1
            float r0 = (float) r0
            float r18 = r21 + r0
            r0 = r27
            if (r3 < r0) goto L_0x01a7
            r0 = r25
            if (r3 > r0) goto L_0x01a7
            float r0 = (float) r1
            float r32 = r19 + r0
            float r33 = r18 + r0
            android.graphics.Canvas$EdgeType r34 = android.graphics.Canvas.EdgeType.BW
            r30 = r19
            r31 = r18
            boolean r0 = r29.quickReject(r30, r31, r32, r33, r34)
            if (r0 != 0) goto L_0x01a7
            r13 = r4 & r24
            X.7b0 r12 = r9.A0A
            int r14 = r8.A0G
            X.7XB r2 = r9.A08
            r15 = 0
            r2.A03 = r15
            r1 = 0
            r2.A06 = r1
            r2.A05 = r1
        L_0x0128:
            X.7o9[] r0 = r2.A07
            r0[r15] = r1
            int r15 = r15 + 1
            r16 = 4
            r0 = r16
            if (r15 < r0) goto L_0x0128
            r2.A00 = r13
            r2.A01 = r3
            r2.A02 = r14
            X.7o9 r1 = r12.A06
        L_0x013c:
            int r0 = r1.A04
            if (r0 >= r14) goto L_0x0156
            android.graphics.Bitmap r0 = r1.A01()
            if (r0 == 0) goto L_0x0148
            r2.A05 = r1
        L_0x0148:
            int r0 = r1.A04
            int r15 = X.AnonymousClass6C8.A0A(r14, r0, r13, r3)
            X.7o9[] r0 = r1.A0A
            r0 = r0[r15]
            if (r0 == 0) goto L_0x0156
            r1 = r0
            goto L_0x013c
        L_0x0156:
            int r0 = r1.A04
            if (r0 != r14) goto L_0x016a
            int r0 = r1.A02
            if (r0 != r13) goto L_0x016a
            int r0 = r1.A03
            if (r0 != r3) goto L_0x016a
            android.graphics.Bitmap r0 = r1.A01()
            if (r0 == 0) goto L_0x01fd
            r2.A06 = r1
        L_0x016a:
            X.7o9 r1 = r2.A06
            if (r1 != 0) goto L_0x0172
            X.7o9 r1 = r2.A05
            if (r1 == 0) goto L_0x017d
        L_0x0172:
            r12.A03(r1)
            X.7o9 r0 = r12.A05
            r0.A08 = r1
            r1.A07 = r0
            r12.A05 = r1
        L_0x017d:
            X.7XB r2 = r9.A08
            X.7o9 r0 = r2.A06
            if (r0 == 0) goto L_0x01f0
            r14 = 1
            r1 = 1
        L_0x0185:
            int r0 = r2.A03
            if (r0 != r1) goto L_0x018e
            java.util.ArrayList r0 = A0C
            X.C86614Ku.A1T(r9, r0)
        L_0x018e:
            X.7XB r12 = r9.A08
            r2 = r29
            r1 = r19
            r0 = r18
            r12.A00(r2, r1, r0)
            int r0 = r9.A07
            int r0 = r0 + 1
            r9.A07 = r0
            if (r14 != 0) goto L_0x01a7
            int r0 = r9.A06
            int r0 = r0 + 1
            r9.A06 = r0
        L_0x01a7:
            if (r10 == r5) goto L_0x01ec
            if (r10 >= 0) goto L_0x01e6
            int r0 = -r10
            if (r0 == r5) goto L_0x01ec
        L_0x01ae:
            r2 = r17
        L_0x01b0:
            int r4 = r4 + r2
            int r3 = r3 + r11
            r0 = r27
            if (r0 > r3) goto L_0x01ca
            r0 = r25
            if (r3 > r0) goto L_0x01ca
            r0 = r28
            if (r0 > r4) goto L_0x01ca
            r0 = r26
            if (r4 > r0) goto L_0x01ca
            int r10 = r10 + r2
            int r5 = r5 + r11
            r17 = r2
        L_0x01c6:
            int r20 = r20 + 1
            goto L_0x00e9
        L_0x01ca:
            r4 = r2 & 1
            r3 = 1
            int r4 = r4 << r3
            int r4 = r4 - r3
            int r4 = r4 * r10
            int r0 = r11 >> 1
            r0 = r0 & 1
            int r4 = r4 + r0
            r1 = r11 & 1
            int r1 = r1 << r3
            int r1 = r1 - r3
            int r1 = r1 * r5
            int r0 = -r2
            r17 = r0
            int r0 = r0 >> 1
            r0 = r0 & 1
            int r1 = r1 + r0
            int r11 = -r11
            r10 = r4
            r5 = r1
            goto L_0x01c6
        L_0x01e6:
            if (r10 <= 0) goto L_0x01ae
            int r0 = 1 - r5
            if (r10 != r0) goto L_0x01ae
        L_0x01ec:
            int r2 = -r11
            r11 = r17
            goto L_0x01b0
        L_0x01f0:
            r14 = 0
            int r0 = r2.A03
            r1 = 1
            if (r0 == r1) goto L_0x0185
            int r1 = r8.A0G
            r0 = 2
            r9.A0E(r13, r3, r1, r0)
            goto L_0x018e
        L_0x01fd:
            int r0 = r1.A0B
            r2.A03 = r0
            X.7o9[] r14 = r1.A0A
            X.7o9[] r15 = r2.A07
            r1 = 0
            r0 = r16
            java.lang.System.arraycopy(r14, r1, r15, r1, r0)
        L_0x020b:
            r15 = r14[r1]
            if (r15 == 0) goto L_0x021a
            r12.A03(r15)
            X.7o9 r0 = r12.A05
            r0.A08 = r15
            r15.A07 = r0
            r12.A05 = r15
        L_0x021a:
            int r1 = r1 + 1
            r0 = 4
            if (r1 >= r0) goto L_0x016a
            goto L_0x020b
        L_0x0220:
            java.lang.String r0 = "INVALID_ZOOM_LEVEL"
            goto L_0x0091
        L_0x0224:
            java.lang.String r0 = "INVALID_ZOOM_LEVEL"
            goto L_0x001a
        L_0x0228:
            int r1 = r9.A07
            int r0 = r9.A00
            if (r1 <= r0) goto L_0x0246
            r9.A00 = r1
            int[] r2 = r9.A0B
            java.util.ArrayList r0 = X.C125996Kh.A07
            X.C86614Ku.A1T(r9, r0)
            X.C125996Kh.A00(r2)
            X.7b0 r1 = r9.A0A
            r0 = 0
            r0 = r2[r0]
            r1.A01 = r0
            r0 = 1
            r0 = r2[r0]
            r1.A02 = r0
        L_0x0246:
            r29.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6KV.A0B(android.graphics.Canvas):void");
    }

    public void A0D() {
        C153297b0 r2 = this.A0A;
        C160697o9 r1 = r2.A04;
        while (r1 != null) {
            C160697o9 r0 = r1.A08;
            r1.A02();
            r1 = r0;
        }
        C160697o9 r12 = new C160697o9(-1, -1);
        r2.A06 = r12;
        r12.A02 = 0;
        r12.A03 = 0;
        r12.A04 = 0;
        r2.A04 = r12;
        r2.A05 = r12;
        r2.A00 = 0;
    }

    public AnonymousClass6KV(C110885hC r7, C153297b0 r8) {
        super(r7);
        this.A0A = r8;
        ActivityManager activityManager = (ActivityManager) r7.A0P.getSystemService("activity");
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (!memoryInfo.lowMemory && memoryInfo.availMem >= 500000000 && memoryInfo.totalMem >= 3000000000L) {
                return;
            }
        }
        C160697o9.A0D = Bitmap.Config.RGB_565;
    }

    public void A05() {
        super.A05();
        A0D();
    }

    public void A09(boolean z) {
        super.A09(z);
    }
}
