package X;

/* renamed from: X.5S2  reason: invalid class name */
public final class AnonymousClass5S2 {
    public final int A00;
    public final AnonymousClass8LC A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass5S2)) {
            return false;
        }
        AnonymousClass5S2 r4 = (AnonymousClass5S2) obj;
        return this.A02.equals(r4.A02) && this.A00 == r4.A00 && this.A01.equals(r4.A01);
    }

    public AnonymousClass5S2(AnonymousClass8LC r2, String str, int i) {
        if (i < 0) {
            throw AnonymousClass001.A0c("Start index must be >= 0.");
        } else if (str != null) {
            this.A00 = i;
            this.A02 = str;
            this.A01 = r2;
        } else {
            throw null;
        }
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        AnonymousClass000.A1L(A1X, this.A00);
        A1X[1] = this.A02;
        return C18310x6.A08(this.A01, A1X, 2);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PhoneNumberMatch [");
        int i = this.A00;
        A0o.append(i);
        A0o.append(",");
        String str = this.A02;
        A0o.append(i + str.length());
        return AnonymousClass000.A0V(") ", str, A0o);
    }
}
