package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.4Ju  reason: invalid class name and case insensitive filesystem */
public class C86354Ju implements Iterator, C834348j {
    public int A00;
    public Object A01;
    public final int A02;

    public C86354Ju(C72643e3 r2) {
        this.A02 = 1;
        this.A00 = 50;
        this.A01 = r2.A00.iterator();
    }

    public boolean hasNext() {
        if (this.A02 == 0) {
            return ((Iterator) this.A01).hasNext();
        }
        if (this.A00 <= 0 || !((Iterator) this.A01).hasNext()) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ Object next() {
        if (this.A02 != 0) {
            int i = this.A00;
            if (i != 0) {
                this.A00 = i - 1;
                return ((Iterator) this.A01).next();
            }
            throw new NoSuchElementException();
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        if (i2 >= 0) {
            return new C55232q1(i2, ((Iterator) this.A01).next());
        }
        throw C18280x3.A0X();
    }

    public void remove() {
        int i = this.A02;
        throw C18290x4.A0x();
    }

    public C86354Ju(C72593dy r2) {
        this.A02 = 0;
        this.A01 = r2.A00.iterator();
    }
}
