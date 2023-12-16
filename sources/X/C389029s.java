package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.29s  reason: invalid class name and case insensitive filesystem */
public class C389029s implements AnonymousClass4AX {
    public Object A00;
    public final int A01;

    public C389029s(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BaW(C48652fF r9) {
        switch (this.A01) {
            case 0:
                C84814Du r2 = (C84814Du) this.A00;
                if (AnonymousClass46G.A04.get(r2) instanceof C834548l) {
                    r2.BkD(new AnonymousClass3Z9(C73723fy.A0C(r9.A01)));
                    return;
                }
                return;
            case 1:
                C84814Du r1 = (C84814Du) this.A00;
                if (AnonymousClass46G.A04.get(r1) instanceof C834548l) {
                    r1.BkD(C73723fy.A0C(r9.A01));
                    return;
                }
                return;
            default:
                AnonymousClass10k r6 = (AnonymousClass10k) this.A00;
                List list = r9.A01;
                ArrayList A0p = AnonymousClass000.A0p(list);
                int i = 0;
                if (r6.A04.A0Y(C58422vE.A02, 3403)) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    while (i < list.size()) {
                        C18300x5.A1M(list.get(i), A0s, A0s2, ((AnonymousClass39M) list.get(i)).A0J ? 1 : 0);
                        i++;
                    }
                    A0p.addAll(A0s);
                    A0p.addAll(A0s2);
                } else {
                    while (i < list.size()) {
                        A0p.add(list.get(i));
                        i++;
                    }
                }
                AnonymousClass08M r12 = r6.A03;
                if ((r12.A07() != null && !((List) r12.A07()).isEmpty()) || !A0p.isEmpty()) {
                    r12.A0H(A0p);
                    return;
                }
                return;
        }
    }
}
