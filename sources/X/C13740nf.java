package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0nf  reason: invalid class name and case insensitive filesystem */
public class C13740nf implements ThreadFactory {
    public final AtomicInteger A00 = new AtomicInteger(0);
    public final /* synthetic */ C04320Nt A01;
    public final /* synthetic */ boolean A02;

    public C13740nf(C04320Nt r3, boolean z) {
        this.A01 = r3;
        this.A02 = z;
    }

    public Thread newThread(Runnable runnable) {
        String str;
        if (this.A02) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        return new Thread(runnable, AnonymousClass000.A0h(AnonymousClass000.A0l(str), this.A00.incrementAndGet()));
    }
}
