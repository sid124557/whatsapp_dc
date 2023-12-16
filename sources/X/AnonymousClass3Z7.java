package X;

import java.io.Serializable;

/* renamed from: X.3Z7  reason: invalid class name */
public final class AnonymousClass3Z7 implements Serializable {
    public static final long serialVersionUID = 0;
    public final C85494Gl[] elements;

    private final Object readResolve() {
        C85494Gl[] r4 = this.elements;
        C85494Gl r3 = C72553du.A00;
        for (C85494Gl plus : r4) {
            r3 = r3.plus(plus);
        }
        return r3;
    }

    public AnonymousClass3Z7(C85494Gl[] r1) {
        this.elements = r1;
    }
}
