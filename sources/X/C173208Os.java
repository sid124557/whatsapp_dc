package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.8Os  reason: invalid class name and case insensitive filesystem */
public class C173208Os implements ThreadFactory {
    public final String A00;
    public final ThreadFactory A01 = Executors.defaultThreadFactory();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.A01.newThread(new C172668Mf(runnable));
        newThread.setName(this.A00);
        return newThread;
    }

    public C173208Os(String str) {
        C162177rO.A03(str, "Name must not be null");
        this.A00 = str;
    }
}
