package X;

import java.util.ListIterator;

/* renamed from: X.8OL  reason: invalid class name */
public final class AnonymousClass8OL implements ListIterator, C834348j {
    public final ListIterator A00;
    public final /* synthetic */ AnonymousClass8U8 A01;

    public AnonymousClass8OL(AnonymousClass8U8 r3, int i) {
        this.A01 = r3;
        this.A00 = r3.A00.listIterator(AnonymousClass8UE.A0j(r3, i));
    }

    public void add(Object obj) {
        ListIterator listIterator = this.A00;
        listIterator.add(obj);
        listIterator.previous();
    }

    public boolean hasNext() {
        return this.A00.hasPrevious();
    }

    public boolean hasPrevious() {
        return this.A00.hasNext();
    }

    public Object next() {
        return this.A00.previous();
    }

    public int nextIndex() {
        AnonymousClass8U8 r2 = this.A01;
        return C86664Kz.A0M(r2) - this.A00.previousIndex();
    }

    public Object previous() {
        return this.A00.next();
    }

    public int previousIndex() {
        AnonymousClass8U8 r2 = this.A01;
        return C86664Kz.A0M(r2) - this.A00.nextIndex();
    }

    public void remove() {
        this.A00.remove();
    }

    public void set(Object obj) {
        this.A00.set(obj);
    }
}
