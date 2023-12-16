package X;

import java.util.Set;

/* renamed from: X.5RN  reason: invalid class name */
public class AnonymousClass5RN {
    public final Set A00 = AnonymousClass002.A0K();

    public void A00() {
        Set<C184278rX> set = this.A00;
        synchronized (set) {
            if (!set.isEmpty()) {
                for (C184278rX BMH : set) {
                    BMH.BMH();
                }
            }
        }
    }

    public void A01() {
        Set<C184278rX> set = this.A00;
        synchronized (set) {
            if (!set.isEmpty()) {
                for (C184278rX BNa : set) {
                    BNa.BNa();
                }
            }
        }
    }

    public void A02(C184278rX r3) {
        Set set = this.A00;
        synchronized (set) {
            set.add(r3);
        }
    }
}
