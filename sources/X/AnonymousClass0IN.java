package X;

/* renamed from: X.0IN  reason: invalid class name */
public class AnonymousClass0IN {
    public static void A00(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
