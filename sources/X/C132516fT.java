package X;

/* renamed from: X.6fT  reason: invalid class name and case insensitive filesystem */
public class C132516fT extends C151647Vp {
    public final String A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C132516fT r5 = (C132516fT) obj;
            if (!this.A00.equals(r5.A00) || r5.A01 != this.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C132516fT(C184148rK r1, String str, boolean z) {
        super(r1, z);
        this.A00 = str;
    }
}
