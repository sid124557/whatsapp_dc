package X;

/* renamed from: X.7To  reason: invalid class name and case insensitive filesystem */
public final class C151137To {
    public int A00 = -1;
    public AnonymousClass21X A01;
    public C142806xo A02;
    public C161347pT A03;
    public C150907Sr A04;

    public String toString() {
        StringBuilder A0Y = AnonymousClass6CA.A0Y(200);
        A0Y.append("<<\n");
        A0Y.append(" mode: ");
        A0Y.append(this.A02);
        A0Y.append("\n ecLevel: ");
        A0Y.append(this.A01);
        A0Y.append("\n version: ");
        A0Y.append(this.A03);
        A0Y.append("\n maskPattern: ");
        A0Y.append(this.A00);
        C150907Sr r1 = this.A04;
        if (r1 == null) {
            A0Y.append("\n matrix: null\n");
        } else {
            A0Y.append("\n matrix:\n");
            A0Y.append(r1);
        }
        return AnonymousClass000.A0X(">>\n", A0Y);
    }
}
