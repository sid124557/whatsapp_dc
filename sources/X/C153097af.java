package X;

import android.os.Looper;
import android.util.Log;
import com.facebook.android.exoplayer2.Timeline;

/* renamed from: X.7af  reason: invalid class name and case insensitive filesystem */
public final class C153097af {
    public int A00;
    public int A01;
    public long A02 = -9223372036854775807L;
    public Looper A03;
    public Object A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass81Q A08;
    public final C180168kb A09;
    public final Timeline A0A;
    public final C186588vc A0B;

    public synchronized void A03(boolean z) {
        this.A05 = z | this.A05;
        this.A06 = true;
        notifyAll();
    }

    public void A00() {
        C159197lM.A02(!this.A07);
        this.A07 = true;
        AnonymousClass81Q r2 = this.A08;
        synchronized (r2) {
            if (r2.A0O) {
                Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                A03(false);
            } else {
                C150717Rx.A00(r2.A0j, this, 14);
            }
        }
    }

    public void A01(int i) {
        C159197lM.A02(!this.A07);
        this.A01 = i;
    }

    public void A02(Object obj) {
        C159197lM.A02(!this.A07);
        this.A04 = obj;
    }

    public C153097af(Looper looper, AnonymousClass81Q r4, C180168kb r5, Timeline timeline, C186588vc r7, int i) {
        this.A08 = r4;
        this.A09 = r5;
        this.A0A = timeline;
        this.A03 = looper;
        this.A0B = r7;
        this.A00 = i;
    }
}
