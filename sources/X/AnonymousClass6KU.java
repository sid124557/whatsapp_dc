package X;

/* renamed from: X.6KU  reason: invalid class name */
public class AnonymousClass6KU extends AnonymousClass6KV {
    public final C186598vd A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(24:7|8|9|(7:11|(1:13)(1:28)|14|(1:16)|17|(3:19|(1:21)(1:27)|22)|23)|24|(2:26|(2:49|(4:51|(4:47|30|(1:44)(2:173|38)|45)|172|48)(1:178)))(0)|29|39|(1:41)(1:43)|42|52|(1:54)(1:59)|55|(2:57|(4:60|61|14c|(6:87|88|89|(1:91)|137|(2:141|(2:143|144)))))|110|111|112|113|114|115|116|117|(2:119|120)|(2:123|(2:125|(5:127|(1:129)|130|(2:131|(3:133|(2:135|183)(1:182)|180)(1:181))|144)(2:145|146))(1:187))(1:186)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:102|103) */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        X.C158827kc.A0A.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01d3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01d4, code lost:
        if (r6 != null) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01d6, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01d9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0239, code lost:
        if (r6 == null) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        X.C158827kc.A0K.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x025e, code lost:
        if (r1 != null) goto L_0x0260;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0265, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0266, code lost:
        if (r1 != null) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x026b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x026c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x026d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:102:0x01cd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:113:0x01eb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x0259 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C160697o9 A0C(int r22, int r23, int r24) {
        /*
            r21 = this;
            r0 = r21
            X.8vd r7 = r0.A00
            X.6Ki r7 = (X.C126006Ki) r7
            r12 = r22
            if (r22 < 0) goto L_0x02a2
            r9 = r23
            if (r23 < 0) goto L_0x029b
            r8 = r24
            int r0 = r24 + -1
            r3 = 2
            int r3 = r3 << r0
            java.lang.String r2 = " for zoom level "
            if (r12 > r3) goto L_0x028a
            if (r9 > r3) goto L_0x0279
            r6 = r7
            X.6KW r6 = (X.AnonymousClass6KW) r6
            java.lang.String r0 = r6.A00     // Catch:{ MalformedURLException -> 0x026e }
            r18 = r0
            boolean r0 = r18.isEmpty()     // Catch:{ MalformedURLException -> 0x026e }
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = "&_nc_client_caller="
            java.lang.StringBuilder r3 = X.C18330xA.A0A(r0)     // Catch:{ MalformedURLException -> 0x026e }
            X.7Pa r2 = r6.A03     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r0 = r2.A03     // Catch:{ MalformedURLException -> 0x026e }
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = android.net.Uri.encode(r0)     // Catch:{ MalformedURLException -> 0x026e }
        L_0x0037:
            r3.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r1 = r2.A04     // Catch:{ MalformedURLException -> 0x026e }
            if (r1 == 0) goto L_0x004a
            java.lang.String r0 = "&_nc_client_id="
            r3.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r0 = android.net.Uri.encode(r1)     // Catch:{ MalformedURLException -> 0x026e }
            r3.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
        L_0x004a:
            java.lang.String r0 = r6.A01     // Catch:{ MalformedURLException -> 0x026e }
            if (r0 != 0) goto L_0x0056
            boolean r0 = r2.A06     // Catch:{ MalformedURLException -> 0x026e }
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = "dark"
        L_0x0054:
            r6.A01 = r0     // Catch:{ MalformedURLException -> 0x026e }
        L_0x0056:
            java.lang.String r18 = r3.toString()     // Catch:{ MalformedURLException -> 0x026e }
            r0 = r18
            r6.A00 = r0     // Catch:{ MalformedURLException -> 0x026e }
        L_0x005e:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ MalformedURLException -> 0x026e }
            boolean r0 = X.C161247pI.A06     // Catch:{ MalformedURLException -> 0x026e }
            X.C161247pI.A02(r0)     // Catch:{ MalformedURLException -> 0x026e }
            X.7Ou r17 = X.C161247pI.A0B     // Catch:{ MalformedURLException -> 0x026e }
            r0 = r17
            java.lang.String[] r14 = r0.A05     // Catch:{ MalformedURLException -> 0x026e }
            if (r14 == 0) goto L_0x0082
            r13 = 1
            int r13 = r13 << r24
            int r0 = r14.length     // Catch:{ MalformedURLException -> 0x026e }
            r20 = r0
            r4 = 0
            goto L_0x0105
        L_0x0078:
            r0 = 0
            goto L_0x0054
        L_0x007a:
            java.lang.String r0 = "MapTileProvider"
            r3.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r0 = ".java"
            goto L_0x0037
        L_0x0082:
            r0 = r17
            java.lang.String r0 = r0.A01     // Catch:{ MalformedURLException -> 0x026e }
            goto L_0x00a6
        L_0x0087:
            r0 = r16[r4]     // Catch:{ MalformedURLException -> 0x026e }
            r11 = r0[r10]     // Catch:{ MalformedURLException -> 0x026e }
            double r0 = r11.A01     // Catch:{ MalformedURLException -> 0x026e }
            double r2 = (double) r13     // Catch:{ MalformedURLException -> 0x026e }
            double r0 = r0 * r2
            int r15 = (int) r0     // Catch:{ MalformedURLException -> 0x026e }
            if (r15 > r12) goto L_0x00fc
            double r0 = r11.A02     // Catch:{ MalformedURLException -> 0x026e }
            double r0 = r0 * r2
            int r15 = (int) r0     // Catch:{ MalformedURLException -> 0x026e }
            if (r12 > r15) goto L_0x00fc
            double r0 = r11.A03     // Catch:{ MalformedURLException -> 0x026e }
            double r0 = r0 * r2
            int r15 = (int) r0     // Catch:{ MalformedURLException -> 0x026e }
            if (r15 > r9) goto L_0x00fc
            double r0 = r11.A00     // Catch:{ MalformedURLException -> 0x026e }
            double r0 = r0 * r2
            int r2 = (int) r0     // Catch:{ MalformedURLException -> 0x026e }
            if (r9 > r2) goto L_0x00fc
            r0 = r14[r4]     // Catch:{ MalformedURLException -> 0x026e }
        L_0x00a6:
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r0 = "&x="
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
            r5.append(r12)     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r0 = "&y="
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
            r5.append(r9)     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r0 = "&z="
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
            r5.append(r8)     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r0 = "&size="
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
            int r0 = r6.A00     // Catch:{ MalformedURLException -> 0x026e }
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r0 = "&ppi="
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
            int r0 = r6.A02     // Catch:{ MalformedURLException -> 0x026e }
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r0 = "&language="
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r0 = X.C161247pI.A04     // Catch:{ MalformedURLException -> 0x026e }
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r2 = r6.A01     // Catch:{ MalformedURLException -> 0x026e }
            if (r2 == 0) goto L_0x00f9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r0 = "&theme="
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r2, r1)     // Catch:{ MalformedURLException -> 0x026e }
        L_0x00ed:
            r0 = r18
            java.lang.String r0 = X.AnonymousClass000.A0V(r1, r0, r5)     // Catch:{ MalformedURLException -> 0x026e }
            java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x026e }
            r5.<init>(r0)     // Catch:{ MalformedURLException -> 0x026e }
            goto L_0x0116
        L_0x00f9:
            java.lang.String r1 = ""
            goto L_0x00ed
        L_0x00fc:
            int r10 = r10 + 1
        L_0x00fe:
            r0 = r19
            if (r10 >= r0) goto L_0x0103
            goto L_0x0087
        L_0x0103:
            int r4 = r4 + 1
        L_0x0105:
            r0 = r20
            if (r4 >= r0) goto L_0x0082
            r0 = r17
            X.7iL[][] r0 = r0.A06     // Catch:{ MalformedURLException -> 0x026e }
            r16 = r0
            r0 = r0[r4]     // Catch:{ MalformedURLException -> 0x026e }
            int r0 = r0.length     // Catch:{ MalformedURLException -> 0x026e }
            r19 = r0
            r10 = 0
            goto L_0x00fe
        L_0x0116:
            java.lang.StringBuilder r2 = X.C18320x8.A0j(r12)
            java.lang.String r1 = "_"
            X.AnonymousClass6C8.A1C(r1, r2, r9, r8)
            r2.append(r1)
            java.lang.String r0 = X.C161247pI.A05
            r2.append(r0)
            r2.append(r1)
            X.7Ou r0 = X.C161247pI.A0B
            java.lang.String r0 = r0.A02
            r2.append(r0)
            java.lang.String r0 = r6.A01
            if (r0 == 0) goto L_0x0147
            java.lang.String r0 = X.AnonymousClass000.A0T(r1, r0)
        L_0x0139:
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r2)
            X.8Kc r0 = X.C126006Ki.A05
            if (r0 == 0) goto L_0x01dc
            X.8Kc r0 = X.C126006Ki.A05
            r3 = 0
            if (r0 == 0) goto L_0x01dc
            goto L_0x014a
        L_0x0147:
            java.lang.String r0 = ""
            goto L_0x0139
        L_0x014a:
            X.8Kc r4 = X.C126006Ki.A05     // Catch:{ IOException -> 0x01cc, all -> 0x01da }
            monitor-enter(r4)     // Catch:{ IOException -> 0x01cc, all -> 0x01da }
            java.io.Writer r0 = r4.A04     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x01c2
            X.C172208Kc.A04(r2)     // Catch:{ all -> 0x01c9 }
            java.util.LinkedHashMap r0 = r4.A0B     // Catch:{ all -> 0x01c9 }
            java.lang.Object r9 = r0.get(r2)     // Catch:{ all -> 0x01c9 }
            X.7Wv r9 = (X.C151927Wv) r9     // Catch:{ all -> 0x01c9 }
            r6 = 0
            if (r9 == 0) goto L_0x01b3
            boolean r0 = r9.A02     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x01b3
            int r11 = r4.A06     // Catch:{ all -> 0x01c9 }
            java.io.InputStream[] r8 = new java.io.InputStream[r11]     // Catch:{ all -> 0x01c9 }
            r10 = 0
            r1 = 0
        L_0x0169:
            if (r1 >= r11) goto L_0x0182
            java.io.File r0 = r9.A00()     // Catch:{ FileNotFoundException -> 0x0177 }
            java.io.FileInputStream r0 = X.AnonymousClass0x9.A0g(r0)     // Catch:{ FileNotFoundException -> 0x0177 }
            r8[r1] = r0     // Catch:{ FileNotFoundException -> 0x0177 }
            r1 = 1
            goto L_0x0169
        L_0x0177:
            if (r10 >= r11) goto L_0x01b3
            r0 = r8[r10]     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x01b3
            X.C172208Kc.A01(r0)     // Catch:{ all -> 0x01c9 }
            r10 = 1
            goto L_0x0177
        L_0x0182:
            int r0 = r4.A00     // Catch:{ all -> 0x01c9 }
            int r0 = r0 + 1
            r4.A00 = r0     // Catch:{ all -> 0x01c9 }
            java.io.Writer r6 = r4.A04     // Catch:{ all -> 0x01c9 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01c9 }
            java.lang.String r0 = "READ "
            r1.append(r0)     // Catch:{ all -> 0x01c9 }
            r1.append(r2)     // Catch:{ all -> 0x01c9 }
            r0 = 10
            java.lang.String r0 = X.AnonymousClass001.A0j(r1, r0)     // Catch:{ all -> 0x01c9 }
            r6.append(r0)     // Catch:{ all -> 0x01c9 }
            boolean r0 = r4.A07()     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x01ac
            java.util.concurrent.ThreadPoolExecutor r1 = r4.A0D     // Catch:{ all -> 0x01c9 }
            java.util.concurrent.Callable r0 = r4.A0C     // Catch:{ all -> 0x01c9 }
            r1.submit(r0)     // Catch:{ all -> 0x01c9 }
        L_0x01ac:
            long[] r0 = r9.A04     // Catch:{ all -> 0x01c9 }
            X.8KQ r6 = new X.8KQ     // Catch:{ all -> 0x01c9 }
            r6.<init>(r4, r0, r8)     // Catch:{ all -> 0x01c9 }
        L_0x01b3:
            monitor-exit(r4)     // Catch:{ IOException -> 0x01cc, all -> 0x01da }
            if (r6 == 0) goto L_0x01dc
            r1 = 0
            java.io.InputStream[] r0 = r6.A01     // Catch:{ IOException -> 0x01cd }
            r0 = r0[r1]     // Catch:{ IOException -> 0x01cd }
            if (r0 == 0) goto L_0x023b
            X.7J0 r3 = X.AnonymousClass82B.A00(r0, r1)     // Catch:{ IOException -> 0x01cd }
            goto L_0x023b
        L_0x01c2:
            java.lang.String r0 = "cache is closed"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x01c9 }
            throw r0     // Catch:{ all -> 0x01c9 }
        L_0x01c9:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ IOException -> 0x01cc, all -> 0x01da }
            throw r0     // Catch:{ IOException -> 0x01cc, all -> 0x01da }
        L_0x01cc:
            r6 = r3
        L_0x01cd:
            X.7kc r0 = X.C158827kc.A0A     // Catch:{ all -> 0x01d3 }
            r0.A01()     // Catch:{ all -> 0x01d3 }
            goto L_0x0239
        L_0x01d3:
            r0 = move-exception
            if (r6 == 0) goto L_0x01db
            r6.close()
            throw r0
        L_0x01da:
            r0 = move-exception
        L_0x01db:
            throw r0
        L_0x01dc:
            java.util.concurrent.atomic.AtomicLong r0 = r7.A01
            r0.incrementAndGet()
            r1 = 0
            long r3 = java.lang.System.nanoTime()
            java.io.InputStream r1 = r5.openStream()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01eb }
            goto L_0x01ef
        L_0x01eb:
            java.io.InputStream r1 = r5.openStream()     // Catch:{ IOException -> 0x0259, all -> 0x026c }
        L_0x01ef:
            r0 = 1
            X.7J0 r6 = X.AnonymousClass82B.A00(r1, r0)     // Catch:{ IOException -> 0x0259 }
            if (r1 == 0) goto L_0x01f9
            r1.close()     // Catch:{ IOException -> 0x01f9 }
        L_0x01f9:
            if (r6 == 0) goto L_0x0263
            java.util.concurrent.atomic.AtomicLong r5 = r7.A01
            int r0 = r6.A00
            long r0 = (long) r0
            r5.getAndAdd(r0)
            X.7kc r5 = X.C158827kc.A0L
            int r0 = r6.A00
            long r0 = (long) r0
            r5.A03(r0)
            X.7kc r0 = X.C158827kc.A0M
            X.C86614Ku.A1N(r0, r3)
            int r1 = r6.A00
            if (r1 == 0) goto L_0x0263
            byte[] r0 = r6.A02
            X.7o9 r4 = X.C160697o9.A00(r0, r1)
            if (r4 == 0) goto L_0x0255
            X.8Kc r0 = X.C126006Ki.A05
            if (r0 != 0) goto L_0x0223
            X.AnonymousClass82B.A01(r6)
        L_0x0223:
            r6.A01 = r2
        L_0x0225:
            java.util.concurrent.BlockingQueue r1 = X.C126006Ki.A03
            boolean r0 = r1.offer(r6)
            if (r0 != 0) goto L_0x0254
            java.lang.Object r0 = r1.poll()
            X.7J0 r0 = (X.AnonymousClass7J0) r0
            if (r0 == 0) goto L_0x0225
            X.AnonymousClass82B.A01(r0)
            goto L_0x0225
        L_0x0239:
            if (r6 == 0) goto L_0x01dc
        L_0x023b:
            r6.close()
            if (r3 == 0) goto L_0x01dc
            int r1 = r3.A00
            if (r1 == 0) goto L_0x01dc
            byte[] r0 = r3.A02
            X.7o9 r4 = X.C160697o9.A00(r0, r1)
            X.AnonymousClass82B.A01(r3)
            if (r4 == 0) goto L_0x01dc
            java.util.concurrent.atomic.AtomicLong r0 = r7.A00
            r0.incrementAndGet()
        L_0x0254:
            return r4
        L_0x0255:
            X.AnonymousClass82B.A01(r6)
            return r4
        L_0x0259:
            X.7kc r0 = X.C158827kc.A0K     // Catch:{ all -> 0x0265 }
            r0.A01()     // Catch:{ all -> 0x0265 }
            if (r1 == 0) goto L_0x0263
            r1.close()     // Catch:{ IOException -> 0x0263 }
        L_0x0263:
            r4 = 0
            return r4
        L_0x0265:
            r0 = move-exception
            if (r1 == 0) goto L_0x026d
            r1.close()     // Catch:{ IOException -> 0x026d }
            throw r0
        L_0x026c:
            r0 = move-exception
        L_0x026d:
            throw r0
        L_0x026e:
            r2 = move-exception
            java.lang.String r1 = "MapTileProvider"
            java.lang.String r0 = "Broken URL provided"
            android.util.Log.e(r1, r0, r2)
            X.7o9 r4 = X.C186598vd.A00
            return r4
        L_0x0279:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "y cannot exceed "
            r1.append(r0)
            r1.append(r3)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r2, r1, r8)
            throw r0
        L_0x028a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "x cannot exceed "
            r1.append(r0)
            r1.append(r3)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r2, r1, r8)
            throw r0
        L_0x029b:
            java.lang.String r0 = "y cannot deceed 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x02a2:
            java.lang.String r0 = "x cannot deceed 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6KU.A0C(int, int, int):X.7o9");
    }

    public AnonymousClass6KU(C110885hC r2, C153297b0 r3, AnonymousClass7AE r4) {
        super(r2, r3);
        this.A04 = true;
        this.A00 = r4.A00;
    }
}
