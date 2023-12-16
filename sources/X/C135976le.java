package X;

import java.util.Arrays;

/* renamed from: X.6le  reason: invalid class name and case insensitive filesystem */
public class C135976le extends C136186lz {
    public final int A00;
    public final C181938nb A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            C135976le r5 = (C135976le) obj;
            return this.A00 == r5.A00 && this.A01 == r5.A01;
        }
        return false;
    }

    public C135976le(C181938nb r2, Integer num, int i) {
        super(num.intValue());
        this.A00 = i;
        this.A01 = r2;
    }

    public int hashCode() {
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1L(A0L, this.A00);
        return Arrays.hashCode(A0L);
    }
}
