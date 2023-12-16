package X;

import java.util.Objects;

/* renamed from: X.9SY  reason: invalid class name */
public class AnonymousClass9SY {
    public final int A00;
    public final AnonymousClass99H A01;
    public final String A02;

    public boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                AnonymousClass9SY r6 = (AnonymousClass9SY) obj;
                AnonymousClass99H r2 = this.A01;
                if (r2 == null) {
                    String str = this.A02;
                    if (str == null || this.A00 != r6.A00) {
                        return false;
                    }
                    equals = str.equals(r6.A02);
                } else if (this.A00 != r6.A00) {
                    return false;
                } else {
                    equals = r2.equals(r6.A01);
                }
                return equals;
            }
            return false;
        }
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        AnonymousClass000.A1L(objArr, this.A00);
        objArr[1] = this.A01;
        objArr[2] = this.A02;
        return Objects.hash(objArr);
    }

    public AnonymousClass9SY(AnonymousClass99H r1, String str, int i) {
        this.A00 = i;
        this.A01 = r1;
        this.A02 = str;
    }
}
