package X;

/* renamed from: X.3X4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3X4 implements C84134Bd {
    public final /* synthetic */ AnonymousClass4EV A00;
    public final /* synthetic */ C620133d A01;
    public final /* synthetic */ C47662dc A02;
    public final /* synthetic */ C30471mV A03;
    public final /* synthetic */ boolean A04;

    public final void AwB(Object obj) {
        C620133d r2 = this.A01;
        C30471mV r3 = this.A03;
        C47662dc r4 = this.A02;
        AnonymousClass4EV r5 = this.A00;
        boolean z = this.A04;
        C56902sk r6 = (C56902sk) obj;
        r2.A0g.A0G(r3);
        r2.A0A(r6, r4, r3, true);
        C73373fO r1 = r2.A0Q;
        synchronized (r1) {
            r1.remove(r3.A1J);
        }
        C620133d.A00(r6, r2, r3);
        r2.A0o.execute(new C70773b2(r2, r3, r4, r5, r6, 4, z));
    }

    public /* synthetic */ AnonymousClass3X4(AnonymousClass4EV r1, C620133d r2, C47662dc r3, C30471mV r4, boolean z) {
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A04 = z;
    }
}
