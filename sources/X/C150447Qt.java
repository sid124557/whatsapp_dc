package X;

/* renamed from: X.7Qt  reason: invalid class name and case insensitive filesystem */
public abstract class C150447Qt {
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A03(X.C179548jK r20, X.AnonymousClass7EH r21, X.C149817Nz r22, int r23) {
        /*
            r19 = this;
            r13 = r20
            r1 = r19
            boolean r0 = r1 instanceof X.C136456mh
            r14 = r21
            r15 = r22
            r18 = r23
            if (r0 == 0) goto L_0x0026
            X.8Hn r13 = (X.C171558Hn) r13
            X.C136396mb.A00(r13)
            java.lang.Object r1 = r14.A00
            byte[] r1 = (byte[]) r1
            X.7aJ r0 = r13.A0D     // Catch:{ 6zV -> 0x001d }
            r0.A00(r1)     // Catch:{ 6zV -> 0x001d }
            return
        L_0x001d:
            r17 = move-exception
            java.lang.String r16 = "Failed to update transcripts."
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x0026:
            boolean r0 = r1 instanceof X.C136446mg
            if (r0 == 0) goto L_0x0069
            X.8Hn r13 = (X.C171558Hn) r13
            boolean r0 = r14 instanceof X.C136646n1
            if (r0 == 0) goto L_0x005b
            X.C136396mb.A00(r13)     // Catch:{ 6zV -> 0x004c, RuntimeException -> 0x0043 }
            r0 = r14
            X.6n1 r0 = (X.C136646n1) r0     // Catch:{ 6zV -> 0x004c, RuntimeException -> 0x0043 }
            java.lang.Object r0 = r0.A00     // Catch:{ 6zV -> 0x004c, RuntimeException -> 0x0043 }
            byte[] r0 = (byte[]) r0     // Catch:{ 6zV -> 0x004c, RuntimeException -> 0x0043 }
            byte[] r1 = X.C154377d4.A00(r0)     // Catch:{ 6zV -> 0x004c, RuntimeException -> 0x0043 }
            r0 = 0
            X.C1452174q.A00(r13, r1, r0)     // Catch:{ 6zV -> 0x004c, RuntimeException -> 0x0043 }
            return
        L_0x0043:
            r17 = move-exception
            java.lang.String r16 = "Server Hello parse error."
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x004c:
            r1 = move-exception
            javax.net.ssl.SSLException r0 = r1.ex
            java.lang.String r16 = r0.getMessage()
            X.6n2 r12 = new X.6n2
            r17 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x005b:
            java.lang.String r16 = "Unexpected event type"
            java.lang.String r0 = "Unexpected event"
            X.6zV r17 = X.C143806zV.A00(r0)
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x0069:
            boolean r0 = r1 instanceof X.C136436mf
            if (r0 == 0) goto L_0x00bf
            X.8Hn r13 = (X.C171558Hn) r13
            boolean r0 = r14 instanceof X.AnonymousClass6n0
            r4 = 80
            if (r0 == 0) goto L_0x00b1
            X.C136396mb.A00(r13)     // Catch:{ 6zV -> 0x00a8 }
            java.lang.Object r0 = r14.A00     // Catch:{ 6zV -> 0x00a8 }
            byte[] r0 = (byte[]) r0     // Catch:{ 6zV -> 0x00a8 }
            byte[] r3 = X.C154377d4.A00(r0)     // Catch:{ 6zV -> 0x00a8 }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x00a8 }
            java.lang.String r0 = "server_finished"
            byte[] r2 = X.AnonymousClass6CA.A0h(r0, r1)     // Catch:{ 6zV -> 0x00a8 }
            X.7aJ r0 = r13.A0D     // Catch:{ 6zV -> 0x00a8 }
            byte[] r1 = r0.A02()     // Catch:{ 6zV -> 0x00a8 }
            java.lang.String r0 = r13.A0P     // Catch:{ 6zV -> 0x00a8 }
            byte[] r0 = X.C162257rX.A0B(r0, r2, r1)     // Catch:{ 6zV -> 0x00a8 }
            boolean r0 = X.C162257rX.A06(r0, r3)     // Catch:{ 6zV -> 0x00a8 }
            if (r0 != 0) goto L_0x0561
            java.lang.String r0 = "Failed to verify server fin."
            X.6zV r17 = X.C143806zV.A01(r0, r4)     // Catch:{ 6zV -> 0x00a8 }
            X.6n2 r12 = new X.6n2     // Catch:{ 6zV -> 0x00a8 }
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ 6zV -> 0x00a8 }
            throw r12     // Catch:{ 6zV -> 0x00a8 }
        L_0x00a8:
            r17 = move-exception
            java.lang.String r16 = "Failed to process finished message."
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x00b1:
            java.lang.String r16 = "Unexpected event type"
            java.lang.String r0 = "Unexpected event"
            X.6zV r17 = X.C143806zV.A01(r0, r4)
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x00bf:
            boolean r0 = r1 instanceof X.C136426me
            if (r0 == 0) goto L_0x021e
            X.8Hn r13 = (X.C171558Hn) r13
            java.lang.String r7 = " got "
            java.lang.String r6 = "Expected signature scheme "
            X.C136396mb.A00(r13)
            boolean r0 = r14 instanceof X.C136636mz
            r5 = 80
            if (r0 == 0) goto L_0x0210
            java.lang.String r1 = "TLS 1.3, server CertificateVerify"
            java.lang.String r0 = "UTF-8"
            byte[] r4 = r1.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x0203 }
            r0 = 64
            byte[] r3 = new byte[r0]
            r0 = 32
            java.util.Arrays.fill(r3, r0)
            java.lang.Object r0 = r14.A00     // Catch:{ 6zV -> 0x01fa }
            byte[] r0 = (byte[]) r0     // Catch:{ 6zV -> 0x01fa }
            byte[] r0 = X.C154377d4.A00(r0)     // Catch:{ 6zV -> 0x01fa }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ 6zV -> 0x01fa }
            short r2 = r0.getShort()     // Catch:{ 6zV -> 0x01fa }
            byte[] r12 = X.C162257rX.A0C(r0)     // Catch:{ 6zV -> 0x01fa }
            r1 = 1027(0x403, float:1.439E-42)
            if (r2 != r1) goto L_0x01da
            X.7aJ r0 = r13.A0D     // Catch:{ 6zV -> 0x01fa }
            byte[] r2 = r0.A02()     // Catch:{ 6zV -> 0x01fa }
            int r0 = r4.length
            int r0 = r0 + 64
            r6 = 1
            int r1 = r0 + 1
            int r0 = r2.length
            int r1 = r1 + r0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r1)
            r0.put(r3)
            r0.put(r4)
            r8 = 0
            r0.put(r8)
            r0.put(r2)
            byte[] r5 = r0.array()
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.List r0 = r13.A0T
            java.util.Iterator r3 = r0.iterator()
        L_0x0128:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0158
            java.lang.Object r2 = r3.next()
            X.7SN r2 = (X.AnonymousClass7SN) r2
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r0)     // Catch:{ CertificateException -> 0x0148 }
            byte[] r0 = r2.A01     // Catch:{ CertificateException -> 0x0148 }
            java.io.ByteArrayInputStream r0 = X.AnonymousClass0x9.A0d(r0)     // Catch:{ CertificateException -> 0x0148 }
            java.security.cert.Certificate r0 = r1.generateCertificate(r0)     // Catch:{ CertificateException -> 0x0148 }
            r7.add(r0)     // Catch:{ CertificateException -> 0x0148 }
            goto L_0x0128
        L_0x0148:
            r1 = move-exception
            java.lang.String r16 = "Bad certificate"
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException
            r0.<init>(r1)
            X.6n2 r12 = new X.6n2
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x0158:
            X.7IZ r2 = r13.A0J     // Catch:{ 6zV -> 0x01d1 }
            java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r8]     // Catch:{ 6zV -> 0x01d1 }
            java.lang.Object[] r11 = r7.toArray(r0)     // Catch:{ 6zV -> 0x01d1 }
            java.security.cert.X509Certificate[] r11 = (java.security.cert.X509Certificate[]) r11     // Catch:{ 6zV -> 0x01d1 }
            java.lang.String r10 = r13.A0Q     // Catch:{ 6zV -> 0x01d1 }
            java.lang.String r9 = ""
            r3 = 42
            r4 = 80
            javax.net.ssl.X509TrustManager r0 = r2.A00     // Catch:{ NoSuchAlgorithmException -> 0x01c3, InvalidKeyException -> 0x01ca, SignatureException -> 0x01bc }
            if (r0 == 0) goto L_0x01ae
            if (r11 == 0) goto L_0x01a7
            int r0 = r11.length     // Catch:{ NoSuchAlgorithmException -> 0x01c3, InvalidKeyException -> 0x01ca, SignatureException -> 0x01bc }
            if (r0 == 0) goto L_0x01a7
            java.lang.String r0 = "SHA256withECDSA"
            java.security.Signature r1 = java.security.Signature.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x01c3, InvalidKeyException -> 0x01ca, SignatureException -> 0x01bc }
            r0 = r11[r8]     // Catch:{ NoSuchAlgorithmException -> 0x01c3, InvalidKeyException -> 0x01ca, SignatureException -> 0x01bc }
            r1.initVerify(r0)     // Catch:{ NoSuchAlgorithmException -> 0x01c3, InvalidKeyException -> 0x01ca, SignatureException -> 0x01bc }
            r1.update(r5)     // Catch:{ NoSuchAlgorithmException -> 0x01c3, InvalidKeyException -> 0x01ca, SignatureException -> 0x01bc }
            boolean r5 = r1.verify(r12)     // Catch:{ NoSuchAlgorithmException -> 0x01c3, InvalidKeyException -> 0x01ca, SignatureException -> 0x01bc }
            if (r5 == 0) goto L_0x0191
            javax.net.ssl.X509TrustManager r1 = r2.A00     // Catch:{ CertificateException -> 0x018f }
            java.lang.String r0 = "EC"
            r1.checkServerTrusted(r11, r0)     // Catch:{ CertificateException -> 0x018f }
            goto L_0x0191
        L_0x018f:
            r1 = move-exception
            goto L_0x01b5
        L_0x0191:
            r2 = 0
            r0 = -1
            X.8P3 r1 = new X.8P3     // Catch:{ NoSuchAlgorithmException -> 0x01c3, InvalidKeyException -> 0x01ca, SignatureException -> 0x01bc }
            r1.<init>(r2, r9, r9, r0)     // Catch:{ NoSuchAlgorithmException -> 0x01c3, InvalidKeyException -> 0x01ca, SignatureException -> 0x01bc }
            r1.A01(r11)     // Catch:{ NoSuchAlgorithmException -> 0x01c3, InvalidKeyException -> 0x01ca, SignatureException -> 0x01bc }
            javax.net.ssl.HostnameVerifier r0 = javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier()     // Catch:{ NoSuchAlgorithmException -> 0x01c3, InvalidKeyException -> 0x01ca, SignatureException -> 0x01bc }
            boolean r0 = r0.verify(r10, r1)     // Catch:{ NoSuchAlgorithmException -> 0x01c3, InvalidKeyException -> 0x01ca, SignatureException -> 0x01bc }
            if (r5 == 0) goto L_0x0562
            goto L_0x0550
        L_0x01a7:
            java.lang.String r0 = "Null or empty certificates certificates"
            X.6zV r0 = X.C143806zV.A01(r0, r4)     // Catch:{ NoSuchAlgorithmException -> 0x01c3, InvalidKeyException -> 0x01ca, SignatureException -> 0x01bc }
            goto L_0x01bb
        L_0x01ae:
            java.lang.String r0 = "Trust Manager cannot be null."
            X.6zV r0 = X.C143806zV.A01(r0, r4)     // Catch:{ NoSuchAlgorithmException -> 0x01c3, InvalidKeyException -> 0x01ca, SignatureException -> 0x01bc }
            goto L_0x01bb
        L_0x01b5:
            java.lang.String r0 = "Certificate could not be verified"
            X.6zV r0 = X.C143806zV.A02(r0, r1, r3)     // Catch:{ NoSuchAlgorithmException -> 0x01c3, InvalidKeyException -> 0x01ca, SignatureException -> 0x01bc }
        L_0x01bb:
            throw r0     // Catch:{ NoSuchAlgorithmException -> 0x01c3, InvalidKeyException -> 0x01ca, SignatureException -> 0x01bc }
        L_0x01bc:
            java.lang.String r0 = "Signature is invalid"
            X.6zV r0 = X.C143806zV.A01(r0, r3)     // Catch:{ 6zV -> 0x01d1 }
            goto L_0x01d0
        L_0x01c3:
            java.lang.String r0 = "SHA256withECDSA not found."
            X.6zV r0 = X.C143806zV.A01(r0, r4)     // Catch:{ 6zV -> 0x01d1 }
            goto L_0x01d0
        L_0x01ca:
            java.lang.String r0 = "Certificate key is invalid."
            X.6zV r0 = X.C143806zV.A01(r0, r3)     // Catch:{ 6zV -> 0x01d1 }
        L_0x01d0:
            throw r0     // Catch:{ 6zV -> 0x01d1 }
        L_0x01d1:
            r17 = move-exception
            java.lang.String r16 = "Certificates verify failed."
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x01da:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ 6zV -> 0x01fa }
            X.AnonymousClass6C7.A1J(r6, r7, r0, r1, r2)     // Catch:{ 6zV -> 0x01fa }
            java.lang.String r16 = r0.toString()     // Catch:{ 6zV -> 0x01fa }
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ 6zV -> 0x01fa }
            X.AnonymousClass6C7.A1J(r6, r7, r0, r1, r2)     // Catch:{ 6zV -> 0x01fa }
            java.lang.String r0 = r0.toString()     // Catch:{ 6zV -> 0x01fa }
            X.6zV r17 = X.C143806zV.A01(r0, r5)     // Catch:{ 6zV -> 0x01fa }
            X.6n2 r12 = new X.6n2     // Catch:{ 6zV -> 0x01fa }
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ 6zV -> 0x01fa }
            throw r12     // Catch:{ 6zV -> 0x01fa }
        L_0x01fa:
            r17 = move-exception
            java.lang.String r16 = ""
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x0203:
            r0 = move-exception
            java.lang.String r16 = "Could not encode context string in UTF-8"
            X.6zV r17 = X.C143806zV.A03(r0)
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x0210:
            java.lang.String r16 = "Unexpected event type"
            java.lang.String r0 = "Unexpected event"
            X.6zV r17 = X.C143806zV.A01(r0, r5)
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x021e:
            boolean r0 = r1 instanceof X.C136416md
            if (r0 == 0) goto L_0x02b9
            X.8Hn r13 = (X.C171558Hn) r13
            boolean r0 = r14 instanceof X.C136626my
            r2 = 80
            if (r0 == 0) goto L_0x02ab
            X.C136396mb.A00(r13)     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            r0 = r14
            X.6my r0 = (X.C136626my) r0     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            java.lang.Object r0 = r0.A00     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            byte[] r0 = (byte[]) r0     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            byte[] r0 = X.C154377d4.A00(r0)     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            byte r0 = r1.get()     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            if (r0 != 0) goto L_0x028b
            r0 = 3
            byte[] r0 = new byte[r0]     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            r1.get(r0)     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            int r8 = X.C162257rX.A01(r0)     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            byte[] r0 = new byte[r8]     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            r1.get(r0)     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            r5 = 0
        L_0x025a:
            if (r5 >= r8) goto L_0x0288
            r0 = 3
            byte[] r0 = new byte[r0]     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            r6.get(r0)     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            int r4 = X.C162257rX.A01(r0)     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            byte[] r3 = new byte[r4]     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            r6.get(r3)     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            int r2 = X.C162257rX.A00(r6)     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            byte[] r0 = new byte[r2]     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            r6.get(r0)     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            X.7k8 r1 = new X.7k8     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            r1.<init>(r0)     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            int r0 = r4 + 3
            int r0 = r0 + 2
            int r0 = r0 + r2
            int r5 = r5 + r0
            X.7SN r0 = new X.7SN     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            r0.<init>(r1, r3)     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            r7.add(r0)     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            goto L_0x025a
        L_0x0288:
            r13.A0T = r7     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            return
        L_0x028b:
            java.lang.String r16 = "Unexpected certificate size"
            java.lang.String r0 = "Unexpected Message"
            X.6zV r17 = X.C143806zV.A01(r0, r2)     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            X.6n2 r12 = new X.6n2     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
            throw r12     // Catch:{ 6zV -> 0x02a2, RuntimeException -> 0x0299 }
        L_0x0299:
            r17 = move-exception
            java.lang.String r16 = "Failed to parse certificate."
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x02a2:
            r17 = move-exception
            java.lang.String r16 = "Failed to process certificate"
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x02ab:
            java.lang.String r16 = "Unexpected event type"
            java.lang.String r0 = "Unexpected event"
            X.6zV r17 = X.C143806zV.A01(r0, r2)
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x02b9:
            boolean r0 = r1 instanceof X.C136406mc
            if (r0 == 0) goto L_0x02d0
            X.8Hn r13 = (X.C171558Hn) r13
            X.C136396mb.A00(r13)
            java.lang.String r16 = "Unexpected event type"
            java.lang.String r0 = "Unexpected event"
            X.6zV r17 = X.C143806zV.A00(r0)
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x02d0:
            boolean r0 = r1 instanceof X.C136386ma
            if (r0 == 0) goto L_0x03fd
            X.8Hn r13 = (X.C171558Hn) r13
            X.C136396mb.A00(r13)
            boolean r0 = r14 instanceof X.C136596mv
            r1 = 80
            if (r0 == 0) goto L_0x03ef
            java.lang.Object r0 = r14.A00
            byte[] r0 = (byte[]) r0
            byte[] r0 = X.C154377d4.A00(r0)     // Catch:{ 6zV -> 0x03e6 }
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ 6zV -> 0x03e6 }
            r5 = 4
            byte[] r7 = new byte[r5]     // Catch:{ 6zV -> 0x03e6 }
            r2.get(r7)     // Catch:{ 6zV -> 0x03e6 }
            long r3 = X.C162257rX.A03(r7)     // Catch:{ 6zV -> 0x03e6 }
            r10 = 0
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0561
            byte[] r6 = new byte[r5]     // Catch:{ 6zV -> 0x03e6 }
            r2.get(r6)     // Catch:{ 6zV -> 0x03e6 }
            int r0 = X.AnonymousClass6CA.A07(r2)     // Catch:{ 6zV -> 0x03e6 }
            short r0 = (short) r0     // Catch:{ 6zV -> 0x03e6 }
            short r0 = (short) r0     // Catch:{ 6zV -> 0x03e6 }
            byte[] r5 = new byte[r0]     // Catch:{ 6zV -> 0x03e6 }
            r2.get(r5)     // Catch:{ 6zV -> 0x03e6 }
            byte[] r8 = X.C162257rX.A0C(r2)     // Catch:{ 6zV -> 0x03e6 }
            byte[] r0 = X.C162257rX.A0C(r2)     // Catch:{ 6zV -> 0x03e6 }
            X.7k8 r3 = new X.7k8     // Catch:{ 6zV -> 0x03e6 }
            r3.<init>(r0)     // Catch:{ 6zV -> 0x03e6 }
            r0 = 42
            X.7SO r0 = r3.A00(r0)     // Catch:{ 6zV -> 0x03e6 }
            if (r0 == 0) goto L_0x0326
            byte[] r0 = r0.A01     // Catch:{ 6zV -> 0x03e6 }
            long r10 = X.C162257rX.A03(r0)     // Catch:{ 6zV -> 0x03e6 }
        L_0x0326:
            X.7Ux r4 = r13.A09     // Catch:{ 6zV -> 0x03e6 }
            java.util.Map r3 = r13.A0U     // Catch:{ 6zV -> 0x03e6 }
            java.lang.String r0 = "resumption_master_secret"
            byte[] r3 = X.AnonymousClass6CA.A0h(r0, r3)     // Catch:{ 6zV -> 0x03e6 }
            java.lang.String r0 = "resumption"
            byte[] r5 = X.C151467Ux.A00(r4, r13, r0, r5, r3)     // Catch:{ 6zV -> 0x03e6 }
            java.lang.String r4 = r13.A0Q     // Catch:{ 6zV -> 0x03e6 }
            X.8P3 r0 = r13.A0C     // Catch:{ 6zV -> 0x03e6 }
            java.lang.Byte r0 = r0.A00()     // Catch:{ 6zV -> 0x03e6 }
            byte r9 = r0.byteValue()     // Catch:{ 6zV -> 0x03e6 }
            com.whatsapp.net.tls13.WtCachedPsk r3 = new com.whatsapp.net.tls13.WtCachedPsk     // Catch:{ 6zV -> 0x03e6 }
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ 6zV -> 0x03e6 }
            X.8P3 r0 = r13.A0C     // Catch:{ 6zV -> 0x03e6 }
            java.util.LinkedHashSet r0 = r0.A07     // Catch:{ 6zV -> 0x03e6 }
            r0.add(r3)     // Catch:{ 6zV -> 0x03e6 }
            boolean r0 = r2.hasRemaining()     // Catch:{ 6zV -> 0x03e6 }
            if (r0 != 0) goto L_0x03d8
            X.8P4 r3 = r13.A0L
            X.8P3 r7 = r13.A0C
            monitor-enter(r3)
            byte[] r0 = r7.getId()     // Catch:{ all -> 0x03d5 }
            X.7WP r6 = new X.7WP     // Catch:{ all -> 0x03d5 }
            r6.<init>(r3, r0)     // Catch:{ all -> 0x03d5 }
            java.util.Map r4 = r3.A01     // Catch:{ 6zV -> 0x03c9 }
            monitor-enter(r4)     // Catch:{ 6zV -> 0x03c9 }
            java.lang.Object r5 = r4.get(r6)     // Catch:{ all -> 0x03c6 }
            X.8P3 r5 = (X.AnonymousClass8P3) r5     // Catch:{ all -> 0x03c6 }
            if (r5 != 0) goto L_0x0381
            java.lang.String r2 = r7.getPeerHost()     // Catch:{ all -> 0x03c6 }
            int r1 = r7.getPeerPort()     // Catch:{ all -> 0x03c6 }
            java.lang.String r0 = r7.getCipherSuite()     // Catch:{ all -> 0x03c6 }
            X.8P3 r5 = new X.8P3     // Catch:{ all -> 0x03c6 }
            r5.<init>(r3, r2, r0, r1)     // Catch:{ all -> 0x03c6 }
            r4.put(r6, r5)     // Catch:{ all -> 0x03c6 }
        L_0x0381:
            java.util.Map r2 = r5.A08     // Catch:{ all -> 0x03c6 }
            java.lang.Byte r1 = r7.A00()     // Catch:{ all -> 0x03c6 }
            java.security.cert.Certificate[] r0 = r7.getPeerCertificates()     // Catch:{ all -> 0x03c6 }
            r2.put(r1, r0)     // Catch:{ all -> 0x03c6 }
            java.util.LinkedHashSet r0 = r7.A07     // Catch:{ all -> 0x03c6 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x03c6 }
        L_0x0394:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x03c6 }
            if (r0 == 0) goto L_0x03a6
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x03c6 }
            com.whatsapp.net.tls13.WtCachedPsk r1 = (com.whatsapp.net.tls13.WtCachedPsk) r1     // Catch:{ all -> 0x03c6 }
            java.util.LinkedHashSet r0 = r5.A07     // Catch:{ all -> 0x03c6 }
            r0.add(r1)     // Catch:{ all -> 0x03c6 }
            goto L_0x0394
        L_0x03a6:
            X.7aK r1 = r3.A00     // Catch:{ all -> 0x03c6 }
            if (r1 == 0) goto L_0x03c4
            byte[] r0 = r6.A01     // Catch:{ all -> 0x03c6 }
            java.lang.String r6 = r5.getPeerHost()     // Catch:{ all -> 0x03c6 }
            int r10 = r5.getPeerPort()     // Catch:{ all -> 0x03c6 }
            java.lang.String r7 = r5.getCipherSuite()     // Catch:{ all -> 0x03c6 }
            java.util.LinkedHashSet r8 = r5.A07     // Catch:{ all -> 0x03c6 }
            java.util.Map r9 = r5.A08     // Catch:{ all -> 0x03c6 }
            com.whatsapp.watls13.WtPersistentSession r5 = new com.whatsapp.watls13.WtPersistentSession     // Catch:{ all -> 0x03c6 }
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x03c6 }
            r1.A02(r5, r0)     // Catch:{ all -> 0x03c6 }
        L_0x03c4:
            monitor-exit(r4)     // Catch:{ all -> 0x03c6 }
            goto L_0x03d3
        L_0x03c6:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x03c6 }
            throw r0     // Catch:{ 6zV -> 0x03c9 }
        L_0x03c9:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x03d5 }
            java.lang.String r0 = "Encountered Exception "
            X.C18260x0.A1O(r1, r0, r2)     // Catch:{ all -> 0x03d5 }
        L_0x03d3:
            monitor-exit(r3)
            return
        L_0x03d5:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x03d8:
            java.lang.String r16 = "New session ticket has excess bytes than expected"
            java.lang.String r0 = "New session ticket has more bytes than expected."
            X.6zV r17 = X.C143806zV.A01(r0, r1)     // Catch:{ 6zV -> 0x03e6 }
            X.6n2 r12 = new X.6n2     // Catch:{ 6zV -> 0x03e6 }
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ 6zV -> 0x03e6 }
            throw r12     // Catch:{ 6zV -> 0x03e6 }
        L_0x03e6:
            r17 = move-exception
            java.lang.String r16 = "Failed to process new session ticket"
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x03ef:
            java.lang.String r16 = "Unexpected event type"
            java.lang.String r0 = "Unexpected event"
            X.6zV r17 = X.C143806zV.A01(r0, r1)
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x03fd:
            boolean r0 = r1 instanceof X.C136376mZ
            if (r0 == 0) goto L_0x0464
            X.8Hn r13 = (X.C171558Hn) r13
            boolean r0 = r14 instanceof X.C136586mu
            if (r0 == 0) goto L_0x0456
            X.C136396mb.A00(r13)     // Catch:{ 6zV -> 0x0447, RuntimeException -> 0x043e }
            r0 = r14
            X.6mu r0 = (X.C136586mu) r0     // Catch:{ 6zV -> 0x0447, RuntimeException -> 0x043e }
            java.lang.Object r3 = r0.A00     // Catch:{ 6zV -> 0x0447, RuntimeException -> 0x043e }
            byte[] r3 = (byte[]) r3     // Catch:{ 6zV -> 0x0447, RuntimeException -> 0x043e }
            byte[] r1 = X.C154377d4.A00(r3)     // Catch:{ 6zV -> 0x0447, RuntimeException -> 0x043e }
            r0 = 1
            X.C1452174q.A00(r13, r1, r0)     // Catch:{ 6zV -> 0x0447, RuntimeException -> 0x043e }
            r13.A0c = r0     // Catch:{ 6zV -> 0x0447, RuntimeException -> 0x043e }
            r0 = 0
            r13.A0f = r0     // Catch:{ 6zV -> 0x0447, RuntimeException -> 0x043e }
            X.7aJ r0 = r13.A0D     // Catch:{ 6zV -> 0x0447, RuntimeException -> 0x043e }
            byte[] r2 = r0.A02()     // Catch:{ 6zV -> 0x0447, RuntimeException -> 0x043e }
            X.7aJ r1 = r13.A0D     // Catch:{ 6zV -> 0x0447, RuntimeException -> 0x043e }
            java.security.MessageDigest r0 = r1.A00     // Catch:{ 6zV -> 0x0447, RuntimeException -> 0x043e }
            r0.reset()     // Catch:{ 6zV -> 0x0447, RuntimeException -> 0x043e }
            r0 = 0
            r1.A01 = r0     // Catch:{ 6zV -> 0x0447, RuntimeException -> 0x043e }
            X.7aJ r1 = r13.A0D     // Catch:{ 6zV -> 0x0447, RuntimeException -> 0x043e }
            r0 = -2
            byte[] r0 = X.C154377d4.A01(r2, r0)     // Catch:{ 6zV -> 0x0447, RuntimeException -> 0x043e }
            r1.A00(r0)     // Catch:{ 6zV -> 0x0447, RuntimeException -> 0x043e }
            X.7aJ r0 = r13.A0D     // Catch:{ 6zV -> 0x0447, RuntimeException -> 0x043e }
            r0.A00(r3)     // Catch:{ 6zV -> 0x0447, RuntimeException -> 0x043e }
            return
        L_0x043e:
            r17 = move-exception
            java.lang.String r16 = "Hello retry parse error."
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x0447:
            r1 = move-exception
            javax.net.ssl.SSLException r0 = r1.ex
            java.lang.String r16 = r0.getMessage()
            X.6n2 r12 = new X.6n2
            r17 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x0456:
            java.lang.String r16 = "Unexpected event type"
            java.lang.String r0 = "Unexpected event"
            X.6zV r17 = X.C143806zV.A00(r0)
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x0464:
            boolean r0 = r1 instanceof X.C136366mY
            if (r0 == 0) goto L_0x05c0
            X.8Hn r13 = (X.C171558Hn) r13
            X.C136396mb.A00(r13)
            boolean r0 = r14 instanceof X.C136576mt
            r2 = 80
            if (r0 == 0) goto L_0x05b2
            java.lang.Object r0 = r14.A00
            byte[] r0 = (byte[]) r0
            byte[] r0 = X.C154377d4.A00(r0)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            r1 = 2
            byte[] r0 = X.C162257rX.A0C(r11)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            X.7k8 r3 = new X.7k8     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            r3.<init>(r0)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            r0 = 16
            X.7SO r7 = r3.A00(r0)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            if (r7 == 0) goto L_0x04fe
            java.lang.String r0 = r13.A0O     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            if (r0 == 0) goto L_0x04fe
            boolean r0 = r0.isEmpty()     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            if (r0 != 0) goto L_0x04fe
            byte[] r0 = r7.A01     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            byte[] r0 = new byte[r1]     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            r10.get(r0)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            int r9 = X.C162257rX.A02(r0)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            java.util.HashSet r8 = X.AnonymousClass002.A0K()     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            r6 = 0
        L_0x04af:
            if (r6 >= r9) goto L_0x04cb
            byte r5 = r10.get()     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            byte[] r4 = new byte[r5]     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            r10.get(r4)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            java.lang.String r1 = "UTF-8"
            java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x04c8 }
            r0.<init>(r4, r1)     // Catch:{ UnsupportedEncodingException -> 0x04c8 }
            r8.add(r0)     // Catch:{ UnsupportedEncodingException -> 0x04c8 }
            int r0 = r5 + 1
            int r6 = r6 + r0
            goto L_0x04af
        L_0x04c8:
            r0 = move-exception
            goto L_0x0588
        L_0x04cb:
            java.lang.String r0 = r13.A0O     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            boolean r0 = r8.contains(r0)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            if (r0 != 0) goto L_0x04fe
            java.lang.String r16 = "Server sent unsupported protocol version."
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            java.lang.String r0 = "Server selected wrong supported version "
            X.C18270x1.A1H(r1, r0, r7)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            java.lang.String r0 = " expected: "
            r1.append(r0)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            java.lang.String r0 = r13.A0O     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            javax.net.ssl.SSLException r3 = new javax.net.ssl.SSLException     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            r3.<init>(r0)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            r1 = 110(0x6e, float:1.54E-43)
            X.6zV r0 = new X.6zV     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            r0.<init>(r3, r1)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            X.6n2 r12 = new X.6n2     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            goto L_0x0593
        L_0x04fe:
            r0 = 42
            X.7SO r0 = r3.A00(r0)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            if (r0 == 0) goto L_0x0513
            boolean r0 = r13.A0Z     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            if (r0 == 0) goto L_0x0570
            X.8P3 r0 = r13.A0C     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            com.whatsapp.net.tls13.WtCachedPsk r0 = r0.A03     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            if (r0 == 0) goto L_0x0513
            r0 = 1
            r13.A0f = r0     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
        L_0x0513:
            java.util.Set r1 = X.C155667fH.A02     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            java.util.Map r0 = r3.A03     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            java.util.HashSet r0 = X.C18310x6.A0s(r0)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            r0.removeAll(r1)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            int r0 = r0.size()     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            if (r0 == 0) goto L_0x053c
            java.lang.String r4 = "Unexpected extension provided by the server"
            javax.net.ssl.SSLException r3 = new javax.net.ssl.SSLException     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            r3.<init>(r4)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            r1 = 47
            X.6zV r0 = new X.6zV     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            r0.<init>(r3, r1)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            X.6n2 r12 = new X.6n2     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            r16 = r4
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            goto L_0x0593
        L_0x053c:
            boolean r0 = r11.hasRemaining()     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            if (r0 == 0) goto L_0x0561
            java.lang.String r16 = "Encrypted extensions has excess bytes than expected"
            java.lang.String r0 = "Encrypted extensions has more bytes than expected."
            X.6zV r17 = X.C143806zV.A01(r0, r2)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            X.6n2 r12 = new X.6n2     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            goto L_0x0593
        L_0x0550:
            if (r0 == 0) goto L_0x0562
            X.8P3 r1 = r13.A0C
            java.security.cert.Certificate[] r0 = new java.security.cert.Certificate[r8]
            java.lang.Object[] r0 = r7.toArray(r0)
            java.security.cert.Certificate[] r0 = (java.security.cert.Certificate[]) r0
            r1.A01(r0)
            r13.A0b = r6
        L_0x0561:
            return
        L_0x0562:
            java.lang.String r16 = "Certificates could not be verified."
            java.lang.String r0 = "ServerCertificate verify failed."
            X.6zV r17 = X.C143806zV.A01(r0, r3)
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x0570:
            java.lang.String r16 = "Received server early data indication without sending early data."
            java.lang.String r0 = "Should not have received early data indication without sending early data."
            javax.net.ssl.SSLException r3 = new javax.net.ssl.SSLException     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            r3.<init>(r0)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            r1 = 10
            X.6zV r0 = new X.6zV     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            r0.<init>(r3, r1)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            X.6n2 r12 = new X.6n2     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            goto L_0x0593
        L_0x0588:
            java.lang.String r16 = "Server protocol is not encoded using UTF-8"
            X.6zV r17 = X.C143806zV.A03(r0)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            X.6n2 r12 = new X.6n2     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
        L_0x0593:
            throw r12     // Catch:{ 6zV -> 0x05a9, RuntimeException -> 0x0594 }
        L_0x0594:
            r0 = move-exception
            java.lang.String r16 = "Failed to parse encrypted extensions"
            java.lang.String r1 = r0.getMessage()
            java.lang.Throwable r0 = X.AnonymousClass6C8.A0h(r0)
            X.6zV r17 = X.C143806zV.A02(r1, r0, r2)
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x05a9:
            r17 = move-exception
            java.lang.String r16 = "Failed to process encrypted extensions"
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x05b2:
            java.lang.String r16 = "Unexpected event type"
            java.lang.String r0 = "Unexpected event"
            X.6zV r17 = X.C143806zV.A01(r0, r2)
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x05c0:
            boolean r0 = r1 instanceof X.C136356mX
            if (r0 == 0) goto L_0x0614
            X.8Hn r13 = (X.C171558Hn) r13
            X.8P3 r2 = r13.A0C
            long r0 = java.lang.System.currentTimeMillis()
            r2.A02 = r0
            boolean r0 = r14 instanceof X.C136556mr
            r7 = 80
            if (r0 == 0) goto L_0x0606
            java.lang.Object r6 = r14.A00
            X.7T8 r6 = (X.AnonymousClass7T8) r6
            com.whatsapp.net.tls13.WtCachedPsk r0 = r2.A03
            int r5 = r6.A00     // Catch:{ 6zV -> 0x05fd }
            long r3 = (long) r5     // Catch:{ 6zV -> 0x05fd }
            long r1 = r0.maxEarlyDataSize     // Catch:{ 6zV -> 0x05fd }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x05ef
            X.7Uz r3 = r13.A0B     // Catch:{ 6zV -> 0x05fd }
            byte[] r2 = r6.A02     // Catch:{ 6zV -> 0x05fd }
            int r1 = r6.A01     // Catch:{ 6zV -> 0x05fd }
            r0 = 23
            r3.A01(r2, r1, r5, r0)     // Catch:{ 6zV -> 0x05fd }
            return
        L_0x05ef:
            java.lang.String r16 = "Data size exceeds early data"
            java.lang.String r0 = "Data to be written more than early data size"
            X.6zV r17 = X.C143806zV.A01(r0, r7)     // Catch:{ 6zV -> 0x05fd }
            X.6n2 r12 = new X.6n2     // Catch:{ 6zV -> 0x05fd }
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ 6zV -> 0x05fd }
            throw r12     // Catch:{ 6zV -> 0x05fd }
        L_0x05fd:
            r17 = move-exception
            java.lang.String r16 = "App write for early data failed."
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x0606:
            java.lang.String r16 = "Unexpected event type"
            java.lang.String r0 = "Unexpected event"
            X.6zV r17 = X.C143806zV.A01(r0, r7)
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x0614:
            boolean r0 = r1 instanceof X.C136346mW
            if (r0 == 0) goto L_0x06b7
            X.8Hn r13 = (X.C171558Hn) r13
            X.7aJ r0 = r13.A0D     // Catch:{ 6zV -> 0x06ae }
            byte[] r3 = r0.A01()     // Catch:{ 6zV -> 0x06ae }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x06ae }
            java.lang.String r0 = "master_secret"
            byte[] r2 = X.AnonymousClass6CA.A0h(r0, r1)     // Catch:{ 6zV -> 0x06ae }
            if (r2 == 0) goto L_0x067e
            X.7Ux r1 = r13.A09     // Catch:{ 6zV -> 0x06ae }
            java.lang.String r0 = "res master"
            byte[] r2 = X.C151467Ux.A00(r1, r13, r0, r3, r2)     // Catch:{ 6zV -> 0x06ae }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x06ae }
            java.lang.String r0 = "resumption_master_secret"
            r1.put(r0, r2)     // Catch:{ 6zV -> 0x06ae }
            X.8Hm r3 = new X.8Hm     // Catch:{ 6zV -> 0x06ae }
            r3.<init>()     // Catch:{ 6zV -> 0x06ae }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x06ae }
            java.lang.String r0 = "client_app_key"
            byte[] r2 = X.AnonymousClass6CA.A0h(r0, r1)     // Catch:{ 6zV -> 0x06ae }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x06ae }
            java.lang.String r0 = "client_app_iv"
            byte[] r0 = X.AnonymousClass6CA.A0h(r0, r1)     // Catch:{ 6zV -> 0x06ae }
            r3.A00(r2, r0)     // Catch:{ 6zV -> 0x06ae }
            java.io.OutputStream r1 = r13.A0N     // Catch:{ 6zV -> 0x06ae }
            X.6n6 r0 = new X.6n6     // Catch:{ 6zV -> 0x06ae }
            r0.<init>(r3, r1)     // Catch:{ 6zV -> 0x06ae }
            r13.A0B = r0     // Catch:{ 6zV -> 0x06ae }
            X.7aO r0 = r13.A0A     // Catch:{ 6zV -> 0x06ae }
            if (r0 == 0) goto L_0x068a
            X.6uO r0 = r0.A00     // Catch:{ 6zV -> 0x06ae }
            int r0 = r0.available()     // Catch:{ 6zV -> 0x06ae }
            if (r0 <= 0) goto L_0x068a
            java.lang.String r16 = "Unexpected Messages: Found pending handshake messages"
            java.lang.String r0 = "Found unprocessed messages in handshake buffer."
            javax.net.ssl.SSLException r2 = new javax.net.ssl.SSLException     // Catch:{ 6zV -> 0x06ae }
            r2.<init>(r0)     // Catch:{ 6zV -> 0x06ae }
            r1 = 10
            X.6zV r0 = new X.6zV     // Catch:{ 6zV -> 0x06ae }
            r0.<init>(r2, r1)     // Catch:{ 6zV -> 0x06ae }
            X.6n2 r12 = new X.6n2     // Catch:{ 6zV -> 0x06ae }
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ 6zV -> 0x06ae }
        L_0x067d:
            throw r12     // Catch:{ 6zV -> 0x06ae }
        L_0x067e:
            java.lang.String r16 = "Master Secret is null"
            X.6zV r17 = X.C143806zV.A00(r16)     // Catch:{ 6zV -> 0x06ae }
            X.6n2 r12 = new X.6n2     // Catch:{ 6zV -> 0x06ae }
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ 6zV -> 0x06ae }
            goto L_0x067d
        L_0x068a:
            X.8Hm r3 = new X.8Hm     // Catch:{ 6zV -> 0x06ae }
            r3.<init>()     // Catch:{ 6zV -> 0x06ae }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x06ae }
            java.lang.String r0 = "server_app_key"
            byte[] r2 = X.AnonymousClass6CA.A0h(r0, r1)     // Catch:{ 6zV -> 0x06ae }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x06ae }
            java.lang.String r0 = "server_app_iv"
            byte[] r0 = X.AnonymousClass6CA.A0h(r0, r1)     // Catch:{ 6zV -> 0x06ae }
            r3.A00(r2, r0)     // Catch:{ 6zV -> 0x06ae }
            java.io.InputStream r2 = r13.A0M     // Catch:{ 6zV -> 0x06ae }
            X.6uO r1 = r13.A08     // Catch:{ 6zV -> 0x06ae }
            X.6n4 r0 = new X.6n4     // Catch:{ 6zV -> 0x06ae }
            r0.<init>(r3, r1, r2)     // Catch:{ 6zV -> 0x06ae }
            r13.A0A = r0     // Catch:{ 6zV -> 0x06ae }
            return
        L_0x06ae:
            r17 = move-exception
            java.lang.String r16 = "Failed to derive resumption keys"
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x06b7:
            boolean r0 = r1 instanceof X.C136336mV
            if (r0 == 0) goto L_0x07f4
            X.8Hn r13 = (X.C171558Hn) r13
            java.lang.String r6 = "finished"
            java.lang.String r4 = "derived_secret"
            java.lang.String r7 = "derived"
            X.C136396mb.A00(r13)
            X.7aJ r0 = r13.A0D     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            byte[] r3 = r0.A01()     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            X.7TD r0 = r13.A0G     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            byte[] r2 = r13.A0m     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            byte[] r1 = r13.A0h     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            X.7jm r0 = r0.A00     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            byte[] r2 = r0.A02(r2, r1)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            int r8 = r13.A02     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            byte[] r5 = new byte[r8]     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            X.8P3 r0 = r13.A0C     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            com.whatsapp.net.tls13.WtCachedPsk r1 = r0.A03     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            if (r1 == 0) goto L_0x06e8
            boolean r0 = r13.A0g     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            if (r0 == 0) goto L_0x06e8
            byte[] r5 = r1.pskVal     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
        L_0x06e8:
            X.7Ux r1 = r13.A09     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            byte[] r0 = new byte[r8]     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            byte[] r5 = r1.A01(r0, r5)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.lang.String r0 = "early_secret"
            r1.put(r0, r5)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.lang.String r0 = r13.A0P     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.security.MessageDigest r8 = java.security.MessageDigest.getInstance(r0)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            X.7Ux r1 = r13.A09     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            byte[] r0 = r8.digest()     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            byte[] r1 = X.C151467Ux.A00(r1, r13, r7, r0, r5)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.util.Map r0 = r13.A0U     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            r0.put(r4, r1)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            X.7Ux r0 = r13.A09     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            byte[] r5 = r0.A01(r1, r2)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.lang.String r0 = "handshake_secret"
            r1.put(r0, r5)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            X.7Ux r1 = r13.A09     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.lang.String r0 = "c hs traffic"
            byte[] r2 = X.C151467Ux.A00(r1, r13, r0, r3, r5)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.lang.String r0 = "client_hs_traffic_secret"
            r1.put(r0, r2)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            X.7Ux r1 = r13.A09     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.lang.String r0 = "s hs traffic"
            byte[] r3 = X.C151467Ux.A00(r1, r13, r0, r3, r5)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.lang.String r0 = "server_hs_traffic_secret"
            r1.put(r0, r3)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            X.7Ux r1 = r13.A09     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            byte[] r0 = r8.digest()     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            byte[] r1 = X.C151467Ux.A00(r1, r13, r7, r0, r5)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.util.Map r0 = r13.A0U     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            r0.put(r4, r1)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            X.7Ux r0 = r13.A09     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            r7 = 0
            byte[] r4 = X.C136396mb.A02(r0, r2)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.lang.String r0 = "client_hs_key"
            r1.put(r0, r4)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            X.7Ux r0 = r13.A09     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            byte[] r4 = X.C136396mb.A01(r0, r2)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.lang.String r0 = "client_hs_iv"
            r1.put(r0, r4)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            X.7Ux r0 = r13.A09     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            byte[] r5 = X.C136396mb.A02(r0, r3)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.lang.String r0 = "server_hs_key"
            r1.put(r0, r5)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            X.7Ux r0 = r13.A09     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            byte[] r4 = X.C136396mb.A01(r0, r3)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.lang.String r0 = "server_hs_iv"
            r1.put(r0, r4)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            X.7Ux r1 = r13.A09     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            byte[] r0 = new byte[r7]     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            byte[] r2 = X.C151467Ux.A00(r1, r13, r6, r0, r2)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.lang.String r0 = "client_finished"
            r1.put(r0, r2)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            X.7Ux r1 = r13.A09     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            byte[] r0 = new byte[r7]     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            byte[] r2 = X.C151467Ux.A00(r1, r13, r6, r0, r3)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            java.lang.String r0 = "server_finished"
            r1.put(r0, r2)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            X.8Hm r3 = new X.8Hm     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            r3.<init>()     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            r3.A00(r5, r4)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            X.7aO r0 = r13.A0A     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            if (r0 == 0) goto L_0x07c5
            X.6uO r0 = r0.A00     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            int r0 = r0.available()     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            if (r0 <= 0) goto L_0x07c5
            java.lang.String r16 = "Unexpected Messages: Found pending handshake messages"
            java.lang.String r0 = "Found unprocessed messages in handshake buffer."
            javax.net.ssl.SSLException r2 = new javax.net.ssl.SSLException     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            r2.<init>(r0)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            r1 = 10
            X.6zV r0 = new X.6zV     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            r0.<init>(r2, r1)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            X.6n2 r12 = new X.6n2     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            throw r12     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
        L_0x07c5:
            java.io.InputStream r2 = r13.A0M     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            X.6uO r1 = r13.A08     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            X.6n4 r0 = new X.6n4     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            r0.<init>(r3, r1, r2)     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            r13.A0A = r0     // Catch:{ 6zV -> 0x07eb, NoSuchAlgorithmException -> 0x07d1 }
            return
        L_0x07d1:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r13.A0P
            r1.append(r0)
            java.lang.String r0 = " algorithm not found"
            java.lang.String r16 = X.AnonymousClass000.A0X(r0, r1)
            X.6zV r17 = X.C143806zV.A04(r2)
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x07eb:
            r17 = move-exception
            java.lang.String r16 = "Failed in action handshake traffic keys"
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x07f4:
            boolean r0 = r1 instanceof X.C136326mU
            if (r0 == 0) goto L_0x0853
            X.8Hn r13 = (X.C171558Hn) r13
            X.8P3 r2 = r13.A0C
            long r0 = java.lang.System.currentTimeMillis()
            r2.A02 = r0
            com.whatsapp.net.tls13.WtCachedPsk r0 = r2.A03     // Catch:{ 6zV -> 0x084a }
            byte[] r2 = r0.pskVal     // Catch:{ 6zV -> 0x084a }
            X.7Ux r1 = r13.A09     // Catch:{ 6zV -> 0x084a }
            int r0 = r13.A02     // Catch:{ 6zV -> 0x084a }
            byte[] r0 = new byte[r0]     // Catch:{ 6zV -> 0x084a }
            byte[] r3 = r1.A01(r0, r2)     // Catch:{ 6zV -> 0x084a }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x084a }
            java.lang.String r0 = "early_secret"
            r1.put(r0, r3)     // Catch:{ 6zV -> 0x084a }
            X.7Ux r2 = r13.A09     // Catch:{ 6zV -> 0x084a }
            java.lang.String r1 = "c e traffic"
            X.7aJ r0 = r13.A0D     // Catch:{ 6zV -> 0x084a }
            byte[] r0 = r0.A01()     // Catch:{ 6zV -> 0x084a }
            byte[] r2 = X.C151467Ux.A00(r2, r13, r1, r0, r3)     // Catch:{ 6zV -> 0x084a }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x084a }
            java.lang.String r0 = "client_early_traffic_secret"
            r1.put(r0, r2)     // Catch:{ 6zV -> 0x084a }
            X.7Ux r0 = r13.A09     // Catch:{ 6zV -> 0x084a }
            byte[] r1 = X.C136396mb.A02(r0, r2)     // Catch:{ 6zV -> 0x084a }
            X.7Ux r0 = r13.A09     // Catch:{ 6zV -> 0x084a }
            byte[] r0 = X.C136396mb.A01(r0, r2)     // Catch:{ 6zV -> 0x084a }
            X.8Hm r2 = new X.8Hm     // Catch:{ 6zV -> 0x084a }
            r2.<init>()     // Catch:{ 6zV -> 0x084a }
            r2.A00(r1, r0)     // Catch:{ 6zV -> 0x084a }
            java.io.OutputStream r1 = r13.A0N     // Catch:{ 6zV -> 0x084a }
            X.6n6 r0 = new X.6n6     // Catch:{ 6zV -> 0x084a }
            r0.<init>(r2, r1)     // Catch:{ 6zV -> 0x084a }
            r13.A0B = r0     // Catch:{ 6zV -> 0x084a }
            return
        L_0x084a:
            r17 = move-exception
            java.lang.String r16 = "Failed in action early data keys"
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x0853:
            boolean r0 = r1 instanceof X.C136316mT
            if (r0 == 0) goto L_0x08f4
            X.8Hn r13 = (X.C171558Hn) r13
            X.C136396mb.A00(r13)
            X.7aJ r0 = r13.A0D     // Catch:{ 6zV -> 0x08eb }
            byte[] r4 = r0.A01()     // Catch:{ 6zV -> 0x08eb }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x08eb }
            java.lang.String r0 = "derived_secret"
            byte[] r2 = X.AnonymousClass6CA.A0h(r0, r1)     // Catch:{ 6zV -> 0x08eb }
            if (r2 == 0) goto L_0x08df
            X.7Ux r1 = r13.A09     // Catch:{ 6zV -> 0x08eb }
            int r0 = r13.A02     // Catch:{ 6zV -> 0x08eb }
            byte[] r0 = new byte[r0]     // Catch:{ 6zV -> 0x08eb }
            byte[] r3 = r1.A01(r2, r0)     // Catch:{ 6zV -> 0x08eb }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x08eb }
            java.lang.String r0 = "master_secret"
            r1.put(r0, r3)     // Catch:{ 6zV -> 0x08eb }
            X.7Ux r1 = r13.A09     // Catch:{ 6zV -> 0x08eb }
            java.lang.String r0 = "c ap traffic"
            byte[] r5 = X.C151467Ux.A00(r1, r13, r0, r4, r3)     // Catch:{ 6zV -> 0x08eb }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x08eb }
            java.lang.String r0 = "client_app_traffic_secret"
            r1.put(r0, r5)     // Catch:{ 6zV -> 0x08eb }
            X.7Ux r0 = r13.A09     // Catch:{ 6zV -> 0x08eb }
            byte[] r2 = X.C136396mb.A02(r0, r5)     // Catch:{ 6zV -> 0x08eb }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x08eb }
            java.lang.String r0 = "client_app_key"
            r1.put(r0, r2)     // Catch:{ 6zV -> 0x08eb }
            X.7Ux r0 = r13.A09     // Catch:{ 6zV -> 0x08eb }
            byte[] r2 = X.C136396mb.A01(r0, r5)     // Catch:{ 6zV -> 0x08eb }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x08eb }
            java.lang.String r0 = "client_app_iv"
            r1.put(r0, r2)     // Catch:{ 6zV -> 0x08eb }
            X.7Ux r1 = r13.A09     // Catch:{ 6zV -> 0x08eb }
            java.lang.String r0 = "s ap traffic"
            byte[] r5 = X.C151467Ux.A00(r1, r13, r0, r4, r3)     // Catch:{ 6zV -> 0x08eb }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x08eb }
            java.lang.String r0 = "server_app_traffic_secret"
            r1.put(r0, r5)     // Catch:{ 6zV -> 0x08eb }
            X.7Ux r0 = r13.A09     // Catch:{ 6zV -> 0x08eb }
            byte[] r2 = X.C136396mb.A02(r0, r5)     // Catch:{ 6zV -> 0x08eb }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x08eb }
            java.lang.String r0 = "server_app_key"
            r1.put(r0, r2)     // Catch:{ 6zV -> 0x08eb }
            X.7Ux r0 = r13.A09     // Catch:{ 6zV -> 0x08eb }
            byte[] r2 = X.C136396mb.A01(r0, r5)     // Catch:{ 6zV -> 0x08eb }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x08eb }
            java.lang.String r0 = "server_app_iv"
            r1.put(r0, r2)     // Catch:{ 6zV -> 0x08eb }
            X.7Ux r1 = r13.A09     // Catch:{ 6zV -> 0x08eb }
            java.lang.String r0 = "exp master"
            byte[] r2 = X.C151467Ux.A00(r1, r13, r0, r4, r3)     // Catch:{ 6zV -> 0x08eb }
            java.util.Map r1 = r13.A0U     // Catch:{ 6zV -> 0x08eb }
            java.lang.String r0 = "exporter_master_secret"
            r1.put(r0, r2)     // Catch:{ 6zV -> 0x08eb }
            return
        L_0x08df:
            java.lang.String r16 = "Derived secret not found."
            X.6zV r17 = X.C143806zV.A00(r16)     // Catch:{ 6zV -> 0x08eb }
            X.6n2 r12 = new X.6n2     // Catch:{ 6zV -> 0x08eb }
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ 6zV -> 0x08eb }
            throw r12     // Catch:{ 6zV -> 0x08eb }
        L_0x08eb:
            r17 = move-exception
            java.lang.String r16 = "Failed to derive app traffic keys"
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x08f4:
            boolean r0 = r1 instanceof X.C136306mS
            if (r0 == 0) goto L_0x094e
            X.8Hn r13 = (X.C171558Hn) r13
            boolean r0 = r14 instanceof X.C136516mn
            if (r0 == 0) goto L_0x0940
            java.lang.Object r0 = r14.A00
            byte[] r0 = (byte[]) r0
            byte[] r0 = X.C154377d4.A00(r0)     // Catch:{ 6zV -> 0x0937 }
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ 6zV -> 0x0937 }
            int r0 = X.AnonymousClass6CA.A07(r1)     // Catch:{ 6zV -> 0x0937 }
            short r0 = (short) r0     // Catch:{ 6zV -> 0x0937 }
            short r0 = (short) r0     // Catch:{ 6zV -> 0x0937 }
            if (r0 != 0) goto L_0x091f
            byte[] r1 = X.C162257rX.A0C(r1)     // Catch:{ 6zV -> 0x0937 }
            X.7k8 r0 = new X.7k8     // Catch:{ 6zV -> 0x0937 }
            r0.<init>(r1)     // Catch:{ 6zV -> 0x0937 }
            r0 = 1
            r13.A0X = r0
            return
        L_0x091f:
            java.lang.String r16 = "Certificate context is not expected"
            java.lang.String r0 = "Certificate context is not expected."
            javax.net.ssl.SSLException r2 = new javax.net.ssl.SSLException     // Catch:{ 6zV -> 0x0937 }
            r2.<init>(r0)     // Catch:{ 6zV -> 0x0937 }
            r1 = 10
            X.6zV r0 = new X.6zV     // Catch:{ 6zV -> 0x0937 }
            r0.<init>(r2, r1)     // Catch:{ 6zV -> 0x0937 }
            X.6n2 r12 = new X.6n2     // Catch:{ 6zV -> 0x0937 }
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ 6zV -> 0x0937 }
            throw r12     // Catch:{ 6zV -> 0x0937 }
        L_0x0937:
            r17 = move-exception
            java.lang.String r16 = "Failed to process certificate request "
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x0940:
            java.lang.String r16 = "Unexpected event type"
            java.lang.String r0 = "Unexpected event"
            X.6zV r17 = X.C143806zV.A00(r0)
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x094e:
            boolean r0 = r1 instanceof X.C136296mR
            if (r0 == 0) goto L_0x0984
            X.8Hn r13 = (X.C171558Hn) r13
            X.C136396mb.A00(r13)
            boolean r0 = r14 instanceof X.C136506mm
            if (r0 == 0) goto L_0x0976
            java.lang.Object r0 = r14.A00
            X.7T8 r0 = (X.AnonymousClass7T8) r0
            X.7Uz r4 = r13.A0B     // Catch:{ 6zV -> 0x096d }
            byte[] r3 = r0.A02     // Catch:{ 6zV -> 0x096d }
            int r2 = r0.A01     // Catch:{ 6zV -> 0x096d }
            int r1 = r0.A00     // Catch:{ 6zV -> 0x096d }
            r0 = 23
            r4.A01(r3, r2, r1, r0)     // Catch:{ 6zV -> 0x096d }
            return
        L_0x096d:
            r17 = move-exception
            java.lang.String r16 = "App write failed."
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x0976:
            java.lang.String r16 = "Unexpected event type"
            java.lang.String r0 = "Unexpected event"
            X.6zV r17 = X.C143806zV.A00(r0)
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x0984:
            boolean r0 = r1 instanceof X.C136286mQ
            X.8Hn r13 = (X.C171558Hn) r13
            if (r0 == 0) goto L_0x09c7
            X.C136396mb.A00(r13)
            boolean r0 = r14 instanceof X.C136496ml
            if (r0 == 0) goto L_0x09b9
            java.lang.Object r3 = r14.A00
            byte[] r3 = (byte[]) r3
            if (r3 == 0) goto L_0x09a8
            X.8oz r2 = r13.A07     // Catch:{ IOException -> 0x099f }
            int r1 = r3.length     // Catch:{ IOException -> 0x099f }
            r0 = 0
            r2.Ax5(r3, r0, r1)     // Catch:{ IOException -> 0x099f }
            return
        L_0x099f:
            r17 = move-exception
            java.lang.String r16 = "App read failed."
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x09a8:
            java.lang.String r1 = "App read failed."
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException
            r0.<init>(r1)
            X.6n2 r12 = new X.6n2
            r16 = r1
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x09b9:
            java.lang.String r16 = "Unexpected event type"
            java.lang.String r0 = "Unexpected event"
            X.6zV r17 = X.C143806zV.A00(r0)
            X.6n2 r12 = new X.6n2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            throw r12
        L_0x09c7:
            X.C136396mb.A00(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C150447Qt.A03(X.8jK, X.7EH, X.7Nz, int):void");
    }
}
