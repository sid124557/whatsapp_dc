package X;

import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;

/* renamed from: X.8So  reason: invalid class name and case insensitive filesystem */
public class C173998So extends X509CertSelector implements C188108yK {
    public boolean BKp(Object obj) {
        if (!(obj instanceof X509Certificate)) {
            return false;
        }
        return super.match((Certificate) obj);
    }

    public boolean match(Certificate certificate) {
        return BKp(certificate);
    }
}
