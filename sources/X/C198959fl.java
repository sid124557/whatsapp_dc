package X;

/* renamed from: X.9fl  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C198959fl implements Runnable {
    public final /* synthetic */ C203899oU A00;

    public final void run() {
        C194329Sl r6 = (C194329Sl) this.A00.A00;
        C620933l r5 = r6.A04;
        long A0A = AnonymousClass0x2.A0A(r5.A03(), "payments_enabled_till");
        if (r6 instanceof C190839Aa) {
            r6.A06.A01(true, false);
        } else {
            r6.A06.A01(false, false);
        }
        r5.A0F(0, A0A);
    }

    public /* synthetic */ C198959fl(C203899oU r1) {
        this.A00 = r1;
    }
}
