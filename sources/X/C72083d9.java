package X;

import java.util.concurrent.Callable;

/* renamed from: X.3d9  reason: invalid class name and case insensitive filesystem */
public class C72083d9 implements Callable {
    public C66843Mz A00;
    public C613030d A01;

    public /* bridge */ /* synthetic */ Object call() {
        C613030d r2 = this.A01;
        if (r2 == null) {
            return null;
        }
        this.A00.A00(r2);
        return new C41832Lt(r2.A06(), r2.A07());
    }

    public C72083d9(C66843Mz r1, C613030d r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
