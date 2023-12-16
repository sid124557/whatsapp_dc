package X;

import java.io.Serializable;

/* renamed from: X.8A8  reason: invalid class name */
public final class AnonymousClass8A8 implements C180948lt {
    public static final AnonymousClass8A8 A01 = new AnonymousClass8A8();
    public final C180948lt A00;

    public AnonymousClass8A8() {
        C180948lt r0;
        AnonymousClass8AA r1 = new AnonymousClass8AA(new AnonymousClass8AK());
        if (r1 instanceof Serializable) {
            r0 = new AnonymousClass8A9(r1);
        } else {
            r0 = new AnonymousClass8A7(r1);
        }
        this.A00 = r0;
    }

    public final /* bridge */ /* synthetic */ Object BtG() {
        return this.A00.BtG();
    }
}
