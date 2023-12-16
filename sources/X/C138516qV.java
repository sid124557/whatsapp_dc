package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.camera.VoipCamera;
import com.whatsapp.voipcalling.camera.VoipCameraApi2$StopCameraRunnable;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6qV  reason: invalid class name and case insensitive filesystem */
public class C138516qV extends VoipPhysicalCamera {
    public static final AtomicBoolean A0J = C18280x3.A0l();
    public static final int[] A0K = {2, 0, 1, 3};
    public int A00 = 0;
    public Point A01;
    public CameraDevice A02;
    public Image A03;
    public Surface A04;
    public Runnable A05;
    public ByteBuffer A06;
    public boolean A07 = false;
    public boolean A08 = false;
    public boolean A09 = false;
    public final int A0A;
    public final CameraCharacteristics A0B;
    public final CameraDevice.StateCallback A0C = new AnonymousClass6DG(this);
    public final CameraManager A0D;
    public final ImageReader A0E;
    public final C620633i A0F;
    public final AnonymousClass4FS A0G;
    public final VoipPhysicalCamera.CameraInfo A0H;
    public final Object A0I = AnonymousClass002.A0D();

    public C138516qV(Context context, C620633i r14, AnonymousClass1VX r15, AnonymousClass7UJ r16, C187958y5 r17, AnonymousClass4FS r18, int i, int i2, int i3, int i4, int i5) {
        super(context, r15, r17, r16);
        this.A0F = r14;
        this.A0G = r18;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("voip/video/VoipCamera/create idx: ");
        int i6 = i;
        A0o.append(i6);
        A0o.append(", size:");
        int i7 = i2;
        A0o.append(i7);
        A0o.append("x");
        int i8 = i3;
        A0o.append(i8);
        int i9 = i4;
        AnonymousClass000.A1G(", format: 0x", A0o, i9);
        A0o.append(", fps * 1000: ");
        int i10 = i5;
        A0o.append(i10);
        C18260x0.A1R(A0o, ", api 2, this ", this);
        CameraManager A0E2 = r14.A0E();
        C626936e.A06(A0E2);
        this.A0D = A0E2;
        this.A0A = i6;
        try {
            CameraCharacteristics cameraCharacteristics = A0E2.getCameraCharacteristics(Integer.toString(i6));
            this.A0B = cameraCharacteristics;
            Object obj = cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
            C626936e.A06(obj);
            Object obj2 = cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            C626936e.A06(obj2);
            VoipPhysicalCamera.CameraInfo cameraInfo = new VoipPhysicalCamera.CameraInfo(i7, i8, i9, i10, AnonymousClass000.A1T(AnonymousClass001.A0K(obj2)), ((Number) obj).intValue(), i6);
            this.A0H = cameraInfo;
            ImageReader newInstance = ImageReader.newInstance(cameraInfo.width, cameraInfo.height, cameraInfo.format, 3);
            this.A0E = newInstance;
            if (newInstance != null) {
                AnonymousClass90K r2 = new AnonymousClass90K(this, 2);
                C186168ur r1 = this.cameraProcessor;
                Handler handler = this.cameraThreadHandler;
                if (r1 != null) {
                    r1.BmP(r2, handler);
                    Log.d("voip/video/VoipCamera/ Camera Processor: CPU-frame channel setup");
                } else {
                    newInstance.setOnImageAvailableListener(r2, handler);
                }
                if (C107385bE.A0A()) {
                    this.A09 = A04(context);
                    return;
                }
                return;
            }
            throw AnonymousClass002.A0E("Unable to create image reader");
        } catch (CameraAccessException e) {
            throw C18330xA.A09(e);
        }
    }

    public static final OutputConfiguration A00(Surface surface, long j) {
        OutputConfiguration outputConfiguration = new OutputConfiguration(surface);
        outputConfiguration.setStreamUseCase(j);
        return outputConfiguration;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r0 == r6) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r0 == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r5 != r6) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        r3 = A0K;
        r2 = r3.length;
        r1 = 0;
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r1 >= r2) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        r0 = r3[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r0 != r5) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        r4 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(java.lang.String r5, int r6) {
        /*
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r5.toUpperCase(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -2053249079: goto L_0x0023;
                case -1038134325: goto L_0x002b;
                case 2169487: goto L_0x0033;
                case 787768856: goto L_0x003b;
                case 894099834: goto L_0x0043;
                default: goto L_0x000d;
            }
        L_0x000d:
            r5 = -1
        L_0x000e:
            if (r5 != r6) goto L_0x0012
            r4 = 1
        L_0x0011:
            return r4
        L_0x0012:
            int[] r3 = A0K
            int r2 = r3.length
            r1 = 0
            r4 = 0
        L_0x0017:
            if (r1 >= r2) goto L_0x004d
            r0 = r3[r1]
            if (r0 != r5) goto L_0x001e
            r4 = 1
        L_0x001e:
            if (r0 == r6) goto L_0x0011
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0023:
            java.lang.String r0 = "LEGACY"
            boolean r0 = r1.equals(r0)
            r5 = 2
            goto L_0x004a
        L_0x002b:
            java.lang.String r0 = "EXTERNAL"
            boolean r0 = r1.equals(r0)
            r5 = 4
            goto L_0x004a
        L_0x0033:
            java.lang.String r0 = "FULL"
            boolean r0 = r1.equals(r0)
            r5 = 1
            goto L_0x004a
        L_0x003b:
            java.lang.String r0 = "LEVEL_3"
            boolean r0 = r1.equals(r0)
            r5 = 3
            goto L_0x004a
        L_0x0043:
            java.lang.String r0 = "LIMITED"
            boolean r0 = r1.equals(r0)
            r5 = 0
        L_0x004a:
            if (r0 != 0) goto L_0x000e
            goto L_0x000d
        L_0x004d:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138516qV.A01(java.lang.String, int):boolean");
    }

    public final int A02() {
        Surface surface;
        List singletonList;
        Log.i("voip/video/VoipCamera/ starting camera");
        if (this.A02 == null || this.videoPort == null) {
            return -5;
        }
        AnonymousClass7X0 r2 = this.textureHolder;
        if (r2 == null) {
            VoipPhysicalCamera.CameraInfo cameraInfo = this.A0H;
            createTexture(cameraInfo.width, cameraInfo.height);
            r2 = this.textureHolder;
            if (r2 == null) {
                return -12;
            }
        }
        Surface surface2 = this.A04;
        C186168ur r1 = this.cameraProcessor;
        if (r1 == null || !this.cameraProcessorEnabled) {
            surface = new Surface(r2.A01);
        } else {
            AnonymousClass7U1 r0 = ((C171948Ja) r1).A09;
            SurfaceTexture surfaceTexture = r0.A04;
            if (surfaceTexture == null) {
                surfaceTexture = r0.A00();
            }
            VoipPhysicalCamera.CameraInfo cameraInfo2 = this.A0H;
            surfaceTexture.setDefaultBufferSize(cameraInfo2.width, cameraInfo2.height);
            Log.d("voip/video/VoipCamera/ Camera Processor: GPU-frame camera->processor setup");
            surface = new Surface(surfaceTexture);
        }
        this.A04 = surface;
        A03();
        try {
            CaptureRequest.Builder createCaptureRequest = this.A02.createCaptureRequest(1);
            createCaptureRequest.addTarget(this.A04);
            List A0s = AnonymousClass001.A0s();
            if (!this.cameraProcessorEnabled) {
                ImageReader imageReader = this.A0E;
                createCaptureRequest.addTarget(imageReader.getSurface());
                Surface[] surfaceArr = new Surface[2];
                surfaceArr[0] = this.A04;
                singletonList = AnonymousClass0x9.A1A(imageReader.getSurface(), surfaceArr, 1);
                if (C107385bE.A0A() && this.A09) {
                    OutputConfiguration[] outputConfigurationArr = new OutputConfiguration[2];
                    outputConfigurationArr[0] = A00(this.A04, 1);
                    A0s = AnonymousClass0x9.A1A(A00(imageReader.getSurface(), 5), outputConfigurationArr, 1);
                }
            } else {
                singletonList = Collections.singletonList(this.A04);
                if (C107385bE.A0A() && this.A09) {
                    A0s = Collections.singletonList(A00(this.A04, 4));
                }
            }
            this.A08 = true;
            AnonymousClass6DF r22 = new AnonymousClass6DF(createCaptureRequest, surface2, this);
            if (!C107385bE.A0A() || !this.A09) {
                this.A02.createCaptureSession(singletonList, r22, this.cameraThreadHandler);
                return 0;
            }
            this.A02.createCaptureSession(new SessionConfiguration(0, A0s, new C13660nX(this.cameraThreadHandler), r22));
            return 0;
        } catch (CameraAccessException e) {
            Log.e("startCaptureSessionOnCameraThread", e);
            return -2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r4 == 2) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r5 = this;
            X.33i r0 = r5.A0F
            android.view.WindowManager r0 = r0.A0O()
            android.view.Display r0 = r0.getDefaultDisplay()
            int r4 = r0.getRotation()
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r3 = r5.A0H
            int r0 = r3.orientation
            int r0 = r0 % 180
            boolean r2 = X.AnonymousClass000.A1T(r0)
            if (r4 == 0) goto L_0x001e
            r1 = 2
            r0 = 0
            if (r4 != r1) goto L_0x001f
        L_0x001e:
            r0 = 1
        L_0x001f:
            if (r2 != r0) goto L_0x0035
            int r2 = r3.width
            int r1 = r3.height
        L_0x0025:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r2, r1)
            r5.A01 = r0
            X.7X0 r1 = r5.textureHolder
            if (r1 == 0) goto L_0x0034
            int r0 = 4 - r4
            r1.A05 = r0
        L_0x0034:
            return
        L_0x0035:
            int r2 = r3.height
            int r1 = r3.width
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138516qV.A03():void");
    }

    public final boolean A04(Context context) {
        if (Build.VERSION.SDK_INT != 33 || !Build.MODEL.contains("Pixel") || context.getPackageManager().hasSystemFeature("vendor.android.hardware.camera.stream-usecase")) {
            long[] jArr = (long[]) this.A0B.get(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
            if (jArr != null) {
                int length = jArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (jArr[i] == 5) {
                        Log.i("voip/video/VoipCamera/SCALER_AVAILABLE_STREAM_USE_CASES_VIDEO_CALL available");
                        if (!this.abProps.A0X(2971)) {
                            return false;
                        }
                        return true;
                    } else {
                        i++;
                    }
                }
            }
        } else {
            Log.i("voip/video/VoipCamera/Google Pixel device without stream use case system flag");
        }
        return false;
    }

    public void closeOnCameraThread() {
        int i = this.A00;
        boolean z = true;
        if (!(i == 0 || i == 1)) {
            z = false;
        }
        C626936e.A0D(z, AnonymousClass000.A0Y("closing camera while still open: ", AnonymousClass001.A0o(), i));
        this.cameraEventsDispatcher.A00();
        this.A0E.close();
        synchronized (this.A0I) {
            Image image = this.A03;
            if (image != null) {
                image.close();
                this.A03 = null;
            }
        }
        if (this.cameraProcessorEnabled) {
            this.cameraProcessorEnabled = false;
            C186168ur r0 = this.cameraProcessor;
            if (r0 != null) {
                r0.BmC((AnonymousClass646) null, (C106005Xg) null);
                C195649Yz r02 = ((C171948Ja) this.cameraProcessor).A06;
                r02.pause();
                r02.destroy();
                this.cameraProcessor = null;
            }
        }
    }

    public int disableAREffectOnCameraThread() {
        Log.i("voip/video/VoipCamera/ Disabling AREffect");
        int i = 0;
        if (!this.cameraProcessorEnabled) {
            Log.i("voip/video/VoipCamera/ AREffect already disabled");
        } else if (this.A08) {
            Log.e("voip/video/VoipCamera/ Failed to disable AREffect. Configuring Session!");
            return -10;
        } else {
            if (this.videoPort != null) {
                releaseTexture();
            }
            this.cameraProcessorEnabled = false;
            C186168ur r1 = this.cameraProcessor;
            if (r1 != null) {
                r1.BmC((AnonymousClass646) null, (C106005Xg) null);
                ((C171948Ja) this.cameraProcessor).A06.pause();
            }
            this.A0E.setOnImageAvailableListener(new AnonymousClass90K(this, 2), this.cameraThreadHandler);
            if (this.A00 == 2) {
                Log.d("voip/video/VoipCamera/ Restarting Capture session when disabling AREffect");
                i = A02();
            }
            Iterator A0v = AnonymousClass001.A0v(this.virtualCameras);
            while (A0v.hasNext()) {
                VoipPhysicalCamera.CameraInfo cameraInfo = this.A0H;
                ((VoipCamera) A0v.next()).formatChangeCallback(cameraInfo.width, cameraInfo.height, cameraInfo.format, cameraInfo.fps1000);
            }
        }
        return i;
    }

    public int enableAREffectOnCameraThread(C106005Xg r8, AnonymousClass646 r9) {
        Log.i("voip/video/VoipCamera/ Enabling AREffect");
        int i = 0;
        if (this.cameraProcessorEnabled) {
            C186168ur r0 = this.cameraProcessor;
            C626936e.A06(r0);
            r0.BmC(r9, r8);
            Log.i("voip/video/VoipCamera/ AREffect already enabled.");
        } else if (this.A08) {
            Log.e("voip/video/VoipCamera/ Failed to set AREffect. Configuring Session!");
            return -10;
        } else {
            if (this.videoPort != null) {
                releaseTexture();
            }
            C186168ur r02 = this.cameraProcessor;
            if (r02 == null) {
                setupCameraProcessor();
                C186168ur r2 = this.cameraProcessor;
                if (r2 == null) {
                    Log.e("voip/video/VoipCamera/ Failed to set AREffect. No Camera Processor!");
                    this.cameraProcessorEnabled = false;
                    return -11;
                }
                r2.BmP(new AnonymousClass90K(this, 2), this.cameraThreadHandler);
                Log.d("voip/video/VoipCamera/ Camera Processor: CPU-frame channel setup");
            } else {
                r02.start();
            }
            this.cameraProcessorEnabled = true;
            this.cameraProcessor.BmC(r9, r8);
            if (this.A00 == 2) {
                Log.d("voip/video/VoipCamera/ Restarting capture session to enable AREffect");
                i = A02();
            }
            Iterator A0v = AnonymousClass001.A0v(this.virtualCameras);
            while (A0v.hasNext()) {
                VoipPhysicalCamera.CameraInfo cameraInfo = this.A0H;
                ((VoipCamera) A0v.next()).formatChangeCallback(cameraInfo.width, cameraInfo.height, 1, cameraInfo.fps1000);
            }
        }
        return i;
    }

    public Point getAdjustedPreviewSize() {
        return this.A01;
    }

    public VoipPhysicalCamera.CameraInfo getCameraInfo() {
        boolean z = this.cameraProcessorEnabled;
        VoipPhysicalCamera.CameraInfo cameraInfo = this.A0H;
        if (z) {
            return new VoipPhysicalCamera.CameraInfo(cameraInfo.width, cameraInfo.height, 1, cameraInfo.fps1000, cameraInfo.isFrontCamera, cameraInfo.orientation, cameraInfo.idx);
        }
        return cameraInfo;
    }

    public int getCameraStartMode() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c1, code lost:
        r0 = r2.A0H;
        r9 = r0.width;
        r10 = r0.height;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c7, code lost:
        if (r7 == false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c9, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ca, code lost:
        r12 = r0.orientation;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00cc, code lost:
        if (r7 != false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ce, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d1, code lost:
        if (r0.isFrontCamera != false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d3, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d9, code lost:
        return new X.C149957Oo(r8, r9, r10, r11, r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00da, code lost:
        r11 = r0.format;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C149957Oo getLastCachedFrame() {
        /*
            r18 = this;
            r2 = r18
            java.lang.Object r1 = r2.A0I
            monitor-enter(r1)
            android.media.Image r0 = r2.A03     // Catch:{ all -> 0x00dd }
            if (r0 != 0) goto L_0x000c
            monitor-exit(r1)     // Catch:{ all -> 0x00dd }
            r0 = 0
            return r0
        L_0x000c:
            android.media.Image$Plane[] r0 = r0.getPlanes()     // Catch:{ all -> 0x00dd }
            int r0 = r0.length     // Catch:{ all -> 0x00dd }
            r5 = 0
            r4 = 1
            if (r0 != r4) goto L_0x003c
            r7 = 1
            android.media.Image r0 = r2.A03     // Catch:{ all -> 0x00dd }
            int r0 = r0.getWidth()     // Catch:{ all -> 0x00dd }
            int r3 = r0 * 4
            android.media.Image r0 = r2.A03     // Catch:{ all -> 0x00dd }
            int r0 = r0.getHeight()     // Catch:{ all -> 0x00dd }
            int r3 = r3 * r0
            byte[] r8 = new byte[r3]     // Catch:{ all -> 0x00dd }
            android.media.Image r0 = r2.A03     // Catch:{ all -> 0x00dd }
            android.media.Image$Plane[] r0 = r0.getPlanes()     // Catch:{ all -> 0x00dd }
            r0 = r0[r5]     // Catch:{ all -> 0x00dd }
            java.nio.ByteBuffer r0 = r0.getBuffer()     // Catch:{ all -> 0x00dd }
            r0.rewind()     // Catch:{ all -> 0x00dd }
        L_0x0036:
            r0.get(r8)     // Catch:{ all -> 0x00dd }
            monitor-exit(r1)     // Catch:{ all -> 0x00dd }
            goto L_0x00c1
        L_0x003c:
            r7 = 0
            android.media.Image r0 = r2.A03     // Catch:{ all -> 0x00dd }
            android.media.Image$Plane[] r0 = r0.getPlanes()     // Catch:{ all -> 0x00dd }
            int r3 = r0.length     // Catch:{ all -> 0x00dd }
            r0 = 3
            boolean r3 = X.AnonymousClass000.A1U(r3, r0)
            java.lang.String r0 = "Cached image should either have 1 or 3 planes"
            X.C626936e.A0D(r3, r0)     // Catch:{ all -> 0x00dd }
            android.media.Image r0 = r2.A03     // Catch:{ all -> 0x00dd }
            int r0 = r0.getWidth()     // Catch:{ all -> 0x00dd }
            int r3 = r0 * 3
            android.media.Image r0 = r2.A03     // Catch:{ all -> 0x00dd }
            int r0 = r0.getHeight()     // Catch:{ all -> 0x00dd }
            int r3 = r3 * r0
            r6 = 2
            int r3 = r3 / r6
            java.nio.ByteBuffer r0 = r2.A06     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x0069
            int r0 = r0.capacity()     // Catch:{ all -> 0x00dd }
            if (r0 == r3) goto L_0x006f
        L_0x0069:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r3)     // Catch:{ all -> 0x00dd }
            r2.A06 = r0     // Catch:{ all -> 0x00dd }
        L_0x006f:
            android.media.Image r0 = r2.A03     // Catch:{ all -> 0x00dd }
            android.media.Image$Plane[] r0 = r0.getPlanes()     // Catch:{ all -> 0x00dd }
            r5 = r0[r5]     // Catch:{ all -> 0x00dd }
            android.media.Image r0 = r2.A03     // Catch:{ all -> 0x00dd }
            android.media.Image$Plane[] r0 = r0.getPlanes()     // Catch:{ all -> 0x00dd }
            r4 = r0[r4]     // Catch:{ all -> 0x00dd }
            android.media.Image r0 = r2.A03     // Catch:{ all -> 0x00dd }
            android.media.Image$Plane[] r0 = r0.getPlanes()     // Catch:{ all -> 0x00dd }
            r0 = r0[r6]     // Catch:{ all -> 0x00dd }
            java.nio.ByteBuffer r8 = r5.getBuffer()     // Catch:{ all -> 0x00dd }
            int r9 = r5.getRowStride()     // Catch:{ all -> 0x00dd }
            java.nio.ByteBuffer r10 = r4.getBuffer()     // Catch:{ all -> 0x00dd }
            int r11 = r4.getRowStride()     // Catch:{ all -> 0x00dd }
            java.nio.ByteBuffer r12 = r0.getBuffer()     // Catch:{ all -> 0x00dd }
            int r13 = r0.getRowStride()     // Catch:{ all -> 0x00dd }
            int r14 = r4.getPixelStride()     // Catch:{ all -> 0x00dd }
            android.media.Image r0 = r2.A03     // Catch:{ all -> 0x00dd }
            int r15 = r0.getWidth()     // Catch:{ all -> 0x00dd }
            android.media.Image r0 = r2.A03     // Catch:{ all -> 0x00dd }
            int r16 = r0.getHeight()     // Catch:{ all -> 0x00dd }
            java.nio.ByteBuffer r0 = r2.A06     // Catch:{ all -> 0x00dd }
            r17 = r0
            com.whatsapp.VideoFrameConverter.convertAndroid420toI420(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x00dd }
            byte[] r8 = new byte[r3]     // Catch:{ all -> 0x00dd }
            java.nio.ByteBuffer r0 = r2.A06     // Catch:{ all -> 0x00dd }
            r0.rewind()     // Catch:{ all -> 0x00dd }
            java.nio.ByteBuffer r0 = r2.A06     // Catch:{ all -> 0x00dd }
            goto L_0x0036
        L_0x00c1:
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r2.A0H
            int r9 = r0.width
            int r10 = r0.height
            if (r7 == 0) goto L_0x00da
            r11 = 1
        L_0x00ca:
            int r12 = r0.orientation
            if (r7 != 0) goto L_0x00d3
            boolean r0 = r0.isFrontCamera
            r13 = 1
            if (r0 != 0) goto L_0x00d4
        L_0x00d3:
            r13 = 0
        L_0x00d4:
            X.7Oo r7 = new X.7Oo
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x00da:
            int r11 = r0.format
            goto L_0x00ca
        L_0x00dd:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00dd }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138516qV.getLastCachedFrame():X.7Oo");
    }

    public int getLatestFrame(ByteBuffer byteBuffer) {
        throw AnonymousClass002.A0G("VoipCameraApi2 does not support this operation ATM");
    }

    public boolean isCameraOpen() {
        return AnonymousClass000.A1U(this.A00, 2);
    }

    public void onFrameAvailableOnCameraThread() {
        VideoPort videoPort = this.videoPort;
        if (videoPort == null) {
            Log.e("voip/video/VoipCamera/videoPort null while receiving frames");
            return;
        }
        AnonymousClass7X0 r2 = this.textureHolder;
        if (r2 != null) {
            VoipPhysicalCamera.CameraInfo cameraInfo = this.A0H;
            videoPort.renderTexture(r2, cameraInfo.width, cameraInfo.height);
        }
    }

    public int setVideoPortOnCameraThread(VideoPort videoPort) {
        VideoPort videoPort2 = this.videoPort;
        int i = 0;
        if (videoPort2 != videoPort) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("voip/video/VoipCamera/setVideoPortOnCameraThread to ");
            A0o.append(C18280x3.A04(videoPort));
            A0o.append(" from ");
            A0o.append(C18280x3.A04(videoPort2));
            A0o.append(", status: ");
            C18260x0.A1G(A0o, this.A00);
            if (videoPort == null) {
                stopOnCameraThread();
                this.videoPort = null;
            } else if (this.A08) {
                return -10;
            } else {
                this.videoPort = videoPort;
                videoPort.setScaleType(0);
                int i2 = this.A00;
                if (i2 == 2) {
                    if (videoPort2 != null) {
                        releaseTexture();
                    }
                    i = A02();
                } else if (i2 == 0 || i2 == 1) {
                    i = startOnCameraThread();
                }
                if (i != 0) {
                    this.videoPort = videoPort2;
                    return i;
                }
            }
        }
        return i;
    }

    public int startOnCameraThread() {
        String str;
        int i = this.A00;
        if (!(i == 2 || i == 3 || this.videoPort == null)) {
            if (i == 1) {
                Log.i("voip/video/VoipCamera/ Camera device is not fully closed, create camera device on close");
                this.A07 = true;
            } else if (A0J.get()) {
                Log.i("voip/video/VoipCamera/retryOpen");
                if (this.A05 == null) {
                    C117105rO r3 = new C117105rO(this, 34);
                    this.A05 = r3;
                    this.cameraThreadHandler.postDelayed(r3, 250);
                    return 0;
                }
            } else {
                try {
                    Log.i("voip/video/VoipCamera/ opening camera");
                    this.A0D.openCamera(Integer.toString(this.A0A), this.A0C, this.cameraThreadHandler);
                    this.A00 = 3;
                    if (this.textureHolder == null) {
                        VoipPhysicalCamera.CameraInfo cameraInfo = this.A0H;
                        createTexture(cameraInfo.width, cameraInfo.height);
                        if (this.textureHolder == null) {
                            return -12;
                        }
                    }
                } catch (CameraAccessException e) {
                    e = e;
                    str = "voip/video/VoipCamera/ failed to open camera ";
                    Log.e(str, e);
                    return -4;
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    str = "voip/video/VoipCamera/ failed to open camera due to crashed HAL ";
                    Log.e(str, e);
                    return -4;
                }
            }
        }
        return 0;
    }

    public void updatePreviewOrientation() {
        if (this.videoPort != null) {
            syncRunOnCameraThread(new AnonymousClass91H(this, 14), -100);
        }
    }

    public int stopOnCameraThread() {
        stopPeriodicCameraCallbackCheck();
        CameraDevice cameraDevice = this.A02;
        if (cameraDevice != null) {
            this.A02 = null;
            this.A00 = 1;
            A0J.set(true);
            this.A0G.BkP(new VoipCameraApi2$StopCameraRunnable(cameraDevice));
        }
        Surface surface = this.A04;
        if (surface != null) {
            surface.release();
            this.A04 = null;
        }
        releaseTexture();
        Runnable runnable = this.A05;
        if (runnable != null) {
            this.cameraThreadHandler.removeCallbacks(runnable);
            this.A05 = null;
        }
        this.A07 = false;
        this.A08 = false;
        return 0;
    }
}
