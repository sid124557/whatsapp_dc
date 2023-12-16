package X;

/* renamed from: X.8IO  reason: invalid class name */
public final class AnonymousClass8IO implements C186988wG {
    public static final C171818In A02 = new C171818In();
    public final String A00;
    public final String A01;

    public boolean B2j(C150587Rj r3) {
        C162457s7.A0J(r3, 0);
        Object A002 = r3.A00(this.A01);
        Object A003 = r3.A00(this.A00);
        if (A002 != null && A003 != null) {
            return !C161547pt.A02(A002, A003);
        }
        throw new ClassCastException("Either variable or expected value or both is/are null");
    }

    public AnonymousClass8IO(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
