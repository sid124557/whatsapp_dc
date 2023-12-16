package X;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;

/* renamed from: X.9U8  reason: invalid class name */
public class AnonymousClass9U8 {
    public static int A00(CameraManager cameraManager, CaptureRequest.Builder builder, AnonymousClass96t r7, C194899Ux r8, String str, int i) {
        CaptureRequest.Key key;
        if (r7 == null || r8 == null) {
            throw AnonymousClass001.A0e("Trying to update builder after camera closed.");
        }
        int i2 = 0;
        if (i != 0) {
            int A02 = C195049Vr.A02(C195049Vr.A0v, r7);
            if (A02 == -1) {
                return A02;
            }
            if (A02 == 1 && C194899Ux.A04(C194899Ux.A0A, r8)) {
                i2 = 1;
            }
            key = CaptureRequest.CONTROL_AWB_MODE;
        } else {
            int A022 = C195049Vr.A02(C195049Vr.A0C, r7);
            if (A022 == 4) {
                if (C194899Ux.A04(C194899Ux.A08, r8)) {
                    i2 = 4;
                }
            } else if (A022 == 3) {
                if (C194899Ux.A04(C194899Ux.A09, r8)) {
                    i2 = 3;
                }
            } else if (A022 == 1) {
                if (C194899Ux.A04(C194899Ux.A07, r8)) {
                    i2 = 1;
                }
            } else if (A022 == 0 && C194899Ux.A04(C194899Ux.A0H, r8)) {
                Number number = (Number) C195049Vr.A04(C195049Vr.A0b, r7);
                float floatValue = number.floatValue();
                CameraCharacteristics.Key key2 = CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE;
                if (str != null) {
                    Object obj = AnonymousClass9UR.A00(cameraManager, str).get(key2);
                    obj.getClass();
                    if (floatValue >= AnonymousClass001.A05(obj)) {
                        builder.set(CaptureRequest.LENS_FOCUS_DISTANCE, number);
                    }
                } else {
                    throw new C201699ka("Camera ID must be provided to check supported modes.");
                }
            }
            key = CaptureRequest.CONTROL_AF_MODE;
        }
        C1899593h.A0l(builder, key, i2);
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0200, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x021a, code lost:
        if (X.C195049Vr.A02(r2, r9) != 3) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0235, code lost:
        X.AnonymousClass9WT.A02(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0238, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x028b, code lost:
        r8.set(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x028e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        if (r2 != 0) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014b, code lost:
        if (X.C195049Vr.A02(r2, r9) != 3) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x016e, code lost:
        if (r0 != false) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0183, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        r8.set(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0195, code lost:
        r0 = r9.A08(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f6, code lost:
        r2 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.hardware.camera2.CaptureRequest.Builder r8, X.AnonymousClass96t r9, X.C194899Ux r10, int r11) {
        /*
            if (r9 == 0) goto L_0x029b
            if (r10 == 0) goto L_0x029b
            r6 = 3
            r3 = 2
            r1 = 1
            r5 = 0
            switch(r11) {
                case 0: goto L_0x0239;
                case 1: goto L_0x0189;
                case 2: goto L_0x0206;
                case 3: goto L_0x0040;
                case 4: goto L_0x0171;
                case 5: goto L_0x01cd;
                case 6: goto L_0x015e;
                case 7: goto L_0x0137;
                case 8: goto L_0x0121;
                case 9: goto L_0x0032;
                case 10: goto L_0x010a;
                case 11: goto L_0x00e1;
                case 12: goto L_0x00d3;
                case 13: goto L_0x00b2;
                case 14: goto L_0x008d;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.9Mx r0 = X.C195049Vr.A0k
            java.lang.Object r1 = r9.A08(r0)
            int[] r1 = (int[]) r1
            X.9Mw r0 = X.C194899Ux.A0p
            java.util.List r0 = X.C194899Ux.A03(r0, r10)
            boolean r0 = X.AnonymousClass9WQ.A01(r0, r1)
            if (r0 == 0) goto L_0x0031
            r1.getClass()
            X.9Mw r0 = X.C194899Ux.A0d
            boolean r0 = X.C194899Ux.A04(r0, r10)
            android.util.Range r3 = X.C1899693i.A05(r1, r0)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE
        L_0x002e:
            r8.set(r0, r3)
        L_0x0031:
            return
        L_0x0032:
            java.util.HashSet r0 = X.AnonymousClass9UX.A01
            boolean r0 = X.C194989Vk.A02(r0)
            if (r0 != 0) goto L_0x0031
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            X.9Mx r0 = X.C195049Vr.A07
            goto L_0x0195
        L_0x0040:
            java.util.HashSet r0 = X.AnonymousClass9UX.A01
            boolean r0 = X.C194989Vk.A02(r0)
            r4 = 22
            if (r0 != 0) goto L_0x019b
            X.9Mx r0 = X.C195049Vr.A0p
            java.lang.Object r3 = X.C195049Vr.A04(r0, r9)
            java.lang.Number r3 = (java.lang.Number) r3
            int r2 = r3.intValue()
            r0 = 17
            if (r2 != r0) goto L_0x0078
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x007a
            X.9Mx r0 = X.C195049Vr.A0T
            boolean r0 = X.C195049Vr.A07(r0, r9)
            if (r0 == 0) goto L_0x007a
            X.9Mw r0 = X.C194899Ux.A0F
            boolean r0 = X.C194899Ux.A04(r0, r10)
            if (r0 == 0) goto L_0x007a
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            r0 = 18
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x028b
        L_0x0078:
            if (r2 == 0) goto L_0x0089
        L_0x007a:
            X.9Mw r0 = X.C194899Ux.A0u
            java.util.List r0 = X.C194899Ux.A03(r0, r10)
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0089
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            goto L_0x002e
        L_0x0089:
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            goto L_0x0183
        L_0x008d:
            X.9Mw r0 = X.C194899Ux.A01
            boolean r0 = X.C194899Ux.A04(r0, r10)
            if (r0 == 0) goto L_0x00a0
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK
            X.9Mx r0 = X.C195049Vr.A0N
            java.lang.Object r0 = r9.A08(r0)
            r8.set(r1, r0)
        L_0x00a0:
            X.9Mw r0 = X.C194899Ux.A04
            boolean r0 = X.C194899Ux.A04(r0, r10)
            if (r0 == 0) goto L_0x0031
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_LOCK
            X.9Mx r0 = X.C195049Vr.A0P
            java.lang.Object r0 = r9.A08(r0)
            goto L_0x028b
        L_0x00b2:
            X.9Mw r0 = X.C194899Ux.A06
            boolean r0 = X.C194899Ux.A04(r0, r10)
            if (r0 == 0) goto L_0x0031
            X.9Mx r0 = X.C195049Vr.A04
            int r0 = X.C195049Vr.A02(r0, r9)
            if (r0 != 0) goto L_0x0031
            X.9Mx r0 = X.C195049Vr.A05
            java.lang.Object r0 = X.C195049Vr.A04(r0, r9)
            int[] r0 = (int[]) r0
            android.hardware.camera2.params.ColorSpaceTransform r3 = new android.hardware.camera2.params.ColorSpaceTransform
            r3.<init>(r0)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.COLOR_CORRECTION_TRANSFORM
            goto L_0x002e
        L_0x00d3:
            X.9Mw r0 = X.C194899Ux.A06
            boolean r0 = X.C194899Ux.A04(r0, r10)
            if (r0 == 0) goto L_0x0031
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.COLOR_CORRECTION_MODE
            X.9Mx r0 = X.C195049Vr.A04
            goto L_0x0195
        L_0x00e1:
            X.9Mw r0 = X.C194899Ux.A06
            boolean r0 = X.C194899Ux.A04(r0, r10)
            if (r0 == 0) goto L_0x0031
            X.9Mx r0 = X.C195049Vr.A04
            int r0 = X.C195049Vr.A02(r0, r9)
            if (r0 != 0) goto L_0x0031
            X.9Mx r0 = X.C195049Vr.A03
            java.lang.Object r0 = X.C195049Vr.A04(r0, r9)
            float[] r0 = (float[]) r0
            r4 = r0[r5]
            r2 = r0[r1]
            r1 = r0[r3]
            r0 = r0[r6]
            android.hardware.camera2.params.RggbChannelVector r3 = new android.hardware.camera2.params.RggbChannelVector
            r3.<init>(r4, r2, r1, r0)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.COLOR_CORRECTION_GAINS
            goto L_0x002e
        L_0x010a:
            X.9Mw r0 = X.C194899Ux.A0R
            boolean r0 = X.C194899Ux.A04(r0, r10)
            if (r0 == 0) goto L_0x0031
            X.9Mx r1 = X.C195049Vr.A07
            int r0 = X.C195049Vr.A02(r1, r9)
            if (r0 == 0) goto L_0x01be
            int r0 = X.C195049Vr.A02(r1, r9)
            if (r0 == r6) goto L_0x01be
            return
        L_0x0121:
            X.9Mx r0 = X.C195049Vr.A00
            java.lang.Object r3 = X.C195049Vr.A04(r0, r9)
            X.9Mw r0 = X.C194899Ux.A0e
            java.util.List r0 = X.C194899Ux.A03(r0, r10)
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0031
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_ANTIBANDING_MODE
            goto L_0x002e
        L_0x0137:
            X.9Mx r0 = X.C195049Vr.A0M
            boolean r0 = X.C195049Vr.A07(r0, r9)
            if (r0 == 0) goto L_0x015c
            X.9Mx r2 = X.C195049Vr.A07
            int r0 = X.C195049Vr.A02(r2, r9)
            if (r0 == 0) goto L_0x015c
            int r0 = X.C195049Vr.A02(r2, r9)
            if (r0 == r6) goto L_0x015c
        L_0x014d:
            X.9Mw r0 = X.C194899Ux.A0G
            boolean r0 = X.C194899Ux.A04(r0, r10)
            if (r0 == 0) goto L_0x01c8
            if (r1 != 0) goto L_0x01c8
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.SENSOR_SENSITIVITY
            X.9Mx r0 = X.C195049Vr.A0J
            goto L_0x0195
        L_0x015c:
            r1 = 0
            goto L_0x014d
        L_0x015e:
            X.9Mw r0 = X.C194899Ux.A0K
            boolean r0 = X.C194899Ux.A04(r0, r10)
            if (r0 == 0) goto L_0x0031
            X.9Mx r0 = X.C195049Vr.A0V
            boolean r0 = X.C195049Vr.A07(r0, r9)
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE
            if (r0 == 0) goto L_0x0200
            goto L_0x0183
        L_0x0171:
            X.9Mw r0 = X.C194899Ux.A0T
            boolean r0 = X.C194899Ux.A04(r0, r10)
            if (r0 == 0) goto L_0x0031
            X.9Mx r0 = X.C195049Vr.A0X
            boolean r0 = X.C195049Vr.A07(r0, r9)
            if (r0 == 0) goto L_0x01f6
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
        L_0x0183:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x028b
        L_0x0189:
            X.9Mw r0 = X.C194899Ux.A0C
            boolean r0 = X.C194899Ux.A04(r0, r10)
            if (r0 == 0) goto L_0x0031
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION
            X.9Mx r0 = X.C195049Vr.A08
        L_0x0195:
            java.lang.Object r0 = r9.A08(r0)
            goto L_0x028b
        L_0x019b:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x01f9
            X.9Mx r2 = X.C195049Vr.A0p
            int r0 = X.C195049Vr.A02(r2, r9)
            if (r0 == 0) goto L_0x01f9
            X.9Mw r0 = X.C194899Ux.A0F
            boolean r0 = X.C194899Ux.A04(r0, r10)
            if (r0 == 0) goto L_0x01f9
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            X.C1899593h.A0l(r8, r0, r3)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            java.lang.Object r0 = r9.A08(r2)
            r8.set(r1, r0)
            return
        L_0x01be:
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.LENS_APERTURE
            X.9Mx r0 = X.C195049Vr.A01
            java.lang.Object r0 = r9.A08(r0)
            goto L_0x028b
        L_0x01c8:
            java.lang.String r1 = "CaptureRequestHelper"
            java.lang.String r0 = "ISO_RANGE not supported or AE on"
            goto L_0x0235
        L_0x01cd:
            X.9Mx r0 = X.C195049Vr.A0W
            boolean r0 = X.C195049Vr.A07(r0, r9)
            if (r0 == 0) goto L_0x01f6
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto L_0x01eb
            X.9Mw r0 = X.C194899Ux.A0L
            boolean r0 = X.C194899Ux.A04(r0, r10)
            if (r0 == 0) goto L_0x01eb
        L_0x01e3:
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x028b
        L_0x01eb:
            X.9Mw r0 = X.C194899Ux.A0M
            boolean r0 = X.C194899Ux.A04(r0, r10)
            boolean r3 = X.AnonymousClass000.A1S(r0)
            goto L_0x01e3
        L_0x01f6:
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            goto L_0x0200
        L_0x01f9:
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            X.C1899593h.A0l(r8, r0, r1)
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
        L_0x0200:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L_0x028b
        L_0x0206:
            X.9Mx r0 = X.C195049Vr.A0M
            boolean r0 = X.C195049Vr.A07(r0, r9)
            if (r0 == 0) goto L_0x022f
            X.9Mx r2 = X.C195049Vr.A07
            int r0 = X.C195049Vr.A02(r2, r9)
            if (r0 == 0) goto L_0x022f
            int r0 = X.C195049Vr.A02(r2, r9)
            if (r0 == r6) goto L_0x022f
        L_0x021c:
            X.9Mw r0 = X.C194899Ux.A0D
            boolean r0 = X.C194899Ux.A04(r0, r10)
            if (r0 == 0) goto L_0x0231
            if (r1 != 0) goto L_0x0231
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.SENSOR_EXPOSURE_TIME
            X.9Mx r0 = X.C195049Vr.A09
            java.lang.Object r0 = r9.A08(r0)
            goto L_0x028b
        L_0x022f:
            r1 = 0
            goto L_0x021c
        L_0x0231:
            java.lang.String r1 = "CaptureRequestHelper"
            java.lang.String r0 = "EXPOSURE_TIME not supported or AE on"
        L_0x0235:
            X.AnonymousClass9WT.A02(r1, r0)
            return
        L_0x0239:
            X.9Mx r0 = X.C195049Vr.A0M
            boolean r7 = X.C195049Vr.A07(r0, r9)
            X.9Mx r0 = X.C195049Vr.A0A
            java.lang.Object r4 = X.C195049Vr.A04(r0, r9)
            java.lang.Number r4 = (java.lang.Number) r4
            int r2 = r4.intValue()
            X.9Mw r0 = X.C194899Ux.A0j
            java.util.List r0 = X.C194899Ux.A03(r0, r10)
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x0268
            if (r2 == 0) goto L_0x0294
            if (r2 == r1) goto L_0x027e
            if (r2 == r3) goto L_0x0274
            if (r2 != r6) goto L_0x0268
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L_0x0265:
            r8.set(r2, r0)
        L_0x0268:
            r6 = r7
        L_0x0269:
            if (r7 != 0) goto L_0x0285
            X.9Mw r0 = X.C194899Ux.A00
            boolean r0 = X.C194899Ux.A04(r0, r10)
            if (r0 != 0) goto L_0x0285
            return
        L_0x0274:
            int r6 = X.C18310x6.A02(r7)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            X.C1899593h.A0l(r8, r0, r5)
            goto L_0x0269
        L_0x027e:
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            if (r7 == 0) goto L_0x028f
            X.C1899593h.A0l(r8, r2, r5)
        L_0x0285:
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
        L_0x028b:
            r8.set(r2, r0)
            return
        L_0x028f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x0265
        L_0x0294:
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L_0x0265
        L_0x029b:
            java.lang.String r0 = "Trying to update builder after camera closed."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9U8.A01(android.hardware.camera2.CaptureRequest$Builder, X.96t, X.9Ux, int):void");
    }
}
