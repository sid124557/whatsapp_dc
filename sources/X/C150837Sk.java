package X;

import android.os.Process;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7Sk  reason: invalid class name and case insensitive filesystem */
public class C150837Sk {
    public Object A00;
    public RunnableFuture A01;
    public final AtomicInteger A02 = new AtomicInteger(-1);

    public final Object A00() {
        RunnableFuture runnableFuture;
        Object obj;
        synchronized (this) {
            runnableFuture = this.A01;
            obj = this.A00;
        }
        if (obj != null) {
            return obj;
        }
        Objects.requireNonNull(runnableFuture);
        AtomicInteger atomicInteger = this.A02;
        if (atomicInteger.compareAndSet(-1, Process.myTid())) {
            runnableFuture.run();
        }
        Object A012 = C161827qc.A01(runnableFuture, atomicInteger.get());
        synchronized (this) {
            this.A00 = A012;
            this.A01 = null;
        }
        return A012;
    }

    public C150837Sk(Callable callable) {
        this.A01 = new FutureTask(callable);
    }
}
