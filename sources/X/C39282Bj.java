package X;

/* renamed from: X.2Bj  reason: invalid class name and case insensitive filesystem */
public final class C39282Bj {
    public static final StackTraceElement A00;

    static {
        Exception exc = new Exception();
        String simpleName = C02480Gk.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("_COROUTINE");
        A00 = new StackTraceElement(AnonymousClass0x2.A0e(simpleName, A0o, '.'), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            Class.forName("kotlin.coroutines.jvm.internal.BaseContinuationImpl").getCanonicalName();
        } catch (Throwable th) {
            new AnonymousClass3Z0(th);
        }
        try {
            C39282Bj.class.getCanonicalName();
        } catch (Throwable th2) {
            new AnonymousClass3Z0(th2);
        }
    }
}
