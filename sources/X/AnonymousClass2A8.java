package X;

import java.io.Closeable;

/* renamed from: X.2A8  reason: invalid class name */
public final class AnonymousClass2A8 {
    public static final void A00(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            C154507dH.A00(th, th2);
        }
    }
}
