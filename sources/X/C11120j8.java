package X;

import androidx.work.Worker;

/* renamed from: X.0j8  reason: invalid class name and case insensitive filesystem */
public class C11120j8 implements Runnable {
    public final /* synthetic */ Worker A00;

    public C11120j8(Worker worker) {
        this.A00 = worker;
    }

    public void run() {
        try {
            Worker worker = this.A00;
            worker.A00.A09(worker.A0C());
        } catch (Throwable th) {
            this.A00.A00.A0A(th);
        }
    }
}
