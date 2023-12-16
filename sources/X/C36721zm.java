package X;

/* renamed from: X.1zm  reason: invalid class name and case insensitive filesystem */
public final class C36721zm extends AnonymousClass29w {
    public final Object A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C36721zm) {
                C36721zm r5 = (C36721zm) obj;
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

    public C36721zm(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Success(request=");
        A0o.append(this.A00);
        A0o.append(", response=");
        return C18260x0.A04(this.A01, A0o);
    }
}
