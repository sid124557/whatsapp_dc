package com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common;

import X.C100675Bv;
import X.C162457s7;
import com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig;
import com.facebook.jni.HybridData;

public class ARExperimentConfigImpl extends ARExperimentConfig {
    public final C100675Bv mARExperimentUtil;

    private native HybridData initHybrid();

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r0 == null) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean getBool(int r3, boolean r4) {
        /*
            r2 = this;
            X.5Bv r0 = r2.mARExperimentUtil
            if (r0 == 0) goto L_0x000f
            if (r3 < 0) goto L_0x0010
            X.9JP[] r1 = X.AnonymousClass9M7.A00
            int r0 = r1.length
            if (r3 >= r0) goto L_0x0010
            r0 = r1[r3]
            if (r0 != 0) goto L_0x0012
        L_0x000f:
            return r4
        L_0x0010:
            X.9JP r0 = X.AnonymousClass9JP.A01
        L_0x0012:
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x001e
            r0 = 120(0x78, float:1.68E-43)
            if (r1 == r0) goto L_0x001e
            return r4
        L_0x001e:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl.getBool(int, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r0 == null) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean getBoolWithoutLogging(int r3, boolean r4) {
        /*
            r2 = this;
            X.5Bv r0 = r2.mARExperimentUtil
            if (r0 == 0) goto L_0x000f
            if (r3 < 0) goto L_0x0010
            X.9JP[] r1 = X.AnonymousClass9M7.A00
            int r0 = r1.length
            if (r3 >= r0) goto L_0x0010
            r0 = r1[r3]
            if (r0 != 0) goto L_0x0012
        L_0x000f:
            return r4
        L_0x0010:
            X.9JP r0 = X.AnonymousClass9JP.A01
        L_0x0012:
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x001e
            r0 = 120(0x78, float:1.68E-43)
            if (r1 == r0) goto L_0x001e
            return r4
        L_0x001e:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl.getBoolWithoutLogging(int, boolean):boolean");
    }

    public String getString(int i, String str) {
        if (this.mARExperimentUtil != null) {
            C162457s7.A0J(str, 1);
        }
        return str;
    }

    public ARExperimentConfigImpl(C100675Bv r2) {
        this.mHybridData = initHybrid();
        this.mARExperimentUtil = r2;
    }

    public double getDouble(int i, double d) {
        return d;
    }

    public long getLong(int i, long j) {
        return j;
    }

    public ARExperimentConfigImpl() {
        this.mHybridData = initHybrid();
        this.mARExperimentUtil = null;
    }
}
