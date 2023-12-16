package X;

import com.facebook.android.exoplayer2.Timeline;

/* renamed from: X.6zu  reason: invalid class name and case insensitive filesystem */
public final class C144036zu extends IllegalStateException {
    public final long positionMs;
    public final Timeline timeline;
    public final int windowIndex;

    public C144036zu(Timeline timeline2, int i, long j) {
        this.timeline = timeline2;
        this.windowIndex = i;
        this.positionMs = j;
    }
}
