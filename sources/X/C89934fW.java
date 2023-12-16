package X;

import java.util.List;

/* renamed from: X.4fW  reason: invalid class name and case insensitive filesystem */
public final class C89934fW extends AnonymousClass59W {
    public final List errors;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C89934fW) && C162457s7.A0P(this.errors, ((C89934fW) obj).errors));
    }

    public int hashCode() {
        return this.errors.hashCode();
    }

    public C89934fW(List list) {
        this.errors = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MultipleErrors(errors=");
        return C18260x0.A04(this.errors, A0o);
    }
}
