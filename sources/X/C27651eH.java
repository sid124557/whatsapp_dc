package X;

import java.util.Set;

/* renamed from: X.1eH  reason: invalid class name and case insensitive filesystem */
public final class C27651eH extends AnonymousClass27J {
    public final Set A00;
    public final Set A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27651eH) {
                C27651eH r5 = (C27651eH) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, C18300x5.A04(this.A00));
    }

    public C27651eH(Set set, Set set2) {
        this.A00 = set;
        this.A01 = set2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LinkSubgroupsResult(groups=");
        A0o.append(this.A00);
        A0o.append(", participants=");
        return C18260x0.A04(this.A01, A0o);
    }
}
