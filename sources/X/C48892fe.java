package X;

import java.util.Objects;

/* renamed from: X.2fe  reason: invalid class name and case insensitive filesystem */
public class C48892fe {
    public Long A00;
    public String A01;
    public boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C48892fe r5 = (C48892fe) obj;
            if (this.A02 != r5.A02 || !Objects.equals(this.A01, r5.A01) || !Objects.equals(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = this.A01;
        AnonymousClass000.A1R(A1X, this.A02);
        A1X[2] = this.A00;
        return Objects.hash(A1X);
    }
}
