package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.4HU  reason: invalid class name */
public class AnonymousClass4HU extends AnonymousClass5ZM {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4HU(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        switch (this.A02) {
            case 0:
                HashSet A0K = AnonymousClass002.A0K();
                Iterator it = ((Set) this.A01).iterator();
                while (it.hasNext()) {
                    C95814uZ A0S = C18310x6.A0S(AnonymousClass001.A0m(it));
                    if (A0S != null) {
                        A0K.add(((AnonymousClass10d) this.A00).A04.A01(A0S));
                    }
                }
                return A0K;
            case 1:
                return Boolean.valueOf(C29041iB.A00((C29041iB) this.A00));
            default:
                C50622iU r0 = (C50622iU) this.A00;
                AnonymousClass33K r2 = r0.A0R;
                C56492s4 r1 = r0.A06;
                C30361mK r02 = (C30361mK) this.A01;
                return C34071uB.A00(r1, r2, r02.A00, r02.A01, 15);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        switch (this.A02) {
            case 0:
                Set set = (Set) obj;
                AnonymousClass10d r2 = (AnonymousClass10d) this.A00;
                r2.A01 = set;
                r2.A08.A0G(Collections.unmodifiableSet(set));
                r2.A0D();
                return;
            case 1:
                ((AnonymousClass3XA) this.A01).A05(obj);
                return;
            default:
                byte[] bArr = (byte[]) obj;
                C30361mK r22 = (C30361mK) this.A01;
                r22.A02 = 2;
                if (bArr != null) {
                    C614630w A0y = r22.A0y();
                    C626936e.A06(A0y);
                    A0y.A03(bArr);
                    ((C50622iU) this.A00).A0G.A0b(r22, -1);
                    return;
                }
                ((C50622iU) this.A00).A0J.A0C(r22, -1);
                return;
        }
    }
}
