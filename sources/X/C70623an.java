package X;

/* renamed from: X.3an  reason: invalid class name and case insensitive filesystem */
public class C70623an implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public C70623an(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.A05 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A00 = i;
        this.A04 = obj4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03fa, code lost:
        if (r12.A04.A0Y(X.C58422vE.A02, 4643) == false) goto L_0x03fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0418, code lost:
        if (r12.A04.A0Y(X.C58422vE.A02, 6222) == false) goto L_0x041a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0097, code lost:
        if (r0.A05 <= 0) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r25 = this;
            r0 = r25
            int r1 = r0.A05
            switch(r1) {
                case 0: goto L_0x0340;
                case 1: goto L_0x0390;
                case 2: goto L_0x0071;
                case 3: goto L_0x029d;
                case 4: goto L_0x03a6;
                case 5: goto L_0x0007;
                case 6: goto L_0x0007;
                case 7: goto L_0x02f1;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r6 = r0.A01
            X.1gL r6 = (X.AnonymousClass1gL) r6
            java.lang.Object r8 = r0.A02
            X.39T r8 = (X.AnonymousClass39T) r8
            java.lang.Object r5 = r0.A03
            X.2a1 r5 = (X.C45442a1) r5
            int r9 = r0.A00
            java.lang.Object r2 = r0.A04
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "axolotl received a location notification; jid="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "; retryCount="
            X.C18260x0.A0y(r0, r1, r9)
            X.2ov r3 = X.AnonymousClass36G.A02(r2)
            X.3G1 r1 = new X.3G1
            r1.<init>(r3, r6, r8)
            int r2 = r5.A00
            if (r2 != 0) goto L_0x0065
            X.33n r4 = r6.A03
            byte[] r0 = r5.A02
            X.2ex r3 = r4.A03(r1, r3, r0)
        L_0x003f:
            int r2 = r3.A00
            if (r2 == 0) goto L_0x004c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "axolotl error; status="
            X.C18260x0.A0z(r0, r1, r2)
        L_0x004c:
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x0064
            X.2qF r0 = r4.A07
            int r7 = r0.A01()
            X.3Wi r0 = r6.A00
            r10 = 9
            X.3cL r5 = new X.3cL
            r5.<init>((java.lang.Object) r6, (int) r7, (java.lang.Object) r8, (int) r9, (int) r10)
            r0.A0S(r5)
        L_0x0064:
            return
        L_0x0065:
            r0 = 1
            if (r2 != r0) goto L_0x032e
            X.33n r4 = r6.A03
            byte[] r0 = r5.A02
            X.2ex r3 = r4.A04(r1, r3, r0)
            goto L_0x003f
        L_0x0071:
            java.lang.Object r5 = r0.A01
            X.5mB r5 = (X.C113905mB) r5
            java.lang.Object r4 = r0.A02
            X.4uZ r4 = (X.C95814uZ) r4
            java.lang.Object r6 = r0.A03
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            java.lang.Object r3 = r0.A04
            X.2z0 r3 = (X.AnonymousClass2z0) r3
            int r0 = r0.A00
            r5.A02()
            boolean r2 = r3.A02
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            X.2qz r1 = r5.A0a
            X.34x r0 = r1.A05(r3)
            if (r0 == 0) goto L_0x0099
            int r0 = r0.A05
            r13 = 1
            if (r0 > 0) goto L_0x009a
        L_0x0099:
            r13 = 0
        L_0x009a:
            boolean r14 = r5.A09(r3)
            r7 = r5
            r8 = r4
            r9 = r6
            r10 = r3
            r12 = r2
            r7.A07(r8, r9, r10, r11, r12, r13, r14)
            X.34x r8 = r1.A05(r3)
            if (r8 == 0) goto L_0x0232
            X.7am r7 = r5.A06
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            X.3Ex r0 = r7.A03
            X.3ZH r3 = r0.A07(r4)
            if (r3 == 0) goto L_0x0232
            X.2z0 r0 = r8.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0232
            X.34q r2 = r7.A00
            boolean r0 = r2.A0B()
            if (r0 == 0) goto L_0x0232
            int r10 = X.C623434q.A00(r3)
            r0 = 1
            if (r10 == r0) goto L_0x0232
            java.lang.Integer r6 = r2.A05(r8)
            boolean r0 = r8 instanceof X.AnonymousClass4FG
            if (r0 == 0) goto L_0x029a
            r0 = r8
            X.4FG r0 = (X.AnonymousClass4FG) r0
            X.2cm r0 = r0.BDY()
            X.C162457s7.A0D(r0)
            java.lang.String r12 = r0.A01
        L_0x00e3:
            boolean r0 = X.C624134x.A0f(r8)
            if (r0 == 0) goto L_0x00eb
            java.lang.String r12 = "MARKETING_MESSAGE_SMB"
        L_0x00eb:
            java.lang.String r21 = X.C623434q.A02(r8)
            X.1R1 r0 = r7.A0D
            X.2sa r0 = X.AnonymousClass1R1.A00(r4, r0)
            long r15 = r0.A00()
            r13 = 0
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            boolean r20 = X.AnonymousClass000.A1S(r0)
            X.2ss r0 = r2.A03
            boolean r0 = r0.A0M(r4)
            int r14 = X.C18280x3.A00(r0)
            X.33p r0 = r7.A06
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "notify_new_message_for_archived_chats"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            r13 = r0 ^ 1
            X.33T r0 = r7.A05
            X.0Tx r0 = r0.A00
            boolean r18 = r0.A01()
            X.34x r1 = r2.A04(r4)
            X.2qS r0 = r3.A0E
            r17 = 0
            if (r0 == 0) goto L_0x0133
            int r9 = r0.A01
            r0 = 2
            if (r9 != r0) goto L_0x0133
            r17 = 1
        L_0x0133:
            X.2jD r0 = r8.A0u()
            if (r0 == 0) goto L_0x0297
            boolean r0 = r0.A00
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
        L_0x013f:
            X.2r4 r0 = r7.A0C
            boolean r16 = r0.A02(r4)
            X.2Em r0 = r7.A02
            r24 = r0
            java.lang.Integer r19 = java.lang.Integer.valueOf(r14)
            byte r0 = r8.A1I
            java.lang.String r9 = X.C623434q.A01(r0)
            java.lang.Long r15 = r2.A07(r1)
            X.318 r0 = r7.A09
            X.6aS r0 = r0.A04()
            int r0 = r0.size()
            long r0 = (long) r0
            r22 = r0
            java.lang.String r1 = r2.A08(r3)
            X.1bC r0 = new X.1bC
            r0.<init>()
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r20)
            r0.A03 = r14
            r0.A08 = r6
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r0.A07 = r10
            r0.A0C = r9
            r9 = r19
            r0.A06 = r9
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r0.A02 = r13
            r0.A0E = r1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r16)
            r0.A05 = r10
            java.lang.Long r1 = java.lang.Long.valueOf(r22)
            r0.A09 = r1
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r18)
            r0.A04 = r9
            r0.A0A = r15
            r0.A0D = r12
            r1 = r21
            r0.A0B = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r17)
            r0.A01 = r1
            r0.A00 = r11
            r15 = r24
            X.34q r15 = r15.A00
            X.4FV r15 = r15.A08
            r15.BhD(r0)
            X.2N9 r0 = r7.A01
            int r18 = X.C623434q.A00(r3)
            java.lang.String r17 = r2.A09(r8)
            java.lang.Long r16 = X.AnonymousClass31J.A02(r3)
            java.lang.Long r15 = r2.A06(r4)
            X.34q r3 = r0.A00
            boolean r0 = r3.A0D(r8)
            if (r0 == 0) goto L_0x0210
            X.1bE r2 = new X.1bE
            r2.<init>()
            r0 = r19
            r2.A06 = r0
            r2.A0B = r15
            r2.A02 = r13
            r2.A03 = r14
            r0 = r16
            r2.A0A = r0
            r0 = r17
            r2.A0F = r0
            r2.A04 = r9
            r2.A08 = r6
            r2.A05 = r10
            r2.A0E = r12
            r0 = r21
            r2.A0D = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r2.A07 = r0
            r2.A01 = r1
            r2.A00 = r11
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r8.A0K
            java.lang.Long r0 = X.C18320x8.A0Y(r9, r0)
            r2.A09 = r0
            long r0 = r8.A0I
            java.lang.Long r0 = X.C18320x8.A0Y(r9, r0)
            r2.A0C = r0
            r3.A0A(r2, r8)
        L_0x0210:
            r2 = 0
            if (r6 == 0) goto L_0x0225
            int r1 = r6.intValue()
            if (r1 == 0) goto L_0x0293
            r0 = 1
            if (r1 == r0) goto L_0x028f
            r0 = 2
            if (r1 == r0) goto L_0x028b
            r0 = 3
            if (r1 != r0) goto L_0x0225
            java.lang.String r2 = "otp_qbm"
        L_0x0225:
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A03(r4)
            if (r2 == 0) goto L_0x0232
            if (r1 == 0) goto L_0x0232
            X.2n3 r0 = r7.A07
            X.C53412n3.A00(r0, r1, r2)
        L_0x0232:
            X.2m2 r0 = r5.A07
            boolean r0 = r0.A02(r8)
            if (r0 == 0) goto L_0x0064
            X.2zY r2 = r5.A05
            if (r8 == 0) goto L_0x0289
            com.whatsapp.jid.UserJid r3 = r8.A0o()
        L_0x0242:
            boolean r0 = r8 instanceof X.AnonymousClass4FG
            if (r0 == 0) goto L_0x0064
            X.4FG r8 = (X.AnonymousClass4FG) r8
            X.2cm r0 = r8.BDY()
            java.lang.String r1 = r0.A04
            if (r1 == 0) goto L_0x0064
            java.lang.String r0 = "MARKETING"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0064
            if (r3 == 0) goto L_0x0064
            X.2Vc r2 = r2.A01
            X.2y5 r1 = r2.A00
            java.lang.String r0 = "marketing_opt_out"
            android.content.SharedPreferences r4 = X.C60152y5.A02(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "jids_receiving_marketing_message"
            java.lang.String r3 = X.C18260x0.A03(r3, r0, r1)
            X.C162457s7.A0D(r3)
            org.json.JSONObject r2 = r2.A00(r3)
            java.lang.String r1 = "marketing_msg_received"
            boolean r0 = r2.optBoolean(r1)
            if (r0 != 0) goto L_0x0064
            r0 = 1
            r2.put(r1, r0)
            android.content.SharedPreferences$Editor r0 = r4.edit()
            X.C18270x1.A0e(r0, r2, r3)
            return
        L_0x0289:
            r3 = 0
            goto L_0x0242
        L_0x028b:
            java.lang.String r2 = "promotional_qbm"
            goto L_0x0225
        L_0x028f:
            java.lang.String r2 = "transactional_qbm"
            goto L_0x0225
        L_0x0293:
            java.lang.String r2 = "other_qbm"
            goto L_0x0225
        L_0x0297:
            r11 = 0
            goto L_0x013f
        L_0x029a:
            r12 = 0
            goto L_0x00e3
        L_0x029d:
            java.lang.Object r5 = r0.A01
            X.21G r5 = (X.AnonymousClass21G) r5
            java.lang.Object r4 = r0.A02
            X.4ea r4 = (X.C89654ea) r4
            java.lang.Object r7 = r0.A03
            X.1Px r7 = (X.C22741Px) r7
            java.lang.Object r6 = r0.A04
            X.34x r6 = (X.C624134x) r6
            int r8 = r0.A00
            r3 = 0
            X.C162457s7.A0J(r5, r3)
            r9 = 1
            r2 = 3
            r1 = 2
            int r0 = r5.ordinal()
            r5 = 0
            if (r0 == r9) goto L_0x04de
            if (r0 == r2) goto L_0x04d1
            if (r0 == r1) goto L_0x0496
            if (r0 != r3) goto L_0x0064
            X.1VX r2 = r7.A05
            r1 = 6545(0x1991, float:9.171E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x02d6
            X.4FS r1 = r7.A08
            r0 = 39
            X.C71333bw.A00(r1, r7, r6, r0)
        L_0x02d6:
            java.lang.String r0 = "PinInChatSelectionAction/execute Can pin directly."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment r2 = new com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment
            r2.<init>()
            X.2NV r0 = new X.2NV
            r0.<init>(r7, r6, r8)
            r2.A00 = r0
            X.0df r1 = r4.getSupportFragmentManager()
            java.lang.String r0 = "PinInChatExpirationDialogFragment"
            r2.A1S(r1, r0)
            return
        L_0x02f1:
            java.lang.Object r4 = r0.A01
            X.2U7 r4 = (X.AnonymousClass2U7) r4
            java.lang.Object r6 = r0.A02
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            java.lang.Object r3 = r0.A03
            com.whatsapp.jid.PhoneUserJid r3 = (com.whatsapp.jid.PhoneUserJid) r3
            java.lang.Object r2 = r0.A04
            X.4uZ r2 = (X.C95814uZ) r2
            int r7 = r0.A00
            X.3dV r0 = r4.A07
            boolean r0 = X.C72303dV.A00(r0)
            if (r0 == 0) goto L_0x0064
            boolean r0 = X.C627336j.A0L(r6)
            if (r0 == 0) goto L_0x031b
            if (r3 == 0) goto L_0x031b
            X.2sM r1 = r4.A08
            r0 = r6
            X.1fH r0 = (X.C27981fH) r0
            r1.A09(r0, r3)
        L_0x031b:
            X.4BY r0 = r4.A0D
            X.4uZ r5 = r0.BLb(r2)
            X.3Wi r0 = r4.A01
            r8 = 30
            X.3c6 r3 = new X.3c6
            r3.<init>(r4, r5, r6, r7, r8)
            r0.A0S(r3)
            return
        L_0x032e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "axolotl unrecognized ciphertext type; stanzaKey="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "; type="
            X.C18260x0.A0z(r0, r1, r2)
            return
        L_0x0340:
            java.lang.Object r7 = r0.A01
            X.3FK r7 = (X.AnonymousClass3FK) r7
            java.lang.Object r6 = r0.A02
            X.1mV r6 = (X.C30471mV) r6
            int r5 = r0.A00
            java.lang.Object r4 = r0.A03
            X.34x r4 = (X.C624134x) r4
            java.lang.Object r3 = r0.A04
            X.33C r3 = (X.AnonymousClass33C) r3
            r2 = 0
            r1 = 1
            if (r5 == r1) goto L_0x0365
            r0 = 2
            if (r5 == r0) goto L_0x0365
            boolean r0 = r6 instanceof X.AnonymousClass1n2
            if (r0 != 0) goto L_0x0365
            boolean r0 = r6 instanceof X.C30721mu
            if (r0 == 0) goto L_0x0366
            int r0 = r6.A09
            if (r0 != r1) goto L_0x0366
        L_0x0365:
            r2 = 1
        L_0x0366:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "unsentMessages/sendUnsentMessages/send failed, will try to resend it from the beginning; key="
            java.lang.String r0 = X.AnonymousClass2z0.A07(r4, r0, r1)
            r1.append(r0)
            java.lang.String r0 = " canUpload="
            X.C18260x0.A1D(r0, r1, r2)
            r1 = 0
            if (r3 == 0) goto L_0x037e
            r3.A0R = r1
        L_0x037e:
            r6.A1A()
            if (r2 == 0) goto L_0x0389
            X.5Ul r0 = r7.A01
            r0.A08(r6, r1, r1)
            return
        L_0x0389:
            X.3Lv r1 = r7.A06
            r0 = -1
            r1.A0b(r4, r0)
            return
        L_0x0390:
            java.lang.Object r4 = r0.A01
            com.whatsapp.calling.service.VoiceServiceEventCallback r4 = (com.whatsapp.calling.service.VoiceServiceEventCallback) r4
            java.lang.Object r3 = r0.A02
            com.whatsapp.voipcalling.Voip$RecordingInfo[] r3 = (com.whatsapp.voipcalling.Voip.RecordingInfo[]) r3
            java.lang.Object r2 = r0.A03
            com.whatsapp.voipcalling.Voip$DebugTapType r2 = (com.whatsapp.voipcalling.Voip.DebugTapType) r2
            java.lang.Object r1 = r0.A04
            byte[] r1 = (byte[]) r1
            int r0 = r0.A00
            r4.lambda$callCaptureBufferFilled$2(r3, r2, r1, r0)
            return
        L_0x03a6:
            java.lang.Object r15 = r0.A01
            android.view.View r15 = (android.view.View) r15
            java.lang.Object r6 = r0.A02
            X.11h r6 = (X.C194711h) r6
            java.lang.Object r5 = r0.A03
            X.39D r5 = (X.AnonymousClass39D) r5
            int r4 = r0.A00
            java.lang.Object r7 = r0.A04
            X.39M r7 = (X.AnonymousClass39M) r7
            r8 = 0
            X.C162457s7.A0J(r15, r8)
            r1 = 1
            android.content.Context r14 = r15.getContext()
            r16 = 8388613(0x800005, float:1.175495E-38)
            X.1VX r9 = r6.A04
            int r18 = X.AnonymousClass29M.A00(r9)
            X.0Th r13 = new X.0Th
            r17 = r8
            r13.<init>(r14, r15, r16, r17, r18)
            android.content.Context r0 = r13.A02
            X.02O r2 = new X.02O
            r2.<init>(r0)
            r0 = 2131820558(0x7f11000e, float:1.9273834E38)
            X.0cz r3 = r13.A04
            r2.inflate(r0, r3)
            r0 = 2131430281(0x7f0b0b89, float:1.8482259E38)
            android.view.MenuItem r10 = r3.findItem(r0)
            X.2pQ r12 = r6.A05
            boolean r0 = r12.A00()
            if (r0 == 0) goto L_0x03fc
            X.1VX r11 = r12.A04
            r2 = 4643(0x1223, float:6.506E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r2 = r11.A0Y(r0, r2)
            r0 = 1
            if (r2 != 0) goto L_0x03fd
        L_0x03fc:
            r0 = 0
        L_0x03fd:
            r10.setVisible(r0)
            r10 = 2131430279(0x7f0b0b87, float:1.8482254E38)
            android.view.MenuItem r11 = r3.findItem(r10)
            boolean r0 = r12.A00()
            if (r0 == 0) goto L_0x041a
            X.1VX r12 = r12.A04
            r2 = 6222(0x184e, float:8.719E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r2 = r12.A0Y(r0, r2)
            r0 = 1
            if (r2 != 0) goto L_0x041b
        L_0x041a:
            r0 = 0
        L_0x041b:
            r11.setVisible(r0)
            android.view.MenuItem r11 = r3.findItem(r10)
            android.content.Context r2 = r15.getContext()
            r0 = 2131896376(0x7f122838, float:1.9427612E38)
            java.lang.String r0 = r2.getString(r0)
            r11.setTitle(r0)
            X.2sn r0 = r6.A00
            boolean r0 = r0.A0H(r7)
            if (r0 == 0) goto L_0x044a
            android.view.MenuItem r10 = r3.findItem(r10)
            android.content.Context r2 = r15.getContext()
            r0 = 2131894041(0x7f121f19, float:1.9422876E38)
            java.lang.String r0 = r2.getString(r0)
            r10.setTitle(r0)
        L_0x044a:
            X.AnonymousClass0I4.A00(r3)
            r2 = 0
            r0 = 4497(0x1191, float:6.302E-42)
            boolean r0 = X.C106545Zk.A04(r9, r2, r0)
            if (r0 == 0) goto L_0x0458
            r3.A0H = r1
        L_0x0458:
            X.38l r10 = r6.A06
            if (r10 == 0) goto L_0x0482
            r0 = 2131430283(0x7f0b0b8b, float:1.8482263E38)
            android.view.MenuItem r9 = r3.findItem(r0)
            if (r9 == 0) goto L_0x0482
            android.content.Context r3 = X.C18290x4.A0F(r15)
            java.lang.Boolean r0 = r10.A00
            boolean r0 = X.AnonymousClass0x9.A1Q(r0)
            r2 = 2131896298(0x7f1227ea, float:1.9427453E38)
            if (r0 == 0) goto L_0x0477
            r2 = 2131893555(0x7f121d33, float:1.942189E38)
        L_0x0477:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r10.A02
            java.lang.String r0 = X.C18300x5.A0e(r3, r0, r1, r8, r2)
            r9.setTitle(r0)
        L_0x0482:
            X.3AD r0 = new X.3AD
            r0.<init>(r6, r5, r7, r4)
            r13.A01 = r0
            X.3Wi r2 = r6.A03
            r1 = 17
            X.3Zl r0 = new X.3Zl
            r0.<init>(r13, r1)
            r2.A0S(r0)
            return
        L_0x0496:
            java.lang.String r0 = "PinInChatSelectionAction/execute Can pin after confirming to replace the pin."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0zH r3 = X.AnonymousClass5V0.A00(r4)
            X.2eV r2 = r7.A07
            int r1 = r2.A00()
            r0 = 2131892598(0x7f121976, float:1.9419949E38)
            if (r1 <= r9) goto L_0x04ad
            r0 = 2131892599(0x7f121977, float:1.941995E38)
        L_0x04ad:
            r3.A0U(r0)
            int r1 = r2.A00()
            r0 = 2131892596(0x7f121974, float:1.9419945E38)
            if (r1 <= r9) goto L_0x04bc
            r0 = 2131892597(0x7f121975, float:1.9419947E38)
        L_0x04bc:
            r3.A0T(r0)
            r0 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r3.A0c(r4, r5, r0)
            r1 = 2131887053(0x7f1203cd, float:1.9408702E38)
            X.3AX r0 = new X.3AX
            r0.<init>(r4, r7, r6, r8)
            r3.A0d(r4, r0, r1)
            goto L_0x04f3
        L_0x04d1:
            java.lang.String r0 = "PinInChatSelectionAction/execute Cannot pin message with other error."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0zH r3 = X.AnonymousClass5V0.A00(r4)
            r0 = 2131892594(0x7f121972, float:1.941994E38)
            goto L_0x04ea
        L_0x04de:
            java.lang.String r0 = "PinInChatSelectionAction/execute Cannot pin message with no connection."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0zH r3 = X.AnonymousClass5V0.A00(r4)
            r0 = 2131892595(0x7f121973, float:1.9419943E38)
        L_0x04ea:
            r3.A0T(r0)
            r0 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r3.A0d(r4, r5, r0)
        L_0x04f3:
            X.C18280x3.A0q(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70623an.run():void");
    }
}
