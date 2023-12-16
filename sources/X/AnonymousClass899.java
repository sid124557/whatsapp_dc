package X;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* renamed from: X.899  reason: invalid class name */
public final class AnonymousClass899 implements C187778xn, C187788xo {
    public C187698xf A00;
    public final C148727Jm A01;
    public final boolean A02;

    public final void onConnected(Bundle bundle) {
        C162177rO.A03(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.A00.onConnected(bundle);
    }

    public final void onConnectionFailed(C127866Tp r5) {
        C162177rO.A03(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        C187698xf r0 = this.A00;
        C148727Jm r3 = this.A01;
        boolean z = this.A02;
        C1694389h r02 = (C1694389h) r0;
        Lock lock = r02.A0D;
        lock.lock();
        try {
            r02.A0E.Bt4(r5, r3, z);
        } finally {
            lock.unlock();
        }
    }

    public final void onConnectionSuspended(int i) {
        C162177rO.A03(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.A00.onConnectionSuspended(i);
    }

    public AnonymousClass899(C148727Jm r1, boolean z) {
        this.A01 = r1;
        this.A02 = z;
    }
}
