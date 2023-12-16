package X;

import java.util.List;

/* renamed from: X.5N6  reason: invalid class name */
public class AnonymousClass5N6 {
    public final C106085Xo A00;
    public final AnonymousClass5US A01;

    public void A00() {
        AnonymousClass5US r3 = this.A01;
        AnonymousClass5PR r1 = r3.A03;
        if (AnonymousClass0x7.A1S(r1.A00)) {
            List list = r3.A04;
            C105425Uw A002 = r1.A00(list);
            C105425Uw r0 = r3.A01;
            if (r0 != null && !list.contains(r0)) {
                r3.A01 = null;
            }
            if (A002 instanceof C95954vE) {
                this.A00.A02();
            }
            this.A00.A01();
        }
    }

    public AnonymousClass5N6(C106085Xo r1, AnonymousClass5US r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
