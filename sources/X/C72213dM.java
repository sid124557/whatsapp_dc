package X;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3dM  reason: invalid class name and case insensitive filesystem */
public class C72213dM implements RunnableFuture, ScheduledFuture {
    public final Handler A00;
    public final FutureTask A01;

    public boolean cancel(boolean z) {
        return this.A01.cancel(z);
    }

    public Object get(long j, TimeUnit timeUnit) {
        return this.A01.get(j, timeUnit);
    }

    public boolean isCancelled() {
        return this.A01.isCancelled();
    }

    public boolean isDone() {
        return this.A01.isDone();
    }

    public void run() {
        this.A01.run();
    }

    public C72213dM(Handler handler, Object obj, Runnable runnable) {
        this.A00 = handler;
        this.A01 = new FutureTask(runnable, obj);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        throw C18320x8.A0m();
    }

    public long getDelay(TimeUnit timeUnit) {
        throw C18320x8.A0m();
    }

    public C72213dM(Handler handler, Callable callable) {
        this.A00 = handler;
        this.A01 = new FutureTask(callable);
    }

    public Object get() {
        return this.A01.get();
    }
}
