package X;

/* renamed from: X.3ah  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70563ah implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C55112po A04;

    public final void run() {
        C55112po r8 = this.A04;
        int i = this.A01;
        double d = this.A00;
        long j = this.A02;
        long j2 = this.A03;
        C25991bP A002 = r8.A00(i);
        A002.A01 = Double.valueOf(d);
        A002.A0G = Long.valueOf(j);
        A002.A0H = Long.valueOf(j2);
        synchronized (r8) {
            AnonymousClass33M r2 = r8.A07;
            r2.A01 = 0;
            r2.A00 = 0;
            r2.A09();
        }
        r8.A03(A002);
    }

    public /* synthetic */ C70563ah(C55112po r1, double d, int i, long j, long j2) {
        this.A04 = r1;
        this.A01 = i;
        this.A00 = d;
        this.A02 = j;
        this.A03 = j2;
    }
}
