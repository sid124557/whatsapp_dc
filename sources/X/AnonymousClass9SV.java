package X;

/* renamed from: X.9SV  reason: invalid class name */
public class AnonymousClass9SV {
    public final int A00;
    public final int A01;
    public final C194559Tk A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass9SV r5 = (AnonymousClass9SV) obj;
            if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public AnonymousClass9SV(C193429Op r2) {
        this.A01 = r2.A01;
        this.A00 = r2.A00;
        this.A02 = r2.A02;
    }
}
