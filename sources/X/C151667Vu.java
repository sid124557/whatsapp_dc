package X;

import java.util.HashMap;

/* renamed from: X.7Vu  reason: invalid class name and case insensitive filesystem */
public class C151667Vu {
    public final C160627o1 A00;
    public final HashMap A01;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C151667Vu)) {
            return false;
        }
        C151667Vu r4 = (C151667Vu) obj;
        return this.A00.equals(r4.A00) && this.A01.equals(r4.A01);
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, (159 + this.A00.hashCode()) * 53);
    }

    public C151667Vu(C160627o1 r1, HashMap hashMap) {
        this.A00 = r1;
        this.A01 = hashMap;
    }
}
