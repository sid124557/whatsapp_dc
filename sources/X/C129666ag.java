package X;

import java.util.Comparator;

/* renamed from: X.6ag  reason: invalid class name and case insensitive filesystem */
public final class C129666ag extends C129496aP {
    public final Comparator comparator;

    public C129736an build() {
        C129736an construct = C129736an.construct(this.comparator, this.size, this.contents);
        this.size = construct.size();
        this.forceCopy = true;
        return construct;
    }

    public C129666ag(Comparator comparator2) {
        comparator2.getClass();
        this.comparator = comparator2;
    }

    public C129666ag add(Object obj) {
        super.add(obj);
        return this;
    }

    public C129666ag addAll(Iterable iterable) {
        super.addAll(iterable);
        return this;
    }

    public C129666ag add(Object... objArr) {
        super.add(objArr);
        return this;
    }
}
