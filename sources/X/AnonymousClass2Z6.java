package X;

/* renamed from: X.2Z6  reason: invalid class name */
public final class AnonymousClass2Z6 {
    public final /* synthetic */ C54362ob A00;
    public final /* synthetic */ C53572nJ A01;

    public AnonymousClass2Z6(C54362ob r1, C53572nJ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00(C73263fC r9) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CrosspostRequestSessionManager/Crosspost failed for session: ");
        C53572nJ r1 = this.A01;
        String str = r1.A04;
        A0o.append(str);
        AnonymousClass356.A01(AnonymousClass000.A0P(r9, " with exception: ", A0o));
        this.A00.A01(AnonymousClass217.CROSSPOST, r9, str, r1.A02, r1.A00);
    }
}
