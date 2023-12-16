package X;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.92k  reason: invalid class name and case insensitive filesystem */
public class C1897292k implements TrustManager, X509TrustManager {
    public final int A00;

    public C1897292k(int i) {
        this.A00 = i;
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        int i = this.A00;
        throw new CertificateException("No client certificate verification provided");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0 = new java.security.cert.PKIXParameters(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        r0.setDate(r10);
        r0.setRevocationEnabled(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r8.validate(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        throw new java.security.cert.CertificateException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        throw new java.security.cert.CertificateException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        throw new java.security.cert.CertificateException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        if (r1 >= r2) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        r12[r1].checkValidity(r10);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r8 = java.security.cert.CertPathValidator.getInstance("PKIX");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        if (r1 >= r2) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007b, code lost:
        r7 = java.security.cert.CertificateFactory.getInstance("X.509").generateCertPath(java.util.Arrays.asList(r12));
        r6 = getAcceptedIssuers();
        r5 = r6.length;
        r4 = new java.util.HashSet(r5);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0094, code lost:
        if (r3 >= r5) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0096, code lost:
        r4.add(new java.security.cert.TrustAnchor(r6[r3], (byte[]) null));
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r0 = new java.security.cert.PKIXParameters(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a9, code lost:
        r0.setDate(r10);
        r0.setRevocationEnabled(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r8.validate(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r12[r1].checkValidity(r10);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b9, code lost:
        throw new java.security.cert.CertificateException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ba, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bb, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c1, code lost:
        throw new java.security.cert.CertificateException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c8, code lost:
        throw new java.security.cert.CertificateException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c9, code lost:
        if (r1 >= r2) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cb, code lost:
        r12[r1].checkValidity(r10);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r8 = java.security.cert.CertPathValidator.getInstance("PKIX");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d9, code lost:
        r7 = java.security.cert.CertificateFactory.getInstance("X.509").generateCertPath(java.util.Arrays.asList(r12));
        r6 = getAcceptedIssuers();
        r5 = r6.length;
        r4 = new java.util.HashSet(r5);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f2, code lost:
        if (r3 >= r5) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f4, code lost:
        r4.add(new java.security.cert.TrustAnchor(r6[r3], (byte[]) null));
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r0 = new java.security.cert.PKIXParameters(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0107, code lost:
        r0.setDate(r10);
        r0.setRevocationEnabled(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r8.validate(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0111, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0117, code lost:
        throw new java.security.cert.CertificateException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0118, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0119, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011f, code lost:
        throw new java.security.cert.CertificateException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0120, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r8 = java.security.cert.CertPathValidator.getInstance("PKIX");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0126, code lost:
        throw new java.security.cert.CertificateException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        r7 = java.security.cert.CertificateFactory.getInstance("X.509").generateCertPath(java.util.Arrays.asList(r12));
        r6 = getAcceptedIssuers();
        r5 = r6.length;
        r4 = new java.util.HashSet(r5);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        if (r3 >= r5) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        r4.add(new java.security.cert.TrustAnchor(r6[r3], (byte[]) null));
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void checkServerTrusted(java.security.cert.X509Certificate[] r12, java.lang.String r13) {
        /*
            r11 = this;
            int r0 = r11.A00
            java.util.Date r10 = new java.util.Date
            r10.<init>()
            int r2 = r12.length
            r9 = 0
            r1 = 0
            switch(r0) {
                case 0: goto L_0x00c9;
                case 1: goto L_0x006b;
                default: goto L_0x000d;
            }
        L_0x000d:
            if (r1 >= r2) goto L_0x0017
            r0 = r12[r1]
            r0.checkValidity(r10)
            int r1 = r1 + 1
            goto L_0x000d
        L_0x0017:
            java.lang.String r0 = "PKIX"
            java.security.cert.CertPathValidator r8 = java.security.cert.CertPathValidator.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0064 }
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r0)
            java.util.List r0 = java.util.Arrays.asList(r12)
            java.security.cert.CertPath r7 = r1.generateCertPath(r0)
            java.security.cert.X509Certificate[] r6 = r11.getAcceptedIssuers()
            int r5 = r6.length
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r5)
            r3 = 0
        L_0x0036:
            if (r3 >= r5) goto L_0x0046
            r2 = r6[r3]
            r1 = 0
            java.security.cert.TrustAnchor r0 = new java.security.cert.TrustAnchor
            r0.<init>(r2, r1)
            r4.add(r0)
            int r3 = r3 + 1
            goto L_0x0036
        L_0x0046:
            java.security.cert.PKIXParameters r0 = new java.security.cert.PKIXParameters     // Catch:{ InvalidAlgorithmParameterException -> 0x005d }
            r0.<init>(r4)     // Catch:{ InvalidAlgorithmParameterException -> 0x005d }
            r0.setDate(r10)
            r0.setRevocationEnabled(r9)
            r8.validate(r7, r0)     // Catch:{ InvalidAlgorithmParameterException | CertPathValidatorException -> 0x0055 }
            goto L_0x005c
        L_0x0055:
            r1 = move-exception
            java.security.cert.CertificateException r0 = new java.security.cert.CertificateException
            r0.<init>(r1)
            throw r0
        L_0x005c:
            return
        L_0x005d:
            r1 = move-exception
            java.security.cert.CertificateException r0 = new java.security.cert.CertificateException
            r0.<init>(r1)
            throw r0
        L_0x0064:
            r1 = move-exception
            java.security.cert.CertificateException r0 = new java.security.cert.CertificateException
            r0.<init>(r1)
            throw r0
        L_0x006b:
            if (r1 >= r2) goto L_0x0075
            r0 = r12[r1]
            r0.checkValidity(r10)
            int r1 = r1 + 1
            goto L_0x006b
        L_0x0075:
            java.lang.String r0 = "PKIX"
            java.security.cert.CertPathValidator r8 = java.security.cert.CertPathValidator.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x00c2 }
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r0)
            java.util.List r0 = java.util.Arrays.asList(r12)
            java.security.cert.CertPath r7 = r1.generateCertPath(r0)
            java.security.cert.X509Certificate[] r6 = r11.getAcceptedIssuers()
            int r5 = r6.length
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r5)
            r3 = 0
        L_0x0094:
            if (r3 >= r5) goto L_0x00a4
            r2 = r6[r3]
            r1 = 0
            java.security.cert.TrustAnchor r0 = new java.security.cert.TrustAnchor
            r0.<init>(r2, r1)
            r4.add(r0)
            int r3 = r3 + 1
            goto L_0x0094
        L_0x00a4:
            java.security.cert.PKIXParameters r0 = new java.security.cert.PKIXParameters     // Catch:{ InvalidAlgorithmParameterException -> 0x00bb }
            r0.<init>(r4)     // Catch:{ InvalidAlgorithmParameterException -> 0x00bb }
            r0.setDate(r10)
            r0.setRevocationEnabled(r9)
            r8.validate(r7, r0)     // Catch:{ InvalidAlgorithmParameterException | CertPathValidatorException -> 0x00b3 }
            goto L_0x00ba
        L_0x00b3:
            r1 = move-exception
            java.security.cert.CertificateException r0 = new java.security.cert.CertificateException
            r0.<init>(r1)
            throw r0
        L_0x00ba:
            return
        L_0x00bb:
            r1 = move-exception
            java.security.cert.CertificateException r0 = new java.security.cert.CertificateException
            r0.<init>(r1)
            throw r0
        L_0x00c2:
            r1 = move-exception
            java.security.cert.CertificateException r0 = new java.security.cert.CertificateException
            r0.<init>(r1)
            throw r0
        L_0x00c9:
            if (r1 >= r2) goto L_0x00d3
            r0 = r12[r1]
            r0.checkValidity(r10)
            int r1 = r1 + 1
            goto L_0x00c9
        L_0x00d3:
            java.lang.String r0 = "PKIX"
            java.security.cert.CertPathValidator r8 = java.security.cert.CertPathValidator.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0120 }
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r0)
            java.util.List r0 = java.util.Arrays.asList(r12)
            java.security.cert.CertPath r7 = r1.generateCertPath(r0)
            java.security.cert.X509Certificate[] r6 = r11.getAcceptedIssuers()
            int r5 = r6.length
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r5)
            r3 = 0
        L_0x00f2:
            if (r3 >= r5) goto L_0x0102
            r2 = r6[r3]
            r1 = 0
            java.security.cert.TrustAnchor r0 = new java.security.cert.TrustAnchor
            r0.<init>(r2, r1)
            r4.add(r0)
            int r3 = r3 + 1
            goto L_0x00f2
        L_0x0102:
            java.security.cert.PKIXParameters r0 = new java.security.cert.PKIXParameters     // Catch:{ InvalidAlgorithmParameterException -> 0x0119 }
            r0.<init>(r4)     // Catch:{ InvalidAlgorithmParameterException -> 0x0119 }
            r0.setDate(r10)
            r0.setRevocationEnabled(r9)
            r8.validate(r7, r0)     // Catch:{ InvalidAlgorithmParameterException | CertPathValidatorException -> 0x0111 }
            goto L_0x0118
        L_0x0111:
            r1 = move-exception
            java.security.cert.CertificateException r0 = new java.security.cert.CertificateException
            r0.<init>(r1)
            throw r0
        L_0x0118:
            return
        L_0x0119:
            r1 = move-exception
            java.security.cert.CertificateException r0 = new java.security.cert.CertificateException
            r0.<init>(r1)
            throw r0
        L_0x0120:
            r1 = move-exception
            java.security.cert.CertificateException r0 = new java.security.cert.CertificateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1897292k.checkServerTrusted(java.security.cert.X509Certificate[], java.lang.String):void");
    }

    public X509Certificate[] getAcceptedIssuers() {
        switch (this.A00) {
            case 0:
                return C32571r9.A01;
            case 1:
                return C73603fm.A0C;
            default:
                return C32561r8.A01;
        }
    }
}
