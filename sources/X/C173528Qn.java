package X;

import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.Extension;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.8Qn  reason: invalid class name and case insensitive filesystem */
public class C173528Qn implements C184658sJ {
    public static final Map A05;
    public String A00;
    public C149967Op A01;
    public boolean A02;
    public final C180128kX A03;
    public final C173948Sj A04;

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e2, code lost:
        if (r3 == false) goto L_0x00e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e7 A[Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ee A[Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0107 A[Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0196 A[Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0199 A[Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(java.security.cert.X509Certificate r11, X.C176348cr r12, X.C149967Op r13, X.C180128kX r14, byte[] r15) {
        /*
            java.lang.String r2 = "OCSP response failure: "
            X.8dq r0 = r12.A00     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            X.8d9 r5 = r12.A03     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            X.8qL r4 = r5.A00     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            if (r4 == 0) goto L_0x0044
            X.8cT r3 = X.C176108cT.A00     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            if (r3 == r4) goto L_0x0044
            X.8e3 r1 = r4.Bqk()     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            boolean r1 = r3.A0S(r1)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            if (r1 != 0) goto L_0x0044
            X.8dX r3 = r5.A01     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            X.8dX r1 = X.C186938wB.A0I     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            boolean r1 = r3.A0T(r1)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            if (r1 == 0) goto L_0x0044
            boolean r1 = r4 instanceof X.C176468d3     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            if (r1 == 0) goto L_0x0037
            X.8d3 r4 = (X.C176468d3) r4     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
        L_0x0028:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            X.8d9 r1 = r4.A02     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            X.8dX r3 = r1.A01     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            java.util.Map r1 = X.AnonymousClass78B.A00     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            java.lang.String r6 = X.C18310x6.A0o(r3, r1)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            goto L_0x0041
        L_0x0037:
            X.8dq r1 = X.C176958dq.A0C(r4)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            X.8d3 r4 = new X.8d3     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            r4.<init>(r1)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            goto L_0x0028
        L_0x0041:
            if (r6 != 0) goto L_0x0058
            goto L_0x0056
        L_0x0044:
            java.util.Map r4 = A05     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            X.8dX r3 = r5.A01     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            boolean r1 = r4.containsKey(r3)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            if (r1 == 0) goto L_0x0053
            java.lang.String r1 = X.C18310x6.A0o(r3, r4)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            goto L_0x0084
        L_0x0053:
            java.lang.String r1 = r3.A01     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            goto L_0x0084
        L_0x0056:
            java.lang.String r6 = r3.A01     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
        L_0x0058:
            r1 = 45
            int r4 = r6.indexOf(r1)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            if (r4 <= 0) goto L_0x007b
            java.lang.String r1 = "SHA3"
            boolean r1 = r6.startsWith(r1)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            if (r1 != 0) goto L_0x007b
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            java.lang.String r1 = X.AnonymousClass0x7.A0r(r6, r4)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            r3.append(r1)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            java.lang.String r1 = X.AnonymousClass6C9.A0c(r4, r6)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            java.lang.String r6 = X.AnonymousClass000.A0X(r1, r3)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
        L_0x007b:
            r5.append(r6)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            java.lang.String r1 = "WITHRSAANDMGF1"
            java.lang.String r1 = X.AnonymousClass000.A0X(r1, r5)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
        L_0x0084:
            X.8Qq r14 = (X.C173558Qq) r14     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            java.security.Provider r8 = r14.A00     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            java.security.Signature r6 = java.security.Signature.getInstance(r1, r8)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            java.security.cert.X509Certificate r1 = r13.A03     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            X.8d4 r5 = r12.A02     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            X.8dD r3 = r5.A03     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            X.8qL r10 = r3.A00     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            boolean r9 = r10 instanceof X.C176778dY     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            if (r9 == 0) goto L_0x00ac
            r3 = r10
            X.8dY r3 = (X.C176778dY) r3     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            byte[] r7 = r3.A00     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            if (r7 == 0) goto L_0x00ac
            java.lang.String r3 = "SHA1"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r3, r8)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            if (r11 == 0) goto L_0x00ef
            boolean r3 = A00(r4, r11, r7)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            goto L_0x00e8
        L_0x00ac:
            X.7kk r7 = X.C177128e7.A00     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            if (r9 == 0) goto L_0x00b2
            r3 = 0
            goto L_0x00b6
        L_0x00b2:
            X.8dI r3 = X.C176618dI.A0B(r10)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
        L_0x00b6:
            X.8dI r4 = X.C176618dI.A0C(r3, r7)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            if (r11 == 0) goto L_0x00cf
            javax.security.auth.x500.X500Principal r3 = r11.getSubjectX500Principal()     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            byte[] r3 = r3.getEncoded()     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            X.8dI r3 = X.C176618dI.A0C(r3, r7)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            boolean r3 = r4.equals(r3)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            if (r3 == 0) goto L_0x00cf
            goto L_0x00ea
        L_0x00cf:
            if (r1 == 0) goto L_0x00e4
            javax.security.auth.x500.X500Principal r3 = r1.getSubjectX500Principal()     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            byte[] r3 = r3.getEncoded()     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            X.8dI r3 = X.C176618dI.A0C(r3, r7)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            boolean r3 = r4.equals(r3)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
        L_0x00e1:
            r11 = r1
            if (r3 != 0) goto L_0x00ea
        L_0x00e4:
            r11 = 0
            if (r0 != 0) goto L_0x00ea
            goto L_0x00f6
        L_0x00e8:
            if (r3 == 0) goto L_0x00ef
        L_0x00ea:
            r4 = 0
            r3 = 0
            if (r11 == 0) goto L_0x0107
            goto L_0x00ff
        L_0x00ef:
            if (r1 == 0) goto L_0x00e4
            boolean r3 = A00(r4, r1, r7)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            goto L_0x00e1
        L_0x00f6:
            java.lang.String r0 = "OCSP responder certificate not found"
            java.security.cert.CertPathValidatorException r1 = new java.security.cert.CertPathValidatorException     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            r1.<init>(r0)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            goto L_0x01c0
        L_0x00ff:
            java.security.PublicKey r0 = r11.getPublicKey()     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            r6.initVerify(r0)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            goto L_0x0181
        L_0x0107:
            java.lang.String r7 = "X.509"
            java.security.cert.CertificateFactory r7 = java.security.cert.CertificateFactory.getInstance(r7, r8)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            X.8qL r0 = r0.A0W(r4)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            X.8e3 r0 = r0.Bqk()     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            byte[] r0 = r0.A0L()     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            java.io.ByteArrayInputStream r0 = X.AnonymousClass0x9.A0d(r0)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            java.security.cert.Certificate r7 = r7.generateCertificate(r0)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            java.security.PublicKey r0 = r1.getPublicKey()     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            r7.verify(r0)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            java.util.Date r0 = r13.A04     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            long r0 = r0.getTime()     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            java.util.Date r11 = new java.util.Date     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            r11.<init>(r0)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            r7.checkValidity(r11)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            if (r9 == 0) goto L_0x014c
            r0 = r10
            X.8dY r0 = (X.C176778dY) r0     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            byte[] r1 = r0.A00     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            if (r1 == 0) goto L_0x014c
            java.lang.String r0 = "SHA1"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0, r8)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            boolean r0 = A00(r0, r7, r1)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            goto L_0x016a
        L_0x014c:
            X.7kk r8 = X.C177128e7.A00     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            if (r9 == 0) goto L_0x0152
            r0 = 0
            goto L_0x0156
        L_0x0152:
            X.8dI r0 = X.C176618dI.A0B(r10)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
        L_0x0156:
            X.8dI r1 = X.C176618dI.A0C(r0, r8)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            javax.security.auth.x500.X500Principal r0 = r7.getSubjectX500Principal()     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            byte[] r0 = r0.getEncoded()     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            X.8dI r0 = X.C176618dI.A0C(r0, r8)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            boolean r0 = r1.equals(r0)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
        L_0x016a:
            if (r0 == 0) goto L_0x01a1
            java.util.List r1 = r7.getExtendedKeyUsage()     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            if (r1 == 0) goto L_0x019a
            X.8cv r0 = X.C176388cv.A03     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            X.8dX r0 = r0.A00     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            java.lang.String r0 = r0.A01     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            boolean r0 = r1.contains(r0)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            if (r0 == 0) goto L_0x019a
            r6.initVerify(r7)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
        L_0x0181:
            java.lang.String r0 = "DER"
            byte[] r0 = r5.A0M(r0)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            r6.update(r0)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            X.8cP r0 = r12.A01     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            byte[] r0 = r0.A0U()     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            boolean r0 = r6.verify(r0)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            if (r0 == 0) goto L_0x0199
            if (r15 == 0) goto L_0x01c1
            goto L_0x01a8
        L_0x0199:
            return r4
        L_0x019a:
            java.lang.String r0 = "responder certificate not valid for signing OCSP responses"
            java.security.cert.CertPathValidatorException r1 = X.C149967Op.A00(r0, r3, r13)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            goto L_0x01c0
        L_0x01a1:
            java.lang.String r0 = "responder certificate does not match responderID"
            java.security.cert.CertPathValidatorException r1 = X.C149967Op.A00(r0, r3, r13)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            goto L_0x01c0
        L_0x01a8:
            X.8cl r1 = r5.A04     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            X.8dX r0 = X.C186778vv.A06     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            X.8dB r0 = X.C176288cl.A0A(r0, r1)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            X.8dY r0 = r0.A01     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            byte[] r0 = r0.A00     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            boolean r0 = java.util.Arrays.equals(r15, r0)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
            if (r0 != 0) goto L_0x01c1
            java.lang.String r0 = "nonce mismatch in OCSP response"
            java.security.cert.CertPathValidatorException r1 = X.C149967Op.A00(r0, r3, r13)     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
        L_0x01c0:
            throw r1     // Catch:{ CertPathValidatorException -> 0x01df, GeneralSecurityException -> 0x01d1, IOException -> 0x01c3 }
        L_0x01c1:
            r0 = 1
            return r0
        L_0x01c3:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r0 = X.AnonymousClass000.A0a(r2, r0, r1)
            java.security.cert.CertPathValidatorException r0 = X.C149967Op.A00(r0, r1, r13)
            throw r0
        L_0x01d1:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r0 = X.AnonymousClass000.A0a(r2, r0, r1)
            java.security.cert.CertPathValidatorException r0 = X.C149967Op.A00(r0, r1, r13)
            throw r0
        L_0x01df:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173528Qn.A01(java.security.cert.X509Certificate, X.8cr, X.7Op, X.8kX, byte[]):boolean");
    }

    public final C176358cs A02(C176748dV r6, C176528d9 r7, C176368ct r8) {
        try {
            C180128kX r3 = this.A03;
            C176768dX r2 = r7.A01;
            String A0o = C18310x6.A0o(r2, AnonymousClass78B.A00);
            if (A0o == null) {
                A0o = r2.A01;
            }
            MessageDigest instance = MessageDigest.getInstance(A0o, ((C173558Qq) r3).A00);
            C176378cu r32 = r8.A03;
            return new C176358cs(r6, new C176648dL(instance.digest(r32.A06.A0M("DER"))), new C176648dL(instance.digest(r32.A09.A00.A0U())), r7);
        } catch (Exception e) {
            throw new CertPathValidatorException(AnonymousClass000.A0P(e, "problem creating ID: ", AnonymousClass001.A0o()), e);
        }
    }

    public final C176368ct A03() {
        try {
            return C176368ct.A0A(this.A01.A03.getEncoded());
        } catch (Exception e) {
            throw C149967Op.A00(AnonymousClass000.A0a("cannot process signing cert: ", AnonymousClass001.A0o(), e), e, this.A01);
        }
    }

    public void BGC(C149967Op r2) {
        this.A01 = r2;
        this.A02 = C159797mT.A01("ocsp.enable");
        this.A00 = C159797mT.A00("ocsp.responderURL");
    }

    public void check(Certificate certificate) {
        boolean z;
        byte[] bArr;
        C176148cX r7;
        C176348cr r72;
        C176178ca r6;
        Throwable A002;
        C176158cY r5;
        C176208cd r2;
        X509Certificate x509Certificate = (X509Certificate) certificate;
        C173948Sj r1 = this.A04;
        Map<X509Certificate, byte[]> ocspResponses = r1.getOcspResponses();
        URI ocspResponder = r1.getOcspResponder();
        if (ocspResponder == null) {
            String str = this.A00;
            if (str != null) {
                try {
                    ocspResponder = new URI(str);
                } catch (URISyntaxException e) {
                    throw C149967Op.A00(AnonymousClass000.A0a("configuration error: ", AnonymousClass001.A0o(), e), e, this.A01);
                }
            } else {
                byte[] extensionValue = x509Certificate.getExtensionValue(C176548dB.A04.A01);
                ocspResponder = null;
                if (extensionValue != null) {
                    byte[] A0C = C176778dY.A0C(extensionValue);
                    if (A0C instanceof C176208cd) {
                        r2 = (C176208cd) A0C;
                    } else if (A0C != null) {
                        r2 = new C176208cd(C176958dq.A0C(A0C));
                    } else {
                        r2 = null;
                    }
                    C176408cx[] r22 = r2.A00;
                    int length = r22.length;
                    C176408cx[] r8 = new C176408cx[length];
                    System.arraycopy(r22, 0, r8, 0, length);
                    int i = 0;
                    while (true) {
                        if (i == length) {
                            break;
                        }
                        C176408cx r4 = r8[i];
                        if (C176408cx.A03.A0T(r4.A00)) {
                            C176608dH r42 = r4.A01;
                            if (r42.A00 == 6) {
                                try {
                                    ocspResponder = new URI(((C183628qM) r42.A01).BDM());
                                    break;
                                } catch (URISyntaxException unused) {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                        i++;
                    }
                }
            }
        }
        if (ocspResponses.get(x509Certificate) != null || ocspResponder == null) {
            List<Extension> ocspExtensions = r1.getOcspExtensions();
            bArr = null;
            for (int i2 = 0; i2 != ocspExtensions.size(); i2++) {
                Extension extension = ocspExtensions.get(i2);
                byte[] value = extension.getValue();
                if ("1.3.6.1.5.5.7.48.1.2".equals(extension.getId())) {
                    bArr = value;
                }
            }
            z = false;
        } else if (this.A00 == null && r1.getOcspResponder() == null && !this.A02) {
            C149967Op r0 = this.A01;
            throw new C173898Sc("OCSP disabled by \"ocsp.enable\" setting", r0.A02, r0.A00);
        } else {
            try {
                ocspResponses.put(x509Certificate, C155237eX.A00(ocspResponder, r1.getOcspResponderCert(), r1.getOcspExtensions(), A02(new C176748dV(x509Certificate.getSerialNumber()), new C176528d9(C186788vw.A07), A03()), this.A01, this.A03).A0L());
                bArr = null;
                z = true;
            } catch (IOException e2) {
                C149967Op r02 = this.A01;
                throw new CertPathValidatorException("unable to encode OCSP response", e2, r02.A02, r02.A00);
            }
        }
        if (!ocspResponses.isEmpty()) {
            byte[] bArr2 = ocspResponses.get(x509Certificate);
            if (bArr2 instanceof C176148cX) {
                r7 = (C176148cX) bArr2;
            } else if (bArr2 != null) {
                r7 = new C176148cX(C176958dq.A0C(bArr2));
            } else {
                r7 = null;
            }
            C176748dV r82 = new C176748dV(x509Certificate.getSerialNumber());
            if (r7 != null) {
                C176728dT r62 = r7.A00.A00;
                if (r62.A0U() == 0) {
                    C176278ck r73 = r7.A01;
                    if (r73 == null) {
                        r73 = null;
                    }
                    if (r73.A00.A0T(C186778vv.A02)) {
                        try {
                            byte[] bArr3 = r73.A01.A00;
                            if (bArr3 instanceof C176348cr) {
                                r72 = (C176348cr) bArr3;
                            } else if (bArr3 != null) {
                                r72 = new C176348cr(C176958dq.A0C(bArr3));
                            } else {
                                r72 = null;
                            }
                            if (!z) {
                                if (!A01(r1.getOcspResponderCert(), r72, this.A01, this.A03, bArr)) {
                                    return;
                                }
                            }
                            C176478d4 r03 = r72.A02;
                            if (r03 == null) {
                                r03 = null;
                            }
                            C176958dq r74 = r03.A02;
                            C176358cs r10 = null;
                            for (int i3 = 0; i3 != r74.A0U(); i3++) {
                                C183618qL A0W = r74.A0W(i3);
                                if (A0W instanceof C176178ca) {
                                    r6 = (C176178ca) A0W;
                                } else if (A0W != null) {
                                    r6 = new C176178ca(C176958dq.A0C(A0W));
                                } else {
                                    r6 = null;
                                }
                                C176358cs r9 = r6.A02;
                                if (r82.A0T(r9.A00)) {
                                    C176758dW r12 = r6.A00;
                                    if (r12 == null || !new Date(this.A01.A04.getTime()).after(r12.A0W())) {
                                        if (r10 == null || !r10.A03.equals(r9.A03)) {
                                            r10 = A02(r82, r9.A03, A03());
                                        }
                                        if (r10.equals(r9)) {
                                            C176578dE r13 = r6.A03;
                                            int i4 = r13.A00;
                                            if (i4 == 0) {
                                                return;
                                            }
                                            if (i4 == 1) {
                                                C183618qL r52 = r13.A01;
                                                if (r52 instanceof C176158cY) {
                                                    r5 = (C176158cY) r52;
                                                } else if (r52 != null) {
                                                    r5 = new C176158cY(C176958dq.A0C(r52));
                                                } else {
                                                    r5 = null;
                                                }
                                                C176488d5 r23 = r5.A01;
                                                StringBuilder A0o = AnonymousClass001.A0o();
                                                A0o.append("certificate revoked, reason=(");
                                                A0o.append(r23);
                                                A0o.append("), date=");
                                                A002 = C149967Op.A00(AnonymousClass000.A0R(r5.A00.A0W(), A0o), (Throwable) null, this.A01);
                                            } else {
                                                A002 = C149967Op.A00("certificate revoked, details unknown", (Throwable) null, this.A01);
                                            }
                                        }
                                    } else {
                                        A002 = new C173908Sd();
                                    }
                                    throw A002;
                                }
                            }
                        } catch (CertPathValidatorException e3) {
                            throw e3;
                        } catch (Exception e4) {
                            C149967Op r04 = this.A01;
                            throw new CertPathValidatorException("unable to process OCSP response", e4, r04.A02, r04.A00);
                        }
                    }
                } else {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("OCSP response failed: ");
                    throw C149967Op.A00(AnonymousClass000.A0R(new BigInteger(r62.A01), A0o2), (Throwable) null, this.A01);
                }
            } else {
                C149967Op r05 = this.A01;
                throw new C173898Sc("no OCSP response found for certificate", r05.A02, r05.A00);
            }
        } else {
            C149967Op r06 = this.A01;
            throw new C173898Sc("no OCSP response found for any certificate", r06.A02, r06.A00);
        }
    }

    static {
        HashMap A0t = AnonymousClass001.A0t();
        A05 = A0t;
        A0t.put(C176768dX.A0B("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        A0t.put(C186938wB.A2D, "SHA224WITHRSA");
        A0t.put(C186938wB.A2E, "SHA256WITHRSA");
        AnonymousClass6C7.A1C(C186938wB.A2F, A0t);
        AnonymousClass8Q0.A05(C186838w1.A0G, A0t);
    }

    public C173528Qn(C180128kX r1, C173948Sj r2) {
        this.A04 = r2;
        this.A03 = r1;
    }

    public static boolean A00(MessageDigest messageDigest, Certificate certificate, byte[] bArr) {
        return Arrays.equals(bArr, messageDigest.digest(C176318co.A0A(certificate.getPublicKey().getEncoded()).A00.A0U()));
    }
}
