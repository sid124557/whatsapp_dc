package X;

import java.util.Comparator;

/* renamed from: X.8NS  reason: invalid class name */
public abstract class AnonymousClass8NS implements Comparator {
    public abstract int compare(Object obj, Object obj2);

    public static AnonymousClass8NS from(Comparator comparator) {
        if (comparator instanceof AnonymousClass8NS) {
            return (AnonymousClass8NS) comparator;
        }
        return new C129816av(comparator);
    }

    public static AnonymousClass8NS natural() {
        return C129836ax.INSTANCE;
    }

    public AnonymousClass8NS reverse() {
        return new C129826aw(this);
    }

    public static C162027r4 A00(C162027r4 r2, Object obj, int i) {
        return r2.compare(obj, Integer.valueOf(i), natural().reverse());
    }
}
