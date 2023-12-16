package X;

/* renamed from: X.2lt  reason: invalid class name and case insensitive filesystem */
public final class C52692lt {
    public final int A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52692lt) {
                C52692lt r5 = (C52692lt) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + C18270x1.A00(this.A01)) * 31) + AnonymousClass0x7.A07(this.A02);
    }

    public C52692lt(int i, String str, String str2) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ErrorResponse(errorMessageResId=");
        A0o.append(this.A00);
        A0o.append(", errorType=");
        A0o.append(this.A01);
        A0o.append(", exceptionMessage=");
        return C18260x0.A07(this.A02, A0o);
    }
}
