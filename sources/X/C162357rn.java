package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.CRLException;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.PolicyQualifierInfo;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.security.interfaces.DSAKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.7rn  reason: invalid class name and case insensitive filesystem */
public class C162357rn {
    public static final String A00 = C176548dB.A05.A01;
    public static final String A01 = C176548dB.A09.A01;
    public static final String A02 = C176548dB.A0K.A01;

    public static TrustAnchor A01(String str, X509Certificate x509Certificate, Set set) {
        X509CertSelector x509CertSelector = new X509CertSelector();
        X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
        x509CertSelector.setSubject(issuerX500Principal);
        Iterator it = set.iterator();
        TrustAnchor trustAnchor = null;
        Exception e = null;
        C176618dI r6 = null;
        PublicKey publicKey = null;
        while (it.hasNext() && trustAnchor == null) {
            trustAnchor = (TrustAnchor) it.next();
            if (trustAnchor.getTrustedCert() != null) {
                if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                    publicKey = trustAnchor.getTrustedCert().getPublicKey();
                }
                trustAnchor = null;
            } else {
                if (!(trustAnchor.getCA() == null || trustAnchor.getCAName() == null || trustAnchor.getCAPublicKey() == null)) {
                    if (r6 == null) {
                        r6 = C176618dI.A0B(issuerX500Principal.getEncoded());
                    }
                    try {
                        if (r6.equals(C176618dI.A0B(trustAnchor.getCA().getEncoded()))) {
                            publicKey = trustAnchor.getCAPublicKey();
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
                trustAnchor = null;
            }
            if (publicKey != null) {
                if (str == null) {
                    try {
                        x509Certificate.verify(publicKey);
                    } catch (Exception e2) {
                        e = e2;
                        trustAnchor = null;
                        publicKey = null;
                    }
                } else {
                    x509Certificate.verify(publicKey, str);
                }
            }
        }
        if (trustAnchor != null || e == null) {
            return trustAnchor;
        }
        throw C143596zA.A01("TrustAnchor found but certificate validation failed.", e);
    }

    public static Collection A02(X509Certificate x509Certificate, List list, List list2) {
        C176258ci r1;
        byte[] bArr;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(C160997on.A01(x509Certificate).A0L());
            try {
                byte[] extensionValue = x509Certificate.getExtensionValue(A00);
                if (extensionValue != null) {
                    byte[] A0C = C176778dY.A0C(extensionValue);
                    if (A0C instanceof C176258ci) {
                        r1 = (C176258ci) A0C;
                    } else if (A0C != null) {
                        r1 = new C176258ci(C176958dq.A0C(A0C));
                    } else {
                        r1 = null;
                    }
                    C176778dY r0 = r1.A01;
                    if (r0 != null) {
                        bArr = r0.A00;
                    } else {
                        bArr = null;
                    }
                    if (bArr != null) {
                        x509CertSelector.setSubjectKeyIdentifier(new C176648dL(bArr).A0L());
                    }
                }
            } catch (Exception unused) {
            }
            C173618Qx r12 = new C173618Qx((CertSelector) x509CertSelector.clone());
            LinkedHashSet A17 = AnonymousClass0x9.A17();
            try {
                A09(A17, list, r12);
                A09(A17, list2, r12);
                return A17;
            } catch (C143596zA e) {
                throw C143596zA.A01("Issuer certificate cannot be searched.", e);
            }
        } catch (Exception e2) {
            throw C143596zA.A01("Subject criteria for certificate selector to find issuer certificate could not be set.", e2);
        }
    }

    public static Collection A03(AnonymousClass8N6 r3) {
        X509Certificate x509Certificate;
        AnonymousClass8N7 r32 = r3.A02;
        C173618Qx r2 = r32.A09;
        LinkedHashSet A17 = AnonymousClass0x9.A17();
        try {
            A09(A17, r32.A05, r2);
            A09(A17, r32.A01.getCertStores(), r2);
            if (!A17.isEmpty()) {
                return A17;
            }
            CertSelector certSelector = r2.A00;
            if (certSelector instanceof X509CertSelector) {
                x509Certificate = ((X509CertSelector) certSelector).getCertificate();
            } else {
                x509Certificate = null;
            }
            if (x509Certificate != null) {
                return Collections.singleton(x509Certificate);
            }
            throw new CertPathBuilderException("No certificate found matching targetConstraints.");
        } catch (C143596zA e) {
            throw new AnonymousClass8SZ(e);
        }
    }

    public static void A07(Object obj, X509CRL x509crl, Date date, C148417Ih r8) {
        X509CRLEntry x509CRLEntry;
        int i;
        try {
            byte[] extensionValue = x509crl.getExtensionValue(C176548dB.A0K.A01);
            if (extensionValue != null && C176508d7.A0A(C176778dY.A0C(extensionValue)).A03) {
                x509CRLEntry = x509crl.getRevokedCertificate(((X509Certificate) obj).getSerialNumber());
                if (x509CRLEntry != null) {
                    X500Principal certificateIssuer = x509CRLEntry.getCertificateIssuer();
                    if (certificateIssuer == null) {
                        certificateIssuer = x509crl.getIssuerX500Principal();
                    }
                    if (!C160997on.A00(obj).equals(C160997on.A03(certificateIssuer))) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (!C160997on.A00(obj).equals(C160997on.A03(x509crl.getIssuerX500Principal())) || (x509CRLEntry = x509crl.getRevokedCertificate(((X509Certificate) obj).getSerialNumber())) == null) {
                return;
            }
            if (x509CRLEntry.hasExtensions()) {
                if (!x509CRLEntry.hasUnsupportedCriticalExtension()) {
                    try {
                        C176728dT A0A = C176728dT.A0A(A05(C176548dB.A0T.A01, x509CRLEntry));
                        if (A0A != null) {
                            i = A0A.A0U();
                            if (date.getTime() < x509CRLEntry.getRevocationDate().getTime() || i == 0 || i == 1 || i == 2 || i == 10) {
                                r8.A00 = i;
                                r8.A01 = x509CRLEntry.getRevocationDate();
                            }
                            return;
                        }
                    } catch (Exception e) {
                        throw C143596zA.A01("Reason code CRL entry extension could not be decoded.", e);
                    }
                } else {
                    throw C143596zA.A00("CRL entry has unsupported critical extensions.");
                }
            }
            i = 0;
            if (date.getTime() < x509CRLEntry.getRevocationDate().getTime()) {
            }
            r8.A00 = i;
            r8.A01 = x509CRLEntry.getRevocationDate();
        } catch (Exception e2) {
            throw new AnonymousClass8SX(e2);
        } catch (CRLException e3) {
            throw C143596zA.A01("Failed check for indirect CRL.", e3);
        }
    }

    public static PublicKey A00(List list, C180128kX r5, int i) {
        DSAKey dSAKey;
        PublicKey publicKey = ((Certificate) list.get(i)).getPublicKey();
        boolean z = publicKey instanceof DSAPublicKey;
        DSAPublicKey dSAPublicKey = publicKey;
        if (z) {
            DSAPublicKey dSAPublicKey2 = (DSAPublicKey) publicKey;
            DSAParams params = dSAPublicKey2.getParams();
            dSAPublicKey = dSAPublicKey2;
            if (params == null) {
                do {
                    i++;
                    if (i < list.size()) {
                        PublicKey publicKey2 = ((Certificate) list.get(i)).getPublicKey();
                        if (publicKey2 instanceof DSAPublicKey) {
                            dSAKey = (DSAKey) publicKey2;
                        } else {
                            throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
                        }
                    } else {
                        throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
                    }
                } while (dSAKey.getParams() == null);
                DSAParams params2 = dSAKey.getParams();
                try {
                    return KeyFactory.getInstance("DSA", ((C173558Qq) r5).A00).generatePublic(new DSAPublicKeySpec(dSAPublicKey2.getY(), params2.getP(), params2.getQ(), params2.getG()));
                } catch (Exception e) {
                    throw AnonymousClass002.A0E(e.getMessage());
                }
            }
        }
        return dSAPublicKey;
    }

    public static final Set A04(C176958dq r6) {
        HashSet A0K = AnonymousClass002.A0K();
        if (r6 != null) {
            ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
            C159057l2 r3 = new C159057l2(A0e);
            Enumeration A0V = r6.A0V();
            while (A0V.hasMoreElements()) {
                try {
                    C183618qL r0 = (C183618qL) A0V.nextElement();
                    if (r0 != null) {
                        r3.A02(r0.Bqk(), true);
                        A0K.add(new PolicyQualifierInfo(A0e.toByteArray()));
                        A0e.reset();
                    } else {
                        throw AnonymousClass002.A0C("null object detected");
                    }
                } catch (IOException e) {
                    throw new C173908Sd("Policy qualifier info cannot be decoded.", e);
                }
            }
        }
        return A0K;
    }

    public static C177088e3 A05(String str, X509Extension x509Extension) {
        byte[] extensionValue = x509Extension.getExtensionValue(str);
        if (extensionValue == null) {
            return null;
        }
        try {
            return C177088e3.A0I(C176778dY.A0C(extensionValue));
        } catch (Exception e) {
            throw C143596zA.A01(AnonymousClass000.A0V("exception processing extension ", str, AnonymousClass001.A0o()), e);
        }
    }

    public static AnonymousClass8N8 A06(AnonymousClass8N8 r3, AnonymousClass8N8 r4, List[] listArr) {
        AnonymousClass8N8 r0 = (AnonymousClass8N8) r4.getParent();
        if (r3 != null) {
            if (r0 == null) {
                for (int i = 0; i < listArr.length; i++) {
                    listArr[i] = AnonymousClass001.A0s();
                }
            } else {
                r0.A03.remove(r4);
                A0A(r4, listArr);
                return r3;
            }
        }
        return null;
    }

    public static void A08(PublicKey publicKey) {
        try {
            C176318co.A0A(publicKey.getEncoded());
        } catch (Exception e) {
            throw new C173908Sd("Subject public key cannot be decoded.", e);
        }
    }

    public static void A09(LinkedHashSet linkedHashSet, List list, C173618Qx r5) {
        for (Object next : list) {
            if (next instanceof C183658qP) {
                try {
                    linkedHashSet.addAll(((C183658qP) next).B9N(r5));
                } catch (AnonymousClass8R9 e) {
                    throw C143596zA.A01("Problem while picking certificates from X.509 store.", e);
                }
            } else {
                try {
                    linkedHashSet.addAll(((CertStore) next).getCertificates(new C173988Sn(r5)));
                } catch (CertStoreException e2) {
                    throw C143596zA.A01("Problem while picking certificates from certificate store.", e2);
                }
            }
        }
    }

    public static void A0A(AnonymousClass8N8 r1, List[] listArr) {
        listArr[r1.getDepth()].remove(r1);
        if (!r1.A03.isEmpty()) {
            Iterator children = r1.getChildren();
            while (children.hasNext()) {
                A0A((AnonymousClass8N8) children.next(), listArr);
            }
        }
    }
}
