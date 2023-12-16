package X;

import java.util.Arrays;

/* renamed from: X.7VV  reason: invalid class name */
public final class AnonymousClass7VV {
    public int A00;
    public final C187428xC[] A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass7VV.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A01, ((AnonymousClass7VV) obj).A01);
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

    public AnonymousClass7VV(C187428xC... r1) {
        this.A01 = r1;
    }
}
