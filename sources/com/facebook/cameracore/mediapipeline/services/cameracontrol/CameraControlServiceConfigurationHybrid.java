package com.facebook.cameracore.mediapipeline.services.cameracontrol;

import X.AnonymousClass967;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class CameraControlServiceConfigurationHybrid extends ServiceConfiguration {
    public final AnonymousClass967 mConfiguration;

    public static native HybridData initHybrid(CameraControlServiceDelegateWrapper cameraControlServiceDelegateWrapper);
}
