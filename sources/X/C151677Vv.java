package X;

/* renamed from: X.7Vv  reason: invalid class name and case insensitive filesystem */
public class C151677Vv {
    public final C157917j8 A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C151677Vv)) {
            return false;
        }
        C151677Vv r4 = (C151677Vv) obj;
        return this.A01 == r4.A01 && this.A00.equals(r4.A00);
    }

    public C151677Vv(C157917j8 r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass001.A1R(A0M, this.A01);
        return C18310x6.A08(this.A00, A0M, 1);
    }
}
