package X;

import java.util.Arrays;

/* renamed from: X.7Ve  reason: invalid class name and case insensitive filesystem */
public final class C151537Ve {
    public int A00;
    public final C178218hB[] A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C151537Ve.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A01, ((C151537Ve) obj).A01);
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = 527 + Arrays.hashCode(this.A01);
        this.A00 = hashCode;
        return hashCode;
    }

    public C151537Ve(C178218hB... r1) {
        this.A01 = r1;
    }
}
