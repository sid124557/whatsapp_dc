package X;

/* renamed from: X.2kh  reason: invalid class name and case insensitive filesystem */
public final class C51982kh {
    public final int A00;
    public final Boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51982kh) {
                C51982kh r5 = (C51982kh) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + AnonymousClass000.A07(this.A01);
    }

    public C51982kh(Boolean bool, int i) {
        this.A00 = i;
        this.A01 = bool;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EphemeralAdditionalInfo(trigger=");
        A0o.append(this.A00);
        A0o.append(", initiatedByMe=");
        return C18260x0.A04(this.A01, A0o);
    }
}
