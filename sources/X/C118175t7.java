package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5t7  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C118175t7 implements AnonymousClass4GR {
    public final /* synthetic */ C158367jr A00;
    public final /* synthetic */ C112305jW A01;

    public final Object invoke(Object obj, Object obj2) {
        C112305jW r5 = this.A01;
        C158367jr r3 = this.A00;
        List list = (List) obj;
        List list2 = (List) obj2;
        AnonymousClass5LW r2 = r5.A0B;
        AnonymousClass7Oa r1 = r2.A06;
        if (r1 != null) {
            r1.A03 = list.size();
            r2.A06.A05 = list2;
        }
        r3.A01.clear();
        r2.A0I = !list.isEmpty();
        r2.A0G.clear();
        r2.A0G.addAll(list);
        if (r2.A0I) {
            r2.A03 = 13;
            if (r5.A05 == 1) {
                AnonymousClass5IN r4 = r5.A0I;
                C186048uf r32 = r4.A00;
                List<C109075e2> A0J = C73723fy.A0J(list, 5);
                ArrayList A0c = C73783g4.A0c(A0J);
                for (C109075e2 r0 : A0J) {
                    A0c.add(r0.A0B.A0A);
                }
                r32.B34((String) null, A0c, r4.A02);
            } else {
                r5.A0B(2);
            }
            r5.A06();
            r5.A0A();
        }
        return null;
    }

    public /* synthetic */ C118175t7(C158367jr r1, C112305jW r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
