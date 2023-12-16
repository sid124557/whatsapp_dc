package X;

/* renamed from: X.0gF  reason: invalid class name and case insensitive filesystem */
public class C09470gF implements C16240sh {
    public final int A00;
    public final C01590Bl A01;
    public final String A02;
    public final boolean A03;

    public C16780tx Bqm(AnonymousClass01G r2, C09320g0 r3) {
        return new C09220fq(r2, this, r3);
    }

    public C09470gF(C01590Bl r1, String str, int i, boolean z) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = r1;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ShapePath{name=");
        A0o.append(this.A02);
        A0o.append(", index=");
        A0o.append(this.A00);
        return AnonymousClass000.A0d(A0o);
    }
}
