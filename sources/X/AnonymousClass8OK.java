package X;

import java.util.ListIterator;

/* renamed from: X.8OK  reason: invalid class name */
public class AnonymousClass8OK implements ListIterator {
    public ListIterator A00;
    public final /* synthetic */ AnonymousClass8T7 A01;

    public AnonymousClass8OK(AnonymousClass8T7 r2, int i) {
        this.A01 = r2;
        this.A00 = r2.A00.listIterator(i);
    }

    public boolean hasNext() {
        return this.A00.hasNext();
    }

    public boolean hasPrevious() {
        return this.A00.hasPrevious();
    }

    public /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    public int nextIndex() {
        return this.A00.nextIndex();
    }

    public /* bridge */ /* synthetic */ Object previous() {
        return this.A00.previous();
    }

    public int previousIndex() {
        return this.A00.previousIndex();
    }

    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw C18320x8.A0m();
    }

    public void remove() {
        throw C18320x8.A0m();
    }

    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw C18320x8.A0m();
    }
}
