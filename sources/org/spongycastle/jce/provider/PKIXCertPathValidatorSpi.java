package org.spongycastle.jce.provider;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass6C7;
import X.AnonymousClass6C9;
import X.AnonymousClass6CA;
import X.AnonymousClass7sA;
import X.AnonymousClass8N6;
import X.AnonymousClass8N7;
import X.AnonymousClass8N8;
import X.C143596zA;
import X.C153217as;
import X.C157017ha;
import X.C160997on;
import X.C162357rn;
import X.C173518Qm;
import X.C173558Qq;
import X.C173618Qx;
import X.C173908Sd;
import X.C173938Si;
import X.C174008Sp;
import X.C176378cu;
import X.C176548dB;
import X.C176618dI;
import X.C180108kV;
import X.C180128kX;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PKIXCertPathValidatorSpi extends CertPathValidatorSpi {
    public final C180128kX A00;
    public final boolean A01;

    public static void A00(X509Certificate x509Certificate) {
        if (x509Certificate instanceof C180108kV) {
            try {
                if (((C174008Sp) ((C180108kV) x509Certificate)).c.A03 == null) {
                    e = null;
                    throw C143596zA.A01("unable to process TBSCertificate", e);
                }
            } catch (RuntimeException e) {
                e = e;
            }
        } else {
            try {
                C176378cu.A0A(x509Certificate.getTBSCertificate());
            } catch (CertificateEncodingException e2) {
                throw C143596zA.A01("unable to process TBSCertificate", e2);
            } catch (IllegalArgumentException e3) {
                throw C143596zA.A00(e3.getMessage());
            }
        }
    }

    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) {
        AnonymousClass8N7 r5;
        C176618dI r25;
        PublicKey publicKey;
        C173518Qm r14;
        HashSet A0K;
        HashSet A0K2;
        CertPathParameters certPathParameters2 = certPathParameters;
        if (certPathParameters2 instanceof PKIXParameters) {
            C157017ha r1 = new C157017ha((PKIXParameters) certPathParameters2);
            if (certPathParameters2 instanceof C173938Si) {
                C173938Si r52 = (C173938Si) certPathParameters2;
                r1.A08 = r52.A09;
                r1.A00 = r52.A00;
            }
            r5 = new AnonymousClass8N7(r1);
        } else if (certPathParameters2 instanceof AnonymousClass8N6) {
            r5 = ((AnonymousClass8N6) certPathParameters2).A02;
        } else if (certPathParameters2 instanceof AnonymousClass8N7) {
            r5 = (AnonymousClass8N7) certPathParameters2;
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Parameters must be a ");
            AnonymousClass6C9.A0y(PKIXParameters.class, A0o);
            throw AnonymousClass6CA.A0Z(AnonymousClass000.A0X(" instance.", A0o));
        }
        Set set = r5.A08;
        if (set != null) {
            CertPath certPath2 = certPath;
            List<? extends Certificate> certificates = certPath2.getCertificates();
            int size = certificates.size();
            if (!certificates.isEmpty()) {
                Date date = new Date();
                Date date2 = r5.A03;
                if (date2 != null) {
                    date = new Date(date2.getTime());
                }
                PKIXParameters pKIXParameters = r5.A01;
                Set<String> initialPolicies = pKIXParameters.getInitialPolicies();
                try {
                    TrustAnchor A012 = C162357rn.A01(pKIXParameters.getSigProvider(), (X509Certificate) certificates.get(AnonymousClass002.A04(certificates, 1)), set);
                    if (A012 != null) {
                        A00(A012.getTrustedCert());
                        C157017ha r3 = new C157017ha(r5);
                        r3.A05 = Collections.singleton(A012);
                        AnonymousClass8N7 r53 = new AnonymousClass8N7(r3);
                        int i = size + 1;
                        ArrayList[] arrayListArr = new ArrayList[i];
                        for (int i2 = 0; i2 < i; i2++) {
                            arrayListArr[i2] = AnonymousClass001.A0s();
                        }
                        HashSet A0K3 = AnonymousClass002.A0K();
                        A0K3.add("2.5.29.32.0");
                        AnonymousClass8N8 r21 = new AnonymousClass8N8("2.5.29.32.0", (PolicyNode) null, AnonymousClass001.A0s(), A0K3, AnonymousClass002.A0K(), 0, false);
                        arrayListArr[0].add(r21);
                        C153217as r18 = new C153217as();
                        HashSet A0K4 = AnonymousClass002.A0K();
                        PKIXParameters pKIXParameters2 = r53.A01;
                        int i3 = i;
                        if (pKIXParameters2.isExplicitPolicyRequired()) {
                            i3 = 0;
                        }
                        int i4 = i;
                        if (pKIXParameters2.isAnyPolicyInhibited()) {
                            i4 = 0;
                        }
                        if (pKIXParameters2.isPolicyMappingInhibited()) {
                            i = 0;
                        }
                        X509Certificate trustedCert = A012.getTrustedCert();
                        if (trustedCert != null) {
                            try {
                                r25 = C160997on.A02(trustedCert);
                                publicKey = trustedCert.getPublicKey();
                            } catch (RuntimeException e) {
                                throw C173908Sd.A00("Subject of trust anchor could not be (re)encoded.", e, certPath2, -1);
                            }
                        } else {
                            r25 = C160997on.A03(A012.getCA());
                            publicKey = A012.getCAPublicKey();
                        }
                        try {
                            C162357rn.A08(publicKey);
                            C173618Qx r2 = r53.A09;
                            if (r2 != null) {
                                if (!r2.A00.match((Certificate) certificates.get(0))) {
                                    throw C173908Sd.A00("Target certificate in certification path does not match targetConstraints.", (Throwable) null, certPath2, 0);
                                }
                            }
                            List<PKIXCertPathChecker> certPathCheckers = pKIXParameters2.getCertPathCheckers();
                            for (PKIXCertPathChecker init : certPathCheckers) {
                                init.init(false);
                            }
                            if (r53.A0A) {
                                r14 = new C173518Qm(this.A00);
                            } else {
                                r14 = null;
                            }
                            int A03 = AnonymousClass002.A03(certificates);
                            int i5 = size;
                            X509Certificate x509Certificate = null;
                            while (A03 >= 0) {
                                int i6 = size - A03;
                                x509Certificate = (X509Certificate) certificates.get(A03);
                                boolean A1U = AnonymousClass000.A1U(A03, AnonymousClass002.A03(certificates));
                                try {
                                    A00(x509Certificate);
                                    AnonymousClass7sA.A0A(publicKey, certPath2, trustedCert, date, r25, r14, r53, A03, A1U);
                                    boolean z = this.A01;
                                    C153217as r10 = r18;
                                    AnonymousClass7sA.A0I(certPath2, r10, A03, z);
                                    r21 = AnonymousClass7sA.A08(certPath2, AnonymousClass7sA.A07(certPath2, A0K4, r21, arrayListArr, A03, i4, z), A03);
                                    if (i3 > 0 || r21 != null) {
                                        if (i6 != size) {
                                            if (x509Certificate == null || x509Certificate.getVersion() != 1) {
                                                AnonymousClass7sA.A0C(certPath2, A03);
                                                r21 = AnonymousClass7sA.A09(certPath2, r21, arrayListArr, A03, i);
                                                AnonymousClass7sA.A0H(certPath2, r10, A03);
                                                int A09 = AnonymousClass6C7.A09(certPath2, A03, i3);
                                                int A092 = AnonymousClass6C7.A09(certPath2, A03, i);
                                                int A093 = AnonymousClass6C7.A09(certPath2, A03, i4);
                                                i3 = AnonymousClass7sA.A00(certPath2, A03, A09);
                                                i = AnonymousClass7sA.A01(certPath2, A03, A092);
                                                i4 = AnonymousClass7sA.A02(certPath2, A03, A093);
                                                AnonymousClass7sA.A0D(certPath2, A03);
                                                if (!AnonymousClass6C9.A1R(AnonymousClass6C7.A0t(certPath2, A03))) {
                                                    if (i5 > 0) {
                                                        i5--;
                                                    } else {
                                                        throw C173908Sd.A00("Max path length not greater than zero", (Throwable) null, certPath2, A03);
                                                    }
                                                }
                                                i5 = AnonymousClass7sA.A03(certPath2, A03, i5);
                                                AnonymousClass7sA.A0E(certPath2, A03);
                                                Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
                                                if (criticalExtensionOIDs != null) {
                                                    A0K2 = AnonymousClass0x9.A15(criticalExtensionOIDs);
                                                    AnonymousClass6C7.A1Q(A0K2);
                                                } else {
                                                    A0K2 = AnonymousClass002.A0K();
                                                }
                                                AnonymousClass7sA.A0F(certPath2, certPathCheckers, A0K2, A03);
                                                r25 = C160997on.A02(x509Certificate);
                                                try {
                                                    publicKey = C162357rn.A00(certPath2.getCertificates(), this.A00, A03);
                                                    C162357rn.A08(publicKey);
                                                    trustedCert = x509Certificate;
                                                } catch (CertPathValidatorException e2) {
                                                    throw new CertPathValidatorException("Next working key could not be retrieved.", e2, certPath2, A03);
                                                }
                                            } else if (i6 != 1 || !x509Certificate.equals(A012.getTrustedCert())) {
                                                throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", (Throwable) null, certPath2, A03);
                                            }
                                        }
                                        A03--;
                                    } else {
                                        throw C173908Sd.A00("No valid policy tree found when one expected.", (Throwable) null, certPath2, A03);
                                    }
                                } catch (C143596zA e3) {
                                    throw new CertPathValidatorException(e3.getMessage(), e3._underlyingException, certPath2, A03);
                                }
                            }
                            if (!AnonymousClass6C9.A1R(x509Certificate) && i3 != 0) {
                                i3--;
                            }
                            int i7 = A03 + 1;
                            int A04 = AnonymousClass7sA.A04(certPath2, i7, i3);
                            Set<String> criticalExtensionOIDs2 = x509Certificate.getCriticalExtensionOIDs();
                            if (criticalExtensionOIDs2 != null) {
                                A0K = AnonymousClass0x9.A15(criticalExtensionOIDs2);
                                AnonymousClass6C7.A1Q(A0K);
                                A0K.remove(AnonymousClass7sA.A04);
                                A0K.remove(C176548dB.A0E.A01);
                            } else {
                                A0K = AnonymousClass002.A0K();
                            }
                            AnonymousClass7sA.A0G(certPath2, certPathCheckers, A0K, i7);
                            AnonymousClass8N8 A06 = AnonymousClass7sA.A06(certPath2, initialPolicies, A0K4, r53, r21, arrayListArr, i7);
                            if (A04 > 0 || A06 != null) {
                                return new PKIXCertPathValidatorResult(A012, A06, x509Certificate.getPublicKey());
                            }
                            throw new CertPathValidatorException("Path processing failed on policy.", (Throwable) null, certPath2, A03);
                        } catch (CertPathValidatorException e4) {
                            throw C173908Sd.A00("Algorithm identifier of public key of trust anchor could not be read.", e4, certPath2, -1);
                        }
                    } else {
                        throw new CertPathValidatorException("Trust anchor for certification path not found.", (Throwable) null, certPath2, -1);
                    }
                } catch (C143596zA e5) {
                    throw new CertPathValidatorException(e5.getMessage(), e5._underlyingException, certPath2, AnonymousClass002.A04(certificates, 1));
                }
            } else {
                throw new CertPathValidatorException("Certification path is empty.", (Throwable) null, certPath2, -1);
            }
        } else {
            throw AnonymousClass6CA.A0Z("trustAnchors is null, this is not allowed for certification path validation.");
        }
    }

    public PKIXCertPathValidatorSpi(boolean z) {
        this.A00 = new C173558Qq();
        this.A01 = z;
    }

    public PKIXCertPathValidatorSpi() {
        this(false);
    }
}
