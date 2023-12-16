package X;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.46P  reason: invalid class name */
public final class AnonymousClass46P extends AnonymousClass46Q implements C84824Dv {
    public final Executor A00;

    public AnonymousClass4C7 BGx(Runnable runnable, C85494Gl r5, long j) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.A00;
        if ((executor instanceof ScheduledExecutorService) && (scheduledExecutorService = (ScheduledExecutorService) executor) != null) {
            try {
                ScheduledFuture<?> schedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
                if (schedule != null) {
                    return new C72703e9(schedule);
                }
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                C85474Gj A0v = C18310x6.A0v(r5);
                if (A0v != null) {
                    A0v.AyX(cancellationException);
                }
            }
        }
        return AnonymousClass46K.A01.BGx(runnable, r5, j);
    }

    public void Bkq(AnonymousClass4GW r5, long j) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.A00;
        if ((executor instanceof ScheduledExecutorService) && (scheduledExecutorService = (ScheduledExecutorService) executor) != null) {
            C70163a3 r1 = new C70163a3(this, 9, r5);
            C85494Gl B5w = r5.B5w();
            try {
                ScheduledFuture<?> schedule = scheduledExecutorService.schedule(r1, j, TimeUnit.MILLISECONDS);
                if (schedule != null) {
                    r5.BGs(new AnonymousClass462(schedule));
                    return;
                }
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                C85474Gj A0v = C18310x6.A0v(B5w);
                if (A0v != null) {
                    A0v.AyX(cancellationException);
                }
            }
        }
        AnonymousClass46K.A01.Bkq(r5, j);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass46P) || ((AnonymousClass46P) obj).A00 != this.A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return System.identityHashCode(this.A00);
    }

    public String toString() {
        return this.A00.toString();
    }

    public AnonymousClass46P(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.A00 = executor;
        try {
            if ((executor instanceof ScheduledThreadPoolExecutor) && (scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor) != null && (method = C39262Bh.A00) != null) {
                Object[] A0L = AnonymousClass002.A0L();
                A0L[0] = Boolean.TRUE;
                method.invoke(scheduledThreadPoolExecutor, A0L);
            }
        } catch (Throwable unused) {
        }
    }
}
