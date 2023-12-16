package X;

/* renamed from: X.0EU  reason: invalid class name */
public final class AnonymousClass0EU extends AnonymousClass0GS {
    public final int retryAfter;

    public AnonymousClass0EU(String str, int i) {
        super(str);
        this.retryAfter = i;
    }

    public static AnonymousClass0EU A00(Throwable th) {
        return new AnonymousClass0EU(th.getMessage(), -1);
    }
}
