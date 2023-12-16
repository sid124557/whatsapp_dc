package X;

import java.util.List;

/* renamed from: X.5PK  reason: invalid class name */
public abstract class AnonymousClass5PK {
    public C146817Bs A00;

    public void A00() {
        C146817Bs r0 = this.A00;
        if (r0 != null) {
            AnonymousClass5LC r2 = r0.A00;
            if (!r2.A01) {
                r2.A01 = true;
                r2.A04.post(r2.A09);
            }
        }
    }

    public void A01() {
        C146817Bs r0 = this.A00;
        if (r0 != null) {
            AnonymousClass5LC r4 = r0.A00;
            AnonymousClass7RU r02 = r4.A00;
            if (r02 != null) {
                r02.A00();
            }
            if (r4.A01) {
                r4.A04.removeCallbacks(r4.A09);
                long now = r4.A05.now();
                if (r4.A0B.isEmpty()) {
                    C46582bs r03 = r4.A06;
                    List list = r4.A0A;
                    r03.A00(list);
                    AnonymousClass5U3 r04 = r4.A08;
                    r04.A04(list, now);
                    r04.A00();
                } else {
                    throw new IllegalStateException();
                }
            }
            r4.A01 = false;
        }
    }
}
