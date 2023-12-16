package X;

import java.util.List;

/* renamed from: X.5lO  reason: invalid class name and case insensitive filesystem */
public class C113415lO implements C836349e {
    public final AnonymousClass5ZU A00;
    public final C66473Lo A01;
    public final List A02;
    public final boolean A03;

    public C113415lO(AnonymousClass5ZU r3, C66473Lo r4, AnonymousClass2ML r5, List list) {
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = list;
        this.A03 = r5.A01.A0X(3751);
    }

    public boolean B3H(C95814uZ r5) {
        AnonymousClass3ZH r2;
        if ((!C627336j.A0L(r5) || this.A03) && (r2 = (AnonymousClass3ZH) this.A01.A04().get(r5)) != null && !(r2.A0H instanceof C28001fK) && AnonymousClass5ZU.A04(this.A00, r2, this.A02)) {
            return true;
        }
        return false;
    }
}
