package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.3cw  reason: invalid class name and case insensitive filesystem */
public class C71953cw implements Iterator, C834348j {
    public int A00;
    public final /* synthetic */ C73683fu A01;

    public C71953cw(C73683fu r1) {
        this.A01 = r1;
    }

    public boolean hasNext() {
        return AnonymousClass001.A1Y(this.A00, this.A01.size());
    }

    public Object next() {
        if (hasNext()) {
            C73683fu r2 = this.A01;
            int i = this.A00;
            this.A00 = i + 1;
            return r2.get(i);
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw C18290x4.A0x();
    }
}
