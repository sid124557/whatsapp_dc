package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.8Ot  reason: invalid class name and case insensitive filesystem */
public class C173218Ot implements ThreadFactory {
    public final ThreadFactory A00 = Executors.defaultThreadFactory();
    public final AtomicInteger A01 = new AtomicInteger();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.A00.newThread(new C172668Mf(runnable));
        int andIncrement = this.A01.getAndIncrement();
        StringBuilder A0l = AnonymousClass000.A0l("GAC_Executor");
        A0l.append("[");
        A0l.append(andIncrement);
        newThread.setName(AnonymousClass000.A0f(A0l));
        return newThread;
    }
}
