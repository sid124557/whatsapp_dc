package X;

import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.5rt  reason: invalid class name and case insensitive filesystem */
public class C117415rt implements Runnable {
    public float A00;
    public float A01;
    public long A02 = -1;
    public Object A03;
    public boolean A04;
    public boolean A05;
    public final int A06;

    public static void A00(C117415rt r1) {
        r1.A04 = false;
        r1.A05 = true;
    }

    public C117415rt(PhotoView photoView, int i) {
        this.A06 = i;
        this.A03 = photoView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        if (r1 < 0.0f) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (r1 > 0.0f) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        if (r2 > 0.0f) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        if (r2 < 0.0f) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r10 = this;
            int r1 = r10.A06
            boolean r0 = r10.A05
            if (r1 == 0) goto L_0x0077
            if (r0 != 0) goto L_0x0064
            long r1 = java.lang.System.currentTimeMillis()
            long r6 = r10.A02
            r3 = -1
            r8 = 1148846080(0x447a0000, float:1000.0)
            r5 = 0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0075
            long r3 = r1 - r6
            float r6 = (float) r3
            float r6 = r6 / r8
        L_0x001b:
            java.lang.Object r4 = r10.A03
            com.whatsapp.mediaview.PhotoView r4 = (com.whatsapp.mediaview.PhotoView) r4
            float r3 = r10.A00
            float r3 = r3 * r6
            float r0 = r10.A01
            float r0 = r0 * r6
            boolean r3 = r4.A0C(r3, r0)
            r10.A02 = r1
            float r6 = r6 * r8
            float r2 = r10.A00
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x006d
            float r2 = r2 - r6
            r10.A00 = r2
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x003c
        L_0x0039:
            r10.A00 = r5
            r2 = 0
        L_0x003c:
            float r1 = r10.A01
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0065
            float r1 = r1 - r6
            r10.A01 = r1
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x004c
        L_0x0049:
            r10.A01 = r5
            r1 = 0
        L_0x004c:
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0054
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0056
        L_0x0054:
            if (r3 != 0) goto L_0x005d
        L_0x0056:
            A00(r10)
            r0 = 0
            r4.A0A(r0)
        L_0x005d:
            boolean r0 = r10.A05
            if (r0 != 0) goto L_0x0064
            r4.post(r10)
        L_0x0064:
            return
        L_0x0065:
            float r1 = r1 + r6
            r10.A01 = r1
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x004c
            goto L_0x0049
        L_0x006d:
            float r2 = r2 + r6
            r10.A00 = r2
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x003c
            goto L_0x0039
        L_0x0075:
            r6 = 0
            goto L_0x001b
        L_0x0077:
            if (r0 != 0) goto L_0x0064
            long r5 = java.lang.System.currentTimeMillis()
            long r3 = r10.A02
            r8 = -1
            r7 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00ef
            long r0 = r5 - r3
            float r2 = (float) r0
        L_0x0089:
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x008f
            r10.A02 = r5
        L_0x008f:
            r1 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00bd
            float r5 = r10.A00
            float r3 = r10.A01
        L_0x0099:
            java.lang.Object r2 = r10.A03
            com.whatsapp.mediaview.PhotoView r2 = (com.whatsapp.mediaview.PhotoView) r2
            r2.A0C(r5, r3)
            float r0 = r10.A00
            float r0 = r0 - r5
            r10.A00 = r0
            float r1 = r10.A01
            float r1 = r1 - r3
            r10.A01 = r1
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x00b5
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x00b5
            A00(r10)
        L_0x00b5:
            boolean r0 = r10.A05
            if (r0 != 0) goto L_0x0064
            r2.post(r10)
            return
        L_0x00bd:
            float r6 = r10.A00
            float r1 = r1 - r2
            float r5 = r6 / r1
            r0 = 1092616192(0x41200000, float:10.0)
            float r5 = r5 * r0
            float r4 = r10.A01
            float r3 = r4 / r1
            float r3 = r3 * r0
            float r1 = java.lang.Math.abs(r5)
            float r0 = java.lang.Math.abs(r6)
            r2 = 2143289344(0x7fc00000, float:NaN)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00dc
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00dd
        L_0x00dc:
            r5 = r6
        L_0x00dd:
            float r1 = java.lang.Math.abs(r3)
            float r0 = java.lang.Math.abs(r4)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00ed
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0099
        L_0x00ed:
            r3 = r4
            goto L_0x0099
        L_0x00ef:
            r2 = 0
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117415rt.run():void");
    }
}
