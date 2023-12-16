package X;

/* renamed from: X.7YO  reason: invalid class name */
public final class AnonymousClass7YO {
    public boolean A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7YO) {
                AnonymousClass7YO r5 = (AnonymousClass7YO) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(C18310x6.A09(this.A01), this.A00);
    }

    public AnonymousClass7YO(String str, boolean z) {
        this.A01 = str;
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StateCacheInfo(stateName=");
        A0o.append(this.A01);
        A0o.append(", isUIInitialized=");
        return C18260x0.A0A(A0o, this.A00);
    }
}
