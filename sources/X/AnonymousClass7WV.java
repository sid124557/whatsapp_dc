package X;

import java.util.Iterator;

/* renamed from: X.7WV  reason: invalid class name */
public class AnonymousClass7WV {
    public C142366x5 A00;
    public C153007aW A01;
    public Iterator A02;
    public final C153537bV A03;

    public void A00(C142366x5 r2, int i) {
        this.A00 = r2;
        C153007aW A002 = this.A03.A00(r2, i);
        this.A01 = A002;
        if (A002 != null) {
            Iterator A0u = AnonymousClass6C7.A0u(A002.A05);
            this.A02 = A0u;
            if (A0u.hasNext()) {
                this.A02.next();
                return;
            }
            return;
        }
        throw AnonymousClass001.A0c("Requested Track is not available");
    }

    public AnonymousClass7WV(C153537bV r1) {
        this.A03 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TimelineSpeedProvider{mMediaComposition=");
        A0o.append(this.A03);
        A0o.append(", mTimelineSpeedIterator=");
        A0o.append(this.A02);
        A0o.append(", mCurrentTimelineSpeed=");
        A0o.append((Object) null);
        A0o.append(", mMediaTrackComposition=");
        A0o.append(this.A01);
        A0o.append(", mSelectedTrackType=");
        return AnonymousClass000.A0Q(this.A00, A0o);
    }
}
