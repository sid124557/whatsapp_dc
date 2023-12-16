package X;

import java.util.Map;

/* renamed from: X.1pX  reason: invalid class name and case insensitive filesystem */
public class C32081pX extends C53272mp {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: X.3ZC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX WARNING: type inference failed for: r9v2, types: [X.39T] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x027e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass36K r25) {
        /*
            r24 = this;
            X.2i8 r2 = new X.2i8
            r2.<init>()
            java.lang.Class<com.whatsapp.jid.Jid> r1 = com.whatsapp.jid.Jid.class
            java.lang.String r0 = "from"
            r4 = r25
            com.whatsapp.jid.Jid r0 = r4.A0g(r1, r0)
            r2.A02 = r0
            java.lang.String r22 = "participant"
            r0 = r22
            com.whatsapp.jid.Jid r0 = r4.A0g(r1, r0)
            r2.A01 = r0
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "recipient"
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass36K.A0A(r4, r1, r0)
            r2.A03 = r0
            java.lang.String r0 = "id"
            java.lang.String r0 = r4.A0q(r0)
            r2.A07 = r0
            java.lang.String r0 = "class"
            java.lang.String r0 = X.AnonymousClass36K.A0L(r4, r0)
            r2.A05 = r0
            java.lang.String r0 = "type"
            java.lang.String r0 = X.AnonymousClass36K.A0L(r4, r0)
            r2.A08 = r0
            java.lang.String r21 = "edit"
            r0 = r21
            java.lang.String r0 = X.AnonymousClass36K.A0L(r4, r0)
            r2.A06 = r0
            X.39T r0 = r2.A01()
            java.lang.String r3 = r0.A05
            java.lang.String r1 = "message"
            boolean r2 = r1.equals(r3)
            r1 = r24
            if (r2 == 0) goto L_0x01f3
            com.whatsapp.jid.UserJid r3 = r0.A03
            if (r3 != 0) goto L_0x0064
            com.whatsapp.jid.Jid r2 = r0.A02
            X.4uZ r3 = X.C627336j.A02(r2)
        L_0x0064:
            java.lang.String r2 = r0.A07
            X.C626936e.A06(r2)
            X.2z0 r8 = X.AnonymousClass2z0.A04(r3, r2)
            java.lang.String r2 = "error"
            r10 = 0
            java.lang.String r12 = r4.A0r(r2, r10)
            java.lang.String r20 = "phash"
            r2 = r20
            java.lang.String r7 = r4.A0r(r2, r10)
            java.lang.String r19 = "count"
            r2 = r19
            java.lang.String r2 = r4.A0r(r2, r10)
            r9 = 0
            int r18 = X.C615531h.A01(r2, r9)
            java.lang.String r2 = "t"
            java.lang.String r2 = r4.A0r(r2, r10)
            long r2 = X.C615531h.A03(r2)
            r5 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r2
            java.lang.String r2 = "server_id"
            java.lang.String r11 = r4.A0r(r2, r10)
            r2 = -1
            long r2 = X.C615531h.A04(r11, r2)
            java.lang.String r17 = "addressing_mode"
            r11 = r17
            java.lang.String r11 = r4.A0r(r11, r10)
            java.lang.String r16 = X.C381125t.A00(r11)
            java.lang.String r11 = "rcat"
            X.36K r4 = r4.A0l(r11)
            if (r4 == 0) goto L_0x01f0
            byte[] r11 = r4.A01
            r4 = 10
            java.lang.String r13 = android.util.Base64.encodeToString(r11, r4)
        L_0x00c2:
            if (r12 != 0) goto L_0x01b0
            X.2yo r4 = r1.A04
            r23 = r4
            com.whatsapp.jid.Jid r4 = r0.A01
            com.whatsapp.jid.DeviceJid r14 = com.whatsapp.jid.DeviceJid.of(r4)
            com.whatsapp.jid.Jid r4 = r0.A02
            com.whatsapp.jid.DeviceJid r12 = com.whatsapp.jid.DeviceJid.of(r4)
            java.lang.String r11 = r0.A06
            java.lang.StringBuilder r15 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "ConnectionThreadRequestsImpl/message-received-by-server; key="
            X.AnonymousClass0x2.A1E(r8, r14, r4, r15)
            java.lang.String r4 = "; remoteJid="
            r15.append(r4)
            r15.append(r12)
            java.lang.String r4 = "; serverParticipantHash="
            r15.append(r4)
            r15.append(r7)
            java.lang.String r4 = "; recipientCount="
            r15.append(r4)
            r4 = r18
            r15.append(r4)
            java.lang.String r4 = "; edit="
            r15.append(r4)
            r15.append(r11)
            java.lang.String r4 = "; timestamp="
            r15.append(r4)
            r15.append(r5)
            java.lang.String r4 = "; smId="
            X.C18260x0.A12(r4, r15, r2)
            r4 = r23
            X.4Ag r4 = r4.A01
            r23 = r4
            r4 = 19
            android.os.Message r4 = android.os.Message.obtain(r10, r9, r4, r9)
            android.os.Bundle r15 = r4.getData()
            java.lang.String r10 = r8.A01
            java.lang.String r9 = "msgid"
            r15.putString(r9, r10)
            android.os.Bundle r10 = r4.getData()
            X.4uZ r8 = r8.A00
            java.lang.String r9 = X.C627336j.A07(r8)
            java.lang.String r8 = "remote_chat_jid"
            r10.putString(r8, r9)
            android.os.Bundle r9 = r4.getData()
            r8 = r22
            X.C384027k.A00(r9, r14, r8)
            android.os.Bundle r9 = r4.getData()
            java.lang.String r8 = "remoteJid"
            X.C384027k.A00(r9, r12, r8)
            android.os.Bundle r9 = r4.getData()
            r8 = r20
            r9.putString(r8, r7)
            android.os.Bundle r9 = r4.getData()
            r8 = r19
            r7 = r18
            r9.putInt(r8, r7)
            android.os.Bundle r8 = r4.getData()
            java.lang.String r7 = "timestamp"
            r8.putLong(r7, r5)
            android.os.Bundle r6 = r4.getData()
            java.lang.String r5 = "smid"
            r6.putLong(r5, r2)
            android.os.Bundle r3 = r4.getData()
            r2 = r21
            r3.putString(r2, r11)
            android.os.Bundle r3 = r4.getData()
            java.lang.String r2 = "counter_abuse_token"
            r3.putString(r2, r13)
            android.os.Bundle r5 = r4.getData()
            r3 = r16
            r2 = r17
            r5.putString(r2, r3)
            r2 = r23
            r2.Bfr(r4)
        L_0x0193:
            X.2yo r3 = r1.A04
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "ConnectionThreadRequestsImpl/onAckReceived; stanzaKey="
            X.C18260x0.A1R(r2, r1, r0)
            X.4Ag r3 = r3.A01
            android.os.Handler r3 = (android.os.Handler) r3
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "ConnectionThread/ReaderThreadHandler/send/ack; stanzaKey="
            X.C18260x0.A1P(r2, r1, r0)
            r1 = 5
            X.C18290x4.A1C(r3, r0, r1)
            return
        L_0x01b0:
            int r4 = X.C615531h.A01(r12, r9)
            X.2yo r5 = r1.A04
            com.whatsapp.jid.Jid r2 = r0.A01
            com.whatsapp.jid.DeviceJid r10 = com.whatsapp.jid.DeviceJid.of(r2)
            com.whatsapp.jid.Jid r2 = r0.A02
            com.whatsapp.jid.DeviceJid r11 = com.whatsapp.jid.DeviceJid.of(r2)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "ConnectionThreadRequestsImpl/message-error; key="
            X.AnonymousClass0x2.A1E(r8, r10, r2, r3)
            java.lang.String r2 = "; remoteJid="
            r3.append(r2)
            r3.append(r11)
            java.lang.String r2 = "; code="
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = "; phash="
            X.C18260x0.A0s(r2, r7, r3)
            X.4Ag r3 = r5.A01
            X.2RS r9 = new X.2RS
            r12 = r8
            r13 = r7
            r14 = r4
            r9.<init>(r10, r11, r12, r13, r14)
            r2 = 16
            X.AnonymousClass0x7.A19(r3, r9, r2)
            goto L_0x0193
        L_0x01f0:
            r13 = 0
            goto L_0x00c2
        L_0x01f3:
            java.lang.String r2 = "receipt"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02e4
            java.lang.String r6 = r0.A08
            java.lang.String r2 = "played"
            boolean r10 = r2.equals(r6)
            java.lang.String r9 = "played-self"
            java.lang.String r5 = "read"
            java.lang.String r8 = "server-error"
            if (r10 != 0) goto L_0x022b
            boolean r2 = r8.equals(r6)
            if (r2 != 0) goto L_0x022b
            boolean r2 = r5.equals(r6)
            if (r2 != 0) goto L_0x022b
            boolean r2 = r9.equals(r6)
            if (r2 != 0) goto L_0x022b
            java.lang.String r2 = "read-self"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0193
        L_0x022b:
            com.whatsapp.jid.Jid r3 = r0.A02
            X.4uZ r2 = X.C627336j.A02(r3)
            boolean r2 = r2 instanceof X.AnonymousClass1fI
            r14 = 0
            if (r2 == 0) goto L_0x02de
            com.whatsapp.jid.UserJid r3 = r0.A00()
        L_0x023a:
            java.lang.String r2 = r0.A07
            X.C626936e.A06(r2)
            X.2z0 r7 = X.AnonymousClass2z0.A05(r3, r2, r14)
            if (r10 != 0) goto L_0x02c6
            boolean r2 = r9.equals(r6)
            if (r2 != 0) goto L_0x02c6
            boolean r2 = r8.equals(r6)
            if (r2 == 0) goto L_0x0287
            X.2yo r5 = r1.A04
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "ConnectionThreadRequestsImpl/server-error-received-by-server "
            X.C18260x0.A1R(r3, r2, r7)
            X.4Ag r3 = r5.A01
            r2 = 1
            X.2z0[] r10 = new X.AnonymousClass2z0[r2]
            r10[r14] = r7
            X.4uZ r7 = r7.A00
            r6 = 0
            r11 = 12
        L_0x0268:
            r12 = 0
            X.3Qs r5 = new X.3Qs
            r9 = r6
            r8 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r14)
            X.AnonymousClass0x7.A19(r3, r5, r2)
        L_0x0274:
            java.lang.String r2 = "readreceipts"
            r5 = 0
            java.lang.String r2 = r4.A0r(r2, r5)
            if (r2 == 0) goto L_0x0193
            X.2yo r3 = r1.A04
            r2 = 227(0xe3, float:3.18E-43)
            r3.A01(r4, r5, r2)
            goto L_0x0193
        L_0x0287:
            boolean r2 = r5.equals(r6)
            if (r2 == 0) goto L_0x0274
            X.2yo r6 = r1.A04
            com.whatsapp.jid.Jid r2 = r0.A01
            com.whatsapp.jid.DeviceJid r5 = com.whatsapp.jid.DeviceJid.of(r2)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "ConnectionThreadRequestsImpl/read-receipt-received-by-server "
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = " "
            X.C18260x0.A1R(r3, r2, r5)
            X.4Ag r6 = r6.A01
            android.os.Bundle r5 = X.AnonymousClass002.A08()
            java.lang.String r3 = r7.A01
            java.lang.String r2 = "msgid"
            r5.putString(r2, r3)
            X.4uZ r2 = r7.A00
            java.lang.String r3 = X.C627336j.A07(r2)
            java.lang.String r2 = "remote_jid"
            r5.putString(r2, r3)
            r2 = 86
            X.AnonymousClass0x2.A16(r6, r5, r2)
            goto L_0x0274
        L_0x02c6:
            X.2yo r5 = r1.A04
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "ConnectionThreadRequestsImpl/playback-received-by-server "
            X.C18260x0.A1R(r3, r2, r7)
            X.4Ag r3 = r5.A01
            r2 = 1
            X.2z0[] r10 = new X.AnonymousClass2z0[r2]
            r10[r14] = r7
            X.4uZ r7 = r7.A00
            r6 = 0
            r11 = 10
            goto L_0x0268
        L_0x02de:
            X.4uZ r3 = X.C627336j.A02(r3)
            goto L_0x023a
        L_0x02e4:
            java.lang.String r2 = "call"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0193
            com.whatsapp.jid.Jid r8 = r0.A02
            X.C626936e.A06(r8)
            X.36K[] r7 = r4.A03
            r6 = 0
            if (r7 == 0) goto L_0x0307
            int r5 = r7.length
            com.whatsapp.protocol.VoipStanzaChildNode[] r11 = new com.whatsapp.protocol.VoipStanzaChildNode[r5]
            r3 = 0
        L_0x02fa:
            if (r3 >= r5) goto L_0x0308
            r2 = r7[r3]
            com.whatsapp.protocol.VoipStanzaChildNode r2 = com.whatsapp.protocol.VoipStanzaChildNode.fromProtocolTreeNode(r2)
            r11[r3] = r2
            int r3 = r3 + 1
            goto L_0x02fa
        L_0x0307:
            r11 = 0
        L_0x0308:
            java.lang.String r10 = r0.A08
            java.lang.String r2 = "error"
            int r12 = r4.A0b(r2, r6)
            java.lang.String r9 = r0.A07     // Catch:{ IllegalArgumentException -> 0x035a }
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IllegalArgumentException -> 0x035a }
            if (r2 != 0) goto L_0x034c
            boolean r2 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IllegalArgumentException -> 0x035a }
            if (r2 != 0) goto L_0x0353
            X.2yo r4 = r1.A04     // Catch:{ IllegalArgumentException -> 0x035a }
            X.C626936e.A06(r9)     // Catch:{ IllegalArgumentException -> 0x035a }
            X.C626936e.A06(r10)     // Catch:{ IllegalArgumentException -> 0x035a }
            X.2Rh r7 = new X.2Rh     // Catch:{ IllegalArgumentException -> 0x035a }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ IllegalArgumentException -> 0x035a }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x035a }
            java.lang.String r2 = "ConnectionThreadRequestsImpl/on-call-incoming-ack type="
            r3.append(r2)     // Catch:{ IllegalArgumentException -> 0x035a }
            java.lang.String r2 = r7.A03     // Catch:{ IllegalArgumentException -> 0x035a }
            r3.append(r2)     // Catch:{ IllegalArgumentException -> 0x035a }
            java.lang.String r2 = " from="
            r3.append(r2)     // Catch:{ IllegalArgumentException -> 0x035a }
            com.whatsapp.jid.Jid r2 = r7.A01     // Catch:{ IllegalArgumentException -> 0x035a }
            X.C18260x0.A0o(r2, r3)     // Catch:{ IllegalArgumentException -> 0x035a }
            X.4Ag r3 = r4.A01     // Catch:{ IllegalArgumentException -> 0x035a }
            r2 = 193(0xc1, float:2.7E-43)
            X.AnonymousClass0x2.A16(r3, r7, r2)     // Catch:{ IllegalArgumentException -> 0x035a }
            goto L_0x0193
        L_0x034c:
            java.lang.String r0 = "bad call incoming ack, missing id"
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)     // Catch:{ IllegalArgumentException -> 0x035a }
            goto L_0x0359
        L_0x0353:
            java.lang.String r0 = "bad call incoming ack, missing type"
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)     // Catch:{ IllegalArgumentException -> 0x035a }
        L_0x0359:
            throw r0     // Catch:{ IllegalArgumentException -> 0x035a }
        L_0x035a:
            r1 = move-exception
            java.lang.String r0 = "bad call incoming ack"
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            r0.initCause(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32081pX.A00(X.36K):void");
    }

    public C32081pX(C55682qk r1, AnonymousClass1VX r2, AnonymousClass4FV r3, C60592yo r4, Map map) {
        super(r1, r2, r3, r4, map);
    }
}
