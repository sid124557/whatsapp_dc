package X;

import androidx.work.Worker;

/* renamed from: X.0ko  reason: invalid class name and case insensitive filesystem */
public class C12000ko implements Runnable {
    public final /* synthetic */ Worker A00;
    public final /* synthetic */ AnonymousClass0BT A01;

    public C12000ko(Worker worker, AnonymousClass0BT r2) {
        this.A00 = worker;
        this.A01 = r2;
    }

    public void run() {
        try {
            this.A01.A09(this.A00.A0B());
        } catch (Throwable th) {
            this.A01.A0A(th);
        }
    }
}
