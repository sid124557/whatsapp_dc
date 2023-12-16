package X;

import java.util.List;

/* renamed from: X.0Lp  reason: invalid class name and case insensitive filesystem */
public class C03800Lp {
    public final List A00;
    public final List A01;
    public final List A02;

    public C03800Lp(List list) {
        this.A01 = list;
        this.A00 = AnonymousClass000.A0p(list);
        this.A02 = AnonymousClass000.A0p(list);
        for (int i = 0; i < list.size(); i++) {
            this.A00.add(new AnonymousClass0BX(((AnonymousClass0MD) list.get(i)).A01.A00));
            this.A02.add(new C01530Bf(((AnonymousClass0MD) list.get(i)).A00.A00));
        }
    }
}
