package X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.7nO  reason: invalid class name and case insensitive filesystem */
public final class C160297nO {
    public final int A00;
    public final int A01;
    public final AnonymousClass7YA A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final int[] A06;

    public C160297nO(AnonymousClass7YA r1, List list, int[] iArr, int i, int i2, boolean z, boolean z2) {
        this.A00 = i;
        this.A05 = z;
        this.A01 = i2;
        this.A04 = z2;
        this.A06 = iArr;
        this.A02 = r1;
        this.A03 = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        if (r0.intValue() == 0) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
        if (r5.getSensorOrientation(4) == r5.getSensorOrientation(0)) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C160297nO A00(X.C620633i r17, int r18) {
        /*
            android.hardware.camera2.CameraManager r1 = r17.A0E()
            r12 = 0
            if (r1 != 0) goto L_0x000d
            java.lang.String r0 = "voip/RawCameraInfo camera2 CameraManager is null"
        L_0x0009:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r12
        L_0x000d:
            r6 = r18
            java.lang.String r0 = java.lang.Integer.toString(r6)     // Catch:{ Exception -> 0x010e }
            android.hardware.camera2.CameraCharacteristics r3 = r1.getCameraCharacteristics(r0)     // Catch:{ Exception -> 0x010e }
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch:{ IllegalArgumentException -> 0x010a }
            java.lang.Object r2 = r3.get(r0)     // Catch:{ IllegalArgumentException -> 0x010a }
            android.hardware.camera2.params.StreamConfigurationMap r2 = (android.hardware.camera2.params.StreamConfigurationMap) r2     // Catch:{ IllegalArgumentException -> 0x010a }
            if (r2 != 0) goto L_0x0034
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x010a }
            java.lang.String r0 = "voip/RawCameraInfo camera2 Camera "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x010a }
            r1.append(r6)     // Catch:{ IllegalArgumentException -> 0x010a }
            java.lang.String r0 = " has no available stream configs"
            X.C18260x0.A1K(r1, r0)     // Catch:{ IllegalArgumentException -> 0x010a }
            goto L_0x00c0
        L_0x0034:
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION     // Catch:{ IllegalArgumentException -> 0x010a }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ IllegalArgumentException -> 0x010a }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ IllegalArgumentException -> 0x010a }
            r11 = 0
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = "voip/RawCameraInfo camera2 orientation was null! defaulting to 0"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x010a }
            r16 = 0
            goto L_0x004b
        L_0x0047:
            int r16 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x010a }
        L_0x004b:
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch:{ IllegalArgumentException -> 0x010a }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ IllegalArgumentException -> 0x010a }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ IllegalArgumentException -> 0x010a }
            r4 = 1
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = "voip/RawCameraInfo camera2 lens facing is null! defaulting to lens facing back"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x010a }
            goto L_0x0064
        L_0x005c:
            int r0 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x010a }
            r17 = 0
            if (r0 != 0) goto L_0x0066
        L_0x0064:
            r17 = 1
        L_0x0066:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalArgumentException -> 0x010a }
            r0 = 32
            if (r1 < r0) goto L_0x0086
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.INFO_DEVICE_STATE_SENSOR_ORIENTATION_MAP     // Catch:{ IllegalArgumentException -> 0x010a }
            java.lang.Object r5 = r3.get(r0)     // Catch:{ IllegalArgumentException -> 0x010a }
            android.hardware.camera2.params.DeviceStateSensorOrientationMap r5 = (android.hardware.camera2.params.DeviceStateSensorOrientationMap) r5     // Catch:{ IllegalArgumentException -> 0x010a }
            if (r5 == 0) goto L_0x0086
            r0 = 4
            int r3 = r5.getSensorOrientation(r0)     // Catch:{ IllegalArgumentException -> 0x010a }
            r0 = 0
            int r0 = r5.getSensorOrientation(r0)     // Catch:{ IllegalArgumentException -> 0x010a }
            r18 = 1
            if (r3 != r0) goto L_0x0088
        L_0x0086:
            r18 = 0
        L_0x0088:
            int[] r8 = r2.getOutputFormats()
            int r5 = r8.length
            r1 = 0
        L_0x008e:
            r3 = 35
            if (r1 >= r5) goto L_0x00be
            r0 = r8[r1]
            if (r0 != r3) goto L_0x00bb
            r0 = 1
        L_0x0097:
            java.lang.String r10 = "voip/RawCameraInfo camera2 "
            if (r0 != 0) goto L_0x00ae
            java.lang.StringBuilder r1 = X.C18270x1.A0W(r6, r10)
            java.lang.String r0 = " no supported output formats: "
            r1.append(r0)
            java.lang.String r0 = java.util.Arrays.toString(r8)
        L_0x00a8:
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            goto L_0x0009
        L_0x00ae:
            android.util.Size[] r5 = r2.getOutputSizes(r3)
            if (r5 != 0) goto L_0x00c1
            java.lang.StringBuilder r1 = X.C18270x1.A0W(r6, r10)
            java.lang.String r0 = " no supported output format/size combinations"
            goto L_0x00a8
        L_0x00bb:
            int r1 = r1 + 1
            goto L_0x008e
        L_0x00be:
            r0 = 0
            goto L_0x0097
        L_0x00c0:
            return r12
        L_0x00c1:
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()
            int r9 = r5.length
            r7 = 0
        L_0x00c7:
            if (r7 >= r9) goto L_0x00e2
            r0 = r5[r7]
            if (r0 == 0) goto L_0x00e0
            int r2 = r0.getWidth()
            int r1 = r0.getHeight()
            X.7YA r0 = new X.7YA
            r0.<init>(r2, r1)
        L_0x00da:
            r13.add(r0)
            int r7 = r7 + 1
            goto L_0x00c7
        L_0x00e0:
            r0 = r12
            goto L_0x00da
        L_0x00e2:
            java.lang.StringBuilder r1 = X.C18270x1.A0W(r6, r10)
            java.lang.String r0 = " params, supported color formats "
            r1.append(r0)
            java.lang.String r0 = java.util.Arrays.toString(r8)
            r1.append(r0)
            java.lang.String r0 = ", supported preview sizes: {"
            r1.append(r0)
            X.C18320x8.A1P(r1, r5)
            java.lang.String r0 = "}"
            X.C18260x0.A1L(r1, r0)
            r15 = 2
            int[] r14 = new int[r4]
            r14[r11] = r3
            X.7nO r11 = new X.7nO
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            return r11
        L_0x010a:
            r1 = move-exception
            java.lang.String r0 = "voip/RawCameraInfo camera2 Illegal Argument while accessing camera characteristics"
            goto L_0x0111
        L_0x010e:
            r1 = move-exception
            java.lang.String r0 = "voip/RawCameraInfo camera2 unable to acquire camera info"
        L_0x0111:
            com.whatsapp.util.Log.e(r0, r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160297nO.A00(X.33i, int):X.7nO");
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("json version: 1, api version: ");
        A0o.append(this.A00);
        A0o.append(", front camera: ");
        A0o.append(this.A05);
        A0o.append(", orientation: ");
        A0o.append(this.A01);
        A0o.append(", hasUnstableOrientation: ");
        A0o.append(this.A04);
        A0o.append(", formats: ");
        A0o.append(Arrays.toString(this.A06));
        A0o.append(", preferred size: ");
        A0o.append(this.A02);
        A0o.append(", sizes: ");
        List list = this.A03;
        if (list != null) {
            str = TextUtils.join(", ", list);
        } else {
            str = "null";
        }
        return AnonymousClass000.A0X(str, A0o);
    }
}
