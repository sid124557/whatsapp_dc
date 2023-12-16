package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.0gx  reason: invalid class name and case insensitive filesystem */
public final class C09910gx implements C180328kr {
    public static final C09910gx A00 = new C09910gx();

    public static final C09910gx A00() {
        return A00;
    }

    public long now() {
        return AwakeTimeSinceBootClock.get().now();
    }
}
