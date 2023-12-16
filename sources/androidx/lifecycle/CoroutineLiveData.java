package androidx.lifecycle;

import X.AnonymousClass001;
import X.AnonymousClass08J;
import X.AnonymousClass0XN;
import X.AnonymousClass349;
import X.AnonymousClass34M;
import X.AnonymousClass46U;
import X.AnonymousClass4GR;
import X.C14000o5;
import X.C14040oX;
import X.C57682u2;
import X.C59022wD;
import X.C831246f;
import X.C84814Du;
import X.C85474Gj;
import X.C85494Gl;

public final class CoroutineLiveData extends AnonymousClass08J {
    public AnonymousClass0XN A00;

    public static final C831246f A00(C85474Gj r1) {
        return new AnonymousClass46U(r1);
    }

    public final Object A0K(C84814Du r5) {
        C14000o5 r3;
        int i;
        if (r5 instanceof C14000o5) {
            r3 = (C14000o5) r5;
            int i2 = r3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r3.label = i2 - Integer.MIN_VALUE;
                Object obj = r3.result;
                i = r3.label;
                if (i != 0 || i == 1) {
                    C57682u2.A01(obj);
                    return C59022wD.A00;
                }
                throw AnonymousClass001.A0d();
            }
        }
        r3 = new C14000o5(this, r5);
        Object obj2 = r3.result;
        i = r3.label;
        if (i != 0) {
        }
        C57682u2.A01(obj2);
        return C59022wD.A00;
    }

    public CoroutineLiveData(C85494Gl r4, AnonymousClass4GR r5) {
        this.A00 = new AnonymousClass0XN(this, new C14040oX(this), r5, AnonymousClass349.A02(AnonymousClass34M.A01().A04().plus(r4).plus(A00((C85474Gj) r4.get(C85474Gj.A00)))));
    }

    public void A08() {
        super.A08();
        AnonymousClass0XN r0 = this.A00;
        if (r0 != null) {
            r0.A05();
        }
    }

    public void A09() {
        super.A09();
        AnonymousClass0XN r0 = this.A00;
        if (r0 != null) {
            r0.A04();
        }
    }
}
