package X;

import java.util.Iterator;

/* renamed from: X.0nH  reason: invalid class name and case insensitive filesystem */
public class C13500nH implements Iterator, C15620rf {
    public C13540nL A00;
    public boolean A01 = true;
    public final /* synthetic */ C10610iE A02;

    public C13500nH(C10610iE r2) {
        this.A02 = r2;
    }

    public void BqL(C13540nL r2) {
        C13540nL r0 = this.A00;
        if (r2 == r0) {
            C13540nL r02 = r0.A01;
            this.A00 = r02;
            this.A01 = AnonymousClass000.A1X(r02);
        }
    }

    public boolean hasNext() {
        C13540nL r0;
        if (this.A01) {
            r0 = this.A02.A02;
        } else {
            C13540nL r02 = this.A00;
            if (r02 == null) {
                return false;
            }
            r0 = r02.A00;
        }
        if (r0 != null) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object next() {
        C13540nL r0;
        if (this.A01) {
            this.A01 = false;
            r0 = this.A02.A02;
        } else {
            C13540nL r02 = this.A00;
            if (r02 != null) {
                r0 = r02.A00;
            } else {
                r0 = null;
            }
        }
        this.A00 = r0;
        return r0;
    }
}
