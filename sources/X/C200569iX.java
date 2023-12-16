package X;

/* renamed from: X.9iX  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200569iX implements Runnable {
    public final /* synthetic */ C624034w A00;
    public final /* synthetic */ C1902094n A01;

    public final void run() {
        C1902094n r4 = this.A01;
        C624034w r3 = this.A00;
        AnonymousClass9U4.A01(r4.A0G).A0f(r3, (C624034w) null, r3.A0L);
        C18270x1.A0l(C620933l.A00(r4.A0E), "payment_has_received_upi_mandate_request", true);
        r4.A0B.A0S(new C200609ib(r3, r4));
    }

    public /* synthetic */ C200569iX(C624034w r1, C1902094n r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
