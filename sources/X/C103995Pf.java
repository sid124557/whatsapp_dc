package X;

/* renamed from: X.5Pf  reason: invalid class name and case insensitive filesystem */
public class C103995Pf {
    public final String A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C103995Pf r5 = (C103995Pf) obj;
            String str = r5.A00;
            String str2 = this.A00;
            return (str == str2 || (str != null && str.equals(str2))) && r5.A01 == this.A01;
        }
    }

    public final int hashCode() {
        return ((589 + C18270x1.A00(this.A00)) * 31) + (this.A01 ? 1 : 0);
    }

    public C103995Pf(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
