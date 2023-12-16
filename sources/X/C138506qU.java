package X;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.os.Handler;
import com.whatsapp.calling.screenshare.ScreenShareLoggingHelper$updateFrameCountAndTotalDuration$1;
import com.whatsapp.calling.screenshare.ScreenShareResourceManager;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.camera.VoipCamera;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* renamed from: X.6qU  reason: invalid class name and case insensitive filesystem */
public final class C138506qU extends VoipPhysicalCamera {
    public VirtualDisplay A00;
    public Image A01;
    public ImageReader A02;
    public C158497k4 A03;
    public VoipPhysicalCamera.CameraInfo A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final MediaProjection A08;
    public final AnonymousClass49P A09;
    public final AnonymousClass4MA A0A;
    public final AnonymousClass5TU A0B;
    public final ScreenShareResourceManager A0C;
    public final C73853gB A0D;
    public final C73853gB A0E;

    public void onScreenShareInfoChanged(C158497k4 r4) {
        String A0P;
        C162457s7.A0J(r4, 0);
        if (!this.A06) {
            C626936e.A0D(false, "ScreenShareCaptureDevice Screen sharing not active, change ignored");
            return;
        }
        if (C162457s7.A0P(this.A03, r4)) {
            A0P = "ScreenShareCaptureDevice No change, skipping screen capture recreate";
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("ScreenShareCaptureDevice/onScreenShareInfoChanged -- w: ");
            A0o.append(r4.A02);
            A0o.append(", h: ");
            C18260x0.A1G(A0o, r4.A01);
            Number number = (Number) syncRunOnCameraThread(new AnonymousClass91I(this, 1, r4), -100);
            if (number == null || number.intValue() != 0) {
                A0P = AnonymousClass000.A0P(number, "ScreenShareCaptureDevice Failed to recreate screen capture: ", AnonymousClass001.A0o());
            } else {
                return;
            }
        }
        Log.d(A0P);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138506qU(Context context, MediaProjection mediaProjection, AnonymousClass49P r12, C158497k4 r13, AnonymousClass5TU r14, ScreenShareResourceManager screenShareResourceManager, AnonymousClass1VX r16, C187958y5 r17, C73853gB r18, C73853gB r19, int i, int i2, int i3) {
        super(context, r16, r17, (AnonymousClass7UJ) null);
        C73853gB r1 = r19;
        C162457s7.A0J(r1, 13);
        this.A09 = r12;
        this.A08 = mediaProjection;
        this.A03 = r13;
        this.A0B = r14;
        this.A0C = screenShareResourceManager;
        this.A0D = r18;
        this.A0E = r1;
        this.A0A = new AnonymousClass4MA(context, this);
        C158497k4 r0 = this.A03;
        int i4 = r0.A02;
        int i5 = r0.A01;
        VoipPhysicalCamera.CameraInfo cameraInfo = new VoipPhysicalCamera.CameraInfo(i4, i5, i2, i3, false, 0, i);
        this.A04 = cameraInfo;
        ImageReader newInstance = ImageReader.newInstance(i4, i5, cameraInfo.format, 3);
        C162457s7.A0D(newInstance);
        newInstance.setOnImageAvailableListener(new AnonymousClass90K(this, 0), this.cameraThreadHandler);
        this.A02 = newInstance;
        screenShareResourceManager.setMediaProjectionHandle(mediaProjection);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r1 != r2.A01) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00() {
        /*
            r10 = this;
            android.hardware.display.VirtualDisplay r3 = r10.A00
            android.media.ImageReader r0 = r10.A02
            int r1 = r0.getWidth()
            X.7k4 r2 = r10.A03
            int r0 = r2.A02
            if (r1 != r0) goto L_0x001a
            android.media.ImageReader r0 = r10.A02
            int r1 = r0.getHeight()
            X.7k4 r2 = r10.A03
            int r0 = r2.A01
            if (r1 == r0) goto L_0x0051
        L_0x001a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ScreenShareCaptureDevice recreating capture for w: "
            r1.append(r0)
            int r0 = r2.A02
            r1.append(r0)
            java.lang.String r0 = ", h: "
            r1.append(r0)
            int r0 = r2.A01
            X.C18260x0.A1G(r1, r0)
            X.7k4 r0 = r10.A03
            int r4 = r0.A02
            int r2 = r0.A01
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r10.A04
            int r1 = r0.format
            r0 = 3
            android.media.ImageReader r2 = android.media.ImageReader.newInstance(r4, r2, r1, r0)
            X.C162457s7.A0D(r2)
            r0 = 0
            X.90K r1 = new X.90K
            r1.<init>(r10, r0)
            android.os.Handler r0 = r10.cameraThreadHandler
            r2.setOnImageAvailableListener(r1, r0)
            r10.A02 = r2
        L_0x0051:
            if (r3 == 0) goto L_0x007c
            boolean r0 = X.C107385bE.A0B()
            if (r0 == 0) goto L_0x007c
            java.lang.String r0 = "ScreenShareCaptureDevice resizing VirtualDisplay"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.7k4 r0 = r10.A03
            int r2 = r0.A02
            int r1 = r0.A01
            int r0 = r0.A00
            r3.resize(r2, r1, r0)
            android.media.ImageReader r0 = r10.A02
            android.view.Surface r0 = r0.getSurface()
            r3.setSurface(r0)
        L_0x0072:
            r10.startPeriodicCameraCallbackCheck()
            r0 = 1000(0x3e8, double:4.94E-321)
            r10.scheduleLastFrameResend(r0)
            r0 = 0
            return r0
        L_0x007c:
            android.media.projection.MediaProjection r1 = r10.A08     // Catch:{ SecurityException -> 0x00a2, IllegalStateException -> 0x0099 }
            java.lang.String r2 = "wa_screen_sharing"
            X.7k4 r0 = r10.A03     // Catch:{ SecurityException -> 0x00a2, IllegalStateException -> 0x0099 }
            int r3 = r0.A02     // Catch:{ SecurityException -> 0x00a2, IllegalStateException -> 0x0099 }
            int r4 = r0.A01     // Catch:{ SecurityException -> 0x00a2, IllegalStateException -> 0x0099 }
            int r5 = r0.A00     // Catch:{ SecurityException -> 0x00a2, IllegalStateException -> 0x0099 }
            r6 = 16
            android.media.ImageReader r0 = r10.A02     // Catch:{ SecurityException -> 0x00a2, IllegalStateException -> 0x0099 }
            android.view.Surface r7 = r0.getSurface()     // Catch:{ SecurityException -> 0x00a2, IllegalStateException -> 0x0099 }
            r8 = 0
            r9 = r8
            android.hardware.display.VirtualDisplay r0 = r1.createVirtualDisplay(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SecurityException -> 0x00a2, IllegalStateException -> 0x0099 }
            r10.A00 = r0     // Catch:{ SecurityException -> 0x00a2, IllegalStateException -> 0x0099 }
            goto L_0x0072
        L_0x0099:
            r1 = move-exception
            java.lang.String r0 = "ScreenShareCaptureDevice Unable to start screen capture in state"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = -14
            return r0
        L_0x00a2:
            r1 = move-exception
            java.lang.String r0 = "ScreenShareCaptureDevice Invalid MediaProjection, unable to start screen capture"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = -13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138506qU.A00():int");
    }

    public final void A02(Image image) {
        scheduleLastFrameResend(1000);
        if (image != null) {
            Iterator A0v = AnonymousClass001.A0v(this.virtualCameras);
            while (A0v.hasNext()) {
                VoipCamera voipCamera = (VoipCamera) A0v.next();
                if (voipCamera.started) {
                    updateCameraCallbackCheck();
                    AnonymousClass5TU r9 = this.A0B;
                    long j = this.cameraCallbackCount;
                    long j2 = this.totalElapsedCameraCallbackTime;
                    C104965Ta r10 = r9.A0O;
                    if (r10.A02) {
                        r10.A00();
                        r9.A0F = Math.max(r9.A0F, r10.A00);
                        r10.A01();
                    }
                    r9.A0A = j;
                    r9.A0E = j2;
                    C85474Gj r0 = r9.A0G;
                    if (r0 != null) {
                        r0.AyX((CancellationException) null);
                    }
                    r9.A0G = C616131n.A02((C85494Gl) null, new ScreenShareLoggingHelper$updateFrameCountAndTotalDuration$1(r9, (C84814Du) null), AnonymousClass349.A02(r9.A0P), (AnonymousClass20D) null, 3);
                    voipCamera.abgrFramePlaneCallback(image.getWidth(), image.getHeight(), image.getPlanes()[0].getBuffer(), image.getPlanes()[0].getRowStride());
                }
            }
            if (!C162457s7.A0P(this.A01, image)) {
                Image image2 = this.A01;
                if (image2 != null) {
                    image2.close();
                }
                this.A01 = null;
            }
            this.A01 = image;
            if (!this.A05) {
                this.A05 = true;
                Log.i("ScreenShareCaptureDevice First frame rendered");
            }
        }
    }

    public void closeOnCameraThread() {
        if (!this.A07) {
            Log.i("ScreenShareCaptureDevice/closeOnCameraThread stop MediaProjection");
            this.A0C.clearMediaProjectionHandle();
            this.A08.stop();
        }
        this.A02.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
        Image image = this.A01;
        if (image != null) {
            image.close();
        }
        this.A01 = null;
        this.A02.close();
        this.cameraEventsDispatcher.A00();
    }

    public int disableAREffectOnCameraThread() {
        return -1;
    }

    public Point getAdjustedPreviewSize() {
        return null;
    }

    public VoipPhysicalCamera.CameraInfo getCameraInfo() {
        return this.A04;
    }

    public int getCameraStartMode() {
        return 0;
    }

    public C149957Oo getLastCachedFrame() {
        return null;
    }

    public int getLatestFrame(ByteBuffer byteBuffer) {
        return 0;
    }

    public boolean isCameraOpen() {
        return this.A06;
    }

    public void onFrameAvailableOnCameraThread() {
    }

    public void resendLastFrame() {
        A02(this.A01);
    }

    public int setVideoPortOnCameraThread(VideoPort videoPort) {
        return 0;
    }

    public int startOnCameraThread() {
        if (!this.A06) {
            A01();
        }
        this.A08.registerCallback(this.A0A, this.cameraThreadHandler);
        int A002 = A00();
        if (A002 != 0) {
            C18260x0.A0x("ScreenShareCaptureDevice Failed to setup screen capture: ", AnonymousClass001.A0o(), A002);
            return A002;
        }
        this.A06 = true;
        return 0;
    }

    public void updatePreviewOrientation() {
    }

    public final void A01() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ScreenShareCaptureDevice notifyFormatChange: ");
        VoipPhysicalCamera.CameraInfo cameraInfo = this.A04;
        A0o.append(cameraInfo.width);
        A0o.append(" x ");
        C18260x0.A1G(A0o, cameraInfo.height);
        Iterator A0v = AnonymousClass001.A0v(this.virtualCameras);
        while (A0v.hasNext()) {
            VoipCamera voipCamera = (VoipCamera) A0v.next();
            if (voipCamera.started) {
                VoipPhysicalCamera.CameraInfo cameraInfo2 = this.A04;
                voipCamera.formatChangeCallback(cameraInfo2.width, cameraInfo2.height, cameraInfo2.format, cameraInfo2.fps1000);
            }
        }
    }

    public int enableAREffectOnCameraThread(C106005Xg r2, AnonymousClass646 r3) {
        return -1;
    }

    public int stopOnCameraThread() {
        stopPeriodicCameraCallbackCheck();
        clearLastFrameResendMessages();
        this.A08.unregisterCallback(this.A0A);
        VirtualDisplay virtualDisplay = this.A00;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        this.A00 = null;
        this.A06 = false;
        return 0;
    }
}
