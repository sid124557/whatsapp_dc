package X;

import com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines;

/* renamed from: X.1QO  reason: invalid class name */
public final class AnonymousClass1QO extends AnonymousClass1QP {
    public final C194449Sx A00;
    public final C56422rx A01;
    public final C613530j A02;
    public final PhoenixExtensionFlowManagerWithCoroutines A03;
    public final C620633i A04;
    public final AnonymousClass33p A05;
    public final C620733j A06;
    public final C53412n3 A07;
    public final AnonymousClass2YC A08;
    public final C53822nj A09;
    public final C56162rW A0A;
    public final AnonymousClass1Uc A0B;
    public final C23651Ud A0C;
    public final AnonymousClass1VX A0D;
    public final AnonymousClass2Q6 A0E;
    public final C60482yd A0F;
    public final C60092xz A0G;
    public final AnonymousClass66R A0H = C154517dI.A01(AnonymousClass40S.A00);

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0260, code lost:
        if (r8.A00() == null) goto L_0x0262;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(android.app.Activity r38, X.AnonymousClass398 r39, java.lang.String r40, java.lang.String r41, long r42) {
        /*
            r37 = this;
            r0 = 0
            r3 = r38
            X.C162457s7.A0J(r3, r0)
            r12 = 1
            r2 = r39
            r36 = r40
            r34 = r41
            r1 = r36
            r0 = r34
            X.C18260x0.A0Z(r2, r1, r0, r12)
            r4 = r37
            r25 = r42
            r5 = r3
            r6 = r2
            r7 = r1
            r8 = r0
            r9 = r25
            super.A0D(r5, r6, r7, r8, r9)
            android.app.Activity r28 = X.C621633u.A00(r3)
            java.lang.String r14 = r2.A01
            java.util.Map r2 = X.AnonymousClass31O.A01(r14)
            if (r28 == 0) goto L_0x0077
            java.lang.String r11 = "flow_id"
            boolean r0 = r2.containsKey(r11)
            if (r0 == 0) goto L_0x0077
            java.lang.String r23 = "flow_token"
            r0 = r23
            boolean r0 = r2.containsKey(r0)
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = "flow_cta"
            boolean r0 = r2.containsKey(r0)
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r2.get(r11)
            java.lang.String r5 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "\\d+"
            X.5rB r0 = new X.5rB
            r0.<init>((java.lang.String) r1)
            r7 = 0
            X.C162457s7.A0J(r5, r7)
            java.util.regex.Pattern r0 = r0.nativePattern
            boolean r0 = X.C18280x3.A1X(r5, r0)
            if (r0 == 0) goto L_0x0077
            X.2xz r0 = r4.A0G
            java.lang.String r1 = "galaxy_message"
            X.C162457s7.A0J(r1, r7)
            X.66R r0 = r0.A01
            java.lang.Object r13 = X.C18280x3.A0V(r1, r0)
            X.9PF r13 = (X.AnonymousClass9PF) r13
            if (r13 == 0) goto L_0x0078
            boolean r0 = r13.A03
            if (r0 != 0) goto L_0x0078
        L_0x0077:
            return
        L_0x0078:
            X.2YC r1 = r4.A08
            X.32Y r10 = com.whatsapp.jid.UserJid.Companion
            r0 = r28
            X.4FC r0 = (X.AnonymousClass4FC) r0
            r24 = r0
            X.3ZH r0 = r24.getContact()
            java.lang.Class<X.4uZ> r9 = X.C95814uZ.class
            com.whatsapp.jid.Jid r0 = r0.A0I(r9)
            java.lang.String r5 = X.C627336j.A07(r0)
            java.lang.Object r0 = r2.get(r11)
            X.C626936e.A06(r0)
            com.whatsapp.jid.UserJid r6 = r10.A0E(r5)
            r22 = 0
            if (r6 == 0) goto L_0x00b7
            java.util.HashMap r5 = r1.A01
            java.lang.Object r1 = r5.get(r6)
            X.2yW r1 = (X.C60412yW) r1
            if (r1 != 0) goto L_0x00b0
            X.2yW r1 = new X.2yW
            r0 = r22
            r1.<init>(r0)
        L_0x00b0:
            r0 = r22
            r1.A00 = r0
            r5.put(r6, r1)
        L_0x00b7:
            X.1VX r8 = r4.A0D
            r0 = 5936(0x1730, float:8.318E-42)
            X.2vE r6 = X.C58422vE.A02
            boolean r0 = r8.A0Y(r6, r0)
            java.lang.String r21 = "session_id"
            java.lang.String r20 = "draft"
            java.lang.String r19 = "mode"
            java.lang.String r18 = "ExtensionsLogger/ExtensionsV2Action/execute() - Error during json payload parsing: "
            java.lang.String r5 = "business_jid"
            java.lang.String r15 = "flow_action_payload"
            java.lang.String r1 = "flow_action"
            java.lang.String r17 = ""
            java.lang.String r16 = "Required value was null."
            if (r0 == 0) goto L_0x0181
            X.3ZH r0 = r24.getContact()     // Catch:{ JSONException -> 0x034e }
            com.whatsapp.jid.Jid r6 = r0.A0I(r9)     // Catch:{ JSONException -> 0x034e }
            r0 = r19
            java.lang.Object r7 = r2.get(r0)     // Catch:{ JSONException -> 0x034e }
            r0 = r20
            boolean r8 = X.C162457s7.A0P(r7, r0)     // Catch:{ JSONException -> 0x034e }
            if (r14 != 0) goto L_0x00ef
            r14 = r17
        L_0x00ef:
            org.json.JSONObject r7 = X.AnonymousClass0x9.A1H(r14)     // Catch:{ JSONException -> 0x034e }
            if (r6 == 0) goto L_0x00f9
            java.lang.String r0 = r6.user     // Catch:{ JSONException -> 0x034e }
            if (r0 != 0) goto L_0x00fb
        L_0x00f9:
            r0 = r17
        L_0x00fb:
            r7.put(r5, r0)     // Catch:{ JSONException -> 0x034e }
            android.content.Intent r7 = X.C18320x8.A07()     // Catch:{ JSONException -> 0x034e }
            java.lang.String r9 = r28.getPackageName()     // Catch:{ JSONException -> 0x034e }
            java.lang.String r0 = "com.whatsapp.extensions.webview.WaFlowsWebViewBottomsheetModalActivity"
            r7.setClassName(r9, r0)     // Catch:{ JSONException -> 0x034e }
            r27 = r4
            r29 = r7
            r30 = r36
            r31 = r2
            r32 = r25
            r27.A0E(r28, r29, r30, r31, r32)     // Catch:{ JSONException -> 0x034e }
            java.lang.String r24 = X.C18310x6.A0o(r11, r2)     // Catch:{ JSONException -> 0x034e }
            X.1Uc r0 = r4.A0B     // Catch:{ JSONException -> 0x034e }
            if (r24 == 0) goto L_0x017c
            if (r6 == 0) goto L_0x0177
            java.lang.String r27 = "message_cta"
            java.lang.String r28 = "web"
            r22 = r0
            r23 = r6
            r25 = r36
            r26 = r34
            r22.A0E(r23, r24, r25, r26, r27, r28)     // Catch:{ JSONException -> 0x034e }
            java.lang.String r4 = X.C57142tA.A01(r2)     // Catch:{ JSONException -> 0x034e }
            java.lang.String r0 = "flow_message_version"
            r7.putExtra(r0, r4)     // Catch:{ JSONException -> 0x034e }
            r4 = r21
            r0 = r34
            r7.putExtra(r4, r0)     // Catch:{ JSONException -> 0x034e }
            java.lang.String r0 = "is_draft"
            r7.putExtra(r0, r8)     // Catch:{ JSONException -> 0x034e }
            java.lang.Object r4 = r2.get(r1)     // Catch:{ JSONException -> 0x034e }
            boolean r0 = r4 instanceof java.lang.String     // Catch:{ JSONException -> 0x034e }
            if (r0 == 0) goto L_0x0157
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ JSONException -> 0x034e }
        L_0x0151:
            r7.putExtra(r1, r4)     // Catch:{ JSONException -> 0x034e }
            java.lang.String r0 = r6.user     // Catch:{ JSONException -> 0x034e }
            goto L_0x0159
        L_0x0157:
            r4 = 0
            goto L_0x0151
        L_0x0159:
            if (r0 != 0) goto L_0x015d
            r0 = r17
        L_0x015d:
            r7.putExtra(r5, r0)     // Catch:{ JSONException -> 0x034e }
            java.lang.Object r1 = r2.get(r15)     // Catch:{ JSONException -> 0x034e }
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ JSONException -> 0x034e }
            if (r0 == 0) goto L_0x0175
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ JSONException -> 0x034e }
            if (r1 == 0) goto L_0x0175
            java.lang.String r0 = X.C18280x3.A0d(r1)     // Catch:{ JSONException -> 0x034e }
        L_0x0170:
            r7.putExtra(r15, r0)     // Catch:{ JSONException -> 0x034e }
            goto L_0x0347
        L_0x0175:
            r0 = 0
            goto L_0x0170
        L_0x0177:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r16)     // Catch:{ JSONException -> 0x034e }
            goto L_0x0180
        L_0x017c:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r16)     // Catch:{ JSONException -> 0x034e }
        L_0x0180:
            throw r0     // Catch:{ JSONException -> 0x034e }
        L_0x0181:
            r0 = 3080(0xc08, float:4.316E-42)
            boolean r0 = r8.A0Y(r6, r0)
            if (r0 == 0) goto L_0x02a6
            java.lang.String r0 = X.C18310x6.A0o(r11, r2)
            java.lang.String r17 = X.C57142tA.A01(r2)
            X.3ZH r5 = r24.getContact()
            com.whatsapp.jid.Jid r5 = r5.A0I(r9)
            java.lang.String r6 = X.C627336j.A07(r5)
            java.lang.Object r5 = r2.get(r11)
            X.C626936e.A06(r5)
            com.whatsapp.jid.UserJid r14 = r10.A0E(r6)
            java.lang.String r6 = X.C18280x3.A0Y()
            X.C162457s7.A0D(r6)
            X.66R r5 = r4.A0H
            r5.getValue()
            android.content.Intent r5 = X.C18320x8.A07()
            java.lang.String r9 = r3.getPackageName()
            java.lang.String r8 = "com.whatsapp.extensions.phoenix.PhoenixExtensionsBottomSheetActivity"
            r5.setClassName(r9, r8)
            java.lang.String r8 = "fds_observer_id"
            r5.putExtra(r8, r6)
            java.lang.String r9 = "extra_business_jid"
            X.AnonymousClass0x2.A0u(r5, r14, r9)
            r8 = 603979776(0x24000000, float:2.7755576E-17)
            r5.setFlags(r8)
            r27 = r4
            r29 = r5
            r30 = r36
            r31 = r2
            r32 = r25
            r27.A0E(r28, r29, r30, r31, r32)
            X.1Uc r8 = r4.A0B
            if (r0 == 0) goto L_0x02a1
            java.lang.String r32 = "message_cta"
            r27 = r8
            r28 = r14
            r29 = r0
            r31 = r34
            r33 = r22
            r27.A0E(r28, r29, r30, r31, r32, r33)
            r3.startActivity(r5)
            X.2yd r12 = r4.A0F
            X.2or r13 = r12.A02(r6)
            r8 = r19
            java.lang.Object r9 = r2.get(r8)
            r8 = r20
            boolean r28 = X.C162457s7.A0P(r9, r8)
            X.2or r10 = r12.A02(r6)
            X.4Hj r9 = new X.4Hj
            r29 = r9
            r30 = r4
            r31 = r14
            r32 = r0
            r33 = r36
            r35 = r7
            r29.<init>(r30, r31, r32, r33, r34, r35)
            java.lang.Class<X.3Wv> r8 = X.C69393Wv.class
            r10.A00(r9, r8, r4)
            X.2or r11 = r12.A02(r6)
            r9 = 1
            X.4Hj r10 = new X.4Hj
            r29 = r10
            r35 = r9
            r29.<init>(r30, r31, r32, r33, r34, r35)
            java.lang.Class<X.9eC> r8 = X.C197989eC.class
            r11.A00(r10, r8, r4)
            X.2or r11 = r12.A00()
            X.4Hk r10 = new X.4Hk
            r10.<init>(r7, r0, r4)
            java.lang.Class<X.3Wu> r8 = X.C69383Wu.class
            r11.A00(r10, r8, r4)
            if (r17 == 0) goto L_0x029c
            r8 = r23
            java.lang.String r19 = X.AnonymousClass0x2.A0d(r8, r2)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r10 = r4.A03
            r8 = r36
            X.2jC r8 = X.AnonymousClass25c.A00(r8, r0)
            X.2eU r10 = r10.A0Q
            java.lang.String r8 = r8.A00
            X.7Zw r8 = r10.A00(r8)
            if (r8 == 0) goto L_0x0262
            java.lang.String r8 = r8.A00()
            r27 = 1
            if (r8 != 0) goto L_0x0264
        L_0x0262:
            r27 = 0
        L_0x0264:
            java.lang.String r23 = X.AnonymousClass0x2.A0c(r1, r2)
            java.lang.Object r8 = r2.get(r15)
            boolean r1 = r8 instanceof java.util.Map
            if (r1 == 0) goto L_0x0299
            java.util.Map r8 = (java.util.Map) r8
        L_0x0272:
            X.2o6 r2 = new X.2o6
            r15 = r2
            r16 = r14
            r18 = r0
            r20 = r36
            r21 = r34
            r22 = r6
            r24 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r28)
            X.35s r1 = new X.35s
            r1.<init>(r3, r5, r4, r9)
            X.3zk r0 = new X.3zk
            r0.<init>(r1, r4, r2)
            X.4Hl r1 = new X.4Hl
            r1.<init>(r0, r7)
            java.lang.Class<X.9e2> r0 = X.C197889e2.class
            r13.A00(r1, r0, r3)
            return
        L_0x0299:
            r8 = r22
            goto L_0x0272
        L_0x029c:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r16)
            throw r0
        L_0x02a1:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r16)
            throw r0
        L_0x02a6:
            X.3ZH r0 = r24.getContact()     // Catch:{ JSONException -> 0x034e }
            com.whatsapp.jid.Jid r0 = r0.A0I(r9)     // Catch:{ JSONException -> 0x034e }
            if (r14 != 0) goto L_0x02b2
            r14 = r17
        L_0x02b2:
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r14)     // Catch:{ JSONException -> 0x034e }
            if (r0 == 0) goto L_0x02bc
            java.lang.String r0 = r0.user     // Catch:{ JSONException -> 0x034e }
            if (r0 != 0) goto L_0x02be
        L_0x02bc:
            r0 = r17
        L_0x02be:
            r1.put(r5, r0)     // Catch:{ JSONException -> 0x034e }
            java.lang.String r7 = X.C18310x6.A0o(r11, r2)     // Catch:{ JSONException -> 0x034e }
            java.lang.String r10 = "com.bloks.www.whatsapp.commerce.extensions_message_v2"
            java.lang.String r9 = r1.toString()     // Catch:{ JSONException -> 0x034e }
            X.C162457s7.A0H(r7)     // Catch:{ JSONException -> 0x034e }
            X.33j r14 = r4.A06     // Catch:{ JSONException -> 0x034e }
            r11 = 58
            if (r13 == 0) goto L_0x02ee
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)     // Catch:{ JSONException -> 0x034e }
            r1.append(r11)     // Catch:{ JSONException -> 0x034e }
            java.lang.String r0 = r13.A02     // Catch:{ JSONException -> 0x034e }
            java.lang.String r7 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ JSONException -> 0x034e }
            long r0 = r13.A00     // Catch:{ JSONException -> 0x034e }
            r15 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r15
            r15 = 0
            int r5 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r5 != 0) goto L_0x02f1
            r5 = 0
            goto L_0x0305
        L_0x02ee:
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
        L_0x02f1:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0l(r7)     // Catch:{ JSONException -> 0x034e }
            r7.append(r11)     // Catch:{ JSONException -> 0x034e }
            java.lang.String r5 = r14.A08()     // Catch:{ JSONException -> 0x034e }
            java.lang.String r7 = X.AnonymousClass000.A0X(r5, r7)     // Catch:{ JSONException -> 0x034e }
            X.39C r5 = new X.39C     // Catch:{ JSONException -> 0x034e }
            r5.<init>(r0, r7, r12)     // Catch:{ JSONException -> 0x034e }
        L_0x0305:
            android.content.Intent r7 = X.C18320x8.A07()     // Catch:{ JSONException -> 0x034e }
            java.lang.String r1 = r28.getPackageName()     // Catch:{ JSONException -> 0x034e }
            java.lang.String r0 = "com.whatsapp.extensions.bloks.WaExtensionsBottomsheetModalActivity"
            r7.setClassName(r1, r0)     // Catch:{ JSONException -> 0x034e }
            X.C18310x6.A11(r7, r10, r9)     // Catch:{ JSONException -> 0x034e }
            java.lang.String r0 = "screen_cache_config"
            r7.putExtra(r0, r5)     // Catch:{ JSONException -> 0x034e }
            r27 = r4
            r29 = r7
            r30 = r36
            r31 = r2
            r32 = r25
            r27.A0E(r28, r29, r30, r31, r32)     // Catch:{ JSONException -> 0x034e }
            r1 = r21
            r0 = r34
            r7.putExtra(r1, r0)     // Catch:{ JSONException -> 0x034e }
            java.lang.String r0 = "make_metadata_request"
            r7.putExtra(r0, r12)     // Catch:{ JSONException -> 0x034e }
            java.lang.String r1 = "show_report_menu"
            r0 = 3216(0xc90, float:4.507E-42)
            boolean r0 = r8.A0Y(r6, r0)     // Catch:{ JSONException -> 0x034e }
            r7.putExtra(r1, r0)     // Catch:{ JSONException -> 0x034e }
            java.lang.String r1 = "extensions_impl_type"
            java.lang.String r0 = "2"
            r7.putExtra(r1, r0)     // Catch:{ JSONException -> 0x034e }
        L_0x0347:
            r7.getExtras()     // Catch:{ JSONException -> 0x034e }
            r3.startActivity(r7)     // Catch:{ JSONException -> 0x034e }
            return
        L_0x034e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r0 = r18
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r2)
            com.whatsapp.util.Log.e(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QO.A0D(android.app.Activity, X.398, java.lang.String, java.lang.String, long):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1QO(X.C194449Sx r15, X.C56422rx r16, X.C613530j r17, com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines r18, X.C620633i r19, X.AnonymousClass33p r20, X.C620733j r21, X.C53412n3 r22, X.AnonymousClass2YC r23, X.C53822nj r24, X.C56162rW r25, X.AnonymousClass1Uc r26, X.C23651Ud r27, X.AnonymousClass1VX r28, X.AnonymousClass2Q6 r29, X.C60482yd r30, X.C60092xz r31) {
        /*
            r14 = this;
            r2 = r30
            r12 = r28
            r13 = r29
            r7 = r19
            r9 = r21
            X.C18260x0.A0f(r9, r12, r13, r7, r2)
            r6 = r16
            r8 = r20
            X.C18260x0.A0U(r6, r8)
            r0 = 9
            r1 = r31
            X.C162457s7.A0J(r1, r0)
            r0 = 12
            r3 = r24
            X.C162457s7.A0J(r3, r0)
            r0 = 16
            r10 = r22
            X.C162457s7.A0J(r10, r0)
            r0 = 17
            r11 = r23
            X.C162457s7.A0J(r11, r0)
            r4 = r14
            r5 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.A06 = r9
            r14.A0D = r12
            r14.A0E = r13
            r14.A04 = r7
            r14.A0F = r2
            r14.A01 = r6
            r14.A05 = r8
            r14.A00 = r15
            r14.A0G = r1
            r0 = r17
            r14.A02 = r0
            r0 = r18
            r14.A03 = r0
            r14.A09 = r3
            r0 = r26
            r14.A0B = r0
            r0 = r25
            r14.A0A = r0
            r0 = r27
            r14.A0C = r0
            r14.A07 = r10
            r14.A08 = r11
            X.40S r0 = X.AnonymousClass40S.A00
            X.66R r0 = X.C154517dI.A01(r0)
            r14.A0H = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QO.<init>(X.9Sx, X.2rx, X.30j, com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines, X.33i, X.33p, X.33j, X.2n3, X.2YC, X.2nj, X.2rW, X.1Uc, X.1Ud, X.1VX, X.2Q6, X.2yd, X.2xz):void");
    }
}
