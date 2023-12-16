package X;

import java.util.ListIterator;

/* renamed from: X.8OI  reason: invalid class name */
public final class AnonymousClass8OI implements ListIterator {
    public ListIterator A00;
    public final /* synthetic */ AnonymousClass8T3 A01;

    public AnonymousClass8OI(AnonymousClass8T3 r2, int i) {
        this.A01 = r2;
        this.A00 = r2.A00.listIterator(i);
    }

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final boolean hasPrevious() {
        return this.A00.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.A00.next();
    }

    public final int nextIndex() {
        return this.A00.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.A00.previous();
    }

    public final int previousIndex() {
        return this.A00.previousIndex();
    }

    public final /* synthetic */ void add(Object obj) {
        throw C18320x8.A0m();
    }

    public final void remove() {
        throw C18320x8.A0m();
    }

    public final /* synthetic */ void set(Object obj) {
        throw C18320x8.A0m();
    }
}
