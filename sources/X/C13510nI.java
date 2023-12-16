package X;

import java.util.Iterator;

/* renamed from: X.0nI  reason: invalid class name and case insensitive filesystem */
public abstract class C13510nI implements Iterator, C15620rf {
    public C13540nL A00;
    public C13540nL A01;

    public abstract C13540nL A00(C13540nL r1);

    public abstract C13540nL A01(C13540nL r1);

    public void BqL(C13540nL r3) {
        C13540nL r0;
        C13540nL r1 = this.A00;
        if (r1 == r3 && r3 == this.A01) {
            r1 = null;
            this.A01 = null;
            this.A00 = null;
        }
        if (r1 == r3) {
            r1 = A00(r1);
            this.A00 = r1;
        }
        C13540nL r02 = this.A01;
        if (r02 == r3) {
            if (r02 == r1 || r1 == null) {
                r0 = null;
            } else {
                r0 = A01(r02);
            }
            this.A01 = r0;
        }
    }

    public boolean hasNext() {
        return AnonymousClass000.A1W(this.A01);
    }

    public /* bridge */ /* synthetic */ Object next() {
        C13540nL r0;
        C13540nL r1 = this.A01;
        C13540nL r02 = this.A00;
        if (r1 == r02 || r02 == null) {
            r0 = null;
        } else {
            r0 = A01(r1);
        }
        this.A01 = r0;
        return r1;
    }

    public C13510nI(C13540nL r1, C13540nL r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
