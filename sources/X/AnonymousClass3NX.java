package X;

import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.3NX  reason: invalid class name */
public class AnonymousClass3NX implements AnonymousClass4AG, C85364Fy, AnonymousClass4G6 {
    public final AnonymousClass1VX A00;
    public final C183538qC A01;

    public void AyD(C55032pg r3, C624134x r4) {
        C626936e.A0D(false, "FMessageEdit.buildProtobufMessage() must never be called directly.");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0254, code lost:
        r0 = X.C55032pg.A00(r0, r13, r2, r11, r1);
        r1 = X.C18290x4.A0S(r3);
        r0.getClass();
        r1.contextInfo_ = r0;
        r1.bitField0_ |= 16384;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass4A2 r12, X.C55032pg r13, X.C624134x r14) {
        /*
            X.1A4 r9 = r13.A00
            X.6cX r0 = r9.A00
            X.1EU r0 = (X.AnonymousClass1EU) r0
            X.1AL r0 = r0.editedMessage_
            if (r0 != 0) goto L_0x000c
            X.1AL r0 = X.AnonymousClass1AL.DEFAULT_INSTANCE
        L_0x000c:
            X.6c9 r8 = r0.A0H()
            X.19u r8 = (X.C209119u) r8
            X.1EU r0 = r8.A09()
            X.6c9 r7 = r0.A0H()
            X.1A4 r7 = (X.AnonymousClass1A4) r7
            X.19x r6 = X.AnonymousClass1A4.A02(r7)
            X.6cX r0 = r6.A00
            X.1EM r0 = (X.AnonymousClass1EM) r0
            X.1EU r0 = r0.editedMessage_
            if (r0 != 0) goto L_0x002a
            X.1EU r0 = X.AnonymousClass1EU.DEFAULT_INSTANCE
        L_0x002a:
            X.6c9 r5 = r0.A0H()
            X.1A4 r5 = (X.AnonymousClass1A4) r5
            X.2Ou r1 = r14.A11()
            if (r1 == 0) goto L_0x028d
            X.6cX r0 = r6.A00
            X.1EM r0 = (X.AnonymousClass1EM) r0
            X.1ET r0 = r0.key_
            if (r0 != 0) goto L_0x0040
            X.1ET r0 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x0040:
            X.1A1 r4 = X.AnonymousClass0x9.A0X(r0)
            X.2z0 r0 = r1.A02
            X.AnonymousClass1A1.A00(r4, r0)
            java.lang.String r0 = r0.A01
            r4.A0A(r0)
            X.4He r12 = (X.C85674He) r12
            int r0 = r12.A01
            switch(r0) {
                case 0: goto L_0x0114;
                case 1: goto L_0x016c;
                case 2: goto L_0x01a8;
                case 3: goto L_0x0222;
                default: goto L_0x0055;
            }
        L_0x0055:
            java.lang.Object r3 = r12.A00
            X.3OJ r3 = (X.AnonymousClass3OJ) r3
            boolean r0 = r14 instanceof X.C30481mW
            if (r0 == 0) goto L_0x0286
            r2 = r14
            X.1mW r2 = (X.C30481mW) r2
            X.34w r0 = r2.A0P
            if (r0 != 0) goto L_0x027f
            boolean r0 = X.AnonymousClass353.A04(r2)
            if (r0 != 0) goto L_0x027f
            java.lang.String r0 = r2.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = r2.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00fa
            com.whatsapp.TextData r0 = r2.A02
            if (r0 != 0) goto L_0x00fa
            r1 = 1024(0x400, float:1.435E-42)
            int r0 = r2.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            if (r0 != 0) goto L_0x00fa
            X.3Z2 r1 = r13.A01
            byte[] r0 = r13.A09
            boolean r0 = X.C59542x5.A01(r1, r2, r0)
            if (r0 != 0) goto L_0x00fa
            java.lang.String r2 = r2.A13()
            X.1EU r1 = X.AnonymousClass0x2.A0L(r5, r2)
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.conversation_ = r2
        L_0x00a3:
            X.C58462vI.A00(r13, r5, r14)
            X.1EM r1 = X.C18310x6.A0W(r6)
            X.1EU r0 = X.AnonymousClass0x9.A0W(r5)
            r0.getClass()
            r1.editedMessage_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.bitField0_ = r0
            r6.A0A(r4)
            X.23O r0 = X.AnonymousClass23O.MESSAGE_EDIT
            r6.A09(r0)
            long r1 = r14.A0K
            X.1EM r3 = X.C18310x6.A0W(r6)
            int r0 = r3.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r3.bitField0_ = r0
            r3.timestampMs_ = r1
            r7.A0D(r6)
            X.6cX r1 = X.C18320x8.A0C(r8)
            X.1AL r1 = (X.AnonymousClass1AL) r1
            X.1EU r0 = X.AnonymousClass0x9.A0W(r7)
            r0.getClass()
            r1.message_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            X.6cX r0 = r8.A06()
            X.1AL r0 = (X.AnonymousClass1AL) r0
            X.1EU r1 = X.AnonymousClass0x2.A0L(r9, r0)
            r1.editedMessage_ = r0
            int r0 = r1.bitField1_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField1_ = r0
            return
        L_0x00fa:
            X.6cX r0 = r5.A00
            X.1EU r0 = (X.AnonymousClass1EU) r0
            X.1EC r0 = r0.extendedTextMessage_
            if (r0 != 0) goto L_0x0104
            X.1EC r0 = X.AnonymousClass1EC.DEFAULT_INSTANCE
        L_0x0104:
            X.6c9 r0 = r0.A0H()
            X.19a r0 = (X.C207119a) r0
            r3.A01(r0, r2)
            X.C55032pg.A01(r13, r3, r0, r2)
            r5.A0B(r0)
            goto L_0x00a3
        L_0x0114:
            java.lang.Object r12 = r12.A00
            X.3OD r12 = (X.AnonymousClass3OD) r12
            r11 = r14
            X.1nF r11 = (X.AnonymousClass1nF) r11
            X.6cX r0 = r5.A00
            X.1EU r0 = (X.AnonymousClass1EU) r0
            X.1EB r0 = r0.documentMessage_
            if (r0 != 0) goto L_0x0125
            X.1EB r0 = X.AnonymousClass1EB.DEFAULT_INSTANCE
        L_0x0125:
            X.6c9 r10 = r0.A0H()
            X.19Z r10 = (X.AnonymousClass19Z) r10
            boolean r0 = r13.A02()
            if (r0 == 0) goto L_0x015a
            X.19Z r10 = r12.A00(r13, r11)
        L_0x0135:
            X.3Z2 r2 = r13.A01
            byte[] r1 = r13.A09
            boolean r0 = X.C59542x5.A01(r2, r11, r1)
            if (r0 == 0) goto L_0x0155
            X.2x5 r0 = r12.A01
            X.1EF r0 = X.C55032pg.A00(r0, r13, r2, r11, r1)
            X.1EB r2 = X.C18280x3.A0M(r10)
            r0.getClass()
            r2.contextInfo_ = r0
            int r1 = r2.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r0
            r2.bitField0_ = r1
        L_0x0155:
            r5.A0A(r10)
            goto L_0x00a3
        L_0x015a:
            java.lang.String r3 = r11.A01
            if (r3 == 0) goto L_0x0135
            X.1EB r2 = X.C18280x3.A0M(r10)
            int r1 = r2.bitField0_
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.caption_ = r3
            goto L_0x0135
        L_0x016c:
            java.lang.Object r10 = r12.A00
            X.3OI r10 = (X.AnonymousClass3OI) r10
            r11 = r14
            X.1pA r11 = (X.C31961pA) r11
            X.1ED r0 = X.AnonymousClass0x7.A0X(r5)
            X.6c9 r3 = r0.A0H()
            X.19y r3 = (X.C209519y) r3
            boolean r0 = r13.A02()
            if (r0 == 0) goto L_0x0195
            X.19y r3 = r10.A00(r13, r11)
        L_0x0187:
            X.3Z2 r2 = r13.A01
            byte[] r1 = r13.A09
            boolean r0 = X.C59542x5.A01(r2, r11, r1)
            if (r0 == 0) goto L_0x0267
            X.2x5 r0 = r10.A01
            goto L_0x0254
        L_0x0195:
            java.lang.String r2 = r11.A1w()
            if (r2 == 0) goto L_0x0187
            X.1ED r1 = X.C18290x4.A0S(r3)
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.caption_ = r2
            goto L_0x0187
        L_0x01a8:
            java.lang.Object r10 = r12.A00
            X.3O8 r10 = (X.AnonymousClass3O8) r10
            r3 = r14
            X.1nA r3 = (X.AnonymousClass1nA) r3
            X.6cX r0 = r5.A00
            X.1EU r0 = (X.AnonymousClass1EU) r0
            X.1EE r0 = r0.imageMessage_
            if (r0 != 0) goto L_0x01b9
            X.1EE r0 = X.AnonymousClass1EE.DEFAULT_INSTANCE
        L_0x01b9:
            X.6c9 r11 = r0.A0H()
            boolean r0 = r13.A02()
            if (r0 == 0) goto L_0x020f
            X.2ki r1 = r10.A02
            X.6cX r0 = r9.A00
            X.1EU r0 = (X.AnonymousClass1EU) r0
            X.1EE r0 = r0.imageMessage_
            if (r0 != 0) goto L_0x01cf
            X.1EE r0 = X.AnonymousClass1EE.DEFAULT_INSTANCE
        L_0x01cf:
            X.6c9 r0 = r0.A0H()
            X.19b r0 = (X.C207219b) r0
            X.19b r11 = r1.A02(r13, r0, r3)
        L_0x01d9:
            X.3Z2 r2 = r13.A01
            byte[] r1 = r13.A09
            boolean r0 = X.C59542x5.A01(r2, r3, r1)
            if (r0 == 0) goto L_0x01f8
            X.2x5 r0 = r10.A01
            X.1EF r0 = X.C55032pg.A00(r0, r13, r2, r3, r1)
            X.1EE r1 = X.AnonymousClass0x7.A0V(r11)
            r0.getClass()
            r1.contextInfo_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.bitField0_ = r0
        L_0x01f8:
            X.1EU r1 = X.C18290x4.A0T(r5)
            X.6cX r0 = r11.A06()
            X.1EE r0 = (X.AnonymousClass1EE) r0
            r0.getClass()
            r1.imageMessage_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            goto L_0x00a3
        L_0x020f:
            java.lang.String r2 = r3.A1w()
            if (r2 == 0) goto L_0x01d9
            X.1EE r1 = X.AnonymousClass0x7.A0V(r11)
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.caption_ = r2
            goto L_0x01d9
        L_0x0222:
            java.lang.Object r10 = r12.A00
            X.3O9 r10 = (X.AnonymousClass3O9) r10
            r11 = r14
            X.1nB r11 = (X.AnonymousClass1nB) r11
            X.1ED r0 = X.AnonymousClass0x7.A0X(r5)
            X.6c9 r3 = r0.A0H()
            X.19y r3 = (X.C209519y) r3
            boolean r0 = r13.A02()
            if (r0 == 0) goto L_0x026c
            X.1ED r0 = X.AnonymousClass0x7.A0X(r9)
            X.6c9 r3 = r0.A0H()
            X.19y r3 = (X.C209519y) r3
            X.2om r0 = r10.A02
            r0.A02(r13, r3, r11)
        L_0x0248:
            X.3Z2 r2 = r13.A01
            byte[] r1 = r13.A09
            boolean r0 = X.C59542x5.A01(r2, r11, r1)
            if (r0 == 0) goto L_0x0267
            X.2x5 r0 = r10.A01
        L_0x0254:
            X.1EF r0 = X.C55032pg.A00(r0, r13, r2, r11, r1)
            X.1ED r1 = X.C18290x4.A0S(r3)
            r0.getClass()
            r1.contextInfo_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r1.bitField0_ = r0
        L_0x0267:
            r5.A0I(r3)
            goto L_0x00a3
        L_0x026c:
            java.lang.String r2 = r11.A1w()
            if (r2 == 0) goto L_0x0248
            X.1ED r1 = X.C18290x4.A0S(r3)
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.caption_ = r2
            goto L_0x0248
        L_0x027f:
            java.lang.String r0 = "FMessageTextSerializer/buildUpdatedMessage/Payment or Button text message are not editable"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0286:
            java.lang.String r0 = "FMessageTextSerializer/buildUpdatedMessage/updated message must be FMessageText"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x028d:
            r0 = 0
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3NX.A00(X.4A2, X.2pg, X.34x):void");
    }

    public C624134x BgW(C55962rC r11) {
        AnonymousClass1EU r3 = r11.A0B;
        if (C385428c.A00(r11) == AnonymousClass23O.MESSAGE_EDIT) {
            AnonymousClass1EM r4 = r3.protocolMessage_;
            if (r4 == null) {
                r4 = AnonymousClass1EM.DEFAULT_INSTANCE;
            }
            AnonymousClass1EU r0 = r4.editedMessage_;
            if (r0 == null) {
                r0 = AnonymousClass1EU.DEFAULT_INSTANCE;
            }
            C55962rC A02 = r11.A02(r0);
            A02.A01 = 1;
            C624134x A002 = ((C66383Le) this.A01.get()).A00(A02);
            if (!(A002 instanceof C30481mW) && !(A002 instanceof C30471mV)) {
                A002 = r11.A03(0);
            }
            A002.A1B(AnonymousClass35S.A0F);
            AnonymousClass2z0 r02 = A002.A1J;
            C95814uZ r2 = r02.A00;
            boolean z = r02.A02;
            AnonymousClass1ET r03 = r4.key_;
            if (r03 == null) {
                r03 = AnonymousClass1ET.DEFAULT_INSTANCE;
            }
            A002.A1V(new C42602Ou(AnonymousClass2z0.A05(r2, r03.id_, z), A002.A0K, r4.timestampMs_));
            return A002;
        } else if ((r3.bitField1_ & DefaultCrypto.BUFFER_SIZE) == 0 || !this.A00.A0Y(C58422vE.A02, 2189)) {
            return null;
        } else {
            AnonymousClass1AL r04 = r3.editedMessage_;
            if (r04 == null) {
                r04 = AnonymousClass1AL.DEFAULT_INSTANCE;
            }
            AnonymousClass1EU r05 = r04.message_;
            if (r05 == null) {
                r05 = AnonymousClass1EU.DEFAULT_INSTANCE;
            }
            return BgW(r11.A02(r05));
        }
    }

    public AnonymousClass3NX(AnonymousClass1VX r1, C183538qC r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
