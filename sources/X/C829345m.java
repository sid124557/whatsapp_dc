package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.45m  reason: invalid class name and case insensitive filesystem */
public final class C829345m extends C829445n {
    public static final List A01(AnonymousClass4C5 r3) {
        C162457s7.A0J(r3, 0);
        Iterator it = r3.iterator();
        if (!it.hasNext()) {
            return C72023d3.A00;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return C18290x4.A12(next);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        while (true) {
            A0s.add(next);
            if (!it.hasNext()) {
                return A0s;
            }
            next = it.next();
        }
    }

    public static final AnonymousClass4C5 A04(AnonymousClass4GQ r2, AnonymousClass4C5 r3) {
        C162457s7.A0J(r3, 0);
        return new AnonymousClass8PL(r2, r3, true);
    }

    public static final AnonymousClass4C5 A05(AnonymousClass4GQ r4, AnonymousClass4C5 r5) {
        C162457s7.A0J(r5, 0);
        return new AnonymousClass8PL(AnonymousClass45G.A00, new C72623e1(r4, r5), false);
    }

    public static final List A02(AnonymousClass4C5 r3) {
        ArrayList A0r = C18300x5.A0r(r3);
        Iterator it = r3.iterator();
        while (it.hasNext()) {
            C18310x6.A1R(A0r, it);
        }
        return A0r;
    }

    public static final Set A03(AnonymousClass4C5 r3) {
        Iterator it = r3.iterator();
        if (!it.hasNext()) {
            return C72063d7.A00;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return C18290x4.A13(next);
        }
        LinkedHashSet A17 = AnonymousClass0x9.A17();
        while (true) {
            A17.add(next);
            if (!it.hasNext()) {
                return A17;
            }
            next = it.next();
        }
    }
}
