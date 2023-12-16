package X;

import java.io.IOException;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.PKIXParameters;
import java.security.cert.X509CertSelector;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.8Si  reason: invalid class name and case insensitive filesystem */
public class C173938Si extends PKIXParameters {
    public int A00 = 0;
    public List A01 = AnonymousClass001.A0s();
    public List A02 = AnonymousClass001.A0s();
    public Set A03 = AnonymousClass002.A0K();
    public Set A04 = AnonymousClass002.A0K();
    public Set A05 = AnonymousClass002.A0K();
    public Set A06 = AnonymousClass002.A0K();
    public C188108yK A07;
    public boolean A08;
    public boolean A09 = false;

    public void setCertStores(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                addCertStore((CertStore) it.next());
            }
        }
    }

    public C173938Si(Set set) {
        super(set);
    }

    public void A00(PKIXParameters pKIXParameters) {
        C188108yK r0;
        setDate(pKIXParameters.getDate());
        setCertPathCheckers(pKIXParameters.getCertPathCheckers());
        setCertStores(pKIXParameters.getCertStores());
        setAnyPolicyInhibited(pKIXParameters.isAnyPolicyInhibited());
        setExplicitPolicyRequired(pKIXParameters.isExplicitPolicyRequired());
        setPolicyMappingInhibited(pKIXParameters.isPolicyMappingInhibited());
        setRevocationEnabled(pKIXParameters.isRevocationEnabled());
        setInitialPolicies(pKIXParameters.getInitialPolicies());
        setPolicyQualifiersRejected(pKIXParameters.getPolicyQualifiersRejected());
        setSigProvider(pKIXParameters.getSigProvider());
        setTargetCertConstraints(pKIXParameters.getTargetCertConstraints());
        try {
            setTrustAnchors(pKIXParameters.getTrustAnchors());
            if (pKIXParameters instanceof C173938Si) {
                C173938Si r2 = (C173938Si) pKIXParameters;
                this.A00 = r2.A00;
                this.A09 = r2.A09;
                this.A08 = r2.A08;
                C188108yK r02 = r2.A07;
                if (r02 == null) {
                    r0 = null;
                } else {
                    r0 = (C188108yK) r02.clone();
                }
                this.A07 = r0;
                this.A02 = AnonymousClass002.A0J(r2.A02);
                this.A01 = AnonymousClass002.A0J(r2.A01);
                this.A06 = AnonymousClass0x9.A15(r2.A06);
                this.A05 = AnonymousClass0x9.A15(r2.A05);
                this.A04 = AnonymousClass0x9.A15(r2.A04);
                this.A03 = AnonymousClass0x9.A15(r2.A03);
            }
        } catch (Exception e) {
            throw AnonymousClass002.A0E(e.getMessage());
        }
    }

    public Object clone() {
        try {
            C173938Si r0 = new C173938Si(getTrustAnchors());
            r0.A00(this);
            return r0;
        } catch (Exception e) {
            throw AnonymousClass002.A0E(e.getMessage());
        }
    }

    public void setTargetCertConstraints(CertSelector certSelector) {
        C173998So r1;
        super.setTargetCertConstraints(certSelector);
        if (certSelector != null) {
            X509CertSelector x509CertSelector = (X509CertSelector) certSelector;
            if (x509CertSelector != null) {
                r1 = new C173998So();
                r1.setAuthorityKeyIdentifier(x509CertSelector.getAuthorityKeyIdentifier());
                r1.setBasicConstraints(x509CertSelector.getBasicConstraints());
                r1.setCertificate(x509CertSelector.getCertificate());
                r1.setCertificateValid(x509CertSelector.getCertificateValid());
                r1.setMatchAllSubjectAltNames(x509CertSelector.getMatchAllSubjectAltNames());
                try {
                    r1.setPathToNames(x509CertSelector.getPathToNames());
                    r1.setExtendedKeyUsage(x509CertSelector.getExtendedKeyUsage());
                    r1.setNameConstraints(x509CertSelector.getNameConstraints());
                    r1.setPolicy(x509CertSelector.getPolicy());
                    r1.setSubjectPublicKeyAlgID(x509CertSelector.getSubjectPublicKeyAlgID());
                    r1.setSubjectAlternativeNames(x509CertSelector.getSubjectAlternativeNames());
                    r1.setIssuer(x509CertSelector.getIssuer());
                    r1.setKeyUsage(x509CertSelector.getKeyUsage());
                    r1.setPrivateKeyValid(x509CertSelector.getPrivateKeyValid());
                    r1.setSerialNumber(x509CertSelector.getSerialNumber());
                    r1.setSubject(x509CertSelector.getSubject());
                    r1.setSubjectKeyIdentifier(x509CertSelector.getSubjectKeyIdentifier());
                    r1.setSubjectPublicKey(x509CertSelector.getSubjectPublicKey());
                } catch (IOException e) {
                    throw AnonymousClass000.A0E(e, "error in passed in selector: ", AnonymousClass001.A0o());
                }
            } else {
                throw AnonymousClass001.A0c("cannot create from null selector");
            }
        } else {
            r1 = null;
        }
        this.A07 = r1;
    }
}
