package com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation;

import X.AnonymousClass001;
import X.AnonymousClass968;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class MotionDataProviderConfigurationHybrid extends ServiceConfiguration {
    public final AnonymousClass968 mConfiguration;
    public final MotionDataSourceWrapper mMotionDataSourceWrapper;

    public static native HybridData initHybrid(MotionDataSourceWrapper motionDataSourceWrapper);

    public MotionDataProviderConfigurationHybrid(AnonymousClass968 r2) {
        this.mConfiguration = r2;
        throw AnonymousClass001.A0g("getMotionDataSource");
    }

    public MotionDataSourceWrapper getDataSource() {
        return this.mMotionDataSourceWrapper;
    }
}
