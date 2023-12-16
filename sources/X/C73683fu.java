package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.3fu  reason: invalid class name and case insensitive filesystem */
public abstract class C73683fu<E> extends C71813ci<E> implements List<E>, C834348j {
    public int A01() {
        if (this instanceof C73653fr) {
            return ((C73653fr) this).entries.length;
        }
        if (this instanceof C73673ft) {
            return ((C73673ft) this).A00;
        }
        return ((C73663fs) this).A00;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        C162457s7.A0J(collection, 1);
        if (size() != collection.size()) {
            return false;
        }
        Iterator it = collection.iterator();
        Iterator it2 = iterator();
        while (it2.hasNext()) {
            if (!C162457s7.A0P(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }

    public Object get(int i) {
        if (this instanceof C73653fr) {
            C73653fr r1 = (C73653fr) this;
            AnonymousClass347.A01(i, r1.entries.length);
            return r1.entries[i];
        } else if (this instanceof C73673ft) {
            C73673ft r3 = (C73673ft) this;
            AnonymousClass347.A01(i, r3.size());
            return r3.A03[(r3.A01 + i) % r3.A02];
        } else {
            C73663fs r2 = (C73663fs) this;
            AnonymousClass347.A01(i, r2.A00);
            return r2.A02.get(r2.A01 + i);
        }
    }

    public int indexOf(Object obj) {
        if (this instanceof C73653fr) {
            C73653fr r1 = (C73653fr) this;
            if (!(obj instanceof Enum)) {
                return -1;
            }
            Enum enumR = (Enum) obj;
            int A02 = C18320x8.A02(enumR, 0);
            Enum[] enumArr = r1.entries;
            C162457s7.A0J(enumArr, 0);
            if (A02 < 0 || A02 > enumArr.length - 1 || enumArr[A02] != enumR) {
                return -1;
            }
            return A02;
        }
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (C162457s7.A0P(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (!(this instanceof C73653fr)) {
            ListIterator listIterator = listIterator(size());
            while (listIterator.hasPrevious()) {
                if (C162457s7.A0P(listIterator.previous(), obj)) {
                    return listIterator.nextIndex();
                }
            }
            return -1;
        } else if (!(obj instanceof Enum)) {
            return -1;
        } else {
            C162457s7.A0J(obj, 0);
            return indexOf(obj);
        }
    }

    public ListIterator listIterator(int i) {
        return new C73643fq(this, i);
    }

    public List subList(int i, int i2) {
        return new C73663fs(this, i, i2);
    }

    public void add(int i, Object obj) {
        throw C18290x4.A0x();
    }

    public boolean addAll(int i, Collection collection) {
        throw C18290x4.A0x();
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 1;
        while (it.hasNext()) {
            i = (i * 31) + C18280x3.A04(it.next());
        }
        return i;
    }

    public Object remove(int i) {
        throw C18290x4.A0x();
    }

    public Object set(int i, Object obj) {
        throw C18290x4.A0x();
    }

    public ListIterator listIterator() {
        return new C73643fq(this, 0);
    }
}
