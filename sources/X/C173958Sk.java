package X;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.8Sk  reason: invalid class name and case insensitive filesystem */
public abstract class C173958Sk extends X509CRL {
    public String A00;
    public C176268cj A01;
    public C180128kX A02;
    public boolean A03;
    public byte[] A04;

    public Set getCriticalExtensionOIDs() {
        return A00(true);
    }

    public Set getNonCriticalExtensionOIDs() {
        return A00(false);
    }

    public void verify(PublicKey publicKey, Provider provider) {
        try {
            A02(publicKey, new AnonymousClass93Q(provider, 0, this));
        } catch (NoSuchProviderException e) {
            throw new NoSuchAlgorithmException(AnonymousClass000.A0a("provider issue: ", AnonymousClass001.A0o(), e));
        }
    }

    public final void A01(PublicKey publicKey, Signature signature, C183618qL r6, byte[] bArr) {
        if (r6 != null) {
            C161977qv.A03(signature, r6);
        }
        signature.initVerify(publicKey);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C140756uR(signature), 512);
            this.A01.A03.A0K(bufferedOutputStream, "DER");
            bufferedOutputStream.close();
            if (!signature.verify(bArr)) {
                throw new SignatureException("CRL does not verify with supplied public key.");
            }
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    public final void A02(PublicKey publicKey, C183648qO r10) {
        C176268cj r7 = this.A01;
        C176528d9 r2 = r7.A02;
        if (r2.equals(r7.A03.A03)) {
            if (C186888w6.A0C.A0T(r2.A01)) {
                C176958dq A0C = C176958dq.A0C(r2.A00);
                C176958dq A0C2 = C176958dq.A0C(C176068cP.A0A(r7.A01).A0U());
                boolean z = false;
                for (int i = 0; i != A0C2.A0U(); i++) {
                    C176528d9 A0A = C176528d9.A0A(A0C.A0W(i));
                    try {
                        A01(publicKey, r10.B15(C161977qv.A01(A0A)), A0A.A00, C176068cP.A0A(A0C2.A0W(i)).A0U());
                        z = true;
                    } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
                    } catch (SignatureException e) {
                        throw e;
                    }
                }
                if (!z) {
                    throw new InvalidKeyException("no matching key found");
                }
                return;
            }
            Signature B15 = r10.B15(this.A00);
            byte[] bArr = this.A04;
            if (bArr == null) {
                A01(publicKey, B15, (C183618qL) null, getSignature());
                return;
            }
            try {
                A01(publicKey, B15, C177088e3.A0I(bArr), getSignature());
            } catch (IOException e2) {
                throw new SignatureException(AnonymousClass000.A0a("cannot decode signature parameters: ", AnonymousClass001.A0o(), e2));
            }
        } else {
            throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
    }

    public byte[] getEncoded() {
        try {
            return this.A01.A0M("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    public byte[] getExtensionValue(String str) {
        C176778dY r0;
        C176548dB A0A;
        C176288cl r1 = this.A01.A03.A04;
        if (r1 == null || (A0A = C176288cl.A0A(C176768dX.A0B(str), r1)) == null) {
            r0 = null;
        } else {
            r0 = A0A.A01;
        }
        if (r0 == null) {
            return null;
        }
        try {
            return r0.A0L();
        } catch (Exception e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18270x1.A1H(A0o, "error parsing ", e);
            throw AnonymousClass001.A0e(A0o.toString());
        }
    }

    public Principal getIssuerDN() {
        return new C177148e9(C176618dI.A0B(this.A01.A03.A02.A01));
    }

    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.A01.A03.A02.A0L());
        } catch (IOException unused) {
            throw AnonymousClass001.A0e("can't encode issuer DN");
        }
    }

    public Date getNextUpdate() {
        C176598dG r0 = this.A01.A03.A05;
        if (r0 == null) {
            return null;
        }
        return r0.A0O();
    }

    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        Enumeration r2;
        C176548dB A0A;
        C176198cc r1 = this.A01.A03;
        C176958dq r0 = r1.A01;
        if (r0 == null) {
            r2 = new AnonymousClass8NZ(r1);
        } else {
            r2 = new C172838Na(r0.A0V(), r1);
        }
        C176618dI r3 = null;
        while (r2.hasMoreElements()) {
            C176248ch r4 = (C176248ch) r2.nextElement();
            C176958dq r12 = r4.A00;
            if (C176748dV.A0A(C176958dq.A0A(r12)).A0V(bigInteger)) {
                return new C173968Sl(r3, r4, this.A03);
            }
            if (this.A03 && r12.A0U() == 3 && (A0A = C176288cl.A0A(C176548dB.A0A, r4.A0N())) != null) {
                r3 = C176618dI.A0B(C176518d8.A0A(C176548dB.A0A(A0A))[0].A01);
            }
        }
        return null;
    }

    public String getSigAlgName() {
        return this.A00;
    }

    public String getSigAlgOID() {
        return this.A01.A02.A01.A01;
    }

    public byte[] getSigAlgParams() {
        return C161007oo.A02(this.A04);
    }

    public byte[] getSignature() {
        C176068cP r1 = this.A01.A01;
        if (r1.A00 == 0) {
            return C161007oo.A02(r1.A01);
        }
        throw AnonymousClass001.A0e("attempt to get non-octet aligned data from BIT STRING");
    }

    public byte[] getTBSCertList() {
        try {
            return this.A01.A03.A0M("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    public Date getThisUpdate() {
        return this.A01.A03.A06.A0O();
    }

    public int getVersion() {
        C176748dV r0 = this.A01.A03.A00;
        if (r0 == null) {
            return 1;
        }
        return r0.A0U() + 1;
    }

    public String toString() {
        String str;
        String A002;
        Object A0A;
        StringBuffer A0X = AnonymousClass6CA.A0X();
        String str2 = C162077rB.A00;
        A0X.append("              Version: ");
        A0X.append(getVersion());
        A0X.append(str2);
        A0X.append("             IssuerDN: ");
        A0X.append(getIssuerDN());
        A0X.append(str2);
        A0X.append("          This update: ");
        A0X.append(getThisUpdate());
        A0X.append(str2);
        A0X.append("          Next update: ");
        A0X.append(getNextUpdate());
        A0X.append(str2);
        A0X.append("  Signature Algorithm: ");
        A0X.append(this.A00);
        A0X.append(str2);
        C161977qv.A02(str2, A0X, getSignature());
        C176288cl r1 = this.A01.A03.A04;
        if (r1 != null) {
            Enumeration elements = r1.A01.elements();
            if (elements.hasMoreElements()) {
                str = "           Extensions: ";
                A0X.append(str);
                A0X.append(str2);
            }
            while (true) {
                if (!elements.hasMoreElements()) {
                    break;
                }
                C176768dX r5 = (C176768dX) elements.nextElement();
                C176548dB A0A2 = C176288cl.A0A(r5, r1);
                C176778dY r0 = A0A2.A01;
                if (r0 == null) {
                    break;
                }
                C140356tb A032 = C140356tb.A03(A0X, r0, A0A2);
                C140356tb A0322 = C140356tb.A03(A0X, r0, A0A2);
                try {
                } catch (Exception unused) {
                    A0X.append(r5.A01);
                    A0X.append(" value = ");
                    str = "*****";
                }
                if (r5.A0T(C176548dB.A09)) {
                    A0A = new C176218ce(new BigInteger(1, C176748dV.A0A(A0322.A06()).A01));
                } else {
                    if (r5.A0T(C176548dB.A0C)) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("Base CRL: ");
                        A002 = AnonymousClass000.A0R(new C176218ce(new BigInteger(1, C176748dV.A0A(A0322.A06()).A01)), A0o);
                    } else if (r5.A0T(C176548dB.A0K)) {
                        A0A = C176508d7.A0A(A0322.A06());
                    } else if (r5.A0T(C176548dB.A08)) {
                        A0A = C176418cy.A0A(A0322.A06());
                    } else if (r5.A0T(C176548dB.A0F)) {
                        A0A = C176418cy.A0A(A0322.A06());
                    } else {
                        A0X.append(r5.A01);
                        A0X.append(" value = ");
                        A002 = C154577dO.A00(A0322.A06());
                    }
                    A0X.append(A002);
                    A0X.append(str2);
                }
                A0X.append(A0A);
                A0X.append(str2);
                break;
                break;
            }
        }
        Set<? extends X509CRLEntry> revokedCertificates = getRevokedCertificates();
        if (revokedCertificates != null) {
            for (Object append : revokedCertificates) {
                A0X.append(append);
                A0X.append(str2);
            }
        }
        return A0X.toString();
    }

    public C173958Sk(String str, C176268cj r2, C180128kX r3, byte[] bArr, boolean z) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = str;
        this.A04 = bArr;
        this.A03 = z;
    }

    public final Set A00(boolean z) {
        C176288cl r4;
        if (getVersion() != 2 || (r4 = this.A01.A03.A04) == null) {
            return null;
        }
        HashSet A0K = AnonymousClass002.A0K();
        Enumeration elements = r4.A01.elements();
        while (elements.hasMoreElements()) {
            C176768dX r1 = (C176768dX) elements.nextElement();
            if (z == C176288cl.A0A(r1, r4).A02) {
                A0K.add(r1.A01);
            }
        }
        return A0K;
    }

    public Set getRevokedCertificates() {
        Enumeration r3;
        C176548dB A0A;
        HashSet A0K = AnonymousClass002.A0K();
        C176198cc r1 = this.A01.A03;
        C176958dq r0 = r1.A01;
        if (r0 == null) {
            r3 = new AnonymousClass8NZ(r1);
        } else {
            r3 = new C172838Na(r0.A0V(), r1);
        }
        C176618dI r5 = null;
        while (r3.hasMoreElements()) {
            C176248ch r4 = (C176248ch) r3.nextElement();
            boolean z = this.A03;
            A0K.add(new C173968Sl(r5, r4, z));
            if (z && r4.A00.A0U() == 3 && (A0A = C176288cl.A0A(C176548dB.A0A, r4.A0N())) != null) {
                r5 = C176618dI.A0B(C176518d8.A0A(C176548dB.A0A(A0A))[0].A01);
            }
        }
        if (!A0K.isEmpty()) {
            return Collections.unmodifiableSet(A0K);
        }
        return null;
    }

    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(C176548dB.A0K.A01);
        criticalExtensionOIDs.remove(C176548dB.A0C.A01);
        return !criticalExtensionOIDs.isEmpty();
    }

    public boolean isRevoked(Certificate certificate) {
        Enumeration r4;
        C176248ch r7;
        C176618dI r0;
        C176548dB A0A;
        if (certificate.getType().equals("X.509")) {
            C176198cc r1 = this.A01.A03;
            C176958dq r02 = r1.A01;
            if (r02 == null) {
                r4 = new AnonymousClass8NZ(r1);
            } else {
                r4 = new C172838Na(r02.A0V(), r1);
            }
            C176618dI r2 = r1.A02;
            if (r4.hasMoreElements()) {
                X509Certificate x509Certificate = (X509Certificate) certificate;
                BigInteger serialNumber = x509Certificate.getSerialNumber();
                while (true) {
                    if (!r4.hasMoreElements()) {
                        break;
                    }
                    Object nextElement = r4.nextElement();
                    if (nextElement instanceof C176248ch) {
                        r7 = (C176248ch) nextElement;
                    } else if (nextElement != null) {
                        r7 = new C176248ch(C176958dq.A0C(nextElement));
                    } else {
                        r7 = null;
                    }
                    if (this.A03 && r7.A00.A0U() == 3 && (A0A = C176288cl.A0A(C176548dB.A0A, r7.A0N())) != null) {
                        r2 = C176618dI.A0B(C176518d8.A0A(C176548dB.A0A(A0A))[0].A01);
                    }
                    if (C176748dV.A0A(r7.A00.A0W(0)).A0V(serialNumber)) {
                        if (certificate instanceof X509Certificate) {
                            r0 = C176618dI.A0B(x509Certificate.getIssuerX500Principal().getEncoded());
                        } else {
                            try {
                                r0 = C176368ct.A0A(certificate.getEncoded()).A03.A05;
                            } catch (CertificateEncodingException e) {
                                throw AnonymousClass001.A0c(AnonymousClass000.A0a("Cannot process certificate: ", AnonymousClass001.A0o(), e));
                            }
                        }
                        if (r2.equals(r0)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw AnonymousClass001.A0c("X.509 CRL used with non X.509 Cert");
    }

    public void verify(PublicKey publicKey, String str) {
        A02(publicKey, new AnonymousClass93P(0, str, this));
    }

    public void verify(PublicKey publicKey) {
        A02(publicKey, new AnonymousClass93R(this, 0));
    }
}
