package X;

/* renamed from: X.47r  reason: invalid class name */
public final class AnonymousClass47r extends AnonymousClass3Z4 {
    public static final long serialVersionUID = 0;
    public final Object reference;

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass47r) {
            return this.reference.equals(((AnonymousClass47r) obj).reference);
        }
        return false;
    }

    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    public AnonymousClass47r(Object obj) {
        this.reference = obj;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Optional.of(");
        A0o.append(this.reference);
        return AnonymousClass000.A0e(A0o);
    }
}
