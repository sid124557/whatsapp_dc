package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.7iX  reason: invalid class name and case insensitive filesystem */
public final class C157577iX {
    public static final AtomicIntegerFieldUpdater A01;
    public static final AtomicIntegerFieldUpdater A02;
    public static final AtomicIntegerFieldUpdater A03;
    public static final AtomicReferenceFieldUpdater A04;
    public final AtomicReferenceArray A00 = new AtomicReferenceArray(128);
    public volatile int blockingTasksInBuffer;
    public volatile int consumerIndex;
    public volatile Object lastScheduledTask;
    public volatile int producerIndex;

    static {
        Class<C157577iX> cls = C157577iX.class;
        A04 = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        A03 = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        A02 = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        A01 = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    public final C71253bo A00() {
        C71253bo r2;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
            int i = atomicIntegerFieldUpdater.get(this);
            r2 = null;
            if (i - A03.get(this) == 0) {
                break;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (r2 = (C71253bo) this.A00.getAndSet(i2, (Object) null)) != null) {
                if (r2.A01.A00 == 1) {
                    A01.decrementAndGet(this);
                }
            }
        }
        return r2;
    }
}
