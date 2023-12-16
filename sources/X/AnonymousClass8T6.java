package X;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.8T6  reason: invalid class name */
public abstract class AnonymousClass8T6<E> extends AbstractList<E> implements C188248ya<E> {
    public boolean A00 = true;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                if (!(obj instanceof RandomAccess)) {
                    return super.equals(obj);
                }
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    int i = 0;
                    while (i < size) {
                        if (AnonymousClass6C9.A1O(get(i), list, i)) {
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public void A00() {
        if (!this.A00) {
            throw C18320x8.A0m();
        }
    }

    public boolean add(Object obj) {
        A00();
        return super.add(obj);
    }

    public boolean addAll(int i, Collection collection) {
        A00();
        return super.addAll(i, collection);
    }

    public void clear() {
        A00();
        super.clear();
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = AnonymousClass002.A02(get(i2), i * 31);
        }
        return i;
    }

    public boolean remove(Object obj) {
        A00();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public boolean removeAll(Collection collection) {
        A00();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        A00();
        return super.retainAll(collection);
    }

    public boolean addAll(Collection collection) {
        A00();
        return super.addAll(collection);
    }
}
