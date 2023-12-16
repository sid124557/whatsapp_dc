package X;

import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.X509Certificate;
import java.util.Date;

/* renamed from: X.7Op  reason: invalid class name and case insensitive filesystem */
public class C149967Op {
    public final int A00;
    public final PublicKey A01;
    public final CertPath A02;
    public final X509Certificate A03;
    public final Date A04;
    public final AnonymousClass8N7 A05;

    public static CertPathValidatorException A00(String str, Throwable th, C149967Op r5) {
        return new CertPathValidatorException(str, th, r5.A02, r5.A00);
    }

    public C149967Op(PublicKey publicKey, CertPath certPath, X509Certificate x509Certificate, Date date, AnonymousClass8N7 r5, int i) {
        this.A05 = r5;
        this.A04 = date;
        this.A02 = certPath;
        this.A00 = i;
        this.A03 = x509Certificate;
        this.A01 = publicKey;
    }
}
