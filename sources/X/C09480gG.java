package X;

/* renamed from: X.0gG  reason: invalid class name and case insensitive filesystem */
public class C09480gG implements C16240sh {
    public final C01610Bn A00;
    public final C16890uC A01;
    public final C16890uC A02;
    public final String A03;
    public final boolean A04;

    public C16780tx Bqm(AnonymousClass01G r2, C09320g0 r3) {
        return new C09250ft(r2, this, r3);
    }

    public C09480gG(C01610Bn r1, C16890uC r2, C16890uC r3, String str, boolean z) {
        this.A03 = str;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A04 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RectangleShape{position=");
        A0o.append(this.A01);
        A0o.append(", size=");
        return AnonymousClass000.A0Q(this.A02, A0o);
    }
}
