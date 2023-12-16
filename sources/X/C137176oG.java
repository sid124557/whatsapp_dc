package X;

/* renamed from: X.6oG  reason: invalid class name and case insensitive filesystem */
public final class C137176oG extends AnonymousClass750 {
    public final int A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C137176oG) {
                C137176oG r5 = (C137176oG) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + C18270x1.A00(this.A02)) * 31) + AnonymousClass0x7.A07(this.A01);
    }

    public C137176oG(int i, String str, String str2) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EventShowError(errorCode=");
        A0o.append(this.A00);
        A0o.append(", errorTitle=");
        A0o.append(this.A02);
        A0o.append(", errorMessage=");
        return C18260x0.A07(this.A01, A0o);
    }
}
