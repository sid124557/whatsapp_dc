package X;

/* renamed from: X.2uX  reason: invalid class name and case insensitive filesystem */
public final class C57992uX {
    public static final ThreadLocal A00 = new ThreadLocal();

    public static final AnonymousClass46B A00() {
        ThreadLocal threadLocal = A00;
        AnonymousClass46B r1 = (AnonymousClass46B) threadLocal.get();
        if (r1 != null) {
            return r1;
        }
        AnonymousClass46J r12 = new AnonymousClass46J(Thread.currentThread());
        threadLocal.set(r12);
        return r12;
    }
}
