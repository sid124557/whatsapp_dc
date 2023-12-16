package X;

/* renamed from: X.2kK  reason: invalid class name and case insensitive filesystem */
public final class C51752kK {
    public final String A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51752kK) {
                C51752kK r5 = (C51752kK) obj;
                if (this.A01 != r5.A01 || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x9.A04(this.A01) + C18270x1.A00(this.A00);
    }

    public C51752kK(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ComparisonResult(areMessagesEqual=");
        A0o.append(this.A01);
        A0o.append(", errorMessage=");
        return C18260x0.A07(this.A00, A0o);
    }
}
