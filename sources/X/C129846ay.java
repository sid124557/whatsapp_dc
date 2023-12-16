package X;

import java.io.Serializable;

/* renamed from: X.6ay  reason: invalid class name and case insensitive filesystem */
public final class C129846ay extends AnonymousClass8NS implements Serializable {
    public static final C129846ay INSTANCE = new C129846ay();
    public static final long serialVersionUID = 0;

    private Object readResolve() {
        return INSTANCE;
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }

    public int compare(Comparable comparable, Comparable comparable2) {
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public AnonymousClass8NS reverse() {
        return AnonymousClass8NS.natural();
    }
}
