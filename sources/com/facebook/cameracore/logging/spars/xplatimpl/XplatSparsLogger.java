package com.facebook.cameracore.logging.spars.xplatimpl;

import X.C162457s7;
import X.C18260x0;
import X.C192639Ky;
import X.C201919l4;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public final class XplatSparsLogger {
    public static final C192639Ky Companion = new C192639Ky();
    public final HybridData mHybridData = initHybrid();

    public static final native boolean consistencyHelperHasError();

    public static final native int consistencyHelperNumProcessedSessions();

    public static final native void debugExpectSessionOpen(String str);

    public static final native void flushAndDestroyConsistencyHelper();

    public static final native void flushConsistencyHelper();

    public static final native HybridData initHybrid();

    public static final XplatSparsLogger makeInstance(C201919l4 r2) {
        C162457s7.A0J(r2, 0);
        return new XplatSparsLogger(new XplatRawEventLogger(r2));
    }

    public void logSessionClosure(String str, boolean z) {
        C162457s7.A0J(str, 0);
        logSessionClosureNative(str, z);
    }

    public final native void logSessionClosureNative(String str, boolean z);

    public void logSessionCreation(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        C162457s7.A0J(str, 0);
        C18260x0.A0Q(str2, str3);
        C162457s7.A0J(str5, 4);
        String str7 = str6;
        C162457s7.A0J(str7, 6);
        logSessionCreationNative("unknown", str, str2, str3, str4, str5, z, str7);
    }

    public final native void logSessionCreationNative(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7);

    public final native void setRawEventLogger(XplatRawEventLogger xplatRawEventLogger);

    static {
        SoLoader.A06("camera-xplat-spars-jni");
    }

    public XplatSparsLogger(XplatRawEventLogger xplatRawEventLogger) {
        setRawEventLogger(xplatRawEventLogger);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public XplatSparsLogger() {
    }

    public static final XplatSparsLogger makeInstance(XplatRawEventLogger xplatRawEventLogger) {
        XplatSparsLogger xplatSparsLogger;
        if (xplatRawEventLogger != null) {
            return xplatSparsLogger;
        }
        xplatSparsLogger = new XplatSparsLogger();
        return xplatSparsLogger;
    }

    public static final XplatSparsLogger makeInstance() {
        return new XplatSparsLogger();
    }
}
