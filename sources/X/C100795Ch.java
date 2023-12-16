package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.5Ch  reason: invalid class name and case insensitive filesystem */
public final class C100795Ch {
    public static final long[] A00;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        A00 = new long[]{TimeUnit.HOURS.toSeconds(24), timeUnit.toSeconds(3), timeUnit.toSeconds(7), timeUnit.toSeconds(14)};
    }
}
