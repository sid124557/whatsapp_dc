package com.facebook.cameracore.mediapipeline.services.persistence.implementation;

import X.AnonymousClass9L8;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public final class PersistenceServiceModule extends ServiceModule {
    public static final AnonymousClass9L8 Companion = new AnonymousClass9L8();

    public static final native HybridData initHybrid();

    static {
        SoLoader.A06("arpersistenceservice");
    }

    public PersistenceServiceModule() {
        this.mHybridData = initHybrid();
    }
}
