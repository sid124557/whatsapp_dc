package X;

import java.util.List;

/* renamed from: X.2yT  reason: invalid class name and case insensitive filesystem */
public final class C60382yT {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C60382yT) && C162457s7.A0P(this.A00, ((C60382yT) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A07(this.A00);
    }

    public C60382yT(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UiState(listItems=");
        return C18260x0.A04(this.A00, A0o);
    }

    public C60382yT() {
        this((List) null);
    }
}
