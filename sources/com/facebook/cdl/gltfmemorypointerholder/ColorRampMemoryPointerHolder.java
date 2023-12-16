package com.facebook.cdl.gltfmemorypointerholder;

import X.AnonymousClass717;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public final class ColorRampMemoryPointerHolder {
    public static final AnonymousClass717 Companion = new AnonymousClass717();
    public final HybridData mHybridData = initHybrid();

    private final native HybridData initHybrid();

    static {
        SoLoader.A06("gltfholdernew");
    }
}
