package X;

/* renamed from: X.1tw  reason: invalid class name and case insensitive filesystem */
public final class C33941tw extends AnonymousClass5ZM {
    public final /* synthetic */ C50432iA A00;
    public final /* synthetic */ AnonymousClass2WT A01;
    public final /* synthetic */ Integer A02;

    public C33941tw(C50432iA r1, AnonymousClass2WT r2, Integer num) {
        this.A00 = r1;
        this.A02 = num;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01f7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01fb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01fe, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0202, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r27) {
        /*
            r26 = this;
            r11 = r26
            X.2iA r4 = r11.A00
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            X.33j r2 = r4.A03
            java.util.Locale r0 = X.C620733j.A02(r2)
            java.lang.String r1 = X.C162307rf.A04(r0)
            X.C162457s7.A0D(r1)
            java.util.Locale r0 = X.C620733j.A02(r2)
            java.lang.String r3 = X.C162307rf.A02(r0)
            X.C162457s7.A0D(r3)
            int r0 = r3.length()
            if (r0 != 0) goto L_0x002a
            java.lang.String r3 = r2.A06()
        L_0x002a:
            X.C162457s7.A0H(r3)
            X.2lb r0 = r4.A08
            java.util.TreeSet r0 = r0.A01()
            r0.add(r1)
            java.util.Iterator r2 = r0.iterator()
        L_0x003a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = X.AnonymousClass001.A0m(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)
            r0 = 45
            r1.append(r0)
            X.C18270x1.A1D(r3, r1, r5)
            goto L_0x003a
        L_0x0051:
            java.lang.String r0 = ","
            java.lang.String r7 = X.C73723fy.A09(r0, r5)
            X.2vv r3 = r4.A00()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "dictionaryloader/prepare/cache language: "
            r1.append(r0)
            java.lang.String r0 = r3.A03
            r1.append(r0)
            java.lang.String r0 = ", last attempted language: "
            r1.append(r0)
            java.lang.String r0 = r3.A05
            r1.append(r0)
            java.lang.String r0 = ", request languages: "
            X.C18260x0.A0s(r0, r7, r1)
            X.2sH r10 = r4.A02
            long r5 = r10.A0H()
            X.4F7 r13 = r4.A07
            int r0 = r13.getCount()
            r12 = 1
            r2 = 0
            boolean r8 = X.AnonymousClass001.A1W(r0)
            java.lang.String r0 = r3.A03
            boolean r0 = X.C162457s7.A0P(r7, r0)
            r18 = 3600000(0x36ee80, double:1.7786363E-317)
            if (r0 == 0) goto L_0x0108
            long r0 = r3.A00
            long r16 = r5 - r0
            r14 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0108
        L_0x00a0:
            X.2Zi r1 = new X.2Zi
            r1.<init>(r4, r2, r8)
        L_0x00a5:
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "dictionaryloader/prepare/prepare result "
            X.C18260x0.A1P(r8, r0, r1)
            boolean r14 = r1.A00
            r9 = 0
            r8 = 1
            if (r14 == 0) goto L_0x00ce
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x00ce
            java.lang.String r0 = r3.A03
            boolean r0 = X.C162457s7.A0P(r7, r0)
            if (r0 == 0) goto L_0x00ce
            java.lang.String r0 = "dictionaryloader/prepare/publish progress to show search"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Boolean[] r12 = new java.lang.Boolean[r12]
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r12[r2] = r0
            r11.A0F(r12)
        L_0x00ce:
            boolean r0 = r1.A01
            r4.A00 = r0
            if (r14 == 0) goto L_0x0203
            X.1ip r0 = r4.A01
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x0203
            X.1aM r2 = new X.1aM
            r2.<init>()
            r2.A05 = r7
            java.lang.String r0 = r3.A03
            r2.A04 = r0
            long r0 = r3.A01
            r14 = 0
            int r12 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            boolean r12 = X.AnonymousClass000.A1T(r12)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r2.A01 = r12
            java.lang.Long r0 = X.C18310x6.A0f(r5, r0)
            r2.A03 = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.A00 = r0
            java.lang.Integer r12 = r11.A02
            long r15 = r10.A0H()
            goto L_0x011f
        L_0x0108:
            long r0 = r3.A01
            long r14 = r5 - r0
            int r0 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r0 >= 0) goto L_0x0119
            java.lang.String r0 = r3.A05
            boolean r0 = X.C162457s7.A0P(r7, r0)
            if (r0 == 0) goto L_0x0119
            goto L_0x00a0
        L_0x0119:
            X.2Zi r1 = new X.2Zi
            r1.<init>(r4, r12, r8)
            goto L_0x00a5
        L_0x011f:
            X.4ES r11 = r4.A05     // Catch:{ IOException -> 0x021e }
            java.lang.String r0 = r3.A04     // Catch:{ IOException -> 0x021e }
            X.4GL r5 = r11.AzU(r0, r7)     // Catch:{ IOException -> 0x021e }
            r0 = r5
            X.3PZ r0 = (X.AnonymousClass3PZ) r0     // Catch:{ all -> 0x01fc }
            java.net.HttpURLConnection r10 = r0.A01     // Catch:{ all -> 0x01fc }
            int r1 = r10.getResponseCode()     // Catch:{ all -> 0x01fc }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r1)     // Catch:{ all -> 0x01fc }
            r2.A02 = r0     // Catch:{ all -> 0x01fc }
            r0 = 304(0x130, float:4.26E-43)
            r6 = 0
            if (r1 != r0) goto L_0x0151
            java.lang.String r0 = "dictionaryloader/prepare-from-network/not_modified"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01fc }
            X.225 r11 = X.AnonymousClass225.UPTO_DATE     // Catch:{ all -> 0x01fc }
            java.lang.String r1 = r3.A04     // Catch:{ all -> 0x01fc }
            X.2vv r0 = new X.2vv     // Catch:{ all -> 0x01fc }
            r14 = r7
            r10 = r0
            r12 = r1
            r13 = r7
            r17 = r15
            r10.<init>(r11, r12, r13, r14, r15, r17)     // Catch:{ all -> 0x01fc }
            goto L_0x01f1
        L_0x0151:
            r0 = 404(0x194, float:5.66E-43)
            if (r1 != r0) goto L_0x018c
            java.lang.String r0 = "dictionaryloader/prepare-from-network/unavailable"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01fc }
            r13.Ayq()     // Catch:{ Exception -> 0x016c }
            X.225 r11 = X.AnonymousClass225.LANGUAGE_UNAVAILABLE     // Catch:{ Exception -> 0x016c }
            X.2vv r0 = new X.2vv     // Catch:{ Exception -> 0x016c }
            r14 = r7
            r10 = r0
            r12 = r6
            r13 = r7
            r17 = r15
            r10.<init>(r11, r12, r13, r14, r15, r17)     // Catch:{ Exception -> 0x016c }
            goto L_0x01f1
        L_0x016c:
            r1 = move-exception
            java.lang.String r0 = "dictionaryloader/prepare-from-network/unavailable/clear-fail"
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x01fc }
            X.225 r18 = X.AnonymousClass225.FETCH_ERROR     // Catch:{ all -> 0x01fc }
            java.lang.String r6 = r3.A04     // Catch:{ all -> 0x01fc }
            long r10 = r3.A00     // Catch:{ all -> 0x01fc }
            java.lang.String r1 = r3.A03     // Catch:{ all -> 0x01fc }
            X.2vv r0 = new X.2vv     // Catch:{ all -> 0x01fc }
            r17 = r0
            r19 = r6
            r20 = r7
            r21 = r1
            r24 = r10
            r22 = r15
            r17.<init>(r18, r19, r20, r21, r22, r24)     // Catch:{ all -> 0x01fc }
            goto L_0x01f1
        L_0x018c:
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x01b3
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01fc }
            java.lang.String r0 = "dictionaryloader/prepare-from-network/servererror: "
            X.C18260x0.A0x(r0, r6, r1)     // Catch:{ all -> 0x01fc }
            X.225 r18 = X.AnonymousClass225.FETCH_ERROR     // Catch:{ all -> 0x01fc }
            java.lang.String r6 = r3.A04     // Catch:{ all -> 0x01fc }
            long r10 = r3.A00     // Catch:{ all -> 0x01fc }
            java.lang.String r1 = r3.A03     // Catch:{ all -> 0x01fc }
            X.2vv r0 = new X.2vv     // Catch:{ all -> 0x01fc }
            r17 = r0
            r19 = r6
            r20 = r7
            r21 = r1
            r24 = r10
            r22 = r15
            r17.<init>(r18, r19, r20, r21, r22, r24)     // Catch:{ all -> 0x01fc }
            goto L_0x01f1
        L_0x01b3:
            int r0 = r10.getContentLength()     // Catch:{ all -> 0x01fc }
            long r0 = (long) r0     // Catch:{ all -> 0x01fc }
            java.io.InputStream r6 = r11.B8P(r5, r6)     // Catch:{ all -> 0x01fc }
            boolean r0 = r11.BF3(r6, r12, r0)     // Catch:{ all -> 0x01f5 }
            if (r0 == 0) goto L_0x01d5
            java.lang.String r0 = "ETag"
            java.lang.String r12 = r10.getHeaderField(r0)     // Catch:{ all -> 0x01f5 }
            X.225 r11 = X.AnonymousClass225.UPTO_DATE     // Catch:{ all -> 0x01f5 }
            X.2vv r0 = new X.2vv     // Catch:{ all -> 0x01f5 }
            r14 = r7
            r10 = r0
            r13 = r7
            r17 = r15
            r10.<init>(r11, r12, r13, r14, r15, r17)     // Catch:{ all -> 0x01f5 }
            goto L_0x01ee
        L_0x01d5:
            X.225 r18 = X.AnonymousClass225.FETCH_ERROR     // Catch:{ all -> 0x01f5 }
            java.lang.String r12 = r3.A04     // Catch:{ all -> 0x01f5 }
            long r10 = r3.A00     // Catch:{ all -> 0x01f5 }
            java.lang.String r1 = r3.A03     // Catch:{ all -> 0x01f5 }
            X.2vv r0 = new X.2vv     // Catch:{ all -> 0x01f5 }
            r17 = r0
            r19 = r12
            r20 = r7
            r21 = r1
            r24 = r10
            r22 = r15
            r17.<init>(r18, r19, r20, r21, r22, r24)     // Catch:{ all -> 0x01f5 }
        L_0x01ee:
            r6.close()     // Catch:{ all -> 0x01fc }
        L_0x01f1:
            r5.close()     // Catch:{ IOException -> 0x021e }
            goto L_0x023d
        L_0x01f5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01f7 }
        L_0x01f7:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)     // Catch:{ all -> 0x01fc }
            throw r0     // Catch:{ all -> 0x01fc }
        L_0x01fc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01fe }
        L_0x01fe:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ IOException -> 0x021e }
            throw r0     // Catch:{ IOException -> 0x021e }
        L_0x0203:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "dictionaryloader/prepare/skip network fetch, want to fetch: "
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = ", network available: "
            r1.append(r0)
            X.1ip r0 = r4.A01
            boolean r0 = r0.A0F()
            X.C18260x0.A1V(r1, r0)
            goto L_0x026a
        L_0x021e:
            r1 = move-exception
            java.lang.String r0 = "dictionaryloader/prepare-from-network/connecterror"
            com.whatsapp.util.Log.e(r0, r1)
            X.225 r18 = X.AnonymousClass225.NETWORK_ERROR
            java.lang.String r10 = r3.A04
            long r5 = r3.A00
            java.lang.String r1 = r3.A03
            X.2vv r0 = new X.2vv
            r17 = r0
            r19 = r10
            r20 = r7
            r21 = r1
            r24 = r5
            r22 = r15
            r17.<init>(r18, r19, r20, r21, r22, r24)
        L_0x023d:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "dictionaryloader/prepare/after network fetch state: "
            r3.append(r1)
            X.225 r1 = r0.A02
            X.C18260x0.A0m(r1, r3)
            r4.A01(r0)
            java.lang.String r0 = r0.A03
            r2.A07 = r0
            if (r1 == 0) goto L_0x0271
            java.lang.String r0 = r1.fieldStatString
        L_0x0256:
            r2.A06 = r0
            if (r1 == 0) goto L_0x0265
            boolean r0 = r1.fetchSuccessful
            if (r0 != r8) goto L_0x0265
            boolean r0 = r1.gotDictionary
            if (r0 != r8) goto L_0x0263
            r9 = 1
        L_0x0263:
            r4.A00 = r9
        L_0x0265:
            X.4FV r0 = r4.A04
            r0.BhD(r2)
        L_0x026a:
            boolean r0 = r4.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0271:
            r0 = 0
            goto L_0x0256
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33941tw.A08(java.lang.Object[]):java.lang.Object");
    }

    public void A09() {
        AnonymousClass2WT r1 = this.A01;
        C50432iA r2 = this.A00;
        r1.A00(r2.A00);
        r2.A07.BmT(r2.A00);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("dictionaryloader/prepare/onCancelled/dictionaryAvailable=");
        C18260x0.A1V(A0o, r2.A00);
    }

    public /* bridge */ /* synthetic */ void A0E(Object[] objArr) {
        Boolean[] boolArr = (Boolean[]) objArr;
        C162457s7.A0J(boolArr, 0);
        Boolean bool = boolArr[0];
        if (bool != null) {
            C50432iA r0 = this.A00;
            AnonymousClass2WT r1 = this.A01;
            boolean booleanValue = bool.booleanValue();
            r0.A07.BmT(booleanValue);
            r1.A00(booleanValue);
            C18260x0.A1E("dictionaryloader/prepare/onProgressUpdate/hasDictionary=", AnonymousClass001.A0o(), booleanValue);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        boolean A1Z = AnonymousClass001.A1Z(obj);
        this.A00.A07.BmT(A1Z);
        this.A01.A00(A1Z);
        C18260x0.A1D("dictionaryloader/prepare/onPostExecute/hasDictionary= ", AnonymousClass001.A0o(), A1Z);
    }
}
