package X;

/* renamed from: X.0kj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C11950kj implements Runnable {
    public final /* synthetic */ C13690na A00;
    public final /* synthetic */ Runnable A01;

    public final void run() {
        Runnable runnable = this.A01;
        C13690na r1 = this.A00;
        try {
            runnable.run();
        } finally {
            r1.A00();
        }
    }

    public /* synthetic */ C11950kj(C13690na r1, Runnable runnable) {
        this.A01 = runnable;
        this.A00 = r1;
    }
}
