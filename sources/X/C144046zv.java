package X;

import com.google.android.exoplayer2.Timeline;

/* renamed from: X.6zv  reason: invalid class name and case insensitive filesystem */
public final class C144046zv extends IllegalStateException {
    public final long positionMs;
    public final Timeline timeline;
    public final int windowIndex;

    public C144046zv(Timeline timeline2, int i, long j) {
        this.timeline = timeline2;
        this.windowIndex = i;
        this.positionMs = j;
    }
}
