package X;

/* renamed from: X.9hP  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C199869hP implements Runnable {
    public final /* synthetic */ AnonymousClass99P A00;
    public final /* synthetic */ C85034Er A01;

    public final void run() {
        C69263Wi r1;
        Runnable r0;
        AnonymousClass99P r4 = this.A00;
        C85034Er r3 = this.A01;
        int i = 0;
        while (true) {
            if (!r4.A08) {
                try {
                    Thread.sleep(1000);
                    i++;
                    if (i >= 5) {
                        if (r3 != null) {
                            r1 = r4.A04;
                            r0 = new C198739fP(r3);
                        } else {
                            return;
                        }
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            } else if (r3 != null) {
                r1 = r4.A04;
                r0 = new C198729fO(r3);
            } else {
                return;
            }
        }
        r1.A0S(r0);
    }

    public /* synthetic */ C199869hP(AnonymousClass99P r1, C85034Er r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
