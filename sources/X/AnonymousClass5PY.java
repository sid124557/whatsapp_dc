package X;

import java.util.Arrays;

/* renamed from: X.5PY  reason: invalid class name */
public class AnonymousClass5PY {
    public final int A00;
    public final AnonymousClass5L8 A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass5PY r5 = (AnonymousClass5PY) obj;
            if (this.A00 != r5.A00 || !C1447372t.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass5PY(AnonymousClass5L8 r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A01;
        AnonymousClass000.A1M(A0M, this.A00);
        return Arrays.hashCode(A0M);
    }
}
