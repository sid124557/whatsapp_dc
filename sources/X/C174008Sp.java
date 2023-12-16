package X;

import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.8Sp  reason: invalid class name and case insensitive filesystem */
public abstract class C174008Sp extends X509Certificate implements C180108kV {
    public C176398cw basicConstraints;
    public C180128kX bcHelper;
    public C176368ct c;
    public boolean[] keyUsage;
    public String sigAlgName;
    public byte[] sigAlgParams;

    public final void verify(PublicKey publicKey, Provider provider) {
        try {
            A02(publicKey, new AnonymousClass93Q(provider, 1, this));
        } catch (NoSuchProviderException e) {
            throw new NoSuchAlgorithmException(AnonymousClass000.A0a("provider issue: ", AnonymousClass001.A0o(), e));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r2.A00 == null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r0 != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r1 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r1.equals(X.C176108cT.A00) == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(java.security.PublicKey r5, java.security.Signature r6, X.C183618qL r7, byte[] r8) {
        /*
            r4 = this;
            X.8ct r0 = r4.c
            X.8d9 r3 = r0.A02
            X.8cu r0 = r0.A03
            X.8d9 r2 = r0.A07
            X.8dX r1 = r3.A01
            X.8dX r0 = r2.A01
            boolean r0 = r1.A0T(r0)
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = "org.spongycastle.x509.allow_absent_equiv_NULL"
            boolean r0 = X.C159797mT.A01(r0)
            if (r0 == 0) goto L_0x0037
            X.8qL r1 = r3.A00
            if (r1 != 0) goto L_0x0032
            X.8qL r1 = r2.A00
            if (r1 == 0) goto L_0x0043
        L_0x0022:
            X.8cT r0 = X.C176108cT.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0043
        L_0x002a:
            java.lang.String r0 = "signature algorithm in TBS cert not same as outer cert"
            java.security.cert.CertificateException r1 = new java.security.cert.CertificateException
            r1.<init>(r0)
            throw r1
        L_0x0032:
            X.8qL r0 = r2.A00
            if (r0 != 0) goto L_0x0037
            goto L_0x0022
        L_0x0037:
            X.8qL r1 = r3.A00
            X.8qL r0 = r2.A00
            if (r1 == 0) goto L_0x004a
            boolean r0 = r1.equals(r0)
        L_0x0041:
            if (r0 == 0) goto L_0x002a
        L_0x0043:
            X.C161977qv.A03(r6, r7)
            r6.initVerify(r5)
            goto L_0x0051
        L_0x004a:
            if (r0 == 0) goto L_0x0043
            boolean r0 = r0.equals(r1)
            goto L_0x0041
        L_0x0051:
            X.6uR r1 = new X.6uR     // Catch:{ IOException -> 0x0078 }
            r1.<init>(r6)     // Catch:{ IOException -> 0x0078 }
            r0 = 512(0x200, float:7.175E-43)
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0078 }
            r2.<init>(r1, r0)     // Catch:{ IOException -> 0x0078 }
            X.8ct r0 = r4.c     // Catch:{ IOException -> 0x0078 }
            X.8cu r1 = r0.A03     // Catch:{ IOException -> 0x0078 }
            java.lang.String r0 = "DER"
            r1.A0K(r2, r0)     // Catch:{ IOException -> 0x0078 }
            r2.close()     // Catch:{ IOException -> 0x0078 }
            boolean r0 = r6.verify(r8)
            if (r0 == 0) goto L_0x0070
            return
        L_0x0070:
            java.lang.String r0 = "certificate does not verify with supplied key"
            java.security.SignatureException r1 = new java.security.SignatureException
            r1.<init>(r0)
            throw r1
        L_0x0078:
            r0 = move-exception
            java.lang.String r1 = r0.toString()
            java.security.cert.CertificateEncodingException r0 = new java.security.cert.CertificateEncodingException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174008Sp.A01(java.security.PublicKey, java.security.Signature, X.8qL, byte[]):void");
    }

    private void A02(PublicKey publicKey, C183648qO r10) {
        boolean A0T = C186888w6.A0C.A0T(this.c.A02.A01);
        C176528d9 r0 = this.c.A02;
        if (A0T) {
            C176958dq A0C = C176958dq.A0C(r0.A00);
            C176958dq A0C2 = C176958dq.A0C(C176068cP.A0A(this.c.A01).A0U());
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
        A01(publicKey, r10.B15(C161977qv.A01(r0)), this.c.A02.A00, getSignature());
    }

    public static byte[] A03(String str, C176368ct r3) {
        C176548dB A0A;
        C176778dY r0;
        C176288cl r1 = r3.A03.A08;
        if (r1 == null || (A0A = C176288cl.A0A(C176768dX.A0B(str), r1)) == null || (r0 = A0A.A01) == null) {
            return null;
        }
        return r0.A00;
    }

    public int getBasicConstraints() {
        C176738dU r0;
        BigInteger bigInteger;
        C176398cw r2 = this.basicConstraints;
        if (r2 == null || (r0 = r2.A00) == null || r0.A00 == 0) {
            return -1;
        }
        C176748dV r02 = r2.A01;
        if (r02 == null) {
            return Integer.MAX_VALUE;
        }
        new BigInteger(r02.A01);
        C176748dV r03 = this.basicConstraints.A01;
        if (r03 != null) {
            bigInteger = new BigInteger(r03.A01);
        } else {
            bigInteger = null;
        }
        return bigInteger.intValue();
    }

    public byte[] getEncoded() {
        try {
            return this.c.A0M("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    public List getExtendedKeyUsage() {
        byte[] A03 = A03("2.5.29.37", this.c);
        if (A03 == null) {
            return null;
        }
        try {
            C176958dq A0C = C176958dq.A0C(C177088e3.A0I(A03));
            ArrayList A0s = AnonymousClass001.A0s();
            for (int i = 0; i != A0C.A0U(); i++) {
                A0s.add(((C176768dX) A0C.A0W(i)).A01);
            }
            return Collections.unmodifiableList(A0s);
        } catch (Exception unused) {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
    }

    public byte[] getExtensionValue(String str) {
        C176778dY r0;
        C176548dB A0A;
        C176288cl r1 = this.c.A03.A08;
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

    public Collection getIssuerAlternativeNames() {
        return A00(C176548dB.A0J.A01, this.c);
    }

    public Principal getIssuerDN() {
        return new C177148e9(this.c.A03.A05);
    }

    public boolean[] getIssuerUniqueID() {
        C176068cP r1 = this.c.A03.A03;
        if (r1 == null) {
            return null;
        }
        byte[] A0U = r1.A0U();
        int length = (A0U.length * 8) - r1.A00;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = AnonymousClass000.A1S(A0U[i / 8] & (128 >>> (i % 8)));
        }
        return zArr;
    }

    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.c.A03.A05.A0M("DER"));
        } catch (IOException unused) {
            throw AnonymousClass001.A0e("can't encode issuer DN");
        }
    }

    public boolean[] getKeyUsage() {
        boolean[] zArr = this.keyUsage;
        if (zArr == null) {
            return null;
        }
        return (boolean[]) zArr.clone();
    }

    public Date getNotAfter() {
        return this.c.A03.A0A.A0O();
    }

    public Date getNotBefore() {
        return this.c.A03.A0B.A0O();
    }

    public PublicKey getPublicKey() {
        try {
            C176768dX r0 = this.c.A03.A09.A01.A01;
            Map map = AnonymousClass8SV.A00;
            synchronized (map) {
                map.get(r0);
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public BigInteger getSerialNumber() {
        return new BigInteger(this.c.A03.A00.A01);
    }

    public String getSigAlgName() {
        return this.sigAlgName;
    }

    public String getSigAlgOID() {
        return this.c.A02.A01.A01;
    }

    public byte[] getSigAlgParams() {
        return C161007oo.A02(this.sigAlgParams);
    }

    public byte[] getSignature() {
        C176068cP r1 = this.c.A01;
        if (r1.A00 == 0) {
            return C161007oo.A02(r1.A01);
        }
        throw AnonymousClass001.A0e("attempt to get non-octet aligned data from BIT STRING");
    }

    public Collection getSubjectAlternativeNames() {
        return A00(C176548dB.A0U.A01, this.c);
    }

    public Principal getSubjectDN() {
        return new C177148e9(this.c.A03.A06);
    }

    public boolean[] getSubjectUniqueID() {
        C176068cP r1 = this.c.A03.A04;
        if (r1 == null) {
            return null;
        }
        byte[] A0U = r1.A0U();
        int length = (A0U.length * 8) - r1.A00;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = AnonymousClass000.A1S(A0U[i / 8] & (128 >>> (i % 8)));
        }
        return zArr;
    }

    public X500Principal getSubjectX500Principal() {
        try {
            return new X500Principal(this.c.A03.A06.A0M("DER"));
        } catch (IOException unused) {
            throw AnonymousClass001.A0e("can't encode subject DN");
        }
    }

    public byte[] getTBSCertificate() {
        try {
            return this.c.A03.A0M("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    public int getVersion() {
        return this.c.A03.A01.A0U() + 1;
    }

    public String toString() {
        Object r6;
        StringBuffer A0X = AnonymousClass6CA.A0X();
        String str = C162077rB.A00;
        A0X.append("  [0]         Version: ");
        A0X.append(getVersion());
        A0X.append(str);
        A0X.append("         SerialNumber: ");
        A0X.append(getSerialNumber());
        A0X.append(str);
        A0X.append("             IssuerDN: ");
        A0X.append(getIssuerDN());
        A0X.append(str);
        A0X.append("           Start Date: ");
        A0X.append(getNotBefore());
        A0X.append(str);
        A0X.append("           Final Date: ");
        A0X.append(getNotAfter());
        A0X.append(str);
        A0X.append("            SubjectDN: ");
        A0X.append(getSubjectDN());
        A0X.append(str);
        A0X.append("           Public Key: ");
        A0X.append(getPublicKey());
        A0X.append(str);
        A0X.append("  Signature Algorithm: ");
        A0X.append(this.sigAlgName);
        A0X.append(str);
        C161977qv.A02(str, A0X, getSignature());
        C176288cl r1 = this.c.A03.A08;
        if (r1 != null) {
            Enumeration elements = r1.A01.elements();
            if (elements.hasMoreElements()) {
                A0X.append("       Extensions: \n");
            }
            while (elements.hasMoreElements()) {
                C176768dX r5 = (C176768dX) elements.nextElement();
                C176548dB A0A = C176288cl.A0A(r5, r1);
                C176778dY r0 = A0A.A01;
                if (r0 != null) {
                    C140356tb A03 = C140356tb.A03(A0X, r0, A0A);
                    try {
                        if (r5.A0T(C176548dB.A06)) {
                            r6 = C176398cw.A0A(A03.A06());
                        } else if (r5.A0T(C176548dB.A0L)) {
                            C177088e3 A06 = A03.A06();
                            if (A06 != null) {
                                r6 = new C176228cf(C176068cP.A0A(A06));
                            } else {
                                r6 = null;
                            }
                        } else if (r5.A0T(C186888w6.A0R)) {
                            r6 = new C177058e0(C176068cP.A0A(A03.A06()));
                        } else if (r5.A0T(C186888w6.A0T)) {
                            r6 = new C177068e1(C176898dk.A0A(A03.A06()));
                        } else if (r5.A0T(C186888w6.A0Z)) {
                            r6 = new C177078e2(C176898dk.A0A(A03.A06()));
                        } else {
                            A0X.append(r5.A01);
                            A0X.append(" value = ");
                            A0X.append(C154577dO.A00(A03.A06()));
                            A0X.append(str);
                        }
                        A0X.append(r6);
                        A0X.append(str);
                    } catch (Exception unused) {
                        A0X.append(r5.A01);
                        A0X.append(" value = ");
                        A0X.append("*****");
                    }
                }
                A0X.append(str);
            }
        }
        return A0X.toString();
    }

    public C174008Sp(String str, C176398cw r2, C176368ct r3, C180128kX r4, byte[] bArr, boolean[] zArr) {
        this.bcHelper = r4;
        this.c = r3;
        this.basicConstraints = r2;
        this.keyUsage = zArr;
        this.sigAlgName = str;
        this.sigAlgParams = bArr;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Collection A00(java.lang.String r5, X.C176368ct r6) {
        /*
            byte[] r0 = A03(r5, r6)
            r6 = 0
            if (r0 == 0) goto L_0x0081
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x0076 }
            X.8dq r0 = X.C176958dq.A0C(r0)     // Catch:{ Exception -> 0x0076 }
            java.util.Enumeration r5 = r0.A0V()     // Catch:{ Exception -> 0x0076 }
        L_0x0013:
            boolean r0 = r5.hasMoreElements()     // Catch:{ Exception -> 0x0076 }
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = r5.nextElement()     // Catch:{ Exception -> 0x0076 }
            X.8dH r3 = X.C176608dH.A0A(r0)     // Catch:{ Exception -> 0x0076 }
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x0076 }
            int r0 = r3.A00     // Catch:{ Exception -> 0x0076 }
            X.C18270x1.A1K(r2, r0)     // Catch:{ Exception -> 0x0076 }
            switch(r0) {
                case 0: goto L_0x0053;
                case 1: goto L_0x002d;
                case 2: goto L_0x002d;
                case 3: goto L_0x0053;
                case 4: goto L_0x0046;
                case 5: goto L_0x0053;
                case 6: goto L_0x002d;
                case 7: goto L_0x0037;
                case 8: goto L_0x002e;
                default: goto L_0x002d;
            }     // Catch:{ Exception -> 0x0076 }
        L_0x002d:
            goto L_0x0058
        L_0x002e:
            X.8qL r0 = r3.A01     // Catch:{ Exception -> 0x0076 }
            X.8dX r0 = X.C176768dX.A0A(r0)     // Catch:{ Exception -> 0x0076 }
            java.lang.String r0 = r0.A01     // Catch:{ Exception -> 0x0076 }
            goto L_0x0060
        L_0x0037:
            X.8qL r0 = r3.A01     // Catch:{ Exception -> 0x0076 }
            byte[] r0 = X.C176778dY.A0C(r0)     // Catch:{ Exception -> 0x0076 }
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r0)     // Catch:{ UnknownHostException -> 0x0013 }
            java.lang.String r0 = r0.getHostAddress()     // Catch:{ UnknownHostException -> 0x0013 }
            goto L_0x0060
        L_0x0046:
            X.7kk r1 = X.C177118e6.A0l     // Catch:{ Exception -> 0x0076 }
            X.8qL r0 = r3.A01     // Catch:{ Exception -> 0x0076 }
            X.8dI r0 = X.C176618dI.A0C(r0, r1)     // Catch:{ Exception -> 0x0076 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0076 }
            goto L_0x0060
        L_0x0053:
            byte[] r0 = r3.A0L()     // Catch:{ Exception -> 0x0076 }
            goto L_0x0060
        L_0x0058:
            X.8qL r0 = r3.A01     // Catch:{ Exception -> 0x0076 }
            X.8qM r0 = (X.C183628qM) r0     // Catch:{ Exception -> 0x0076 }
            java.lang.String r0 = r0.BDM()     // Catch:{ Exception -> 0x0076 }
        L_0x0060:
            r2.add(r0)     // Catch:{ Exception -> 0x0076 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r2)     // Catch:{ Exception -> 0x0076 }
            r4.add(r0)     // Catch:{ Exception -> 0x0076 }
            goto L_0x0013
        L_0x006b:
            int r0 = r4.size()     // Catch:{ Exception -> 0x0076 }
            if (r0 == 0) goto L_0x0081
            java.util.Collection r0 = java.util.Collections.unmodifiableCollection(r4)     // Catch:{ Exception -> 0x0076 }
            return r0
        L_0x0076:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.security.cert.CertificateParsingException r0 = new java.security.cert.CertificateParsingException
            r0.<init>(r1)
            throw r0
        L_0x0081:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174008Sp.A00(java.lang.String, X.8ct):java.util.Collection");
    }

    public void checkValidity(Date date) {
        if (date.getTime() > getNotAfter().getTime()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("certificate expired on ");
            throw new CertificateExpiredException(AnonymousClass000.A0X(this.c.A03.A0A.A0N(), A0o));
        } else if (date.getTime() < getNotBefore().getTime()) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("certificate not valid till ");
            throw new CertificateNotYetValidException(AnonymousClass000.A0X(this.c.A03.A0B.A0N(), A0o2));
        }
    }

    public Set getCriticalExtensionOIDs() {
        if (getVersion() == 3) {
            HashSet A0K = AnonymousClass002.A0K();
            C176288cl r3 = this.c.A03.A08;
            if (r3 != null) {
                Enumeration elements = r3.A01.elements();
                while (elements.hasMoreElements()) {
                    C176768dX r1 = (C176768dX) elements.nextElement();
                    if (C176288cl.A0A(r1, r3).A02) {
                        A0K.add(r1.A01);
                    }
                }
                return A0K;
            }
        }
        return null;
    }

    public Set getNonCriticalExtensionOIDs() {
        if (getVersion() == 3) {
            HashSet A0K = AnonymousClass002.A0K();
            C176288cl r3 = this.c.A03.A08;
            if (r3 != null) {
                Enumeration elements = r3.A01.elements();
                while (elements.hasMoreElements()) {
                    C176768dX r1 = (C176768dX) elements.nextElement();
                    if (!C176288cl.A0A(r1, r3).A02) {
                        A0K.add(r1.A01);
                    }
                }
                return A0K;
            }
        }
        return null;
    }

    public boolean hasUnsupportedCriticalExtension() {
        C176288cl r1;
        if (getVersion() != 3 || (r1 = this.c.A03.A08) == null) {
            return false;
        }
        Enumeration elements = r1.A01.elements();
        while (elements.hasMoreElements()) {
            C177088e3 r2 = (C177088e3) elements.nextElement();
            if (!r2.A0T(C176548dB.A0L) && !r2.A0T(C176548dB.A0B) && !r2.A0T(C176548dB.A0Q) && !r2.A0T(C176548dB.A0G) && !r2.A0T(C176548dB.A08) && !r2.A0T(C176548dB.A0K) && !r2.A0T(C176548dB.A0C) && !r2.A0T(C176548dB.A0P) && !r2.A0T(C176548dB.A06) && !r2.A0T(C176548dB.A0U) && !r2.A0T(C176548dB.A0N) && C176288cl.A0A(r2, r1).A02) {
                return true;
            }
        }
        return false;
    }

    public void checkValidity() {
        checkValidity(new Date());
    }

    public final void verify(PublicKey publicKey, String str) {
        A02(publicKey, new AnonymousClass93P(1, str, this));
    }

    public final void verify(PublicKey publicKey) {
        A02(publicKey, new AnonymousClass93R(this, 1));
    }
}
