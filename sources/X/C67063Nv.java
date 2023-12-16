package X;

/* renamed from: X.3Nv  reason: invalid class name and case insensitive filesystem */
public abstract class C67063Nv implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final C625235k A00;

    public static void A01(AnonymousClass1A4 r0, C208619p r1, C208719q r2, AnonymousClass1EK r3, int i) {
        r3.titleCase_ = i;
        r1.A0A(r2);
        r1.A09(r2);
        r0.A0H(r1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: X.1mv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: X.1mv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: X.1p7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v68, resolved type: X.1p7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: X.1mv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: X.1mv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: X.1mv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: X.1mv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: X.1p5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: X.1n0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: X.1nY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: X.1p7} */
    /* JADX WARNING: type inference failed for: r12v2, types: [X.1nB, X.1mV, X.1mx, X.34x] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0205, code lost:
        r3 = X.C30471mV.A00(r12);
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x020d, code lost:
        if ((r11.bitField0_ & 32) == 0) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x020f, code lost:
        r3.A05 = X.C626635z.A04(r11);
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01f6, code lost:
        if (r3 == false) goto L_0x0073;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C624134x BgW(X.C55962rC r17) {
        /*
            r16 = this;
            r0 = r17
            X.1EU r2 = X.C55962rC.A01(r0)
            boolean r1 = r2.A0M()
            if (r1 != 0) goto L_0x000e
            r0 = 0
            return r0
        L_0x000e:
            X.1EI r1 = r2.templateMessage_
            if (r1 != 0) goto L_0x0014
            X.1EI r1 = X.AnonymousClass1EI.DEFAULT_INSTANCE
        L_0x0014:
            r6 = r16
            X.35k r2 = r6.A00
            X.1VX r4 = r2.A01
            r3 = 3444(0xd74, float:4.826E-42)
            X.2vE r2 = X.C58422vE.A02
            boolean r2 = r4.A0Y(r2, r3)
            if (r2 != 0) goto L_0x0040
            X.1EK r2 = X.AnonymousClass0x9.A0V(r1)
            java.util.List r2 = X.C625235k.A02(r4, r2)
            if (r2 == 0) goto L_0x0040
            int r3 = r2.size()
            r2 = 5
            if (r3 <= r2) goto L_0x0040
            java.lang.Integer r1 = X.C18300x5.A0Z()
            java.lang.String r0 = "Template message is not valid."
            X.24W r0 = X.AnonymousClass24W.A01(r1, r0)
            throw r0
        L_0x0040:
            X.C162457s7.A0H(r1)
            boolean r2 = r6 instanceof X.C32941rw
            if (r2 == 0) goto L_0x00ac
            X.1rw r6 = (X.C32941rw) r6
            int r2 = r1.formatCase_
            boolean r2 = X.AnonymousClass001.A1T(r2)
            if (r2 == 0) goto L_0x00a1
            X.1EJ r2 = r1.A0M()
            X.208 r3 = r2.A0M()
            X.208 r2 = X.AnonymousClass208.VIDEO_MESSAGE
        L_0x005b:
            if (r3 != r2) goto L_0x026d
            X.1ED r7 = X.C625235k.A01(r1)
            boolean r2 = r7.gifPlayback_
            if (r2 != 0) goto L_0x026d
            X.2z0 r5 = r0.A0D
            long r2 = r0.A05
            X.1p7 r12 = new X.1p7
            r12.<init>(r5, r2)
            X.2om r2 = r6.A00
            X.C54472om.A00(r0, r7, r12, r2)
        L_0x0073:
            boolean r2 = r12 instanceof X.AnonymousClass4FG
            if (r2 == 0) goto L_0x009e
            r2 = r12
            X.4FG r2 = (X.AnonymousClass4FG) r2
            X.1EK r3 = X.AnonymousClass0x9.A0V(r1)
            java.lang.String r5 = r3.hydratedContentText_
            int r1 = r3.bitField0_
            r1 = r1 & 64
            if (r1 == 0) goto L_0x009f
            java.lang.String r6 = r3.hydratedFooterText_
        L_0x0088:
            java.lang.String r7 = r3.templateId_
            java.util.List r10 = X.C625235k.A02(r4, r3)
            java.lang.Long r4 = r0.A0E
            java.lang.String r8 = r0.A0H
            java.lang.String r9 = r0.A0I
            boolean r11 = r0.A03
            X.2cm r3 = new X.2cm
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r2.BnY(r3)
        L_0x009e:
            return r12
        L_0x009f:
            r6 = 0
            goto L_0x0088
        L_0x00a1:
            X.1EK r2 = X.AnonymousClass0x9.A0V(r1)
            X.209 r3 = r2.A0M()
            X.209 r2 = X.AnonymousClass209.VIDEO_MESSAGE
            goto L_0x005b
        L_0x00ac:
            boolean r2 = r6 instanceof X.C32931rv
            if (r2 == 0) goto L_0x00fc
            int r3 = r1.formatCase_
            r2 = 1
            if (r3 != r2) goto L_0x00f1
            X.1EJ r2 = r1.A0M()
            X.208 r3 = r2.A0M()
            X.208 r2 = X.AnonymousClass208.LOCATION_MESSAGE
        L_0x00bf:
            if (r3 != r2) goto L_0x026d
            X.2z0 r5 = r0.A0D
            long r2 = r0.A05
            X.1nY r12 = new X.1nY
            r12.<init>(r5, r2)
            int r3 = r1.formatCase_
            r2 = 1
            if (r3 != r2) goto L_0x00e2
            X.1EJ r5 = r1.A0M()
            int r3 = r5.titleCase_
            r2 = 5
            if (r3 != r2) goto L_0x00ee
            java.lang.Object r3 = r5.title_
        L_0x00da:
            X.1Dy r3 = (X.C21991Dy) r3
        L_0x00dc:
            boolean r2 = r0.A0O
            X.C59122wO.A00(r3, r12, r2)
            goto L_0x0073
        L_0x00e2:
            X.1EK r5 = X.AnonymousClass0x9.A0V(r1)
            int r3 = r5.titleCase_
            r2 = 5
            if (r3 != r2) goto L_0x00ee
            java.lang.Object r3 = r5.title_
            goto L_0x00da
        L_0x00ee:
            X.1Dy r3 = X.C21991Dy.DEFAULT_INSTANCE
            goto L_0x00dc
        L_0x00f1:
            X.1EK r2 = X.AnonymousClass0x9.A0V(r1)
            X.209 r3 = r2.A0M()
            X.209 r2 = X.AnonymousClass209.LOCATION_MESSAGE
            goto L_0x00bf
        L_0x00fc:
            boolean r2 = r6 instanceof X.C32921ru
            if (r2 == 0) goto L_0x0157
            X.1ru r6 = (X.C32921ru) r6
            int r3 = r1.formatCase_
            r2 = 1
            if (r3 != r2) goto L_0x014c
            X.1EJ r2 = r1.A0M()
            X.208 r3 = r2.A0M()
            X.208 r2 = X.AnonymousClass208.IMAGE_MESSAGE
        L_0x0111:
            if (r3 != r2) goto L_0x026d
            X.2z0 r5 = r0.A0D
            long r2 = r0.A05
            X.1n0 r12 = new X.1n0
            r12.<init>(r5, r2)
            X.2ki r10 = r6.A00
            int r3 = r1.formatCase_
            r2 = 1
            if (r3 != r2) goto L_0x013d
            X.1EJ r5 = r1.A0M()
            int r3 = r5.titleCase_
            r2 = 3
            if (r3 != r2) goto L_0x0149
            java.lang.Object r11 = r5.title_
        L_0x012e:
            X.1EE r11 = (X.AnonymousClass1EE) r11
        L_0x0130:
            boolean r14 = r0.A04()
            boolean r15 = r0.A0O
            int r13 = r12.A01
            r10.A03(r11, r12, r13, r14, r15)
            goto L_0x0073
        L_0x013d:
            X.1EK r5 = X.AnonymousClass0x9.A0V(r1)
            int r3 = r5.titleCase_
            r2 = 3
            if (r3 != r2) goto L_0x0149
            java.lang.Object r11 = r5.title_
            goto L_0x012e
        L_0x0149:
            X.1EE r11 = X.AnonymousClass1EE.DEFAULT_INSTANCE
            goto L_0x0130
        L_0x014c:
            X.1EK r2 = X.AnonymousClass0x9.A0V(r1)
            X.209 r3 = r2.A0M()
            X.209 r2 = X.AnonymousClass209.IMAGE_MESSAGE
            goto L_0x0111
        L_0x0157:
            boolean r2 = r6 instanceof X.C32891rr
            if (r2 == 0) goto L_0x01b7
            int r7 = r1.formatCase_
            boolean r2 = X.AnonymousClass001.A1T(r7)
            r6 = 1
            if (r2 == 0) goto L_0x0191
            X.1EJ r2 = r1.A0M()
            X.208 r3 = r2.A0M()
            X.208 r2 = X.AnonymousClass208.HIGHLY_STRUCTURED_MESSAGE
        L_0x016e:
            if (r3 == r2) goto L_0x0171
            r6 = 0
        L_0x0171:
            r5 = 0
            if (r6 != 0) goto L_0x019c
            r2 = 1
            if (r7 != r2) goto L_0x0186
            X.1EJ r2 = r1.A0M()
            X.208 r3 = r2.A0M()
            X.208 r2 = X.AnonymousClass208.TITLE_NOT_SET
        L_0x0181:
            if (r3 == r2) goto L_0x019c
            r12 = r5
            goto L_0x0073
        L_0x0186:
            X.1EK r2 = X.AnonymousClass0x9.A0V(r1)
            X.209 r3 = r2.A0M()
            X.209 r2 = X.AnonymousClass209.TITLE_NOT_SET
            goto L_0x0181
        L_0x0191:
            X.1EK r2 = X.AnonymousClass0x9.A0V(r1)
            X.209 r3 = r2.A0M()
            X.209 r2 = X.AnonymousClass209.HYDRATED_TITLE_TEXT
            goto L_0x016e
        L_0x019c:
            X.2z0 r6 = r0.A0D
            long r2 = r0.A05
            X.1p5 r12 = new X.1p5
            r12.<init>(r6, r2)
            X.1EK r6 = X.AnonymousClass0x9.A0V(r1)
            int r3 = r6.titleCase_
            r2 = 2
            if (r3 != r2) goto L_0x01b2
            java.lang.Object r5 = r6.title_
            java.lang.String r5 = (java.lang.String) r5
        L_0x01b2:
            r12.A1Z(r5)
            goto L_0x0073
        L_0x01b7:
            boolean r2 = r6 instanceof X.C32911rt
            if (r2 == 0) goto L_0x0217
            X.1rt r6 = (X.C32911rt) r6
            int r2 = r1.formatCase_
            boolean r2 = X.AnonymousClass001.A1T(r2)
            if (r2 == 0) goto L_0x01fa
            X.1EJ r2 = r1.A0M()
            X.208 r3 = r2.A0M()
            X.208 r2 = X.AnonymousClass208.VIDEO_MESSAGE
        L_0x01cf:
            if (r3 != r2) goto L_0x026d
            X.1ED r11 = X.C625235k.A01(r1)
            boolean r2 = r11.gifPlayback_
            if (r2 == 0) goto L_0x026d
            X.2z0 r5 = r0.A0D
            long r2 = r0.A05
            X.1mx r12 = new X.1mx
            r12.<init>(r5, r2)
            X.2om r10 = r6.A00
            boolean r14 = r0.A04()
            boolean r15 = r0.A0O
            int r13 = r12.A01
            r10.A04(r11, r12, r13, r14, r15)
            int r5 = r12.A01
            boolean r3 = r0.A0N
            r2 = 1
            if (r5 != r2) goto L_0x0205
            if (r3 != 0) goto L_0x0205
            goto L_0x0073
        L_0x01fa:
            X.1EK r2 = X.AnonymousClass0x9.A0V(r1)
            X.209 r3 = r2.A0M()
            X.209 r2 = X.AnonymousClass209.VIDEO_MESSAGE
            goto L_0x01cf
        L_0x0205:
            X.33C r3 = X.C30471mV.A00(r12)
            int r2 = r11.bitField0_
            r2 = r2 & 32
            if (r2 == 0) goto L_0x0073
            int r2 = X.C626635z.A04(r11)
            r3.A05 = r2
            goto L_0x0073
        L_0x0217:
            X.1rs r6 = (X.C32901rs) r6
            int r3 = r1.formatCase_
            r2 = 1
            if (r3 != r2) goto L_0x0262
            X.1EJ r2 = r1.A0M()
            X.208 r3 = r2.A0M()
            X.208 r2 = X.AnonymousClass208.DOCUMENT_MESSAGE
        L_0x0228:
            if (r3 != r2) goto L_0x026d
            X.2z0 r5 = r0.A0D
            long r2 = r0.A05
            X.1mv r12 = new X.1mv
            r12.<init>(r5, r2)
            X.2fP r10 = r6.A00
            int r2 = r1.formatCase_
            r5 = 1
            if (r2 != r5) goto L_0x0253
            X.1EJ r3 = r1.A0M()
            int r2 = r3.titleCase_
            if (r2 != r5) goto L_0x025f
            java.lang.Object r11 = r3.title_
        L_0x0244:
            X.1EB r11 = (X.AnonymousClass1EB) r11
        L_0x0246:
            boolean r14 = r0.A04()
            boolean r15 = r0.A0O
            int r13 = r0.A01
            r10.A01(r11, r12, r13, r14, r15)
            goto L_0x0073
        L_0x0253:
            X.1EK r5 = X.AnonymousClass0x9.A0V(r1)
            int r3 = r5.titleCase_
            r2 = 1
            if (r3 != r2) goto L_0x025f
            java.lang.Object r11 = r5.title_
            goto L_0x0244
        L_0x025f:
            X.1EB r11 = X.AnonymousClass1EB.DEFAULT_INSTANCE
            goto L_0x0246
        L_0x0262:
            X.1EK r2 = X.AnonymousClass0x9.A0V(r1)
            X.209 r3 = r2.A0M()
            X.209 r2 = X.AnonymousClass209.DOCUMENT_MESSAGE
            goto L_0x0228
        L_0x026d:
            r12 = 0
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67063Nv.BgW(X.2rC):X.34x");
    }

    public C67063Nv(C625235k r1) {
        this.A00 = r1;
    }

    public static AnonymousClass1EK A00(C130546c9 r1, C130546c9 r2) {
        r1.A07();
        AnonymousClass1EK r12 = (AnonymousClass1EK) r1.A00;
        C130786cX A06 = r2.A06();
        A06.getClass();
        r12.title_ = A06;
        return r12;
    }
}
