package X;

/* renamed from: X.81z  reason: invalid class name and case insensitive filesystem */
public final class C1676681z implements C184788sW {
    public C187398x9 A00;
    public C184788sW A01;
    public final AnonymousClass81Q A02;
    public final AnonymousClass820 A03;

    public final void A00() {
        long BBa = this.A01.BBa();
        AnonymousClass820 r2 = this.A03;
        r2.A01(BBa);
        C158167jX BBQ = this.A01.BBQ();
        if (!BBQ.equals(r2.A02)) {
            r2.Bmx(BBQ);
            this.A02.A0G(BBQ);
        }
    }

    public C158167jX BBQ() {
        C184788sW r0 = this.A01;
        if (r0 != null) {
            return r0.BBQ();
        }
        return this.A03.A02;
    }

    public long BBa() {
        C187398x9 r0 = this.A00;
        if (r0 == null || r0.BHW() || (!this.A00.BIe() && this.A00.BFS())) {
            return this.A03.BBa();
        }
        return this.A01.BBa();
    }

    public C158167jX Bmx(C158167jX r2) {
        C184788sW r0 = this.A01;
        if (r0 != null) {
            r2 = r0.Bmx(r2);
        }
        this.A03.Bmx(r2);
        this.A02.A0G(r2);
        return r2;
    }

    public C1676681z(AnonymousClass81Q r2, C186588vc r3) {
        this.A02 = r2;
        this.A03 = new AnonymousClass820(r3);
    }
}
