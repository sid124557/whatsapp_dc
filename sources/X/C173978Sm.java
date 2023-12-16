package X;

import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.X509CRLSelector;

/* renamed from: X.8Sm  reason: invalid class name and case insensitive filesystem */
public class C173978Sm extends X509CRLSelector {
    public final C173628Qy A00;

    public boolean match(CRL crl) {
        C173628Qy r0 = this.A00;
        if (r0 == null) {
            return AnonymousClass000.A1W(crl);
        }
        return r0.BKp(crl);
    }

    public C173978Sm(C173628Qy r3) {
        this.A00 = r3;
        CRLSelector cRLSelector = r3.A01;
        if (cRLSelector instanceof X509CRLSelector) {
            X509CRLSelector x509CRLSelector = (X509CRLSelector) cRLSelector;
            setCertificateChecking(x509CRLSelector.getCertificateChecking());
            setDateAndTime(x509CRLSelector.getDateAndTime());
            setIssuers(x509CRLSelector.getIssuers());
            setMinCRLNumber(x509CRLSelector.getMinCRL());
            setMaxCRLNumber(x509CRLSelector.getMaxCRL());
        }
    }
}
