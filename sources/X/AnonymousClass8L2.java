package X;

import java.io.Serializable;

/* renamed from: X.8L2  reason: invalid class name */
public class AnonymousClass8L2 implements Serializable {
    public static final long serialVersionUID = 0;
    public final Object[] elements;

    public Object readResolve() {
        return C129586aY.copyOf(this.elements);
    }

    public AnonymousClass8L2(Object[] objArr) {
        this.elements = objArr;
    }
}
