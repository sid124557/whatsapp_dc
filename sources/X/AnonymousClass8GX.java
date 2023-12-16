package X;

/* renamed from: X.8GX  reason: invalid class name */
public class AnonymousClass8GX implements C182458oR {
    public final C182458oR A00;
    public final C182458oR A01;

    public boolean BHT(C45212Zc r4) {
        C182458oR r1 = this.A01;
        C626936e.A06(r1);
        return this.A00.BHT(r4) && r1.BHT(r4);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass8GX)) {
            return false;
        }
        AnonymousClass8GX r4 = (AnonymousClass8GX) obj;
        if (!this.A00.equals(r4.A00) || !this.A01.equals(r4.A01)) {
            return false;
        }
        return true;
    }

    public AnonymousClass8GX(C182458oR r1, C182458oR r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        AnonymousClass000.A1L(A1X, 0);
        A1X[1] = this.A00;
        return C18310x6.A08(this.A01, A1X, 2);
    }
}
