package X;

import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.46M  reason: invalid class name */
public abstract class AnonymousClass46M extends AnonymousClass46B {
    public Thread A09() {
        if (!(this instanceof AnonymousClass46K)) {
            return ((AnonymousClass46J) this).A00;
        }
        AnonymousClass46K r2 = (AnonymousClass46K) this;
        Thread thread = AnonymousClass46K._thread;
        if (thread == null) {
            synchronized (r2) {
                thread = AnonymousClass46K._thread;
                if (thread == null) {
                    thread = new Thread(r2, "kotlinx.coroutines.DefaultExecutor");
                    AnonymousClass46K._thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    public void A0A(C71783cf r3, long j) {
        if (this instanceof AnonymousClass46K) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        AnonymousClass46K.A01.A0C(r3, j);
    }
}
