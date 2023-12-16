package X;

/* renamed from: X.4wC  reason: invalid class name and case insensitive filesystem */
public class C96334wC extends C136186lz {
    public final C109065e1 A00;
    public final C182768ox A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A00.equals(((C96334wC) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C96334wC(C109065e1 r1, C182768ox r2, int i) {
        super(i);
        this.A00 = r1;
        this.A01 = r2;
    }
}
