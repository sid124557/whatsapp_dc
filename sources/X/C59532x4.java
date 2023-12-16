package X;

/* renamed from: X.2x4  reason: invalid class name and case insensitive filesystem */
public class C59532x4 {
    public final AnonymousClass2UU A00;
    public final C56612sH A01;
    public final C53182mg A02;
    public final C183538qC A03;

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(X.C50912iy r11, X.AnonymousClass4EL r12, X.C59532x4 r13, java.lang.Integer r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            X.2UU r1 = r13.A00     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            java.lang.String r0 = "CN=WhatsApp WWW Channel"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            java.security.cert.X509Certificate r6 = r1.A00(r15, r0)     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            java.lang.String r0 = "CN=WhatsApp WWW Channel Signature"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            r2 = r16
            java.security.cert.X509Certificate r7 = r1.A00(r2, r0)     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            r4 = 0
            r5 = r17
            if (r17 == 0) goto L_0x0022
            java.security.PublicKey r2 = X.AnonymousClass341.A05(r5)     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            goto L_0x0023
        L_0x0022:
            r2 = r4
        L_0x0023:
            if (r18 == 0) goto L_0x002d
            int r0 = java.lang.Integer.parseInt(r18)     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
        L_0x002d:
            X.2mg r1 = r13.A02     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            java.util.Set r0 = r1.A04     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            boolean r0 = r0.contains(r11)     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            if (r0 == 0) goto L_0x0064
            if (r14 == 0) goto L_0x0059
            int r8 = r14.intValue()     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            X.2sH r0 = r13.A01     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            long r9 = X.C56612sH.A00(r0)     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            monitor-enter(r1)     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            java.util.Map r0 = r1.A00()     // Catch:{  }
            X.2vu r3 = new X.2vu     // Catch:{ all -> 0x0060 }
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0060 }
            r0.put(r11, r3)     // Catch:{ all -> 0x0060 }
            r1.A02(r0)     // Catch:{ CertificateException | JSONException -> 0x0054 }
            goto L_0x0063
        L_0x0054:
            r0 = move-exception
            X.C626936e.A0A(r0)     // Catch:{ all -> 0x0060 }
            goto L_0x0063
        L_0x0059:
            java.lang.String r0 = "cacheable certs should have ttl"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            goto L_0x0062
        L_0x0060:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
        L_0x0062:
            throw r0     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
        L_0x0063:
            monitor-exit(r1)     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
        L_0x0064:
            r12.BdT(r4, r2, r6, r7)     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            return
        L_0x0068:
            r0 = move-exception
            r12.BSB(r0)
            return
        L_0x006d:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59532x4.A00(X.2iy, X.4EL, X.2x4, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.2vu} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.security.PublicKey] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C50912iy r12, X.AnonymousClass4EL r13) {
        /*
            r11 = this;
            X.2mg r7 = r11.A02
            java.util.Set r0 = r7.A04
            boolean r0 = r0.contains(r12)
            r2 = 0
            if (r0 == 0) goto L_0x0064
            java.util.Map r0 = r7.A00()     // Catch:{ CertificateException | JSONException -> 0x0059 }
            java.lang.Object r5 = r0.get(r12)     // Catch:{ CertificateException | JSONException -> 0x0059 }
            X.2vu r5 = (X.C58842vu) r5     // Catch:{ CertificateException | JSONException -> 0x0059 }
            if (r5 == 0) goto L_0x0063
            java.security.cert.X509Certificate r6 = r5.A04
            int r10 = r5.A00
            long r3 = r5.A01
            X.2sH r0 = r11.A01
            long r0 = r0.A0H()
            java.util.Date r8 = new java.util.Date     // Catch:{ CertificateExpiredException | CertificateNotYetValidException -> 0x0055 }
            r8.<init>(r0)     // Catch:{ CertificateExpiredException | CertificateNotYetValidException -> 0x0055 }
            r6.checkValidity(r8)     // Catch:{ CertificateExpiredException | CertificateNotYetValidException -> 0x0055 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            X.C626936e.A06(r8)
            java.lang.Long r8 = java.lang.Long.valueOf(r3)
            X.C626936e.A06(r8)
            long r8 = X.C18290x4.A0B(r0)
            int r0 = r10 / 2
            long r0 = (long) r0
            long r3 = r3 + r0
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0055
            java.security.cert.X509Certificate r1 = r5.A05     // Catch:{ GeneralSecurityException -> 0x005f }
            java.lang.String r0 = r5.A03     // Catch:{ GeneralSecurityException -> 0x005f }
            if (r0 == 0) goto L_0x004f
            java.security.PublicKey r2 = X.AnonymousClass341.A05(r0)     // Catch:{ GeneralSecurityException -> 0x005f }
        L_0x004f:
            java.lang.Integer r0 = r5.A02     // Catch:{ GeneralSecurityException -> 0x005f }
            r13.BdT(r0, r2, r6, r1)     // Catch:{ GeneralSecurityException -> 0x005f }
            return
        L_0x0055:
            r7.A01(r12)
            goto L_0x0064
        L_0x0059:
            r0 = move-exception
            X.C626936e.A0A(r0)
            r5 = 0
            goto L_0x0063
        L_0x005f:
            r0 = move-exception
            X.C626936e.A0A(r0)
        L_0x0063:
            r2 = r5
        L_0x0064:
            X.8qC r0 = r11.A03
            java.lang.Object r0 = r0.get()
            X.2GO r0 = (X.AnonymousClass2GO) r0
            java.util.Map r0 = r0.A00
            java.lang.Object r0 = X.C18320x8.A0Z(r0, r12)
            X.4C1 r0 = (X.AnonymousClass4C1) r0
            java.lang.Object r1 = r0.get()
            X.2mG r1 = (X.C52922mG) r1
            X.3Ma r0 = new X.3Ma
            r0.<init>(r2, r12, r13, r11)
            r1.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59532x4.A01(X.2iy, X.4EL):void");
    }

    public C59532x4(AnonymousClass2UU r1, C56612sH r2, C53182mg r3, C183538qC r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
    }
}
