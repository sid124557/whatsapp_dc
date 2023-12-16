package X;

/* renamed from: X.5lL  reason: invalid class name and case insensitive filesystem */
public final class C113385lL implements C836349e {
    public final C66473Lo A00;
    public final boolean A01;

    public C113385lL(C66473Lo r2, boolean z) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A01 = z;
    }

    public boolean B3H(C95814uZ r4) {
        C162457s7.A0J(r4, 0);
        AnonymousClass3ZH r2 = (AnonymousClass3ZH) this.A00.A04().get(r4);
        if (r2 == null) {
            return false;
        }
        if (!this.A01 || !r2.A0t || r2.A07 == 2) {
            return r2.A0Q();
        }
        return true;
    }
}
