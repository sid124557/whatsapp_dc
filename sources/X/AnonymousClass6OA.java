package X;

import com.google.android.exoplayer2.Timeline;

/* renamed from: X.6OA  reason: invalid class name */
public final class AnonymousClass6OA extends AnonymousClass6OO {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Timeline A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6OA(Timeline timeline, int i) {
        super(new AnonymousClass888(i));
        boolean z = false;
        this.A03 = timeline;
        int A002 = timeline.A00();
        this.A00 = A002;
        this.A01 = timeline.A01();
        this.A02 = i;
        if (A002 > 0) {
            C161487pm.A02("LoopingMediaSource contains too many periods", i <= Integer.MAX_VALUE / A002 ? true : z);
        }
    }
}
