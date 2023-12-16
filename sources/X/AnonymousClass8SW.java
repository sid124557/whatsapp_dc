package X;

import java.security.cert.CRLException;

/* renamed from: X.8SW  reason: invalid class name */
public class AnonymousClass8SW extends CRLException {
    public Throwable cause;

    public AnonymousClass8SW(Throwable th) {
        super("Exception reading IssuingDistributionPoint");
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
