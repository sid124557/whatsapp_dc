package org.pjsip;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass1VX;
import X.AnonymousClass646;
import X.AnonymousClass6C7;
import X.AnonymousClass7U1;
import X.AnonymousClass7UJ;
import X.AnonymousClass7X0;
import X.AnonymousClass7YV;
import X.AnonymousClass91H;
import X.C106005Xg;
import X.C171948Ja;
import X.C18260x0;
import X.C18280x3;
import X.C185758uC;
import X.C186168ur;
import X.C187958y5;
import X.C1893891c;
import X.C195649Yz;
import X.C620633i;
import X.C626936e;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.Image;
import android.media.ImageReader;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.camera.VoipCamera;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class PjCamera extends VoipPhysicalCamera implements Camera.PreviewCallback {
    public volatile Point adjustedPreviewSize;
    public final int camIdx;
    public Camera camera;
    public final VoipPhysicalCamera.CameraInfo cameraInfo;
    public final AtomicInteger cameraStartMode = new AtomicInteger(0);
    public final Object frameLock = AnonymousClass002.A0D();
    public boolean isRunning;
    public volatile byte[] lastCachedFrameData;
    public volatile boolean newFrameAvailable;
    public boolean receivedCameraError = false;
    public final C620633i systemServices;

    private int tryNextStartModeOnCameraThread() {
        this.isRunning = false;
        this.cameraStartMode.incrementAndGet();
        stopOnCameraThread();
        if (this.passiveMode || this.cameraStartMode.get() > 2) {
            return -8;
        }
        return startOnCameraThread();
    }

    private int preparePreviewOnCameraThread() {
        C626936e.A06(this.videoPort);
        VoipPhysicalCamera.CameraInfo cameraInfo2 = this.cameraInfo;
        createTexture(cameraInfo2.width, cameraInfo2.height);
        try {
            C186168ur r1 = this.cameraProcessor;
            if (r1 != null && this.textureHolder != null && this.cameraProcessorEnabled) {
                AnonymousClass7U1 r0 = ((C171948Ja) r1).A09;
                SurfaceTexture surfaceTexture = r0.A04;
                if (surfaceTexture == null) {
                    surfaceTexture = r0.A00();
                }
                VoipPhysicalCamera.CameraInfo cameraInfo3 = this.cameraInfo;
                surfaceTexture.setDefaultBufferSize(cameraInfo3.width, cameraInfo3.height);
                Camera camera2 = this.camera;
                C626936e.A06(camera2);
                camera2.setPreviewTexture(surfaceTexture);
                Log.d("voip/video/VoipCamera/ Camera Processor: GPU-frame Camera -> Processor channel set up");
            } else if (this.textureHolder != null) {
                Camera camera3 = this.camera;
                C626936e.A06(camera3);
                camera3.setPreviewTexture(this.textureHolder.A01);
            } else {
                Log.e("voip/video/VoipCamera/ Failed to create Surface Texture");
                this.cameraProcessor = null;
                return -12;
            }
            this.videoPort.setScaleType(0);
            return 0;
        } catch (IOException e) {
            Log.e((Throwable) e);
            return -2;
        }
    }

    private void stopPreviewOnCameraThread(boolean z) {
        if (z && !this.receivedCameraError) {
            try {
                Camera camera2 = this.camera;
                C626936e.A06(camera2);
                camera2.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
                this.camera.stopPreview();
            } catch (RuntimeException e) {
                Log.e("voip/video/VoipCamera/stopPreviewOnCameraThread exception while calling stopPreview", e);
            }
        }
        releaseTexture();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r1.getRotation() == 2) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateAdjustedPreviewSizeOnCameraThread() {
        /*
            r5 = this;
            X.33i r0 = r5.systemServices
            android.view.WindowManager r0 = r0.A0O()
            android.view.Display r1 = r0.getDefaultDisplay()
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r5.cameraInfo
            int r0 = r0.orientation
            int r0 = r0 % 180
            r4 = 1
            boolean r3 = X.AnonymousClass000.A1T(r0)
            int r0 = r1.getRotation()
            if (r0 == 0) goto L_0x0023
            int r2 = r1.getRotation()
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x0024
        L_0x0023:
            r0 = 1
        L_0x0024:
            if (r3 == r0) goto L_0x0027
            r4 = 0
        L_0x0027:
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r5.cameraInfo
            if (r4 == 0) goto L_0x0037
            int r2 = r0.width
            int r1 = r0.height
        L_0x002f:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r2, r1)
            r5.adjustedPreviewSize = r0
            return
        L_0x0037:
            int r2 = r0.height
            int r1 = r0.width
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCamera.updateAdjustedPreviewSizeOnCameraThread():void");
    }

    /* access modifiers changed from: private */
    public int updatePreviewOrientationOnCameraThread() {
        int i;
        if (this.videoPort == null || !this.isRunning) {
            return -1;
        }
        int rotation = this.systemServices.A0O().getDefaultDisplay().getRotation();
        if (rotation == 1) {
            i = 90;
        } else if (rotation != 2) {
            i = 270;
            if (rotation != 3) {
                i = 0;
            }
        } else {
            i = 180;
        }
        VoipPhysicalCamera.CameraInfo cameraInfo2 = this.cameraInfo;
        boolean z = cameraInfo2.isFrontCamera;
        int i2 = cameraInfo2.orientation;
        int i3 = (i2 - i) + 360;
        if (z) {
            i3 = 360 - ((i2 + i) % 360);
        }
        int i4 = i3 % 360;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("voip/video/VoipCamera/updatePreviewOrientationOnCameraThread to ");
        A0o.append(i4);
        A0o.append(" degree. Camera #");
        A0o.append(this.camIdx);
        A0o.append(", facing front: ");
        A0o.append(z);
        A0o.append(", camera orientation: ");
        A0o.append(i2);
        C18260x0.A0y(", activity rotation: ", A0o, i);
        try {
            Camera camera2 = this.camera;
            C626936e.A06(camera2);
            camera2.setDisplayOrientation(i4);
        } catch (Exception e) {
            Log.e((Throwable) e);
        }
        updateAdjustedPreviewSizeOnCameraThread();
        return 0;
    }

    public void closeOnCameraThread() {
        Log.i("voip/video/VoipCamera/closeOnCameraThread");
        C626936e.A0D(!this.isRunning, "close should only be called after stop.");
        this.cameraEventsDispatcher.A00();
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int disableAREffectOnCameraThread() {
        /*
            r7 = this;
            java.lang.String r0 = "voip/video/VoipCamera/ Disabling AREffect"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r7.cameraProcessorEnabled
            r6 = 0
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "voip/video/VoipCamera/ AREffect already disabled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x000f:
            return r6
        L_0x0010:
            X.8ur r0 = r7.cameraProcessor
            r2 = 1
            boolean r1 = X.AnonymousClass000.A1W(r0)
            java.lang.String r0 = "Camera processor should not be null when cameraProcessorEnabled is true"
            X.C626936e.A0D(r1, r0)
            r7.cameraProcessorEnabled = r6
            X.8ur r0 = r7.cameraProcessor
            if (r0 == 0) goto L_0x0034
            r1 = 0
            r0.BmP(r1, r1)
            X.8ur r0 = r7.cameraProcessor
            r0.BmC(r1, r1)
            X.8ur r0 = r7.cameraProcessor
            X.8Ja r0 = (X.C171948Ja) r0
            X.9Yz r0 = r0.A06
            r0.pause()
        L_0x0034:
            boolean r0 = r7.isRunning
            if (r0 == 0) goto L_0x005c
            com.whatsapp.voipcalling.VideoPort r0 = r7.videoPort
            if (r0 == 0) goto L_0x003d
            r6 = 1
        L_0x003d:
            java.lang.String r0 = "videoPort should not be null if the camera is running."
            X.C626936e.A0D(r6, r0)
            java.lang.String r0 = "voip/video/VoipCamera/ Restarting camera preview due to AREffect disabled"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r7.stopPreviewOnCameraThread(r2)
            int r6 = r7.preparePreviewOnCameraThread()
            if (r6 == 0) goto L_0x007c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/video/VoipCamera/ Disabling AREffect: preparePreviewOnCameraThread failed with "
            X.C18260x0.A0x(r0, r1, r6)
            r7.stopOnCameraThread()
        L_0x005c:
            java.util.Map r0 = r7.virtualCameras
            java.util.Iterator r5 = X.AnonymousClass001.A0v(r0)
        L_0x0062:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x000f
            java.lang.Object r4 = r5.next()
            com.whatsapp.voipcalling.camera.VoipCamera r4 = (com.whatsapp.voipcalling.camera.VoipCamera) r4
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r7.cameraInfo
            int r3 = r0.width
            int r2 = r0.height
            int r1 = r0.format
            int r0 = r0.fps1000
            r4.formatChangeCallback(r3, r2, r1, r0)
            goto L_0x0062
        L_0x007c:
            android.hardware.Camera r0 = r7.camera
            X.C626936e.A06(r0)
            r0.setPreviewCallback(r7)
            int r6 = r7.updatePreviewOrientationOnCameraThread()
            android.hardware.Camera r0 = r7.camera
            r0.startPreview()
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCamera.disableAREffectOnCameraThread():int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int enableAREffectOnCameraThread(X.C106005Xg r8, X.AnonymousClass646 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "voip/video/VoipCamera/ Enabling AREffect"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r1 = r7.cameraProcessorEnabled
            r6 = 0
            X.8ur r0 = r7.cameraProcessor
            if (r1 == 0) goto L_0x0018
            X.C626936e.A06(r0)
            r0.BmC(r9, r8)
            java.lang.String r0 = "voip/video/VoipCamera/ AREffect already enabled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0017:
            return r6
        L_0x0018:
            r2 = -11
            if (r0 != 0) goto L_0x002b
            r7.setupCameraProcessor()
            X.8ur r0 = r7.cameraProcessor
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "voip/video/VoipCamera/ Failed to set AREffect. No Camera Processor!"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r7.cameraProcessorEnabled = r6
            return r2
        L_0x002b:
            r0.start()
        L_0x002e:
            r5 = 1
            r7.cameraProcessorEnabled = r5
            X.8ur r4 = r7.cameraProcessor
            android.os.Handler r3 = r7.cameraThreadHandler
            r1 = 3
            X.90K r0 = new X.90K
            r0.<init>(r7, r1)
            r4.BmP(r0, r3)
            X.8ur r0 = r7.cameraProcessor
            r0.BmC(r9, r8)
            boolean r0 = r7.isRunning
            if (r0 == 0) goto L_0x008e
            com.whatsapp.voipcalling.VideoPort r0 = r7.videoPort
            if (r0 == 0) goto L_0x004c
            r6 = 1
        L_0x004c:
            java.lang.String r0 = "videoPort should not be null if the camera is running."
            X.C626936e.A0D(r6, r0)
            java.lang.String r0 = "voip/video/VoipCamera/ Enable AREffect: Restarting camera"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r7.stopPreviewOnCameraThread(r5)
            int r0 = r7.preparePreviewOnCameraThread()
            if (r0 != 0) goto L_0x0075
            X.8ur r0 = r7.cameraProcessor
            if (r0 != 0) goto L_0x0077
            java.lang.String r0 = "voip/video/VoipCamera/ Failed to attach cameraProcessor. Will fail this call and stop camera"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0068:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/video/VoipCamera/ Enable AREffect: Failed to preparePreviewOnCameraThread with "
            X.C18260x0.A0x(r0, r1, r2)
            r7.stopOnCameraThread()
            return r2
        L_0x0075:
            r2 = r0
            goto L_0x0068
        L_0x0077:
            android.hardware.Camera r1 = r7.camera
            X.C626936e.A06(r1)
            r0 = 0
            r1.setPreviewCallback(r0)
            java.lang.String r0 = "voip/video/VoipCamera/ Camera Processor: CPU-frame channel setup"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            int r6 = r7.updatePreviewOrientationOnCameraThread()
            android.hardware.Camera r0 = r7.camera
            r0.startPreview()
        L_0x008e:
            java.util.Map r0 = r7.virtualCameras
            java.util.Iterator r4 = X.AnonymousClass001.A0v(r0)
        L_0x0094:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0017
            java.lang.Object r3 = r4.next()
            com.whatsapp.voipcalling.camera.VoipCamera r3 = (com.whatsapp.voipcalling.camera.VoipCamera) r3
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r7.cameraInfo
            int r2 = r0.width
            int r1 = r0.height
            int r0 = r0.fps1000
            r3.formatChangeCallback(r2, r1, r5, r0)
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCamera.enableAREffectOnCameraThread(X.5Xg, X.646):int");
    }

    public Point getAdjustedPreviewSize() {
        return this.adjustedPreviewSize;
    }

    public VoipPhysicalCamera.CameraInfo getCameraInfo() {
        boolean z = this.cameraProcessorEnabled;
        VoipPhysicalCamera.CameraInfo cameraInfo2 = this.cameraInfo;
        if (z) {
            return new VoipPhysicalCamera.CameraInfo(cameraInfo2.width, cameraInfo2.height, 1, cameraInfo2.fps1000, cameraInfo2.isFrontCamera, cameraInfo2.orientation, cameraInfo2.idx);
        }
        return cameraInfo2;
    }

    public int getCameraStartMode() {
        return this.cameraStartMode.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (r0.isFrontCamera == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r8.cameraProcessorEnabled == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C149957Oo getLastCachedFrame() {
        /*
            r8 = this;
            byte[] r2 = r8.lastCachedFrameData
            if (r2 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            X.8ur r0 = r8.cameraProcessor
            if (r0 == 0) goto L_0x000f
            boolean r0 = r8.cameraProcessorEnabled
            r1 = 1
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = r8.cameraInfo
            int r3 = r0.width
            int r4 = r0.height
            if (r1 == 0) goto L_0x0029
            r5 = 1
        L_0x0019:
            int r6 = r0.orientation
            if (r1 != 0) goto L_0x0022
            boolean r0 = r0.isFrontCamera
            r7 = 1
            if (r0 != 0) goto L_0x0023
        L_0x0022:
            r7 = 0
        L_0x0023:
            X.7Oo r1 = new X.7Oo
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L_0x0029:
            int r5 = r0.format
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCamera.getLastCachedFrame():X.7Oo");
    }

    public int getLatestFrame(ByteBuffer byteBuffer) {
        C626936e.A0D(this.passiveMode, "Should be here only in passive mode");
        if (!this.passiveMode) {
            return -1;
        }
        synchronized (this.frameLock) {
            if (!this.newFrameAvailable) {
                return 0;
            }
            int min = Math.min(byteBuffer.capacity(), this.lastCachedFrameData.length);
            byteBuffer.rewind();
            byteBuffer.order(ByteOrder.nativeOrder());
            byteBuffer.put(this.lastCachedFrameData, 0, min);
            this.newFrameAvailable = false;
            return min;
        }
    }

    public boolean isCameraOpen() {
        return this.isRunning;
    }

    public void onFrameAvailableOnCameraThread() {
        VideoPort videoPort = this.videoPort;
        if (videoPort == null) {
            Log.e("voip/video/VoipCamera/videoPort null while receiving frames");
            return;
        }
        AnonymousClass7X0 r2 = this.textureHolder;
        if (r2 != null) {
            VoipPhysicalCamera.CameraInfo cameraInfo2 = this.cameraInfo;
            videoPort.renderTexture(r2, cameraInfo2.width, cameraInfo2.height);
        }
    }

    public void onPreviewFrame(byte[] bArr, Camera camera2) {
        byte[] bArr2;
        if (camera2 != null && bArr != null) {
            Camera camera3 = this.camera;
            if (camera2 != camera3) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Unexpected camera in callback! current camera = ");
                A0o.append(camera3);
                C18260x0.A1S(A0o, ", callback camera is ", camera2);
                return;
            }
            updateCameraCallbackCheck();
            if (this.isRunning) {
                if (this.passiveMode) {
                    synchronized (this.frameLock) {
                        bArr2 = this.lastCachedFrameData;
                        this.lastCachedFrameData = bArr;
                        this.newFrameAvailable = true;
                    }
                    bArr = bArr2;
                } else {
                    Iterator A0q = AnonymousClass000.A0q(this.virtualCameras);
                    while (A0q.hasNext()) {
                        Map.Entry A0w = AnonymousClass001.A0w(A0q);
                        if (((VoipCamera) A0w.getValue()).started) {
                            ((VoipCamera) A0w.getValue()).frameCallback(bArr, bArr.length);
                        }
                    }
                    this.lastCachedFrameData = bArr;
                }
            }
            if (this.cameraStartMode.get() == 0) {
                camera2.addCallbackBuffer(bArr);
            }
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
            A0o.append(", running: ");
            C18260x0.A1V(A0o, this.isRunning);
            if (!this.isRunning) {
                this.videoPort = videoPort;
                if (!(videoPort == null || (i = startOnCameraThread()) == 0)) {
                    stopOnCameraThread();
                    this.videoPort = videoPort2;
                }
            } else if (videoPort != null) {
                stopPreviewOnCameraThread(true);
                this.videoPort = videoPort;
                if (preparePreviewOnCameraThread() != 0) {
                    stopOnCameraThread();
                    this.videoPort = videoPort2;
                    return -7;
                }
                if (this.cameraProcessor == null || !this.cameraProcessorEnabled) {
                    Camera camera2 = this.camera;
                    C626936e.A06(camera2);
                    camera2.setPreviewCallback(this);
                } else {
                    Camera camera3 = this.camera;
                    C626936e.A06(camera3);
                    camera3.setPreviewCallback((Camera.PreviewCallback) null);
                    Log.d("voip/video/VoipCamera/ camera processor: CPU-frame channel setup");
                }
                int updatePreviewOrientationOnCameraThread = updatePreviewOrientationOnCameraThread();
                this.camera.startPreview();
                return updatePreviewOrientationOnCameraThread;
            } else {
                int stopOnCameraThread = stopOnCameraThread();
                this.videoPort = null;
                return stopOnCameraThread;
            }
        }
        return i;
    }

    public int startOnCameraThread() {
        StringBuilder sb;
        String str;
        List<int[]> supportedPreviewFpsRange;
        if (!this.isRunning) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("voip/video/VoipCamera/startOnCameraThread. ENTER. videoPort = ");
            A0o.append(this.videoPort);
            A0o.append(" at start mode: ");
            C18260x0.A0o(this.cameraStartMode, A0o);
            if (this.camera == null) {
                try {
                    Camera open = Camera.open(this.camIdx);
                    this.camera = open;
                    if (open == null) {
                        Log.e("camera is null after open");
                        return -5;
                    }
                    open.setErrorCallback(new C1893891c(this, 2));
                } catch (Exception e) {
                    Log.e((Throwable) e);
                    return -4;
                }
            }
            if (this.videoPort != null) {
                if (preparePreviewOnCameraThread() != 0) {
                    return -2;
                }
                try {
                    Camera.Parameters parameters = this.camera.getParameters();
                    VoipPhysicalCamera.CameraInfo cameraInfo2 = this.cameraInfo;
                    parameters.setPreviewSize(cameraInfo2.width, cameraInfo2.height);
                    parameters.setPreviewFormat(this.cameraInfo.format);
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("voip/video/VoipCamera/startOnCameraThread setting camera params at start mode: ");
                    A0o2.append(this.cameraStartMode);
                    A0o2.append(" width: ");
                    VoipPhysicalCamera.CameraInfo cameraInfo3 = this.cameraInfo;
                    A0o2.append(cameraInfo3.width);
                    A0o2.append(" height: ");
                    A0o2.append(cameraInfo3.height);
                    A0o2.append(" format: ");
                    C18260x0.A1G(A0o2, cameraInfo3.format);
                    int i = 2;
                    if (this.cameraStartMode.get() > 2) {
                        this.cameraStartMode.set(2);
                    }
                    if (!(this.cameraStartMode.get() == 2 || (supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange()) == null)) {
                        int i2 = Integer.MIN_VALUE;
                        int[] iArr = null;
                        for (int[] next : supportedPreviewFpsRange) {
                            if (next.length == 2) {
                                int i3 = next[0];
                                int i4 = next[1];
                                int fpsRangeScore = VoipPhysicalCamera.fpsRangeScore(i3, i4, this.cameraInfo.fps1000);
                                StringBuilder A0o3 = AnonymousClass001.A0o();
                                AnonymousClass6C7.A1J("voip/video/VoipCamera/startOnCameraThread check fps [", ", ", A0o3, i3, i4);
                                C18260x0.A0y("], score: ", A0o3, fpsRangeScore);
                                if (fpsRangeScore > i2) {
                                    iArr = next;
                                    i2 = fpsRangeScore;
                                }
                            }
                        }
                        if (iArr != null) {
                            StringBuilder A0o4 = AnonymousClass001.A0o();
                            A0o4.append("voip/video/VoipCamera/startOnCameraThread with fps range [");
                            A0o4.append(iArr[0]);
                            A0o4.append(", ");
                            A0o4.append(iArr[1]);
                            A0o4.append("], score: ");
                            A0o4.append(i2);
                            A0o4.append(", supported ranges : ");
                            C18260x0.A1L(A0o4, parameters.get("preview-fps-range-values"));
                            parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                        }
                    }
                    if (this.cameraStartMode.get() == 0) {
                        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
                        if (supportedFocusModes != null) {
                            if (supportedFocusModes.contains("continuous-video")) {
                                parameters.setFocusMode("continuous-video");
                            } else if (supportedFocusModes.contains("infinity")) {
                                parameters.setFocusMode("infinity");
                            }
                        }
                        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
                        if (!(supportedFlashModes == null || parameters.getFlashMode() == null || !supportedFlashModes.contains("off"))) {
                            parameters.setFlashMode("off");
                        }
                        if (parameters.isAutoExposureLockSupported()) {
                            parameters.setAutoExposureLock(false);
                        }
                        if (parameters.isAutoWhiteBalanceLockSupported()) {
                            parameters.setAutoWhiteBalanceLock(false);
                        }
                        StringBuilder A0o5 = AnonymousClass001.A0o();
                        A0o5.append("voip/video/VoipCamera/startOnCameraThread with scene mode: ");
                        A0o5.append(parameters.getSceneMode());
                        A0o5.append(", supported scene mode: [");
                        A0o5.append(parameters.get("scene-mode-values"));
                        A0o5.append("], focus mode: ");
                        A0o5.append(parameters.getFocusMode());
                        A0o5.append(", supported focus mode: [");
                        A0o5.append(parameters.get("focus-mode-values"));
                        A0o5.append("], flash mode: ");
                        A0o5.append(parameters.getFlashMode());
                        A0o5.append(", supported flash mode: [");
                        A0o5.append(parameters.get("flash-mode-values"));
                        A0o5.append("], white balance: ");
                        A0o5.append(parameters.getWhiteBalance());
                        A0o5.append(", supported white balance: [");
                        A0o5.append(parameters.get("whitebalance-values"));
                        A0o5.append("], white balance lock: ");
                        A0o5.append(parameters.getAutoWhiteBalanceLock());
                        A0o5.append(", exposure: ");
                        A0o5.append(parameters.getExposureCompensation());
                        A0o5.append(", supported exposure range: [");
                        A0o5.append(parameters.getMinExposureCompensation());
                        A0o5.append(parameters.getMaxExposureCompensation());
                        A0o5.append("], , exposure lock: ");
                        C18260x0.A1V(A0o5, parameters.getAutoExposureLock());
                    }
                    try {
                        this.camera.setParameters(parameters);
                        this.isRunning = true;
                        this.receivedCameraError = false;
                        if (this.cameraStartMode.get() == 0) {
                            VoipPhysicalCamera.CameraInfo cameraInfo4 = this.cameraInfo;
                            int previewSizeForFormat = getPreviewSizeForFormat(cameraInfo4.width, cameraInfo4.height, cameraInfo4.format);
                            try {
                                this.camera.addCallbackBuffer(new byte[previewSizeForFormat]);
                                if (this.passiveMode) {
                                    this.lastCachedFrameData = new byte[previewSizeForFormat];
                                } else {
                                    i = 1;
                                }
                                StringBuilder A0o6 = AnonymousClass001.A0o();
                                A0o6.append("voip/video/VoipCamera/startOnCameraThread. added ");
                                A0o6.append(i);
                                C18260x0.A0y(" buffers of ", A0o6, previewSizeForFormat);
                                if (this.cameraProcessor == null || !this.cameraProcessorEnabled) {
                                    this.camera.setPreviewCallbackWithBuffer(this);
                                } else {
                                    this.camera.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
                                    Log.i("voip/video/VoipCamera/ Camera Processor: CPU-frame channel setup");
                                }
                            } catch (OutOfMemoryError e2) {
                                e = e2;
                                sb = AnonymousClass001.A0o();
                                str = "voip/video/VoipCamera/startOnCameraThread. OOM when adding callback buffers at start mode: ";
                                sb.append(str);
                                sb.append(this.cameraStartMode);
                                C18260x0.A15(": ", sb, e);
                                return tryNextStartModeOnCameraThread();
                            }
                        } else {
                            StringBuilder A0o7 = AnonymousClass001.A0o();
                            A0o7.append("voip/video/VoipCamera/startOnCameraThread not adding callback buffers at start mode: ");
                            C18260x0.A0o(this.cameraStartMode, A0o7);
                            if (this.cameraProcessor == null || !this.cameraProcessorEnabled) {
                                this.camera.setPreviewCallback(this);
                            } else {
                                this.camera.setPreviewCallback((Camera.PreviewCallback) null);
                                Log.i("voip/video/VoipCamera/ Camera Processor: CPU-frame channel setup");
                            }
                        }
                        updatePreviewOrientationOnCameraThread();
                        try {
                            this.camera.startPreview();
                            StringBuilder A0o8 = AnonymousClass001.A0o();
                            A0o8.append("voip/video/VoipCamera/startOnCameraThread success EXIT at attempt: ");
                            C18260x0.A0o(this.cameraStartMode, A0o8);
                            startPeriodicCameraCallbackCheck();
                            return 0;
                        } catch (Exception e3) {
                            e = e3;
                            sb = AnonymousClass001.A0o();
                            str = "voip/video/VoipCamera/startOnCameraThread/startPreview threw at attempt: ";
                            sb.append(str);
                            sb.append(this.cameraStartMode);
                            C18260x0.A15(": ", sb, e);
                            return tryNextStartModeOnCameraThread();
                        }
                    } catch (RuntimeException e4) {
                        StringBuilder A0o9 = AnonymousClass001.A0o();
                        A0o9.append("voip/video/VoipCamera/startOnCameraThread/setParameters threw at attempt: ");
                        A0o9.append(this.cameraStartMode);
                        C18260x0.A15(": ", A0o9, e4);
                        AnonymousClass7YV r4 = this.cameraEventsDispatcher;
                        int i5 = this.camIdx;
                        Iterator it = r4.A00.iterator();
                        while (it.hasNext()) {
                            ((C185758uC) it.next()).BOJ(r4.A01, i5);
                        }
                        return -3;
                    }
                } catch (RuntimeException e5) {
                    Log.e("voip/video/VoipCamera/startOnCameraThread camera getParameters threw", e5);
                    return -9;
                }
            }
        }
        return 0;
    }

    public int stopOnCameraThread() {
        boolean z = this.isRunning;
        this.isRunning = false;
        stopPeriodicCameraCallbackCheck();
        if (this.camera == null) {
            return -6;
        }
        Log.i("voip/video/VoipCamera/stopOnCameraThread");
        stopPreviewOnCameraThread(z);
        this.camera.release();
        this.camera = null;
        return 0;
    }

    public void updatePreviewOrientation() {
        Log.i("voip/video/VoipCamera/updateCameraPreviewOrientation Enter");
        C18260x0.A0y("voip/video/VoipCamera/updateCameraPreviewOrientation Exit with ", AnonymousClass001.A0o(), AnonymousClass001.A0K(AnonymousClass91H.A00(this, 18)));
    }

    public PjCamera(Context context, AnonymousClass1VX r12, C187958y5 r13, C620633i r14, AnonymousClass7UJ r15, int i, int i2, int i3, int i4, int i5) {
        super(context, r12, r13, r15);
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
        A0o.append(", this ");
        A0o.append(this);
        A0o.append(", class ");
        Class<?> cls = getClass();
        A0o.append(cls);
        C18280x3.A1G(A0o, "@", cls);
        A0o.append(", class loader ");
        Class<PjCamera> cls2 = PjCamera.class;
        A0o.append(cls2.getClassLoader());
        A0o.append(", hash: ");
        C18260x0.A1G(A0o, System.identityHashCode(cls2.getClassLoader()));
        Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
        Camera.getCameraInfo(i6, cameraInfo2);
        this.systemServices = r14;
        this.camIdx = i6;
        this.cameraInfo = new VoipPhysicalCamera.CameraInfo(i7, i8, i9, i10, AnonymousClass000.A1U(cameraInfo2.facing, 1), cameraInfo2.orientation, i6);
    }

    public static int getPreviewSizeForFormat(int i, int i2, int i3) {
        if (i3 != 842094169) {
            return ((i * i2) * ImageFormat.getBitsPerPixel(i3)) / 8;
        }
        int ceil = ((int) Math.ceil(((double) i) / 16.0d)) * 16;
        return Math.max(((i * i2) * 3) / 2, (ceil * i2) + ((((((int) Math.ceil((((double) ceil) / 2.0d) / 16.0d)) * 16) * i2) / 2) * 2));
    }

    /* access modifiers changed from: private */
    public void imageAvailableListener(ImageReader imageReader) {
        Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            if (acquireLatestImage.getPlanes().length == 1 && this.camera != null) {
                updateCameraCallbackCheck();
                byte[] bArr = new byte[(acquireLatestImage.getWidth() * 4 * acquireLatestImage.getHeight())];
                ByteBuffer buffer = acquireLatestImage.getPlanes()[0].getBuffer();
                buffer.rewind();
                buffer.get(bArr);
                if (this.isRunning && !this.passiveMode) {
                    Iterator A0v = AnonymousClass001.A0v(this.virtualCameras);
                    while (A0v.hasNext()) {
                        VoipCamera voipCamera = (VoipCamera) A0v.next();
                        if (voipCamera.started) {
                            Image.Plane plane = acquireLatestImage.getPlanes()[0];
                            voipCamera.abgrFramePlaneCallback(acquireLatestImage.getWidth(), acquireLatestImage.getHeight(), plane.getBuffer(), plane.getRowStride());
                        }
                    }
                    this.lastCachedFrameData = bArr;
                }
            }
            acquireLatestImage.close();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$startOnCameraThread$0(int i, Camera camera2) {
        C18260x0.A0x("camera error occurred: ", AnonymousClass001.A0o(), i);
        this.receivedCameraError = true;
        if (i != 2) {
            AnonymousClass7YV r3 = this.cameraEventsDispatcher;
            if (i != 100) {
                r3.A01();
                return;
            }
            Iterator it = r3.A00.iterator();
            while (it.hasNext()) {
                ((C185758uC) it.next()).BbK(r3.A01);
            }
            return;
        }
        AnonymousClass7YV r32 = this.cameraEventsDispatcher;
        Iterator it2 = r32.A00.iterator();
        while (it2.hasNext()) {
            ((C185758uC) it2.next()).BSW(r32.A01);
        }
    }

    public void startPreview(Camera camera2) {
        camera2.startPreview();
    }
}
