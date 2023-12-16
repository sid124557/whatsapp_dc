package X;

/* renamed from: X.904  reason: invalid class name */
public class AnonymousClass904 extends AnonymousClass2YN {
    public Object A00;
    public final int A01 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass904(C71533cG r2, C95814uZ r3) {
        super(r3, false);
        this.A00 = r2;
    }

    public void A00(int i) {
        if (this.A01 != 0) {
            super.A00(i);
            if (i > 0) {
                ((C111445i6) this.A00).A0C = (long) i;
            }
            ((C111445i6) this.A00).A0I();
            return;
        }
        super.A00(i);
        if (i != 0) {
            ((C111445i6) ((C71533cG) this.A00).A00).A0C = (long) i;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass904(C95814uZ r2, C111445i6 r3) {
        super(r2, true);
        this.A00 = r3;
    }
}
