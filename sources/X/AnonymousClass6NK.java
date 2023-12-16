package X;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* renamed from: X.6NK  reason: invalid class name */
public final class AnonymousClass6NK extends C150837Sk {
    public final long A00;
    public final C160247nJ A01;

    public /* synthetic */ AnonymousClass6NK(Callable callable, long j) {
        super(callable);
        this.A01 = null;
        this.A00 = j;
    }

    public final C160247nJ A01() {
        RunnableFuture runnableFuture;
        synchronized (this) {
            runnableFuture = this.A01;
        }
        if (runnableFuture == null || runnableFuture.isDone()) {
            return (C160247nJ) A00();
        }
        return this.A01;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6NK(android.content.Context r9, X.C160247nJ r10, X.C158047jL r11, java.lang.Object r12, int r13, int r14, int r15) {
        /*
            r8 = this;
            long r6 = X.C153917cG.A00(r14, r15)
            X.8Of r0 = new X.8Of
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.<init>(r0)
            r8.A01 = r10
            r8.A00 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6NK.<init>(android.content.Context, X.7nJ, X.7jL, java.lang.Object, int, int, int):void");
    }
}
