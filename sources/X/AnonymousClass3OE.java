package X;

/* renamed from: X.3OE  reason: invalid class name */
public class AnonymousClass3OE implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final AnonymousClass1VX A00;
    public final AnonymousClass2WU A01;
    public final C58952w5 A02;
    public final C60292yJ A03;
    public final C50222hp A04;
    public final C53262mo A05;
    public final C183538qC A06;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r7 != false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C624134x A00(X.C55962rC r10) {
        /*
            r9 = this;
            X.2z0 r2 = r10.A0D
            long r4 = r10.A05
            boolean r0 = r10.A0N
            boolean r7 = r10.A0O
            if (r0 != 0) goto L_0x000d
            r6 = 0
            if (r7 == 0) goto L_0x000e
        L_0x000d:
            r6 = 1
        L_0x000e:
            X.2yJ r0 = r9.A03
            X.1EU r1 = r10.A0B
            java.lang.String r3 = r10.A0K
            boolean r8 = r10.A02
            X.34x r0 = r0.A02(r1, r2, r3, r4, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3OE.A00(X.2rC):X.34x");
    }

    public void AyD(C55032pg r4, C624134x r5) {
        C18260x0.A0l(r5, "FMessageInteractiveProtobuf: message type is not supported ", AnonymousClass001.A0o(), r5 instanceof C30791n7);
        AnonymousClass39W r1 = ((C30791n7) r5).A00;
        if (r1 != null) {
            this.A04.A00(r1).A0C(r4, r5);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: X.34x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: X.1n9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v42, resolved type: X.1n9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v44, resolved type: X.1n9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v45, resolved type: X.1n2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v46, resolved type: X.1n2} */
    /* JADX WARNING: type inference failed for: r5v16, types: [X.1pB, X.1nB] */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0285, code lost:
        if ((r10 & 2) != 0) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0475, code lost:
        if ("pending".equals(r1) == false) goto L_0x0533;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0533 A[EDGE_INSN: B:329:0x0533->B:322:0x0533 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0082 A[EDGE_INSN: B:341:0x0082->B:25:0x0082 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C624134x BgW(X.C55962rC r26) {
        /*
            r25 = this;
            r3 = r26
            X.1EU r2 = r3.A0B
            boolean r0 = X.C625235k.A03(r2)
            r6 = r25
            if (r0 == 0) goto L_0x006c
            X.1ER r8 = r2.interactiveMessage_
            if (r8 != 0) goto L_0x0012
            X.1ER r8 = X.AnonymousClass1ER.DEFAULT_INSTANCE
        L_0x0012:
            X.1VX r9 = r6.A00
            r7 = 3051(0xbeb, float:4.275E-42)
            X.2vE r5 = X.C58422vE.A02
            boolean r0 = r9.A0Y(r5, r7)
            r4 = 4
            if (r0 == 0) goto L_0x0049
            r0 = 0
            X.C162457s7.A0J(r8, r0)
            X.34T r1 = X.AnonymousClass34T.A00
            java.lang.String r0 = "message_with_link_status"
            boolean r0 = r1.A02(r8, r0)
            if (r0 == 0) goto L_0x0049
            X.2WU r7 = r6.A01
            X.8qC r0 = r6.A06
            X.3Lv r8 = X.AnonymousClass0x9.A0M(r0)
            X.2z0 r5 = r3.A0D
            long r0 = r3.A05
            r9 = r2
            r10 = r5
            r11 = r0
            X.34x r5 = r7.A00(r8, r9, r10, r11)
            X.2mo r1 = r6.A05
            java.lang.String r0 = "link_to_webview_status"
        L_0x0045:
            r1.A01(r5, r0, r4)
            return r5
        L_0x0049:
            boolean r0 = r9.A0Y(r5, r7)
            if (r0 == 0) goto L_0x0067
            r0 = 0
            X.C162457s7.A0J(r8, r0)
            X.34T r1 = X.AnonymousClass34T.A00
            java.lang.String r0 = "open_webview"
            boolean r0 = r1.A02(r8, r0)
            if (r0 == 0) goto L_0x0067
            X.34x r5 = r6.A00(r3)
            X.2mo r1 = r6.A05
            java.lang.String r0 = "link_to_webview"
            goto L_0x0045
        L_0x0067:
            X.34x r5 = r6.A00(r3)
            return r5
        L_0x006c:
            int r0 = r2.bitField1_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0542
            X.2w5 r4 = r6.A02
            X.8qC r0 = r6.A06
            X.3Lv r18 = X.AnonymousClass0x9.A0M(r0)
            X.1Df r6 = r2.buttonsMessage_
            if (r6 != 0) goto L_0x013b
            X.1Df r6 = X.C21801Df.DEFAULT_INSTANCE
            if (r6 != 0) goto L_0x013b
        L_0x0082:
            r0 = 0
        L_0x0083:
            r17 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            if (r0 != 0) goto L_0x0097
            X.1EF r0 = r6.contextInfo_
            if (r0 != 0) goto L_0x0093
            X.1EF r0 = X.AnonymousClass1EF.DEFAULT_INSTANCE
            if (r0 == 0) goto L_0x053c
        L_0x0093:
            boolean r0 = r0.isForwarded_
            if (r0 == 0) goto L_0x053c
        L_0x0097:
            int r0 = r6.headerType_
            X.23H r7 = X.AnonymousClass23H.A00(r0)
            if (r7 != 0) goto L_0x00a1
            X.23H r7 = X.AnonymousClass23H.UNKNOWN
        L_0x00a1:
            X.8ya r0 = r6.buttons_
            java.util.Iterator r12 = r0.iterator()
            r5 = 0
        L_0x00a8:
            r11 = 0
        L_0x00a9:
            boolean r0 = r12.hasNext()
            r10 = 1
            if (r0 == 0) goto L_0x01b8
            java.lang.Object r9 = r12.next()
            X.1Ck r9 = (X.C21591Ck) r9
            int r8 = r9.type_
            if (r8 == 0) goto L_0x0138
            if (r8 == r10) goto L_0x0135
            r0 = 2
            if (r8 != r0) goto L_0x0138
            X.22g r8 = X.AnonymousClass22g.NATIVE_FLOW
        L_0x00c1:
            X.22g r0 = X.AnonymousClass22g.UNKNOWN
            if (r8 == r0) goto L_0x0533
            X.22g r0 = X.AnonymousClass22g.NATIVE_FLOW
            if (r8 != r0) goto L_0x00a9
            int r5 = r5 + 1
            if (r11 != 0) goto L_0x0115
            X.2Ff r0 = r4.A00
            X.C162457s7.A0J(r7, r10)
            X.30C r8 = r0.A00
            int r0 = r9.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0115
            X.2Vs r10 = r8.A02
            X.1BB r8 = r9.nativeFlowInfo_
            r0 = r8
            if (r8 != 0) goto L_0x00e3
            X.1BB r8 = X.AnonymousClass1BB.DEFAULT_INSTANCE
        L_0x00e3:
            java.lang.String r8 = r8.name_
            if (r0 != 0) goto L_0x00e9
            X.1BB r0 = X.AnonymousClass1BB.DEFAULT_INSTANCE
        L_0x00e9:
            java.lang.String r0 = r0.paramsJson_
            X.2sP r8 = r10.A00(r8, r0)
            if (r8 == 0) goto L_0x0115
            boolean r0 = r8 instanceof X.AnonymousClass1QK
            if (r0 == 0) goto L_0x0117
            X.1QK r8 = (X.AnonymousClass1QK) r8
            X.23H r0 = X.AnonymousClass23H.IMAGE
            if (r7 != r0) goto L_0x0115
            int r0 = r9.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0115
            X.1BB r0 = r9.nativeFlowInfo_
            if (r0 != 0) goto L_0x0107
            X.1BB r0 = X.AnonymousClass1BB.DEFAULT_INSTANCE
        L_0x0107:
            java.lang.String r0 = r0.paramsJson_
            java.lang.String r0 = r8.A0C(r0)
            if (r0 == 0) goto L_0x0115
            boolean r0 = X.C175738Zn.A0V(r0)
            if (r0 == 0) goto L_0x00a8
        L_0x0115:
            r11 = 1
            goto L_0x00a9
        L_0x0117:
            boolean r0 = r8 instanceof X.AnonymousClass1QJ
            if (r0 != 0) goto L_0x0115
            boolean r0 = r8 instanceof X.AnonymousClass1Q8
            if (r0 != 0) goto L_0x00a8
            X.23H r0 = X.AnonymousClass23H.DOCUMENT
            if (r7 == r0) goto L_0x00a8
            X.23H r0 = X.AnonymousClass23H.TEXT
            if (r7 == r0) goto L_0x00a8
            X.23H r0 = X.AnonymousClass23H.VIDEO
            if (r7 == r0) goto L_0x00a8
            X.23H r0 = X.AnonymousClass23H.IMAGE
            if (r7 == r0) goto L_0x00a8
            X.23H r0 = X.AnonymousClass23H.EMPTY
            if (r7 != r0) goto L_0x0115
            goto L_0x00a8
        L_0x0135:
            X.22g r8 = X.AnonymousClass22g.RESPONSE
            goto L_0x00c1
        L_0x0138:
            X.22g r8 = X.AnonymousClass22g.UNKNOWN
            goto L_0x00c1
        L_0x013b:
            int r0 = r6.bitField0_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0082
            java.lang.String r0 = r6.contentText_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0082
            X.8ya r1 = r6.buttons_
            if (r1 == 0) goto L_0x0082
            int r0 = r1.size()
            if (r0 == 0) goto L_0x0082
            java.util.Iterator r8 = r1.iterator()
        L_0x0157:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01b5
            java.lang.Object r7 = r8.next()
            X.1Ck r7 = (X.C21591Ck) r7
            int r1 = r7.type_
            if (r1 == 0) goto L_0x01b2
            r0 = 1
            if (r1 == r0) goto L_0x01af
            r0 = 2
            if (r1 != r0) goto L_0x01b2
            X.22g r5 = X.AnonymousClass22g.NATIVE_FLOW
        L_0x016f:
            X.22g r1 = X.AnonymousClass22g.NATIVE_FLOW
            int r0 = r7.bitField0_
            if (r5 != r1) goto L_0x0194
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0082
            X.1BB r0 = r7.nativeFlowInfo_
            r1 = r0
            if (r0 != 0) goto L_0x0180
            X.1BB r0 = X.AnonymousClass1BB.DEFAULT_INSTANCE
        L_0x0180:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0082
            if (r1 != 0) goto L_0x018a
            X.1BB r1 = X.AnonymousClass1BB.DEFAULT_INSTANCE
        L_0x018a:
            java.lang.String r0 = r1.name_
        L_0x018c:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0157
            goto L_0x0082
        L_0x0194:
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0082
            X.1AI r0 = r7.buttonText_
            if (r0 != 0) goto L_0x019e
            X.1AI r0 = X.AnonymousClass1AI.DEFAULT_INSTANCE
        L_0x019e:
            java.lang.String r0 = r0.displayText_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0082
            int r0 = r7.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0082
            java.lang.String r0 = r7.buttonId_
            goto L_0x018c
        L_0x01af:
            X.22g r5 = X.AnonymousClass22g.RESPONSE
            goto L_0x016f
        L_0x01b2:
            X.22g r5 = X.AnonymousClass22g.UNKNOWN
            goto L_0x016f
        L_0x01b5:
            r0 = 1
            goto L_0x0083
        L_0x01b8:
            r0 = 2
            if (r5 > r0) goto L_0x0533
            if (r11 != 0) goto L_0x0533
            int r0 = r6.headerType_
            X.23H r5 = X.AnonymousClass23H.A00(r0)
            if (r5 != 0) goto L_0x01c7
            X.23H r5 = X.AnonymousClass23H.UNKNOWN
        L_0x01c7:
            java.lang.String r12 = "payment_status"
            boolean r14 = X.C58952w5.A00(r6, r12)
            java.lang.String r11 = "review_and_pay"
            boolean r0 = X.C58952w5.A00(r6, r11)
            java.lang.String r10 = "message_with_link_status"
            java.lang.String r9 = "payment_method"
            java.lang.String r8 = "review_order"
            r13 = 4
            r7 = 0
            if (r0 != 0) goto L_0x0446
            if (r14 != 0) goto L_0x0446
            boolean r0 = X.C58952w5.A00(r6, r8)
            if (r0 == 0) goto L_0x02c9
            X.C626936e.A06(r18)
            X.2z0 r5 = r3.A0D
            X.4uZ r0 = r5.A00
            r19 = r0
            X.C626936e.A06(r19)
            X.33Y r0 = r4.A09
            r16 = r0
            X.C626936e.A06(r16)
            X.1VX r15 = r4.A02
            r13 = 2688(0xa80, float:3.767E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r15.A0Y(r0, r13)
            if (r0 == 0) goto L_0x0489
            X.3OG r14 = r4.A07
            X.1n4 r21 = r14.A01(r3)
            long r0 = r3.A05
            boolean r13 = r3.A0O
            r19 = r2
            r20 = r5
            r22 = r0
            r24 = r13
            r17 = r14
            X.34x r5 = r17.A00(r18, r19, r20, r21, r22, r24)
        L_0x0221:
            boolean r0 = X.C58952w5.A00(r6, r11)
            if (r0 != 0) goto L_0x0506
            boolean r0 = X.C58952w5.A00(r6, r8)
            if (r0 != 0) goto L_0x0506
            boolean r0 = X.C58952w5.A00(r6, r9)
            if (r0 != 0) goto L_0x0506
            boolean r0 = X.C58952w5.A00(r6, r12)
            if (r0 != 0) goto L_0x0506
            boolean r0 = X.C58952w5.A00(r6, r10)
            if (r0 != 0) goto L_0x0506
            java.lang.String r9 = r6.contentText_
            java.lang.String r8 = r6.footerText_
            X.8ya r0 = r6.buttons_
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Iterator r13 = r0.iterator()
        L_0x024d:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x04fe
            java.lang.Object r11 = r13.next()
            X.1Ck r11 = (X.C21591Ck) r11
            int r10 = r11.bitField0_
            r0 = r10 & 8
            if (r0 == 0) goto L_0x02c7
            X.1BB r0 = r11.nativeFlowInfo_
            r12 = r0
            if (r0 != 0) goto L_0x0266
            X.1BB r0 = X.AnonymousClass1BB.DEFAULT_INSTANCE
        L_0x0266:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x02c7
            r0 = r12
            if (r12 != 0) goto L_0x0271
            X.1BB r0 = X.AnonymousClass1BB.DEFAULT_INSTANCE
        L_0x0271:
            java.lang.String r1 = r0.name_
            if (r12 != 0) goto L_0x0277
            X.1BB r12 = X.AnonymousClass1BB.DEFAULT_INSTANCE
        L_0x0277:
            java.lang.String r0 = r12.paramsJson_
            X.398 r15 = new X.398
            r15.<init>(r1, r0)
        L_0x027e:
            r1 = 1
            r0 = r10 & 1
            if (r0 == 0) goto L_0x02bf
            r0 = r10 & 2
            if (r0 == 0) goto L_0x02c0
        L_0x0287:
            java.lang.String r10 = r11.buttonId_
        L_0x0289:
            X.1AI r0 = r11.buttonText_
            if (r0 != 0) goto L_0x028f
            X.1AI r0 = X.AnonymousClass1AI.DEFAULT_INSTANCE
        L_0x028f:
            java.lang.String r1 = r0.displayText_
            r19 = 0
            int r11 = r11.type_
            if (r11 == 0) goto L_0x02bc
            r0 = 1
            if (r11 == r0) goto L_0x02b9
            r0 = 2
            if (r11 != r0) goto L_0x02bc
            X.22g r11 = X.AnonymousClass22g.NATIVE_FLOW
        L_0x029f:
            X.22g r0 = X.AnonymousClass22g.NATIVE_FLOW
            if (r11 != r0) goto L_0x02b2
            r18 = 2
        L_0x02a5:
            X.2bn r14 = new X.2bn
            r16 = r10
            r17 = r1
            r14.<init>(r15, r16, r17, r18, r19)
            r6.add(r14)
            goto L_0x024d
        L_0x02b2:
            X.22g r0 = X.AnonymousClass22g.RESPONSE
            boolean r18 = X.AnonymousClass000.A1Y(r11, r0)
            goto L_0x02a5
        L_0x02b9:
            X.22g r11 = X.AnonymousClass22g.RESPONSE
            goto L_0x029f
        L_0x02bc:
            X.22g r11 = X.AnonymousClass22g.UNKNOWN
            goto L_0x029f
        L_0x02bf:
            r1 = 0
        L_0x02c0:
            if (r15 == 0) goto L_0x024d
            if (r1 != 0) goto L_0x0287
            java.lang.String r10 = r15.A00
            goto L_0x0289
        L_0x02c7:
            r15 = 0
            goto L_0x027e
        L_0x02c9:
            boolean r0 = X.C58952w5.A00(r6, r9)
            if (r0 == 0) goto L_0x033a
            X.C626936e.A06(r18)
            X.2z0 r5 = r3.A0D
            X.4uZ r13 = X.AnonymousClass2z0.A01(r5)
            X.2oU r0 = r4.A01
            r16 = r0
            X.1VX r14 = r4.A02
            java.lang.String r0 = X.C626535y.A03(r2)
            java.lang.Integer r0 = X.C624935g.A00(r14, r0)
            r15 = 0
            if (r0 == 0) goto L_0x0527
            int r14 = r0.intValue()
            android.content.res.Resources r0 = X.C54292oU.A00(r16)
            java.lang.String r14 = r0.getString(r14)
            int r0 = r2.bitField1_
            r16 = r0 & 8
            if (r16 == 0) goto L_0x032d
            X.1ER r0 = r2.interactiveMessage_
            if (r0 != 0) goto L_0x0301
            X.1ER r0 = X.AnonymousClass1ER.DEFAULT_INSTANCE
        L_0x0301:
            X.1AN r0 = r0.body_
            if (r0 != 0) goto L_0x0307
            X.1AN r0 = X.AnonymousClass1AN.DEFAULT_INSTANCE
        L_0x0307:
            java.lang.String r15 = r0.text_
        L_0x0309:
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x031b
            r0 = 2
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r0]
            X.C18280x3.A19(r14, r15, r0)
            java.lang.String r14 = "\n"
            java.lang.String r14 = X.C107575bX.A09(r14, r0)
        L_0x031b:
            if (r14 == 0) goto L_0x0527
            long r0 = r3.A05
            X.1mW r5 = X.C30481mW.A00(r5, r14, r0)
            r1 = r17
            r0 = r18
            X.4DV r13 = X.AnonymousClass35F.A01(r0, r13, r2, r1)
            goto L_0x04db
        L_0x032d:
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0309
            X.1Df r0 = r2.buttonsMessage_
            if (r0 != 0) goto L_0x0337
            X.1Df r0 = X.C21801Df.DEFAULT_INSTANCE
        L_0x0337:
            java.lang.String r15 = r0.contentText_
            goto L_0x0309
        L_0x033a:
            X.1VX r14 = r4.A02
            r1 = 3051(0xbeb, float:4.275E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r14.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0367
            boolean r0 = X.C58952w5.A00(r6, r10)
            if (r0 == 0) goto L_0x0367
            X.2WU r14 = r4.A06
            X.2z0 r5 = r3.A0D
            long r0 = r3.A05
            r15 = r18
            r16 = r2
            r17 = r5
            r18 = r0
            X.34x r5 = r14.A00(r15, r16, r17, r18)
            X.2mo r1 = r4.A0B
            java.lang.String r0 = "link_to_webview_status"
            r1.A01(r5, r0, r13)
            goto L_0x0221
        L_0x0367:
            X.23H r0 = X.AnonymousClass23H.DOCUMENT
            if (r5 != r0) goto L_0x03a2
            int r1 = r6.headerCase_
            r0 = 2
            if (r1 != r0) goto L_0x03a2
            java.lang.Object r13 = r6.header_
            X.1EB r13 = (X.AnonymousClass1EB) r13
            X.3OD r15 = r4.A03
            X.2z0 r14 = r3.A0D
            long r0 = r3.A05
            X.1nF r5 = new X.1nF
            r5.<init>(r14, r0)
            X.2fP r14 = r15.A02
            boolean r18 = r3.A04()
            boolean r1 = r3.A0O
            int r0 = r3.A01
            r15 = r13
            r16 = r5
            r17 = r0
            r19 = r1
            r14.A01(r15, r16, r17, r18, r19)
            int r1 = r13.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0221
            X.1EF r7 = r13.contextInfo_
        L_0x039c:
            if (r7 != 0) goto L_0x0221
            X.1EF r7 = X.AnonymousClass1EF.DEFAULT_INSTANCE
            goto L_0x0221
        L_0x03a2:
            X.23H r0 = X.AnonymousClass23H.IMAGE
            if (r5 != r0) goto L_0x03c8
            int r1 = r6.headerCase_
            r0 = 3
            if (r1 != r0) goto L_0x03c8
            java.lang.Object r13 = r6.header_
            X.1EE r13 = (X.AnonymousClass1EE) r13
            X.3O8 r15 = r4.A04
            X.2z0 r14 = r3.A0D
            long r0 = r3.A05
            X.1n2 r5 = new X.1n2
            r5.<init>(r14, r0)
            X.2ki r0 = r15.A02
            X.C51992ki.A00(r3, r13, r5, r0)
            int r0 = r13.bitField0_
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0221
            X.1EF r7 = r13.contextInfo_
            goto L_0x039c
        L_0x03c8:
            X.23H r0 = X.AnonymousClass23H.VIDEO
            if (r5 != r0) goto L_0x03ed
            int r0 = r6.headerCase_
            if (r0 != r13) goto L_0x03ed
            java.lang.Object r13 = r6.header_
            X.1ED r13 = (X.AnonymousClass1ED) r13
            X.3O9 r15 = r4.A05
            X.2z0 r14 = r3.A0D
            long r0 = r3.A05
            X.1pB r5 = new X.1pB
            r5.<init>(r14, r0)
            X.2om r0 = r15.A02
            X.C54472om.A00(r3, r13, r5, r0)
            int r0 = r13.bitField0_
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0221
            X.1EF r7 = r13.contextInfo_
            goto L_0x039c
        L_0x03ed:
            X.23H r0 = X.AnonymousClass23H.LOCATION
            if (r5 != r0) goto L_0x041a
            int r1 = r6.headerCase_
            r0 = 5
            if (r1 != r0) goto L_0x041a
            java.lang.Object r13 = r6.header_
            X.1Dy r13 = (X.C21991Dy) r13
            X.1Dy r14 = r2.locationMessage_
            if (r14 != 0) goto L_0x0400
            X.1Dy r14 = X.C21991Dy.DEFAULT_INSTANCE
        L_0x0400:
            X.C626936e.A06(r14)
            X.2z0 r15 = r3.A0D
            long r0 = r3.A05
            X.1n9 r5 = new X.1n9
            r5.<init>(r15, r0)
            boolean r0 = r3.A0O
            X.C59122wO.A00(r14, r5, r0)
            int r0 = r13.bitField0_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0221
            X.1EF r7 = r13.contextInfo_
            goto L_0x039c
        L_0x041a:
            X.23H r0 = X.AnonymousClass23H.TEXT
            if (r5 != r0) goto L_0x043b
            int r1 = r6.headerCase_
            r0 = 1
            if (r1 != r0) goto L_0x043b
            X.2z0 r14 = r3.A0D
            long r0 = r3.A05
            java.lang.Object r13 = r6.header_
            java.lang.String r13 = (java.lang.String) r13
        L_0x042b:
            X.1mW r5 = new X.1mW
            r5.<init>(r14, r0)
            r0 = 65536(0x10000, float:9.18355E-41)
            java.lang.String r0 = X.C107575bX.A0C(r13, r0)
            r5.A1Z(r0)
            goto L_0x0221
        L_0x043b:
            X.23H r0 = X.AnonymousClass23H.EMPTY
            if (r5 != r0) goto L_0x0533
            X.2z0 r14 = r3.A0D
            long r0 = r3.A05
            java.lang.String r13 = ""
            goto L_0x042b
        L_0x0446:
            X.3OG r0 = r4.A07
            X.1n4 r5 = r0.A01(r3)
            X.39W r0 = r5.A00
            if (r0 == 0) goto L_0x0533
            X.39S r0 = r0.A01
            if (r0 == 0) goto L_0x0533
            X.39H r0 = r0.A07
            java.lang.String r0 = r0.A01
            int r0 = X.AnonymousClass39S.A00(r0)
            if (r0 == 0) goto L_0x0533
            if (r14 == 0) goto L_0x0477
            X.39W r0 = r5.A00
            X.39S r0 = r0.A01
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "captured"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0477
            java.lang.String r0 = "pending"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0533
        L_0x0477:
            X.2rA r1 = r4.A0C
            boolean r0 = r1.A04(r5)
            if (r0 != 0) goto L_0x0221
            X.4FS r15 = r1.A0D
            r0 = 16
            X.3cY r14 = new X.3cY
            r14.<init>(r5, r1, r0)
            goto L_0x04f6
        L_0x0489:
            X.2oU r14 = r4.A01
            java.lang.String r0 = X.C626535y.A03(r2)
            if (r0 == 0) goto L_0x052d
            java.lang.String r13 = X.C624935g.A02(r0)
            X.2dl r0 = X.AnonymousClass2BO.A00
            boolean r0 = r0.A01(r15)
            if (r0 == 0) goto L_0x04fb
            java.util.Map r0 = X.C624935g.A04
        L_0x049f:
            java.lang.Number r0 = X.AnonymousClass0x9.A0q(r13, r0)
            if (r0 == 0) goto L_0x052d
            int r13 = r0.intValue()
            android.content.res.Resources r0 = X.C54292oU.A00(r14)
            java.lang.String r14 = r0.getString(r13)
            java.lang.String r15 = X.C624935g.A01(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x04c7
            r0 = 2
            java.lang.CharSequence[] r13 = new java.lang.CharSequence[r0]
            X.C18280x3.A19(r14, r15, r13)
            java.lang.String r0 = "\n"
            java.lang.String r14 = X.C107575bX.A09(r0, r13)
        L_0x04c7:
            if (r14 == 0) goto L_0x052d
            long r0 = r3.A05
            X.1mW r5 = X.C30481mW.A00(r5, r14, r0)
            r20 = r16
            r21 = r2
            r22 = r5
            r23 = r17
            X.4DV r13 = X.AnonymousClass35F.A00(r18, r19, r20, r21, r22, r23)
        L_0x04db:
            if (r13 == 0) goto L_0x0221
            X.2Wx r1 = r4.A0A
            r0 = r13
            X.34x r0 = (X.C624134x) r0
            r1.A00(r5, r0)
            X.2rA r1 = r4.A0C
            boolean r0 = r1.A04(r13)
            if (r0 != 0) goto L_0x0221
            X.4FS r15 = r1.A0D
            r0 = 15
            X.3cY r14 = new X.3cY
            r14.<init>(r13, r1, r0)
        L_0x04f6:
            r15.BkM(r14)
            goto L_0x0221
        L_0x04fb:
            java.util.Map r0 = X.C624935g.A03
            goto L_0x049f
        L_0x04fe:
            X.2Ot r0 = new X.2Ot
            r0.<init>(r9, r8, r6)
            r5.A1U(r0)
        L_0x0506:
            X.8qC r0 = r4.A0D
            java.lang.Object r4 = r0.get()
            X.3LW r4 = (X.AnonymousClass3LW) r4
            int r1 = r2.bitField0_
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1S(r1)
            if (r0 == 0) goto L_0x0525
            X.1Dk r1 = r2.messageContextInfo_
            if (r1 != 0) goto L_0x051f
            X.1Dk r1 = X.C21851Dk.DEFAULT_INSTANCE
        L_0x051f:
            X.2i1 r0 = r4.A07
            r0.A01(r3, r7, r1, r5)
            return r5
        L_0x0525:
            r1 = 0
            goto L_0x051f
        L_0x0527:
            X.24W r0 = new X.24W
            r0.<init>(r1)
            throw r0
        L_0x052d:
            X.24W r0 = new X.24W
            r0.<init>(r1)
            throw r0
        L_0x0533:
            X.2z0 r4 = r3.A0D
            long r0 = r3.A05
            X.1mJ r5 = X.C30351mJ.A00(r2, r4, r0)
            return r5
        L_0x053c:
            X.24W r0 = new X.24W
            r0.<init>(r1)
            throw r0
        L_0x0542:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3OE.BgW(X.2rC):X.34x");
    }

    public AnonymousClass3OE(AnonymousClass1VX r1, AnonymousClass2WU r2, C58952w5 r3, C60292yJ r4, C50222hp r5, C53262mo r6, C183538qC r7) {
        this.A04 = r5;
        this.A03 = r4;
        this.A06 = r7;
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = r6;
        this.A02 = r3;
    }
}
