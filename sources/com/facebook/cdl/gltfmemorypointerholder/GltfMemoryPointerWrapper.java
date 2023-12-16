package com.facebook.cdl.gltfmemorypointerholder;

import X.AnonymousClass718;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public final class GltfMemoryPointerWrapper {
    public static final AnonymousClass718 Companion = new AnonymousClass718();
    public final HybridData mHybridData = initHybrid();

    private final native HybridData initHybrid();

    static {
        SoLoader.A06("gltfholdernew");
    }
}
