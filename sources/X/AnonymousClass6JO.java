package X;

import com.facebook.android.exoplayer2.Timeline;

/* renamed from: X.6JO  reason: invalid class name */
public final class AnonymousClass6JO extends C125696Ja {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Timeline A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6JO(Timeline timeline, int i) {
        super(new C1674581d(i));
        boolean z = false;
        this.A03 = timeline;
        int A002 = timeline.A00();
        this.A00 = A002;
        this.A01 = timeline.A01();
        this.A02 = i;
        if (A002 > 0) {
            if (!(i <= Integer.MAX_VALUE / A002 ? true : z)) {
                throw AnonymousClass001.A0e(String.valueOf("LoopingMediaSource contains too many periods"));
            }
        }
    }
}
