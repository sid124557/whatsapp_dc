package X;

/* renamed from: X.1QN  reason: invalid class name */
public final class AnonymousClass1QN extends AnonymousClass1QP {
    public final C69263Wi A00;
    public final AnonymousClass30S A01;
    public final C194449Sx A02;
    public final C56422rx A03;
    public final C46662c0 A04;
    public final C23391Sw A05;
    public final C620633i A06;
    public final AnonymousClass33p A07;
    public final C620733j A08;
    public final C53412n3 A09;
    public final AnonymousClass2YC A0A;
    public final AnonymousClass1VX A0B;
    public final AnonymousClass2Q6 A0C;
    public final C60092xz A0D;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1QN(X.C69263Wi r14, X.AnonymousClass30S r15, X.C194449Sx r16, X.C56422rx r17, X.C46662c0 r18, X.C23391Sw r19, X.C620633i r20, X.AnonymousClass33p r21, X.C620733j r22, X.C53412n3 r23, X.AnonymousClass2YC r24, X.AnonymousClass1VX r25, X.AnonymousClass2Q6 r26, X.C60092xz r27) {
        /*
            r13 = this;
            r7 = r21
            r8 = r22
            r11 = r25
            X.C18260x0.A0V(r8, r11, r7)
            r0 = 5
            r1 = r27
            X.C162457s7.A0J(r1, r0)
            r5 = r17
            r6 = r20
            r12 = r26
            X.C18260x0.A0g(r6, r14, r12, r5, r15)
            r0 = 12
            r9 = r23
            r10 = r24
            r2 = r18
            X.C18270x1.A15(r2, r9, r10, r0)
            r3 = r13
            r4 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A08 = r8
            r13.A0B = r11
            r13.A07 = r7
            r13.A02 = r4
            r13.A0D = r1
            r13.A06 = r6
            r13.A00 = r14
            r13.A0C = r12
            r13.A03 = r5
            r13.A01 = r15
            r0 = r19
            r13.A05 = r0
            r13.A04 = r2
            r13.A09 = r9
            r13.A0A = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QN.<init>(X.3Wi, X.30S, X.9Sx, X.2rx, X.2c0, X.1Sw, X.33i, X.33p, X.33j, X.2n3, X.2YC, X.1VX, X.2Q6, X.2xz):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x013b A[Catch:{ JSONException -> 0x014b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(android.app.Activity r29, X.AnonymousClass398 r30, java.lang.String r31, java.lang.String r32, long r33) {
        /*
            r28 = this;
            java.lang.String r11 = "flow_data_endpoint"
            java.lang.String r10 = "session_id"
            r0 = 0
            r15 = r29
            X.C162457s7.A0J(r15, r0)
            r9 = 1
            r0 = 3
            r12 = r32
            X.C162457s7.A0J(r12, r0)
            r8 = r28
            r3 = r30
            r17 = r31
            r19 = r33
            r16 = r3
            r18 = r12
            r14 = r8
            super.A0D(r15, r16, r17, r18, r19)
            android.app.Activity r22 = X.C621633u.A00(r15)
            X.2xz r2 = r8.A0D
            java.lang.String r1 = "galaxy_message"
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            X.66R r0 = r2.A01
            java.lang.Object r14 = X.C18280x3.A0V(r1, r0)
            X.9PF r14 = (X.AnonymousClass9PF) r14
            java.lang.String r7 = "com.bloks.www.whatsapp.commerce.galaxy_message"
            if (r14 == 0) goto L_0x003f
            boolean r0 = r14.A03
            if (r0 != 0) goto L_0x003f
        L_0x003e:
            return
        L_0x003f:
            java.lang.String r13 = r3.A01
            java.util.Map r6 = X.AnonymousClass31O.A01(r13)
            if (r22 == 0) goto L_0x003e
            java.lang.String r5 = "flow_id"
            boolean r0 = r6.containsKey(r5)
            if (r0 == 0) goto L_0x003e
            java.lang.String r4 = "flow_version_id"
            boolean r0 = r6.containsKey(r4)
            if (r0 == 0) goto L_0x003e
            boolean r0 = r6.containsKey(r11)
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "flow_token"
            boolean r0 = r6.containsKey(r0)
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "flow_cta"
            boolean r0 = r6.containsKey(r0)
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = r6.get(r4)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "\\d+"
            X.5rB r0 = new X.5rB
            r0.<init>((java.lang.String) r2)
            r1 = 0
            X.C162457s7.A0J(r3, r1)
            java.util.regex.Pattern r0 = r0.nativePattern
            boolean r0 = X.C18280x3.A1X(r3, r0)
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = r6.get(r5)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            X.5rB r0 = new X.5rB
            r0.<init>((java.lang.String) r2)
            X.C162457s7.A0J(r3, r1)
            java.util.regex.Pattern r0 = r0.nativePattern
            boolean r0 = X.C18280x3.A1X(r3, r0)
            if (r0 == 0) goto L_0x003e
            if (r13 != 0) goto L_0x00a4
            java.lang.String r13 = ""
        L_0x00a4:
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1H(r13)     // Catch:{ JSONException -> 0x014b }
            r0 = r22
            X.4FC r0 = (X.AnonymousClass4FC) r0     // Catch:{ JSONException -> 0x014b }
            java.lang.String r1 = X.C627336j.A06(r0)     // Catch:{ JSONException -> 0x014b }
            java.lang.String r0 = "chat_jid"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x014b }
            java.lang.String r1 = "message_id"
            r0 = r17
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x014b }
            r2.put(r10, r12)     // Catch:{ JSONException -> 0x014b }
            java.lang.String r16 = X.C18310x6.A0o(r4, r6)     // Catch:{ JSONException -> 0x014b }
            java.lang.String r4 = X.C18310x6.A0o(r11, r6)     // Catch:{ JSONException -> 0x014b }
            java.lang.String r5 = r2.toString()     // Catch:{ JSONException -> 0x014b }
            X.C162457s7.A0H(r16)     // Catch:{ JSONException -> 0x014b }
            X.33j r2 = r8.A08     // Catch:{ JSONException -> 0x014b }
            if (r14 == 0) goto L_0x00ea
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r16)     // Catch:{ JSONException -> 0x014b }
            java.lang.String r0 = r14.A02     // Catch:{ JSONException -> 0x014b }
            java.lang.String r16 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ JSONException -> 0x014b }
            long r0 = r14.A00     // Catch:{ JSONException -> 0x014b }
            r13 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r13
            r13 = 0
            int r3 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x00ed
            r3 = 0
            goto L_0x0103
        L_0x00ea:
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
        L_0x00ed:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0l(r16)     // Catch:{ JSONException -> 0x014b }
            r13 = 58
            r3.append(r13)     // Catch:{ JSONException -> 0x014b }
            java.lang.String r2 = r2.A08()     // Catch:{ JSONException -> 0x014b }
            java.lang.String r2 = X.AnonymousClass000.A0X(r2, r3)     // Catch:{ JSONException -> 0x014b }
            X.39C r3 = new X.39C     // Catch:{ JSONException -> 0x014b }
            r3.<init>(r0, r2, r9)     // Catch:{ JSONException -> 0x014b }
        L_0x0103:
            android.content.Intent r2 = X.C18320x8.A07()     // Catch:{ JSONException -> 0x014b }
            java.lang.String r1 = r22.getPackageName()     // Catch:{ JSONException -> 0x014b }
            java.lang.String r0 = "com.whatsapp.extensions.bloks.WaExtensionsBottomsheetModalActivity"
            r2.setClassName(r1, r0)     // Catch:{ JSONException -> 0x014b }
            X.C18310x6.A11(r2, r7, r5)     // Catch:{ JSONException -> 0x014b }
            java.lang.String r0 = "screen_cache_config"
            r2.putExtra(r0, r3)     // Catch:{ JSONException -> 0x014b }
            r21 = r8
            r23 = r2
            r24 = r17
            r25 = r6
            r26 = r19
            r21.A0E(r22, r23, r24, r25, r26)     // Catch:{ JSONException -> 0x014b }
            r2.putExtra(r11, r4)     // Catch:{ JSONException -> 0x014b }
            r2.putExtra(r10, r12)     // Catch:{ JSONException -> 0x014b }
            r2.getExtras()     // Catch:{ JSONException -> 0x014b }
            X.1VX r3 = r8.A0B     // Catch:{ JSONException -> 0x014b }
            r1 = 2999(0xbb7, float:4.202E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ JSONException -> 0x014b }
            boolean r0 = r3.A0Y(r0, r1)     // Catch:{ JSONException -> 0x014b }
            if (r0 == 0) goto L_0x0140
            java.lang.String r0 = "make_metadata_request"
            r2.putExtra(r0, r9)     // Catch:{ JSONException -> 0x014b }
        L_0x0140:
            java.lang.String r1 = "extensions_impl_type"
            java.lang.String r0 = "1"
            r2.putExtra(r1, r0)     // Catch:{ JSONException -> 0x014b }
            r15.startActivity(r2)     // Catch:{ JSONException -> 0x014b }
            return
        L_0x014b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ExtensionsLogger/ExtensionsV1Action/execute() - Error during json payload parsing: "
            X.C18260x0.A16(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QN.A0D(android.app.Activity, X.398, java.lang.String, java.lang.String, long):void");
    }
}
