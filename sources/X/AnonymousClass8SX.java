package X;

import java.security.cert.CRLException;

/* renamed from: X.8SX  reason: invalid class name */
public class AnonymousClass8SX extends CRLException {
    public Throwable cause;

    public AnonymousClass8SX(Throwable th) {
        super("Exception reading IssuingDistributionPoint");
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
