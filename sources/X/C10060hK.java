package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0hK  reason: invalid class name and case insensitive filesystem */
public final class C10060hK implements C188268yc {
    public final C10080hM A00 = new AnonymousClass05F(this);
    public final WeakReference A01;

    public void A00(Throwable th) {
        this.A00.A06(th);
    }

    public boolean A01(Object obj) {
        return this.A00.A07(obj);
    }

    public void AwV(Runnable runnable, Executor executor) {
        this.A00.AwV(runnable, executor);
    }

    public boolean cancel(boolean z) {
        AnonymousClass0Pc r1 = (AnonymousClass0Pc) this.A01.get();
        boolean cancel = this.A00.cancel(z);
        if (cancel && r1 != null) {
            r1.A00();
        }
        return cancel;
    }

    public Object get(long j, TimeUnit timeUnit) {
        return this.A00.get(j, timeUnit);
    }

    public boolean isCancelled() {
        return this.A00.isCancelled();
    }

    public boolean isDone() {
        return this.A00.isDone();
    }

    public String toString() {
        return this.A00.toString();
    }

    public C10060hK(AnonymousClass0Pc r2) {
        this.A01 = new WeakReference(r2);
    }

    public Object get() {
        return this.A00.get();
    }
}
