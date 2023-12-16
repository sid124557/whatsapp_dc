package X;

import java.util.Map;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7K5  reason: invalid class name */
public final class AnonymousClass7K5 {
    public AnonymousClass7P6 A00 = null;
    public RunnableFuture A01;
    public final AtomicInteger A02 = new AtomicInteger(-1);

    public AnonymousClass7K5(C153427bI r3, C151617Vm r4, AnonymousClass7P6 r5, Map map) {
        this.A01 = new FutureTask(new C173048Oc(r3, r4, r5, map));
    }
}
