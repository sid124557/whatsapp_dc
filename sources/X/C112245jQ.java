package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.5jQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C112245jQ implements C181948nc {
    public final /* synthetic */ C109075e2 A00;
    public final /* synthetic */ AnonymousClass4U8 A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ Set A03;

    public final void BZM() {
        AnonymousClass4U8 r8 = this.A01;
        C109075e2 r7 = this.A00;
        Set set = this.A03;
        ArrayList A0s = AnonymousClass001.A0s();
        int i = 0;
        int i2 = 0;
        for (Object next : (Iterable) this.A02.get(C86654Ky.A1a(set) ? 1 : 0)) {
            if (A0s.size() < 35) {
                boolean contains = set.contains(next);
                boolean contains2 = r8.A0B.contains(next);
                if (contains) {
                    if (contains2) {
                        A0s.add(next);
                        i2++;
                    } else if (i2 <= 5) {
                        A0s.add(next);
                        i2++;
                    }
                } else if (contains2 && i <= 30) {
                    A0s.add(next);
                }
                i++;
            }
        }
        r8.A0J(r7, A0s);
        r8.A0C = A0s;
    }

    public /* synthetic */ C112245jQ(C109075e2 r1, AnonymousClass4U8 r2, List list, Set set) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = set;
        this.A02 = list;
    }
}
