package X;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9WQ  reason: invalid class name */
public class AnonymousClass9WQ {
    public static final Object A0S = AnonymousClass002.A0D();
    public CameraCharacteristics A00;
    public CameraDevice A01;
    public CaptureRequest.Builder A02;
    public Surface A03;
    public Surface A04;
    public Surface A05;
    public AnonymousClass9S3 A06;
    public AnonymousClass9ZW A07;
    public C203429ng A08;
    public AnonymousClass96t A09;
    public AnonymousClass96u A0A;
    public C203559nw A0B;
    public C203589nz A0C;
    public C194899Ux A0D;
    public boolean A0E;
    public MeteringRectangle[] A0F;
    public MeteringRectangle[] A0G;
    public final AnonymousClass9T1 A0H;
    public final C202359lt A0I = new C195159Wi(this, 1);
    public final C202359lt A0J = new C195159Wi(this, 0);
    public final C195739Zi A0K = new C195739Zi(new AnonymousClass9Mu(this));
    public final C194439Sw A0L = new C194439Sw();
    public final C194439Sw A0M = new C194439Sw();
    public final C194959Vh A0N;
    public final List A0O = AnonymousClass001.A0s();
    public volatile AnonymousClass9KV A0P;
    public volatile boolean A0Q;
    public volatile boolean A0R;

    public static boolean A01(List list, int[] iArr) {
        if (!(list == null || iArr == null || (iArr[0] == 0 && iArr[1] == 0))) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int[] iArr2 = (int[]) it.next();
                if (iArr2[0] == iArr[0] && iArr2[1] == iArr[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void A00(Rect rect, CaptureRequest.Builder builder, C194899Ux r4, MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, float f) {
        if (Build.VERSION.SDK_INT >= 30 && C194899Ux.A04(C194899Ux.A0I, r4)) {
            builder.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(f / 100.0f));
        } else if (C194899Ux.A04(C194899Ux.A0W, r4)) {
            builder.set(CaptureRequest.SCALER_CROP_REGION, rect);
        }
        if (C194899Ux.A04(C194899Ux.A0O, r4)) {
            builder.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        if (C194899Ux.A04(C194899Ux.A0P, r4)) {
            builder.set(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        if (java.lang.Boolean.TRUE.equals(r6.A08(X.C195049Vr.A0I)) == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        if (r11 != 0) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cf, code lost:
        if (r0 == false) goto L_0x00d1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C203429ng A02(X.C202359lt r13, boolean r14, boolean r15) {
        /*
            r12 = this;
            X.9T1 r9 = r12.A0H
            java.lang.String r0 = "Cannot start preview."
            r9.A00(r0)
            X.9ZW r1 = r12.A07
            r1.getClass()
            r0 = 1
            r1.A0F = r0
            r1.A08 = r13
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A0A = r0
            r0 = 0
            r1.A03 = r0
            X.9ng r0 = r12.A08
            if (r0 == 0) goto L_0x001f
            r0.close()
        L_0x001f:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            r2 = 0
            if (r1 < r0) goto L_0x00f7
            X.96t r0 = r12.A09
            if (r0 == 0) goto L_0x00f7
            X.9Mx r1 = X.C195049Vr.A0r
            java.lang.Object r0 = r0.A08(r1)
            if (r0 == 0) goto L_0x00f7
            X.96t r0 = r12.A09
            java.lang.Object r0 = X.C195049Vr.A04(r1, r0)
            long r0 = X.C18310x6.A0B(r0)
        L_0x003d:
            X.96t r6 = r12.A09
            if (r6 == 0) goto L_0x0050
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            X.9Mx r4 = X.C195049Vr.A0I
            java.lang.Object r4 = r6.A08(r4)
            boolean r4 = r5.equals(r4)
            r11 = 1
            if (r4 != 0) goto L_0x0051
        L_0x0050:
            r11 = 0
        L_0x0051:
            r6 = 1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0059
            r8 = 0
            if (r11 == 0) goto L_0x005a
        L_0x0059:
            r8 = 1
        L_0x005a:
            java.lang.String r4 = "Cannot get output surfaces."
            r9.A00(r4)
            X.9S3 r10 = r12.A06
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            android.view.Surface r5 = r12.A04
            if (r5 == 0) goto L_0x0071
            X.9Or r4 = new X.9Or
            r4.<init>(r5, r11, r0)
            r7.add(r4)
        L_0x0071:
            r4 = 0
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 == 0) goto L_0x0085
            X.9nz r1 = r12.A0C
            if (r1 == 0) goto L_0x0085
            X.9Mv r0 = X.C203589nz.A0O
            boolean r0 = X.C1899593h.A1V(r0, r1)
            if (r0 == 0) goto L_0x0085
            r4 = 2
        L_0x0085:
            if (r14 == 0) goto L_0x00a6
            if (r10 == 0) goto L_0x00a6
            android.media.ImageReader r0 = r10.A01
            if (r0 == 0) goto L_0x0102
            android.view.Surface r0 = r0.getSurface()
            if (r0 == 0) goto L_0x00a6
            X.9S3 r0 = r12.A06
            android.media.ImageReader r0 = r0.A01
            if (r0 == 0) goto L_0x00fb
            android.view.Surface r10 = r0.getSurface()
            r1 = 0
            X.9Or r0 = new X.9Or
            r0.<init>(r10, r1, r2)
            r7.add(r0)
        L_0x00a6:
            android.view.Surface r10 = r12.A05
            if (r10 != 0) goto L_0x00ae
            android.view.Surface r10 = r12.A03
            if (r10 == 0) goto L_0x00b7
        L_0x00ae:
            r1 = 0
            X.9Or r0 = new X.9Or
            r0.<init>(r10, r1, r4)
            r7.add(r0)
        L_0x00b7:
            java.lang.String r5 = "start_preview_on_camera_handler_thread"
            java.lang.String r0 = "Method createCaptureSession must be called on Optic Thread"
            r9.A01(r0)
            X.96t r4 = r12.A09
            if (r4 == 0) goto L_0x00d1
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.9Mx r0 = X.C195049Vr.A0U
            java.lang.Object r0 = r4.A08(r0)
            boolean r0 = r1.equals(r0)
            r4 = 1
            if (r0 != 0) goto L_0x00d2
        L_0x00d1:
            r4 = 0
        L_0x00d2:
            X.9Zi r0 = r12.A0K
            r0.A03 = r6
            X.9T9 r0 = r0.A02
            r0.A02(r2)
            X.9Vh r1 = r12.A0N
            X.9kG r0 = new X.9kG
            r0.<init>(r12, r7, r4, r8)
            java.lang.Object r0 = r1.A04(r5, r0)
            X.9ng r0 = (X.C203429ng) r0
            r12.A08 = r0
            r12.A07(r14)
            java.lang.String r0 = "Preview session was closed while starting preview"
            r12.A08(r15, r0)
            r12.A0Q = r6
            X.9ng r0 = r12.A08
            return r0
        L_0x00f7:
            r0 = 0
            goto L_0x003d
        L_0x00fb:
            java.lang.String r0 = "Getting image reader surface without initialize."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0102:
            java.lang.String r0 = "Getting image reader surface without initialize."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9WQ.A02(X.9lt, boolean, boolean):X.9ng");
    }

    public void A03() {
        this.A0H.A00("Cannot refresh camera preview.");
        try {
            A08(false, (String) null);
        } catch (Exception unused) {
        }
    }

    public void A04() {
        C193039Ms r1;
        this.A0H.A00("Cannot update frame metadata collection.");
        AnonymousClass96t r12 = this.A09;
        if (r12 != null && this.A06 != null && this.A07 != null) {
            boolean A072 = C195049Vr.A07(C195049Vr.A0R, r12);
            AnonymousClass9ZW r2 = this.A07;
            if (A072) {
                r1 = this.A06.A07;
                if (r2.A06 == null) {
                    r2.A06 = new C193929Qt();
                }
            } else {
                r1 = null;
            }
            r2.A0I = A072;
            r2.A04 = r1;
        }
    }

    public void A05(Rect rect, MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, float f) {
        CaptureRequest.Builder builder;
        C194899Ux r2;
        AnonymousClass9T1 r1 = this.A0H;
        r1.A01("Can only apply zoom on the Optic thread");
        r1.A01("Can only check if the prepared on the Optic thread");
        if (r1.A00 && (builder = this.A02) != null && (r2 = this.A0D) != null) {
            A00(rect, builder, r2, meteringRectangleArr, meteringRectangleArr2, f);
            if (this.A0Q) {
                A03();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01d1, code lost:
        if (X.C194899Ux.A04(X.C194899Ux.A0L, r1) != false) goto L_0x00fe;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0226  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.graphics.SurfaceTexture r9, X.C192999Mo r10) {
        /*
            r8 = this;
            X.9nw r0 = r8.A0B
            r0.getClass()
            android.view.Surface r3 = new android.view.Surface
            r3.<init>(r9)
            X.9nw r0 = r8.A0B
            r0.getClass()
            r2 = 1
            X.9T1 r1 = r8.A0H
            java.lang.String r0 = "Cannot configure camera preview."
            r1.A00(r0)
            r8.A04 = r3
            r8.A0E = r2
            android.hardware.camera2.CameraDevice r1 = r8.A01
            r1.getClass()
            X.9nw r0 = r8.A0B
            r0.getClass()
            android.hardware.camera2.CaptureRequest$Builder r1 = r1.createCaptureRequest(r2)
            r8.A02 = r1
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS
            java.lang.Object r0 = r1.get(r0)
            android.hardware.camera2.params.MeteringRectangle[] r0 = (android.hardware.camera2.params.MeteringRectangle[]) r0
            r8.A0G = r0
            android.hardware.camera2.CaptureRequest$Builder r1 = r8.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS
            java.lang.Object r0 = r1.get(r0)
            android.hardware.camera2.params.MeteringRectangle[] r0 = (android.hardware.camera2.params.MeteringRectangle[]) r0
            r8.A0F = r0
            r7 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            android.hardware.camera2.CaptureRequest$Builder r1 = r8.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT
            r6 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.set(r0, r3)
            android.hardware.camera2.CaptureRequest$Builder r1 = r8.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r1.set(r0, r3)
            X.9nz r1 = r8.A0C
            r1.getClass()
            X.9Mv r0 = X.C203589nz.A05
            boolean r0 = X.C1899593h.A1V(r0, r1)
            r5 = 0
            if (r0 != 0) goto L_0x006e
            android.hardware.camera2.CaptureRequest$Builder r1 = r8.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            X.C1899593h.A0l(r1, r0, r5)
        L_0x006e:
            android.hardware.camera2.CaptureRequest$Builder r2 = r8.A02
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.set(r1, r0)
            android.hardware.camera2.CaptureRequest$Builder r1 = r8.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r1.set(r0, r2)
            X.96u r0 = r8.A0A
            if (r0 == 0) goto L_0x009f
            r5 = 4
            boolean r0 = r8.A0A(r5)
            if (r0 == 0) goto L_0x01f3
            X.96u r1 = r8.A0A
            X.9Mx r0 = X.C195049Vr.A0C
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            X.AnonymousClass96u.A00(r1, r0, r5)
            android.hardware.camera2.CaptureRequest$Builder r1 = r8.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            r1.set(r0, r5)
        L_0x009f:
            android.hardware.camera2.CaptureRequest$Builder r0 = r8.A02
            if (r0 == 0) goto L_0x022d
            X.96u r0 = r8.A0A
            if (r0 == 0) goto L_0x022d
            X.9Ux r1 = r8.A0D
            if (r1 == 0) goto L_0x00c3
            X.9Mw r0 = X.C194899Ux.A0K
            boolean r0 = X.C194899Ux.A04(r0, r1)
            if (r0 == 0) goto L_0x00c3
            android.hardware.camera2.CaptureRequest$Builder r1 = r8.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE
            r1.set(r0, r3)
            X.96u r5 = r8.A0A
            X.9Mx r1 = X.C195049Vr.A0V
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            X.AnonymousClass96u.A00(r5, r1, r0)
        L_0x00c3:
            X.9Ux r1 = r8.A0D
            if (r1 == 0) goto L_0x00df
            X.9Mw r0 = X.C194899Ux.A0T
            boolean r0 = X.C194899Ux.A04(r0, r1)
            if (r0 == 0) goto L_0x00df
            android.hardware.camera2.CaptureRequest$Builder r1 = r8.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            r1.set(r0, r2)
            X.96u r5 = r8.A0A
            X.9Mx r1 = X.C195049Vr.A0X
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            X.AnonymousClass96u.A00(r5, r1, r0)
        L_0x00df:
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 2
            r0 = 33
            if (r1 < r0) goto L_0x01d5
            X.9Ux r1 = r8.A0D
            if (r1 == 0) goto L_0x01bb
            X.9Mw r0 = X.C194899Ux.A0L
            boolean r0 = X.C194899Ux.A04(r0, r1)
            if (r0 == 0) goto L_0x01bb
            X.9nz r1 = r8.A0C
            if (r1 == 0) goto L_0x01bb
            X.9Mv r0 = X.C203589nz.A08
            boolean r0 = X.C1899593h.A1V(r0, r1)
            if (r0 == 0) goto L_0x01bb
        L_0x00fe:
            android.hardware.camera2.CaptureRequest$Builder r1 = r8.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
        L_0x0106:
            r1.set(r0, r3)
            X.96u r3 = r8.A0A
            X.9Mx r1 = X.C195049Vr.A0W
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            X.AnonymousClass96u.A00(r3, r1, r0)
        L_0x0112:
            android.hardware.camera2.CaptureRequest$Builder r0 = r8.A02
            if (r0 == 0) goto L_0x0226
            X.9Ux r0 = r8.A0D
            if (r0 == 0) goto L_0x0226
            X.96u r0 = r8.A0A
            if (r0 == 0) goto L_0x0226
            X.9nz r1 = r8.A0C
            r1.getClass()
            X.9Mv r0 = X.C203589nz.A09
            java.lang.Object r3 = r1.B3x(r0)
            X.9QR r3 = (X.AnonymousClass9QR) r3
            X.9Ux r1 = r8.A0D
            X.9Mw r0 = X.C194899Ux.A0p
            java.util.List r0 = X.C194899Ux.A03(r0, r1)
            int[] r3 = r3.A00(r0)
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x0157
            X.96u r1 = r8.A0A
            X.9Mx r0 = X.C195049Vr.A0k
            X.AnonymousClass96u.A00(r1, r0, r3)
            X.9Ux r1 = r8.A0D
            X.9Mw r0 = X.C194899Ux.A0d
            boolean r0 = X.C194899Ux.A04(r0, r1)
            android.util.Range r3 = X.C1899693i.A05(r3, r0)
            android.hardware.camera2.CaptureRequest$Builder r1 = r8.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE
            r1.set(r0, r3)
        L_0x0157:
            android.hardware.camera2.CaptureRequest$Builder r0 = r8.A02
            if (r0 == 0) goto L_0x021f
            X.9Ux r1 = r8.A0D
            if (r1 == 0) goto L_0x021f
            X.96t r0 = r8.A09
            if (r0 == 0) goto L_0x021f
            X.9Mw r0 = X.C194899Ux.A0B
            boolean r0 = X.C194899Ux.A04(r0, r1)
            if (r0 == 0) goto L_0x0172
            X.96t r1 = r8.A09
            X.9Mx r0 = X.C195049Vr.A0i
            r1.A08(r0)
        L_0x0172:
            android.hardware.camera2.CaptureRequest$Builder r1 = r8.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            r1.set(r0, r2)
            X.9Ux r1 = r8.A0D
            r1.getClass()
            X.9Mw r0 = X.C194899Ux.A0J
            boolean r0 = X.C194899Ux.A04(r0, r1)
            if (r0 == 0) goto L_0x018d
            android.hardware.camera2.CaptureRequest$Builder r1 = r8.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.NOISE_REDUCTION_MODE
            X.C1899593h.A0l(r1, r0, r5)
        L_0x018d:
            X.96t r2 = r8.A09
            if (r2 == 0) goto L_0x01a9
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.9Mx r0 = X.C195049Vr.A0I
            java.lang.Object r0 = r2.A08(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01a9
            android.hardware.camera2.CaptureRequest$Builder r1 = r8.A02
            r1.getClass()
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT
            r1.set(r0, r4)
        L_0x01a9:
            android.hardware.camera2.CaptureRequest$Builder r1 = r8.A02
            android.view.Surface r0 = r8.A04
            r1.addTarget(r0)
            X.9ZW r0 = r8.A07
            r0.getClass()
            r0.A01 = r10
            r8.A04()
            return
        L_0x01bb:
            X.9nz r1 = r8.A0C
            if (r1 == 0) goto L_0x01d5
            X.9Mv r0 = X.C203589nz.A07
            boolean r0 = X.C1899593h.A1V(r0, r1)
            if (r0 == 0) goto L_0x01d5
            X.9Ux r1 = r8.A0D
            if (r1 == 0) goto L_0x0112
            X.9Mw r0 = X.C194899Ux.A0L
            boolean r0 = X.C194899Ux.A04(r0, r1)
            if (r0 == 0) goto L_0x0112
            goto L_0x00fe
        L_0x01d5:
            X.9Ux r1 = r8.A0D
            if (r1 == 0) goto L_0x0112
            X.9Mw r0 = X.C194899Ux.A0M
            boolean r0 = X.C194899Ux.A04(r0, r1)
            if (r0 == 0) goto L_0x0112
            X.9nz r1 = r8.A0C
            if (r1 == 0) goto L_0x0112
            X.9Mv r0 = X.C203589nz.A06
            boolean r0 = X.C1899593h.A1V(r0, r1)
            if (r0 == 0) goto L_0x0112
            android.hardware.camera2.CaptureRequest$Builder r1 = r8.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            goto L_0x0106
        L_0x01f3:
            boolean r0 = r8.A0A(r7)
            if (r0 == 0) goto L_0x0209
            X.96u r1 = r8.A0A
            X.9Mx r0 = X.C195049Vr.A0C
            X.AnonymousClass96u.A00(r1, r0, r4)
            android.hardware.camera2.CaptureRequest$Builder r1 = r8.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            r1.set(r0, r4)
            goto L_0x009f
        L_0x0209:
            boolean r0 = r8.A0A(r6)
            if (r0 == 0) goto L_0x009f
            X.96u r1 = r8.A0A
            X.9Mx r0 = X.C195049Vr.A0C
            X.AnonymousClass96u.A00(r1, r0, r3)
            android.hardware.camera2.CaptureRequest$Builder r1 = r8.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            r1.set(r0, r3)
            goto L_0x009f
        L_0x021f:
            java.lang.String r0 = "Cannot initialize custom capture settings, preview closed."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0226:
            java.lang.String r0 = "Cannot initialize fps settings, preview closed."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x022d:
            java.lang.String r0 = "Cannot initialize stabilization settings, preview closed."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9WQ.A06(android.graphics.SurfaceTexture, X.9Mo):void");
    }

    public void A07(boolean z) {
        this.A0H.A00("Cannot update preview builder for CPU frames.");
        AnonymousClass9S3 r0 = this.A06;
        CaptureRequest.Builder builder = this.A02;
        if (builder != null && r0 != null) {
            ImageReader imageReader = r0.A01;
            if (imageReader != null) {
                Surface surface = imageReader.getSurface();
                surface.getClass();
                if (z) {
                    builder.addTarget(surface);
                    this.A0R = true;
                    return;
                }
                builder.removeTarget(surface);
                this.A0R = false;
                return;
            }
            throw AnonymousClass001.A0e("Getting image reader surface without initialize.");
        }
    }

    public void A08(boolean z, String str) {
        CaptureRequest.Builder builder;
        this.A0H.A01("Method updatePreviewView must be invoked in the Optic background thread");
        synchronized (A0S) {
            C203429ng r3 = this.A08;
            if (r3 != null && (builder = this.A02) != null) {
                r3.BnB(builder.build(), (Handler) null, this.A07);
            } else if (z) {
                if (str == null) {
                    str = "Trying to update preview view while preview is closed";
                }
                throw new C201699ka(str);
            }
        }
    }

    public void A09(boolean z, boolean z2) {
        C202359lt r1;
        AnonymousClass9T1 r12 = this.A0H;
        r12.A01("Method restartPreview() must run on the Optic Background Thread.");
        if (this.A07 != null) {
            r12.A01("Can only check if the prepared on the Optic thread");
            if (r12.A00) {
                AnonymousClass9ZW r13 = this.A07;
                if (!r13.A0H || r13.A0F != 1) {
                    if (z2) {
                        r1 = this.A0J;
                    } else {
                        r1 = this.A0I;
                    }
                    this.A08 = A02(r1, z, false);
                    return;
                }
                this.A0O.add(new AnonymousClass9O1(z, z2));
            }
        }
    }

    public final boolean A0A(int i) {
        CameraCharacteristics cameraCharacteristics = this.A00;
        cameraCharacteristics.getClass();
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public AnonymousClass9WQ(C194959Vh r3) {
        this.A0N = r3;
        this.A0H = new AnonymousClass9T1(r3);
    }
}
