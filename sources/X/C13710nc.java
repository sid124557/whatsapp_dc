package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.0nc  reason: invalid class name and case insensitive filesystem */
public class C13710nc implements ThreadFactory {
    public Thread newThread(Runnable runnable) {
        return new C13870ns(runnable);
    }
}
