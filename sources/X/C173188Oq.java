package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.8Oq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C173188Oq implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(9);
        return thread;
    }
}
