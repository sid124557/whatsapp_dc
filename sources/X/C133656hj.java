package X;

/* renamed from: X.6hj  reason: invalid class name and case insensitive filesystem */
public class C133656hj extends AnonymousClass7VI {
    public final C48492ez A00;
    public final C179298iv A01;

    public C133656hj(C48492ez r2, C179298iv r3) {
        super(2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A00.equals(((C133656hj) obj).A00);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1L(A0M, super.hashCode());
        return C18310x6.A08(this.A00, A0M, 1);
    }
}
