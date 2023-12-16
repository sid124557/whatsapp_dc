package X;

import java.util.List;

/* renamed from: X.1TT  reason: invalid class name */
public final class AnonymousClass1TT extends AnonymousClass26V {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass1TT) && C162457s7.A0P(this.A00, ((AnonymousClass1TT) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass1TT(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ShowSearchResults(items=");
        return C18260x0.A04(this.A00, A0o);
    }
}
