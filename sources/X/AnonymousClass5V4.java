package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.5V4  reason: invalid class name */
public final class AnonymousClass5V4 {
    public static final boolean A00(AnonymousClass7Y3 r5, C166447yh r6) {
        if (r5 != null) {
            List<C1223664c> list = r5.A01;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (C1223664c r2 : list) {
                    if ((r2 instanceof C109045dz) && C162457s7.A0P(((C109045dz) r2).A02, r6.A01)) {
                        return true;
                    }
                    if ((r2 instanceof C109025dx) && C162457s7.A0P(((C109025dx) r2).A01, r6.A01)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean A01(AnonymousClass7Y3 r4, C109065e1 r5) {
        if (r4 != null) {
            List<C109035dy> list = r4.A00;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (C109035dy r0 : list) {
                    if (C162457s7.A0P(r0.A03, r5.A0F)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
