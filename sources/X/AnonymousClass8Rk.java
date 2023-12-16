package X;

/* renamed from: X.8Rk  reason: invalid class name */
public class AnonymousClass8Rk extends Thread {
    public final /* synthetic */ C1676481x A00;

    public AnonymousClass8Rk(C1676481x r1) {
        this.A00 = r1;
    }

    public void run() {
        C1676481x r2 = this.A00;
        synchronized (r2) {
            C1676481x.A01(r2);
            Object obj = r2.A04;
            synchronized (obj) {
                r2.A07 = true;
                obj.notifyAll();
            }
        }
    }
}
