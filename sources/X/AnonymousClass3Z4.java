package X;

import java.io.Serializable;

/* renamed from: X.3Z4  reason: invalid class name */
public abstract class AnonymousClass3Z4 implements Serializable {
    public static final long serialVersionUID = 0;

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();

    public Object A00() {
        if (this instanceof AnonymousClass47r) {
            return ((AnonymousClass47r) this).reference;
        }
        throw AnonymousClass001.A0e("value is absent");
    }
}
