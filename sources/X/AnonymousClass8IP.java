package X;

/* renamed from: X.8IP  reason: invalid class name */
public final class AnonymousClass8IP implements C186988wG {
    public static final C171828Io A02 = new C171828Io();
    public final Object A00;
    public final Object A01;

    public boolean B2j(C150587Rj r3) {
        Object obj;
        C162457s7.A0J(r3, 0);
        Object obj2 = this.A01;
        Object A0a = AnonymousClass6C7.A0a(r3, obj2, obj2 instanceof String ? 1 : 0);
        if (A0a != null && (obj = this.A00) != null) {
            return !C161547pt.A02(obj, A0a);
        }
        throw new ClassCastException("Either variable or expected value or both is/are null");
    }

    public AnonymousClass8IP(Object obj, Object obj2) {
        this.A01 = obj;
        this.A00 = obj2;
    }
}
