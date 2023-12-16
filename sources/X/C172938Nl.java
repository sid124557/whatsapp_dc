package X;

import java.util.Iterator;

/* renamed from: X.8Nl  reason: invalid class name and case insensitive filesystem */
public class C172938Nl implements Iterator {
    public Iterator A00;
    public final /* synthetic */ AnonymousClass8T7 A01;

    public C172938Nl(AnonymousClass8T7 r2) {
        this.A01 = r2;
        this.A00 = r2.A00.iterator();
    }

    public boolean hasNext() {
        return this.A00.hasNext();
    }

    public /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    public void remove() {
        throw C18320x8.A0m();
    }
}
