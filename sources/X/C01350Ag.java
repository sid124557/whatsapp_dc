package X;

import java.util.Set;

/* renamed from: X.0Ag  reason: invalid class name and case insensitive filesystem */
public final class C01350Ag extends C03020In {
    public final Set A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C01350Ag) && C162457s7.A0P(this.A00, ((C01350Ag) obj).A00));
    }

    public int hashCode() {
        return (this.A00.hashCode() * 31) + 1231;
    }

    public C01350Ag(Set set) {
        this.A00 = C73723fy.A0P(set);
    }
}
