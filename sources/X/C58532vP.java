package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.2vP  reason: invalid class name and case insensitive filesystem */
public final class C58532vP {
    public static final AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(C58532vP.class, "notCompletedCount");
    public final C85464Gi[] A00;
    public volatile int notCompletedCount;

    public C58532vP(C85464Gi[] r2) {
        this.A00 = r2;
        this.notCompletedCount = r2.length;
    }
}
