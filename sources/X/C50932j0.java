package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2j0  reason: invalid class name and case insensitive filesystem */
public class C50932j0 {
    public final ArrayList A00 = AnonymousClass001.A0s();

    public void A00(AnonymousClass4AQ r2) {
        this.A00.add(r2);
    }

    public void A01(AnonymousClass4AQ r2) {
        this.A00.remove(r2);
    }

    public void A02(C95814uZ r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((AnonymousClass4AQ) it.next()).BLi(r3);
        }
    }
}
