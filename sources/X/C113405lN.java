package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5lN  reason: invalid class name and case insensitive filesystem */
public final class C113405lN implements C836349e {
    public final AnonymousClass5ZU A00;
    public final AnonymousClass5NT A01;
    public final List A02;

    public boolean B3H(C95814uZ r10) {
        LinkedHashMap linkedHashMap;
        long j;
        C162457s7.A0J(r10, 0);
        AnonymousClass5NT r7 = this.A01;
        synchronized (r7) {
            Map map = r7.A01;
            LinkedHashMap linkedHashMap2 = map;
            if (map == null) {
                List A002 = r7.A00();
                ArrayList A0s = AnonymousClass001.A0s();
                for (Object next : A002) {
                    if (((AnonymousClass3ZH) next).A0H != null) {
                        A0s.add(next);
                    }
                }
                LinkedHashMap A0r = C18320x8.A0r();
                Iterator it = A0s.iterator();
                linkedHashMap2 = A0r;
                if (it.hasNext()) {
                    AnonymousClass3ZH A0R = C18310x6.A0R(it);
                    C95814uZ r5 = A0R.A0H;
                    linkedHashMap = A0r;
                    if (r5 != null) {
                        AnonymousClass3ZH r0 = (AnonymousClass3ZH) A0r.get(r5);
                        if (r0 != null) {
                            j = r0.A0A;
                        } else {
                            j = 0;
                        }
                        linkedHashMap = A0r;
                        if (j < A0R.A0A) {
                            A0r.put(r5, A0R);
                            linkedHashMap = A0r;
                        }
                    }
                }
            }
            r7.A01 = linkedHashMap2;
            linkedHashMap = linkedHashMap2;
        }
        AnonymousClass3ZH r2 = (AnonymousClass3ZH) linkedHashMap.get(r10);
        if (r2 == null || !AnonymousClass5ZU.A04(this.A00, r2, this.A02)) {
            return false;
        }
        return true;
    }

    public C113405lN(AnonymousClass5ZU r1, AnonymousClass5NT r2, List list) {
        this.A02 = list;
        this.A00 = r1;
        this.A01 = r2;
    }
}
