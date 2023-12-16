package X;

/* renamed from: X.82M  reason: invalid class name */
public class AnonymousClass82M implements C180358ku {
    public void Bjg(C158097jQ r7, Throwable th) {
        String A0O;
        Object A00 = r7.A00();
        Class<C172258Kh> cls = C172258Kh.class;
        Object[] A1X = AnonymousClass0x9.A1X();
        AnonymousClass000.A1L(A1X, System.identityHashCode(this));
        AnonymousClass000.A1M(A1X, System.identityHashCode(r7));
        if (A00 == null) {
            A0O = null;
        } else {
            A0O = AnonymousClass000.A0O(A00);
        }
        A1X[2] = A0O;
        C186438vJ r2 = C161577py.A00;
        if (r2.BI0(5)) {
            r2.BsJ(cls.getSimpleName(), AnonymousClass6CA.A0T("Finalized without closing: %x %x (type = %s)", A1X));
        }
    }
}
