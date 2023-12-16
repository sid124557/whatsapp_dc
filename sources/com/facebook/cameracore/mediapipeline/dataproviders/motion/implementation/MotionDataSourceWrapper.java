package com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation;

import X.AnonymousClass001;
import X.C201929l5;
import com.facebook.jni.HybridData;

public class MotionDataSourceWrapper {
    public final C201929l5 mDataSource;
    public final HybridData mHybridData = initHybrid();
    public boolean mIsAlive = true;

    private native HybridData initHybrid();

    private native void setData(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, long j);

    private native void setRawSensorResult(int i, float[] fArr, long j);

    public void destroy() {
        this.mIsAlive = false;
        this.mHybridData.resetNative();
    }

    public int getExecutionMode() {
        throw AnonymousClass001.A0g("getExecutionMode");
    }

    public boolean hasRawData() {
        throw AnonymousClass001.A0g("hasRawData");
    }

    public boolean isSensorAvailable(int i) {
        throw AnonymousClass001.A0g("isSensorAvailable");
    }

    public void start() {
        throw AnonymousClass001.A0g("start");
    }

    public void stop() {
        throw AnonymousClass001.A0g("stop");
    }

    public MotionDataSourceWrapper(C201929l5 r2) {
        this.mDataSource = r2;
        throw AnonymousClass001.A0g("setListener");
    }
}
