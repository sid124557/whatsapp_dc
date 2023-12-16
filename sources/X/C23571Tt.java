package X;

/* renamed from: X.1Tt  reason: invalid class name and case insensitive filesystem */
public final class C23571Tt extends AnonymousClass2UW {
    public final int A00;
    public final String A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23571Tt) {
                C23571Tt r5 = (C23571Tt) obj;
                if (!(C162457s7.A0P(this.A01, r5.A01) && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00((C18310x6.A09(this.A01) + this.A00) * 31, this.A02);
    }

    public C23571Tt(int i, String str, boolean z) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Named(id=");
        A0o.append(this.A01);
        A0o.append(", name=");
        A0o.append(this.A00);
        A0o.append(", enabled=");
        return C18260x0.A0A(A0o, this.A02);
    }
}
