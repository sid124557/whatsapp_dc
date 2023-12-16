package X;

import java.util.Set;

/* renamed from: X.2kE  reason: invalid class name and case insensitive filesystem */
public final class C51692kE {
    public final Set A00;
    public final boolean A01;

    public C51692kE(Set set, boolean z) {
        C162457s7.A0J(set, 2);
        this.A01 = z;
        this.A00 = set;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51692kE) {
                C51692kE r5 = (C51692kE) obj;
                if (this.A01 != r5.A01 || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, AnonymousClass0x9.A04(this.A01));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LazyLoadParams(isQuoted=");
        A0o.append(this.A01);
        A0o.append(", flags=");
        return C18260x0.A04(this.A00, A0o);
    }
}
