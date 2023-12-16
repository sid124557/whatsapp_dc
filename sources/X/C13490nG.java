package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0nG  reason: invalid class name and case insensitive filesystem */
public final class C13490nG implements Iterator {
    public int A00;
    public int A01;
    public boolean A02 = false;
    public final int A03;
    public final /* synthetic */ AnonymousClass0UU A04;

    public C13490nG(AnonymousClass0UU r2, int i) {
        this.A04 = r2;
        this.A03 = i;
        this.A01 = r2.A01();
    }

    public boolean hasNext() {
        return AnonymousClass001.A1Y(this.A00, this.A01);
    }

    public void remove() {
        if (this.A02) {
            int i = this.A00 - 1;
            this.A00 = i;
            this.A01--;
            this.A02 = false;
            this.A04.A05(i);
            return;
        }
        throw new IllegalStateException();
    }

    public Object next() {
        if (hasNext()) {
            AnonymousClass0UU r1 = this.A04;
            int i = this.A00;
            Object A032 = r1.A03(i, this.A03);
            this.A00 = i + 1;
            this.A02 = true;
            return A032;
        }
        throw new NoSuchElementException();
    }
}
