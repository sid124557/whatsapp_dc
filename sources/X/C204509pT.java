package X;

import java.util.concurrent.Callable;

/* renamed from: X.9pT  reason: invalid class name and case insensitive filesystem */
public class C204509pT implements Callable {
    public int A00;
    public Object A01;
    public final int A02;

    public C204509pT(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e4, code lost:
        if (r8 >= r1) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r14 = this;
            int r0 = r14.A02
            switch(r0) {
                case 0: goto L_0x0114;
                case 1: goto L_0x0107;
                case 2: goto L_0x00eb;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r6 = r14.A01
            X.9ZS r6 = (X.AnonymousClass9ZS) r6
            int r3 = r14.A00
            boolean r0 = r6.isConnected()
            if (r0 == 0) goto L_0x00e8
            X.9WQ r5 = r6.A0Z
            X.9T1 r1 = r5.A0H
            java.lang.String r0 = "Can only check if the prepared on the Optic thread"
            r1.A01(r0)
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x00e8
            X.9WO r7 = r6.A09
            if (r7 == 0) goto L_0x00e8
            X.9Ux r1 = r7.A08
            X.96t r0 = r7.A06
            X.96u r10 = r7.A07
            android.graphics.Rect r4 = r7.A05
            android.graphics.Rect r2 = r7.A04
            java.util.List r9 = r7.A0A
            if (r0 == 0) goto L_0x003e
            if (r10 == 0) goto L_0x003e
            if (r1 == 0) goto L_0x003e
            if (r9 == 0) goto L_0x003e
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x0049
            java.util.List r0 = r7.A09
            if (r0 != 0) goto L_0x0049
        L_0x003e:
            X.9WO r0 = r6.A09
            int r0 = r0.A04()
        L_0x0044:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            return r1
        L_0x0049:
            if (r2 == 0) goto L_0x003e
            if (r4 == 0) goto L_0x003e
            int r0 = r7.A03
            int r1 = java.lang.Math.max(r3, r0)
            int r0 = r7.A02
            int r3 = java.lang.Math.min(r1, r0)
            int r0 = r7.A04()
            if (r3 == r0) goto L_0x003e
            float r11 = (float) r3
            int r0 = r7.A03
            float r12 = (float) r0
            int r0 = r7.A02
            float r8 = (float) r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r12 = X.AnonymousClass9WO.A00(r11, r12, r8, r1, r0)
            float r8 = r7.A02()
            float r1 = r7.A01
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00dd
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00dd
            r13 = 1
        L_0x007d:
            int r0 = r7.A03
            float r12 = (float) r0
            int r0 = r7.A02
            float r8 = (float) r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r8 = X.AnonymousClass9WO.A00(r11, r12, r8, r1, r0)
            X.9Mx r1 = X.C195049Vr.A0x
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            X.AnonymousClass96u.A00(r10, r1, r0)
            X.9Mx r1 = X.C195049Vr.A0q
            java.lang.Float r0 = java.lang.Float.valueOf(r8)
            X.AnonymousClass96u.A00(r10, r1, r0)
            boolean r0 = r7.A0B
            if (r0 != 0) goto L_0x00ab
            float r1 = X.C1899593h.A01(r9, r3)
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            X.AnonymousClass9WO.A01(r4, r2, r1)
        L_0x00ab:
            android.os.Handler r2 = r7.A0E
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0 = 1
            android.os.Message r0 = r2.obtainMessage(r0, r3, r0, r1)
            r2.sendMessage(r0)
            X.9WO r1 = r6.A09
            float r0 = r1.A02()
            float r4 = r1.A03(r0)
            r0 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r0
            X.9WO r1 = r6.A09
            android.graphics.Rect r3 = r1.A04
            android.hardware.camera2.params.MeteringRectangle[] r0 = r1.A0D
            android.hardware.camera2.params.MeteringRectangle[] r2 = r1.A05(r0)
            X.9WO r1 = r6.A09
            android.hardware.camera2.params.MeteringRectangle[] r0 = r1.A0C
            android.hardware.camera2.params.MeteringRectangle[] r0 = r1.A05(r0)
            r5.A05(r3, r2, r0, r4)
            goto L_0x003e
        L_0x00dd:
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00e6
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r13 = 2
            if (r0 < 0) goto L_0x007d
        L_0x00e6:
            r13 = 0
            goto L_0x007d
        L_0x00e8:
            r0 = 0
            goto L_0x0044
        L_0x00eb:
            java.lang.Object r2 = r14.A01
            X.9ZR r2 = (X.AnonymousClass9ZR) r2
            int r1 = r14.A00
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L_0x0105
            boolean r0 = r2.A0g
            if (r0 == 0) goto L_0x0105
            X.9XE r0 = r2.A0O
            r0.A00(r1)
        L_0x0100:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L_0x0105:
            r1 = 0
            goto L_0x0100
        L_0x0107:
            int r0 = r14.A00
            X.AnonymousClass9WT.A00()
            android.hardware.Camera r1 = android.hardware.Camera.open(r0)
            X.AnonymousClass9WT.A00()
            return r1
        L_0x0114:
            java.lang.Object r4 = r14.A01
            X.9ZR r4 = (X.AnonymousClass9ZR) r4
            int r1 = r14.A00
            java.lang.String r0 = "Can not update preview display rotation"
            r4.A0B(r0)
            r4.A01 = r1
            android.hardware.Camera r0 = r4.A0Z
            r0.getClass()
            X.9Tk r0 = r4.A0a
            android.hardware.Camera r1 = r4.A0Z
            if (r0 != 0) goto L_0x0162
            int r0 = r4.A01
            int r0 = r4.A00(r0)
            r1.setDisplayOrientation(r0)
        L_0x0135:
            java.lang.String r0 = "Cannot get camera settings"
            r4.A0B(r0)
            X.9T8 r1 = r4.A0P
            int r0 = r4.A00
            X.9Vr r3 = r1.A02(r0)
            X.9Mx r0 = X.C195049Vr.A0n
            java.lang.Object r0 = X.C195049Vr.A04(r0, r3)
            X.9T4 r0 = (X.AnonymousClass9T4) r0
            int r1 = r0.A02
            int r0 = r0.A01
            r4.A08(r1, r0)
            int r2 = r4.A00
            X.9Ux r1 = r4.B5H()
            X.9Ot r0 = new X.9Ot
            r0.<init>(r1, r3, r2)
            X.9Ou r1 = new X.9Ou
            r1.<init>(r0)
            return r1
        L_0x0162:
            r0 = 0
            int r0 = r4.A00(r0)
            r1.setDisplayOrientation(r0)
            X.9Tk r3 = r4.A0a
            int r2 = r4.A01
            r0 = 1
            if (r2 == r0) goto L_0x0181
            r0 = 2
            if (r2 == r0) goto L_0x017e
            r1 = 3
            r0 = 270(0x10e, float:3.78E-43)
            if (r2 == r1) goto L_0x017a
            r0 = 0
        L_0x017a:
            r3.A04(r0)
            goto L_0x0135
        L_0x017e:
            r0 = 180(0xb4, float:2.52E-43)
            goto L_0x017a
        L_0x0181:
            r0 = 90
            goto L_0x017a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204509pT.call():java.lang.Object");
    }
}
