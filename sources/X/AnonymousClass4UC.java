package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4UC  reason: invalid class name */
public class AnonymousClass4UC extends AnonymousClass08M {
    public final AtomicBoolean A00 = C18280x3.A0l();

    public void A0B(C15910sA r3, C15930sC r4) {
        if (this.A00 > 0) {
            throw AnonymousClass001.A0e("Can not register multiple observers for a *Single*LiveEvent");
        }
        super.A0B(r3, new C1897692o(r4, 5, this));
    }

    public void A0H(Object obj) {
        this.A00.set(true);
        super.A0H(obj);
    }

    public AnonymousClass4UC(Object obj) {
        super(obj);
    }

    public AnonymousClass4UC() {
    }
}
