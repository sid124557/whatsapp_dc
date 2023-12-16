package X;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* renamed from: X.9kJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201549kJ implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ CaptureRequest.Builder A04;
    public final /* synthetic */ C194559Tk A05;
    public final /* synthetic */ C193029Mr A06;
    public final /* synthetic */ AnonymousClass9SA A07;
    public final /* synthetic */ AnonymousClass9ZW A08;
    public final /* synthetic */ AnonymousClass9T4 A09;
    public final /* synthetic */ String A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014c, code lost:
        if (r0.equals(X.C192459Jv.LOW) == false) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r19 = this;
            r1 = r19
            X.9SA r11 = r1.A07
            java.lang.String r0 = r1.A0A
            r18 = r0
            r13 = 0
            X.9T4 r15 = r1.A09
            int r12 = r1.A00
            int r10 = r1.A02
            X.9Tk r9 = r1.A05
            android.hardware.camera2.CaptureRequest$Builder r8 = r1.A04
            X.9ZW r7 = r1.A08
            long r0 = r1.A03
            r16 = r0
            r15.getClass()
            r14 = 1
            r6 = 0
            X.9T1 r1 = r11.A09
            java.lang.String r0 = "Method recordVideo() must run on the Optic Background Thread."
            r1.A01(r0)
            android.hardware.camera2.CameraDevice r0 = r11.A0B
            if (r0 == 0) goto L_0x019f
            X.9Ux r0 = r11.A06
            if (r0 == 0) goto L_0x019f
            X.96t r1 = r11.A04
            if (r1 == 0) goto L_0x019f
            X.9WQ r0 = r11.A03
            if (r0 == 0) goto L_0x019f
            X.9Tj r0 = r11.A02
            if (r0 == 0) goto L_0x019f
            X.9nz r0 = r11.A05
            if (r0 == 0) goto L_0x0198
            X.9Mx r3 = X.C195049Vr.A0A
            int r0 = X.C195049Vr.A02(r3, r1)
            boolean r0 = X.AnonymousClass000.A1T(r0)
            r2 = 3
            if (r0 != 0) goto L_0x006d
            if (r8 == 0) goto L_0x006d
            X.9Sv r1 = new X.9Sv
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A01(r3, r0)
            X.9SE r1 = r1.A00()
            X.96t r0 = r11.A04
            r0.A0A(r1)
            X.96t r1 = r11.A04
            X.9Ux r0 = r11.A06
            X.AnonymousClass9U8.A01(r8, r1, r0, r6)
            X.9WQ r0 = r11.A03
            r0.A03()
        L_0x006d:
            r8.getClass()
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT
            X.C1899593h.A0l(r8, r0, r2)
            X.9nz r1 = r11.A05
            X.9Mv r0 = X.C203589nz.A0T
            java.lang.Object r0 = r1.B3x(r0)
            X.9Ts r5 = r11.A08
            X.9Oq r1 = r5.A02(r12)     // Catch:{ CameraAccessException -> 0x008a }
            java.lang.String r1 = r1.A02     // Catch:{ CameraAccessException -> 0x008a }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ CameraAccessException -> 0x008a }
            goto L_0x0092
        L_0x008a:
            java.lang.String r2 = "CameraInventory"
            java.lang.String r1 = "Failed to load CameraInfo to obtain camera id"
            X.AnonymousClass9WT.A01(r2, r1)
            r1 = 0
        L_0x0092:
            android.media.CamcorderProfile r4 = android.media.CamcorderProfile.get(r1, r14)
            X.96t r1 = r11.A04
            X.9Mx r3 = X.C195049Vr.A0s
            java.lang.Object r1 = r1.A08(r3)
            r1.getClass()
            int r2 = r15.A02
            int r1 = r15.A01
            X.9Jv r15 = X.C192459Jv.HIGH
            boolean r15 = r0.equals(r15)
            if (r15 == 0) goto L_0x0136
            r15 = 5000000(0x4c4b40, float:7.006492E-39)
        L_0x00b0:
            r4.videoBitRate = r15
        L_0x00b2:
            r0 = 2
            r4.videoCodec = r0
            X.96t r0 = r11.A04
            int r0 = X.C195049Vr.A02(r3, r0)
            r4.videoFrameRate = r0
            r4.videoFrameWidth = r2
            r4.videoFrameHeight = r1
            r9.getClass()
            r11.A01 = r9
            X.9Tj r9 = r11.A02
            X.9Vh r1 = r9.A0B
            java.lang.String r0 = "Method setFocusModeForVideo() must run on the Optic Background Thread."
            r1.A06(r0)
            android.hardware.camera2.CameraManager r0 = r9.A01
            if (r0 == 0) goto L_0x00ec
            android.hardware.camera2.CameraDevice r0 = r9.A00
            if (r0 == 0) goto L_0x00ec
            X.9WQ r1 = r9.A04
            if (r1 == 0) goto L_0x00ec
            X.9Ux r0 = r9.A07
            if (r0 == 0) goto L_0x00ec
            X.9ng r2 = r1.A08
            if (r2 == 0) goto L_0x00ec
            r9.A0E = r14
            boolean r0 = r9.A0C
            if (r0 == 0) goto L_0x00f2
            r9.A00()
        L_0x00ec:
            X.9Tk r6 = r11.A01
            r0 = -1
            if (r10 == r0) goto L_0x0164
            goto L_0x0150
        L_0x00f2:
            X.9Ux r1 = r9.A07
            X.9Mw r0 = X.C194899Ux.A09
            boolean r0 = X.C194899Ux.A04(r0, r1)
            if (r0 == 0) goto L_0x012a
            r3 = 3
        L_0x00fd:
            X.96t r1 = r9.A06
            if (r1 == 0) goto L_0x010b
            X.9Mx r0 = X.C195049Vr.A0U
            java.lang.Object r1 = r1.A08(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            if (r1 == r0) goto L_0x0118
        L_0x010b:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            r0 = 2
            X.C1899593h.A0l(r8, r1, r0)
            android.hardware.camera2.CaptureRequest r0 = r8.build()
            r2.Ayh(r0, r13, r7)
        L_0x0118:
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            X.C1899593h.A0l(r8, r0, r3)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            X.C1899593h.A0l(r8, r0, r6)
            android.hardware.camera2.CaptureRequest r0 = r8.build()
            r2.BnB(r0, r13, r7)
            goto L_0x00ec
        L_0x012a:
            X.9Ux r1 = r9.A07
            X.9Mw r0 = X.C194899Ux.A08
            boolean r0 = X.C194899Ux.A04(r0, r1)
            if (r0 == 0) goto L_0x00ec
            r3 = 4
            goto L_0x00fd
        L_0x0136:
            X.9Jv r15 = X.C192459Jv.MEDIUM
            boolean r15 = r0.equals(r15)
            if (r15 == 0) goto L_0x0143
            r15 = 3000000(0x2dc6c0, float:4.203895E-39)
            goto L_0x00b0
        L_0x0143:
            X.9Jv r15 = X.C192459Jv.LOW
            boolean r0 = r0.equals(r15)
            r15 = 1000000(0xf4240, float:1.401298E-39)
            if (r0 != 0) goto L_0x00b0
            goto L_0x00b2
        L_0x0150:
            r5.A02(r12)     // Catch:{ CameraAccessException -> 0x0154 }
            goto L_0x0164
        L_0x0154:
            r3 = move-exception
            java.lang.String r2 = "CameraInventory"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed to get info to calculate media rotation: "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r3)
            X.AnonymousClass9WT.A01(r2, r0)
        L_0x0164:
            X.96t r1 = r11.A04
            X.9Mx r0 = X.C195049Vr.A0L
            java.lang.Object r0 = r1.A08(r0)
            r0.getClass()
            X.9WQ r0 = r11.A03
            if (r0 == 0) goto L_0x0182
            X.96t r2 = r0.A09
            if (r2 == 0) goto L_0x0182
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.9Mx r0 = X.C195049Vr.A0I
            java.lang.Object r0 = r2.A08(r0)
            r1.equals(r0)
        L_0x0182:
            r0 = r18
            X.9VT r2 = r6.A01(r4, r0, r12)
            r11.A07 = r2
            r11.A07 = r2
            X.9N3 r1 = X.AnonymousClass9VT.A0N
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            r2.A02(r1, r0)
            X.9VT r0 = r11.A07
            return r0
        L_0x0198:
            java.lang.String r0 = "Cannot setup media recorder, trying to setup camera params without a StartupSettings."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x019f:
            java.lang.String r0 = "Cannot start recording video, camera is closed"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201549kJ.call():java.lang.Object");
    }

    public /* synthetic */ C201549kJ(CaptureRequest.Builder builder, C194559Tk r2, C193029Mr r3, AnonymousClass9SA r4, AnonymousClass9ZW r5, AnonymousClass9T4 r6, String str, int i, int i2, int i3, long j) {
        this.A07 = r4;
        this.A0A = str;
        this.A09 = r6;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A05 = r2;
        this.A06 = r3;
        this.A04 = builder;
        this.A08 = r5;
        this.A03 = j;
    }
}
