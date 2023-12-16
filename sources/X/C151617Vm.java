package X;

/* renamed from: X.7Vm  reason: invalid class name and case insensitive filesystem */
public final class C151617Vm {
    public final C158847ke A00;
    public final AnonymousClass84O A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof C151617Vm)) {
            return false;
        }
        C151617Vm r4 = (C151617Vm) obj;
        if (this.A01 != r4.A01 || !this.A00.equals(r4.A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass6CA.A05(this.A00, this.A01.hashCode());
    }

    public C151617Vm(C158847ke r1, AnonymousClass84O r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
