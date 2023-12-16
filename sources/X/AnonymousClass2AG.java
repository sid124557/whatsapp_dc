package X;

/* renamed from: X.2AG  reason: invalid class name */
public final class AnonymousClass2AG {
    public static final String A00(C84814Du r3) {
        Object obj;
        if (r3 instanceof AnonymousClass46F) {
            return r3.toString();
        }
        try {
            StringBuilder A0v = C18290x4.A0v(r3);
            C18270x1.A18(r3, A0v, '@');
            obj = A0v.toString();
        } catch (Throwable th) {
            obj = AnonymousClass3Z0.A01(th);
        }
        if (AnonymousClass3Z9.A00(obj) != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(AnonymousClass000.A0O(r3));
            C18270x1.A18(r3, A0o, '@');
            obj = A0o.toString();
        }
        return (String) obj;
    }
}
