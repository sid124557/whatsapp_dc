package X;

import java.util.List;

/* renamed from: X.2lj  reason: invalid class name and case insensitive filesystem */
public final class C52592lj {
    public final long A00;
    public final String A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52592lj) {
                C52592lj r8 = (C52592lj) obj;
                if (!C162457s7.A0P(this.A02, r8.A02) || !C162457s7.A0P(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A00((C18300x5.A04(this.A02) + C18270x1.A00(this.A01)) * 31, this.A00);
    }

    public C52592lj(String str, List list, long j) {
        this.A02 = list;
        this.A01 = str;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CachedDirectoryResults(newsletters=");
        A0o.append(this.A02);
        A0o.append(", nextPage=");
        A0o.append(this.A01);
        A0o.append(", validUntil=");
        return C18270x1.A0U(A0o, this.A00);
    }
}
