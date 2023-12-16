package X;

/* renamed from: X.0kd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C11890kd implements Runnable {
    public final /* synthetic */ AnonymousClass0OX A00;
    public final /* synthetic */ Runnable A01;

    public final void run() {
        AnonymousClass0OX r2 = this.A00;
        if (r2.A03.offer(this.A01)) {
            r2.A00();
            return;
        }
        throw AnonymousClass001.A0e("cannot enqueue any more runnables");
    }

    public /* synthetic */ C11890kd(AnonymousClass0OX r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }
}
