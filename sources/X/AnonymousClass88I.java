package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.88I  reason: invalid class name */
public final class AnonymousClass88I implements C185358tW {
    public final List A00;

    public List B6I(long j) {
        if (j >= 0) {
            return this.A00;
        }
        return Collections.emptyList();
    }

    public int B7S() {
        return 1;
    }

    public int B9y(long j) {
        if (j < 0) {
            return 0;
        }
        return -1;
    }

    public AnonymousClass88I(List list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    public long B7R(int i) {
        C161487pm.A03(AnonymousClass000.A1T(i));
        return 0;
    }
}
