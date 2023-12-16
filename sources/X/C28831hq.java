package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.1hq  reason: invalid class name and case insensitive filesystem */
public class C28831hq extends C61102zi {
    public static StringBuilder A00(C34461vC r1, Object obj) {
        ((C28831hq) r1.A0A.get()).A08(Collections.singletonList(obj));
        return new StringBuilder();
    }

    public void A08(Collection collection) {
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            ((C85004Eo) A03.next()).BPv(collection);
        }
    }

    public void A09(Collection collection) {
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            ((C85004Eo) A03.next()).BPx(collection);
        }
    }

    public C28831hq(C183538qC r1) {
        super(r1);
    }
}
