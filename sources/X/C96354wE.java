package X;

/* renamed from: X.4wE  reason: invalid class name and case insensitive filesystem */
public class C96354wE extends C136186lz {
    public final C109665ez A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            C96354wE r5 = (C96354wE) obj;
            if (!this.A01.equals(r5.A01) || !this.A02.equals(r5.A02) || this.A03 != r5.A03) {
                return false;
            }
        }
        return true;
    }

    public C96354wE(C109665ez r2, String str, String str2, boolean z) {
        super(35);
        this.A02 = str;
        this.A00 = r2;
        this.A03 = z;
        this.A01 = str2;
    }

    public int hashCode() {
        return this.A01.hashCode();
    }
}
