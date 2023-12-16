package X;

/* renamed from: X.5QE  reason: invalid class name */
public class AnonymousClass5QE {
    public final int A00;
    public final C104165Px A01;
    public final C42242Ni A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass5QE r5 = (AnonymousClass5QE) obj;
            if (this.A03 != r5.A03 || !this.A02.equals(r5.A02) || !this.A01.equals(r5.A01) || this.A00 != r5.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, (((C18300x5.A04(this.A02) + (this.A03 ? 1 : 0)) * 31) + this.A00) * 31);
    }

    public AnonymousClass5QE(C104165Px r1, C42242Ni r2, int i, boolean z) {
        this.A02 = r2;
        this.A03 = z;
        this.A01 = r1;
        this.A00 = i;
    }
}
