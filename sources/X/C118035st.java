package X;

import android.content.Context;

/* renamed from: X.5st  reason: invalid class name and case insensitive filesystem */
public final class C118035st implements AnonymousClass4C1 {
    public final int A00;
    public final C88844at A01;
    public final C64333Db A02;

    public static C103355Mo A00() {
        return new C103355Mo();
    }

    public Object get() {
        int i = this.A00;
        if (i == 0) {
            return A00();
        }
        if (i == 1) {
            return new C49732h0(this.A02.Apa());
        }
        if (i == 2) {
            Context A002 = C69783Yj.A00(this.A02.AdE);
            this.A02.A07.get();
            return new AnonymousClass5GV(A002);
        } else if (i == 3) {
            return new AnonymousClass2O1(C69783Yj.A00(this.A02.AdE), (C620733j) this.A02.AbU.get(), C69713Yc.A00());
        } else {
            throw new AssertionError(this.A00);
        }
    }

    public C118035st(C88844at r1, C64333Db r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }
}
