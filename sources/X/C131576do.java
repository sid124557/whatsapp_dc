package X;

import java.util.List;

/* renamed from: X.6do  reason: invalid class name and case insensitive filesystem */
public abstract class C131576do extends C153617bf {
    public boolean A09(C158627kI r5, Object obj, String str) {
        if (obj != null) {
            AnonymousClass7TV r1 = r5.A01;
            if (obj instanceof List) {
                return true;
            }
            if (A08() && !r1.A03.contains(C141926wM.SUPPRESS_EXCEPTIONS)) {
                Object[] A0M = AnonymousClass002.A0M();
                AnonymousClass0x7.A1E(this, A0M, 0);
                A0M[1] = obj;
                throw new C131276dK(String.format("Filter: %s can only be applied to arrays. Current context is: %s", A0M));
            }
        } else if (A08() && !r5.A01.A03.contains(C141926wM.SUPPRESS_EXCEPTIONS)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("The path ");
            A0o.append(str);
            throw new C131276dK(AnonymousClass000.A0X(" is null", A0o));
        }
        return false;
    }
}
