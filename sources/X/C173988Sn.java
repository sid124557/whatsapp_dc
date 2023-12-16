package X;

import java.io.IOException;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;

/* renamed from: X.8Sn  reason: invalid class name and case insensitive filesystem */
public class C173988Sn extends X509CertSelector {
    public final C173618Qx A00;

    public boolean match(Certificate certificate) {
        C173618Qx r0 = this.A00;
        if (r0 == null) {
            return AnonymousClass000.A1W(certificate);
        }
        return r0.A00.match(certificate);
    }

    public C173988Sn(C173618Qx r4) {
        this.A00 = r4;
        CertSelector certSelector = r4.A00;
        if (certSelector instanceof X509CertSelector) {
            X509CertSelector x509CertSelector = (X509CertSelector) certSelector;
            setAuthorityKeyIdentifier(x509CertSelector.getAuthorityKeyIdentifier());
            setBasicConstraints(x509CertSelector.getBasicConstraints());
            setCertificate(x509CertSelector.getCertificate());
            setCertificateValid(x509CertSelector.getCertificateValid());
            setKeyUsage(x509CertSelector.getKeyUsage());
            setMatchAllSubjectAltNames(x509CertSelector.getMatchAllSubjectAltNames());
            setPrivateKeyValid(x509CertSelector.getPrivateKeyValid());
            setSerialNumber(x509CertSelector.getSerialNumber());
            setSubjectKeyIdentifier(x509CertSelector.getSubjectKeyIdentifier());
            setSubjectPublicKey(x509CertSelector.getSubjectPublicKey());
            try {
                setExtendedKeyUsage(x509CertSelector.getExtendedKeyUsage());
                setIssuer(x509CertSelector.getIssuerAsBytes());
                setNameConstraints(x509CertSelector.getNameConstraints());
                setPathToNames(x509CertSelector.getPathToNames());
                setPolicy(x509CertSelector.getPolicy());
                setSubject(x509CertSelector.getSubjectAsBytes());
                setSubjectAlternativeNames(x509CertSelector.getSubjectAlternativeNames());
                setSubjectPublicKeyAlgID(x509CertSelector.getSubjectPublicKeyAlgID());
            } catch (IOException e) {
                throw new IllegalStateException(AnonymousClass000.A0a("base selector invalid: ", AnonymousClass001.A0o(), e), e);
            }
        }
    }
}
