package com.facebook.cameracore.mediapipeline.featureconfig;

import X.AnonymousClass9SK;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public final class ProductFeatureConfig {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(boolean z, boolean z2, int i, boolean z3, boolean z4, boolean z5);

    static {
        SoLoader.A06("featureconfig");
    }

    public ProductFeatureConfig(AnonymousClass9SK r7) {
        this.mHybridData = initHybrid(true, false, 0, r7.A00, false, false);
    }

    public ProductFeatureConfig(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public ProductFeatureConfig() {
        this(new AnonymousClass9SK());
    }
}
