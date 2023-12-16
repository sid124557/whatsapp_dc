package X;

import java.security.PublicKey;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.util.Date;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.8ee  reason: invalid class name and case insensitive filesystem */
public class C177458ee extends C174008Sp implements C180138kY {
    public C180138kY attrCarrier;
    public final Object cacheLock;
    public volatile int hashValue;
    public volatile boolean hashValueSet;
    public C177448ed internalCertificateValue;
    public X500Principal issuerValue;
    public PublicKey publicKeyValue;
    public X500Principal subjectValue;
    public long[] validityValues;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C177458ee(X.C176368ct r12, X.C180128kX r13) {
        /*
            r11 = this;
            java.lang.String r0 = "2.5.29.19"
            r7 = r12
            byte[] r0 = X.C174008Sp.A03(r0, r12)     // Catch:{ Exception -> 0x00a3 }
            if (r0 != 0) goto L_0x000b
            r6 = 0
            goto L_0x0013
        L_0x000b:
            X.8e3 r0 = X.C177088e3.A0I(r0)     // Catch:{ Exception -> 0x00a3 }
            X.8cw r6 = X.C176398cw.A0A(r0)     // Catch:{ Exception -> 0x00a3 }
        L_0x0013:
            java.lang.String r0 = "2.5.29.15"
            byte[] r0 = X.C174008Sp.A03(r0, r12)     // Catch:{ Exception -> 0x0092 }
            if (r0 != 0) goto L_0x001d
            r10 = 0
            goto L_0x004c
        L_0x001d:
            X.8e3 r0 = X.C177088e3.A0I(r0)     // Catch:{ Exception -> 0x0092 }
            X.8cP r1 = X.C176068cP.A0A(r0)     // Catch:{ Exception -> 0x0092 }
            byte[] r5 = r1.A0U()     // Catch:{ Exception -> 0x0092 }
            int r0 = r5.length     // Catch:{ Exception -> 0x0092 }
            int r4 = r0 * 8
            int r0 = r1.A00     // Catch:{ Exception -> 0x0092 }
            int r4 = r4 - r0
            r0 = 9
            if (r4 < r0) goto L_0x0034
            r0 = r4
        L_0x0034:
            boolean[] r10 = new boolean[r0]     // Catch:{ Exception -> 0x0092 }
            r3 = 0
        L_0x0037:
            if (r3 == r4) goto L_0x004c
            int r0 = r3 / 8
            byte r2 = r5[r0]     // Catch:{ Exception -> 0x0092 }
            int r1 = r3 % 8
            r0 = 128(0x80, float:1.794E-43)
            int r0 = r0 >>> r1
            r2 = r2 & r0
            boolean r0 = X.AnonymousClass000.A1S(r2)
            r10[r3] = r0     // Catch:{ Exception -> 0x0092 }
            int r3 = r3 + 1
            goto L_0x0037
        L_0x004c:
            X.8d9 r0 = r12.A02     // Catch:{ Exception -> 0x0081 }
            java.lang.String r5 = X.C161977qv.A01(r0)     // Catch:{ Exception -> 0x0081 }
            X.8qL r0 = r0.A00     // Catch:{ Exception -> 0x0070 }
            if (r0 != 0) goto L_0x0057
            goto L_0x005c
        L_0x0057:
            byte[] r9 = X.AnonymousClass8Q0.A09(r0)     // Catch:{ Exception -> 0x0070 }
            goto L_0x005d
        L_0x005c:
            r9 = 0
        L_0x005d:
            r4 = r11
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = X.AnonymousClass002.A0D()
            r11.cacheLock = r0
            X.8Qr r0 = new X.8Qr
            r0.<init>()
            r11.attrCarrier = r0
            return
        L_0x0070:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "cannot construct SigAlgParams: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r2, r0, r1)
            java.security.cert.CertificateParsingException r0 = new java.security.cert.CertificateParsingException
            r0.<init>(r1)
            throw r0
        L_0x0081:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "cannot construct SigAlgName: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r2, r0, r1)
            java.security.cert.CertificateParsingException r0 = new java.security.cert.CertificateParsingException
            r0.<init>(r1)
            throw r0
        L_0x0092:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "cannot construct KeyUsage: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r2, r0, r1)
            java.security.cert.CertificateParsingException r0 = new java.security.cert.CertificateParsingException
            r0.<init>(r1)
            throw r0
        L_0x00a3:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "cannot construct BasicConstraints: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r2, r0, r1)
            java.security.cert.CertificateParsingException r0 = new java.security.cert.CertificateParsingException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177458ee.<init>(X.8ct, X.8kX):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000f, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r8 = getEncoded();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C177448ed A00() {
        /*
            r10 = this;
            java.lang.Object r1 = r10.cacheLock
            monitor-enter(r1)
            X.8ed r0 = r10.internalCertificateValue     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            return r0
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            byte[] r8 = r10.getEncoded()     // Catch:{ CertificateEncodingException -> 0x000f }
            goto L_0x0010
        L_0x000f:
            r8 = 0
        L_0x0010:
            X.8kX r6 = r10.bcHelper
            X.8ct r5 = r10.c
            X.8cw r4 = r10.basicConstraints
            boolean[] r9 = r10.keyUsage
            java.lang.String r3 = r10.sigAlgName
            byte[] r7 = r10.sigAlgParams
            X.8ed r2 = new X.8ed
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r1 = r10.cacheLock
            monitor-enter(r1)
            X.8ed r0 = r10.internalCertificateValue     // Catch:{ all -> 0x002d }
            if (r0 != 0) goto L_0x002b
            r10.internalCertificateValue = r2     // Catch:{ all -> 0x002d }
            r0 = r2
        L_0x002b:
            monitor-exit(r1)     // Catch:{ all -> 0x002d }
            return r0
        L_0x002d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002d }
            throw r0
        L_0x0030:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177458ee.A00():X.8ed");
    }

    public boolean equals(Object obj) {
        C176068cP r1;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C177458ee) {
            C177458ee r3 = (C177458ee) obj;
            if (!this.hashValueSet || !r3.hashValueSet) {
                if ((this.internalCertificateValue == null || r3.internalCertificateValue == null) && (r1 = this.c.A01) != null && !r1.A0T(r3.c.A01)) {
                    return false;
                }
            } else if (this.hashValue != r3.hashValue) {
                return false;
            }
        }
        return A00().equals(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0 = r3.issuerValue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0015, code lost:
        r3.issuerValue = r2;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0019, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
        r2 = super.getIssuerX500Principal();
        r1 = r3.cacheLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        monitor-enter(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public javax.security.auth.x500.X500Principal getIssuerX500Principal() {
        /*
            r3 = this;
            java.lang.Object r1 = r3.cacheLock
            monitor-enter(r1)
            javax.security.auth.x500.X500Principal r0 = r3.issuerValue     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            return r0
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            javax.security.auth.x500.X500Principal r2 = super.getIssuerX500Principal()
            java.lang.Object r1 = r3.cacheLock
            monitor-enter(r1)
            javax.security.auth.x500.X500Principal r0 = r3.issuerValue     // Catch:{ all -> 0x001a }
            if (r0 != 0) goto L_0x0018
            r3.issuerValue = r2     // Catch:{ all -> 0x001a }
            r0 = r2
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            return r0
        L_0x001a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r0
        L_0x001d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177458ee.getIssuerX500Principal():javax.security.auth.x500.X500Principal");
    }

    public PublicKey getPublicKey() {
        synchronized (this.cacheLock) {
            PublicKey publicKey = this.publicKeyValue;
            if (publicKey != null) {
                return publicKey;
            }
            super.getPublicKey();
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0 = r3.subjectValue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0015, code lost:
        r3.subjectValue = r2;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0019, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
        r2 = super.getSubjectX500Principal();
        r1 = r3.cacheLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        monitor-enter(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public javax.security.auth.x500.X500Principal getSubjectX500Principal() {
        /*
            r3 = this;
            java.lang.Object r1 = r3.cacheLock
            monitor-enter(r1)
            javax.security.auth.x500.X500Principal r0 = r3.subjectValue     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            return r0
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            javax.security.auth.x500.X500Principal r2 = super.getSubjectX500Principal()
            java.lang.Object r1 = r3.cacheLock
            monitor-enter(r1)
            javax.security.auth.x500.X500Principal r0 = r3.subjectValue     // Catch:{ all -> 0x001a }
            if (r0 != 0) goto L_0x0018
            r3.subjectValue = r2     // Catch:{ all -> 0x001a }
            r0 = r2
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            return r0
        L_0x001a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r0
        L_0x001d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177458ee.getSubjectX500Principal():javax.security.auth.x500.X500Principal");
    }

    public int hashCode() {
        if (!this.hashValueSet) {
            this.hashValue = A00().hashCode();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }

    public void checkValidity(Date date) {
        long[] jArr;
        long time = date.getTime();
        synchronized (this.cacheLock) {
            jArr = this.validityValues;
            if (jArr == null) {
                long[] jArr2 = {super.getNotBefore().getTime(), super.getNotAfter().getTime()};
                synchronized (this.cacheLock) {
                    jArr = this.validityValues;
                    if (jArr == null) {
                        this.validityValues = jArr2;
                        jArr = jArr2;
                    }
                }
            }
        }
        if (time > jArr[1]) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("certificate expired on ");
            throw new CertificateExpiredException(AnonymousClass000.A0X(this.c.A03.A0A.A0N(), A0o));
        } else if (time < jArr[0]) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("certificate not valid till ");
            throw new CertificateNotYetValidException(AnonymousClass000.A0X(this.c.A03.A0B.A0N(), A0o2));
        }
    }
}
