package X;

import java.util.List;

/* renamed from: X.1UK  reason: invalid class name */
public final class AnonymousClass1UK extends C382026d {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass1UK) && C162457s7.A0P(this.A00, ((AnonymousClass1UK) obj).A00));
    }

    public int hashCode() {
        return ((C18300x5.A04(this.A00) - 65536) * 31) + 4;
    }

    public AnonymousClass1UK(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Data(shapes=");
        A0o.append(this.A00);
        A0o.append(", strokeColor=");
        A0o.append(-65536);
        A0o.append(", strokeWidth=");
        return C18260x0.A09(A0o, 4);
    }
}
