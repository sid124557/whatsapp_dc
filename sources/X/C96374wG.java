package X;

/* renamed from: X.4wG  reason: invalid class name and case insensitive filesystem */
public class C96374wG extends C136186lz {
    public final C109665ez A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public C96374wG(C109665ez r2, String str, String str2, String str3, boolean z) {
        super(31);
        this.A04 = z;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A01.equals(((C96374wG) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }
}
