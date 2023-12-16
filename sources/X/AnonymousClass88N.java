package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.88N  reason: invalid class name */
public final class AnonymousClass88N implements C185358tW {
    public static final AnonymousClass88N A01 = new AnonymousClass88N();
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

    public AnonymousClass88N(C157037hc r2) {
        this.A00 = Collections.singletonList(r2);
    }

    public long B7R(int i) {
        C161487pm.A03(AnonymousClass000.A1T(i));
        return 0;
    }

    public AnonymousClass88N() {
        this.A00 = Collections.emptyList();
    }
}
