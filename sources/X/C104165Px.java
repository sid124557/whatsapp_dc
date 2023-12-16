package X;

import java.util.Arrays;

/* renamed from: X.5Px  reason: invalid class name and case insensitive filesystem */
public class C104165Px {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C104165Px r5 = (C104165Px) obj;
            if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public C104165Px(int i, int i2, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        AnonymousClass000.A1L(A1X, this.A00);
        AnonymousClass000.A1M(A1X, this.A01);
        AnonymousClass000.A1N(A1X, this.A02);
        return Arrays.hashCode(A1X);
    }
}
