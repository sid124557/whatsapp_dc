package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3GR  reason: invalid class name */
public final class AnonymousClass3GR implements AnonymousClass4EA {
    public final C623334p A00;

    public AnonymousClass3GR(C623334p r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public List B8q(C95814uZ r9) {
        C162457s7.A0J(r9, 0);
        List A0j = C18280x3.A0j(this.A00.A05(r9));
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : A0j) {
            if (C18310x6.A0B(next) >= 0) {
                A0s.add(next);
            }
        }
        return A0s;
    }

    public List B8r(C95814uZ r2) {
        C162457s7.A0J(r2, 0);
        return B8q(r2);
    }

    public List B8t(C95814uZ r2) {
        return C18290x4.A12(r2);
    }
}
