package X;

import java.util.Arrays;

/* renamed from: X.7Wb  reason: invalid class name and case insensitive filesystem */
public final class C151727Wb {
    public final int A00;
    public final C186678vl A01;
    public final C148727Jm A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof C151727Wb) {
                    C151727Wb r5 = (C151727Wb) obj;
                    if (!AnonymousClass72K.A00(this.A02, r5.A02) || !AnonymousClass72K.A00(this.A01, r5.A01) || !AnonymousClass72K.A00(this.A03, r5.A03)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A00;
    }

    public C151727Wb(C186678vl r2, C148727Jm r3, String str) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = str;
        Object[] A1X = AnonymousClass0x9.A1X();
        C18260x0.A0i(r3, r2, str, A1X);
        this.A00 = Arrays.hashCode(A1X);
    }
}
