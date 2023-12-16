package X;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.8U0  reason: invalid class name */
public class AnonymousClass8U0 extends ReentrantLock implements AutoCloseable {
    public boolean mEnableThreadLockSync = false;

    public void close() {
        if (this.mEnableThreadLockSync) {
            unlock();
        }
    }
}
