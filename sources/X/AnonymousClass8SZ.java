package X;

import java.security.cert.CertPathBuilderException;

/* renamed from: X.8SZ  reason: invalid class name */
public class AnonymousClass8SZ extends CertPathBuilderException {
    public Throwable cause;

    public AnonymousClass8SZ(Throwable th) {
        super("Error finding target certificate.");
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
