package X;

/* renamed from: X.1sJ  reason: invalid class name and case insensitive filesystem */
public final class C33021sJ extends AnonymousClass29E {
    public final long A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C33021sJ) {
                C33021sJ r8 = (C33021sJ) obj;
                if (this.A00 != r8.A00 || !C162457s7.A0P(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A01, AnonymousClass0x2.A02(this.A00));
    }

    public C33021sJ(long j, String str) {
        this.A00 = j;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Error(errorCode=");
        A0o.append(this.A00);
        A0o.append(", errorMessage=");
        return C18260x0.A07(this.A01, A0o);
    }
}
