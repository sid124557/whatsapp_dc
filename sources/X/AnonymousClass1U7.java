package X;

import java.util.List;

/* renamed from: X.1U7  reason: invalid class name */
public final class AnonymousClass1U7 extends C381826a {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass1U7) && C162457s7.A0P(this.A00, ((AnonymousClass1U7) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass1U7(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ShowSearchResults(items=");
        return C18260x0.A04(this.A00, A0o);
    }
}
