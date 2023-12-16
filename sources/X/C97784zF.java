package X;

import java.util.AbstractCollection;

/* renamed from: X.4zF  reason: invalid class name and case insensitive filesystem */
public class C97784zF extends C156137g5 {
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C156137g5 r5 = (C156137g5) obj;
            if (this.A00 != r5.A00 || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public static void A00(Object obj, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new C97784zF(obj, i));
    }

    public int hashCode() {
        return C18300x5.A04(this.A01) + this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[type: ");
        A0o.append(this.A00);
        A0o.append(", data: ");
        A0o.append(this.A01);
        return AnonymousClass000.A0X("]", A0o);
    }

    public C97784zF(Object obj, int i) {
        super(obj, i);
    }
}
