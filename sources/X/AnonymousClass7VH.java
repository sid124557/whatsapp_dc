package X;

import java.util.Arrays;

/* renamed from: X.7VH  reason: invalid class name */
public class AnonymousClass7VH {
    public final boolean A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A00 == ((AnonymousClass7VH) obj).A00;
        }
        return true;
    }

    public AnonymousClass7VH(boolean z) {
        this.A00 = z;
    }

    public int hashCode() {
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass001.A1R(A0L, this.A00);
        return Arrays.hashCode(A0L);
    }
}
