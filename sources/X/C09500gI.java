package X;

/* renamed from: X.0gI  reason: invalid class name and case insensitive filesystem */
public class C09500gI implements C16240sh {
    public final C01610Bn A00;
    public final C01610Bn A01;
    public final C01610Bn A02;
    public final AnonymousClass0FR A03;
    public final String A04;
    public final boolean A05;

    public C16780tx Bqm(AnonymousClass01G r2, C09320g0 r3) {
        return new C09200fo(this, r3);
    }

    public C09500gI(C01610Bn r1, C01610Bn r2, C01610Bn r3, AnonymousClass0FR r4, String str, boolean z) {
        this.A04 = str;
        this.A03 = r4;
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A05 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Trim Path: {start: ");
        A0o.append(this.A02);
        A0o.append(", end: ");
        A0o.append(this.A00);
        A0o.append(", offset: ");
        A0o.append(this.A01);
        return AnonymousClass000.A0g(A0o);
    }
}
