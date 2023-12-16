package X;

/* renamed from: X.2k3  reason: invalid class name and case insensitive filesystem */
public final class C51582k3 {
    public final String A00;
    public final String A01;

    public C51582k3(String str, String str2) {
        C162457s7.A0J(str, 1);
        this.A01 = str;
        this.A00 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51582k3) {
                C51582k3 r5 = (C51582k3) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C18310x6.A09(this.A01) + C18270x1.A00(this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Command(name=");
        A0o.append(this.A01);
        A0o.append(", description=");
        return C18260x0.A07(this.A00, A0o);
    }
}
