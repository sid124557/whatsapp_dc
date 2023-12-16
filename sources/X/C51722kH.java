package X;

/* renamed from: X.2kH  reason: invalid class name and case insensitive filesystem */
public final class C51722kH {
    public final int A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51722kH) {
                C51722kH r5 = (C51722kH) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, this.A00 * 31);
    }

    public C51722kH(int i, Object obj) {
        this.A00 = i;
        this.A01 = obj;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Item(type=");
        A0o.append(this.A00);
        A0o.append(", data=");
        return C18260x0.A04(this.A01, A0o);
    }
}
