package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.8Nq  reason: invalid class name and case insensitive filesystem */
public final class C172958Nq implements Iterator {
    public int A00 = 0;
    public final int A01;
    public final /* synthetic */ C172528Lo A02;

    public C172958Nq(C172528Lo r2) {
        this.A02 = r2;
        this.A01 = r2.A02();
    }

    public final boolean hasNext() {
        return AnonymousClass001.A1Y(this.A00, this.A01);
    }

    public final /* synthetic */ Object next() {
        try {
            C172528Lo r2 = this.A02;
            int i = this.A00;
            this.A00 = i + 1;
            return Byte.valueOf(r2.A01(i));
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final void remove() {
        throw C18320x8.A0m();
    }
}
