package X;

import java.lang.Thread;
import java.lang.ref.WeakReference;

/* renamed from: X.9k9  reason: invalid class name and case insensitive filesystem */
public class C201449k9 implements Thread.UncaughtExceptionHandler {
    public WeakReference A00;

    public void uncaughtException(Thread thread, Throwable th) {
        AnonymousClass9XQ r0 = (AnonymousClass9XQ) this.A00.get();
        if (r0 != null) {
            r0.A03.A00(new RuntimeException(th));
        }
    }

    public C201449k9(WeakReference weakReference) {
        this.A00 = weakReference;
    }
}
