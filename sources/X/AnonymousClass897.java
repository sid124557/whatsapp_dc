package X;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* renamed from: X.897  reason: invalid class name */
public final class AnonymousClass897 implements C187778xn, C187788xo {
    public final /* synthetic */ C1693989d A00;

    public /* synthetic */ AnonymousClass897(C1693989d r1) {
        this.A00 = r1;
    }

    public final void onConnected(Bundle bundle) {
        C1693989d r2 = this.A00;
        C162177rO.A02(r2.A0G);
        C187678xd r1 = r2.A05;
        C162177rO.A02(r1);
        r1.Bsy(new AnonymousClass6YS(r2));
    }

    public final void onConnectionFailed(C127866Tp r4) {
        C1693989d r2 = this.A00;
        Lock lock = r2.A0K;
        lock.lock();
        try {
            if (!r2.A06 || r4.A01()) {
                r2.A03(r4);
            } else {
                r2.A00();
                r2.A02();
            }
        } finally {
            lock.unlock();
        }
    }

    public final void onConnectionSuspended(int i) {
    }
}
