package X;

/* renamed from: X.6li  reason: invalid class name and case insensitive filesystem */
public class C136016li extends C136186lz {
    public final int A00;
    public final C179118id A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            C136016li r5 = (C136016li) obj;
            if (!this.A02.equals(r5.A02) || this.A00 != r5.A00 || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public C136016li(C179118id r2, String str, int i) {
        super(32);
        this.A02 = str;
        this.A00 = i;
        this.A01 = r2;
    }

    public int hashCode() {
        return this.A02.hashCode();
    }
}
