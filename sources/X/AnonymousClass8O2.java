package X;

import java.util.Iterator;

/* renamed from: X.8O2  reason: invalid class name */
public class AnonymousClass8O2 implements Iterator {
    public int A00;
    public final int A01;
    public final /* synthetic */ C172548Lq A02;

    public AnonymousClass8O2(C172548Lq r2) {
        this.A02 = r2;
        this.A00 = 0;
        this.A01 = r2.A03();
    }

    public boolean hasNext() {
        return AnonymousClass001.A1Y(this.A00, this.A01);
    }

    public /* bridge */ /* synthetic */ Object next() {
        byte b;
        int i = this.A00;
        if (i < this.A01) {
            this.A00 = i + 1;
            C130256bf r2 = (C130256bf) this.A02;
            if (r2 instanceof C130246be) {
                C130246be r22 = (C130246be) r2;
                b = r22.bytes[r22.bytesOffset + i];
            } else {
                b = r2.bytes[i];
            }
            return Byte.valueOf(b);
        }
        throw AnonymousClass6CA.A0c();
    }

    public final void remove() {
        throw C18320x8.A0m();
    }

    public AnonymousClass8O2() {
    }
}
