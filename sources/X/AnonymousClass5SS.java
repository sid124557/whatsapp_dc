package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.5SS  reason: invalid class name */
public class AnonymousClass5SS {
    public final int A00;
    public final ArrayList A01 = AnonymousClass001.A0s();
    public final List A02;
    public final boolean A03;

    public String A01(C89634eX r2) {
        return C18290x4.A0l(r2, this.A00);
    }

    public AnonymousClass5SS(List list, int i, boolean z) {
        this.A02 = list;
        this.A00 = i;
        this.A03 = z;
    }

    public static void A00(AnonymousClass5SS r1, AnonymousClass3ZH r2, List list, Set set) {
        if (list.contains(r2) && !C73723fy.A0U(set, r2.A0H)) {
            r1.A01.add(r2);
            C95814uZ r0 = r2.A0H;
            if (r0 != null) {
                set.add(r0);
            }
        }
    }
}
