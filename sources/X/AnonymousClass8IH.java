package X;

/* renamed from: X.8IH  reason: invalid class name */
public final class AnonymousClass8IH implements C186988wG {
    public static final C171748Ig A02 = new C171748Ig();
    public final Object A00;
    public final Object A01;

    public boolean B2j(C150587Rj r4) {
        C162457s7.A0J(r4, 0);
        Object obj = this.A01;
        Integer A002 = C161547pt.A00(AnonymousClass6C7.A0a(r4, obj, obj instanceof String ? 1 : 0), this.A00);
        if (A002 == null) {
            throw AnonymousClass002.A0G("The data type is unsupported for this operation");
        } else if (A002.intValue() >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public AnonymousClass8IH(Object obj, Object obj2) {
        this.A01 = obj;
        this.A00 = obj2;
    }
}
