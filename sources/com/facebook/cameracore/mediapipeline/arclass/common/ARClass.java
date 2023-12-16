package com.facebook.cameracore.mediapipeline.arclass.common;

import X.AnonymousClass9Kz;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public final class ARClass {
    public static final AnonymousClass9Kz Companion = new AnonymousClass9Kz();
    public final HybridData mHybridData;

    public static final native HybridData initHybrid(int i);

    public final native int getValue();

    static {
        SoLoader.A06("arclass");
    }

    public ARClass(int i) {
        this.mHybridData = initHybrid(0);
    }

    public ARClass(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
