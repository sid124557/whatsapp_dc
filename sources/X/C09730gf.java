package X;

import java.util.List;

/* renamed from: X.0gf  reason: invalid class name and case insensitive filesystem */
public class C09730gf implements C16340sr {
    public List A00;

    public boolean BKq(C02420Gc r3, C01780Ce r4) {
        for (AnonymousClass0NI A02 : this.A00) {
            if (AnonymousClass0YE.A02(r3, A02, r4)) {
                return false;
            }
        }
        return true;
    }

    public C09730gf(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("not(");
        A0o.append(this.A00);
        return AnonymousClass000.A0e(A0o);
    }
}
