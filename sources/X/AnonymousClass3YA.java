package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3YA  reason: invalid class name */
public final class AnonymousClass3YA implements C84314Bw {
    public final C55152pt A00;

    public AnonymousClass3YA(C55152pt r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public boolean AxE(AnonymousClass2PJ r5, C833648c r6, C833748d r7) {
        List A01 = this.A00.A01(AnonymousClass1fY.A00);
        if (!(A01 instanceof Collection) || !A01.isEmpty()) {
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                C624134x A0T = C18300x5.A0T(it);
                if (!C627636p.A0l(A0T)) {
                    C162457s7.A0H(A0T);
                    if (AnonymousClass001.A1U(AnonymousClass358.A00(A0T.A0D, 3))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
