package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5Z2  reason: invalid class name */
public class AnonymousClass5Z2 {
    public static final AnonymousClass5Z2 A03 = new AnonymousClass5Z2((AnonymousClass5Z2) null, "empty", Collections.emptyList());
    public final AnonymousClass5Z2 A00;
    public final String A01;
    public final List A02;

    public static AnonymousClass7WH A00(String str) {
        return new AnonymousClass7WH(str);
    }

    public static void A01(C03840Lt r3, AnonymousClass84O r4, C835248t r5, Object obj) {
        C152057Xj r2 = new C152057Xj();
        r2.A04(obj, 0);
        C153427bI r1 = r3.A02;
        r2.A04(r1, 1);
        C159377lj.A01(r1, r4, r2.A03(), r5);
    }

    public void A02(AnonymousClass5U3 r13) {
        for (C03840Lt r5 : this.A02) {
            AnonymousClass0LQ r2 = r5.A00;
            Set<AnonymousClass84O> set = (Set) r2.A01.A01.get(r2.A00);
            if (set != null) {
                for (AnonymousClass84O r4 : set) {
                    String A0P = r4.A0P(38, "");
                    C16900uD r8 = r5.A01;
                    r8.BFV(A0P);
                    r8.B90(A0P);
                    AnonymousClass0JA r3 = new AnonymousClass0JA(this, r13);
                    C835248t A0L = r4.A0L(35);
                    Map map = r13.A04;
                    String str = this.A01;
                    if (((AnonymousClass7MR) map.get(str)).A01 == C141456vb.ENTER && A0L != null) {
                        r8.Brh(A0P);
                        A01(r5, r4, A0L, r3);
                    }
                    C835248t A0L2 = r4.A0L(36);
                    if (A0L2 != null && ((AnonymousClass7MR) map.get(str)).A01 == C141456vb.EXIT) {
                        A01(r5, r4, A0L2, r3);
                    }
                    C835248t A0L3 = r4.A0L(40);
                    if (A0L3 != null && ((AnonymousClass7MR) map.get(str)).A01 == C141456vb.UPDATE) {
                        A01(r5, r4, A0L3, r3);
                    }
                }
            }
        }
        r13.A04.get(this.A01);
    }

    public AnonymousClass5Z2(AnonymousClass5Z2 r1, String str, List list) {
        this.A01 = str;
        this.A00 = r1;
        this.A02 = list;
    }
}
