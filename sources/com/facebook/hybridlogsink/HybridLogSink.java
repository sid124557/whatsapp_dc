package com.facebook.hybridlogsink;

import X.C153887cB;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public final class HybridLogSink {
    public static final C153887cB Companion = new C153887cB();
    public final HybridData mHybridData = initHybrid(1000);

    public static final native HybridData initHybrid(int i);

    public final native String[] getLogMessages();

    static {
        SoLoader.A06("hybridlogsinkjni");
    }
}
