package X;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3fW  reason: invalid class name and case insensitive filesystem */
public class C73453fW extends AbstractExecutorService implements ScheduledExecutorService {
    public static C73453fW A01;
    public final Handler A00 = AnonymousClass000.A0A();

    public ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        Handler handler = this.A00;
        C72213dM r2 = new C72213dM(handler, (Object) null, runnable);
        handler.postDelayed(r2, timeUnit.toMillis(j));
        return r2;
    }

    public /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        runnable.getClass();
        C72213dM r0 = new C72213dM(this.A00, (Object) null, runnable);
        execute(r0);
        return r0;
    }

    public /* bridge */ /* synthetic */ RunnableFuture newTaskFor(Callable callable) {
        return new C72213dM(this.A00, callable);
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw C18320x8.A0m();
    }

    public void execute(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        Handler handler = this.A00;
        if (currentThread == handler.getLooper().getThread()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw C18320x8.A0m();
    }

    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw C18320x8.A0m();
    }

    public void shutdown() {
        throw C18320x8.A0m();
    }

    public List shutdownNow() {
        throw C18320x8.A0m();
    }

    public /* bridge */ /* synthetic */ RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new C72213dM(this.A00, obj, runnable);
    }

    public ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        Handler handler = this.A00;
        C72213dM r2 = new C72213dM(handler, callable);
        handler.postDelayed(r2, timeUnit.toMillis(j));
        return r2;
    }

    public /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        runnable.getClass();
        C72213dM r0 = new C72213dM(this.A00, obj, runnable);
        execute(r0);
        return r0;
    }

    public /* bridge */ /* synthetic */ Future submit(Callable callable) {
        callable.getClass();
        C72213dM r0 = new C72213dM(this.A00, callable);
        execute(r0);
        return r0;
    }
}
