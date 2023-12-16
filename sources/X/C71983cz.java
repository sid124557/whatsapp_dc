package X;

import java.util.Iterator;

/* renamed from: X.3cz  reason: invalid class name and case insensitive filesystem */
public final class C71983cz implements Iterator, C834348j {
    public final Iterator A00;
    public final /* synthetic */ C72623e1 A01;

    public C71983cz(C72623e1 r2) {
        this.A01 = r2;
        this.A00 = r2.A01.iterator();
    }

    public boolean hasNext() {
        return this.A00.hasNext();
    }

    public Object next() {
        return this.A01.A00.invoke(this.A00.next());
    }

    public void remove() {
        throw C18290x4.A0x();
    }
}
