package X;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* renamed from: X.89l  reason: invalid class name and case insensitive filesystem */
public final class C1694789l implements C180898lo {
    public final C148727Jm A00;
    public final WeakReference A01;
    public final boolean A02;

    public final void Ba1(C127866Tp r5) {
        C1693989d r3 = (C1693989d) this.A01.get();
        if (r3 != null) {
            C162177rO.A04("onReportServiceBinding must be called on the GoogleApiClient handler thread", AnonymousClass000.A1Y(Looper.myLooper(), r3.A0F.A05.A06));
            Lock lock = r3.A0K;
            lock.lock();
            try {
                if (r3.A07(0)) {
                    if (r5.A01 != 0) {
                        r3.A04(r5, this.A00, this.A02);
                    }
                    if (r3.A06()) {
                        r3.A02();
                    }
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public C1694789l(C148727Jm r2, C1693989d r3, boolean z) {
        this.A01 = AnonymousClass0x9.A14(r3);
        this.A00 = r2;
        this.A02 = z;
    }
}
