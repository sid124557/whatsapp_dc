package com.facebook.common.time;

import X.AnonymousClass71B;
import X.C187508xK;

public class AwakeTimeSinceBootClock implements C187508xK {
    public static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    public /* synthetic */ long now() {
        return AnonymousClass71B.$default$now(this);
    }

    public long nowNanos() {
        return System.nanoTime();
    }
}
