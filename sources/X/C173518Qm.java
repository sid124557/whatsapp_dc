package X;

import java.util.Date;

/* renamed from: X.8Qm  reason: invalid class name and case insensitive filesystem */
public class C173518Qm implements C184658sJ {
    public Date A00 = null;
    public C149967Op A01;
    public final C180128kX A02;

    public void BGC(C149967Op r2) {
        this.A01 = r2;
        this.A00 = new Date();
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0182 A[Catch:{ 6zA -> 0x01ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0172 A[Catch:{ 6zA -> 0x01ec }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void check(java.security.cert.Certificate r31) {
        /*
            r30 = this;
            r11 = r31
            r10 = r30
            X.7Op r9 = r10.A01     // Catch:{ 6zA -> 0x01ec }
            X.8N7 r8 = r9.A05     // Catch:{ 6zA -> 0x01ec }
            java.util.Date r0 = r10.A00     // Catch:{ 6zA -> 0x01ec }
            r21 = r0
            java.util.Date r0 = r9.A04     // Catch:{ 6zA -> 0x01ec }
            long r0 = r0.getTime()     // Catch:{ 6zA -> 0x01ec }
            java.util.Date r7 = new java.util.Date     // Catch:{ 6zA -> 0x01ec }
            r7.<init>(r0)     // Catch:{ 6zA -> 0x01ec }
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11     // Catch:{ 6zA -> 0x01ec }
            X.7Op r1 = r10.A01     // Catch:{ 6zA -> 0x01ec }
            java.security.cert.X509Certificate r0 = r1.A03     // Catch:{ 6zA -> 0x01ec }
            r20 = r0
            java.security.PublicKey r0 = r1.A01     // Catch:{ 6zA -> 0x01ec }
            r18 = r0
            java.security.cert.CertPath r0 = r1.A02     // Catch:{ 6zA -> 0x01ec }
            java.util.List r23 = r0.getCertificates()     // Catch:{ 6zA -> 0x01ec }
            X.8kX r0 = r10.A02     // Catch:{ 6zA -> 0x01ec }
            r17 = r0
            java.lang.String r0 = X.AnonymousClass7sA.A04     // Catch:{ Exception -> 0x01dd }
            X.8e3 r0 = X.C162357rn.A05(r0, r11)     // Catch:{ Exception -> 0x01dd }
            X.8cy r16 = X.C176418cy.A0A(r0)     // Catch:{ Exception -> 0x01dd }
            X.7ha r14 = new X.7ha     // Catch:{ 6zA -> 0x01ec }
            r14.<init>((X.AnonymousClass8N7) r8)     // Catch:{ 6zA -> 0x01ec }
            java.util.Map r3 = r8.A06     // Catch:{ 6zA -> 0x01d5 }
            if (r16 != 0) goto L_0x0056
            java.util.List r13 = java.util.Collections.EMPTY_LIST     // Catch:{ 6zA -> 0x01d5 }
        L_0x0042:
            java.util.Iterator r2 = r13.iterator()     // Catch:{ 6zA -> 0x01d5 }
        L_0x0046:
            boolean r0 = r2.hasNext()     // Catch:{ 6zA -> 0x01d5 }
            if (r0 == 0) goto L_0x00da
            java.lang.Object r1 = r2.next()     // Catch:{ 6zA -> 0x01d5 }
            java.util.List r0 = r14.A01     // Catch:{ 6zA -> 0x01d5 }
            r0.add(r1)     // Catch:{ 6zA -> 0x01d5 }
            goto L_0x0046
        L_0x0056:
            X.8d6[] r12 = r16.A0N()     // Catch:{ Exception -> 0x01bd }
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()     // Catch:{ 6zA -> 0x01d5 }
            r2 = 0
        L_0x005f:
            int r6 = r12.length     // Catch:{ 6zA -> 0x01d5 }
            if (r2 >= r6) goto L_0x0087
            r0 = r12[r2]     // Catch:{ 6zA -> 0x01d5 }
            X.8dF r1 = r0.A00     // Catch:{ 6zA -> 0x01d5 }
            if (r1 == 0) goto L_0x0084
            int r0 = r1.A00     // Catch:{ 6zA -> 0x01d5 }
            if (r0 != 0) goto L_0x0084
            X.8qL r0 = r1.A01     // Catch:{ 6zA -> 0x01d5 }
            X.8dH[] r4 = X.C176518d8.A0A(r0)     // Catch:{ 6zA -> 0x01d5 }
            r1 = 0
        L_0x0073:
            int r0 = r4.length     // Catch:{ 6zA -> 0x01d5 }
            if (r1 >= r0) goto L_0x0084
            r0 = r4[r1]     // Catch:{ 6zA -> 0x01d5 }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ 6zA -> 0x01d5 }
            if (r0 == 0) goto L_0x0081
            r13.add(r0)     // Catch:{ 6zA -> 0x01d5 }
        L_0x0081:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x0084:
            int r2 = r2 + 1
            goto L_0x005f
        L_0x0087:
            boolean r0 = r13.isEmpty()     // Catch:{ 6zA -> 0x01d5 }
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = "org.spongycastle.x509.enableCRLDP"
            boolean r0 = X.C159797mT.A01(r0)     // Catch:{ 6zA -> 0x01d5 }
            if (r0 == 0) goto L_0x0042
            java.lang.String r1 = "X.509"
            r0 = r17
            X.8Qq r0 = (X.C173558Qq) r0     // Catch:{ Exception -> 0x01c5 }
            java.security.Provider r0 = r0.A00     // Catch:{ Exception -> 0x01c5 }
            java.security.cert.CertificateFactory r15 = java.security.cert.CertificateFactory.getInstance(r1, r0)     // Catch:{ Exception -> 0x01c5 }
            r5 = 0
        L_0x00a2:
            if (r5 >= r6) goto L_0x0042
            r0 = r12[r5]     // Catch:{ 6zA -> 0x01d5 }
            X.8dF r1 = r0.A00     // Catch:{ 6zA -> 0x01d5 }
            if (r1 == 0) goto L_0x00d7
            int r0 = r1.A00     // Catch:{ 6zA -> 0x01d5 }
            if (r0 != 0) goto L_0x00d7
            X.8qL r0 = r1.A01     // Catch:{ 6zA -> 0x01d5 }
            X.8dH[] r4 = X.C176518d8.A0A(r0)     // Catch:{ 6zA -> 0x01d5 }
            r3 = 0
        L_0x00b5:
            int r0 = r4.length     // Catch:{ 6zA -> 0x01d5 }
            if (r3 >= r0) goto L_0x00d7
            r2 = r4[r5]     // Catch:{ 6zA -> 0x01d5 }
            int r1 = r2.A00     // Catch:{ 6zA -> 0x01d5 }
            r0 = 6
            if (r1 != r0) goto L_0x00d4
            X.8qL r0 = r2.A01     // Catch:{ Exception -> 0x00d4 }
            X.8qM r0 = (X.C183628qM) r0     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r1 = r0.BDM()     // Catch:{ Exception -> 0x00d4 }
            java.net.URI r0 = new java.net.URI     // Catch:{ Exception -> 0x00d4 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00d4 }
            X.8Qz r0 = X.C161137p4.A01(r0, r15, r7)     // Catch:{ Exception -> 0x00d4 }
            r13.add(r0)     // Catch:{ Exception -> 0x00d4 }
            goto L_0x00d7
        L_0x00d4:
            int r3 = r3 + 1
            goto L_0x00b5
        L_0x00d7:
            int r5 = r5 + 1
            goto L_0x00a2
        L_0x00da:
            X.7Ih r3 = new X.7Ih     // Catch:{ 6zA -> 0x01ec }
            r3.<init>()     // Catch:{ 6zA -> 0x01ec }
            r0 = 0
            X.7pK r2 = new X.7pK     // Catch:{ 6zA -> 0x01ec }
            r2.<init>((int) r0)     // Catch:{ 6zA -> 0x01ec }
            X.8N7 r6 = new X.8N7     // Catch:{ 6zA -> 0x01ec }
            r6.<init>(r14)     // Catch:{ 6zA -> 0x01ec }
            r4 = 11
            r5 = 0
            if (r16 == 0) goto L_0x0126
            X.8d6[] r12 = r16.A0N()     // Catch:{ Exception -> 0x011d }
            r1 = 0
            r14 = 0
        L_0x00f5:
            int r0 = r12.length     // Catch:{ 6zA -> 0x01ec }
            if (r1 >= r0) goto L_0x0127
            int r0 = r3.A00     // Catch:{ 6zA -> 0x01ec }
            if (r0 != r4) goto L_0x0127
            int r13 = r2.A00     // Catch:{ 6zA -> 0x01ec }
            X.7pK r0 = X.C161267pK.A01     // Catch:{ 6zA -> 0x01ec }
            int r0 = r0.A00     // Catch:{ 6zA -> 0x01ec }
            if (r13 == r0) goto L_0x0127
            r24 = r12[r1]     // Catch:{ 6zA -> 0x0119 }
            r22 = r7
            r25 = r9
            r26 = r6
            r27 = r17
            r28 = r3
            r29 = r2
            r19 = r11
            X.AnonymousClass7sA.A0B(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ 6zA -> 0x0119 }
            r14 = 1
            goto L_0x011a
        L_0x0119:
            r5 = move-exception
        L_0x011a:
            int r1 = r1 + 1
            goto L_0x00f5
        L_0x011d:
            r1 = move-exception
            java.lang.String r0 = "Distribution points could not be read."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x01ec }
            goto L_0x01eb
        L_0x0126:
            r14 = 0
        L_0x0127:
            int r0 = r3.A00     // Catch:{ 6zA -> 0x01ec }
            if (r0 != r4) goto L_0x0169
            int r1 = r2.A00     // Catch:{ 6zA -> 0x01ec }
            X.7pK r0 = X.C161267pK.A01     // Catch:{ 6zA -> 0x01ec }
            int r0 = r0.A00     // Catch:{ 6zA -> 0x01ec }
            if (r1 == r0) goto L_0x0169
            X.8dI r5 = X.C160997on.A01(r11)     // Catch:{ RuntimeException -> 0x0160 }
            r0 = 4
            X.8dH r1 = new X.8dH     // Catch:{ 6zA -> 0x0168 }
            r1.<init>(r5, r0)     // Catch:{ 6zA -> 0x0168 }
            X.8d8 r0 = new X.8d8     // Catch:{ 6zA -> 0x0168 }
            r0.<init>((X.C176608dH) r1)     // Catch:{ 6zA -> 0x0168 }
            X.8dF r1 = new X.8dF     // Catch:{ 6zA -> 0x0168 }
            r1.<init>((X.C183618qL) r0)     // Catch:{ 6zA -> 0x0168 }
            X.8d6 r0 = new X.8d6     // Catch:{ 6zA -> 0x0168 }
            r0.<init>((X.C176588dF) r1)     // Catch:{ 6zA -> 0x0168 }
            r22 = r7
            r24 = r0
            r25 = r9
            r26 = r8
            r27 = r17
            r28 = r3
            r29 = r2
            r19 = r11
            X.AnonymousClass7sA.A0B(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ 6zA -> 0x0168 }
            goto L_0x016e
        L_0x0160:
            r1 = move-exception
            java.lang.String r0 = "Issuer from certificate for CRL could not be reencoded."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x0168 }
            throw r0     // Catch:{ 6zA -> 0x0168 }
        L_0x0168:
            r5 = move-exception
        L_0x0169:
            if (r14 != 0) goto L_0x016e
            if (r5 != 0) goto L_0x0181
            goto L_0x01e5
        L_0x016e:
            int r0 = r3.A00     // Catch:{ 6zA -> 0x01ec }
            if (r0 != r4) goto L_0x0182
            int r1 = r2.A00     // Catch:{ 6zA -> 0x01ec }
            X.7pK r0 = X.C161267pK.A01     // Catch:{ 6zA -> 0x01ec }
            int r0 = r0.A00     // Catch:{ 6zA -> 0x01ec }
            if (r1 != r0) goto L_0x017b
            return
        L_0x017b:
            java.lang.String r0 = "Certificate status could not be determined."
            X.6zA r5 = X.C143596zA.A00(r0)     // Catch:{ 6zA -> 0x01ec }
        L_0x0181:
            throw r5     // Catch:{ 6zA -> 0x01ec }
        L_0x0182:
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss Z"
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ 6zA -> 0x01ec }
            r2.<init>(r0)     // Catch:{ 6zA -> 0x01ec }
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)     // Catch:{ 6zA -> 0x01ec }
            r2.setTimeZone(r0)     // Catch:{ 6zA -> 0x01ec }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6zA -> 0x01ec }
            java.lang.String r0 = "Certificate revocation after "
            r1.append(r0)     // Catch:{ 6zA -> 0x01ec }
            java.util.Date r0 = r3.A01     // Catch:{ 6zA -> 0x01ec }
            java.lang.String r0 = r2.format(r0)     // Catch:{ 6zA -> 0x01ec }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ 6zA -> 0x01ec }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r0)     // Catch:{ 6zA -> 0x01ec }
            java.lang.String r0 = ", reason: "
            r2.append(r0)     // Catch:{ 6zA -> 0x01ec }
            java.lang.String[] r1 = X.AnonymousClass7sA.A0D     // Catch:{ 6zA -> 0x01ec }
            int r0 = r3.A00     // Catch:{ 6zA -> 0x01ec }
            r0 = r1[r0]     // Catch:{ 6zA -> 0x01ec }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r2)     // Catch:{ 6zA -> 0x01ec }
            X.6zA r0 = X.C143596zA.A00(r0)     // Catch:{ 6zA -> 0x01ec }
            goto L_0x01eb
        L_0x01bd:
            r1 = move-exception
            java.lang.String r0 = "Distribution points could not be read."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x01d5 }
            goto L_0x01d4
        L_0x01c5:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6zA -> 0x01d5 }
            java.lang.String r0 = "cannot create certificate factory: "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r2)     // Catch:{ 6zA -> 0x01d5 }
            X.6zA r0 = X.C143596zA.A01(r0, r2)     // Catch:{ 6zA -> 0x01d5 }
        L_0x01d4:
            throw r0     // Catch:{ 6zA -> 0x01d5 }
        L_0x01d5:
            r1 = move-exception
            java.lang.String r0 = "No additional CRL locations could be decoded from CRL distribution point extension."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x01ec }
            goto L_0x01eb
        L_0x01dd:
            r1 = move-exception
            java.lang.String r0 = "CRL distribution point extension could not be read."
            X.6zA r0 = X.C143596zA.A01(r0, r1)     // Catch:{ 6zA -> 0x01ec }
            goto L_0x01eb
        L_0x01e5:
            java.lang.String r0 = "No valid CRL found."
            X.6zA r0 = X.C143596zA.A01(r0, r5)     // Catch:{ 6zA -> 0x01ec }
        L_0x01eb:
            throw r0     // Catch:{ 6zA -> 0x01ec }
        L_0x01ec:
            r0 = move-exception
            java.lang.Throwable r2 = r0._underlyingException
            if (r2 != 0) goto L_0x01f2
            r2 = r0
        L_0x01f2:
            java.lang.String r1 = r0.getMessage()
            X.7Op r0 = r10.A01
            java.security.cert.CertPathValidatorException r0 = X.C149967Op.A00(r1, r2, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173518Qm.check(java.security.cert.Certificate):void");
    }

    public C173518Qm(C180128kX r2) {
        this.A02 = r2;
    }
}
