package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Vv  reason: invalid class name and case insensitive filesystem */
public final class C69133Vv implements AnonymousClass4GG {
    public final C183538qC A00;
    public final C183538qC A01;

    public void BhW(C624134x r8, C378824k r9) {
        List list;
        C162457s7.A0J(r8, 0);
        if (r8.A1r(64) && !r8.A1J.A02 && ((C56952sp) this.A00.get()).A0Y(C58422vE.A02, 5869)) {
            C183538qC r6 = this.A01;
            r8.A1O(((C47962e7) r6.get()).A00(r8.A1L));
            long j = r8.A1L;
            if ((r8 instanceof C30791n7) && (list = ((C30791n7) r8).A01) != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C624134x A0T = C18300x5.A0T(it);
                    C47962e7 r3 = (C47962e7) r6.get();
                    if (!C624134x.A07(A0T).A02) {
                        A0T.A1O(r3.A00(j));
                    }
                }
            }
            if (r9 != null) {
                throw C18260x0.A02(C69133Vv.class);
            }
        }
    }

    public C69133Vv(C183538qC r1, C183538qC r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
