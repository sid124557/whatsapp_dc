package X;

import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: X.8O8  reason: invalid class name */
public final class AnonymousClass8O8 implements Iterator, C834348j {
    public final /* synthetic */ Enumeration A00;

    public AnonymousClass8O8(Enumeration enumeration) {
        this.A00 = enumeration;
    }

    public boolean hasNext() {
        return this.A00.hasMoreElements();
    }

    public Object next() {
        return this.A00.nextElement();
    }

    public void remove() {
        throw C18290x4.A0x();
    }
}
