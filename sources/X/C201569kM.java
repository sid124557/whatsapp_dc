package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.9kM  reason: invalid class name and case insensitive filesystem */
public class C201569kM implements ThreadFactory {
    public final /* synthetic */ String A00;

    public C201569kM(String str) {
        this.A00 = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.A00);
        thread.setPriority(3);
        return thread;
    }
}
