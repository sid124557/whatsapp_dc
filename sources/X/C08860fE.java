package X;

import android.app.Activity;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0fE  reason: invalid class name and case insensitive filesystem */
public final class C08860fE implements C16110sU {
    public final C16110sU A00;
    public final WeakHashMap A01 = new WeakHashMap();
    public final ReentrantLock A02 = new ReentrantLock();

    public void Bfq(Activity activity, AnonymousClass0P8 r5) {
        C162457s7.A0J(activity, 0);
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            WeakHashMap weakHashMap = this.A01;
            if (!C162457s7.A0P(r5, (AnonymousClass0P8) weakHashMap.get(activity))) {
                weakHashMap.put(activity, r5);
                reentrantLock.unlock();
                this.A00.Bfq(activity, r5);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public C08860fE(C16110sU r2) {
        this.A00 = r2;
    }
}
