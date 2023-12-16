package X;

import android.os.SystemClock;

/* renamed from: X.9Qu  reason: invalid class name */
public class AnonymousClass9Qu {
    public long A00;
    public boolean A01;

    public long A00(long j) {
        if (!this.A01) {
            long j2 = Long.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                long nanoTime = System.nanoTime();
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long nanoTime2 = System.nanoTime();
                long j3 = nanoTime2 - nanoTime;
                if (i == 0 || j3 < j2) {
                    this.A00 = elapsedRealtimeNanos - ((nanoTime + nanoTime2) >> 1);
                    j2 = j3;
                }
            }
            this.A01 = true;
        }
        if (Math.abs(((float) (SystemClock.elapsedRealtimeNanos() - j)) / 1.0E9f) < 120.0f) {
            return j - this.A00;
        }
        return j;
    }
}
