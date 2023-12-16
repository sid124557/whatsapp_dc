package X;

/* renamed from: X.88r  reason: invalid class name and case insensitive filesystem */
public final class C1692788r implements C184928sm {
    public C187588xU A00;
    public C184928sm A01;
    public boolean A02 = true;
    public boolean A03;
    public final C177958gj A04;
    public final C1692888s A05;

    public C158477k2 BBR() {
        C184928sm r0 = this.A01;
        if (r0 != null) {
            return r0.BBR();
        }
        return this.A05.A02;
    }

    public long BBa() {
        if (this.A02) {
            return this.A05.BBa();
        }
        C184928sm r0 = this.A01;
        r0.getClass();
        return r0.BBa();
    }

    public void Bmy(C158477k2 r2) {
        C184928sm r0 = this.A01;
        if (r0 != null) {
            r0.Bmy(r2);
            r2 = this.A01.BBR();
        }
        this.A05.Bmy(r2);
    }

    public C1692788r(C177958gj r2, C186668vk r3) {
        this.A04 = r2;
        this.A05 = new C1692888s(r3);
    }
}
