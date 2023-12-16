package X;

import android.os.SystemClock;
import com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate;
import java.util.Deque;

/* renamed from: X.7Th  reason: invalid class name and case insensitive filesystem */
public class C151067Th {
    public VideoBandwidthEstimate A00;
    public Deque A01 = AnonymousClass0x9.A18();
    public Deque A02 = AnonymousClass0x9.A18();
    public boolean A03;
    public final C186588vc A04;

    public C151067Th(C186588vc r2) {
        this.A04 = r2;
        this.A00 = new VideoBandwidthEstimate();
        this.A03 = false;
    }

    public final void A00() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Deque deque = this.A01;
            if (deque.size() > 10 && elapsedRealtime - ((AnonymousClass7FI) deque.getFirst()).A00 > 20000) {
                deque.removeFirst();
                this.A03 = true;
            }
        }
        while (true) {
            Deque deque2 = this.A02;
            if (deque2.size() > 10 && elapsedRealtime - ((AnonymousClass7FI) deque2.getFirst()).A00 > 20000) {
                deque2.removeFirst();
                this.A03 = true;
            } else {
                return;
            }
        }
    }
}
