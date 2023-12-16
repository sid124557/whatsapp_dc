package X;

/* renamed from: X.1zj  reason: invalid class name and case insensitive filesystem */
public final class C36691zj extends C36711zl {
    public final Object A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C36691zj) {
                C36691zj r5 = (C36691zj) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C18300x5.A04(this.A00) + C18310x6.A07(this.A01);
    }

    public C36691zj(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Error(request=");
        A0o.append(this.A00);
        A0o.append(", response=");
        return C18260x0.A04(this.A01, A0o);
    }
}
