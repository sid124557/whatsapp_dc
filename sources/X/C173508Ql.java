package X;

import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;

/* renamed from: X.8Ql  reason: invalid class name and case insensitive filesystem */
public class C173508Ql implements C184658sJ {
    public final PKIXCertPathChecker A00;

    public void BGC(C149967Op r3) {
        this.A00.init(false);
    }

    public void check(Certificate certificate) {
        this.A00.check(certificate);
    }

    public C173508Ql(PKIXCertPathChecker pKIXCertPathChecker) {
        this.A00 = pKIXCertPathChecker;
    }
}
