package X;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0hL  reason: invalid class name and case insensitive filesystem */
public final class C10070hL implements C188268yc {
    public final AnonymousClass0BT A00;
    public final C85474Gj A01;

    public final void A01(Object obj) {
        this.A00.A09(obj);
    }

    public void AwV(Runnable runnable, Executor executor) {
        this.A00.AwV(runnable, executor);
    }

    public boolean cancel(boolean z) {
        return this.A00.cancel(z);
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

    public C10070hL(AnonymousClass0BT r2, C85474Gj r3) {
        this.A01 = r3;
        this.A00 = r2;
        r3.BGv(new C14200p6(this));
    }

    public /* synthetic */ C10070hL(C85474Gj r2) {
        this(AnonymousClass0BT.A00(), r2);
    }

    public Object get() {
        return this.A00.get();
    }
}
