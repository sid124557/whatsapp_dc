package X;

import java.util.List;

/* renamed from: X.7Y3  reason: invalid class name */
public final class AnonymousClass7Y3 {
    public final List A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7Y3) {
                AnonymousClass7Y3 r5 = (AnonymousClass7Y3) obj;
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

    public AnonymousClass7Y3(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TypeaheadRecentSearch(categories=");
        A0o.append(this.A01);
        A0o.append(", businesses=");
        return C18260x0.A04(this.A00, A0o);
    }
}
