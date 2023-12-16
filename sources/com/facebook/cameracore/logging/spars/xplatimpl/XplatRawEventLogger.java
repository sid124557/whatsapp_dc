package com.facebook.cameracore.logging.spars.xplatimpl;

import X.C162457s7;
import X.C18260x0;
import X.C192629Kx;
import X.C201919l4;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public final class XplatRawEventLogger {
    public static final C192629Kx Companion = new C192629Kx();
    public final C201919l4 logWriter;
    public final HybridData mHybridData = initHybrid();

    public XplatRawEventLogger(C201919l4 r2) {
        C162457s7.A0J(r2, 1);
        this.logWriter = r2;
    }

    private final native HybridData initHybrid();

    static {
        SoLoader.A06("camera-xplat-spars-jni");
    }

    public final void logEvent(String str, String str2) {
        C18260x0.A0O(str, str2);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }
}
