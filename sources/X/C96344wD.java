package X;

/* renamed from: X.4wD  reason: invalid class name and case insensitive filesystem */
public class C96344wD extends C136186lz {
    public final int A00;
    public final C109665ez A01;
    public final String A02;
    public final String A03;

    public C96344wD(C109665ez r2, String str, String str2) {
        super(6);
        C154257cs.A00(str);
        this.A00 = C154257cs.A01(str);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A03.equals(((C96344wD) obj).A03);
    }

    public int hashCode() {
        return this.A03.hashCode();
    }
}
