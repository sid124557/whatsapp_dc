package X;

import java.lang.Thread;

/* renamed from: X.8Mq  reason: invalid class name and case insensitive filesystem */
public class C172768Mq implements Thread.UncaughtExceptionHandler {
    public void uncaughtException(Thread thread, Throwable th) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UncaughtException in ");
        String A0X = AnonymousClass000.A0X(thread.getName(), A0o);
        new IllegalStateException(th);
        C162457s7.A0J(A0X, 2);
    }
}
