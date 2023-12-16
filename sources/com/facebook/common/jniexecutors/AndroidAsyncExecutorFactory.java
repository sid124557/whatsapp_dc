package com.facebook.common.jniexecutors;

import X.C159587m8;
import com.facebook.jni.HybridData;
import java.util.concurrent.ScheduledExecutorService;

public class AndroidAsyncExecutorFactory {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(ScheduledExecutorService scheduledExecutorService);

    static {
        C159587m8.A01("jniexecutors");
    }

    public AndroidAsyncExecutorFactory(ScheduledExecutorService scheduledExecutorService) {
        this.mHybridData = initHybrid(scheduledExecutorService);
    }
}
