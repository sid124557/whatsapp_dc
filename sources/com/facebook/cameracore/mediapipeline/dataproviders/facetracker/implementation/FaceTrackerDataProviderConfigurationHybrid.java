package com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation;

import X.AnonymousClass9L2;
import X.C193659Pm;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler;
import com.facebook.jni.HybridData;

public final class FaceTrackerDataProviderConfigurationHybrid extends ServiceConfiguration {
    public static final AnonymousClass9L2 Companion = new AnonymousClass9L2();
    public final C193659Pm configuration;

    public static final native HybridData initHybrid(int i, int i2, String[] strArr, String[] strArr2, String str, FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler faceTrackerDataProviderConfiguration$FaceTrackerErrorHandler, boolean z, Integer num, Integer num2);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FaceTrackerDataProviderConfigurationHybrid(X.C193659Pm r11) {
        /*
            r10 = this;
            X.9Jq r0 = r11.A02
            int r1 = r0.mCppValue
            X.9Js r0 = r11.A00
            int r2 = r0.mCppValue
            java.lang.String[] r3 = r11.A05
            X.C162457s7.A0D(r3)
            java.lang.String[] r4 = r11.A04
            java.lang.String r5 = r11.A03
            com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler r6 = r11.A01
            r8 = 0
            r7 = 0
            r9 = r8
            com.facebook.jni.HybridData r0 = initHybrid(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.<init>(r0)
            r10.configuration = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation.FaceTrackerDataProviderConfigurationHybrid.<init>(X.9Pm):void");
    }
}
