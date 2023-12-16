package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Vt  reason: invalid class name and case insensitive filesystem */
public final class C44362Vt {
    public final C66543Lv A00;

    public C44362Vt(C66543Lv r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final void A00(C624134x r12, String str, String str2) {
        AnonymousClass4DV r0;
        AnonymousClass39W B5s;
        List list;
        if (r12 != null) {
            AnonymousClass39P r5 = null;
            if (!(!(r12 instanceof AnonymousClass4DV) || (r0 = (AnonymousClass4DV) r12) == null || (B5s = r0.B5s()) == null)) {
                AnonymousClass39P r4 = B5s.A03;
                if (!(r4 == null || (list = r4.A03) == null)) {
                    ArrayList A0J = AnonymousClass002.A0J(list);
                    Iterator it = A0J.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            throw C18280x3.A0X();
                        }
                        AnonymousClass398 r1 = ((AnonymousClass395) next).A01;
                        if (C162457s7.A0P(r1.A00, str)) {
                            A0J.set(i, new AnonymousClass395(new AnonymousClass398(str2, r1.A01), false));
                        }
                        i = i2;
                    }
                    r5 = new AnonymousClass39P((AnonymousClass391) null, r4.A02, A0J, (List) null, 0);
                }
                B5s.A03 = r5;
            }
            this.A00.A0Y(r12);
        }
    }
}
