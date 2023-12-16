package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.3cW  reason: invalid class name and case insensitive filesystem */
public class C71693cW implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public String A07;
    public final int A08 = 3;

    public C71693cW(C60272yH r2, AnonymousClass4EJ r3, C54662p5 r4, AnonymousClass3MU r5, Integer num, String str, PublicKey publicKey, X509Certificate x509Certificate) {
        C162457s7.A0J(x509Certificate, 2);
        C18260x0.A0U(r3, r4);
        this.A05 = r5;
        this.A01 = x509Certificate;
        this.A06 = r2;
        this.A04 = publicKey;
        this.A03 = num;
        this.A00 = r3;
        this.A02 = r4;
        this.A07 = str;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01d2, code lost:
        if (r2.A03() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01d4, code lost:
        r2 = (X.C186568vZ) r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01dc, code lost:
        if (r2.BFG() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01de, code lost:
        ((X.AnonymousClass4FX) r1.A03).Bqy(r2.B4R());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01e9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01f2, code lost:
        if (r4 == null) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        r4.Bkn(r1, r0, 50);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ba, code lost:
        if (r5.length < r10) goto L_0x00bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01af A[SYNTHETIC, Splitter:B:100:0x01af] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01b5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01b5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016d A[SYNTHETIC, Splitter:B:76:0x016d] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x017f A[Catch:{ Exception -> 0x01a3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r1 = r22
            int r0 = r1.A08
            switch(r0) {
                case 0: goto L_0x0200;
                case 1: goto L_0x0265;
                case 2: goto L_0x0287;
                default: goto L_0x0007;
            }
        L_0x0007:
            r3 = 0
        L_0x0008:
            java.lang.Object r2 = r1.A01
            X.337 r2 = (X.AnonymousClass337) r2
            boolean r0 = r2.A03()
            if (r0 == 0) goto L_0x01ce
            java.lang.Object r7 = r1.A00
            X.8vZ r7 = (X.C186568vZ) r7
            boolean r0 = r7.BFG()
            if (r0 == 0) goto L_0x01ce
            int r20 = r3 + 1
            r0 = 20
            if (r3 >= r0) goto L_0x01ce
            java.lang.Integer r10 = r7.Bgc()
            if (r10 == 0) goto L_0x006b
            java.lang.Object r0 = r1.A04
            X.2yI r0 = (X.C60282yI) r0
            java.util.concurrent.ConcurrentHashMap r6 = r0.A08
            java.lang.Object r0 = r6.get(r10)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            r4 = 0
            if (r0 == 0) goto L_0x003e
            int r0 = r0.get()
            if (r0 <= 0) goto L_0x003e
            r4 = 1
        L_0x003e:
            r2 = 50
            if (r4 == 0) goto L_0x006c
            java.lang.Long r0 = r7.Bgb()
            if (r0 == 0) goto L_0x006b
            long r8 = java.lang.System.nanoTime()
            long r4 = r0.longValue()
            long r8 = r8 - r4
            r4 = 200000000(0xbebc200, double:9.8813129E-316)
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x006c
            java.lang.Object r4 = r1.A06
            X.4FS r4 = (X.AnonymousClass4FS) r4
            java.util.Objects.requireNonNull(r7)
            r0 = 15
            X.3Zp r1 = new X.3Zp
            r1.<init>(r7, r0)
            java.lang.String r0 = "QplFSWriter/write-closed-markers"
        L_0x0068:
            r4.Bkn(r1, r0, r2)
        L_0x006b:
            return
        L_0x006c:
            r6.remove(r10)
            java.lang.Object r6 = r1.A02
            X.2yF r6 = (X.C60252yF) r6
            java.util.concurrent.Semaphore r0 = r6.A05
            r21 = r0
            boolean r0 = r21.tryAcquire()
            if (r0 == 0) goto L_0x01bc
            java.lang.String r8 = r7.Bgy()     // Catch:{ all -> 0x01fb }
            if (r8 != 0) goto L_0x0085
            goto L_0x01ea
        L_0x0085:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = "QplFSWriter/run: Finished qpl json - "
            X.C18260x0.A0q(r0, r8, r2)     // Catch:{ all -> 0x01fb }
            java.lang.String r12 = "2.23.26.14"
            r4 = 0
            X.2oU r0 = r6.A01     // Catch:{ Exception -> 0x01a3 }
            java.io.File r2 = X.C54292oU.A02(r0)     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r0 = "qpl"
            java.io.File r13 = X.AnonymousClass0x7.A0e(r2, r0)     // Catch:{ Exception -> 0x01a3 }
            X.337 r0 = r6.A02     // Catch:{ Exception -> 0x01a3 }
            X.1VX r3 = r0.A00     // Catch:{ Exception -> 0x01a3 }
            r0 = 213(0xd5, float:2.98E-43)
            X.2vE r2 = X.C58422vE.A02     // Catch:{ Exception -> 0x01a3 }
            int r11 = r3.A0O(r2, r0)     // Catch:{ Exception -> 0x01a3 }
            r0 = 214(0xd6, float:3.0E-43)
            int r10 = r3.A0O(r2, r0)     // Catch:{ Exception -> 0x01a3 }
            java.io.File[] r5 = r13.listFiles()     // Catch:{ Exception -> 0x01a3 }
            r7 = 1
            if (r5 == 0) goto L_0x00bc
            int r0 = r5.length     // Catch:{ Exception -> 0x01a3 }
            r19 = 0
            if (r0 >= r10) goto L_0x00be
        L_0x00bc:
            r19 = 1
        L_0x00be:
            java.io.File r9 = r6.A06     // Catch:{ Exception -> 0x01a3 }
            r17 = 1024(0x400, double:5.06E-321)
            if (r9 == 0) goto L_0x00e1
            boolean r0 = r9.exists()     // Catch:{ Exception -> 0x01a3 }
            if (r0 == 0) goto L_0x00e1
            long r14 = r9.length()     // Catch:{ Exception -> 0x01a3 }
            long r14 = r14 / r17
            long r2 = (long) r11     // Catch:{ Exception -> 0x01a3 }
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e1
        L_0x00d5:
            java.io.FileWriter r0 = new java.io.FileWriter     // Catch:{ Exception -> 0x01a3 }
            r0.<init>(r9, r7)     // Catch:{ Exception -> 0x01a3 }
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ Exception -> 0x01a3 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x01a3 }
            goto L_0x0181
        L_0x00e1:
            r6.A06 = r4     // Catch:{ Exception -> 0x01a3 }
            r14 = 0
        L_0x00e4:
            if (r14 >= r10) goto L_0x019d
            java.util.Locale r3 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x01a3 }
            r0 = 0
            java.lang.Object[] r2 = X.C18310x6.A1b(r12, r0)     // Catch:{ Exception -> 0x01a3 }
            X.AnonymousClass000.A1P(r2, r14, r7)     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r0 = "qpl_%s_%d.txt"
            java.lang.String r15 = java.lang.String.format(r3, r0, r2)     // Catch:{ Exception -> 0x01a3 }
            if (r5 == 0) goto L_0x011d
            int r3 = r5.length     // Catch:{ Exception -> 0x01a3 }
            r2 = 0
        L_0x00fb:
            if (r2 >= r3) goto L_0x011d
            r9 = r5[r2]     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r0 = r9.getName()     // Catch:{ Exception -> 0x01a3 }
            boolean r0 = r0.equals(r15)     // Catch:{ Exception -> 0x01a3 }
            if (r0 == 0) goto L_0x0117
            long r15 = r9.length()     // Catch:{ Exception -> 0x01a3 }
            long r15 = r15 / r17
            long r2 = (long) r11     // Catch:{ Exception -> 0x01a3 }
            int r0 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x011a
            r6.A06 = r9     // Catch:{ Exception -> 0x01a3 }
            goto L_0x00d5
        L_0x0117:
            int r2 = r2 + 1
            goto L_0x00fb
        L_0x011a:
            int r14 = r14 + 1
            goto L_0x00e4
        L_0x011d:
            if (r19 == 0) goto L_0x0120
            goto L_0x0128
        L_0x0120:
            X.4FX r0 = r6.A04     // Catch:{ Exception -> 0x01a3 }
            r0.BKs()     // Catch:{ Exception -> 0x01a3 }
            r6.A06 = r4     // Catch:{ Exception -> 0x01a3 }
            goto L_0x00e4
        L_0x0128:
            java.io.File r9 = X.AnonymousClass002.A0A(r13, r15)     // Catch:{ Exception -> 0x0160, all -> 0x0191 }
            java.io.FileWriter r0 = new java.io.FileWriter     // Catch:{ Exception -> 0x0160, all -> 0x0191 }
            r0.<init>(r9, r7)     // Catch:{ Exception -> 0x0160, all -> 0x0191 }
            java.io.PrintWriter r5 = new java.io.PrintWriter     // Catch:{ Exception -> 0x0160, all -> 0x0191 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0160, all -> 0x0191 }
            X.2SW r11 = r6.A03     // Catch:{ Exception -> 0x015e }
            org.json.JSONObject r10 = X.AnonymousClass0x9.A1G()     // Catch:{ Exception -> 0x014e }
            java.lang.String r0 = "app_version"
            r10.put(r0, r12)     // Catch:{ Exception -> 0x014e }
            java.lang.String r0 = "app_build_number"
            r2 = 546598543(0x20946e8f, double:2.70055562E-315)
            r10.put(r0, r2)     // Catch:{ Exception -> 0x014e }
            java.lang.String r0 = r10.toString()     // Catch:{ Exception -> 0x014e }
            goto L_0x015a
        L_0x014e:
            r0 = move-exception
            X.4FX r3 = r11.A04     // Catch:{ Exception -> 0x015e }
            r2 = -1
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x015e }
            r3.BJT(r2, r0)     // Catch:{ Exception -> 0x015e }
            r0 = 0
        L_0x015a:
            r5.println(r0)     // Catch:{ Exception -> 0x015e }
            goto L_0x0175
        L_0x015e:
            r0 = move-exception
            goto L_0x0162
        L_0x0160:
            r0 = move-exception
            r5 = r4
        L_0x0162:
            X.4FX r2 = r6.A04     // Catch:{ all -> 0x0193 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0193 }
            r2.B2h(r0)     // Catch:{ all -> 0x0193 }
            if (r5 == 0) goto L_0x0173
            r5.flush()     // Catch:{ Exception -> 0x01a3 }
            r5.close()     // Catch:{ Exception -> 0x01a3 }
        L_0x0173:
            r9 = r4
            goto L_0x017b
        L_0x0175:
            r5.flush()     // Catch:{ Exception -> 0x01a3 }
            r5.close()     // Catch:{ Exception -> 0x01a3 }
        L_0x017b:
            r6.A06 = r9     // Catch:{ Exception -> 0x01a3 }
            if (r9 == 0) goto L_0x01b5
            goto L_0x00d5
        L_0x0181:
            r2.println()     // Catch:{ Exception -> 0x018e, all -> 0x01ee }
            r2.println(r8)     // Catch:{ Exception -> 0x018e, all -> 0x01ee }
            r2.flush()     // Catch:{ all -> 0x01fb }
            r2.close()     // Catch:{ all -> 0x01fb }
            goto L_0x01b5
        L_0x018e:
            r0 = move-exception
            r4 = r2
            goto L_0x01a4
        L_0x0191:
            r0 = move-exception
            goto L_0x019c
        L_0x0193:
            r0 = move-exception
            if (r5 == 0) goto L_0x019c
            r5.flush()     // Catch:{ Exception -> 0x01a3 }
            r5.close()     // Catch:{ Exception -> 0x01a3 }
        L_0x019c:
            throw r0     // Catch:{ Exception -> 0x01a3 }
        L_0x019d:
            X.4FX r0 = r6.A04     // Catch:{ Exception -> 0x01a3 }
            r0.BKs()     // Catch:{ Exception -> 0x01a3 }
            goto L_0x01b5
        L_0x01a3:
            r0 = move-exception
        L_0x01a4:
            X.4FX r2 = r6.A04     // Catch:{ all -> 0x01f1 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01f1 }
            r2.B2h(r0)     // Catch:{ all -> 0x01f1 }
            if (r4 == 0) goto L_0x01b5
            r4.flush()     // Catch:{ all -> 0x01fb }
            r4.close()     // Catch:{ all -> 0x01fb }
        L_0x01b5:
            r21.release()
            r3 = r20
            goto L_0x0008
        L_0x01bc:
            java.lang.Object r4 = r1.A06
            X.4FS r4 = (X.AnonymousClass4FS) r4
            java.util.Objects.requireNonNull(r7)
            r0 = 15
            X.3Zp r1 = new X.3Zp
            r1.<init>(r7, r0)
            java.lang.String r0 = "QplFSWriter/write-closed-markers-2"
            goto L_0x0068
        L_0x01ce:
            boolean r0 = r2.A03()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r2 = r1.A00
            X.8vZ r2 = (X.C186568vZ) r2
            boolean r0 = r2.BFG()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r1 = r1.A03
            X.4FX r1 = (X.AnonymousClass4FX) r1
            java.util.Collection r0 = r2.B4R()
            r1.Bqy(r0)
            return
        L_0x01ea:
            r21.release()
            return
        L_0x01ee:
            r0 = move-exception
            r4 = r2
            goto L_0x01f4
        L_0x01f1:
            r0 = move-exception
            if (r4 == 0) goto L_0x01fa
        L_0x01f4:
            r4.flush()     // Catch:{ all -> 0x01fb }
            r4.close()     // Catch:{ all -> 0x01fb }
        L_0x01fa:
            throw r0     // Catch:{ all -> 0x01fb }
        L_0x01fb:
            r0 = move-exception
            r21.release()
            throw r0
        L_0x0200:
            java.lang.Object r9 = r1.A00
            X.36F r9 = (X.AnonymousClass36F) r9
            java.lang.String r8 = r1.A07
            java.lang.Object r6 = r1.A01
            X.4FS r6 = (X.AnonymousClass4FS) r6
            java.lang.Object r5 = r1.A02
            X.3Lv r5 = (X.C66543Lv) r5
            java.lang.Object r4 = r1.A03
            X.4DV r4 = (X.AnonymousClass4DV) r4
            java.lang.Object r3 = r1.A04
            X.3Wi r3 = (X.C69263Wi) r3
            java.lang.Object r2 = r1.A05
            X.4Cp r2 = (X.C84504Cp) r2
            java.lang.Object r7 = r1.A06
            X.49q r7 = (X.C837549q) r7
            java.util.List r0 = java.util.Collections.singletonList(r8)
            java.util.List r1 = r9.A0T(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0245
            java.lang.Object r0 = X.C18290x4.A0k(r1)
            X.34w r0 = (X.C624034w) r0
            int r1 = r0.A02
            java.util.Set r0 = X.AnonymousClass35F.A01
            boolean r0 = X.C18300x5.A1X(r0, r1)
            if (r0 == 0) goto L_0x0250
            X.3Ra r0 = new X.3Ra
            r0.<init>(r5, r2, r4, r6)
            r7.BlS(r0, r8)
            return
        L_0x0245:
            r0 = 23
            X.C71343bx.A00(r6, r4, r5, r0)
            java.util.Objects.requireNonNull(r2)
            r0 = 34
            goto L_0x025d
        L_0x0250:
            java.util.Set r0 = X.AnonymousClass35F.A00
            boolean r0 = X.C18300x5.A1X(r0, r1)
            if (r0 == 0) goto L_0x0245
            java.util.Objects.requireNonNull(r2)
            r0 = 35
        L_0x025d:
            X.3Zk r0 = X.C69983Zk.A00(r2, r0)
            r3.A0S(r0)
            return
        L_0x0265:
            java.lang.Object r8 = r1.A01
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8
            java.lang.Object r2 = r1.A06
            X.2yH r2 = (X.C60272yH) r2
            java.lang.Object r7 = r1.A04
            java.security.PublicKey r7 = (java.security.PublicKey) r7
            java.lang.Object r5 = r1.A03
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r3 = r1.A00
            X.4EJ r3 = (X.AnonymousClass4EJ) r3
            java.lang.Object r4 = r1.A02
            X.2p5 r4 = (X.C54662p5) r4
            java.lang.String r6 = r1.A07
            java.lang.Object r1 = r1.A05
            X.3MU r1 = (X.AnonymousClass3MU) r1
            r1.Bgp(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0287:
            java.lang.Object r8 = r1.A01
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8
            java.lang.Object r2 = r1.A06
            X.2yH r2 = (X.C60272yH) r2
            java.lang.Object r7 = r1.A04
            java.security.PublicKey r7 = (java.security.PublicKey) r7
            java.lang.Object r5 = r1.A03
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r3 = r1.A00
            X.4EJ r3 = (X.AnonymousClass4EJ) r3
            java.lang.Object r4 = r1.A02
            X.2p5 r4 = (X.C54662p5) r4
            java.lang.String r6 = r1.A07
            java.lang.Object r1 = r1.A05
            X.3MX r1 = (X.AnonymousClass3MX) r1
            r1.Bgp(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71693cW.run():void");
    }

    public C71693cW(C60272yH r2, AnonymousClass4EJ r3, C54662p5 r4, AnonymousClass3MX r5, Integer num, String str, PublicKey publicKey, X509Certificate x509Certificate) {
        C162457s7.A0J(x509Certificate, 2);
        C18260x0.A0U(r3, r4);
        this.A05 = r5;
        this.A01 = x509Certificate;
        this.A06 = r2;
        this.A04 = publicKey;
        this.A03 = num;
        this.A00 = r3;
        this.A02 = r4;
        this.A07 = str;
    }

    public C71693cW(C56612sH r2, AnonymousClass337 r3, C60252yF r4, AnonymousClass4FX r5, C60282yI r6, C186568vZ r7, AnonymousClass4FS r8) {
        this.A05 = r2;
        this.A06 = r8;
        this.A00 = r7;
        this.A03 = r5;
        this.A01 = r3;
        this.A04 = r6;
        this.A02 = r4;
        this.A07 = "2.23.26.14";
    }

    public C71693cW(C69263Wi r2, C66543Lv r3, AnonymousClass36F r4, C837549q r5, C84504Cp r6, AnonymousClass4DV r7, AnonymousClass4FS r8, String str) {
        this.A00 = r4;
        this.A07 = str;
        this.A01 = r8;
        this.A02 = r3;
        this.A03 = r7;
        this.A04 = r2;
        this.A05 = r6;
        this.A06 = r5;
    }
}
