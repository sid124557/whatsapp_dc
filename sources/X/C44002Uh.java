package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Uh  reason: invalid class name and case insensitive filesystem */
public final class C44002Uh {
    public final List A00(C108895dj r5, C49312gK r6, List list) {
        C162457s7.A0J(r5, 1);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object A00 = C617031x.A00(new C81503zz((C108895dj) it.next(), r5, r6));
            if (A00 == null) {
                C626936e.A0D(false, "XFamilyCrosspostRequestManager/Cannot find corresponding messageRowId for given uniqueId");
            } else {
                A0s.add(A00);
            }
        }
        return A0s;
    }
}
