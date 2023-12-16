package X;

/* renamed from: X.0PM  reason: invalid class name */
public final class AnonymousClass0PM {
    public AnonymousClass0GD A00;
    public String A01;

    public AnonymousClass0PM(AnonymousClass0GD r2, String str) {
        C162457s7.A0J(str, 1);
        C162457s7.A0J(r2, 2);
        this.A01 = str;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0PM) {
                AnonymousClass0PM r5 = (AnonymousClass0PM) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, this.A01.hashCode() * 31);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("IdAndState(id=");
        A0o.append(this.A01);
        A0o.append(", state=");
        A0o.append(this.A00);
        return AnonymousClass000.A0c(A0o);
    }
}
