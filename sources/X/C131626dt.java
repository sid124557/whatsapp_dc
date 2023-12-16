package X;

import java.util.Collection;
import java.util.Collections;

/* renamed from: X.6dt  reason: invalid class name and case insensitive filesystem */
public class C131626dt extends C153617bf {
    public final Collection A00;

    public boolean A09(AnonymousClass7TV r5, C158627kI r6, Object obj, Object obj2) {
        AnonymousClass7MS r3 = new AnonymousClass7MS(r5, obj, obj2, r6.A06);
        for (C181468mo AxC : this.A00) {
            try {
                if (!AxC.AxC(r3)) {
                    return false;
                }
            } catch (C131316dO unused) {
            }
        }
        return true;
    }

    public C131626dt(C181468mo r2) {
        this.A00 = Collections.singletonList(r2);
    }

    public C131626dt(Collection collection) {
        this.A00 = collection;
    }
}
