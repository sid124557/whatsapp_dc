package X;

/* renamed from: X.5PX  reason: invalid class name */
public class AnonymousClass5PX {
    public final int A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass5PX r5 = (AnonymousClass5PX) obj;
            if (this.A00 != r5.A00 || !C1447372t.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass5PX(int i, Object obj) {
        this.A00 = i;
        this.A01 = obj;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1L(A0M, this.A00);
        return C18310x6.A08(this.A01, A0M, 1);
    }
}
