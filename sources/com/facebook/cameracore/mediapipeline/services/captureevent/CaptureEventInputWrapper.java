package com.facebook.cameracore.mediapipeline.services.captureevent;

import X.AnonymousClass9Yq;
import X.C202309ll;
import com.facebook.jni.HybridData;

public class CaptureEventInputWrapper {
    public final C202309ll mCaptureEventInput;
    public final HybridData mHybridData = initHybrid(0, 0, 0, 0, 1.0f);

    public static native HybridData initHybrid(int i, int i2, int i3, int i4, float f);

    public native void capturePhoto();

    public native void finishCapturePhoto();

    public native void setCaptureContext(int i);

    public native void setCaptureDevicePosition(int i);

    public native void setCaptureDeviceSize(int i, int i2);

    public native void setEffectSafeAreaInsets(int i, int i2, int i3, int i4);

    public native void setPreviewViewInfo(int i, int i2, float f);

    public native void setRotation(int i);

    public native void setZoomFactor(float f);

    public native void startRecording();

    public native void stopRecording();

    public CaptureEventInputWrapper(C202309ll r3) {
        this.mCaptureEventInput = r3;
        ((AnonymousClass9Yq) r3).A00 = this;
    }
}
