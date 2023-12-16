package X;

/* renamed from: X.6fR  reason: invalid class name and case insensitive filesystem */
public class C132496fR extends C135976le {
    public final String A00;

    public C132496fR(C181938nb r2, String str, int i) {
        super(r2, 59, i);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A00.equals(((C132496fR) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
