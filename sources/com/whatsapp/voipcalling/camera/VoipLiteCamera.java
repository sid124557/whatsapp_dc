package com.whatsapp.voipcalling.camera;

import X.AnonymousClass646;
import X.C106005Xg;
import X.C149957Oo;
import X.C179818jl;
import X.C626936e;
import android.graphics.Point;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.nio.ByteBuffer;

public final class VoipLiteCamera extends VoipPhysicalCamera implements C179818jl {
    public final VoipPhysicalCamera.CameraInfo cameraInfo;

    public void closeOnCameraThread() {
        Log.e("voip/video/VoipCamera/ Calling dispatcher's on close despite this being a nop wrapper.");
        this.cameraEventsDispatcher.A00();
    }

    public int disableAREffectOnCameraThread() {
        return 0;
    }

    public Point getAdjustedPreviewSize() {
        return null;
    }

    public VoipPhysicalCamera.CameraInfo getCameraInfo() {
        return this.cameraInfo;
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
        return false;
    }

    public void onFrameAvailableOnCameraThread() {
    }

    public void onSurfaceAvailable(Object obj) {
    }

    public void onSurfaceDestroyed(Object obj) {
    }

    public int setVideoPortOnCameraThread(VideoPort videoPort) {
        return 0;
    }

    public int startOnCameraThread() {
        C626936e.A0D(false, "voip/video/VoipCamera/ Used VoipLiteCamera in a build with sgCalling=false");
        Log.e("voip/video/VoipCamera/ Please do not reference VoipLiteCamera without the sgCalling=true param.");
        return -1;
    }

    public int stopOnCameraThread() {
        return 0;
    }

    public void updatePreviewOrientation() {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public VoipLiteCamera(X.AnonymousClass1VX r9, X.C187958y5 r10, X.C620633i r11, X.AnonymousClass7UJ r12, int r13, int r14, int r15, int r16, int r17, android.content.Context r18, boolean r19) {
        /*
            r8 = this;
            X.C18260x0.A0c(r9, r10, r11, r12)
            r0 = 10
            r1 = r18
            X.C162457s7.A0J(r1, r0)
            r8.<init>(r1, r9, r10, r12)
            r5 = 0
            r6 = 90
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r0 = new com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo
            r7 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.cameraInfo = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.camera.VoipLiteCamera.<init>(X.1VX, X.8y5, X.33i, X.7UJ, int, int, int, int, int, android.content.Context, boolean):void");
    }

    public int enableAREffectOnCameraThread(C106005Xg r2, AnonymousClass646 r3) {
        return 0;
    }

    public void onSurfaceSizeChanged(Object obj, int i, int i2) {
    }
}
