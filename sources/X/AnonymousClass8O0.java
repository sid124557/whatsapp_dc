package X;

import java.util.Iterator;

/* renamed from: X.8O0  reason: invalid class name */
public final class AnonymousClass8O0 implements Iterator {
    public int A00;
    public final int A01;
    public final /* synthetic */ AnonymousClass8Ln A02;

    public AnonymousClass8O0(AnonymousClass8Ln r2) {
        this.A02 = r2;
        this.A00 = 0;
        this.A01 = r2.A01();
    }

    public final boolean hasNext() {
        return AnonymousClass001.A1Y(this.A00, this.A01);
    }

    public final /* synthetic */ Object next() {
        int i = this.A00;
        if (i < this.A01) {
            this.A00 = i + 1;
            return Byte.valueOf(((AnonymousClass6VD) this.A02).zza[i]);
        }
        throw AnonymousClass6CA.A0c();
    }

    public final void remove() {
        throw C18320x8.A0m();
    }

    public AnonymousClass8O0() {
    }
}
