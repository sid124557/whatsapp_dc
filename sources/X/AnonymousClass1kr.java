package X;

import java.util.List;

/* renamed from: X.1kr  reason: invalid class name */
public final class AnonymousClass1kr extends AnonymousClass28J {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass1kr) && C162457s7.A0P(this.A00, ((AnonymousClass1kr) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass1kr(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MultipleErrors(errors=");
        return C18260x0.A04(this.A00, A0o);
    }
}
