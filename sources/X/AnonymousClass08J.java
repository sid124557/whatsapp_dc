package X;

import java.util.Iterator;

/* renamed from: X.08J  reason: invalid class name */
public class AnonymousClass08J extends AnonymousClass08M {
    public C10610iE A00 = new C10610iE();

    public void A08() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C08350eJ r1 = (C08350eJ) AnonymousClass001.A0w(it).getValue();
            r1.A01.A0E(r1);
        }
    }

    public void A09() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C08350eJ r1 = (C08350eJ) AnonymousClass001.A0w(it).getValue();
            r1.A01.A0F(r1);
        }
    }

    public void A0I(C06270Wx r3) {
        C08350eJ r1 = (C08350eJ) this.A00.A01(r3);
        if (r1 != null) {
            r1.A01.A0F(r1);
        }
    }

    public void A0J(C06270Wx r3, C15930sC r4) {
        if (r3 != null) {
            C08350eJ r1 = new C08350eJ(r3, r4);
            C08350eJ r0 = (C08350eJ) this.A00.A02(r3, r1);
            if (r0 != null) {
                if (r0.A02 != r4) {
                    throw AnonymousClass001.A0c("This source was already added with the different observer");
                }
            } else if (this.A00 > 0) {
                r1.A01.A0E(r1);
            }
        } else {
            throw AnonymousClass001.A0g("source cannot be null");
        }
    }
}
