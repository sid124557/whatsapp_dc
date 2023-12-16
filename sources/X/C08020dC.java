package X;

import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0dC  reason: invalid class name and case insensitive filesystem */
public final class C08020dC implements C15790rw {
    public AnonymousClass0P8 A00;
    public final Activity A01;
    public final Set A02 = new LinkedHashSet();
    public final ReentrantLock A03 = new ReentrantLock();

    /* renamed from: A01 */
    public void AwB(WindowLayoutInfo windowLayoutInfo) {
        C162457s7.A0J(windowLayoutInfo, 0);
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            this.A00 = C05910Vl.A00(this.A01, windowLayoutInfo);
            for (C15790rw AwB : this.A02) {
                AwB.AwB(this.A00);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void A00(C15790rw r3) {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            AnonymousClass0P8 r0 = this.A00;
            if (r0 != null) {
                r3.AwB(r0);
            }
            this.A02.add(r3);
        } finally {
            reentrantLock.unlock();
        }
    }

    public C08020dC(Activity activity) {
        this.A01 = activity;
    }
}
