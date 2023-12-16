package com.whatsapp.voipcalling.camera;

import X.C138516qV;
import android.hardware.camera2.CameraDevice;

public class VoipCameraApi2$StopCameraRunnable implements Runnable {
    public final CameraDevice closingCameraDevice;

    public void run() {
        this.closingCameraDevice.close();
        C138516qV.A0J.set(false);
    }

    public VoipCameraApi2$StopCameraRunnable(CameraDevice cameraDevice) {
        this.closingCameraDevice = cameraDevice;
    }
}
