package X;

/* renamed from: X.2xG  reason: invalid class name and case insensitive filesystem */
public final class C59652xG {
    public final C55682qk A00;
    public final C56612sH A01;
    public final C54292oU A02;
    public final C54402of A03;
    public final AnonymousClass1VX A04;
    public final C72333dY A05 = C72333dY.A05(this, 17);

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.LinkedList A00(X.AnonymousClass8KP r3) {
        /*
            r1 = 0
            java.io.InputStream[] r0 = r3.A00
            r3 = r0[r1]
            int r0 = r3.available()     // Catch:{ all -> 0x0031 }
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0031 }
            r3.read(r0)     // Catch:{ all -> 0x0031 }
            java.io.ByteArrayInputStream r0 = X.AnonymousClass0x9.A0d(r0)     // Catch:{ all -> 0x0031 }
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ all -> 0x0031 }
            r2.<init>(r0)     // Catch:{ all -> 0x0031 }
            java.lang.Object r1 = r2.readObject()     // Catch:{ all -> 0x002a }
            java.lang.String r0 = "null cannot be cast to non-null type java.util.LinkedList<kotlin.collections.Map<kotlin.String, kotlin.String>>"
            X.C162457s7.A0K(r1, r0)     // Catch:{ all -> 0x002a }
            java.util.LinkedList r1 = (java.util.LinkedList) r1     // Catch:{ all -> 0x002a }
            r2.close()     // Catch:{ all -> 0x0031 }
            r3.close()
            return r1
        L_0x002a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002c }
        L_0x002c:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x0031 }
            throw r0     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59652xG.A00(X.8KP):java.util.LinkedList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0183, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0187, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x018a, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        X.AnonymousClass2A8.A00(r7, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A01(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.util.Map r20) {
        /*
            r16 = this;
            r2 = r16
            monitor-enter(r2)
            r4 = 0
            r3 = r17
            X.C162457s7.A0J(r3, r4)     // Catch:{ all -> 0x01b3 }
            r13 = r18
            r12 = r19
            X.C18260x0.A0Q(r13, r12)     // Catch:{ all -> 0x01b3 }
            X.2sH r0 = r2.A01     // Catch:{ IOException -> 0x01a7 }
            long r0 = r0.A0H()     // Catch:{ IOException -> 0x01a7 }
            java.lang.String r14 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x01a7 }
            java.lang.String r1 = "data"
            r5 = r20
            java.util.Map r0 = X.AnonymousClass0x7.A0z(r1, r5)     // Catch:{ Exception -> 0x0197 }
            java.lang.String r11 = X.C18280x3.A0d(r0)     // Catch:{ Exception -> 0x0197 }
            X.C162457s7.A0D(r11)     // Catch:{ Exception -> 0x0197 }
            java.lang.String r0 = "screen"
            java.lang.String r15 = X.AnonymousClass0x2.A0d(r0, r5)     // Catch:{ Exception -> 0x0197 }
            X.2mf r10 = new X.2mf     // Catch:{ Exception -> 0x0197 }
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0197 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0l(r3)     // Catch:{ IOException -> 0x01a7 }
            r0 = 58
            java.lang.String r6 = X.AnonymousClass0x2.A0e(r13, r4, r0)     // Catch:{ IOException -> 0x01a7 }
            X.3dY r4 = r2.A05     // Catch:{ IOException -> 0x01a7 }
            java.lang.Object r0 = r4.get()     // Catch:{ IOException -> 0x01a7 }
            X.8Ke r0 = (X.C172228Ke) r0     // Catch:{ IOException -> 0x01a7 }
            X.7WJ r9 = r0.A08(r6)     // Catch:{ IOException -> 0x01a7 }
            if (r9 == 0) goto L_0x01b1
            r5 = 0
            r0 = 5
            X.3Z6[] r7 = new X.AnonymousClass3Z6[r0]     // Catch:{ IOException -> 0x01a7 }
            java.lang.String r0 = r10.A02     // Catch:{ IOException -> 0x01a7 }
            X.AnonymousClass3Z6.A09(r1, r0, r7, r5)     // Catch:{ IOException -> 0x01a7 }
            java.lang.String r1 = "extension_id"
            java.lang.String r0 = r10.A00     // Catch:{ IOException -> 0x01a7 }
            X.AnonymousClass3Z6.A05(r1, r0, r7)     // Catch:{ IOException -> 0x01a7 }
            java.lang.String r1 = "session_id"
            java.lang.String r0 = r10.A04     // Catch:{ IOException -> 0x01a7 }
            X.AnonymousClass3Z6.A06(r1, r0, r7)     // Catch:{ IOException -> 0x01a7 }
            java.lang.String r1 = "t"
            java.lang.String r0 = r10.A01     // Catch:{ IOException -> 0x01a7 }
            X.AnonymousClass3Z6.A07(r1, r0, r7)     // Catch:{ IOException -> 0x01a7 }
            java.lang.String r1 = "name"
            java.lang.String r0 = r10.A03     // Catch:{ IOException -> 0x01a7 }
            X.AnonymousClass3Z6.A08(r1, r0, r7)     // Catch:{ IOException -> 0x01a7 }
            java.util.Map r7 = X.C73813g7.A0F(r7)     // Catch:{ IOException -> 0x01a7 }
            java.lang.Object r0 = r4.get()     // Catch:{ IOException -> 0x01a7 }
            X.8Ke r0 = (X.C172228Ke) r0     // Catch:{ IOException -> 0x01a7 }
            X.8KP r0 = r0.A09(r6)     // Catch:{ IOException -> 0x01a7 }
            if (r0 == 0) goto L_0x00a4
            java.util.LinkedList r8 = A00(r0)     // Catch:{ IOException -> 0x01a7 }
            X.1VX r6 = r2.A04     // Catch:{ IOException -> 0x01a7 }
            r1 = 3211(0xc8b, float:4.5E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ IOException -> 0x01a7 }
            int r1 = r6.A0O(r0, r1)     // Catch:{ IOException -> 0x01a7 }
            boolean r0 = X.AnonymousClass001.A1W(r1)
            X.C626936e.A0B(r0)     // Catch:{ IOException -> 0x01a7 }
        L_0x009a:
            int r0 = r8.size()     // Catch:{ IOException -> 0x01a7 }
            if (r0 < r1) goto L_0x00ae
            r8.poll()     // Catch:{ IOException -> 0x01a7 }
            goto L_0x009a
        L_0x00a4:
            java.util.List r0 = X.C18290x4.A12(r7)     // Catch:{ IOException -> 0x01a7 }
            java.util.LinkedList r8 = new java.util.LinkedList     // Catch:{ IOException -> 0x01a7 }
            r8.<init>(r0)     // Catch:{ IOException -> 0x01a7 }
            goto L_0x00b1
        L_0x00ae:
            r8.add(r7)     // Catch:{ IOException -> 0x01a7 }
        L_0x00b1:
            java.io.ByteArrayOutputStream r7 = X.AnonymousClass0x9.A0e()     // Catch:{ IOException -> 0x01a7 }
            java.io.ObjectOutputStream r6 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0188 }
            r6.<init>(r7)     // Catch:{ all -> 0x0188 }
            r6.writeObject(r8)     // Catch:{ all -> 0x0181 }
            r6.close()     // Catch:{ all -> 0x0188 }
            byte[] r1 = r7.toByteArray()     // Catch:{ all -> 0x0188 }
            r7.close()     // Catch:{ IOException -> 0x01a7 }
            X.C162457s7.A0D(r1)     // Catch:{ IOException -> 0x01a7 }
            java.io.OutputStream r0 = r9.A00()     // Catch:{ IOException -> 0x00d5 }
            r0.write(r1)     // Catch:{ IOException -> 0x00d5 }
            r9.A01()     // Catch:{ IOException -> 0x00d5 }
            goto L_0x00df
        L_0x00d5:
            r6 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x01a7 }
            java.lang.String r0 = "ExtensionsLogger/FcsConfigDiskCache/writeToDisk: "
            X.C18260x0.A1Q(r1, r0, r6)     // Catch:{ IOException -> 0x01a7 }
        L_0x00df:
            X.1VX r6 = r2.A04     // Catch:{ IOException -> 0x01a7 }
            r1 = 3212(0xc8c, float:4.501E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ IOException -> 0x01a7 }
            int r11 = r6.A0O(r0, r1)     // Catch:{ IOException -> 0x01a7 }
            boolean r0 = X.AnonymousClass001.A1W(r11)
            X.C626936e.A0B(r0)     // Catch:{ IOException -> 0x01a7 }
            X.2of r0 = r2.A03     // Catch:{ IOException -> 0x01a7 }
            X.3dY r8 = r0.A00     // Catch:{ IOException -> 0x01a7 }
            java.lang.Object r0 = r8.get()     // Catch:{ IOException -> 0x01a7 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ IOException -> 0x01a7 }
            java.lang.String r1 = X.C18280x3.A0Z(r0, r3)     // Catch:{ IOException -> 0x01a7 }
            if (r1 == 0) goto L_0x0179
            int r0 = r1.length()     // Catch:{ IOException -> 0x01a7 }
            if (r0 == 0) goto L_0x0179
            java.lang.String r9 = ","
            java.lang.String[] r0 = new java.lang.String[]{r9}     // Catch:{ IOException -> 0x01a7 }
            r7 = 0
            java.util.List r0 = X.C175728Zm.A0P(r1, r0, r5)     // Catch:{ IOException -> 0x01a7 }
            r10 = 0
            X.C162457s7.A0J(r0, r5)     // Catch:{ IOException -> 0x01a7 }
            java.util.ArrayList r6 = X.AnonymousClass002.A0J(r0)     // Catch:{ IOException -> 0x01a7 }
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()     // Catch:{ IOException -> 0x01a7 }
        L_0x011d:
            int r0 = r6.size()     // Catch:{ IOException -> 0x01a7 }
            if (r0 < r11) goto L_0x0149
            java.lang.Object r0 = X.C73723fy.A05(r6)     // Catch:{ IOException -> 0x01a7 }
            boolean r0 = X.C162457s7.A0P(r0, r13)     // Catch:{ IOException -> 0x01a7 }
            if (r0 != 0) goto L_0x0149
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ IOException -> 0x01a7 }
            r0 = 58
            r1.append(r0)     // Catch:{ IOException -> 0x01a7 }
            java.lang.Object r0 = X.C57272tN.A00(r6)     // Catch:{ IOException -> 0x01a7 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x01a7 }
            X.C18270x1.A1D(r0, r1, r5)     // Catch:{ IOException -> 0x01a7 }
            boolean r0 = r6.isEmpty()     // Catch:{ IOException -> 0x01a7 }
            if (r0 != 0) goto L_0x018f
            r6.remove(r10)     // Catch:{ IOException -> 0x01a7 }
            goto L_0x011d
        L_0x0149:
            java.lang.Object r0 = X.C73723fy.A05(r6)     // Catch:{ IOException -> 0x01a7 }
            boolean r0 = X.C162457s7.A0P(r0, r13)     // Catch:{ IOException -> 0x01a7 }
            if (r0 != 0) goto L_0x0156
            r6.add(r13)     // Catch:{ IOException -> 0x01a7 }
        L_0x0156:
            java.lang.String r1 = X.C73723fy.A0A(r9, r6, r7)     // Catch:{ IOException -> 0x01a7 }
            android.content.SharedPreferences$Editor r0 = X.C72333dY.A00(r8)     // Catch:{ IOException -> 0x01a7 }
            X.C18270x1.A0j(r0, r3, r1)     // Catch:{ IOException -> 0x01a7 }
            java.util.Iterator r3 = r5.iterator()     // Catch:{ IOException -> 0x01a7 }
        L_0x0165:
            boolean r0 = r3.hasNext()     // Catch:{ IOException -> 0x01a7 }
            if (r0 == 0) goto L_0x01b1
            java.lang.String r1 = X.AnonymousClass001.A0m(r3)     // Catch:{ IOException -> 0x01a7 }
            java.lang.Object r0 = r4.get()     // Catch:{ IOException -> 0x01a7 }
            X.8Ke r0 = (X.C172228Ke) r0     // Catch:{ IOException -> 0x01a7 }
            r0.A0D(r1)     // Catch:{ IOException -> 0x01a7 }
            goto L_0x0165
        L_0x0179:
            android.content.SharedPreferences$Editor r0 = X.C72333dY.A00(r8)     // Catch:{ IOException -> 0x01a7 }
            X.C18270x1.A0j(r0, r3, r13)     // Catch:{ IOException -> 0x01a7 }
            goto L_0x01b1
        L_0x0181:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0183 }
        L_0x0183:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)     // Catch:{ all -> 0x0188 }
            throw r0     // Catch:{ all -> 0x0188 }
        L_0x0188:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x018a }
        L_0x018a:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r7, r0)     // Catch:{ IOException -> 0x01a7 }
            goto L_0x0196
        L_0x018f:
            java.lang.String r0 = "List is empty."
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException     // Catch:{ IOException -> 0x01a7 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x01a7 }
        L_0x0196:
            throw r1     // Catch:{ IOException -> 0x01a7 }
        L_0x0197:
            java.lang.String r0 = "ExtensionsLogger/storeDataForReporting data to be stored is missing parameters"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x01a7 }
            X.2qk r3 = r2.A00     // Catch:{ IOException -> 0x01a7 }
            java.lang.String r1 = "userActions/storeDataForReporting"
            java.lang.String r0 = "data to be stored is missing parameters"
            r3.A0A(r1, r4, r0)     // Catch:{ IOException -> 0x01a7 }
            goto L_0x01b1
        L_0x01a7:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = "ExtensionsLogger/ExtensionsReportingDiskCache/storeDataForReporting: "
            X.C18260x0.A16(r0, r1, r3)     // Catch:{ all -> 0x01b3 }
        L_0x01b1:
            monitor-exit(r2)
            return
        L_0x01b3:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59652xG.A01(java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }

    public C59652xG(C55682qk r2, C56612sH r3, C54292oU r4, C54402of r5, AnonymousClass1VX r6) {
        C18260x0.A0f(r5, r2, r4, r6, r3);
        this.A03 = r5;
        this.A00 = r2;
        this.A02 = r4;
        this.A04 = r6;
        this.A01 = r3;
    }
}
