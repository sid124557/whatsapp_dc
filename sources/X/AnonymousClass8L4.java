package X;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: X.8L4  reason: invalid class name */
public class AnonymousClass8L4 implements Serializable {
    public static final long serialVersionUID = 0;
    public final Comparator comparator;
    public final Object[] elements;

    public Object readResolve() {
        C129666ag r1 = new C129666ag(this.comparator);
        r1.add(this.elements);
        return r1.build();
    }

    public AnonymousClass8L4(Comparator comparator2, Object[] objArr) {
        this.comparator = comparator2;
        this.elements = objArr;
    }
}
