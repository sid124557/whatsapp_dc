package X;

import java.util.Iterator;

/* renamed from: X.8O1  reason: invalid class name */
public final class AnonymousClass8O1 implements Iterator {
    public int A00;
    public final int A01;
    public final /* synthetic */ C172538Lp A02;

    public AnonymousClass8O1(C172538Lp r2) {
        this.A02 = r2;
        this.A00 = 0;
        this.A01 = r2.A01();
    }

    public final boolean hasNext() {
        return AnonymousClass001.A1Y(this.A00, this.A01);
    }

    public /* synthetic */ Object next() {
        byte b;
        int i = this.A00;
        if (i < this.A01) {
            this.A00 = i + 1;
            C128876Xu r2 = (C128876Xu) this.A02;
            if (r2 instanceof C128866Xt) {
                C128866Xt r22 = (C128866Xt) r2;
                b = r22.zzb[r22.zzc + i];
            } else {
                b = r2.zzb[i];
            }
            return Byte.valueOf(b);
        }
        throw AnonymousClass6CA.A0c();
    }

    public final void remove() {
        throw C18320x8.A0m();
    }

    public AnonymousClass8O1() {
    }
}
