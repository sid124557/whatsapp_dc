package X;

/* renamed from: X.9hw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200199hw implements Runnable {
    public final /* synthetic */ AnonymousClass9VC A00;
    public final /* synthetic */ C193579Pe A01;

    public final void run() {
        AnonymousClass9VC r4 = this.A00;
        C193579Pe r2 = this.A01;
        C160757oG r3 = r4.A09;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("onPayRequestFromNonWa; request is expired; transaction id: ");
        String str = r2.A03;
        C1899593h.A1J(r3, str, A0o);
        AnonymousClass36F r1 = r4.A03;
        r1.A0Y(AnonymousClass36F.A05(r1, (String) null, str));
    }

    public /* synthetic */ C200199hw(AnonymousClass9VC r1, C193579Pe r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
