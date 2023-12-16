package X;

import java.security.cert.Certificate;
import java.security.cert.CertificateException;

/* renamed from: X.782  reason: invalid class name */
public class AnonymousClass782 {
    public static Certificate A00;

    static {
        try {
            A00 = C154497dG.A00("signer.crt");
        } catch (CertificateException unused) {
        }
    }
}
