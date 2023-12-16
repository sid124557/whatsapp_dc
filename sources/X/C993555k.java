package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.55k  reason: invalid class name and case insensitive filesystem */
public class C993555k extends AnonymousClass5ZM {
    public final C55622qe A00;
    public final AnonymousClass66M A01;
    public final Set A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        boolean z;
        Iterator it = this.A02.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C95814uZ A0P = C18300x5.A0P(it);
            if (!C18320x8.A1T(this)) {
                if (this.A00.A00(A0P) > 0) {
                    z = true;
                    break;
                }
            } else {
                return null;
            }
        }
        if (!C18320x8.A1T(this)) {
            return Boolean.valueOf(z);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null && !C18320x8.A1T(this)) {
            this.A01.BEo(bool.booleanValue());
        }
    }

    public C993555k(C55622qe r2, C95814uZ r3, AnonymousClass66M r4) {
        this.A00 = r2;
        HashSet A0K = AnonymousClass002.A0K();
        this.A02 = A0K;
        A0K.add(r3);
        this.A01 = r4;
    }

    public C993555k(C55622qe r2, AnonymousClass66M r3, Set set) {
        this.A00 = r2;
        this.A02 = AnonymousClass0x9.A15(set);
        this.A01 = r3;
    }
}
