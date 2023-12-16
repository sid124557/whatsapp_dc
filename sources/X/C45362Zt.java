package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2Zt  reason: invalid class name and case insensitive filesystem */
public final class C45362Zt {
    public final C56612sH A00;
    public final AnonymousClass1VX A01;
    public final Map A02 = C18320x8.A0r();

    public C45362Zt(C56612sH r2, AnonymousClass1VX r3) {
        C18260x0.A0Q(r3, r2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final void A00() {
        LinkedHashSet A17 = AnonymousClass0x9.A17();
        Map map = this.A02;
        synchronized (map) {
            Set entrySet = map.entrySet();
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object next : entrySet) {
                if (((C52592lj) ((Map.Entry) next).getValue()).A00 <= this.A00.A0H()) {
                    A0s.add(next);
                }
            }
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                AnonymousClass0x7.A1J(A17, AnonymousClass001.A0w(it));
            }
            Iterator it2 = A17.iterator();
            while (it2.hasNext()) {
                map.remove(AnonymousClass001.A0m(it2));
            }
        }
    }
}
