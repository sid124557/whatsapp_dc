package X;

import java.util.Iterator;

/* renamed from: X.8Ni  reason: invalid class name and case insensitive filesystem */
public final class C172908Ni implements Iterator {
    public Iterator A00;
    public final /* synthetic */ AnonymousClass8T3 A01;

    public C172908Ni(AnonymousClass8T3 r2) {
        this.A01 = r2;
        this.A00 = r2.A00.iterator();
    }

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.A00.next();
    }

    public final void remove() {
        throw C18320x8.A0m();
    }
}
