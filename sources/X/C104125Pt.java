package X;

/* renamed from: X.5Pt  reason: invalid class name and case insensitive filesystem */
public class C104125Pt {
    public final int A00;
    public final C95814uZ A01;
    public final Object A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C104125Pt r5 = (C104125Pt) obj;
            if (this.A00 == r5.A00) {
                Object obj2 = this.A02;
                Object obj3 = r5.A02;
                if (obj2 != null) {
                    return obj2.equals(obj3);
                }
                return obj3 == null;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.A00 * 31) + C18280x3.A04(this.A02);
    }

    public C104125Pt(C95814uZ r1, Object obj, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = r1;
    }
}
