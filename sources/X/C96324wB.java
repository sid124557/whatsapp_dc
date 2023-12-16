package X;

/* renamed from: X.4wB  reason: invalid class name and case insensitive filesystem */
public class C96324wB extends C136186lz {
    public final C109665ez A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        String str = this.A01;
        String str2 = ((C96324wB) obj).A01;
        if (str == null) {
            return str2 == null;
        }
        if (str.equals(str2)) {
            return true;
        }
    }

    public C96324wB(C109665ez r2, String str) {
        super(26);
        this.A00 = r2;
        this.A01 = str;
    }
}
