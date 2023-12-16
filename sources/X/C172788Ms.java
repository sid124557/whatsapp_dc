package X;

import java.lang.Thread;

/* renamed from: X.8Ms  reason: invalid class name and case insensitive filesystem */
public class C172788Ms implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ C158897kj A00;

    public C172788Ms(C158897kj r1) {
        this.A00 = r1;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        C158897kj r1 = this.A00;
        AnonymousClass7VY r0 = new AnonymousClass7VY();
        r0.A00(th);
        try {
            r1.A01();
        } catch (Throwable unused) {
            r0.A00(th);
        }
    }
}
