package com.whatsapp.voipcalling.camera;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass2QY;
import X.AnonymousClass646;
import X.AnonymousClass6E3;
import X.AnonymousClass71V;
import X.AnonymousClass75B;
import X.AnonymousClass7EY;
import X.AnonymousClass7UJ;
import X.AnonymousClass7X0;
import X.AnonymousClass7YV;
import X.AnonymousClass8JQ;
import X.AnonymousClass8OW;
import X.AnonymousClass90K;
import X.AnonymousClass90M;
import X.AnonymousClass91H;
import X.AnonymousClass91I;
import X.AnonymousClass91J;
import X.AnonymousClass9Kt;
import X.C100675Bv;
import X.C106005Xg;
import X.C124746Ds;
import X.C130066bK;
import X.C1454776a;
import X.C149957Oo;
import X.C152697Zy;
import X.C158497k4;
import X.C162457s7;
import X.C1680483x;
import X.C171948Ja;
import X.C173038Ob;
import X.C18260x0;
import X.C18290x4;
import X.C18330xA;
import X.C185758uC;
import X.C186168ur;
import X.C187538xN;
import X.C187958y5;
import X.C194949Ve;
import X.C195029Vp;
import X.C195649Yz;
import X.C203659o6;
import X.C626936e;
import X.C70363aN;
import X.C71713cY;
import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.facebook.quicklog.reliability.UserFlowJNIProvider;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class VoipPhysicalCamera {
    public static final int CAMERA_MODE_CONSERVATIVE = 1;
    public static final int CAMERA_MODE_DEFAULT = 0;
    public static final int CAMERA_MODE_NO_FPS_RANGE = 2;
    public static final int ERROR_CAMERA_PROCESSOR_SETUP_ERROR = -11;
    public static final int ERROR_CAMERA_SESSION_CONFIGURING = -10;
    public static final int ERROR_EXCEPTION_IN_CAMERA = -9;
    public static final int ERROR_ILLEGAL_STATE_EXCEPTION = -14;
    public static final int ERROR_INVALID_STATE = -1;
    public static final int ERROR_NO_CAMERA_AFTER_OPEN = -5;
    public static final int ERROR_NO_CAMERA_IN_STOP = -6;
    public static final int ERROR_NO_SURFACE_TEXTURE = -12;
    public static final int ERROR_OPEN_CAMERA = -4;
    public static final int ERROR_POST_TO_LOOPER = -100;
    public static final int ERROR_SECURITY_EXCEPTION = -13;
    public static final int ERROR_SETUP_PREVIEW = -2;
    public static final int ERROR_SET_PARAMETERS = -3;
    public static final int ERROR_START_FINAL_FAILED = -8;
    public static final int ERROR_SWITCH_SURFACE_VIEW = -7;
    public static final int ERROR_SYNC_RUN_TIMEOUT = -99;
    public static final int MESSAGE_LAST_CAMERA_CALLBACK_CHECK = 1;
    public static final int MESSAGE_ON_FRAME_AVAILABLE = 2;
    public static final int MESSAGE_RESEND_LAST_FRAME = 3;
    public static final int SUCCESS = 0;
    public static final String TAG = "voip/video/VoipCamera/";
    public final AnonymousClass1VX abProps;
    public long cameraCallbackCount;
    public final AnonymousClass7YV cameraEventsDispatcher = new AnonymousClass7YV(this);
    public C186168ur cameraProcessor;
    public boolean cameraProcessorEnabled = false;
    public final AnonymousClass7UJ cameraProcessorFactory;
    public HandlerThread cameraThread;
    public final Handler cameraThreadHandler;
    public final Context context;
    public int deviceOrientation = 0;
    public long lastCameraCallbackTs;
    public boolean passiveMode;
    public final C187958y5 systemFeatures;
    public volatile boolean textureApiFailed;
    public AnonymousClass7X0 textureHolder;
    public final long thresholdRestartCameraMillis = 2000;
    public long totalElapsedCameraCallbackTime;
    public VideoPort videoPort;
    public final Map virtualCameras = AnonymousClass001.A0t();

    public final synchronized void close(boolean z) {
        HandlerThread handlerThread;
        Log.i("voip/video/VoipCamera/close Enter");
        if (AnonymousClass001.A1Z(syncRunOnCameraThread(new AnonymousClass8OW(this, z), Boolean.FALSE)) && (handlerThread = this.cameraThread) != null) {
            handlerThread.quit();
            this.cameraThread = null;
        }
        Log.i("voip/video/VoipCamera/close Exit");
    }

    public abstract void closeOnCameraThread();

    public abstract int disableAREffectOnCameraThread();

    public abstract int enableAREffectOnCameraThread(C106005Xg r1, AnonymousClass646 r2);

    public abstract Point getAdjustedPreviewSize();

    public abstract CameraInfo getCameraInfo();

    public abstract int getCameraStartMode();

    public abstract C149957Oo getLastCachedFrame();

    public abstract int getLatestFrame(ByteBuffer byteBuffer);

    public abstract boolean isCameraOpen();

    public void maybeUpdateCameraProcessorOrientation(int i) {
        syncRunOnCameraThread(new AnonymousClass91J(this, i, 2), -100);
    }

    public abstract void onFrameAvailableOnCameraThread();

    public final synchronized int setVideoPort(VideoPort videoPort2) {
        int i;
        Log.i("voip/video/VoipCamera/setVideoPort Enter");
        long A0N = (long) this.abProps.A0N(5655);
        AnonymousClass91I r6 = new AnonymousClass91I(this, 4, videoPort2);
        if (A0N > 0) {
            i = syncRunOnCameraThread(r6, -100, A0N);
        } else {
            i = AnonymousClass0x7.A05(syncRunOnCameraThread(r6, -100));
        }
        C18260x0.A0y("voip/video/VoipCamera/setVideoPort Exit with ", AnonymousClass001.A0o(), i);
        return i;
    }

    public abstract int setVideoPortOnCameraThread(VideoPort videoPort2);

    public final synchronized int start() {
        String str;
        int A05;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("voip/video/VoipCamera/start Enter in ");
        if (this.passiveMode) {
            str = "passive ";
        } else {
            str = "active ";
        }
        A0o.append(str);
        C18260x0.A1L(A0o, "mode");
        A05 = AnonymousClass0x7.A05(AnonymousClass91H.A00(this, 16));
        C18260x0.A0y("voip/video/VoipCamera/start Exit with ", AnonymousClass001.A0o(), A05);
        return A05;
    }

    public abstract int startOnCameraThread();

    public final synchronized void stop() {
        Log.i("voip/video/VoipCamera/stop Enter");
        C18260x0.A0y("voip/video/VoipCamera/stop Exit with ", AnonymousClass001.A0o(), AnonymousClass0x7.A05(AnonymousClass91H.A00(this, 17)));
    }

    public abstract int stopOnCameraThread();

    public abstract void updatePreviewOrientation();

    public class CameraInfo {
        public final int format;
        public final int fps1000;
        public final int height;
        public final int idx;
        public final boolean isFrontCamera;
        public final int orientation;
        public final int width;

        public CameraInfo(int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
            this.width = i;
            this.height = i2;
            this.format = i3;
            this.fps1000 = i4;
            this.isFrontCamera = z;
            this.orientation = i5;
            this.idx = i6;
        }
    }

    private void clearFrameAvailableMessages() {
        this.cameraThreadHandler.removeMessages(2);
    }

    public static int fpsRangeScore(int i, int i2, int i3) {
        int i4;
        if (i <= 5000) {
            i4 = -(5000 - i);
        } else {
            i4 = (-(i - 5000)) * 4;
        }
        return (i4 - AnonymousClass001.A0A(i2, i3)) / 1000;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$close$6(boolean z) {
        if (z) {
            this.virtualCameras.clear();
        }
        if (this.virtualCameras.size() != 0) {
            return Boolean.FALSE;
        }
        closeOnCameraThread();
        return Boolean.TRUE;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Integer lambda$registerVirtualCamera$7(VoipCamera voipCamera) {
        boolean containsKey = this.virtualCameras.containsKey(Long.valueOf(voipCamera.userIdentity));
        Integer A0Z = C18290x4.A0Z();
        if (!containsKey) {
            this.virtualCameras.put(Long.valueOf(voipCamera.userIdentity), voipCamera);
        }
        return A0Z;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Integer lambda$stop$5() {
        int i;
        Iterator A0q = AnonymousClass000.A0q(this.virtualCameras);
        boolean z = true;
        while (true) {
            i = 0;
            if (!A0q.hasNext()) {
                break;
            } else if (((VoipCamera) AnonymousClass0x2.A0W(A0q)).started) {
                z = false;
            }
        }
        if (z) {
            i = stopOnCameraThread();
        }
        return Integer.valueOf(i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Integer lambda$unregisterVirtualCamera$8(VoipCamera voipCamera) {
        int i;
        this.virtualCameras.remove(Long.valueOf(voipCamera.userIdentity));
        if (this.virtualCameras.size() == 0) {
            i = stopOnCameraThread();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    /* access modifiers changed from: private */
    public void maybeUpdateCameraProcessorOrientationOnCameraThread(int i) {
        if (i != this.deviceOrientation) {
            this.deviceOrientation = i;
            if (this.cameraProcessorEnabled && this.cameraProcessor != null) {
                CameraInfo cameraInfo = getCameraInfo();
                C152697Zy r2 = new C152697Zy(cameraInfo.isFrontCamera, cameraInfo.width, cameraInfo.height, cameraInfo.orientation, i * 90);
                AnonymousClass7X0 r1 = this.textureHolder;
                if (r1 != null) {
                    r1.A04 = AnonymousClass0x2.A09(r2.A06) / 90;
                }
                this.cameraProcessor.Brq(r2);
            }
        }
    }

    /* access modifiers changed from: private */
    public void notifyFrameAvailable() {
        this.cameraThreadHandler.sendEmptyMessage(2);
    }

    private final int syncRunOnCameraThread(Callable callable, int i, long j) {
        C130066bK r3 = new C130066bK();
        this.cameraThreadHandler.post(new C71713cY(r3, callable, i, 27));
        try {
            return AnonymousClass001.A0K(r3.get(j, TimeUnit.MILLISECONDS));
        } catch (InterruptedException | ExecutionException unused) {
            r3.cancel(true);
            return i;
        } catch (TimeoutException unused2) {
            this.cameraThread.interrupt();
            r3.cancel(true);
            return -99;
        }
    }

    public final void addCameraEventsListener(C185758uC r3) {
        AnonymousClass7YV r1 = this.cameraEventsDispatcher;
        synchronized (r1) {
            r1.A00.add(r3);
        }
    }

    public final void clearLastFrameResendMessages() {
        this.cameraThreadHandler.removeMessages(3);
    }

    public void createTexture(int i, int i2) {
        C626936e.A0D(AnonymousClass000.A1W(this.videoPort), "videoPort should not be null in createTexture");
        AnonymousClass7X0 r0 = this.textureHolder;
        if (r0 == null) {
            r0 = this.videoPort.createSurfaceTexture();
            this.textureHolder = r0;
            if (r0 == null) {
                Log.e("voip/video/VoipCamera/createSurfaceTexture failed to create SurfaceTexture");
                this.textureApiFailed = true;
                return;
            }
        }
        r0.A01.setOnFrameAvailableListener(new AnonymousClass90M(this, 2));
        int i3 = i;
        int i4 = i2;
        this.textureHolder.A01.setDefaultBufferSize(i3, i4);
        if (this.cameraProcessor != null && this.cameraProcessorEnabled) {
            CameraInfo cameraInfo = getCameraInfo();
            C152697Zy r9 = new C152697Zy(cameraInfo.isFrontCamera, i3, i4, cameraInfo.orientation, this.deviceOrientation * 90);
            this.textureHolder.A04 = AnonymousClass0x2.A09(r9.A06) / 90;
            C186168ur r4 = this.cameraProcessor;
            SurfaceTexture surfaceTexture = this.textureHolder.A01;
            C171948Ja r42 = (C171948Ja) r4;
            if (!C162457s7.A0P(surfaceTexture, r42.A00)) {
                C195649Yz r5 = r42.A06;
                AnonymousClass71V r8 = C187538xN.A00;
                ((C187538xN) r5.B5j(r8)).Bnw(r9.A03, r9.A02, r9.A09);
                ImageReader B8G = ((C187538xN) r5.B5j(r8)).B8G();
                if (B8G != null) {
                    Image acquireLatestImage = B8G.acquireLatestImage();
                    if (acquireLatestImage != null) {
                        acquireLatestImage.close();
                    }
                    B8G.setOnImageAvailableListener(new AnonymousClass90K(r42, 1), r42.A02);
                }
                if (r42.A03 != null) {
                    ((C203659o6) r5.B5j(C203659o6.A00)).B9U().BjB(0, r42.A03);
                }
                r42.A00 = surfaceTexture;
                C194949Ve r2 = new C194949Ve(surfaceTexture);
                r42.A03 = new C1680483x(r42.A07, r2);
                r42.A04 = r2;
                ((C203659o6) r5.B5j(C203659o6.A00)).B9U().AwS(r42.A03, 0);
                r42.Brq(r9);
            }
            Log.d("voip/video/VoipCamera/ Camera Processor: GPU-frame Processor->VideoPort setup");
        }
    }

    public int disableAREffect() {
        Log.i("voip/video/VoipCamera/disableAREffect Enter");
        int A0K = AnonymousClass001.A0K(AnonymousClass91H.A00(this, 15));
        C18260x0.A0y("voip/video/VoipCamera/disableAREffect Exit with ", AnonymousClass001.A0o(), A0K);
        return A0K;
    }

    public int enableAREffect(C106005Xg r4, AnonymousClass646 r5) {
        Log.i("voip/video/VoipCamera/enableAREffect Enter");
        int A0K = AnonymousClass001.A0K(syncRunOnCameraThread(new C173038Ob(r5, r4, this), -100));
        C18260x0.A0y("voip/video/VoipCamera/enableAREffect Exit with ", AnonymousClass001.A0o(), A0K);
        return A0K;
    }

    public final int getAverageCaptureFps() {
        long j = this.totalElapsedCameraCallbackTime;
        if (j <= 0) {
            return 0;
        }
        return (int) ((this.cameraCallbackCount * 1000) / j);
    }

    public long getFrameCount() {
        return this.cameraCallbackCount;
    }

    public long getTotalElapsedCameraCallbackTime() {
        return this.totalElapsedCameraCallbackTime;
    }

    public final boolean isAvatarDriver() {
        return this.abProps.A0X(1402);
    }

    public final boolean isPassiveMode() {
        return this.passiveMode;
    }

    public boolean isTextureApiFailed() {
        return this.textureApiFailed;
    }

    public void onScreenShareInfoChanged(C158497k4 r1) {
    }

    public void releaseTexture() {
        C186168ur r4 = this.cameraProcessor;
        if (r4 != null) {
            C171948Ja r42 = (C171948Ja) r4;
            r42.A00 = null;
            ((C203659o6) r42.A06.B5j(C203659o6.A00)).B9U().BjB(0, r42.A03);
            r42.A03 = null;
            r42.A04 = null;
        }
        if (this.textureHolder != null) {
            C626936e.A0D(AnonymousClass000.A1W(this.videoPort), "videoPort should not be null in releaseTexture");
            this.textureHolder.A01.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
            clearFrameAvailableMessages();
            this.videoPort.releaseSurfaceTexture(this.textureHolder);
            this.textureHolder = null;
        }
    }

    public final void removeCameraEventsListener(C185758uC r3) {
        AnonymousClass7YV r1 = this.cameraEventsDispatcher;
        synchronized (r1) {
            r1.A00.remove(r3);
        }
    }

    public void resendLastFrame() {
    }

    public final void setPassiveMode(boolean z) {
        this.passiveMode = z;
    }

    public void setupCameraProcessor() {
        AnonymousClass7UJ r5;
        if (this.cameraProcessor == null && isAvatarDriver() && (r5 = this.cameraProcessorFactory) != null) {
            Context context2 = this.context;
            C162457s7.A0J(context2, 0);
            C195029Vp.A02 = true;
            AnonymousClass8JQ r0 = r5.A05;
            C1454776a.A00 = r0;
            UserFlowJNIProvider.setUserFlowLogger((UserFlowLogger) r0.A05.getValue());
            AnonymousClass75B r3 = new AnonymousClass75B();
            AnonymousClass2QY r2 = r5.A04;
            this.cameraProcessor = new C171948Ja(context2, AnonymousClass9Kt.A00(context2, r3, new AnonymousClass7EY(r5), new C100675Bv(), r2), r5.A06);
        }
    }

    public final void stopPeriodicCameraCallbackCheck() {
        this.cameraThreadHandler.removeMessages(1);
        this.lastCameraCallbackTs = SystemClock.elapsedRealtime();
    }

    public VoipPhysicalCamera(Context context2, AnonymousClass1VX r4, C187958y5 r5, AnonymousClass7UJ r6) {
        this.context = context2;
        this.abProps = r4;
        this.systemFeatures = r5;
        this.cameraProcessorFactory = r6;
        AnonymousClass6E3 r0 = new AnonymousClass6E3(this);
        this.cameraThread = r0;
        r0.start();
        this.cameraThreadHandler = new C124746Ds(this.cameraThread.getLooper(), this);
    }

    private Object exchange(Exchanger exchanger, Object obj) {
        try {
            return exchanger.exchange(obj);
        } catch (InterruptedException e) {
            throw C18330xA.A09(e);
        }
    }

    private /* synthetic */ Integer lambda$enableAREffect$2(C106005Xg r2, AnonymousClass646 r3) {
        return Integer.valueOf(enableAREffectOnCameraThread(r2, r3));
    }

    private /* synthetic */ Integer lambda$maybeUpdateCameraProcessorOrientation$3(int i) {
        maybeUpdateCameraProcessorOrientationOnCameraThread(i);
        return C18290x4.A0Z();
    }

    private /* synthetic */ Integer lambda$setVideoPort$4(VideoPort videoPort2) {
        return Integer.valueOf(setVideoPortOnCameraThread(videoPort2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$syncRunOnCameraThread$0(Exchanger exchanger, Callable callable) {
        try {
            exchange(exchanger, callable.call());
        } catch (Exception e) {
            throw C18330xA.A09(e);
        }
    }

    public static /* synthetic */ void lambda$syncRunOnCameraThread$1(C130066bK r1, Callable callable, int i) {
        try {
            r1.A05((Integer) callable.call());
        } catch (Exception unused) {
            r1.A05(Integer.valueOf(i));
        }
    }

    public int registerVirtualCamera(VoipCamera voipCamera) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("voip/video/VoipCamera/Add new virtual camera with user identity ");
        C18260x0.A1I(A0o, voipCamera.userIdentity);
        return AnonymousClass001.A0K(syncRunOnCameraThread(new AnonymousClass91I(this, 5, voipCamera), AnonymousClass0x7.A0f()));
    }

    public final void scheduleLastFrameResend(long j) {
        clearLastFrameResendMessages();
        this.cameraThreadHandler.sendEmptyMessageDelayed(3, j);
    }

    public final void startPeriodicCameraCallbackCheck() {
        stopPeriodicCameraCallbackCheck();
        this.cameraThreadHandler.sendEmptyMessageDelayed(1, 1000);
    }

    public int unregisterVirtualCamera(VoipCamera voipCamera) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("voip/video/VoipCamera/Remove virtual camera with user identity ");
        C18260x0.A1I(A0o, voipCamera.userIdentity);
        return AnonymousClass001.A0K(syncRunOnCameraThread(new AnonymousClass91I(this, 6, voipCamera), AnonymousClass0x7.A0f()));
    }

    public final void updateCameraCallbackCheck() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.totalElapsedCameraCallbackTime += elapsedRealtime - this.lastCameraCallbackTs;
        this.lastCameraCallbackTs = elapsedRealtime;
        this.cameraCallbackCount++;
    }

    public final boolean useOutputFormatForSecondaryStream() {
        if (isAvatarDriver() || this.systemFeatures.BIC()) {
            return true;
        }
        return false;
    }

    private /* synthetic */ void lambda$createTexture$9(SurfaceTexture surfaceTexture) {
        notifyFrameAvailable();
    }

    public final Object syncRunOnCameraThread(Callable callable, Object obj) {
        Exchanger exchanger = new Exchanger();
        if (this.cameraThreadHandler.post(new C70363aN(this, exchanger, callable, 32))) {
            return exchange(exchanger, (Object) null);
        }
        return obj;
    }
}
