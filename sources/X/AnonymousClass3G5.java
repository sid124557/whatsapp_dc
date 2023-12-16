package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3G5  reason: invalid class name */
public class AnonymousClass3G5 implements C836749i {
    public final AnonymousClass36E A00;
    public final C836749i A01;
    public final C60532yi A02;
    public final C54762pF A03;
    public final C49822h9 A04;
    public final AnonymousClass1VX A05;
    public final C383727h A06;
    public final C47532dP A07;
    public final C54892pS A08;
    public final AnonymousClass33Y A09;
    public final AnonymousClass4FY A0A;
    public final C55832qz A0B;
    public final Integer A0C;

    public C30351mJ A00(AnonymousClass2z0 r13, AnonymousClass3ST r14, byte[] bArr) {
        C30351mJ r6 = new C30351mJ(r13, bArr, 2, r14.A16);
        r14.A02(r6);
        r6.A00 = 1000;
        C53432n5 r4 = r14.A0A;
        C130546c9 A0G = AnonymousClass1B1.DEFAULT_INSTANCE.A0G();
        C130546c9 A0G2 = AnonymousClass1D1.DEFAULT_INSTANCE.A0G();
        String str = r4.A05;
        if (!C107575bX.A0F(str)) {
            AnonymousClass1D1 r1 = (AnonymousClass1D1) C18320x8.A0C(A0G2);
            r1.bitField0_ |= 1;
            r1.targetId_ = str;
        }
        String str2 = r4.A04;
        if (!C107575bX.A0F(str2)) {
            AnonymousClass1D1 r12 = (AnonymousClass1D1) C18320x8.A0C(A0G2);
            str2.getClass();
            r12.bitField0_ |= 2;
            r12.editTargetId_ = str2;
        }
        C95814uZ r0 = r4.A01;
        if (r0 != null) {
            String A0g = C18300x5.A0g(A0G2, r0);
            AnonymousClass1D1 r15 = (AnonymousClass1D1) A0G2.A00;
            A0g.getClass();
            r15.bitField0_ |= 4;
            r15.targetChatJid_ = A0g;
        }
        UserJid userJid = r4.A02;
        if (userJid != null) {
            String A0g2 = C18300x5.A0g(A0G2, userJid);
            AnonymousClass1D1 r16 = (AnonymousClass1D1) A0G2.A00;
            A0g2.getClass();
            r16.bitField0_ |= 8;
            r16.targetSenderJid_ = A0g2;
        }
        AnonymousClass1D1 r02 = (AnonymousClass1D1) A0G2.A06();
        AnonymousClass1B1 r17 = (AnonymousClass1B1) C18320x8.A0C(A0G);
        r02.getClass();
        r17.botInfo_ = r02;
        r17.bitField0_ |= 1;
        r6.A02 = C18290x4.A1Z(A0G);
        if (r14.A0A.A01 != null) {
            C95814uZ r18 = AnonymousClass3ST.A00(r14).A00;
            if (r18 instanceof UserJid) {
                r6.A1J(r18);
            }
        }
        return r6;
    }

    public final void A01(int i) {
        AnonymousClass4FY r3 = this.A0A;
        r3.Bjw();
        this.A09.A09(r3, "invalid-message-secret-message", (String) null);
        this.A00.A0R(r3, this.A0C, i);
    }

    public AnonymousClass3G5(AnonymousClass36E r1, C836749i r2, C60532yi r3, C54762pF r4, C49822h9 r5, AnonymousClass1VX r6, C383727h r7, C47532dP r8, C54892pS r9, AnonymousClass33Y r10, AnonymousClass4FY r11, C55832qz r12, Integer num) {
        this.A05 = r6;
        this.A09 = r10;
        this.A06 = r7;
        this.A00 = r1;
        this.A0B = r12;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
        this.A07 = r8;
        this.A08 = r9;
        this.A0C = num;
        this.A0A = r11;
        this.A01 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ae A[Catch:{ Exception -> 0x02e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c8 A[Catch:{ Exception -> 0x02e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cb A[Catch:{ Exception -> 0x02e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0126 A[Catch:{ Exception -> 0x02e5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BF5(byte[] r31) {
        /*
            r30 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DecryptionCallbackMessageSecret/handlePlaintext message="
            r1.append(r0)
            r6 = r30
            X.4FY r5 = r6.A0A
            X.C18260x0.A0o(r5, r1)
            r11 = 0
            r7 = r31
            if (r31 != 0) goto L_0x0029
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DecryptionCallbackMessageSecret/invalid plaintext; message.key="
            r1.append(r0)
            X.2z0 r0 = r5.B9a()
            X.C18270x1.A17(r0, r1)
            r6.A01(r11)
        L_0x0028:
            return
        L_0x0029:
            boolean r0 = r5 instanceof X.AnonymousClass3ST
            if (r0 == 0) goto L_0x0028
            r4 = 34
            r3 = r5
            X.3ST r3 = (X.AnonymousClass3ST) r3     // Catch:{ Exception -> 0x02e5 }
            java.lang.String r1 = "text"
            java.lang.String r0 = r3.A0v     // Catch:{ Exception -> 0x02e5 }
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x02e5 }
            if (r0 != 0) goto L_0x0051
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x02e5 }
            java.lang.String r0 = "DecryptionCallbackMessageSecret/Invalid Message Type; message.key="
            r1.append(r0)     // Catch:{ Exception -> 0x02e5 }
            X.2z0 r0 = r5.B9a()     // Catch:{ Exception -> 0x02e5 }
            X.C18260x0.A0n(r0, r1)     // Catch:{ Exception -> 0x02e5 }
        L_0x004d:
            r6.A01(r11)     // Catch:{ Exception -> 0x02e5 }
            goto L_0x0066
        L_0x0051:
            X.2n5 r2 = r3.A0A     // Catch:{ Exception -> 0x02e5 }
            if (r2 != 0) goto L_0x0067
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x02e5 }
            java.lang.String r0 = "DecryptionCallbackMessageSecret/Missing Bot Metadata; message.key="
            r1.append(r0)     // Catch:{ Exception -> 0x02e5 }
            X.2z0 r0 = r5.B9a()     // Catch:{ Exception -> 0x02e5 }
            X.C18260x0.A0n(r0, r1)     // Catch:{ Exception -> 0x02e5 }
            goto L_0x004d
        L_0x0066:
            return
        L_0x0067:
            X.2pS r1 = r6.A08     // Catch:{ Exception -> 0x02e5 }
            com.whatsapp.jid.Jid r0 = r3.A18     // Catch:{ Exception -> 0x02e5 }
            X.4uZ r8 = X.C627336j.A02(r0)     // Catch:{ Exception -> 0x02e5 }
            X.34x r26 = r1.A00(r2, r8)     // Catch:{ Exception -> 0x02e5 }
            if (r26 != 0) goto L_0x012b
            X.2n5 r12 = r3.A0A     // Catch:{ Exception -> 0x02e5 }
            X.4uZ r13 = r12.A01     // Catch:{ Exception -> 0x02e5 }
            if (r13 == 0) goto L_0x0097
            X.2z0 r10 = X.AnonymousClass3ST.A00(r3)     // Catch:{ Exception -> 0x02e5 }
            X.4uZ r8 = r10.A00     // Catch:{ Exception -> 0x02e5 }
            boolean r8 = r8 instanceof com.whatsapp.jid.UserJid     // Catch:{ Exception -> 0x02e5 }
            if (r8 == 0) goto L_0x0097
            X.4uZ r9 = X.C627336j.A02(r0)     // Catch:{ Exception -> 0x02e5 }
            X.4uZ r8 = X.C627336j.A02(r13)     // Catch:{ Exception -> 0x02e5 }
            if (r8 == 0) goto L_0x0090
            r9 = r8
        L_0x0090:
            java.lang.String r8 = r10.A01     // Catch:{ Exception -> 0x02e5 }
            X.2z0 r9 = X.AnonymousClass2z0.A05(r9, r8, r11)     // Catch:{ Exception -> 0x02e5 }
            goto L_0x009b
        L_0x0097:
            X.2z0 r9 = X.AnonymousClass3ST.A00(r3)     // Catch:{ Exception -> 0x02e5 }
        L_0x009b:
            com.whatsapp.jid.UserJid r16 = r3.BCo()     // Catch:{ Exception -> 0x02e5 }
            X.C626936e.A06(r12)     // Catch:{ Exception -> 0x02e5 }
            X.4uZ r10 = X.C627336j.A02(r0)     // Catch:{ Exception -> 0x02e5 }
            X.4uZ r8 = r12.A01     // Catch:{ Exception -> 0x02e5 }
            X.4uZ r8 = X.C627336j.A02(r8)     // Catch:{ Exception -> 0x02e5 }
            if (r8 == 0) goto L_0x00af
            r10 = r8
        L_0x00af:
            java.lang.String r8 = r12.A05     // Catch:{ Exception -> 0x02e5 }
            X.2z0 r19 = X.AnonymousClass2z0.A05(r10, r8, r11)     // Catch:{ Exception -> 0x02e5 }
            X.2n5 r8 = r3.A0A     // Catch:{ Exception -> 0x02e5 }
            X.C626936e.A06(r8)     // Catch:{ Exception -> 0x02e5 }
            com.whatsapp.jid.UserJid r15 = r8.A02     // Catch:{ Exception -> 0x02e5 }
            long r13 = r3.A16     // Catch:{ Exception -> 0x02e5 }
            X.2n5 r8 = r3.A0A     // Catch:{ Exception -> 0x02e5 }
            java.lang.String r11 = r8.A04     // Catch:{ Exception -> 0x02e5 }
            boolean r8 = X.C107575bX.A0F(r11)     // Catch:{ Exception -> 0x02e5 }
            if (r8 == 0) goto L_0x00cb
            r22 = 0
            goto L_0x0107
        L_0x00cb:
            X.1AW r8 = X.AnonymousClass1AW.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x02e5 }
            X.6c9 r12 = r8.A0G()     // Catch:{ Exception -> 0x02e5 }
            X.17r r12 = (X.C203617r) r12     // Catch:{ Exception -> 0x02e5 }
            X.6cX r10 = X.C18320x8.A0C(r12)     // Catch:{ Exception -> 0x02e5 }
            X.1AW r10 = (X.AnonymousClass1AW) r10     // Catch:{ Exception -> 0x02e5 }
            r11.getClass()     // Catch:{ Exception -> 0x02e5 }
            int r8 = r10.bitField0_     // Catch:{ Exception -> 0x02e5 }
            r8 = r8 | 1
            r10.bitField0_ = r8     // Catch:{ Exception -> 0x02e5 }
            r10.editTargetId_ = r11     // Catch:{ Exception -> 0x02e5 }
            X.1BY r8 = X.AnonymousClass1BY.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x02e5 }
            X.6c9 r11 = r8.A0G()     // Catch:{ Exception -> 0x02e5 }
            X.17s r11 = (X.C203717s) r11     // Catch:{ Exception -> 0x02e5 }
            X.6cX r8 = r12.A06()     // Catch:{ Exception -> 0x02e5 }
            X.1AW r8 = (X.AnonymousClass1AW) r8     // Catch:{ Exception -> 0x02e5 }
            X.6cX r10 = X.C18320x8.A0C(r11)     // Catch:{ Exception -> 0x02e5 }
            X.1BY r10 = (X.AnonymousClass1BY) r10     // Catch:{ Exception -> 0x02e5 }
            r8.getClass()     // Catch:{ Exception -> 0x02e5 }
            r10.botMessageInfo_ = r8     // Catch:{ Exception -> 0x02e5 }
            int r8 = r10.bitField0_     // Catch:{ Exception -> 0x02e5 }
            r8 = r8 | 1
            r10.bitField0_ = r8     // Catch:{ Exception -> 0x02e5 }
            byte[] r22 = X.C18290x4.A1Z(r11)     // Catch:{ Exception -> 0x02e5 }
        L_0x0107:
            r23 = 2
            r8 = 1
            X.C162457s7.A0J(r9, r8)     // Catch:{ Exception -> 0x02e5 }
            r20 = 0
            X.2ns r8 = new X.2ns     // Catch:{ Exception -> 0x02e5 }
            r24 = r13
            r18 = r9
            r21 = r7
            r17 = r15
            r15 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x02e5 }
            X.2h9 r9 = r6.A04     // Catch:{ Exception -> 0x02e5 }
            int r9 = r9.A00(r8)     // Catch:{ Exception -> 0x02e5 }
            r8 = 4
            if (r9 == r8) goto L_0x012b
            java.lang.String r8 = "DecryptionCallbackMessageSecret//handlePlaintext/storeOrphanMessage/Failed to store orphan message"
            com.whatsapp.util.Log.e((java.lang.String) r8)     // Catch:{ Exception -> 0x02e5 }
        L_0x012b:
            java.lang.String r9 = r3.A1B     // Catch:{ Exception -> 0x02e5 }
            com.whatsapp.jid.UserJid r25 = r3.BCo()     // Catch:{ Exception -> 0x02e5 }
            X.2n5 r8 = r3.A0A     // Catch:{ Exception -> 0x02e5 }
            java.lang.String r8 = r8.A04     // Catch:{ Exception -> 0x02e5 }
            X.4uZ r24 = X.C627336j.A02(r0)     // Catch:{ Exception -> 0x02e5 }
            r22 = r1
            r23 = r2
            r27 = r9
            r28 = r8
            r29 = r7
            byte[] r10 = r22.A02(r23, r24, r25, r26, r27, r28, r29)     // Catch:{ Exception -> 0x02e5 }
            r8 = 0
            java.lang.String r9 = "first"
            if (r10 == 0) goto L_0x01a4
            X.33Y r2 = r6.A09     // Catch:{ Exception -> 0x02e5 }
            java.lang.String r1 = r3.A0v     // Catch:{ Exception -> 0x02e5 }
            r2.A09(r5, r1, r8)     // Catch:{ Exception -> 0x02e5 }
            X.2n5 r2 = r3.A0A     // Catch:{ Exception -> 0x02e5 }
            X.4uZ r1 = r2.A01     // Catch:{ Exception -> 0x02e5 }
            if (r1 == 0) goto L_0x017d
            X.2z0 r8 = X.AnonymousClass3ST.A00(r3)     // Catch:{ Exception -> 0x02e5 }
            X.4uZ r1 = r8.A00     // Catch:{ Exception -> 0x02e5 }
            boolean r1 = r1 instanceof com.whatsapp.jid.UserJid     // Catch:{ Exception -> 0x02e5 }
            if (r1 == 0) goto L_0x017d
            X.4uZ r7 = X.C627336j.A02(r0)     // Catch:{ Exception -> 0x02e5 }
            X.4uZ r1 = r2.A01     // Catch:{ Exception -> 0x02e5 }
            X.4uZ r1 = X.C627336j.A02(r1)     // Catch:{ Exception -> 0x02e5 }
            if (r1 == 0) goto L_0x0170
            r7 = r1
        L_0x0170:
            r2 = 0
            java.lang.String r1 = r8.A01     // Catch:{ Exception -> 0x02e5 }
            X.2z0 r1 = X.AnonymousClass2z0.A05(r7, r1, r2)     // Catch:{ Exception -> 0x02e5 }
            r3.A0Q = r1     // Catch:{ Exception -> 0x02e5 }
            r3.A0R = r1     // Catch:{ Exception -> 0x02e5 }
            r3.A0E = r0     // Catch:{ Exception -> 0x02e5 }
        L_0x017d:
            X.2n5 r0 = r3.A0A     // Catch:{ Exception -> 0x02e5 }
            java.lang.String r0 = r0.A03     // Catch:{ Exception -> 0x02e5 }
            boolean r0 = r9.equals(r0)     // Catch:{ Exception -> 0x02e5 }
            if (r0 == 0) goto L_0x019e
            X.2pF r1 = r6.A03     // Catch:{ Exception -> 0x02e5 }
            X.2z0 r0 = X.AnonymousClass3ST.A00(r3)     // Catch:{ Exception -> 0x02e5 }
            java.util.concurrent.ConcurrentHashMap r2 = r1.A03     // Catch:{ Exception -> 0x02e5 }
            boolean r0 = r2.contains(r0)     // Catch:{ Exception -> 0x02e5 }
            if (r0 != 0) goto L_0x019e
            X.2z0 r1 = X.AnonymousClass3ST.A00(r3)     // Catch:{ Exception -> 0x02e5 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x02e5 }
            r2.put(r1, r0)     // Catch:{ Exception -> 0x02e5 }
        L_0x019e:
            X.49i r0 = r6.A01     // Catch:{ Exception -> 0x02e5 }
            r0.BF5(r10)     // Catch:{ Exception -> 0x02e5 }
            return
        L_0x01a4:
            X.1VX r12 = r6.A05     // Catch:{ Exception -> 0x02e5 }
            r1 = 4165(0x1045, float:5.836E-42)
            X.2vE r10 = X.C58422vE.A02     // Catch:{ Exception -> 0x02e5 }
            boolean r1 = r12.A0Y(r10, r1)     // Catch:{ Exception -> 0x02e5 }
            java.lang.String r11 = "full"
            if (r1 == 0) goto L_0x01e3
            X.2n5 r2 = r3.A0A     // Catch:{ Exception -> 0x02e5 }
            java.lang.String r13 = r2.A03     // Catch:{ Exception -> 0x02e5 }
            boolean r1 = r9.equals(r13)     // Catch:{ Exception -> 0x02e5 }
            if (r1 != 0) goto L_0x01c2
            boolean r1 = r11.equals(r13)     // Catch:{ Exception -> 0x02e5 }
            if (r1 == 0) goto L_0x01e3
        L_0x01c2:
            X.2z0 r14 = X.AnonymousClass3ST.A00(r3)     // Catch:{ Exception -> 0x02e5 }
            X.4uZ r13 = X.C627336j.A02(r0)     // Catch:{ Exception -> 0x02e5 }
            X.4uZ r1 = r2.A01     // Catch:{ Exception -> 0x02e5 }
            X.4uZ r1 = X.C627336j.A02(r1)     // Catch:{ Exception -> 0x02e5 }
            if (r1 == 0) goto L_0x01d3
            r13 = r1
        L_0x01d3:
            r2 = 0
            java.lang.String r1 = r14.A01     // Catch:{ Exception -> 0x02e5 }
            X.2z0 r1 = X.AnonymousClass2z0.A05(r13, r1, r2)     // Catch:{ Exception -> 0x02e5 }
            X.1mJ r2 = r6.A00(r1, r3, r8)     // Catch:{ Exception -> 0x02e5 }
            X.2dP r1 = r6.A07     // Catch:{ Exception -> 0x02e5 }
            r1.A00(r2, r3)     // Catch:{ Exception -> 0x02e5 }
        L_0x01e3:
            r1 = 4165(0x1045, float:5.836E-42)
            boolean r1 = r12.A0Y(r10, r1)     // Catch:{ Exception -> 0x02e5 }
            if (r1 == 0) goto L_0x0201
            r0 = 51
            r6.A01(r0)     // Catch:{ Exception -> 0x02e5 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x02e5 }
            java.lang.String r0 = "DecryptionCallbackMessageSecret/Decryption failed; message.key="
            r1.append(r0)     // Catch:{ Exception -> 0x02e5 }
            X.2z0 r0 = r5.B9a()     // Catch:{ Exception -> 0x02e5 }
            X.C18260x0.A0n(r0, r1)     // Catch:{ Exception -> 0x02e5 }
            return
        L_0x0201:
            java.lang.String r1 = "inner"
            X.2n5 r10 = r3.A0A     // Catch:{ Exception -> 0x02e5 }
            java.lang.String r2 = r10.A03     // Catch:{ Exception -> 0x02e5 }
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x02e5 }
            if (r1 != 0) goto L_0x02b0
            if (r2 == 0) goto L_0x028e
            boolean r1 = r11.equals(r2)     // Catch:{ Exception -> 0x02e5 }
            if (r1 != 0) goto L_0x028e
            boolean r1 = r9.equals(r2)     // Catch:{ Exception -> 0x02e5 }
            if (r1 == 0) goto L_0x022e
            X.2z0 r9 = X.AnonymousClass3ST.A00(r3)     // Catch:{ Exception -> 0x02e5 }
            X.4uZ r2 = X.C627336j.A02(r0)     // Catch:{ Exception -> 0x02e5 }
            X.4uZ r0 = r10.A01     // Catch:{ Exception -> 0x02e5 }
            X.4uZ r0 = X.C627336j.A02(r0)     // Catch:{ Exception -> 0x02e5 }
            if (r0 == 0) goto L_0x02b6
            r2 = r0
            goto L_0x02b6
        L_0x022e:
            java.lang.String r1 = "last"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x02e5 }
            if (r1 == 0) goto L_0x0281
            X.C626936e.A06(r10)     // Catch:{ Exception -> 0x02e5 }
            X.4uZ r1 = X.C627336j.A02(r0)     // Catch:{ Exception -> 0x02e5 }
            X.4uZ r0 = r10.A01     // Catch:{ Exception -> 0x02e5 }
            X.4uZ r0 = X.C627336j.A02(r0)     // Catch:{ Exception -> 0x02e5 }
            if (r0 == 0) goto L_0x0246
            r1 = r0
        L_0x0246:
            java.lang.String r0 = r10.A04     // Catch:{ Exception -> 0x02e5 }
            X.C626936e.A06(r0)     // Catch:{ Exception -> 0x02e5 }
            X.2z0 r1 = X.AnonymousClass2z0.A03(r1, r0)     // Catch:{ Exception -> 0x02e5 }
            X.2qz r0 = r6.A0B     // Catch:{ Exception -> 0x02e5 }
            X.34x r9 = r0.A05(r1)     // Catch:{ Exception -> 0x02e5 }
            boolean r0 = r9 instanceof X.C30441mS     // Catch:{ Exception -> 0x02e5 }
            if (r0 == 0) goto L_0x0267
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x02e5 }
            java.lang.String r0 = "DecryptionCallbackMessageSecret/handlePlaintext/dropping last message as first message was revoked: "
            X.2z0 r0 = X.C624134x.A08(r9, r0, r1)     // Catch:{ Exception -> 0x02e5 }
            X.C18260x0.A0o(r0, r1)     // Catch:{ Exception -> 0x02e5 }
            goto L_0x02ce
        L_0x0267:
            X.1mJ r2 = r6.A00(r1, r3, r7)     // Catch:{ Exception -> 0x02e5 }
            if (r9 == 0) goto L_0x027b
            long r0 = r9.A1L     // Catch:{ Exception -> 0x02e5 }
            r2.A1L = r0     // Catch:{ Exception -> 0x02e5 }
            r0 = 1
            r2.A1H(r0)     // Catch:{ Exception -> 0x02e5 }
            X.2yi r0 = r6.A02     // Catch:{ Exception -> 0x02e5 }
            r0.A03(r2)     // Catch:{ Exception -> 0x02e5 }
            goto L_0x02ce
        L_0x027b:
            X.2dP r0 = r6.A07     // Catch:{ Exception -> 0x02e5 }
            r0.A00(r2, r3)     // Catch:{ Exception -> 0x02e5 }
            goto L_0x02ce
        L_0x0281:
            java.lang.String r0 = "DecryptionCallbackMessageSecret/handlePlaintext/Invalid message"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x02e5 }
            X.36E r1 = r6.A00     // Catch:{ Exception -> 0x02e5 }
            java.lang.Integer r0 = r6.A0C     // Catch:{ Exception -> 0x02e5 }
            r1.A0R(r5, r0, r4)     // Catch:{ Exception -> 0x02e5 }
            goto L_0x02ce
        L_0x028e:
            X.2z0 r9 = X.AnonymousClass3ST.A00(r3)     // Catch:{ Exception -> 0x02e5 }
            X.4uZ r2 = X.C627336j.A02(r0)     // Catch:{ Exception -> 0x02e5 }
            X.4uZ r0 = r10.A01     // Catch:{ Exception -> 0x02e5 }
            X.4uZ r0 = X.C627336j.A02(r0)     // Catch:{ Exception -> 0x02e5 }
            if (r0 == 0) goto L_0x029f
            r2 = r0
        L_0x029f:
            r1 = 0
            java.lang.String r0 = r9.A01     // Catch:{ Exception -> 0x02e5 }
            X.2z0 r0 = X.AnonymousClass2z0.A05(r2, r0, r1)     // Catch:{ Exception -> 0x02e5 }
            X.1mJ r1 = r6.A00(r0, r3, r7)     // Catch:{ Exception -> 0x02e5 }
            X.2dP r0 = r6.A07     // Catch:{ Exception -> 0x02e5 }
            r0.A00(r1, r3)     // Catch:{ Exception -> 0x02e5 }
            goto L_0x02ce
        L_0x02b0:
            java.lang.String r0 = "DecryptionCallbackMessageSecret/handlePlaintext/dropping inner message"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x02e5 }
            goto L_0x02ce
        L_0x02b6:
            r1 = 0
            java.lang.String r0 = r9.A01     // Catch:{ Exception -> 0x02e5 }
            X.2z0 r1 = X.AnonymousClass2z0.A05(r2, r0, r1)     // Catch:{ Exception -> 0x02e5 }
            X.2qz r0 = r6.A0B     // Catch:{ Exception -> 0x02e5 }
            X.34x r2 = r0.A05(r1)     // Catch:{ Exception -> 0x02e5 }
            if (r2 != 0) goto L_0x02d6
            X.1mJ r1 = r6.A00(r1, r3, r7)     // Catch:{ Exception -> 0x02e5 }
            X.2dP r0 = r6.A07     // Catch:{ Exception -> 0x02e5 }
            r0.A00(r1, r3)     // Catch:{ Exception -> 0x02e5 }
        L_0x02ce:
            X.33Y r1 = r6.A09     // Catch:{ Exception -> 0x02e5 }
            java.lang.String r0 = r3.A0v     // Catch:{ Exception -> 0x02e5 }
            r1.A09(r5, r0, r8)     // Catch:{ Exception -> 0x02e5 }
            goto L_0x02e4
        L_0x02d6:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x02e5 }
            java.lang.String r0 = "DecryptionCallbackMessageSecret/handlePlaintext/dropping first message as last message already stored: "
            X.2z0 r0 = X.C624134x.A08(r2, r0, r1)     // Catch:{ Exception -> 0x02e5 }
            X.C18260x0.A0o(r0, r1)     // Catch:{ Exception -> 0x02e5 }
            goto L_0x02ce
        L_0x02e4:
            return
        L_0x02e5:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DecryptionCallbackMessageSecret/Error processing e2e message secret; message.key="
            X.AnonymousClass0x2.A17(r5, r0, r1)
            X.C18280x3.A1C(r1, r2)
            r6.A01(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3G5.BF5(byte[]):void");
    }
}
