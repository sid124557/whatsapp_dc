package X;

/* renamed from: X.2kB  reason: invalid class name and case insensitive filesystem */
public final class C51662kB {
    public final C85164Fe A00;
    public final C105425Uw A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51662kB) {
                C51662kB r5 = (C51662kB) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, C18300x5.A04(this.A01));
    }

    public C51662kB(C85164Fe r1, C105425Uw r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ExpressionsTrayShapeData(shape=");
        A0o.append(this.A01);
        A0o.append(", shapeCreator=");
        return C18260x0.A04(this.A00, A0o);
    }
}
