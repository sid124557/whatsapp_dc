package X;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* renamed from: X.89f  reason: invalid class name and case insensitive filesystem */
public final class C1694189f implements C184938sn {
    public final /* synthetic */ C1694289g A00;

    public final void Bsw(int i, boolean z) {
        C1694289g r2 = this.A00;
        Lock lock = r2.A0D;
        lock.lock();
        try {
            if (r2.A04) {
                r2.A04 = false;
                r2.A08.Bsw(i, false);
                r2.A03 = null;
                r2.A02 = null;
            } else {
                r2.A04 = true;
                r2.A09.onConnectionSuspended(i);
            }
        } finally {
            lock.unlock();
        }
    }

    public /* synthetic */ C1694189f(C1694289g r1) {
        this.A00 = r1;
    }

    public final void Bsr(C127866Tp r3) {
        C1694289g r0 = this.A00;
        Lock lock = r0.A0D;
        lock.lock();
        try {
            r0.A03 = r3;
            C1694289g.A00(r0);
        } finally {
            lock.unlock();
        }
    }

    public final void Bst(Bundle bundle) {
        C1694289g r2 = this.A00;
        Lock lock = r2.A0D;
        lock.lock();
        try {
            r2.A03 = C127866Tp.A04;
            C1694289g.A00(r2);
        } finally {
            lock.unlock();
        }
    }
}
