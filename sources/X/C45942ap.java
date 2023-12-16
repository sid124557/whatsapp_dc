package X;

/* renamed from: X.2ap  reason: invalid class name and case insensitive filesystem */
public final class C45942ap {
    public final C50062hZ A00;
    public final AnonymousClass3N0 A01;
    public final C56612sH A02;
    public final AnonymousClass1VX A03;

    public final void A00(C30461mU r5, String str, AnonymousClass4GQ r7) {
        C162457s7.A0J(r5, 0);
        C117715sN r3 = new C117715sN(r7, r5, str, 43);
        boolean A002 = AnonymousClass3N0.A00(r5, (byte) 93);
        StringBuilder A0o = AnonymousClass001.A0o();
        if (A002) {
            A0o.append(str);
            C18260x0.A1J(A0o, AnonymousClass2z0.A07(r5, "/event message loading responses with event id=", A0o));
            this.A00.A00(r5, r3, (byte) 93);
            return;
        }
        A0o.append(str);
        C18260x0.A1J(A0o, AnonymousClass2z0.A07(r5, "/event message doesn't need loading event id=", A0o));
        r3.run();
    }

    public C45942ap(C50062hZ r1, AnonymousClass3N0 r2, C56612sH r3, AnonymousClass1VX r4) {
        C18260x0.A0V(r3, r4, r2);
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
    }
}
