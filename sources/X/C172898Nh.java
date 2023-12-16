package X;

import java.util.Iterator;

/* renamed from: X.8Nh  reason: invalid class name and case insensitive filesystem */
public final class C172898Nh implements Iterator {
    public final Iterator A00;
    public final /* synthetic */ AnonymousClass8T1 A01;

    public C172898Nh(AnonymousClass8T1 r2) {
        this.A01 = r2;
        this.A00 = r2.A00.iterator();
    }

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    public final void remove() {
        throw C18320x8.A0m();
    }
}
