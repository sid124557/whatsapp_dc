package X;

/* renamed from: X.7gq  reason: invalid class name and case insensitive filesystem */
public class C156567gq {
    public final int A00;
    public final C129586aY A01;
    public final String A02;
    public final Throwable A03;

    public C156567gq(C129586aY r1, String str, Throwable th, int i) {
        this.A00 = i;
        this.A03 = th;
        this.A02 = str;
        this.A01 = r1;
    }

    public static void A00(Throwable th, Throwable th2) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        if (th.getClass() != th2.getClass()) {
            try {
                th.initCause(th2);
            } catch (IllegalStateException e) {
                e.addSuppressed(th2);
            }
        }
    }
}
