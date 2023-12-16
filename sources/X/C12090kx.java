package X;

/* renamed from: X.0kx  reason: invalid class name and case insensitive filesystem */
public class C12090kx implements Runnable {
    public final C13700nb A00;
    public final Runnable A01;

    public void run() {
        try {
            this.A01.run();
            C13700nb r0 = this.A00;
            synchronized (r0.A01) {
                r0.A00();
            }
            return;
        } catch (Throwable th) {
            th = th;
        }
        throw th;
    }

    public C12090kx(C13700nb r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }
}
