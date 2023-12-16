package X;

import android.graphics.Rect;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;

/* renamed from: X.9Vu  reason: invalid class name and case insensitive filesystem */
public class C195079Vu {
    public static final AnonymousClass9LK A0G = new AnonymousClass9LK();
    public CameraDevice A00;
    public C194549Tj A01;
    public AnonymousClass9WQ A02;
    public AnonymousClass9SA A03;
    public C195709Zf A04;
    public AnonymousClass9WO A05;
    public AnonymousClass96t A06;
    public C203589nz A07;
    public C194899Ux A08;
    public C203439nh A09;
    public boolean A0A;
    public final AnonymousClass9T1 A0B;
    public final AnonymousClass9LK A0C;
    public final AnonymousClass9TX A0D;
    public final C194959Vh A0E;
    public volatile boolean A0F;

    public C195079Vu(AnonymousClass9TX r3, C194959Vh r4) {
        AnonymousClass9LK r1 = A0G;
        this.A0E = r4;
        this.A0D = r3;
        this.A0B = new AnonymousClass9T1(r4);
        this.A0C = r1;
    }

    public static void A01(CaptureRequest.Builder builder, C195079Vu r9) {
        AnonymousClass9WO r1 = r9.A05;
        AnonymousClass9WO r12 = r9.A05;
        Rect rect = r12.A04;
        MeteringRectangle[] A052 = r12.A05(r12.A0D);
        AnonymousClass9WO r13 = r9.A05;
        MeteringRectangle[] A053 = r13.A05(r13.A0C);
        CaptureRequest.Builder builder2 = builder;
        AnonymousClass9WQ.A00(rect, builder2, r9.A08, A052, A053, r1.A03(r1.A02()) * 100.0f);
    }

    public void A02(AnonymousClass9SQ r4, Exception exc) {
        this.A0E.A05(new C199859hO(r4, exc), this.A0D.A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0062, code lost:
        if (r0 != 1) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        if (r0.A0C != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e6, code lost:
        if ((r1.A03(r1.A02()) * 100.0f) != 100.0f) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0136, code lost:
        if (r5 == null) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013c, code lost:
        if (r6 == null) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x021b, code lost:
        if ((r2.A03(r2.A02()) * 100.0f) != 100.0f) goto L_0x021d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0462  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x04e7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(android.hardware.camera2.CameraManager r23, android.hardware.camera2.CaptureRequest.Builder r24, X.AnonymousClass9SQ r25, X.C195079Vu r26, X.AnonymousClass9ZW r27, X.C203559nw r28, X.AnonymousClass9V5 r29, java.lang.Integer r30, int r31, int r32, int r33, boolean r34) {
        /*
            r10 = r26
            X.96t r1 = r10.A06
            r1.getClass()
            X.9Mx r0 = X.C195049Vr.A0e
            X.C195049Vr.A06(r0, r1)
            X.AnonymousClass9WT.A00()
            X.9T1 r12 = r10.A0B
            java.lang.String r0 = "Cannot capture photo, not prepared"
            r12.A00(r0)
            X.9WQ r0 = r10.A02
            r3 = 0
            if (r0 == 0) goto L_0x04f6
            boolean r0 = r0.A0Q
            if (r0 == 0) goto L_0x04f6
            X.9Vh r0 = r10.A0E
            r19 = r0
            X.9TX r0 = r10.A0D
            r18 = r0
            java.util.UUID r2 = r0.A03
            r22 = r25
            java.util.Objects.requireNonNull(r22)
            X.9fK r1 = new X.9fK
            r0 = r22
            r1.<init>(r0)
            r0 = r19
            r0.A05(r1, r2)
            X.9WQ r0 = r10.A02
            X.9T1 r1 = r0.A0H
            java.lang.String r0 = "Can only check if the prepared on the Optic thread"
            r1.A01(r0)
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0053
            if (r34 == 0) goto L_0x0053
            X.9WQ r0 = r10.A02
            r0.A07(r3)
            X.9WQ r0 = r10.A02
            r0.A03()
        L_0x0053:
            X.96t r1 = r10.A06
            X.9Mx r0 = X.C195049Vr.A0A
            int r0 = X.C195049Vr.A02(r0, r1)
            r2 = 2
            r8 = 1
            r13 = 1
            if (r0 == r2) goto L_0x0064
            r13 = 0
            r7 = 1
            if (r0 == r8) goto L_0x0065
        L_0x0064:
            r7 = 0
        L_0x0065:
            X.96t r1 = r10.A06
            X.9Mx r0 = X.C195049Vr.A0C
            int r0 = X.C195049Vr.A02(r0, r1)
            boolean r0 = X.AnonymousClass000.A1U(r0, r8)
            r11 = r24
            r9 = r27
            if (r13 != 0) goto L_0x0267
            if (r0 == 0) goto L_0x0082
            X.9Tj r0 = r10.A01
            r0.getClass()
            boolean r0 = r0.A0C
            if (r0 == 0) goto L_0x0267
        L_0x0082:
            r20 = r31
            r0 = r20
            if (r0 != r8) goto L_0x025f
            if (r7 == 0) goto L_0x0105
            X.9nz r1 = r10.A07
            if (r1 == 0) goto L_0x0105
            X.9Mv r0 = X.C203589nz.A0A
            boolean r0 = X.C1899593h.A1V(r0, r1)
            if (r0 == 0) goto L_0x0105
        L_0x0096:
            java.lang.String r0 = "Cannot run precapture sequence, not prepared"
            r12.A00(r0)
            if (r24 == 0) goto L_0x04e7
            X.96t r0 = r10.A06
            if (r0 == 0) goto L_0x04e7
            X.9Ux r0 = r10.A08
            if (r0 == 0) goto L_0x04e7
            X.9WQ r3 = r10.A02
            if (r3 == 0) goto L_0x04e7
            X.9WO r0 = r10.A05
            if (r0 == 0) goto L_0x04e7
            X.9T1 r1 = r3.A0H
            java.lang.String r0 = "Cannot get camera operations callback."
            r1.A00(r0)
            X.9ZW r4 = r3.A07
            X.96t r3 = r10.A06
            X.9Ux r1 = r10.A08
            r0 = 0
            X.AnonymousClass9U8.A01(r11, r3, r1, r0)
            X.96t r1 = r10.A06
            X.9Mx r0 = X.C195049Vr.A08
            int r0 = X.C195049Vr.A02(r0, r1)
            if (r0 == 0) goto L_0x00cf
            X.96t r1 = r10.A06
            X.9Ux r0 = r10.A08
            X.AnonymousClass9U8.A01(r11, r1, r0, r8)
        L_0x00cf:
            X.9WO r0 = r10.A05
            int r0 = r0.A04()
            if (r0 != 0) goto L_0x00e8
            X.9WO r1 = r10.A05
            float r0 = r1.A02()
            float r1 = r1.A03(r0)
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00eb
        L_0x00e8:
            A01(r11, r10)
        L_0x00eb:
            r4.getClass()
            r0 = 3
            r4.A0F = r0
            X.9T9 r3 = r4.A0E
            r0 = 3000(0xbb8, double:1.482E-320)
            r3.A02(r0)
            r0 = 4
            X.9pQ r3 = new X.9pQ
            r3.<init>(r11, r10, r4, r0)
            java.lang.String r1 = "run_precapture_sequence_on_camera_handler_thread"
            r0 = r19
            r0.A04(r1, r3)
        L_0x0105:
            java.lang.String r0 = "Cannot capture still picture, not prepared"
            r12.A00(r0)
            android.hardware.camera2.CameraDevice r0 = r10.A00
            r7 = 0
            if (r0 == 0) goto L_0x04dd
            X.96t r0 = r10.A06
            if (r0 == 0) goto L_0x04dd
            X.9nh r4 = r10.A09
            java.lang.String r0 = "Cannot get picture ImageReader, not prepared"
            r12.A00(r0)
            X.9nh r0 = r10.A09
            if (r0 == 0) goto L_0x025c
            android.view.Surface r6 = r0.BDP()
        L_0x0122:
            boolean r3 = r10.A0A
            X.9Zf r14 = r10.A04
            java.lang.String r0 = "Cannot get YUV picture ImageReader, not prepared"
            r12.A00(r0)
            X.9Zf r0 = r10.A04
            if (r0 == 0) goto L_0x0259
            android.view.Surface r5 = r0.BDP()
        L_0x0133:
            if (r14 == 0) goto L_0x0138
            r1 = 1
            if (r5 != 0) goto L_0x0139
        L_0x0138:
            r1 = 0
        L_0x0139:
            if (r4 == 0) goto L_0x013e
            r0 = 1
            if (r6 != 0) goto L_0x013f
        L_0x013e:
            r0 = 0
        L_0x013f:
            if (r3 == 0) goto L_0x023f
            if (r1 == 0) goto L_0x0241
        L_0x0143:
            r0 = 0
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            if (r3 != 0) goto L_0x023a
            r1.add(r6)
            r1.add(r0)
        L_0x0150:
            java.lang.String r0 = "Cannot create still capture builder, not prepared"
            r12.A00(r0)
            if (r24 == 0) goto L_0x04d6
            android.hardware.camera2.CameraDevice r5 = r10.A00
            if (r5 == 0) goto L_0x04d6
            X.9WO r0 = r10.A05
            if (r0 == 0) goto L_0x04d6
            X.96t r0 = r10.A06
            if (r0 == 0) goto L_0x04d6
            X.9WQ r0 = r10.A02
            if (r0 == 0) goto L_0x04d6
            X.9Ux r0 = r10.A08
            if (r0 == 0) goto L_0x04d6
            android.hardware.camera2.CaptureRequest$Builder r6 = r5.createCaptureRequest(r2)
            android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT
            java.lang.Integer r17 = java.lang.Integer.valueOf(r2)
            r0 = r17
            r6.set(r5, r0)
            android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            java.lang.Object r0 = r11.get(r5)
            r6.set(r5, r0)
            android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            java.lang.Object r0 = r11.get(r5)
            r6.set(r5, r0)
            android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS
            java.lang.Object r0 = r11.get(r5)
            r6.set(r5, r0)
            android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK
            java.lang.Object r0 = r11.get(r5)
            r6.set(r5, r0)
            android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS
            java.lang.Object r0 = r11.get(r5)
            r6.set(r5, r0)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.JPEG_ORIENTATION
            r5 = r32
            X.C1899593h.A0l(r6, r0, r5)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.JPEG_QUALITY
            if (r30 == 0) goto L_0x0236
            byte r5 = r30.byteValue()
        L_0x01b6:
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            r6.set(r0, r5)
            X.96t r5 = r10.A06
            X.9Ux r0 = r10.A08
            X.AnonymousClass9U8.A01(r6, r5, r0, r7)
            X.96t r13 = r10.A06
            X.9Ux r5 = r10.A08
            r0 = 3
            X.AnonymousClass9U8.A01(r6, r13, r5, r0)
            X.96t r13 = r10.A06
            X.9Ux r5 = r10.A08
            r0 = 4
            X.AnonymousClass9U8.A01(r6, r13, r5, r0)
            X.96t r13 = r10.A06
            X.9Ux r5 = r10.A08
            r0 = 7
            X.AnonymousClass9U8.A01(r6, r13, r5, r0)
            X.96t r5 = r10.A06
            X.9Ux r0 = r10.A08
            X.AnonymousClass9U8.A01(r6, r5, r0, r2)
            X.96t r5 = r10.A06
            X.9Ux r2 = r10.A08
            r0 = 6
            X.AnonymousClass9U8.A01(r6, r5, r2, r0)
            X.96t r5 = r10.A06
            X.9Ux r2 = r10.A08
            r0 = 5
            X.AnonymousClass9U8.A01(r6, r5, r2, r0)
            X.96t r2 = r10.A06
            X.9Mx r0 = X.C195049Vr.A08
            int r0 = X.C195049Vr.A02(r0, r2)
            if (r0 == 0) goto L_0x0204
            X.96t r2 = r10.A06
            X.9Ux r0 = r10.A08
            X.AnonymousClass9U8.A01(r11, r2, r0, r8)
        L_0x0204:
            X.9WO r0 = r10.A05
            int r0 = r0.A04()
            if (r0 != 0) goto L_0x021d
            X.9WO r2 = r10.A05
            float r0 = r2.A02()
            float r2 = r2.A03(r0)
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0220
        L_0x021d:
            A01(r6, r10)
        L_0x0220:
            java.util.Iterator r1 = r1.iterator()
        L_0x0224:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x029b
            java.lang.Object r0 = r1.next()
            android.view.Surface r0 = (android.view.Surface) r0
            if (r0 == 0) goto L_0x0224
            r6.addTarget(r0)
            goto L_0x0224
        L_0x0236:
            r5 = 90
            goto L_0x01b6
        L_0x023a:
            r1.add(r5)
            goto L_0x0150
        L_0x023f:
            if (r0 != 0) goto L_0x0143
        L_0x0241:
            r10.A0F = r7
            java.lang.Object[] r1 = new java.lang.Object[r8]
            if (r3 == 0) goto L_0x0256
            java.lang.String r0 = "YUV"
        L_0x0249:
            r1[r7] = r0
            java.lang.String r0 = "%s ImageReader not setup before taking picture."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0256:
            java.lang.String r0 = "JPEG"
            goto L_0x0249
        L_0x0259:
            r5 = 0
            goto L_0x0133
        L_0x025c:
            r6 = 0
            goto L_0x0122
        L_0x025f:
            if (r7 != 0) goto L_0x0096
            if (r13 == 0) goto L_0x0105
            if (r3 != 0) goto L_0x0105
            goto L_0x0096
        L_0x0267:
            X.9Tj r6 = r10.A01
            r6.getClass()
            X.9WQ r0 = r10.A02
            X.9ng r5 = r0.A08
            X.9T1 r1 = r6.A0A
            java.lang.String r0 = "Method lockFocusForCapture() must run on the Optic Background Thread."
            r1.A01(r0)
            if (r27 == 0) goto L_0x04ee
            r9.A0F = r2
            X.9T9 r4 = r9.A0E
            r0 = 300(0x12c, double:1.48E-321)
            r4.A02(r0)
            X.9Vh r4 = r6.A0B
            X.9kF r1 = new X.9kF
            r1.<init>(r11, r6, r9, r5)
            java.lang.String r0 = "lock_focus_for_capture_on_camera_handler_thread"
            r4.A04(r0, r1)
            java.lang.Integer r0 = r9.A0B
            if (r0 == 0) goto L_0x0082
            int r0 = r0.intValue()
            if (r0 != r2) goto L_0x0082
            r3 = 1
            goto L_0x0082
        L_0x029b:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x02a8
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_ENABLE_ZSL
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.set(r1, r0)
        L_0x02a8:
            X.9Ux r1 = r10.A08
            X.9Mw r0 = X.C194899Ux.A0J
            boolean r0 = X.C194899Ux.A04(r0, r1)
            if (r0 == 0) goto L_0x02b9
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.NOISE_REDUCTION_MODE
            r0 = r17
            r6.set(r1, r0)
        L_0x02b9:
            X.9Ux r1 = r10.A08
            X.9Mw r0 = X.C194899Ux.A0B
            r1.A05(r0)
            if (r3 != 0) goto L_0x04d0
            r4.getClass()
        L_0x02c5:
            boolean r1 = r4 instanceof X.C195709Zf
            X.9ZV r0 = new X.9ZV
            r0.<init>(r1)
            r1 = r19
            android.os.Handler r2 = r1.A02
            X.9Qe r1 = r0.A04
            r4.BhJ(r2, r1)
            r1 = 3
            X.9pQ r3 = new X.9pQ
            r3.<init>(r0, r10, r6, r1)
            java.lang.String r2 = "capture_still_picture_on_camera_handler_thread"
            r1 = r19
            java.lang.Object r13 = r1.A04(r2, r3)
            X.9Uq r13 = (X.C194829Uq) r13
            r10.A0F = r7
            byte[] r5 = r13.A04
            X.9S8 r1 = r13.A01
            r16 = r1
            r21 = r29
            if (r5 == 0) goto L_0x02f4
            int r1 = r5.length
            if (r1 != 0) goto L_0x038d
        L_0x02f4:
            if (r16 != 0) goto L_0x038d
            java.lang.String r1 = "Image data was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            X.AnonymousClass9WT.A00()
            java.lang.String r0 = "Photo capture returned empty image data."
            X.9ka r1 = new X.9ka
            r1.<init>(r0)
            r0 = r22
            r10.A02(r0, r1)
        L_0x030c:
            X.9N0 r1 = X.AnonymousClass9V5.A03
            r0 = r21
            boolean r0 = X.AnonymousClass9V5.A00(r1, r0)
            if (r0 == 0) goto L_0x038c
            java.lang.String r0 = "Cannot restore preview post capture, not prepared"
            r12.A00(r0)
            if (r28 == 0) goto L_0x038c
            X.9WQ r1 = r10.A02
            if (r1 == 0) goto L_0x038c
            X.9Ux r0 = r10.A08
            if (r0 == 0) goto L_0x038c
            X.96t r0 = r10.A06
            if (r0 == 0) goto L_0x038c
            X.9WO r0 = r10.A05
            if (r0 == 0) goto L_0x038c
            X.9ng r3 = r1.A08
            if (r3 == 0) goto L_0x038c
            if (r34 == 0) goto L_0x0336
            r1.A07(r8)
        L_0x0336:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            r0 = r17
            r11.set(r1, r0)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER
            r11.set(r1, r0)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            r4 = 0
            X.C1899593h.A0l(r11, r0, r4)
            A01(r11, r10)
            android.hardware.camera2.CameraDevice r0 = r10.A00
            r0.getClass()
            java.lang.String r16 = r0.getId()
            X.96t r1 = r10.A06
            X.9Ux r0 = r10.A08
            r12 = r23
            r13 = r11
            r14 = r1
            r15 = r0
            r17 = r4
            X.AnonymousClass9U8.A00(r12, r13, r14, r15, r16, r17)
            if (r27 == 0) goto L_0x0373
            X.9WQ r0 = r10.A02
            X.9lt r0 = r0.A0J
            r9.A0F = r8
            r9.A08 = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9.A0A = r0
            r0 = 0
            r9.A03 = r0
        L_0x0373:
            android.hardware.camera2.CaptureRequest r0 = r11.build()
            r2 = 0
            r3.Ayh(r0, r2, r2)
            r3.BnB(r0, r2, r9)
            X.96t r1 = r10.A06
            X.9Ux r0 = r10.A08
            X.AnonymousClass9U8.A01(r11, r1, r0, r4)
            android.hardware.camera2.CaptureRequest r0 = r11.build()
            r3.BnB(r0, r2, r9)
        L_0x038c:
            return
        L_0x038d:
            java.lang.Integer r2 = r13.A03
            if (r2 == 0) goto L_0x04bc
            java.lang.Integer r1 = r13.A02
            if (r1 == 0) goto L_0x04bc
            int r3 = r2.intValue()
            int r1 = r1.intValue()
        L_0x039d:
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>(r7, r7, r3, r1)
            X.96t r2 = r10.A06
            X.9Mx r1 = X.C195049Vr.A0m
            java.lang.Object r4 = X.C195049Vr.A04(r1, r2)
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            java.lang.Long r3 = r0.A00
            X.9Qt r0 = r0.A01
            int r1 = r0.A00
            int r1 = r1 + 3
            int r1 = r1 + -1
            int r1 = r1 % 3
            X.9VM[] r0 = r0.A01
            r2 = r0[r1]
            if (r2 == 0) goto L_0x04b6
            boolean r0 = r10.A0A
            if (r0 == 0) goto L_0x04b3
            X.9Mz r0 = X.AnonymousClass9VM.A0T
            java.lang.Object r0 = r2.A00(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L_0x03d4
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.JPEG_ORIENTATION
            java.lang.Object r0 = r6.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
        L_0x03d4:
            if (r3 != 0) goto L_0x03dc
            X.9Mz r1 = X.AnonymousClass9VM.A0K
            java.lang.Object r3 = r2.A00(r1)
        L_0x03dc:
            if (r0 == 0) goto L_0x04b6
            int r15 = r0.intValue()
        L_0x03e2:
            r0 = r33
            X.AnonymousClass9LL.A00(r14, r4, r0, r15)
            X.9St r1 = new X.9St
            r0 = r20
            r1.<init>(r14, r4, r7, r0)
            X.9N2 r7 = X.AnonymousClass9VN.A0d
            X.9N0 r4 = X.AnonymousClass9V5.A04
            r0 = r21
            java.lang.Object r0 = r0.A01(r4)
            r1.A01(r7, r0)
            X.9N2 r0 = X.AnonymousClass9VN.A0T
            r1.A01(r0, r3)
            int r3 = r13.A00
            r0 = 35
            if (r3 != r0) goto L_0x04ac
            X.9N2 r3 = X.AnonymousClass9VN.A0Y
            r0 = r16
            r1.A01(r3, r0)
        L_0x040d:
            if (r2 == 0) goto L_0x045e
            X.9N2 r3 = X.AnonymousClass9VN.A0Z
            X.9Mz r0 = X.AnonymousClass9VM.A0R
            java.lang.Object r0 = r2.A00(r0)
            r1.A01(r3, r0)
            X.9N2 r3 = X.AnonymousClass9VN.A0O
            X.9Mz r0 = X.AnonymousClass9VM.A0F
            java.lang.Object r0 = r2.A00(r0)
            r1.A01(r3, r0)
            X.9N2 r3 = X.AnonymousClass9VN.A0V
            X.9Mz r0 = X.AnonymousClass9VM.A0M
            java.lang.Object r0 = r2.A00(r0)
            r1.A01(r3, r0)
            X.9N2 r3 = X.AnonymousClass9VN.A0P
            X.9Mz r0 = X.AnonymousClass9VM.A0G
            java.lang.Object r0 = r2.A00(r0)
            r1.A01(r3, r0)
            X.9N2 r3 = X.AnonymousClass9VN.A0S
            X.9Mz r0 = X.AnonymousClass9VM.A0J
            java.lang.Object r0 = r2.A00(r0)
            r1.A01(r3, r0)
            X.9N2 r3 = X.AnonymousClass9VN.A0U
            X.9Mz r0 = X.AnonymousClass9VM.A0L
            java.lang.Object r0 = r2.A00(r0)
            r1.A01(r3, r0)
            boolean r0 = r10.A0A
            if (r0 == 0) goto L_0x045e
            X.9N2 r2 = X.AnonymousClass9VN.A0a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r1.A01(r2, r0)
        L_0x045e:
            X.9WO r0 = r10.A05
            if (r0 == 0) goto L_0x046f
            X.9N2 r2 = X.AnonymousClass9VN.A0e
            int r0 = r0.A04()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01(r2, r0)
        L_0x046f:
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            java.lang.Object r0 = r6.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            X.9N2 r2 = X.AnonymousClass9VN.A0c
            if (r0 == 0) goto L_0x04aa
            int r0 = r0.intValue()
            int r0 = X.C195239Wt.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0487:
            r1.A01(r2, r0)
            r14.width()
            r14.height()
            X.AnonymousClass9WT.A00()
            X.9VN r3 = new X.9VN
            r3.<init>(r1)
            r0 = r18
            java.util.UUID r2 = r0.A03
            X.9hN r1 = new X.9hN
            r0 = r22
            r1.<init>(r0, r3)
            r0 = r19
            r0.A05(r1, r2)
            goto L_0x030c
        L_0x04aa:
            r0 = 0
            goto L_0x0487
        L_0x04ac:
            X.9N2 r0 = X.AnonymousClass9VN.A0X
            r1.A01(r0, r5)
            goto L_0x040d
        L_0x04b3:
            r0 = 0
            goto L_0x03d4
        L_0x04b6:
            int r15 = X.AnonymousClass9U9.A00(r5)
            goto L_0x03e2
        L_0x04bc:
            r5.getClass()
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r2.inJustDecodeBounds = r8
            int r1 = r5.length
            android.graphics.BitmapFactory.decodeByteArray(r5, r7, r1, r2)
            int r3 = r2.outWidth
            int r1 = r2.outHeight
            goto L_0x039d
        L_0x04d0:
            r4 = r14
            r14.getClass()
            goto L_0x02c5
        L_0x04d6:
            java.lang.String r0 = "Trying to create capture settings after camera closed."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x04dd:
            r10.A0F = r7
            java.lang.String r1 = "Camera must be opened to capture still picture."
            X.9ka r0 = new X.9ka
            r0.<init>(r1)
            throw r0
        L_0x04e7:
            java.lang.String r0 = "Preview closed while processing capture request."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x04ee:
            java.lang.String r1 = "Preview closed while processing capture request."
            X.9ka r0 = new X.9ka
            r0.<init>(r1)
            throw r0
        L_0x04f6:
            r10.A0F = r3
            java.lang.String r0 = "Preview closed while processing capture request."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195079Vu.A00(android.hardware.camera2.CameraManager, android.hardware.camera2.CaptureRequest$Builder, X.9SQ, X.9Vu, X.9ZW, X.9nw, X.9V5, java.lang.Integer, int, int, int, boolean):void");
    }
}
