package X;

/* renamed from: X.2kj  reason: invalid class name and case insensitive filesystem */
public final class C52002kj {
    public final int A00;
    public final String A01;

    public C52002kj(int i, String str) {
        C162457s7.A0J(str, 2);
        this.A00 = i;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52002kj) {
                C52002kj r5 = (C52002kj) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A01, this.A00 * 31);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ErrorData(errorCode=");
        A0o.append(this.A00);
        A0o.append(", errorDescription=");
        return C18260x0.A07(this.A01, A0o);
    }
}
