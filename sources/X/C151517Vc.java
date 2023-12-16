package X;

/* renamed from: X.7Vc  reason: invalid class name and case insensitive filesystem */
public final class C151517Vc {
    public final int A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C151517Vc.class != obj.getClass()) {
                return false;
            }
            C151517Vc r5 = (C151517Vc) obj;
            if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + (this.A01 ? 1 : 0);
    }

    public C151517Vc(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }
}
