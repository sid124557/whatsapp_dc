package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.680  reason: invalid class name */
public class AnonymousClass680 extends C56602sG {
    public Object A00;
    public Object A01;
    public final int A02;

    public void A03(C95814uZ r2) {
        if (this.A02 != 0) {
            A01(this, r2);
        } else {
            A00(this, r2);
        }
    }

    public AnonymousClass680(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass680 r3, C95814uZ r4) {
        C96364wF r2 = (C96364wF) r3.A01;
        if (r4.equals(Jid.Companion.A03(r2.A03))) {
            C96774wu r0 = (C96774wu) r3.A00;
            r0.A01.A0A(r0.A02, r2.A01, false);
        }
    }

    public static void A01(AnonymousClass680 r3, C95814uZ r4) {
        String str = ((C90754iG) r3.A01).A04.A0F;
        if (r4.equals(Jid.Companion.A03(str))) {
            C96794ww r1 = (C96794ww) r3.A00;
            r1.A0A.A0A(r1.A04, new AnonymousClass3ZH(C18310x6.A0S(str)), false);
        }
    }
}
