package X;

import java.util.List;

/* renamed from: X.2ir  reason: invalid class name and case insensitive filesystem */
public final class C50842ir {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C50842ir) && this.A00 == ((C50842ir) obj).A00);
    }

    public static void A00(List list, int i) {
        list.add(new C50842ir(i));
    }

    public C50842ir(int i) {
        this.A00 = i;
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CAGInfoRow(rowType=");
        return C18260x0.A09(A0o, this.A00);
    }
}
