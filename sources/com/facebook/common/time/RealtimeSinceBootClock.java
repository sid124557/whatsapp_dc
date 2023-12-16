package com.facebook.common.time;

import X.C183718qV;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public class RealtimeSinceBootClock implements C183718qV {
    public static final RealtimeSinceBootClock A00 = new RealtimeSinceBootClock();

    public static RealtimeSinceBootClock get() {
        return A00;
    }

    public long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }

    public long now() {
        return SystemClock.elapsedRealtime();
    }
}
