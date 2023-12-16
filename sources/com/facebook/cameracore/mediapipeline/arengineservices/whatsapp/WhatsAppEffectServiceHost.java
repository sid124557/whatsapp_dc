package com.facebook.cameracore.mediapipeline.arengineservices.whatsapp;

import X.AnonymousClass9L1;
import android.content.Context;
import com.facebook.cameracore.mediapipeline.arclass.common.ARClass;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkClient;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.TouchServiceImpl;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchService;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import java.util.List;

public final class WhatsAppEffectServiceHost extends EffectServiceHost {
    public static final AnonymousClass9L1 Companion = new AnonymousClass9L1();
    public final AnalyticsLogger analyticsLogger;
    public final ARExperimentConfig arExperimentConfig;
    public final Context context;
    public final NetworkClient networkClient;
    public TouchService touchService;

    private final native HybridData initHybrid(EffectServiceHostConfig effectServiceHostConfig, AnalyticsLogger analyticsLogger2, NetworkClient networkClient2, ARExperimentConfig aRExperimentConfig, ARClass aRClass, List list);

    public void destroyTouchService() {
        this.touchService = null;
    }

    static {
        SoLoader.A06("graphicsengine-arengineservices-whatsappservicehost-native");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WhatsAppEffectServiceHost(android.content.Context r11, com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig r12, X.C100675Bv r13, com.facebook.cameracore.mediapipeline.arclass.common.ARClass r14, X.AnonymousClass9MZ r15, X.AnonymousClass9PA r16) {
        /*
            r10 = this;
            X.9L0 r5 = new X.9L0
            r5.<init>()
            X.3d3 r6 = X.C72023d3.A00
            r7 = 0
            r2 = r10
            r3 = r11
            r4 = r12
            r8 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10.context = r11
            X.9Jr r0 = X.C192429Jr.OVERRIDE_DISABLE_OPTIMIZED
            com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl r5 = new com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl
            r1 = r16
            r5.<init>(r1, r7, r0)
            r10.analyticsLogger = r5
            com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl r7 = new com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl
            r7.<init>(r13)
            r10.arExperimentConfig = r7
            com.facebook.cameracore.mediapipeline.services.networking.implementation.NetworkClientImpl r6 = new com.facebook.cameracore.mediapipeline.services.networking.implementation.NetworkClientImpl
            r6.<init>(r15)
            r10.networkClient = r6
            java.util.List r9 = r10.mServiceModules
            r8 = r14
            r3 = r10
            com.facebook.jni.HybridData r0 = r3.initHybrid(r4, r5, r6, r7, r8, r9)
            r10.mHybridData = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.arengineservices.whatsapp.WhatsAppEffectServiceHost.<init>(android.content.Context, com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig, X.5Bv, com.facebook.cameracore.mediapipeline.arclass.common.ARClass, X.9MZ, X.9PA):void");
    }

    public TouchService createTouchService() {
        TouchService touchService2 = this.touchService;
        if (touchService2 != null) {
            return touchService2;
        }
        TouchServiceImpl touchServiceImpl = new TouchServiceImpl();
        this.touchService = touchServiceImpl;
        return touchServiceImpl;
    }

    public void destroy() {
        super.destroy();
        this.arExperimentConfig.mHybridData.resetNative();
        AnalyticsLoggerImpl analyticsLoggerImpl = (AnalyticsLoggerImpl) this.analyticsLogger;
        analyticsLoggerImpl.mHybridData.resetNative();
        analyticsLoggerImpl.mCameraARAnalyticsLogger = null;
        HybridData hybridData = this.networkClient.mHybridData;
        if (hybridData != null) {
            hybridData.resetNative();
        }
    }
}
