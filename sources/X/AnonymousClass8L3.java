package X;

import java.io.Serializable;

/* renamed from: X.8L3  reason: invalid class name */
public class AnonymousClass8L3 implements Serializable {
    public static final long serialVersionUID = 0;
    public final Object[] elements;

    public Object readResolve() {
        return C129526aS.copyOf(this.elements);
    }

    public AnonymousClass8L3(Object[] objArr) {
        this.elements = objArr;
    }
}
