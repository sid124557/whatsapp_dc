package X;

import java.util.Iterator;

/* renamed from: X.4xh  reason: invalid class name and case insensitive filesystem */
public final class C97144xh extends C29451iq {
    public final void A0A(String str) {
        C162457s7.A0J(str, 0);
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            C40302Fh r4 = (C40302Fh) A03.next();
            C113245l7 r3 = r4.A00;
            if (r3.A2X()) {
                if (r3.A40 == null) {
                    r3.A1B();
                    r3.A1a.post(new C71323bv(33, str, r4));
                } else {
                    C113245l7.A0O(r3, str, false);
                }
            }
            C94294qu r0 = r3.A46;
            if (r0 != null && r0.A02()) {
                r3.A46.A01(false);
            }
            C94264qq r02 = r3.A45;
            if (r02 != null) {
                r02.A0K(str);
            }
        }
    }

    public final void A08() {
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            C113245l7 r1 = ((C40302Fh) A03.next()).A00;
            ((C59292wg) r1.A60.get()).A01(C113245l7.A09(r1), r1.A0a(), 12);
        }
    }

    public final void A09(String str) {
        C104445Qz r1;
        C137306oT r0;
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            C40302Fh r4 = (C40302Fh) A03.next();
            C113245l7 r3 = r4.A00;
            if (r3.A2X()) {
                if (r3.A40 == null) {
                    r3.A1B();
                    r3.A1a.post(new C71323bv(34, str, r4));
                } else {
                    C113245l7.A0O(r3, str, true);
                }
            }
            C94294qu r02 = r3.A46;
            if (r02 != null && r02.A02()) {
                r3.A46.A01(false);
            }
            C94264qq r2 = r3.A45;
            if (!(r2 == null || (r1 = r2.A0A) == null)) {
                if (!r2.isShowing()) {
                    r2.A09();
                }
                r2.A0H(3);
                if (!(str == null || (r0 = r1.A04) == null)) {
                    r0.A09(str);
                }
            }
        }
    }
}
