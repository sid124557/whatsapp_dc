package com.facebook.cameracore.mediapipeline.services.captureevent;

import X.AnonymousClass96I;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class CaptureEventServiceConfigurationHybrid extends ServiceConfiguration {
    public final CaptureEventInputWrapper mCaptureEventInputWrapper;
    public final AnonymousClass96I mConfiguration;

    public static native HybridData initHybrid(CaptureEventInputWrapper captureEventInputWrapper);

    public CaptureEventServiceConfigurationHybrid(AnonymousClass96I r3) {
        this.mConfiguration = r3;
        CaptureEventInputWrapper captureEventInputWrapper = new CaptureEventInputWrapper(r3.A00);
        this.mCaptureEventInputWrapper = captureEventInputWrapper;
        this.mHybridData = initHybrid(captureEventInputWrapper);
    }
}
