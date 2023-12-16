package com.facebook.cameracore.ardelivery.networkconsentmanager.impl;

import X.C18260x0;
import X.C18270x1;
import X.C192399Jo;
import X.C192549Kn;
import com.facebook.cameracore.ardelivery.networkconsentmanager.interfaces.NetworkConsentStorage;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.common.util.TriState;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public final class NetworkConsentManagerJNI {
    public static final C192549Kn Companion = new C192549Kn();
    public final HybridData mHybridData;

    public static final native HybridData initHybrid(NetworkConsentStorage networkConsentStorage, AnalyticsLogger analyticsLogger);

    private final native void setUserConsent(String str, boolean z, int i);

    public native TriState hasUserAllowedNetworking(String str);

    public void setUserConsent(String str, boolean z, C192399Jo r4) {
        C18270x1.A10(str, 0, r4);
        setUserConsent(str, z, r4.mCppValue);
    }

    static {
        SoLoader.A06("ard-android-network-consent-manager-impl");
    }

    public NetworkConsentManagerJNI(NetworkConsentStorage networkConsentStorage, AnalyticsLogger analyticsLogger) {
        C18260x0.A0Q(networkConsentStorage, analyticsLogger);
        this.mHybridData = initHybrid(networkConsentStorage, analyticsLogger);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }
}
