package X;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.8CN  reason: invalid class name */
public class AnonymousClass8CN implements C188268yc {
    public static final C188268yc A01 = new AnonymousClass8CN((Object) null);
    public static final Logger A02 = AnonymousClass6C8.A0m(AnonymousClass8CN.class);
    public final Object A00;

    public void AwV(Runnable runnable, Executor executor) {
        C162187rP.A04(runnable, "Runnable was null.");
        C162187rP.A04(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = A02;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder A0o = AnonymousClass6C7.A0o(valueOf.length() + 57, valueOf2);
            A0o.append("RuntimeException while executing runnable ");
            A0o.append(valueOf);
            logger.log(level, AnonymousClass000.A0V(" with executor ", valueOf2, A0o), e);
        }
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }

    public AnonymousClass8CN(Object obj) {
        this.A00 = obj;
    }

    public Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }

    public String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.A00);
        StringBuilder A0o = AnonymousClass6C7.A0o(AnonymousClass6C7.A06(obj) + 27, valueOf);
        A0o.append(obj);
        A0o.append("[status=SUCCESS, result=[");
        A0o.append(valueOf);
        return AnonymousClass000.A0X("]]", A0o);
    }

    public Object get() {
        return this.A00;
    }
}
