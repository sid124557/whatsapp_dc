package X;

import java.util.Map;

/* renamed from: X.1pe  reason: invalid class name and case insensitive filesystem */
public abstract class C32151pe extends C53272mp {
    public final C67813Qt A00;
    public final AnonymousClass31C A01;

    public C32151pe(C55682qk r7, AnonymousClass1VX r8, AnonymousClass4FV r9, C60592yo r10, C67813Qt r11, AnonymousClass31C r12, Map map) {
        super(r7, r8, r9, r10, map);
        this.A01 = r12;
        this.A00 = r11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0304  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.AnonymousClass36K r41, java.lang.Integer r42, java.util.Map r43) {
        /*
            r40 = this;
            r1 = r40
            boolean r2 = r1 instanceof X.C32061pV
            r0 = r41
            r18 = r42
            if (r2 == 0) goto L_0x003f
            X.1pV r1 = (X.C32061pV) r1
            long r23 = android.os.SystemClock.uptimeMillis()
            X.C626936e.A06(r0)
            java.lang.Class<com.whatsapp.jid.Jid> r3 = com.whatsapp.jid.Jid.class
            java.lang.String r2 = "from"
            com.whatsapp.jid.Jid r10 = r0.A0g(r3, r2)
            java.lang.String r2 = "id"
            java.lang.String r7 = r0.A0q(r2)
            java.lang.String r2 = "participant"
            com.whatsapp.jid.Jid r6 = r0.A0g(r3, r2)
            java.lang.String r2 = "type"
            r5 = 0
            java.lang.String r4 = r0.A0r(r2, r5)
            java.lang.String r2 = "offline"
            java.lang.String r9 = r0.A0r(r2, r5)
            if (r9 == 0) goto L_0x01d9
            java.lang.Integer r17 = java.lang.Integer.valueOf(r9)     // Catch:{ NumberFormatException -> 0x01cf }
            goto L_0x01db
        L_0x003f:
            X.1pU r1 = (X.C32051pU) r1
            long r38 = android.os.SystemClock.uptimeMillis()
            java.lang.String r2 = "offline"
            r6 = 0
            java.lang.String r2 = r0.A0r(r2, r6)
            r4 = 0
            r10 = 0
            if (r2 == 0) goto L_0x0065
            r10 = 1
            java.lang.Integer r32 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x0057 }
            goto L_0x0067
        L_0x0057:
            r5 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "connection/handleNotification: got bad offline="
            java.lang.String r2 = X.AnonymousClass000.A0b(r2, r3, r10)
            com.whatsapp.util.Log.e(r2, r5)
        L_0x0065:
            r32 = 0
        L_0x0067:
            java.lang.String r2 = "e"
            java.lang.String r2 = r0.A0r(r2, r6)
            if (r2 == 0) goto L_0x00dc
            int r5 = java.lang.Integer.parseInt(r2)
        L_0x0073:
            java.lang.String r2 = "t"
            java.lang.String r2 = r0.A0r(r2, r6)
            r16 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x00d9
            long r25 = java.lang.Long.parseLong(r2)
            long r25 = r25 * r16
        L_0x0084:
            java.lang.Class<com.whatsapp.jid.Jid> r3 = com.whatsapp.jid.Jid.class
            java.lang.String r2 = "from"
            com.whatsapp.jid.Jid r3 = r0.A0h(r3, r2)
            boolean r2 = X.C627336j.A0J(r3)
            if (r2 == 0) goto L_0x0304
            boolean r2 = r3 instanceof com.whatsapp.jid.UserJid
            if (r2 == 0) goto L_0x009c
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            com.whatsapp.jid.DeviceJid r3 = r3.getPrimaryDevice()
        L_0x009c:
            java.lang.String r2 = "id"
            java.lang.String r15 = r0.A0q(r2)
            java.lang.String r2 = "platform"
            java.lang.String r22 = r0.A0r(r2, r6)
            java.lang.String r2 = "version"
            java.lang.String r23 = r0.A0r(r2, r6)
            X.36K r4 = r0.A0k(r4)
            if (r4 == 0) goto L_0x02fc
            java.lang.String r2 = r4.A00
            java.lang.String r6 = "reminder"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L_0x00de
            java.lang.String r6 = "bcall_"
            boolean r6 = r2.startsWith(r6)
            if (r6 != 0) goto L_0x00de
            java.lang.String r6 = "call-id"
            java.lang.String r21 = X.AnonymousClass36K.A0L(r4, r6)
            if (r21 != 0) goto L_0x00e0
            java.lang.String r0 = "no call-id in the payload of incoming <call> node"
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            throw r0
        L_0x00d9:
            r25 = 0
            goto L_0x0084
        L_0x00dc:
            r5 = 0
            goto L_0x0073
        L_0x00de:
            java.lang.String r21 = ""
        L_0x00e0:
            java.lang.String r6 = "notify"
            java.lang.String r24 = X.AnonymousClass36K.A0L(r0, r6)
            X.2RV r0 = r1.A01
            java.util.concurrent.atomic.AtomicLong r6 = r0.A04
            long r36 = r6.getAndIncrement()
            X.2sH r9 = r0.A01
            X.2qk r8 = r0.A00
            X.4FV r7 = r0.A02
            X.2r5 r6 = r0.A03
            X.1gU r0 = new X.1gU
            r27 = r0
            r28 = r8
            r29 = r9
            r30 = r7
            r31 = r6
            r33 = r18
            r34 = r15
            r35 = r2
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r38)
            r6.A06(r0)
            long r11 = r0.A03
            X.2i8 r7 = X.C50412i8.A00(r3)
            java.lang.String r6 = "call"
            r7.A05 = r6
            r7.A07 = r15
            r7.A08 = r2
            r7.A00 = r11
            X.39T r14 = r7.A01()
            com.whatsapp.protocol.VoipStanzaChildNode r13 = com.whatsapp.protocol.VoipStanzaChildNode.fromProtocolTreeNode(r4)
            java.lang.Class<com.whatsapp.jid.DeviceJid> r8 = com.whatsapp.jid.DeviceJid.class
            java.lang.String r6 = "call-creator"
            com.whatsapp.jid.Jid r6 = r4.A0g(r8, r6)
            com.whatsapp.jid.DeviceJid r6 = (com.whatsapp.jid.DeviceJid) r6
            java.lang.String r9 = r13.tag
            java.lang.String r7 = "offer"
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x01cc
            boolean r7 = r6 instanceof X.C135136kB
            if (r7 == 0) goto L_0x01cc
            java.lang.String r7 = "caller_pn"
            com.whatsapp.jid.Jid r7 = r4.A0g(r8, r7)
            com.whatsapp.jid.DeviceJid r7 = (com.whatsapp.jid.DeviceJid) r7
        L_0x0148:
            long r4 = (long) r5
            long r4 = r4 * r16
            X.1m4 r8 = new X.1m4
            r27 = r4
            r29 = r11
            r31 = r10
            r18 = r3
            r19 = r13
            r20 = r15
            r15 = r8
            r16 = r6
            r17 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r31)
            r3 = 2
            r0.A03(r3)
            X.2yo r5 = r1.A04
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-call-incoming-stanza tag="
            r3.append(r0)
            com.whatsapp.protocol.VoipStanzaChildNode r4 = r8.A01
            java.lang.String r0 = r4.tag
            r3.append(r0)
            java.lang.String r0 = " from="
            r3.append(r0)
            com.whatsapp.jid.Jid r0 = r8.A00
            r3.append(r0)
            java.lang.String r0 = " callId="
            r3.append(r0)
            java.lang.String r0 = r8.A02
            X.C18260x0.A1L(r3, r0)
            X.4Ag r3 = r5.A01
            r0 = 192(0xc0, float:2.69E-43)
            X.AnonymousClass0x2.A16(r3, r8, r0)
            boolean r0 = X.C30201m4.A00(r2)
            if (r0 != 0) goto L_0x01ca
            java.util.Map r3 = X.AnonymousClass1gU.A01
            boolean r0 = r3.containsKey(r2)
            if (r0 == 0) goto L_0x01c7
            java.lang.Object r0 = X.C18320x8.A0Z(r3, r2)
            int r0 = X.AnonymousClass001.A0K(r0)
        L_0x01a8:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L_0x01ac:
            java.lang.Integer r7 = X.C18290x4.A0a()
            r9 = 0
            r11 = r9
            r5 = r1
            r6 = r32
            r10 = r9
            r5.A01(r6, r7, r8, r9, r10, r11)
            java.lang.String r0 = r4.tag
            boolean r0 = X.C30201m4.A00(r0)
            if (r0 == 0) goto L_0x02a9
            X.31C r0 = r1.A01
            r0.A0H(r14)
            return
        L_0x01c7:
            r0 = 18
            goto L_0x01a8
        L_0x01ca:
            r8 = 0
            goto L_0x01ac
        L_0x01cc:
            r7 = 0
            goto L_0x0148
        L_0x01cf:
            r8 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "connection/handleNotification: got bad offline="
            X.C18260x0.A0u(r2, r9, r3, r8)
        L_0x01d9:
            r17 = 0
        L_0x01db:
            java.lang.Integer r27 = X.C18290x4.A0b()
            r29 = r5
            r31 = r5
            r25 = r1
            r26 = r17
            r28 = r5
            r30 = r4
            r25.A01(r26, r27, r28, r29, r30, r31)
            X.2RV r2 = r1.A02
            if (r4 != 0) goto L_0x02ac
            java.lang.String r20 = ""
        L_0x01f4:
            java.util.concurrent.atomic.AtomicLong r3 = r2.A04
            long r21 = r3.getAndIncrement()
            X.2sH r14 = r2.A01
            X.2qk r13 = r2.A00
            X.4FV r3 = r2.A02
            X.2r5 r2 = r2.A03
            X.1gR r12 = new X.1gR
            r15 = r3
            r16 = r2
            r19 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r23)
            r2.A06(r12)
            long r2 = r12.A03
            X.2i8 r9 = X.C50412i8.A00(r10)
            java.lang.String r8 = "notification"
            r9.A05 = r8
            r9.A07 = r7
            r9.A08 = r4
            r9.A01 = r6
            r9.A00 = r2
            X.39T r6 = r9.A01()
            r2 = 2
            r12.A03(r2)
            java.lang.String r15 = "pay"
            boolean r2 = r15.equals(r4)
            if (r2 == 0) goto L_0x02b0
            X.2yo r14 = r1.A01
            X.36K[] r13 = r0.A03
            r12 = 0
            if (r13 == 0) goto L_0x02b0
            int r11 = r13.length
            if (r11 <= 0) goto L_0x02b0
            r7 = 0
        L_0x023e:
            r3 = r13[r12]
            java.lang.String r2 = r3.A00
            boolean r2 = r2.equals(r15)
            if (r2 == 0) goto L_0x02a3
            java.lang.String r2 = "hash"
            java.lang.String r7 = r3.A0r(r2, r5)
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            r3 = 0
            if (r2 != 0) goto L_0x02aa
            byte[] r2 = r7.getBytes()
            byte[] r10 = android.util.Base64.decode(r2, r3)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "connection/handleSideListNotification"
            r3.append(r2)
            java.lang.String r2 = java.util.Arrays.toString(r10)
            X.C18260x0.A1J(r3, r2)
            X.2xW r7 = X.C59812xW.A0M
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "ConnectionThreadRequestsImpl/sync-notify-add; stanzaKey="
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = "; jidHash="
            r3.append(r2)
            java.lang.String r2 = java.util.Arrays.toString(r10)
            X.C18260x0.A1L(r3, r2)
            X.4Ag r9 = r14.A01
            r3 = 0
            r2 = 24
            android.os.Message r7 = android.os.Message.obtain(r5, r3, r2, r3, r7)
            android.os.Bundle r3 = r7.getData()
            java.lang.String r2 = "stanzaKey"
            r3.putParcelable(r2, r6)
            java.lang.String r2 = "jidHash"
            r3.putByteArray(r2, r10)
            r9.Bfr(r7)
            r7 = 1
        L_0x02a3:
            int r12 = r12 + 1
            if (r12 < r11) goto L_0x023e
            if (r7 == 0) goto L_0x02b0
        L_0x02a9:
            return
        L_0x02aa:
            r7 = 0
            goto L_0x02a3
        L_0x02ac:
            r20 = r4
            goto L_0x01f4
        L_0x02b0:
            if (r4 == 0) goto L_0x02c7
            java.util.Map r2 = r1.A04
            java.lang.Number r2 = X.AnonymousClass0x9.A0q(r4, r2)
            if (r2 == 0) goto L_0x02c7
            int r3 = r2.intValue()
            r2 = -1
            if (r3 == r2) goto L_0x02c7
            X.2yo r1 = r1.A01
            r1.A01(r0, r6, r3)
            return
        L_0x02c7:
            X.1VX r3 = r1.A02
            r2 = 3280(0xcd0, float:4.596E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r2 = r3.A0Y(r0, r2)
            r0 = 487(0x1e7, float:6.82E-43)
            if (r2 == 0) goto L_0x02d7
            r0 = 490(0x1ea, float:6.87E-43)
        L_0x02d7:
            X.2i8 r3 = r6.A02()
            java.lang.String r2 = "error"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.A02(r2, r0)
            X.39T r2 = r3.A01()
            X.31C r0 = r1.A01
            r0.A0H(r2)
            X.1Xl r2 = new X.1Xl
            r2.<init>()
            r2.A00 = r8
            r2.A01 = r4
            X.4FV r0 = r1.A03
            r0.BhD(r2)
            return
        L_0x02fc:
            java.lang.String r0 = "no payload of incoming <call> node"
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            throw r0
        L_0x0304:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CallStanza from invalid jid "
            java.lang.String r0 = X.AnonymousClass000.A0P(r3, r0, r1)
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32151pe.A03(X.36K, java.lang.Integer, java.util.Map):void");
    }
}
