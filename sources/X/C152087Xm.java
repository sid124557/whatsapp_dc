package X;

import java.util.Arrays;

/* renamed from: X.7Xm  reason: invalid class name and case insensitive filesystem */
public class C152087Xm {
    public final int A00;

    public boolean A00(C152087Xm r3) {
        return AnonymousClass000.A1U(this.A00, r3.A00);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C152087Xm) || this.A00 != ((C152087Xm) obj).A00) {
            return false;
        }
        return true;
    }

    public C152087Xm(int i) {
        this.A00 = i;
    }

    public int hashCode() {
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1L(A0L, this.A00);
        return 31 + Arrays.hashCode(A0L);
    }
}
