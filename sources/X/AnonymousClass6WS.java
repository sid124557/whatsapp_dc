package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.6WS  reason: invalid class name */
public abstract class AnonymousClass6WS extends C174088Sx implements List, RandomAccess {
    public static final AnonymousClass6WZ A00 = new AnonymousClass6WY(AnonymousClass6WR.A02, 0);

    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        Object obj2 = get(i);
                        Object obj3 = list.get(i);
                        if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    boolean hasNext2 = it2.hasNext();
                    if (hasNext) {
                        if (!hasNext2 || ((next = it.next()) != (next2 = it2.next()) && (next == null || !next.equals(next2)))) {
                            break;
                        }
                    } else if (!hasNext2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            int size = size();
            for (int i = 0; i < size; i++) {
                if (AnonymousClass6C9.A1O(obj, this, i)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        if (obj != null) {
            int size = size();
            do {
                size--;
                if (size >= 0) {
                }
            } while (!AnonymousClass6C9.A1O(obj, this, size));
            return size;
        }
        return -1;
    }

    /* renamed from: A04 */
    public AnonymousClass6WS subList(int i, int i2) {
        if (this instanceof AnonymousClass6WQ) {
            AnonymousClass6WQ r2 = (AnonymousClass6WQ) this;
            C159327le.A02(i, i2, r2.A01);
            AnonymousClass6WS r1 = r2.zzc;
            int i3 = r2.A00;
            return r1.subList(i + i3, i2 + i3);
        }
        C159327le.A02(i, i2, size());
        int i4 = i2 - i;
        if (i4 == size()) {
            return this;
        }
        if (i4 == 0) {
            return AnonymousClass6WR.A02;
        }
        return new AnonymousClass6WQ(this, i, i4);
    }

    /* renamed from: A05 */
    public final AnonymousClass6WZ listIterator(int i) {
        int size = size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(C159327le.A00("index", i, size));
        } else if (isEmpty()) {
            return A00;
        } else {
            return new AnonymousClass6WY(this, i);
        }
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw C18320x8.A0m();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw C18320x8.A0m();
    }

    public final boolean contains(Object obj) {
        return AnonymousClass001.A1U(indexOf(obj));
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = AnonymousClass002.A02(get(i2), i * 31);
        }
        return i;
    }

    @Deprecated
    public final Object remove(int i) {
        throw C18320x8.A0m();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw C18320x8.A0m();
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }
}
