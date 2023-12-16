package com.facebook.gputimer;

import X.AnonymousClass000;
import X.AnonymousClass6C8;
import X.AnonymousClass71J;
import X.C162477s9;
import X.C177788gS;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public final class GPUTimerImpl implements C177788gS {
    public static final AnonymousClass71J Companion = new AnonymousClass71J();
    public static final Class TAG;
    public final HybridData mHybridData = initHybrid();

    public static final native HybridData initHybrid();

    public native void beginFrame();

    public native void beginMarker(int i);

    public native int createTimerHandle(String str);

    public native void endFrame();

    public native void endMarker();

    static {
        Class<GPUTimerImpl> cls = GPUTimerImpl.class;
        TAG = cls;
        try {
            if (C162477s9.A01.BI0(3)) {
                C162477s9.A02(cls, StringFormatUtil.formatStrLocaleSafe("Loading library: %s", (Object) "gputimer-jni"));
            }
            SoLoader.A06("gputimer-jni");
            if (C162477s9.A01.BI0(3)) {
                C162477s9.A02(cls, StringFormatUtil.formatStrLocaleSafe("Successfully loaded: %s", (Object) "gputimer-jni"));
            }
        } catch (UnsatisfiedLinkError e) {
            Object[] A1b = AnonymousClass000.A1b("gputimer-jni");
            if (AnonymousClass6C8.A1N()) {
                C162477s9.A0A(cls.getSimpleName(), StringFormatUtil.formatStrLocaleSafe("Failed to load: %s", A1b), e);
            }
        }
    }
}
