package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.8Ow  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C173248Ow implements ThreadFactory {
    public static final ThreadFactory A00 = new C173248Ow();

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }
}
