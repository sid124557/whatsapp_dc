package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.469  reason: invalid class name */
public final class AnonymousClass469 extends AnonymousClass333 {
    public static final AtomicIntegerFieldUpdater A00 = AtomicIntegerFieldUpdater.newUpdater(AnonymousClass469.class, "_resumed");
    public volatile int _resumed;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass469(java.lang.Throwable r3, X.C84814Du r4, boolean r5) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0019
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Continuation "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " was cancelled normally"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            r3.<init>(r0)
        L_0x0019:
            r2.<init>(r3, r5)
            r0 = 0
            r2._resumed = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass469.<init>(java.lang.Throwable, X.4Du, boolean):void");
    }

    public final boolean A02() {
        return A00.compareAndSet(this, 0, 1);
    }
}
