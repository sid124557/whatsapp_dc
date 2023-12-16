package com.whatsapp.voipcalling.camera;

import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.nio.ByteBuffer;

public final class VoipCamera {
    public final VoipPhysicalCamera physicalCamera;
    public boolean started = false;
    public final long userIdentity;

    private final native void changeCaptureFormat(int i, int i2, int i3, int i4, long j);

    private final native void pushABGRFrame(int i, int i2, ByteBuffer byteBuffer, int i3, long j);

    private final native void pushFrame(byte[] bArr, int i, long j);

    private final native void pushFramePlane(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, int i6, long j);

    public final void abgrFramePlaneCallback(int i, int i2, ByteBuffer byteBuffer, int i3) {
        pushABGRFrame(i, i2, byteBuffer, i3, this.userIdentity);
    }

    public final synchronized void close() {
        this.physicalCamera.unregisterVirtualCamera(this);
        this.physicalCamera.close(false);
    }

    public final void formatChangeCallback(int i, int i2, int i3, int i4) {
        changeCaptureFormat(i, i2, i3, i4, this.userIdentity);
    }

    public final void framePlaneCallback(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, int i6) {
        pushFramePlane(i, i2, byteBuffer, i3, byteBuffer2, i4, byteBuffer3, i5, i6, this.userIdentity);
    }

    public final synchronized int setVideoPort(VideoPort videoPort) {
        return this.physicalCamera.setVideoPort(videoPort);
    }

    public final synchronized int start() {
        this.started = true;
        return this.physicalCamera.start();
    }

    public final synchronized void stop() {
        this.started = false;
        this.physicalCamera.stop();
    }

    public final void frameCallback(byte[] bArr, int i) {
        pushFrame(bArr, i, this.userIdentity);
    }

    public final int getAverageCaptureFps() {
        return this.physicalCamera.getAverageCaptureFps();
    }

    public VoipPhysicalCamera.CameraInfo getCameraInfo() {
        return this.physicalCamera.getCameraInfo();
    }

    public int getLatestFrame(ByteBuffer byteBuffer) {
        return this.physicalCamera.getLatestFrame(byteBuffer);
    }

    public final boolean getStarted() {
        return this.started;
    }

    public long getUserIdentity() {
        return this.userIdentity;
    }

    public final boolean isPassiveMode() {
        return this.physicalCamera.passiveMode;
    }

    public final boolean useOutputFormatForSecondaryStream() {
        return this.physicalCamera.useOutputFormatForSecondaryStream();
    }

    public VoipCamera(VoipPhysicalCamera voipPhysicalCamera, long j) {
        this.physicalCamera = voipPhysicalCamera;
        this.userIdentity = j;
        voipPhysicalCamera.registerVirtualCamera(this);
    }
}
