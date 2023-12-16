package X;

/* renamed from: X.83o  reason: invalid class name and case insensitive filesystem */
public class C1679883o implements C186618vf {
    public static C1679883o A00;

    public static synchronized C1679883o A00() {
        C1679883o r0;
        synchronized (C1679883o.class) {
            r0 = A00;
            if (r0 == null) {
                r0 = new C1679883o();
                A00 = r0;
            }
        }
        return r0;
    }
}
