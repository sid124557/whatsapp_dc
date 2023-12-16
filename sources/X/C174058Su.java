package X;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.8Su  reason: invalid class name and case insensitive filesystem */
public class C174058Su<E> extends AbstractCollection<E> {
    public final C181308mY predicate;
    public final Collection unfiltered;

    public boolean add(Object obj) {
        C162187rP.A06(this.predicate.AxD(obj));
        return this.unfiltered.add(obj);
    }

    public void clear() {
        C162247rW.removeIf(this.unfiltered, this.predicate);
    }

    public boolean contains(Object obj) {
        if (C161497pn.safeContains(this.unfiltered, obj)) {
            return this.predicate.AxD(obj);
        }
        return false;
    }

    public C174058Su createCombined(C181308mY r4) {
        Collection collection = this.unfiltered;
        C181308mY r1 = this.predicate;
        r1.getClass();
        C181308mY[] r0 = new C181308mY[2];
        AnonymousClass000.A16(r1, r4, r0);
        return new C174058Su(collection, new AnonymousClass8CK(Arrays.asList(r0)));
    }

    public boolean isEmpty() {
        return !C162247rW.any(this.unfiltered, this.predicate);
    }

    public Iterator iterator() {
        return C162467s8.filter(this.unfiltered.iterator(), this.predicate);
    }

    public boolean removeAll(Collection collection) {
        Iterator it = this.unfiltered.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.predicate.AxD(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public boolean retainAll(Collection collection) {
        Iterator it = this.unfiltered.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.predicate.AxD(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public int size() {
        int i = 0;
        for (Object AxD : this.unfiltered) {
            if (this.predicate.AxD(AxD)) {
                i++;
            }
        }
        return i;
    }

    public C174058Su(Collection collection, C181308mY r2) {
        this.unfiltered = collection;
        this.predicate = r2;
    }

    public boolean addAll(Collection collection) {
        for (Object AxD : collection) {
            C162187rP.A06(this.predicate.AxD(AxD));
        }
        return this.unfiltered.addAll(collection);
    }

    public boolean containsAll(Collection collection) {
        return C161497pn.containsAllImpl(this, collection);
    }

    public boolean remove(Object obj) {
        if (!contains(obj) || !this.unfiltered.remove(obj)) {
            return false;
        }
        return true;
    }

    public Object[] toArray(Object[] objArr) {
        return C162197rQ.newArrayList(iterator()).toArray(objArr);
    }

    public Object[] toArray() {
        return C162197rQ.newArrayList(iterator()).toArray();
    }
}
