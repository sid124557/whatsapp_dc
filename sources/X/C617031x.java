package X;

/* renamed from: X.31x  reason: invalid class name and case insensitive filesystem */
public final class C617031x {
    public static final ThreadLocal A00 = new ThreadLocal();

    public static final Object A00(AnonymousClass4GP r2) {
        ThreadLocal threadLocal = A00;
        threadLocal.set(2);
        try {
            return r2.invoke();
        } finally {
            threadLocal.remove();
        }
    }

    public static final void A01(AnonymousClass4GP r2, int i) {
        ThreadLocal threadLocal = A00;
        threadLocal.set(Integer.valueOf(i));
        try {
            r2.invoke();
        } finally {
            threadLocal.remove();
        }
    }
}
