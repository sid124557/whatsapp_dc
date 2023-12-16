package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7Xs  reason: invalid class name and case insensitive filesystem */
public class C152147Xs {
    public final C153597bc A00;
    public final AtomicInteger A01;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C152147Xs) || !this.A00.equals(((C152147Xs) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return this.A00.toString();
    }

    public C152147Xs(C153597bc r2, int i) {
        this.A00 = r2;
        this.A01 = new AtomicInteger(i);
    }
}
