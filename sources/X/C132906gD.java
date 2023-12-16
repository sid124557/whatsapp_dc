package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.SurfaceHolder;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.6gD  reason: invalid class name and case insensitive filesystem */
public class C132906gD extends AnonymousClass4ND implements AnonymousClass678, SurfaceHolder.Callback {
    public static final String[] A0a = {"GT-I9195", "GT-I9190", "GT-I9192"};
    public int A00;
    public int A01;
    public int A02;
    public SurfaceTexture A03;
    public Camera.Size A04;
    public Camera.Size A05;
    public Camera.Size A06;
    public Camera A07;
    public MediaRecorder A08;
    public Handler A09;
    public HandlerThread A0A;
    public AnonymousClass0W2 A0B;
    public AnonymousClass0NG A0C;
    public AnonymousClass0OZ A0D;
    public AnonymousClass0OZ A0E;
    public C185898uQ A0F;
    public C620633i A0G;
    public AnonymousClass5ZR A0H;
    public C49632gq A0I;
    public C60152y5 A0J;
    public String A0K;
    public List A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public byte[] A0S;
    public final Handler A0T = AnonymousClass000.A0A();
    public final Display A0U;
    public final SurfaceHolder A0V;
    public final C171018Fk A0W;
    public final AnonymousClass6EQ A0X;
    public final AnonymousClass7X7 A0Y;
    public final float[] A0Z = new float[16];

    public static /* synthetic */ void A04(C132906gD r5) {
        synchronized (r5) {
            Camera camera = r5.A07;
            if (camera == null) {
                try {
                    if (r5.A00 >= Camera.getNumberOfCameras()) {
                        r5.A00 = Camera.getNumberOfCameras() - 1;
                    }
                    Camera open = Camera.open(r5.A00);
                    r5.A07 = open;
                    open.setErrorCallback(new C1893891c(r5, 0));
                } catch (Exception e) {
                    Camera camera2 = r5.A07;
                    if (camera2 != null) {
                        camera2.release();
                    }
                    r5.A07 = null;
                    Log.e("cameraview/start-camera error opening camera", e);
                    if (r5.A00 != 0) {
                        C18270x1.A0h(r5.getSharedPreferences().edit(), "camera_index", 0);
                    }
                    r5.A0B(e, 1);
                }
                Camera camera3 = r5.A07;
                if (camera3 != null) {
                    try {
                        camera3.setPreviewDisplay(r5.A0V);
                        r5.A08();
                    } catch (IOException | RuntimeException e2) {
                        r5.A07.release();
                        r5.A07 = null;
                        Log.e("cameraview/start-camera", e2);
                        if (r5.A00 != 0) {
                            C18270x1.A0h(r5.getSharedPreferences().edit(), "camera_index", 0);
                        }
                        r5.A0B(e2, 1);
                    }
                }
            } else {
                try {
                    camera.reconnect();
                } catch (IOException e3) {
                    r5.A07.release();
                    r5.A07 = null;
                    Log.e("cameraview/start-camera error reconnecting camera", e3);
                    r5.A0B(e3, 1);
                }
            }
        }
        return;
    }

    public static boolean A05(Camera.Size size, Camera.Size size2, int i, int i2) {
        if (size2 == null) {
            return true;
        }
        return (AnonymousClass001.A0A(size.height, i2) * i) + (AnonymousClass001.A0A(size.width, i) * i2) < (AnonymousClass001.A0A(size2.height, i2) * i) + (AnonymousClass001.A0A(size2.width, i) * i2);
    }

    public final synchronized void A09() {
        Log.i("cameraview/stop-camera");
        Camera camera = this.A07;
        if (camera != null) {
            try {
                camera.stopPreview();
                this.A0M = false;
            } catch (Exception e) {
                Log.w("cameraview/stop-camera error stopping camera preview", e);
            }
            try {
                this.A07.release();
            } catch (Exception e2) {
                Log.w("cameraview/stop-camera error releasing camera", e2);
            }
            this.A07 = null;
        }
        Log.i("cameraview/stop-camera-end");
        return;
    }

    public synchronized void BLW() {
        Log.i("cameraview/next-camera");
        if (this.A07 != null) {
            boolean z = true;
            if (Camera.getNumberOfCameras() > 1) {
                this.A00 = (this.A00 + 1) % Camera.getNumberOfCameras();
                if (getCameraInfo().facing != 1) {
                    z = false;
                }
                this.A0N = z;
                A09();
                Handler handler = this.A09;
                Objects.requireNonNull(handler);
                handler.post(new C117695sL((Object) this, 49));
                C18270x1.A0h(getSharedPreferences().edit(), "camera_index", this.A00);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        r1 = "off";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String BLX() {
        /*
            r4 = this;
            monitor-enter(r4)
            android.hardware.Camera r0 = r4.A07     // Catch:{ all -> 0x006d }
            if (r0 != 0) goto L_0x0008
            java.lang.String r1 = "off"
            goto L_0x006b
        L_0x0008:
            java.util.List r2 = r4.getFlashModes()     // Catch:{ all -> 0x006d }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = "off"
            goto L_0x006b
        L_0x0015:
            android.hardware.Camera r0 = r4.A07     // Catch:{ all -> 0x006d }
            android.hardware.Camera$Parameters r3 = r0.getParameters()     // Catch:{ all -> 0x006d }
            java.lang.String r0 = r4.A0K     // Catch:{ all -> 0x006d }
            int r0 = r2.indexOf(r0)     // Catch:{ all -> 0x006d }
            if (r0 >= 0) goto L_0x002c
            java.lang.String r1 = "off"
            int r0 = r2.indexOf(r1)     // Catch:{ all -> 0x006d }
            if (r0 >= 0) goto L_0x002c
            goto L_0x006b
        L_0x002c:
            int r1 = r0 + 1
            int r0 = r2.size()     // Catch:{ all -> 0x006d }
            int r1 = r1 % r0
            java.lang.String r2 = X.AnonymousClass001.A0n(r2, r1)     // Catch:{ all -> 0x006d }
            r4.A0K = r2     // Catch:{ all -> 0x006d }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x006d }
            java.lang.String r0 = "cameraview/next flash mode:"
            X.C18260x0.A0s(r0, r2, r1)     // Catch:{ all -> 0x006d }
            java.util.List r1 = r3.getSupportedFlashModes()     // Catch:{ all -> 0x006d }
            if (r1 == 0) goto L_0x005a
            java.lang.String r0 = r4.A0K     // Catch:{ all -> 0x006d }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = r4.A0K     // Catch:{ all -> 0x006d }
            r3.setFlashMode(r0)     // Catch:{ all -> 0x006d }
            android.hardware.Camera r0 = r4.A07     // Catch:{ all -> 0x006d }
            r0.setParameters(r3)     // Catch:{ all -> 0x006d }
        L_0x005a:
            android.content.SharedPreferences r0 = r4.getSharedPreferences()     // Catch:{ all -> 0x006d }
            android.content.SharedPreferences$Editor r2 = r0.edit()     // Catch:{ all -> 0x006d }
            java.lang.String r1 = "flash_mode"
            java.lang.String r0 = r4.A0K     // Catch:{ all -> 0x006d }
            X.C18270x1.A0j(r2, r1, r0)     // Catch:{ all -> 0x006d }
            java.lang.String r1 = r4.A0K     // Catch:{ all -> 0x006d }
        L_0x006b:
            monitor-exit(r4)
            return r1
        L_0x006d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132906gD.BLX():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int Bnu(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.hardware.Camera r0 = r3.A07     // Catch:{ all -> 0x003c }
            r2 = 0
            if (r0 == 0) goto L_0x003a
            android.hardware.Camera$Parameters r1 = r0.getParameters()     // Catch:{ all -> 0x003c }
            boolean r0 = r1.isZoomSupported()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x003a
            int r0 = r1.getMaxZoom()     // Catch:{ all -> 0x003c }
            if (r4 > r0) goto L_0x003a
            int r0 = r1.getZoom()     // Catch:{ all -> 0x003c }
            if (r0 == r4) goto L_0x0024
            r1.setZoom(r4)     // Catch:{ all -> 0x003c }
            android.hardware.Camera r0 = r3.A07     // Catch:{ all -> 0x003c }
            r0.setParameters(r1)     // Catch:{ all -> 0x003c }
        L_0x0024:
            java.util.List r1 = r1.getZoomRatios()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x003a
            int r0 = r1.size()     // Catch:{ all -> 0x003c }
            if (r0 < r4) goto L_0x003a
            java.lang.Object r0 = r1.get(r4)     // Catch:{ all -> 0x003c }
            int r0 = X.AnonymousClass0x7.A05(r0)     // Catch:{ all -> 0x003c }
            monitor-exit(r3)
            return r0
        L_0x003a:
            monitor-exit(r3)
            return r2
        L_0x003c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132906gD.Bnu(int):int");
    }

    public synchronized void BqD() {
        try {
            MediaRecorder mediaRecorder = this.A08;
            Objects.requireNonNull(mediaRecorder);
            mediaRecorder.stop();
        } catch (RuntimeException e) {
            Log.w("cameraview/stop-video-capture ", e);
        }
        A07();
        Camera camera = this.A07;
        if (camera != null) {
            camera.lock();
        }
        this.A0P = false;
        this.A05 = null;
    }

    public synchronized void Bqa(AnonymousClass5PM r6, boolean z) {
        if (this.A07 == null) {
            Log.e("cameraview/take-picture camera is null");
            e = new Exception("CameraCustomException: Camera is null");
        } else if (this.A0R) {
            Log.e("cameraview/take-picture already taking a picture");
        } else {
            this.A0M = false;
            this.A0R = true;
            Log.i("cameraview/take-picture/start");
            Camera.Parameters parameters = this.A07.getParameters();
            parameters.setRotation(getRequiredCameraRotation());
            parameters.setJpegQuality(80);
            this.A07.setParameters(parameters);
            try {
                C162797sm r3 = new C162797sm(r6, this);
                Objects.requireNonNull(r6);
                this.A07.takePicture(new C162817so(r6), (Camera.PictureCallback) null, r3);
            } catch (Exception e) {
                e = e;
                this.A0R = false;
                Log.e("cameraview/take-picture failed", e);
            }
        }
        A0B(e, 1);
        return;
    }

    public synchronized List getFlashModes() {
        ArrayList A0s;
        A0s = AnonymousClass001.A0s();
        Camera camera = this.A07;
        if (camera != null) {
            try {
                List<String> supportedFlashModes = camera.getParameters().getSupportedFlashModes();
                if (supportedFlashModes != null) {
                    if (supportedFlashModes.contains("off")) {
                        A0s.add("off");
                    }
                    if (supportedFlashModes.contains("on")) {
                        A0s.add("on");
                    }
                    if (supportedFlashModes.contains("auto")) {
                        A0s.add("auto");
                    }
                }
                if (this.A0N) {
                    C86614Ku.A1T("off", A0s);
                    C86614Ku.A1T("on", A0s);
                }
                if (getStoredFlashModeCount() != A0s.size()) {
                    SharedPreferences.Editor edit = getSharedPreferences().edit();
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("flash_mode_count");
                    C18270x1.A0h(edit, AnonymousClass000.A0h(A0o, this.A00), A0s.size());
                }
            } catch (RuntimeException e) {
                Log.e("cameraview/getFlashModes ", e);
            }
        }
        return A0s;
    }

    public synchronized int getMaxZoom() {
        int i;
        Camera camera = this.A07;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters.isZoomSupported()) {
                i = parameters.getMaxZoom();
            }
        }
        i = 0;
        return i;
    }

    public synchronized long getPictureResolution() {
        long j;
        Camera.Size pictureSize;
        Camera camera = this.A07;
        j = 0;
        if (!(camera == null || (pictureSize = camera.getParameters().getPictureSize()) == null)) {
            j = (long) (pictureSize.width * pictureSize.height);
        }
        return j;
    }

    public synchronized long getVideoResolution() {
        long j;
        Camera.Size size = this.A06;
        if (size != null) {
            j = (long) (size.width * size.height);
        } else {
            j = 0;
        }
        return j;
    }

    public synchronized int getZoomLevel() {
        Camera camera = this.A07;
        if (camera == null) {
            return 0;
        }
        return camera.getParameters().getZoom();
    }

    public static Camera.Size A01(List list, int i, int i2) {
        int i3 = i;
        double d = (double) i3;
        int i4 = i2;
        double d2 = d / ((double) i4);
        Camera.Size size = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Camera.Size size2 = (Camera.Size) it.next();
                int i5 = size2.width;
                double d3 = (double) i5;
                int i6 = size2.height;
                double d4 = d3 / ((double) i6);
                double d5 = d3 / d;
                if (i5 * i6 >= 153600 && d5 <= 1.5d && Math.abs(d4 - d2) <= 0.1d && A05(size2, size, i3, i4)) {
                    size = size2;
                }
            }
            if (size == null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Camera.Size size3 = (Camera.Size) it2.next();
                    if (((double) size3.width) / d <= 1.5d && A05(size3, size, i3, i4)) {
                        size = size3;
                    }
                }
                if (size == null) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        Camera.Size size4 = (Camera.Size) it3.next();
                        if (A05(size4, size, i3, i4)) {
                            size = size4;
                        }
                    }
                }
            }
        }
        return size;
    }

    private Camera.CameraInfo getCameraInfo() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.A00, cameraInfo);
        return cameraInfo;
    }

    private List getFallbackSupportedPreviewSizes() {
        Log.i("cameraview/fallback-supported-preview-sizes");
        ArrayList A0s = AnonymousClass001.A0s();
        Camera camera = this.A07;
        Objects.requireNonNull(camera);
        A0s.add(new Camera.Size(camera, 640, 480));
        return A0s;
    }

    private int getRequiredCameraRotation() {
        int rotation = this.A0U.getRotation();
        Camera.CameraInfo cameraInfo = getCameraInfo();
        int i = 0;
        boolean A1U = AnonymousClass000.A1U(cameraInfo.facing, 1);
        this.A0N = A1U;
        int i2 = cameraInfo.orientation;
        if (rotation != 0) {
            if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = 180;
            } else if (rotation == 3) {
                i = 270;
            }
        }
        int i3 = i2 - i;
        if (A1U) {
            i3 = i2 + i;
        }
        int i4 = (i3 + 360) % 360;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("cameraview/orientation display:");
        A0o.append(i);
        A0o.append(" camera:");
        A0o.append(i2);
        C18260x0.A0y(" rotate:", A0o, i4);
        return i4;
    }

    private SharedPreferences getSharedPreferences() {
        return this.A0J.A03(C58152un.A0A);
    }

    public final void A07() {
        MediaRecorder mediaRecorder = this.A08;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            this.A08.release();
            this.A08 = null;
            this.A0P = false;
            Camera camera = this.A07;
            if (camera != null) {
                try {
                    camera.lock();
                    Camera.Parameters parameters = this.A07.getParameters();
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("cameraview/release-media-recorder/flash ");
                    C18260x0.A1J(A0o, parameters.getFlashMode());
                    if ("torch".equals(parameters.getFlashMode())) {
                        parameters.setFlashMode("off");
                        this.A07.setParameters(parameters);
                        this.A07.stopPreview();
                        this.A0M = false;
                    }
                } catch (RuntimeException e) {
                    Log.e("failed to lock the camera, it's in use by another process or WhatsApp video call.", e);
                }
            }
        }
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.A03 = null;
        }
        AnonymousClass0OZ r0 = this.A0D;
        if (r0 != null) {
            r0.A01();
            this.A0D = null;
        }
        AnonymousClass0NG r1 = this.A0C;
        if (r1 != null) {
            if (r1.A00 != null) {
                r1.A00 = null;
            }
            this.A0C = null;
        }
        AnonymousClass0OZ r02 = this.A0E;
        if (r02 != null) {
            r02.A01();
            this.A0E = null;
        }
        AnonymousClass0W2 r03 = this.A0B;
        if (r03 != null) {
            r03.A01();
            this.A0B = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0107, code lost:
        if (r9 != 3) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (r9 == 2) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x029d A[Catch:{ RuntimeException -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02d9 A[Catch:{ RuntimeException -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x030a A[Catch:{ RuntimeException -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0330 A[Catch:{ RuntimeException -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0341 A[Catch:{ RuntimeException -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010c A[Catch:{ RuntimeException -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0113 A[Catch:{ RuntimeException -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x016e A[Catch:{ RuntimeException -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x018f A[Catch:{ RuntimeException -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x019b A[Catch:{ RuntimeException -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01f8 A[Catch:{ RuntimeException -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x024f A[Catch:{ RuntimeException -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0266 A[Catch:{ RuntimeException -> 0x0159 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A08() {
        /*
            r21 = this;
            r11 = r21
            monitor-enter(r11)
            int r13 = r11.getWidth()     // Catch:{ all -> 0x034d }
            int r12 = r11.getHeight()     // Catch:{ all -> 0x034d }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x034d }
            java.lang.String r0 = "cameraview/start-preview view:"
            r1.append(r0)     // Catch:{ all -> 0x034d }
            r1.append(r13)     // Catch:{ all -> 0x034d }
            java.lang.String r10 = "x"
            X.C18260x0.A0y(r10, r1, r12)     // Catch:{ all -> 0x034d }
            android.hardware.Camera r0 = r11.A07     // Catch:{ all -> 0x034d }
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "cameraview/start-preview camera is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x034d }
            java.lang.String r0 = "CameraCustomException: Camera is null"
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x034d }
            r1.<init>(r0)     // Catch:{ all -> 0x034d }
            r0 = 1
            r11.A0B(r1, r0)     // Catch:{ all -> 0x034d }
            goto L_0x0344
        L_0x0032:
            android.view.Display r0 = r11.A0U     // Catch:{ all -> 0x034d }
            int r9 = r0.getRotation()     // Catch:{ all -> 0x034d }
            r0 = 2
            r3 = 1
            if (r9 == 0) goto L_0x003f
            r8 = 0
            if (r9 != r0) goto L_0x0040
        L_0x003f:
            r8 = 1
        L_0x0040:
            android.hardware.Camera r0 = r11.A07     // Catch:{ all -> 0x034d }
            android.hardware.Camera$Parameters r7 = r0.getParameters()     // Catch:{ all -> 0x034d }
            java.util.List r2 = r7.getSupportedPreviewSizes()     // Catch:{ all -> 0x034d }
            r11.A0L = r2     // Catch:{ all -> 0x034d }
            if (r2 != 0) goto L_0x0054
            java.util.List r2 = r11.getFallbackSupportedPreviewSizes()     // Catch:{ all -> 0x034d }
            r11.A0L = r2     // Catch:{ all -> 0x034d }
        L_0x0054:
            r1 = r13
            r0 = r12
            if (r8 == 0) goto L_0x005a
            r1 = r12
            r0 = r13
        L_0x005a:
            android.hardware.Camera$Size r0 = A01(r2, r1, r0)     // Catch:{ all -> 0x034d }
            r11.A04 = r0     // Catch:{ all -> 0x034d }
            java.lang.String r0 = r11.A0K     // Catch:{ all -> 0x034d }
            if (r0 != 0) goto L_0x006a
            java.lang.String r0 = r7.getFlashMode()     // Catch:{ all -> 0x034d }
            r11.A0K = r0     // Catch:{ all -> 0x034d }
        L_0x006a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x034d }
            java.lang.String r0 = "cameraview/start-preview preview sizes:"
            r1.append(r0)     // Catch:{ all -> 0x034d }
            java.util.List r0 = r11.A0L     // Catch:{ all -> 0x034d }
            java.lang.String r0 = A02(r0)     // Catch:{ all -> 0x034d }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x034d }
            android.hardware.Camera$Size r2 = r11.A04     // Catch:{ all -> 0x034d }
            if (r2 == 0) goto L_0x0346
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x034d }
            java.lang.String r0 = "cameraview/start-preview optimal preview size:"
            r1.append(r0)     // Catch:{ all -> 0x034d }
            int r0 = r2.width     // Catch:{ all -> 0x034d }
            r1.append(r0)     // Catch:{ all -> 0x034d }
            r1.append(r10)     // Catch:{ all -> 0x034d }
            int r0 = r2.height     // Catch:{ all -> 0x034d }
            X.C18260x0.A1G(r1, r0)     // Catch:{ all -> 0x034d }
            android.hardware.Camera$CameraInfo r18 = r11.getCameraInfo()     // Catch:{ all -> 0x034d }
            r0 = r18
            int r0 = r0.facing     // Catch:{ all -> 0x034d }
            boolean r6 = X.AnonymousClass000.A1U(r0, r3)
            r11.A0N = r6     // Catch:{ all -> 0x034d }
            double r4 = (double) r13     // Catch:{ all -> 0x034d }
            double r2 = (double) r12     // Catch:{ all -> 0x034d }
            double r16 = r4 / r2
            android.hardware.Camera$Size r14 = r11.A04     // Catch:{ all -> 0x034d }
            int r0 = r14.width     // Catch:{ all -> 0x034d }
            r20 = r0
            double r0 = (double) r0     // Catch:{ all -> 0x034d }
            int r14 = r14.height     // Catch:{ all -> 0x034d }
            r19 = r14
            double r14 = (double) r14     // Catch:{ all -> 0x034d }
            double r0 = r0 / r14
            double r16 = r16 - r0
            double r14 = java.lang.Math.abs(r16)     // Catch:{ all -> 0x034d }
            double r2 = r2 / r4
            double r2 = r2 - r0
            double r0 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x034d }
            double r0 = java.lang.Math.min(r14, r0)     // Catch:{ all -> 0x034d }
            r3 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x00f8
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x034d }
            java.lang.String r4 = "cameraview/start-preview request layout to match preview size:"
            r3 = r20
            r2 = r19
            X.AnonymousClass6C7.A1J(r4, r10, r5, r3, r2)     // Catch:{ all -> 0x034d }
            java.lang.String r2 = " (view is "
            X.AnonymousClass6C7.A1J(r2, r10, r5, r13, r12)     // Catch:{ all -> 0x034d }
            java.lang.String r2 = ") aspect diff is "
            r5.append(r2)     // Catch:{ all -> 0x034d }
            r5.append(r0)     // Catch:{ all -> 0x034d }
            X.C18280x3.A14(r5)     // Catch:{ all -> 0x034d }
            android.os.Handler r2 = r11.A0T     // Catch:{ all -> 0x034d }
            r1 = 0
            X.3cI r0 = new X.3cI     // Catch:{ all -> 0x034d }
            r0.<init>((java.lang.Object) r11, (int) r1)     // Catch:{ all -> 0x034d }
            r2.post(r0)     // Catch:{ all -> 0x034d }
            goto L_0x0344
        L_0x00f8:
            r0 = r18
            int r3 = r0.orientation     // Catch:{ all -> 0x034d }
            r1 = 3
            if (r9 == 0) goto L_0x0109
            r0 = 1
            if (r9 == r0) goto L_0x0110
            r0 = 2
            if (r9 == r0) goto L_0x010d
            r4 = 270(0x10e, float:3.78E-43)
            if (r9 == r1) goto L_0x010a
        L_0x0109:
            r4 = 0
        L_0x010a:
            if (r6 == 0) goto L_0x0113
            goto L_0x011c
        L_0x010d:
            r4 = 180(0xb4, float:2.52E-43)
            goto L_0x010a
        L_0x0110:
            r4 = 90
            goto L_0x010a
        L_0x0113:
            int r0 = r3 - r4
            int r0 = r0 + 360
            int r2 = r0 % 360
            r11.A01 = r2     // Catch:{ all -> 0x034d }
            goto L_0x0128
        L_0x011c:
            int r0 = r3 + r4
            int r0 = r0 % 360
            r11.A01 = r0     // Catch:{ all -> 0x034d }
            int r0 = 360 - r0
            int r2 = r0 % 360
            r11.A01 = r2     // Catch:{ all -> 0x034d }
        L_0x0128:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x034d }
            java.lang.String r0 = "cameraview/start-preview display:"
            r1.append(r0)     // Catch:{ all -> 0x034d }
            r1.append(r4)     // Catch:{ all -> 0x034d }
            java.lang.String r0 = " camera:"
            r1.append(r0)     // Catch:{ all -> 0x034d }
            r1.append(r3)     // Catch:{ all -> 0x034d }
            java.lang.String r0 = " preview:"
            r1.append(r0)     // Catch:{ all -> 0x034d }
            r1.append(r2)     // Catch:{ all -> 0x034d }
            java.lang.String r0 = " front:"
            r1.append(r0)     // Catch:{ all -> 0x034d }
            r1.append(r6)     // Catch:{ all -> 0x034d }
            java.lang.String r0 = " portrait:"
            X.C18260x0.A1E(r0, r1, r8)     // Catch:{ all -> 0x034d }
            android.hardware.Camera r1 = r11.A07     // Catch:{ RuntimeException -> 0x0159 }
            int r0 = r11.A01     // Catch:{ RuntimeException -> 0x0159 }
            r1.setDisplayOrientation(r0)     // Catch:{ RuntimeException -> 0x0159 }
            goto L_0x015f
        L_0x0159:
            r1 = move-exception
            java.lang.String r0 = "cameraview/start-preview/setdisplayorientation "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x034d }
        L_0x015f:
            android.hardware.Camera$Size r0 = r11.A04     // Catch:{ all -> 0x034d }
            int r1 = r0.width     // Catch:{ all -> 0x034d }
            int r0 = r0.height     // Catch:{ all -> 0x034d }
            r7.setPreviewSize(r1, r0)     // Catch:{ all -> 0x034d }
            java.util.List r2 = r7.getSupportedFocusModes()     // Catch:{ all -> 0x034d }
            if (r2 == 0) goto L_0x018f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x034d }
            java.lang.String r0 = "cameraview/start-preview supported focus:"
            r1.append(r0)     // Catch:{ all -> 0x034d }
            java.lang.Object[] r0 = r2.toArray()     // Catch:{ all -> 0x034d }
            java.lang.String r0 = java.util.Arrays.deepToString(r0)     // Catch:{ all -> 0x034d }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x034d }
            java.lang.String r1 = "continuous-picture"
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x034d }
            if (r0 == 0) goto L_0x0194
            r7.setFocusMode(r1)     // Catch:{ all -> 0x034d }
            r15 = 1
            goto L_0x0195
        L_0x018f:
            java.lang.String r0 = "cameraview/start-preview supported focus:null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x034d }
        L_0x0194:
            r15 = 0
        L_0x0195:
            java.util.List r2 = r7.getSupportedFlashModes()     // Catch:{ all -> 0x034d }
            if (r2 == 0) goto L_0x024f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x034d }
            java.lang.String r0 = "cameraview/start-preview supported flash:"
            r1.append(r0)     // Catch:{ all -> 0x034d }
            java.lang.Object[] r0 = r2.toArray()     // Catch:{ all -> 0x034d }
            java.lang.String r0 = java.util.Arrays.deepToString(r0)     // Catch:{ all -> 0x034d }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x034d }
            java.lang.String r0 = "torch"
            boolean r0 = r2.contains(r0)     // Catch:{ all -> 0x034d }
            r11.A0Q = r0     // Catch:{ all -> 0x034d }
            java.lang.String r0 = r11.A0K     // Catch:{ all -> 0x034d }
            if (r0 == 0) goto L_0x01d4
            boolean r0 = r2.contains(r0)     // Catch:{ all -> 0x034d }
            if (r0 == 0) goto L_0x023e
            java.lang.String r0 = r11.A0K     // Catch:{ all -> 0x034d }
            r7.setFlashMode(r0)     // Catch:{ all -> 0x034d }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x034d }
            java.lang.String r0 = "cameraview/start-preview set flash mode:"
            r1.append(r0)     // Catch:{ all -> 0x034d }
            java.lang.String r0 = r11.A0K     // Catch:{ all -> 0x034d }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x034d }
        L_0x01d4:
            java.util.List r6 = r7.getSupportedPictureSizes()     // Catch:{ all -> 0x034d }
            r0 = 35
            X.C86614Ku.A1U(r6, r0)     // Catch:{ all -> 0x034d }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x034d }
            java.lang.String r0 = "cameraview/start-preview picture sizes:"
            r1.append(r0)     // Catch:{ all -> 0x034d }
            java.lang.String r0 = A02(r6)     // Catch:{ all -> 0x034d }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x034d }
            android.hardware.Camera$Size r1 = r11.A04     // Catch:{ all -> 0x034d }
            r9 = 12000000(0xb71b00, float:1.6815582E-38)
            r4 = 640(0x280, float:8.97E-43)
            r3 = 480(0x1e0, float:6.73E-43)
            if (r1 == 0) goto L_0x0266
            int r0 = r1.height     // Catch:{ all -> 0x034d }
            float r2 = (float) r0     // Catch:{ all -> 0x034d }
            int r0 = r1.width     // Catch:{ all -> 0x034d }
            float r0 = (float) r0     // Catch:{ all -> 0x034d }
            float r2 = r2 / r0
            java.util.Iterator r14 = r6.iterator()     // Catch:{ all -> 0x034d }
            r13 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r12 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x0209:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x034d }
            if (r0 == 0) goto L_0x0285
            java.lang.Object r0 = r14.next()     // Catch:{ all -> 0x034d }
            android.hardware.Camera$Size r0 = (android.hardware.Camera.Size) r0     // Catch:{ all -> 0x034d }
            int r8 = r0.width     // Catch:{ all -> 0x034d }
            int r5 = r0.height     // Catch:{ all -> 0x034d }
            int r1 = r8 * r5
            if (r1 >= r9) goto L_0x0209
            int r0 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x0228
            int r1 = r1 * 2
            int r0 = r4 * r3
            if (r1 >= r0) goto L_0x0228
            goto L_0x0285
        L_0x0228:
            float r1 = (float) r5     // Catch:{ all -> 0x034d }
            float r0 = (float) r8     // Catch:{ all -> 0x034d }
            float r1 = r1 / r0
            float r1 = X.AnonymousClass002.A00(r1, r2)     // Catch:{ all -> 0x034d }
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0209
            r3 = r5
            r4 = r8
            r0 = 1028443341(0x3d4ccccd, float:0.05)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0285
            r12 = r1
            goto L_0x0209
        L_0x023e:
            java.util.List r1 = r11.getFlashModes()     // Catch:{ all -> 0x034d }
            java.lang.String r0 = r11.A0K     // Catch:{ all -> 0x034d }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x034d }
            if (r0 != 0) goto L_0x01d4
            java.lang.String r0 = r7.getFlashMode()     // Catch:{ all -> 0x034d }
            goto L_0x0262
        L_0x024f:
            java.lang.String r0 = "cameraview/start-preview supported flash:null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x034d }
            java.util.List r1 = r11.getFlashModes()     // Catch:{ all -> 0x034d }
            java.lang.String r0 = r11.A0K     // Catch:{ all -> 0x034d }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x034d }
            if (r0 != 0) goto L_0x01d4
            java.lang.String r0 = "off"
        L_0x0262:
            r11.A0K = r0     // Catch:{ all -> 0x034d }
            goto L_0x01d4
        L_0x0266:
            java.util.Iterator r8 = r6.iterator()     // Catch:{ all -> 0x034d }
        L_0x026a:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x034d }
            if (r0 == 0) goto L_0x0285
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x034d }
            android.hardware.Camera$Size r0 = (android.hardware.Camera.Size) r0     // Catch:{ all -> 0x034d }
            int r5 = r0.width     // Catch:{ all -> 0x034d }
            int r2 = r0.height     // Catch:{ all -> 0x034d }
            int r1 = r5 * r2
            int r0 = r4 * r3
            if (r1 <= r0) goto L_0x026a
            if (r1 >= r9) goto L_0x026a
            r3 = r2
            r4 = r5
            goto L_0x026a
        L_0x0285:
            boolean r0 = r11.A0N     // Catch:{ all -> 0x034d }
            if (r0 == 0) goto L_0x02ba
            java.lang.String r1 = "samsung"
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x034d }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x034d }
            if (r0 == 0) goto L_0x02ba
            java.lang.String[] r1 = A0a     // Catch:{ all -> 0x034d }
            java.lang.String r0 = android.os.Build.MODEL     // Catch:{ all -> 0x034d }
            boolean r0 = X.AnonymousClass367.A03(r0, r1)     // Catch:{ all -> 0x034d }
            if (r0 == 0) goto L_0x02ba
            android.hardware.Camera r5 = r11.A07     // Catch:{ all -> 0x034d }
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x034d }
            r1 = 1280(0x500, float:1.794E-42)
            r0 = 720(0x2d0, float:1.009E-42)
            android.hardware.Camera$Size r2 = new android.hardware.Camera$Size     // Catch:{ all -> 0x034d }
            r2.<init>(r5, r1, r0)     // Catch:{ all -> 0x034d }
            boolean r0 = r6.contains(r2)     // Catch:{ all -> 0x034d }
            if (r0 == 0) goto L_0x0316
            int r4 = r2.width     // Catch:{ all -> 0x034d }
            int r3 = r2.height     // Catch:{ all -> 0x034d }
            java.lang.String r0 = "cameraview/start-preview workaround s4 mini preview size"
        L_0x02b7:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x034d }
        L_0x02ba:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x034d }
            java.lang.String r0 = "cameraview/start-preview picture size "
            r1.append(r0)     // Catch:{ all -> 0x034d }
            r1.append(r4)     // Catch:{ all -> 0x034d }
            X.C18260x0.A0y(r10, r1, r3)     // Catch:{ all -> 0x034d }
            r7.setPictureSize(r4, r3)     // Catch:{ all -> 0x034d }
            android.hardware.Camera r0 = r11.A07     // Catch:{ all -> 0x034d }
            r0.setParameters(r7)     // Catch:{ all -> 0x034d }
            boolean r0 = r11.A0N     // Catch:{ all -> 0x034d }
            if (r0 != 0) goto L_0x030a
            boolean r0 = r11.A0O     // Catch:{ all -> 0x034d }
            if (r0 == 0) goto L_0x030a
            android.hardware.Camera r1 = r11.A07     // Catch:{ all -> 0x034d }
            r0 = 0
            r1.setPreviewCallbackWithBuffer(r0)     // Catch:{ all -> 0x034d }
            android.hardware.Camera r1 = r11.A07     // Catch:{ all -> 0x034d }
            X.7sn r0 = new X.7sn     // Catch:{ all -> 0x034d }
            r0.<init>(r11)     // Catch:{ all -> 0x034d }
            r1.setPreviewCallbackWithBuffer(r0)     // Catch:{ all -> 0x034d }
            android.hardware.Camera$Size r0 = r11.A04     // Catch:{ all -> 0x034d }
            int r1 = r0.width     // Catch:{ all -> 0x034d }
            int r0 = r0.height     // Catch:{ all -> 0x034d }
            int r1 = r1 * r0
            int r2 = r1 * 3
            r0 = 2
            int r2 = r2 / r0
            byte[] r1 = r11.A0S     // Catch:{ all -> 0x034d }
            if (r1 == 0) goto L_0x02fb
            int r0 = r1.length     // Catch:{ all -> 0x034d }
            if (r0 == r2) goto L_0x02ff
        L_0x02fb:
            byte[] r1 = new byte[r2]     // Catch:{ all -> 0x034d }
            r11.A0S = r1     // Catch:{ all -> 0x034d }
        L_0x02ff:
            android.hardware.Camera r0 = r11.A07     // Catch:{ all -> 0x034d }
            r0.addCallbackBuffer(r1)     // Catch:{ all -> 0x034d }
        L_0x0304:
            android.hardware.Camera r0 = r11.A07     // Catch:{ all -> 0x034d }
            r0.startPreview()     // Catch:{ all -> 0x034d }
            goto L_0x032e
        L_0x030a:
            android.hardware.Camera r2 = r11.A07     // Catch:{ all -> 0x034d }
            r1 = 0
            X.92u r0 = new X.92u     // Catch:{ all -> 0x034d }
            r0.<init>(r11, r1)     // Catch:{ all -> 0x034d }
            r2.setOneShotPreviewCallback(r0)     // Catch:{ all -> 0x034d }
            goto L_0x0304
        L_0x0316:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x034d }
            java.lang.String r0 = "cameraview/start-preview could not workaround s4 mini preview size "
            r1.append(r0)     // Catch:{ all -> 0x034d }
            int r0 = r2.width     // Catch:{ all -> 0x034d }
            r1.append(r0)     // Catch:{ all -> 0x034d }
            r1.append(r10)     // Catch:{ all -> 0x034d }
            int r0 = r2.height     // Catch:{ all -> 0x034d }
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ all -> 0x034d }
            goto L_0x02b7
        L_0x032e:
            if (r15 != 0) goto L_0x033a
            android.hardware.Camera r1 = r11.A07     // Catch:{ all -> 0x034d }
            X.7sl r0 = new X.7sl     // Catch:{ all -> 0x034d }
            r0.<init>()     // Catch:{ all -> 0x034d }
            r1.autoFocus(r0)     // Catch:{ all -> 0x034d }
        L_0x033a:
            r0 = 1
            r11.A0M = r0     // Catch:{ all -> 0x034d }
            X.8uQ r0 = r11.A0F     // Catch:{ all -> 0x034d }
            if (r0 == 0) goto L_0x0344
            r0.BYs()     // Catch:{ all -> 0x034d }
        L_0x0344:
            monitor-exit(r11)
            return
        L_0x0346:
            java.lang.String r0 = "previewSize is NULL"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)     // Catch:{ all -> 0x034d }
            throw r0     // Catch:{ all -> 0x034d }
        L_0x034d:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132906gD.A08():void");
    }

    public void A0A(SurfaceHolder surfaceHolder) {
        Handler handler = this.A09;
        Objects.requireNonNull(handler);
        handler.post(new C70183a5(this, 47, surfaceHolder));
    }

    public void Ays() {
        AnonymousClass7X7 r1 = this.A0Y;
        synchronized (r1) {
            r1.A00 = null;
        }
    }

    public boolean BHe() {
        return this.A0N;
    }

    public boolean BHi() {
        return this.A0M;
    }

    public boolean BIf() {
        return this.A0P;
    }

    public boolean BJ7() {
        Camera camera = this.A07;
        if (camera == null || !this.A0Q) {
            return false;
        }
        return "torch".equals(camera.getParameters().getFlashMode());
    }

    public boolean BLO() {
        Camera camera;
        if (!this.A0N || !"on".equals(this.A0K) || (camera = this.A07) == null) {
            return false;
        }
        List<String> supportedFlashModes = camera.getParameters().getSupportedFlashModes();
        if (supportedFlashModes == null || !supportedFlashModes.contains(this.A0K)) {
            return true;
        }
        return false;
    }

    public void Bk6() {
        A0A(this.A0V);
    }

    public void Bk9() {
        Log.d("cameraview/resume");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0262, code lost:
        if (r2.contains(r1) != false) goto L_0x0264;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02d3 A[Catch:{ IOException -> 0x02e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02fa A[Catch:{ IOException -> 0x02e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x032a A[Catch:{ IOException -> 0x02e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0363 A[Catch:{ IOException -> 0x02e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03a5 A[SYNTHETIC, Splitter:B:151:0x03a5] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x046d A[Catch:{ RuntimeException -> 0x0471 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0240 A[Catch:{ IOException -> 0x02e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x028a A[Catch:{ IOException -> 0x02e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x029b A[Catch:{ IOException -> 0x02e0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void Bq4(java.io.File r26, int r27) {
        /*
            r25 = this;
            r7 = r25
            monitor-enter(r7)
            r15 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04ba }
            java.lang.String r0 = "cameraview/prepare-video front:"
            r1.append(r0)     // Catch:{ all -> 0x04ba }
            boolean r0 = r7.A0N     // Catch:{ all -> 0x04ba }
            X.C18260x0.A1V(r1, r0)     // Catch:{ all -> 0x04ba }
            android.media.MediaRecorder r0 = new android.media.MediaRecorder     // Catch:{ all -> 0x04ba }
            r0.<init>()     // Catch:{ all -> 0x04ba }
            r7.A08 = r0     // Catch:{ all -> 0x04ba }
            int r0 = r7.A00     // Catch:{ all -> 0x04ba }
            r4 = 4
            boolean r1 = android.media.CamcorderProfile.hasProfile(r0, r4)     // Catch:{ all -> 0x04ba }
            r3 = 5
            r2 = 1
            int r0 = r7.A00     // Catch:{ all -> 0x04ba }
            if (r1 == 0) goto L_0x002b
            android.media.CamcorderProfile r8 = android.media.CamcorderProfile.get(r0, r4)     // Catch:{ all -> 0x04ba }
            goto L_0x003c
        L_0x002b:
            boolean r1 = android.media.CamcorderProfile.hasProfile(r0, r3)     // Catch:{ all -> 0x04ba }
            int r0 = r7.A00     // Catch:{ all -> 0x04ba }
            if (r1 == 0) goto L_0x0038
            android.media.CamcorderProfile r8 = android.media.CamcorderProfile.get(r0, r3)     // Catch:{ all -> 0x04ba }
            goto L_0x003c
        L_0x0038:
            android.media.CamcorderProfile r8 = android.media.CamcorderProfile.get(r0, r2)     // Catch:{ all -> 0x04ba }
        L_0x003c:
            if (r8 != 0) goto L_0x0040
            goto L_0x0499
        L_0x0040:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04ba }
            java.lang.String r0 = "cameraview/prepare-video profile:"
            r1.append(r0)     // Catch:{ all -> 0x04ba }
            int r0 = r8.videoFrameWidth     // Catch:{ all -> 0x04ba }
            r1.append(r0)     // Catch:{ all -> 0x04ba }
            java.lang.String r11 = "x"
            r1.append(r11)     // Catch:{ all -> 0x04ba }
            int r0 = r8.videoFrameHeight     // Catch:{ all -> 0x04ba }
            r1.append(r0)     // Catch:{ all -> 0x04ba }
            java.lang.String r0 = " videoCodec:"
            r1.append(r0)     // Catch:{ all -> 0x04ba }
            int r0 = r8.videoCodec     // Catch:{ all -> 0x04ba }
            r1.append(r0)     // Catch:{ all -> 0x04ba }
            java.lang.String r0 = " audioCodec:"
            r1.append(r0)     // Catch:{ all -> 0x04ba }
            int r0 = r8.audioCodec     // Catch:{ all -> 0x04ba }
            r1.append(r0)     // Catch:{ all -> 0x04ba }
            java.lang.String r0 = " fileFormat:"
            r1.append(r0)     // Catch:{ all -> 0x04ba }
            int r0 = r8.fileFormat     // Catch:{ all -> 0x04ba }
            r1.append(r0)     // Catch:{ all -> 0x04ba }
            java.lang.String r0 = " videoFrameRate:"
            r1.append(r0)     // Catch:{ all -> 0x04ba }
            int r0 = r8.videoFrameRate     // Catch:{ all -> 0x04ba }
            r1.append(r0)     // Catch:{ all -> 0x04ba }
            java.lang.String r13 = " videoBitRate:"
            r1.append(r13)     // Catch:{ all -> 0x04ba }
            int r0 = r8.videoBitRate     // Catch:{ all -> 0x04ba }
            X.C18260x0.A1G(r1, r0)     // Catch:{ all -> 0x04ba }
            android.hardware.Camera r0 = r7.A07     // Catch:{ all -> 0x04ba }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x04ba }
            android.hardware.Camera$Parameters r12 = r0.getParameters()     // Catch:{ all -> 0x04ba }
            java.util.List r24 = r12.getSupportedPreviewSizes()     // Catch:{ all -> 0x04ba }
            if (r24 != 0) goto L_0x009d
            java.util.List r24 = r7.getFallbackSupportedPreviewSizes()     // Catch:{ all -> 0x04ba }
        L_0x009d:
            java.util.List r5 = r12.getSupportedVideoSizes()     // Catch:{ all -> 0x04ba }
            if (r5 != 0) goto L_0x00a5
            r5 = r24
        L_0x00a5:
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x04ba }
            if (r0 == 0) goto L_0x00af
            java.lang.String r0 = "cameraview/prepare-video no supported video sizes"
            goto L_0x049b
        L_0x00af:
            android.hardware.Camera$Size r6 = r12.getPreferredPreviewSizeForVideo()     // Catch:{ all -> 0x04ba }
            if (r6 == 0) goto L_0x014c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04ba }
            java.lang.String r0 = "cameraview/prepare-video preferred video preview size:"
            r1.append(r0)     // Catch:{ all -> 0x04ba }
            int r0 = r6.width     // Catch:{ all -> 0x04ba }
            r1.append(r0)     // Catch:{ all -> 0x04ba }
            r1.append(r11)     // Catch:{ all -> 0x04ba }
            int r0 = r6.height     // Catch:{ all -> 0x04ba }
            X.C18260x0.A1G(r1, r0)     // Catch:{ all -> 0x04ba }
            int r4 = r6.width     // Catch:{ all -> 0x04ba }
            r0 = 176(0xb0, float:2.47E-43)
            if (r4 != r0) goto L_0x00d7
            int r1 = r6.height     // Catch:{ all -> 0x04ba }
            r0 = 144(0x90, float:2.02E-43)
            if (r1 == r0) goto L_0x0151
        L_0x00d7:
            int r0 = r6.height     // Catch:{ all -> 0x04ba }
            int r4 = r4 * r0
        L_0x00da:
            r0 = 34
            X.C86614Ku.A1U(r5, r0)     // Catch:{ all -> 0x04ba }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04ba }
            java.lang.String r0 = "cameraview/prepare-video supported video sizes:"
            r1.append(r0)     // Catch:{ all -> 0x04ba }
            java.lang.String r0 = A02(r5)     // Catch:{ all -> 0x04ba }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x04ba }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04ba }
            java.lang.String r0 = "cameraview/prepare-video supported preview sizes:"
            r1.append(r0)     // Catch:{ all -> 0x04ba }
            java.lang.String r0 = A02(r24)     // Catch:{ all -> 0x04ba }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x04ba }
            android.hardware.Camera$Size r1 = r7.A04     // Catch:{ all -> 0x04ba }
            if (r1 == 0) goto L_0x04b3
            int r0 = r1.width     // Catch:{ all -> 0x04ba }
            double r2 = (double) r0     // Catch:{ all -> 0x04ba }
            int r0 = r1.height     // Catch:{ all -> 0x04ba }
            double r0 = (double) r0     // Catch:{ all -> 0x04ba }
            double r2 = r2 / r0
            java.util.Iterator r14 = r5.iterator()     // Catch:{ all -> 0x04ba }
            r22 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r20 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L_0x0118:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x04ba }
            if (r0 == 0) goto L_0x0155
            java.lang.Object r5 = r14.next()     // Catch:{ all -> 0x04ba }
            android.hardware.Camera$Size r5 = (android.hardware.Camera.Size) r5     // Catch:{ all -> 0x04ba }
            int r1 = r5.width     // Catch:{ all -> 0x04ba }
            r0 = 1280(0x500, float:1.794E-42)
            if (r1 > r0) goto L_0x0118
            r0 = 320(0x140, float:4.48E-43)
            if (r1 < r0) goto L_0x0118
            double r0 = (double) r1     // Catch:{ all -> 0x04ba }
            int r9 = r5.height     // Catch:{ all -> 0x04ba }
            double r9 = (double) r9     // Catch:{ all -> 0x04ba }
            double r0 = r0 / r9
            android.hardware.Camera$Size r9 = r7.A06     // Catch:{ all -> 0x04ba }
            if (r9 == 0) goto L_0x0147
            double r9 = r2 - r0
            double r18 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x04ba }
            double r9 = r2 - r20
            double r16 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x04ba }
            int r9 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r9 > 0) goto L_0x0118
        L_0x0147:
            r7.A06 = r5     // Catch:{ all -> 0x04ba }
            r20 = r0
            goto L_0x0118
        L_0x014c:
            java.lang.String r0 = "cameraview/prepare-video preferred video preview size is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x04ba }
        L_0x0151:
            r4 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00da
        L_0x0155:
            android.hardware.Camera$Size r0 = r7.A06     // Catch:{ all -> 0x04ba }
            if (r0 != 0) goto L_0x015d
            java.lang.String r0 = "cameraview/prepare-video cannot find video size"
            goto L_0x049b
        L_0x015d:
            java.util.Iterator r1 = r24.iterator()     // Catch:{ all -> 0x04ba }
        L_0x0161:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x04ba }
            if (r0 == 0) goto L_0x0178
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x04ba }
            android.hardware.Camera$Size r5 = (android.hardware.Camera.Size) r5     // Catch:{ all -> 0x04ba }
            android.hardware.Camera$Size r0 = r7.A06     // Catch:{ all -> 0x04ba }
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x04ba }
            if (r0 == 0) goto L_0x0161
            if (r5 != 0) goto L_0x0202
            goto L_0x0179
        L_0x0178:
            r5 = 0
        L_0x0179:
            android.hardware.Camera$Size r1 = r7.A06     // Catch:{ all -> 0x04ba }
            int r0 = r1.width     // Catch:{ all -> 0x04ba }
            double r2 = (double) r0     // Catch:{ all -> 0x04ba }
            int r0 = r1.height     // Catch:{ all -> 0x04ba }
            double r0 = (double) r0     // Catch:{ all -> 0x04ba }
            double r2 = r2 / r0
            java.util.Iterator r20 = r24.iterator()     // Catch:{ all -> 0x04ba }
        L_0x0186:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x04ba }
            if (r0 == 0) goto L_0x01bd
            java.lang.Object r14 = r20.next()     // Catch:{ all -> 0x04ba }
            android.hardware.Camera$Size r14 = (android.hardware.Camera.Size) r14     // Catch:{ all -> 0x04ba }
            int r1 = r14.width     // Catch:{ all -> 0x04ba }
            android.hardware.Camera$Size r0 = r7.A06     // Catch:{ all -> 0x04ba }
            int r9 = r0.width     // Catch:{ all -> 0x04ba }
            if (r1 < r9) goto L_0x0186
            int r9 = r14.height     // Catch:{ all -> 0x04ba }
            int r0 = r0.height     // Catch:{ all -> 0x04ba }
            if (r9 < r0) goto L_0x0186
            int r0 = r9 * r1
            if (r0 > r4) goto L_0x0186
            double r0 = (double) r1     // Catch:{ all -> 0x04ba }
            double r9 = (double) r9     // Catch:{ all -> 0x04ba }
            double r0 = r0 / r9
            if (r5 == 0) goto L_0x01b9
            double r9 = r2 - r0
            double r18 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x04ba }
            double r9 = r2 - r22
            double r16 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x04ba }
            int r9 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r9 >= 0) goto L_0x0186
        L_0x01b9:
            r5 = r14
            r22 = r0
            goto L_0x0186
        L_0x01bd:
            if (r5 != 0) goto L_0x0202
            java.lang.String r0 = "cameraview/prepare-video cannot find preview size that is larger than video"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04ba }
            java.util.Iterator r20 = r24.iterator()     // Catch:{ all -> 0x04ba }
        L_0x01c8:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x04ba }
            if (r0 == 0) goto L_0x01f5
            java.lang.Object r14 = r20.next()     // Catch:{ all -> 0x04ba }
            android.hardware.Camera$Size r14 = (android.hardware.Camera.Size) r14     // Catch:{ all -> 0x04ba }
            int r9 = r14.height     // Catch:{ all -> 0x04ba }
            int r1 = r14.width     // Catch:{ all -> 0x04ba }
            int r0 = r9 * r1
            if (r0 > r4) goto L_0x01c8
            double r0 = (double) r1     // Catch:{ all -> 0x04ba }
            double r9 = (double) r9     // Catch:{ all -> 0x04ba }
            double r0 = r0 / r9
            if (r5 == 0) goto L_0x01f1
            double r9 = r2 - r0
            double r18 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x04ba }
            double r9 = r2 - r22
            double r16 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x04ba }
            int r9 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r9 >= 0) goto L_0x01c8
        L_0x01f1:
            r5 = r14
            r22 = r0
            goto L_0x01c8
        L_0x01f5:
            if (r5 != 0) goto L_0x0202
            java.lang.String r0 = "cameraview/prepare-video use preferred video size"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04ba }
            if (r6 != 0) goto L_0x0203
            java.lang.String r0 = "cameraview/prepare-video cannot find preview size"
            goto L_0x049b
        L_0x0202:
            r6 = r5
        L_0x0203:
            android.hardware.Camera$Size r0 = r7.A06     // Catch:{ all -> 0x04ba }
            int r4 = r0.width     // Catch:{ all -> 0x04ba }
            r8.videoFrameWidth = r4     // Catch:{ all -> 0x04ba }
            int r3 = r0.height     // Catch:{ all -> 0x04ba }
            r8.videoFrameHeight = r3     // Catch:{ all -> 0x04ba }
            int r0 = r4 * r3
            int r2 = r0 * 4
            r8.videoBitRate = r2     // Catch:{ all -> 0x04ba }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04ba }
            java.lang.String r0 = "cameraview/prepare-video use profile:"
            X.AnonymousClass6C7.A1J(r0, r11, r1, r4, r3)     // Catch:{ all -> 0x04ba }
            r1.append(r13)     // Catch:{ all -> 0x04ba }
            r1.append(r2)     // Catch:{ all -> 0x04ba }
            java.lang.String r0 = " preview:"
            r1.append(r0)     // Catch:{ all -> 0x04ba }
            int r0 = r6.width     // Catch:{ all -> 0x04ba }
            r1.append(r0)     // Catch:{ all -> 0x04ba }
            r1.append(r11)     // Catch:{ all -> 0x04ba }
            int r0 = r6.height     // Catch:{ all -> 0x04ba }
            X.C18260x0.A1G(r1, r0)     // Catch:{ all -> 0x04ba }
            java.lang.String r1 = "cam_mode"
            r0 = 1
            r12.set(r1, r0)     // Catch:{ all -> 0x04ba }
            java.util.List r2 = r12.getSupportedFocusModes()     // Catch:{ all -> 0x04ba }
            if (r2 == 0) goto L_0x028a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04ba }
            java.lang.String r0 = "cameraview/prepare-video supported focus:"
            r1.append(r0)     // Catch:{ all -> 0x04ba }
            java.lang.Object[] r0 = r2.toArray()     // Catch:{ all -> 0x04ba }
            java.lang.String r0 = java.util.Arrays.deepToString(r0)     // Catch:{ all -> 0x04ba }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x04ba }
            java.lang.String r1 = "continuous-video"
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x04ba }
            if (r0 != 0) goto L_0x0264
            java.lang.String r1 = "infinity"
            boolean r0 = r2.contains(r1)     // Catch:{ all -> 0x04ba }
            if (r0 == 0) goto L_0x0267
        L_0x0264:
            r12.setFocusMode(r1)     // Catch:{ all -> 0x04ba }
        L_0x0267:
            android.hardware.Camera$Size r11 = r7.A04     // Catch:{ all -> 0x04ba }
            int r0 = r11.width     // Catch:{ all -> 0x04ba }
            double r4 = (double) r0     // Catch:{ all -> 0x04ba }
            int r0 = r11.height     // Catch:{ all -> 0x04ba }
            double r2 = (double) r0     // Catch:{ all -> 0x04ba }
            double r13 = r4 / r2
            int r0 = r6.width     // Catch:{ all -> 0x04ba }
            double r0 = (double) r0     // Catch:{ all -> 0x04ba }
            int r9 = r6.height     // Catch:{ all -> 0x04ba }
            double r9 = (double) r9     // Catch:{ all -> 0x04ba }
            double r0 = r0 / r9
            double r13 = r13 - r0
            double r9 = java.lang.Math.abs(r13)     // Catch:{ all -> 0x04ba }
            double r2 = r2 / r4
            double r2 = r2 - r0
            double r0 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x04ba }
            double r3 = java.lang.Math.min(r9, r0)     // Catch:{ all -> 0x04ba }
            r7.A05 = r11     // Catch:{ all -> 0x04ba }
            goto L_0x0290
        L_0x028a:
            java.lang.String r0 = "cameraview/prepare-video supported focus: null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04ba }
            goto L_0x0267
        L_0x0290:
            r1 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r3 = 0
            r2 = 0
            if (r0 <= 0) goto L_0x02b1
            r2 = 1
            java.lang.String r0 = "cameraview/prepare-video restart preview for video"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04ba }
            int r1 = r6.width     // Catch:{ all -> 0x04ba }
            int r0 = r6.height     // Catch:{ all -> 0x04ba }
            r12.setPreviewSize(r1, r0)     // Catch:{ all -> 0x04ba }
            r7.A05 = r6     // Catch:{ all -> 0x04ba }
            android.hardware.Camera r0 = r7.A07     // Catch:{ all -> 0x04ba }
            r0.stopPreview()     // Catch:{ all -> 0x04ba }
            r7.A0M = r3     // Catch:{ all -> 0x04ba }
        L_0x02b1:
            java.lang.String r1 = "on"
            java.lang.String r0 = r7.A0K     // Catch:{ all -> 0x04ba }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04ba }
            if (r0 == 0) goto L_0x02cc
            java.util.List r0 = r12.getSupportedFlashModes()     // Catch:{ all -> 0x04ba }
            if (r0 == 0) goto L_0x02cc
            java.lang.String r1 = "torch"
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x04ba }
            if (r0 == 0) goto L_0x02cc
            r12.setFlashMode(r1)     // Catch:{ all -> 0x04ba }
        L_0x02cc:
            android.hardware.Camera r0 = r7.A07     // Catch:{ all -> 0x04ba }
            r0.setParameters(r12)     // Catch:{ all -> 0x04ba }
            if (r2 == 0) goto L_0x02f1
            java.lang.String r0 = "cameraview/prepare-video restart preview"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04ba }
            android.hardware.Camera r1 = r7.A07     // Catch:{ IOException -> 0x02e0 }
            android.view.SurfaceHolder r0 = r7.A0V     // Catch:{ IOException -> 0x02e0 }
            r1.setPreviewDisplay(r0)     // Catch:{ IOException -> 0x02e0 }
            goto L_0x02e6
        L_0x02e0:
            r1 = move-exception
            java.lang.String r0 = "cameraview/prepare-video  error setting preview display"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x04ba }
        L_0x02e6:
            android.hardware.Camera r0 = r7.A07     // Catch:{ all -> 0x04ba }
            r0.startPreview()     // Catch:{ all -> 0x04ba }
            r0 = 1
            r7.A0M = r0     // Catch:{ all -> 0x04ba }
            r7.requestLayout()     // Catch:{ all -> 0x04ba }
        L_0x02f1:
            android.hardware.Camera r0 = r7.A07     // Catch:{ all -> 0x04ba }
            r0.setPreviewCallbackWithBuffer(r15)     // Catch:{ all -> 0x04ba }
            boolean r0 = r7.A0N     // Catch:{ all -> 0x04ba }
            if (r0 == 0) goto L_0x031f
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x04ba }
            r0 = 27
            if (r1 != r0) goto L_0x031d
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x04ba }
            java.lang.String r0 = "oppo"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ all -> 0x04ba }
            if (r0 == 0) goto L_0x031d
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ all -> 0x04ba }
            java.lang.String r0 = "cph1803"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ all -> 0x04ba }
            if (r0 != 0) goto L_0x031f
            java.lang.String r0 = "cph1901"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ all -> 0x04ba }
            if (r0 == 0) goto L_0x031d
            goto L_0x031f
        L_0x031d:
            r4 = 1
            goto L_0x0320
        L_0x031f:
            r4 = 0
        L_0x0320:
            X.5ZR r0 = r7.A0H     // Catch:{ all -> 0x04ba }
            boolean r2 = r0.A0D()     // Catch:{ all -> 0x04ba }
            java.lang.String r3 = "camerview/prepare-video record audio denied, will record without sound"
            if (r4 == 0) goto L_0x0363
            X.5ZR r0 = r7.A0H     // Catch:{ all -> 0x04ba }
            boolean r0 = r0.A0D()     // Catch:{ all -> 0x04ba }
            if (r0 == 0) goto L_0x035f
            android.media.MediaRecorder r1 = r7.A08     // Catch:{ all -> 0x04ba }
            r0 = 5
            r1.setAudioSource(r0)     // Catch:{ all -> 0x04ba }
        L_0x0338:
            android.media.MediaRecorder r1 = r7.A08     // Catch:{ all -> 0x04ba }
            r0 = 2
            A03(r8, r1, r7, r0, r2)     // Catch:{ all -> 0x04ba }
            android.media.MediaRecorder r1 = r7.A08     // Catch:{ all -> 0x04ba }
            java.lang.String r0 = r26.getAbsolutePath()     // Catch:{ all -> 0x04ba }
            r1.setOutputFile(r0)     // Catch:{ all -> 0x04ba }
        L_0x0347:
            int r0 = r7.getRequiredCameraRotation()     // Catch:{ all -> 0x04ba }
            int r0 = r0 + r27
            int r1 = r0 % 360
            if (r4 == 0) goto L_0x0359
            int r0 = r1 % 180
            if (r0 != 0) goto L_0x0359
            int r0 = r1 + 180
            int r1 = r0 % 360
        L_0x0359:
            android.media.MediaRecorder r0 = r7.A08     // Catch:{ all -> 0x04ba }
            r0.setOrientationHint(r1)     // Catch:{ all -> 0x04ba }
            goto L_0x0399
        L_0x035f:
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ all -> 0x04ba }
            goto L_0x0338
        L_0x0363:
            android.hardware.Camera r0 = r7.A07     // Catch:{ all -> 0x04ba }
            r0.unlock()     // Catch:{ all -> 0x04ba }
            android.media.MediaRecorder r1 = r7.A08     // Catch:{ all -> 0x04ba }
            android.hardware.Camera r0 = r7.A07     // Catch:{ all -> 0x04ba }
            r1.setCamera(r0)     // Catch:{ all -> 0x04ba }
            if (r2 == 0) goto L_0x0372
            goto L_0x0376
        L_0x0372:
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ all -> 0x04ba }
            goto L_0x037c
        L_0x0376:
            android.media.MediaRecorder r1 = r7.A08     // Catch:{ all -> 0x04ba }
            r0 = 5
            r1.setAudioSource(r0)     // Catch:{ all -> 0x04ba }
        L_0x037c:
            android.media.MediaRecorder r1 = r7.A08     // Catch:{ all -> 0x04ba }
            r0 = 1
            A03(r8, r1, r7, r0, r2)     // Catch:{ all -> 0x04ba }
            android.media.MediaRecorder r1 = r7.A08     // Catch:{ all -> 0x04ba }
            java.lang.String r0 = r26.getAbsolutePath()     // Catch:{ all -> 0x04ba }
            r1.setOutputFile(r0)     // Catch:{ all -> 0x04ba }
            android.media.MediaRecorder r1 = r7.A08     // Catch:{ all -> 0x04ba }
            android.view.SurfaceHolder r0 = r7.getHolder()     // Catch:{ all -> 0x04ba }
            android.view.Surface r0 = r0.getSurface()     // Catch:{ all -> 0x04ba }
            r1.setPreviewDisplay(r0)     // Catch:{ all -> 0x04ba }
            goto L_0x0347
        L_0x0399:
            java.lang.String r0 = "cameraview/prepare-video prepare recorder"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0483, IOException -> 0x047b }
            android.media.MediaRecorder r0 = r7.A08     // Catch:{ IllegalStateException -> 0x0483, IOException -> 0x047b }
            r0.prepare()     // Catch:{ IllegalStateException -> 0x0483, IOException -> 0x047b }
            if (r4 == 0) goto L_0x0459
            android.hardware.Camera r0 = r7.A07     // Catch:{ all -> 0x04ba }
            r0.stopPreview()     // Catch:{ all -> 0x04ba }
            android.hardware.Camera r0 = r7.A07     // Catch:{ IOException -> 0x03b0 }
            r0.setPreviewDisplay(r15)     // Catch:{ IOException -> 0x03b0 }
            goto L_0x03b6
        L_0x03b0:
            r1 = move-exception
            java.lang.String r0 = "cameraview/prepare-video error clearing preview display"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x04ba }
        L_0x03b6:
            r0 = 1
            X.0W2 r3 = new X.0W2     // Catch:{ all -> 0x04ba }
            r3.<init>(r0)     // Catch:{ all -> 0x04ba }
            r7.A0B = r3     // Catch:{ all -> 0x04ba }
            android.view.SurfaceHolder r0 = r7.A0V     // Catch:{ all -> 0x04ba }
            android.view.Surface r2 = r0.getSurface()     // Catch:{ all -> 0x04ba }
            r1 = 0
            X.0OZ r0 = new X.0OZ     // Catch:{ all -> 0x04ba }
            r0.<init>(r2, r3, r1)     // Catch:{ all -> 0x04ba }
            r7.A0D = r0     // Catch:{ all -> 0x04ba }
            r0.A00()     // Catch:{ all -> 0x04ba }
            X.0Fh r0 = X.C02210Fh.TEXTURE_EXT     // Catch:{ all -> 0x04ba }
            X.0Mk r1 = new X.0Mk     // Catch:{ all -> 0x04ba }
            r1.<init>(r0)     // Catch:{ all -> 0x04ba }
            X.0NG r0 = new X.0NG     // Catch:{ all -> 0x04ba }
            r0.<init>(r1)     // Catch:{ all -> 0x04ba }
            r7.A0C = r0     // Catch:{ all -> 0x04ba }
            r0 = 1
            int[] r2 = new int[r0]     // Catch:{ all -> 0x04ba }
            r1 = 0
            android.opengl.GLES20.glGenTextures(r0, r2, r1)     // Catch:{ all -> 0x04ba }
            java.lang.String r0 = "glGenTextures"
            X.AnonymousClass0X6.A03(r0)     // Catch:{ all -> 0x04ba }
            r3 = r2[r1]     // Catch:{ all -> 0x04ba }
            r0 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r0, r3)     // Catch:{ all -> 0x04ba }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04ba }
            java.lang.String r0 = "glBindTexture "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)     // Catch:{ all -> 0x04ba }
            X.AnonymousClass0X6.A03(r0)     // Catch:{ all -> 0x04ba }
            r1 = 10241(0x2801, float:1.435E-41)
            r0 = 1175977984(0x46180000, float:9728.0)
            r2 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glTexParameterf(r2, r1, r0)     // Catch:{ all -> 0x04ba }
            r1 = 10240(0x2800, float:1.4349E-41)
            r0 = 1175979008(0x46180400, float:9729.0)
            android.opengl.GLES20.glTexParameterf(r2, r1, r0)     // Catch:{ all -> 0x04ba }
            r0 = 10242(0x2802, float:1.4352E-41)
            r1 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r2, r0, r1)     // Catch:{ all -> 0x04ba }
            r0 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r2, r0, r1)     // Catch:{ all -> 0x04ba }
            java.lang.String r0 = "glTexParameter"
            X.AnonymousClass0X6.A03(r0)     // Catch:{ all -> 0x04ba }
            r7.A02 = r3     // Catch:{ all -> 0x04ba }
            android.graphics.SurfaceTexture r1 = new android.graphics.SurfaceTexture     // Catch:{ all -> 0x04ba }
            r1.<init>(r3)     // Catch:{ all -> 0x04ba }
            r7.A03 = r1     // Catch:{ all -> 0x04ba }
            r3 = 1
            X.90M r0 = new X.90M     // Catch:{ all -> 0x04ba }
            r0.<init>(r7, r3)     // Catch:{ all -> 0x04ba }
            r1.setOnFrameAvailableListener(r0)     // Catch:{ all -> 0x04ba }
            X.0W2 r2 = r7.A0B     // Catch:{ all -> 0x04ba }
            android.media.MediaRecorder r0 = r7.A08     // Catch:{ all -> 0x04ba }
            android.view.Surface r1 = r0.getSurface()     // Catch:{ all -> 0x04ba }
            X.0OZ r0 = new X.0OZ     // Catch:{ all -> 0x04ba }
            r0.<init>(r1, r2, r3)     // Catch:{ all -> 0x04ba }
            r7.A0E = r0     // Catch:{ all -> 0x04ba }
            r0.A00()     // Catch:{ all -> 0x04ba }
            android.hardware.Camera r1 = r7.A07     // Catch:{ IOException -> 0x044e }
            android.graphics.SurfaceTexture r0 = r7.A03     // Catch:{ IOException -> 0x044e }
            r1.setPreviewTexture(r0)     // Catch:{ IOException -> 0x044e }
            goto L_0x0454
        L_0x044e:
            r1 = move-exception
            java.lang.String r0 = "cameraview/prepare-video error setting preview texture"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x04ba }
        L_0x0454:
            android.hardware.Camera r0 = r7.A07     // Catch:{ all -> 0x04ba }
            r0.startPreview()     // Catch:{ all -> 0x04ba }
        L_0x0459:
            java.lang.String r0 = "cameraview/start-video-capture"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x0471 }
            android.media.MediaRecorder r0 = r7.A08     // Catch:{ RuntimeException -> 0x0471 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ RuntimeException -> 0x0471 }
            r0.start()     // Catch:{ RuntimeException -> 0x0471 }
            r0 = 1
            r7.A0P = r0     // Catch:{ RuntimeException -> 0x0471 }
            X.8uQ r0 = r7.A0F     // Catch:{ RuntimeException -> 0x0471 }
            if (r0 == 0) goto L_0x04b1
            r0.BfF()     // Catch:{ RuntimeException -> 0x0471 }
            goto L_0x04b1
        L_0x0471:
            r1 = move-exception
            java.lang.String r0 = "cameraview/start-video-capture failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x04ba }
            r7.A07()     // Catch:{ all -> 0x04ba }
            goto L_0x04ad
        L_0x047b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04ba }
            java.lang.String r0 = "cameraview/prepare-video IOException preparing MediaRecorder: "
            goto L_0x048a
        L_0x0483:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04ba }
            java.lang.String r0 = "cameraview/prepare-video IllegalStateException preparing MediaRecorder: "
        L_0x048a:
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r2)     // Catch:{ all -> 0x04ba }
            com.whatsapp.util.Log.d(r0, r2)     // Catch:{ all -> 0x04ba }
            r7.A07()     // Catch:{ all -> 0x04ba }
            r0 = 1
            r7.A0B(r2, r0)     // Catch:{ all -> 0x04ba }
            goto L_0x049e
        L_0x0499:
            java.lang.String r0 = "cameraview/ no profile"
        L_0x049b:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04ba }
        L_0x049e:
            java.lang.String r0 = "cameraview/start-video-capture failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04ba }
            r7.A07()     // Catch:{ all -> 0x04ba }
            java.lang.String r0 = "CameraCustomException: Start-video-capture failed"
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x04ba }
            r1.<init>(r0)     // Catch:{ all -> 0x04ba }
        L_0x04ad:
            r0 = 1
            r7.A0B(r1, r0)     // Catch:{ all -> 0x04ba }
        L_0x04b1:
            monitor-exit(r7)
            return
        L_0x04b3:
            java.lang.String r0 = "previewSize is NULL"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)     // Catch:{ all -> 0x04ba }
            throw r0     // Catch:{ all -> 0x04ba }
        L_0x04ba:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x04bc }
        L_0x04bc:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132906gD.Bq4(java.io.File, int):void");
    }

    public boolean BqT() {
        return this.A0Q;
    }

    public void Bqx() {
        String str;
        Camera camera = this.A07;
        if (camera != null && this.A0Q) {
            Camera.Parameters parameters = camera.getParameters();
            if (BJ7()) {
                str = "off";
            } else {
                str = "torch";
            }
            parameters.setFlashMode(str);
            camera.setParameters(parameters);
        }
    }

    public int getCameraApi() {
        return 0;
    }

    public int getCameraType() {
        return 0;
    }

    public String getFlashMode() {
        return this.A0K;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        if (r1 == 2) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (r8 == null) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            r11 = r17
            r1 = r18
            r0 = r19
            super.onMeasure(r1, r0)
            int r10 = r11.getMeasuredWidth()
            int r9 = r11.getMeasuredHeight()
            android.hardware.Camera r0 = r11.A07
            java.lang.String r16 = "x"
            if (r0 != 0) goto L_0x002a
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "cameraview/measure/no camera "
            r0 = r16
            X.AnonymousClass6C7.A1J(r1, r0, r2, r10, r9)
            java.lang.String r0 = r2.toString()
        L_0x0026:
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x0029:
            return
        L_0x002a:
            android.hardware.Camera$Size r8 = r11.A05
            if (r8 != 0) goto L_0x0058
            java.util.List r0 = r11.A0L
            if (r0 == 0) goto L_0x0055
            X.33i r0 = r11.A0G
            android.view.WindowManager r0 = r0.A0O()
            android.view.Display r0 = r0.getDefaultDisplay()
            int r1 = r0.getRotation()
            if (r1 == 0) goto L_0x0046
            r0 = 2
            r3 = 0
            if (r1 != r0) goto L_0x0047
        L_0x0046:
            r3 = 1
        L_0x0047:
            java.util.List r2 = r11.A0L
            r1 = r10
            r0 = r9
            if (r3 == 0) goto L_0x004f
            r1 = r9
            r0 = r10
        L_0x004f:
            android.hardware.Camera$Size r8 = A01(r2, r1, r0)
            if (r8 != 0) goto L_0x0058
        L_0x0055:
            java.lang.String r0 = "cameraview/measure/no preview"
            goto L_0x0026
        L_0x0058:
            double r4 = (double) r10
            double r2 = (double) r9
            double r12 = r4 / r2
            int r15 = r8.width
            double r6 = (double) r15
            int r14 = r8.height
            double r0 = (double) r14
            double r6 = r6 / r0
            double r12 = r12 - r6
            double r12 = java.lang.Math.abs(r12)
            double r0 = r2 / r4
            double r0 = r0 - r6
            double r0 = java.lang.Math.abs(r0)
            double r0 = java.lang.Math.min(r12, r0)
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r12 = "cameraview/measure optimalpreviewsize:"
            r6 = r16
            X.AnonymousClass6C7.A1J(r12, r6, r7, r15, r14)
            java.lang.String r12 = " measured:"
            X.AnonymousClass6C7.A1J(r12, r6, r7, r10, r9)
            java.lang.String r6 = " aspect diff:"
            r7.append(r6)
            r7.append(r0)
            X.C18280x3.A14(r7)
            r12 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r6 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r6 <= 0) goto L_0x0029
            boolean r1 = X.C86624Kv.A1W(r10, r9)
            int r13 = r8.width
            int r12 = r8.height
            boolean r0 = X.C86624Kv.A1W(r13, r12)
            r9 = 4607632778762754458(0x3ff199999999999a, double:1.1)
            java.lang.String r6 = " scaleMax:"
            java.lang.String r7 = "cameraview/measure optimalpreviewsize scaleMin:"
            if (r1 != r0) goto L_0x00f0
            double r0 = (double) r13
            double r4 = r4 / r0
            double r0 = (double) r12
            double r2 = r2 / r0
            double r0 = java.lang.Math.min(r4, r2)
            double r2 = java.lang.Math.max(r4, r2)
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0l(r7)
            r4.append(r0)
            r4.append(r6)
            r4.append(r2)
            X.C18280x3.A14(r4)
            double r5 = r2 / r0
            int r4 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r4 > 0) goto L_0x00d1
            r0 = r2
        L_0x00d1:
            int r2 = r8.width
            double r2 = (double) r2
            double r2 = r2 * r0
            int r4 = (int) r2
            int r2 = r8.height
        L_0x00d8:
            double r2 = (double) r2
            double r0 = r0 * r2
            int r2 = (int) r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "cameraview/measure result:"
            r1.append(r0)
            r1.append(r4)
            r0 = r16
            X.C18260x0.A0y(r0, r1, r2)
            r11.setMeasuredDimension(r4, r2)
            return
        L_0x00f0:
            double r0 = (double) r12
            double r4 = r4 / r0
            double r0 = (double) r13
            double r2 = r2 / r0
            double r0 = java.lang.Math.min(r4, r2)
            double r3 = java.lang.Math.max(r4, r2)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r7)
            r2.append(r0)
            r2.append(r6)
            r2.append(r3)
            X.C18280x3.A14(r2)
            double r5 = r3 / r0
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x0113
            r0 = r3
        L_0x0113:
            int r2 = r8.height
            double r2 = (double) r2
            double r2 = r2 * r0
            int r4 = (int) r2
            int r2 = r8.width
            goto L_0x00d8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132906gD.onMeasure(int, int):void");
    }

    public void pause() {
        Log.d("cameraview/pause");
    }

    public void setCameraCallback(C185898uQ r1) {
        this.A0F = r1;
    }

    public void setQrDecodeHints(Map map) {
        this.A0Y.A02 = map;
    }

    public void setQrScanningEnabled(boolean z) {
        this.A0O = z;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (this.A07 == null) {
            return;
        }
        if (this.A0V.getSurface() == null) {
            Log.e("cameraview/surface-changed: no surface");
            A0B(new Exception("CameraCustomException: No surface"), 1);
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("cameraview/surface-changed format:");
        A0o.append(i);
        AnonymousClass001.A1L(A0o);
        A0o.append(i2);
        C18260x0.A0w("x", A0o, i3);
        if (!this.A0P) {
            A0A(surfaceHolder);
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Log.d("cameraview/surface-created");
        Handler handler = this.A09;
        Objects.requireNonNull(handler);
        handler.post(new C117695sL((Object) this, 49));
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Log.d("cameraview/surface-destroyed");
        Handler handler = this.A09;
        Objects.requireNonNull(handler);
        handler.post(new C71553cI((Object) this, 1));
        A07();
    }

    public C132906gD(Context context) {
        super(context);
        C171018Fk r3 = new C171018Fk(this);
        this.A0W = r3;
        SharedPreferences sharedPreferences = getSharedPreferences();
        this.A00 = sharedPreferences.getInt("camera_index", 0);
        this.A0K = sharedPreferences.getString("flash_mode", "off");
        SurfaceHolder holder = getHolder();
        this.A0V = holder;
        holder.addCallback(this);
        holder.setType(3);
        this.A0U = C620633i.A01(context).getDefaultDisplay();
        this.A0X = new AnonymousClass6EQ(context, this);
        this.A0Y = new AnonymousClass7X7(new C171008Fj(this), r3, 5);
    }

    public static int A00(float f) {
        if (f < -995.0f) {
            f = -995.0f;
        } else if (f > 995.0f) {
            f = 995.0f;
        }
        return (int) f;
    }

    public static String A02(List list) {
        StringBuilder A0o = AnonymousClass001.A0o();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Camera.Size size = (Camera.Size) it.next();
            A0o.append(size.width);
            A0o.append('x');
            A0o.append(size.height);
            AnonymousClass001.A1M(A0o);
        }
        if (A0o.length() > 1) {
            A0o.deleteCharAt(A0o.length() - 2);
        }
        return A0o.toString();
    }

    public static void A03(CamcorderProfile camcorderProfile, MediaRecorder mediaRecorder, C132906gD r5, int i, int i2) {
        mediaRecorder.setVideoSource(i);
        MediaRecorder mediaRecorder2 = r5.A08;
        if (i2 != 0) {
            mediaRecorder2.setProfile(camcorderProfile);
            return;
        }
        mediaRecorder2.setOutputFormat(camcorderProfile.fileFormat);
        r5.A08.setVideoFrameRate(camcorderProfile.videoFrameRate);
        r5.A08.setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
        r5.A08.setVideoEncodingBitRate(camcorderProfile.videoBitRate);
        r5.A08.setVideoEncoder(camcorderProfile.videoCodec);
    }

    public final void A0B(Exception exc, int i) {
        C18260x0.A0y("cameraview/on-error ", AnonymousClass001.A0o(), i);
        C185898uQ r1 = this.A0F;
        if (r1 != null) {
            int i2 = 2;
            if (i != 2) {
                i2 = 1;
            }
            r1.BOH(exc, i2);
        }
    }

    public void B3Q(float f, float f2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("cameraview/focus  ");
        A0o.append(f);
        AnonymousClass001.A1L(A0o);
        A0o.append(f2);
        AnonymousClass0x2.A18(A0o);
        Handler handler = this.A09;
        Objects.requireNonNull(handler);
        handler.post(new C117195rX(this, f, f2, 1));
    }

    public int getNumberOfCameras() {
        return Camera.getNumberOfCameras();
    }

    public int getStoredFlashModeCount() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("flash_mode_count");
        return sharedPreferences.getInt(AnonymousClass000.A0h(A0o, this.A00), 0);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0X.enable();
        HandlerThread handlerThread = new HandlerThread("Camera");
        this.A0A = handlerThread;
        handlerThread.start();
        this.A09 = AnonymousClass6C9.A0R(this.A0A);
        if (this.A0O) {
            this.A0Y.A01();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0X.disable();
        HandlerThread handlerThread = this.A0A;
        if (handlerThread != null) {
            handlerThread.quit();
            this.A0A = null;
        }
        this.A0Y.A00();
    }
}
