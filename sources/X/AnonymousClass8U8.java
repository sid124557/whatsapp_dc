package X;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.8U8  reason: invalid class name */
public final class AnonymousClass8U8<T> extends AnonymousClass8T9<T> {
    public final List A00;

    public Iterator iterator() {
        return listIterator(0);
    }

    public void add(int i, Object obj) {
        this.A00.add(AnonymousClass8UE.A0j(this, i), obj);
    }

    public void clear() {
        this.A00.clear();
    }

    public Object get(int i) {
        return this.A00.get(AnonymousClass8UE.A0i(this, i));
    }

    public ListIterator listIterator(int i) {
        return new AnonymousClass8OL(this, i);
    }

    public Object set(int i, Object obj) {
        return this.A00.set(AnonymousClass8UE.A0i(this, i), obj);
    }

    public AnonymousClass8U8(List list) {
        this.A00 = list;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
