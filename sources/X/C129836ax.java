package X;

import java.io.Serializable;

/* renamed from: X.6ax  reason: invalid class name and case insensitive filesystem */
public final class C129836ax extends AnonymousClass8NS implements Serializable {
    public static final C129836ax INSTANCE = new C129836ax();
    public static final long serialVersionUID = 0;

    private Object readResolve() {
        return INSTANCE;
    }

    public AnonymousClass8NS reverse() {
        return C129846ay.INSTANCE;
    }

    public String toString() {
        return "Ordering.natural()";
    }

    public int compare(Comparable comparable, Comparable comparable2) {
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }
}
