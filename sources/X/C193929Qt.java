package X;

import android.hardware.camera2.CaptureResult;

/* renamed from: X.9Qt  reason: invalid class name and case insensitive filesystem */
public class C193929Qt {
    public int A00;
    public final AnonymousClass9VM[] A01 = new AnonymousClass9VM[3];

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009e, code lost:
        if (r4.intValue() != 3) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass9VM A01(X.C202389lw r7) {
        /*
            r6 = this;
            X.9VM[] r1 = r6.A01
            int r0 = r6.A00
            r5 = r1[r0]
            if (r5 != 0) goto L_0x000f
            X.9VM r5 = new X.9VM
            r5.<init>()
            r1[r0] = r5
        L_0x000f:
            X.9Mz r1 = X.AnonymousClass9VM.A0Q
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            r3 = 0
            if (r2 < r0) goto L_0x00b5
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.LENS_INTRINSIC_CALIBRATION
            java.lang.Object r0 = r7.B3w(r0)
        L_0x001e:
            r5.A01(r1, r0)
            X.9Mz r1 = X.AnonymousClass9VM.A0N
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.LENS_FOCUS_RANGE
            A00(r0, r7, r1, r5)
            X.9Mz r1 = X.AnonymousClass9VM.A0O
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_ROLLING_SHUTTER_SKEW
            A00(r0, r7, r1, r5)
            X.9Mz r1 = X.AnonymousClass9VM.A0M
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.LENS_FOCAL_LENGTH
            A00(r0, r7, r1, r5)
            X.9Mz r1 = X.AnonymousClass9VM.A0K
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_EXPOSURE_TIME
            A00(r0, r7, r1, r5)
            X.9Mz r1 = X.AnonymousClass9VM.A0P
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP
            A00(r0, r7, r1, r5)
            r0 = 24
            if (r2 < r0) goto L_0x0050
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST
            java.lang.Object r3 = r7.B3w(r0)
            java.lang.Number r3 = (java.lang.Number) r3
        L_0x0050:
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_SENSITIVITY
            java.lang.Object r0 = r7.B3w(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0070
            X.9Mz r2 = X.AnonymousClass9VM.A0R
            if (r3 == 0) goto L_0x006d
            int r1 = r0.intValue()
            int r0 = r3.intValue()
            int r1 = r1 * r0
            int r0 = r1 / 100
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x006d:
            r5.A01(r2, r0)
        L_0x0070:
            X.9Mz r1 = X.AnonymousClass9VM.A0F
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.LENS_APERTURE
            A00(r0, r7, r1, r5)
            X.9Mz r1 = X.AnonymousClass9VM.A0G
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AWB_MODE
            A00(r0, r7, r1, r5)
            X.9Mz r1 = X.AnonymousClass9VM.A0T
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.JPEG_ORIENTATION
            A00(r0, r7, r1, r5)
            X.9Mz r1 = X.AnonymousClass9VM.A0S
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.LENS_FOCUS_DISTANCE
            A00(r0, r7, r1, r5)
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.FLASH_STATE
            java.lang.Object r4 = r7.B3w(r0)
            java.lang.Number r4 = (java.lang.Number) r4
            X.9Mz r3 = X.AnonymousClass9VM.A0J
            r2 = 3
            if (r4 == 0) goto L_0x00a0
            int r1 = r4.intValue()
            r0 = 1
            if (r1 == r2) goto L_0x00a1
        L_0x00a0:
            r0 = 0
        L_0x00a1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A01(r3, r0)
            X.9Mz r0 = X.AnonymousClass9VM.A0L
            r5.A01(r0, r4)
            int r0 = r6.A00
            int r0 = r0 + 1
            int r0 = r0 % r2
            r6.A00 = r0
            return r5
        L_0x00b5:
            r0 = r3
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C193929Qt.A01(X.9lw):X.9VM");
    }

    public static void A00(CaptureResult.Key key, C202389lw r1, C193059Mz r2, AnonymousClass9VM r3) {
        r3.A01(r2, r1.B3w(key));
    }
}
