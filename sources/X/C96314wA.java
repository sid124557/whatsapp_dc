package X;

import java.util.Arrays;

/* renamed from: X.4wA  reason: invalid class name and case insensitive filesystem */
public class C96314wA extends C136186lz {
    public final boolean A00;
    public final boolean A01;

    public C96314wA(boolean z, boolean z2) {
        super(3);
        this.A00 = z;
        this.A01 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            C96314wA r5 = (C96314wA) obj;
            if (!AnonymousClass75J.A00(Boolean.valueOf(this.A00), Boolean.valueOf(r5.A00)) || !AnonymousClass75J.A00(Boolean.valueOf(this.A01), Boolean.valueOf(r5.A01))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        AnonymousClass000.A1L(A1X, super.hashCode());
        AnonymousClass000.A1R(A1X, this.A00);
        AnonymousClass001.A1S(A1X, this.A01);
        return Arrays.hashCode(A1X);
    }
}
