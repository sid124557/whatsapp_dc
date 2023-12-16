package X;

/* renamed from: X.1Ts  reason: invalid class name and case insensitive filesystem */
public final class C23561Ts extends AnonymousClass2UW {
    public final C50612iT A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23561Ts) {
                C23561Ts r5 = (C23561Ts) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, C18310x6.A09(this.A01));
    }

    public C23561Ts(C50612iT r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Pack(id=");
        A0o.append(this.A01);
        A0o.append(", pack=");
        return C18260x0.A04(this.A00, A0o);
    }
}
