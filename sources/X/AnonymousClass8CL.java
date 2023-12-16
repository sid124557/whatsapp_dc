package X;

import java.io.Serializable;
import java.util.List;

/* renamed from: X.8CL  reason: invalid class name */
public final class AnonymousClass8CL implements C181318mZ, Serializable {
    public final int expectedValuesPerKey = 2;

    public AnonymousClass8CL(int i) {
        C160937oh.checkNonnegative(2, "expectedValuesPerKey");
    }

    public List get() {
        return AnonymousClass002.A0I(this.expectedValuesPerKey);
    }
}
