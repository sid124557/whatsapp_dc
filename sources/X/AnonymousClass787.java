package X;

/* renamed from: X.787  reason: invalid class name */
public final class AnonymousClass787 {
    public static final boolean A00;

    static {
        Object obj;
        try {
            obj = Class.forName("android.os.Build");
        } catch (Throwable th) {
            obj = new AnonymousClass3Z0(th);
        }
        A00 = !(obj instanceof AnonymousClass3Z0);
    }
}
