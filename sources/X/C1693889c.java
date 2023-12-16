package X;

import android.os.Bundle;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* renamed from: X.89c  reason: invalid class name and case insensitive filesystem */
public final class C1693889c implements C186118um {
    public final C1694389h A00;

    public final C127186Qz Bsq(C127186Qz r2) {
        this.A00.A05.A0I.add(r2);
        return r2;
    }

    public final C127186Qz Bss(C127186Qz r2) {
        throw AnonymousClass001.A0e("GoogleApiClient is not connected yet.");
    }

    public final void Bsx() {
        C1694389h r2 = this.A00;
        Iterator A0v = AnonymousClass001.A0v(r2.A09);
        while (A0v.hasNext()) {
            ((C187688xe) A0v.next()).B1l();
        }
        r2.A05.A03 = Collections.emptySet();
    }

    public final void Bt0() {
        C1694389h r4 = this.A00;
        Lock lock = r4.A0D;
        lock.lock();
        try {
            AnonymousClass7P4 r5 = r4.A08;
            Map map = r4.A0B;
            r4.A0E = new C1693989d(r4.A02, r4.A03, r4.A04, r4, r5, map, lock);
            r4.A0E.Bsx();
            r4.A0C.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public final void Bt3(Bundle bundle) {
    }

    public final void Bt5(int i) {
    }

    public final boolean Bt6() {
        return true;
    }

    public C1693889c(C1694389h r1) {
        this.A00 = r1;
    }

    public final void Bt4(C127866Tp r1, C148727Jm r2, boolean z) {
    }
}
