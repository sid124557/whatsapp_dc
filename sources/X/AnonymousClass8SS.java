package X;

import java.security.InvalidKeyException;

/* renamed from: X.8SS  reason: invalid class name */
public class AnonymousClass8SS extends InvalidKeyException {
    public final Throwable cause;

    public Throwable getCause() {
        return this.cause;
    }

    public AnonymousClass8SS(String str, Throwable th) {
        super(str);
        this.cause = th;
    }
}
