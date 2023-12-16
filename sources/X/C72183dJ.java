package X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.3dJ  reason: invalid class name and case insensitive filesystem */
public class C72183dJ implements Future, C84694Di {
    public Exception A00;
    public Object A01;
    public boolean A02;
    public final CountDownLatch A03 = C18290x4.A14();

    public void BQr(Exception exc) {
        this.A01 = null;
        this.A02 = false;
        this.A00 = exc;
        this.A03.countDown();
    }

    public void BQt(Object obj) {
        this.A01 = obj;
        this.A02 = true;
        this.A03.countDown();
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public Object get(long j, TimeUnit timeUnit) {
        if (!this.A03.await(j, timeUnit)) {
            throw new TimeoutException();
        } else if (this.A02) {
            return this.A01;
        } else {
            throw new ExecutionException(this.A00);
        }
    }

    public boolean isDone() {
        return AnonymousClass000.A1T((this.A03.getCount() > 0 ? 1 : (this.A03.getCount() == 0 ? 0 : -1)));
    }

    public boolean isCancelled() {
        return false;
    }

    public Object get() {
        this.A03.await();
        if (this.A02) {
            return this.A01;
        }
        throw new ExecutionException(this.A00);
    }
}
