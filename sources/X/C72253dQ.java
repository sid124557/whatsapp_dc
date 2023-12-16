package X;

import java.util.Collection;

/* renamed from: X.3dQ  reason: invalid class name and case insensitive filesystem */
public final class C72253dQ implements AnonymousClass4C1 {
    public final int A00;
    public final C22031Ec A01;
    public final C64333Db A02;

    public Object get() {
        int i = this.A00;
        if (i == 0) {
            return C129526aS.copyOf((Collection) this.A02.A00.AQb());
        }
        if (i == 1) {
            return new AnonymousClass2D5(this);
        }
        if (i == 2) {
            return new AnonymousClass2D6(this);
        }
        if (i == 3) {
            return new AnonymousClass2D7(this);
        }
        if (i == 4) {
            return new C45052Ym((AnonymousClass1VX) this.A02.A07.get(), (C66363Lb) this.A02.ARt.get());
        }
        throw new AssertionError(this.A00);
    }

    public C72253dQ(C22031Ec r1, C64333Db r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }
}
