package X;

/* renamed from: X.9jX  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201109jX implements Runnable {
    public final /* synthetic */ C624034w A00;
    public final /* synthetic */ C624034w A01;
    public final /* synthetic */ AnonymousClass94y A02;

    public final void run() {
        AnonymousClass94y r4 = this.A02;
        C624034w r3 = this.A00;
        C624034w r2 = this.A01;
        r3.A06 = r4.A0N.A0H();
        AnonymousClass36F r1 = r4.A0S;
        r1.A0f(r3, r2, r2.A0L);
        if (!r1.A0c()) {
            C18270x1.A0l(C620933l.A00(r4.A0X), "payments_has_unseen_requests", false);
        }
    }

    public /* synthetic */ C201109jX(C624034w r1, C624034w r2, AnonymousClass94y r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
