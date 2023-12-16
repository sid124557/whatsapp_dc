package X;

/* renamed from: X.6hi  reason: invalid class name and case insensitive filesystem */
public class C133646hi extends AnonymousClass7VI {
    public final String A00;

    public C133646hi(String str) {
        super(1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A00.equals(((C133646hi) obj).A00);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1L(A0M, super.hashCode());
        return C18310x6.A08(this.A00, A0M, 1);
    }
}
