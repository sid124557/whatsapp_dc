package X;

import java.util.List;

/* renamed from: X.2jY  reason: invalid class name and case insensitive filesystem */
public final class C51272jY {
    public final C50802in A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51272jY) {
                C51272jY r5 = (C51272jY) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, C18300x5.A04(this.A01));
    }

    public C51272jY(C50802in r1, List list) {
        this.A01 = list;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AREffectsConnection(nodes=");
        A0o.append(this.A01);
        A0o.append(", pageInfo=");
        return C18260x0.A04(this.A00, A0o);
    }
}
