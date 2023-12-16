package X;

import java.io.Serializable;

/* renamed from: X.3du  reason: invalid class name and case insensitive filesystem */
public final class C72553du implements C85494Gl, Serializable {
    public static final C72553du A00 = new C72553du();
    public static final long serialVersionUID = 0;

    public C85494Gl plus(C85494Gl r2) {
        C162457s7.A0J(r2, 0);
        return r2;
    }

    public C85484Gk get(C834148h r2) {
        return null;
    }

    public C85494Gl minusKey(C834148h r1) {
        return this;
    }

    private final Object readResolve() {
        return A00;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }

    public Object fold(Object obj, AnonymousClass4GR r2) {
        return obj;
    }
}
