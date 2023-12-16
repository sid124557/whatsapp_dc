package org.chromium.net;

import java.util.concurrent.Executor;

public abstract class NetworkQualityThroughputListener {
    public final Executor mExecutor;

    public abstract void onThroughputObservation(int i, long j, int i2);

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public NetworkQualityThroughputListener(Executor executor) {
        if (executor != null) {
            this.mExecutor = executor;
            return;
        }
        throw new IllegalStateException("Executor must not be null");
    }
}
