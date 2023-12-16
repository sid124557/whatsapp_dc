package X;

import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;

/* renamed from: X.8Sd  reason: invalid class name and case insensitive filesystem */
public class C173908Sd extends CertPathValidatorException {
    public Throwable cause;

    public static C173908Sd A00(String str, Throwable th, CertPath certPath, int i) {
        return new C173908Sd(str, th, certPath, i);
    }

    public Throwable getCause() {
        return this.cause;
    }

    public C173908Sd(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public C173908Sd(String str, Throwable th, CertPath certPath, int i) {
        super(str, th, certPath, i);
        this.cause = th;
    }

    public C173908Sd() {
        super("OCSP response expired");
    }
}
