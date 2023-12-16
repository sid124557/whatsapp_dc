package X;

import java.io.Serializable;

/* renamed from: X.5rC  reason: invalid class name and case insensitive filesystem */
public abstract class C116985rC implements Serializable {
    public static final long serialVersionUID = 0;

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();

    public static C116985rC A01() {
        return C88744aj.A00;
    }

    public Object A04() {
        if (this instanceof C88734ai) {
            return ((C88734ai) this).reference;
        }
        throw AnonymousClass001.A0e("Optional.get() cannot be called on an absent value");
    }

    public Object A05() {
        if (this instanceof C88734ai) {
            return ((C88734ai) this).reference;
        }
        return null;
    }

    public Object A06(Object obj) {
        if (this instanceof C88734ai) {
            return ((C88734ai) this).reference;
        }
        return obj;
    }

    public boolean A07() {
        if (this instanceof C88734ai) {
            return true;
        }
        return false;
    }

    public static C116985rC A02(Object obj) {
        obj.getClass();
        return new C88734ai(obj);
    }

    public static C1229766o A03(C116985rC r0) {
        return (C1229766o) r0.A04();
    }
}
