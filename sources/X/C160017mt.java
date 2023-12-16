package X;

/* renamed from: X.7mt  reason: invalid class name and case insensitive filesystem */
public final class C160017mt {
    public static C160017mt A01;
    public static final AnonymousClass6SP A02 = new AnonymousClass6SP(0, 0, 0, false, false);
    public AnonymousClass6SP A00;

    public static synchronized C160017mt A00() {
        C160017mt r0;
        synchronized (C160017mt.class) {
            r0 = A01;
            if (r0 == null) {
                r0 = new C160017mt();
                A01 = r0;
            }
        }
        return r0;
    }
}
