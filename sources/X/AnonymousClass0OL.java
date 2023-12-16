package X;

import java.lang.reflect.Method;

@Deprecated
/* renamed from: X.0OL  reason: invalid class name */
public final class AnonymousClass0OL {
    public final int A00;
    public final Method A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0OL)) {
            return false;
        }
        AnonymousClass0OL r4 = (AnonymousClass0OL) obj;
        return this.A00 == r4.A00 && this.A01.getName().equals(r4.A01.getName());
    }

    public int hashCode() {
        return (this.A00 * 31) + this.A01.getName().hashCode();
    }

    public AnonymousClass0OL(Method method, int i) {
        this.A00 = i;
        this.A01 = method;
        method.setAccessible(true);
    }
}
