package X;

import java.util.Iterator;

/* renamed from: X.8OE  reason: invalid class name */
public final class AnonymousClass8OE implements Iterator, C834348j {
    public Iterator A00;
    public final Iterator A01;
    public final /* synthetic */ AnonymousClass8PM A02;

    public AnonymousClass8OE(AnonymousClass8PM r2) {
        this.A02 = r2;
        this.A01 = r2.A02.iterator();
    }

    public final boolean A00() {
        Iterator it = this.A00;
        if (it != null && !it.hasNext()) {
            this.A00 = null;
        }
        while (true) {
            if (this.A00 != null) {
                break;
            }
            Iterator it2 = this.A01;
            if (it2.hasNext()) {
                Object next = it2.next();
                AnonymousClass8PM r0 = this.A02;
                Iterator it3 = (Iterator) r0.A00.invoke(r0.A01.invoke(next));
                if (it3.hasNext()) {
                    this.A00 = it3;
                    break;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean hasNext() {
        return A00();
    }

    public Object next() {
        if (A00()) {
            Iterator it = this.A00;
            C162457s7.A0H(it);
            return it.next();
        }
        throw AnonymousClass6CA.A0c();
    }

    public void remove() {
        throw C18290x4.A0x();
    }
}
