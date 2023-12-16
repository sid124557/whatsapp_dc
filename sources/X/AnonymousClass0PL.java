package X;

/* renamed from: X.0PL  reason: invalid class name */
public final class AnonymousClass0PL {
    public final int A00;
    public final String A01;

    public AnonymousClass0PL(String str, int i) {
        C162457s7.A0J(str, 1);
        this.A01 = str;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0PL) {
                AnonymousClass0PL r5 = (AnonymousClass0PL) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WorkGenerationalId(workSpecId=");
        A0o.append(this.A01);
        A0o.append(", generation=");
        A0o.append(this.A00);
        return AnonymousClass000.A0c(A0o);
    }
}
