package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.8I8  reason: invalid class name */
public final class AnonymousClass8I8 implements C186988wG {
    public static final C171868Is A01 = new C171868Is();
    public final List A00;

    public boolean B2j(C150587Rj r4) {
        C162457s7.A0J(r4, 0);
        List<C186988wG> list = this.A00;
        if (!(!list.isEmpty())) {
            return false;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C186988wG B2j : list) {
                if (!B2j.B2j(r4)) {
                    return false;
                }
            }
        }
        return true;
    }

    public AnonymousClass8I8(List list) {
        this.A00 = list;
    }
}
