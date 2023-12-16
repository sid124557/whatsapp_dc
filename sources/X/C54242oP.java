package X;

/* renamed from: X.2oP  reason: invalid class name and case insensitive filesystem */
public abstract class C54242oP {
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03db, code lost:
        if (r7 == null) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0105, code lost:
        if (r3.getInt(r15.intValue()) != 1) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0493, code lost:
        if (r9 != null) goto L_0x0495;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0497, code lost:
        if (r2 == null) goto L_0x0499;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04fa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04fb, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04fe, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0502, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0506, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0509, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x050a, code lost:
        X.AnonymousClass2A8.A00(r29, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x050f, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0148, code lost:
        if (r3.getInt(r11.intValue()) != 1) goto L_0x014a;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A00() {
        /*
            r42 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r23 = r42
            r0 = r23
            boolean r0 = r0 instanceof X.AnonymousClass1S0
            r21 = r0
            if (r0 == 0) goto L_0x04ea
            java.lang.String r0 = "MessageOrphanCommentResolver"
        L_0x0010:
            r1.append(r0)
            java.lang.String r0 = "/resolveOrphanMessages"
            X.C18260x0.A1L(r1, r0)
            java.util.LinkedHashSet r25 = X.AnonymousClass0x9.A17()
            r22 = 1
            r1 = -1
        L_0x0020:
            if (r21 == 0) goto L_0x04d0
            r0 = r23
            X.1S0 r0 = (X.AnonymousClass1S0) r0
            X.2h9 r4 = r0.A01
            r30 = 3
        L_0x002a:
            java.util.ArrayList r27 = X.AnonymousClass001.A0s()
            X.3dV r0 = r4.A02
            X.4GK r29 = r0.get()
            X.C162457s7.A0H(r29)     // Catch:{ all -> 0x0507 }
            r7 = 200(0xc8, float:2.8E-43)
            r8 = 0
            r0 = r29
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0507 }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x0507 }
            java.lang.String r5 = X.C39142Av.A00     // Catch:{ all -> 0x0507 }
            java.lang.String[] r3 = X.AnonymousClass0x9.A1a()     // Catch:{ all -> 0x0507 }
            r0 = r30
            X.C18280x3.A1Q(r3, r0, r8)     // Catch:{ all -> 0x0507 }
            r0 = 1
            X.AnonymousClass0x2.A1S(r3, r0, r1)     // Catch:{ all -> 0x0507 }
            r0 = 2
            X.C18280x3.A1Q(r3, r7, r0)     // Catch:{ all -> 0x0507 }
            java.lang.String r0 = "MessageOrphanStore/getMessageOrphansByMessageType"
            android.database.Cursor r3 = X.C56862sg.A02(r6, r5, r0, r3)     // Catch:{ all -> 0x0507 }
            java.util.HashMap r1 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x0500 }
            java.lang.String[] r0 = X.C66133Ke.A00     // Catch:{ all -> 0x0500 }
            X.C626135u.A02(r3, r1, r0)     // Catch:{ all -> 0x0500 }
            java.lang.String r0 = "_id"
            java.lang.Object r28 = X.C18290x4.A0i(r0, r1)     // Catch:{ all -> 0x0500 }
            r0 = r28
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0500 }
            r28 = r0
            java.lang.String r0 = "chat_row_id"
            java.lang.Object r26 = r1.get(r0)     // Catch:{ all -> 0x0500 }
            r0 = r26
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0500 }
            r26 = r0
            java.lang.String r0 = "from_me"
            java.lang.Object r15 = r1.get(r0)     // Catch:{ all -> 0x0500 }
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch:{ all -> 0x0500 }
            java.lang.String r0 = "key_id"
            java.lang.Object r24 = X.C18290x4.A0i(r0, r1)     // Catch:{ all -> 0x0500 }
            r0 = r24
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0500 }
            r24 = r0
            java.lang.String r0 = "sender_jid_row_id"
            java.lang.Object r13 = r1.get(r0)     // Catch:{ all -> 0x0500 }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x0500 }
            java.lang.String r0 = "parent_chat_row_id"
            java.lang.Object r12 = r1.get(r0)     // Catch:{ all -> 0x0500 }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x0500 }
            java.lang.String r0 = "parent_from_me"
            java.lang.Object r11 = r1.get(r0)     // Catch:{ all -> 0x0500 }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ all -> 0x0500 }
            java.lang.String r0 = "parent_key_id"
            java.lang.Object r9 = r1.get(r0)     // Catch:{ all -> 0x0500 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x0500 }
            java.lang.String r0 = "parent_sender_jid_row_id"
            java.lang.Object r8 = r1.get(r0)     // Catch:{ all -> 0x0500 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x0500 }
            java.lang.String r0 = "timestamp"
            java.lang.Object r6 = r1.get(r0)     // Catch:{ all -> 0x0500 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0500 }
            java.lang.String r0 = "orphan_message_data"
            java.lang.Object r5 = r1.get(r0)     // Catch:{ all -> 0x0500 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x0500 }
            java.lang.String r0 = "orphan_message_stanza_data"
            java.lang.Object r2 = r1.get(r0)     // Catch:{ all -> 0x0500 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0500 }
        L_0x00d6:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0500 }
            if (r0 == 0) goto L_0x01b5
            X.C162457s7.A0H(r28)     // Catch:{ all -> 0x0500 }
            int r0 = r28.intValue()     // Catch:{ all -> 0x0500 }
            long r19 = r3.getLong(r0)     // Catch:{ all -> 0x0500 }
            if (r26 == 0) goto L_0x01b2
            int r0 = r26.intValue()     // Catch:{ all -> 0x0500 }
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0500 }
        L_0x00f1:
            X.2sm r10 = r4.A00     // Catch:{ all -> 0x0500 }
            long r0 = (long) r0     // Catch:{ all -> 0x0500 }
            X.4uZ r18 = r10.A0B(r0)     // Catch:{ all -> 0x0500 }
            r1 = 1
            if (r15 == 0) goto L_0x0107
            int r0 = r15.intValue()     // Catch:{ all -> 0x0500 }
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0500 }
            r17 = 1
            if (r0 == r1) goto L_0x0109
        L_0x0107:
            r17 = 0
        L_0x0109:
            X.C162457s7.A0H(r24)     // Catch:{ all -> 0x0500 }
            int r0 = r24.intValue()     // Catch:{ all -> 0x0500 }
            java.lang.String r16 = X.C18320x8.A0c(r3, r0)     // Catch:{ all -> 0x0500 }
            if (r13 == 0) goto L_0x0128
            int r0 = r13.intValue()     // Catch:{ all -> 0x0500 }
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0500 }
        L_0x011e:
            X.34p r7 = r4.A01     // Catch:{ all -> 0x0500 }
            long r0 = (long) r0     // Catch:{ all -> 0x0500 }
            com.whatsapp.jid.Jid r32 = r7.A08(r0)     // Catch:{ all -> 0x0500 }
            if (r9 == 0) goto L_0x0158
            goto L_0x012a
        L_0x0128:
            r0 = -1
            goto L_0x011e
        L_0x012a:
            if (r12 == 0) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            r0 = -1
            goto L_0x0137
        L_0x012f:
            int r0 = r12.intValue()     // Catch:{ all -> 0x0500 }
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0500 }
        L_0x0137:
            long r0 = (long) r0     // Catch:{ all -> 0x0500 }
            X.4uZ r14 = r10.A0B(r0)     // Catch:{ all -> 0x0500 }
            if (r11 == 0) goto L_0x014a
            int r0 = r11.intValue()     // Catch:{ all -> 0x0500 }
            int r10 = r3.getInt(r0)     // Catch:{ all -> 0x0500 }
            r1 = 1
            r0 = 1
            if (r10 == r1) goto L_0x014b
        L_0x014a:
            r0 = 0
        L_0x014b:
            int r1 = r9.intValue()     // Catch:{ all -> 0x0500 }
            java.lang.String r1 = X.C18320x8.A0c(r3, r1)     // Catch:{ all -> 0x0500 }
            X.2z0 r35 = X.AnonymousClass2z0.A05(r14, r1, r0)     // Catch:{ all -> 0x0500 }
            goto L_0x015a
        L_0x0158:
            r35 = 0
        L_0x015a:
            if (r8 == 0) goto L_0x015d
            goto L_0x015f
        L_0x015d:
            r0 = -1
            goto L_0x0167
        L_0x015f:
            int r0 = r8.intValue()     // Catch:{ all -> 0x0500 }
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0500 }
        L_0x0167:
            long r0 = (long) r0     // Catch:{ all -> 0x0500 }
            com.whatsapp.jid.Jid r33 = r7.A08(r0)     // Catch:{ all -> 0x0500 }
            if (r6 == 0) goto L_0x0177
            int r0 = r6.intValue()     // Catch:{ all -> 0x0500 }
            long r40 = r3.getLong(r0)     // Catch:{ all -> 0x0500 }
            goto L_0x0179
        L_0x0177:
            r40 = 0
        L_0x0179:
            if (r5 == 0) goto L_0x0184
            int r0 = r5.intValue()     // Catch:{ all -> 0x0500 }
            byte[] r37 = r3.getBlob(r0)     // Catch:{ all -> 0x0500 }
            goto L_0x0186
        L_0x0184:
            r37 = 0
        L_0x0186:
            if (r2 == 0) goto L_0x0189
            goto L_0x018c
        L_0x0189:
            r38 = 0
            goto L_0x0194
        L_0x018c:
            int r0 = r2.intValue()     // Catch:{ all -> 0x0500 }
            byte[] r38 = r3.getBlob(r0)     // Catch:{ all -> 0x0500 }
        L_0x0194:
            java.lang.Long r36 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0500 }
            r7 = r18
            r1 = r16
            r0 = r17
            X.2z0 r34 = X.AnonymousClass2z0.A05(r7, r1, r0)     // Catch:{ all -> 0x0500 }
            X.2ns r0 = new X.2ns     // Catch:{ all -> 0x0500 }
            r31 = r0
            r39 = r30
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0500 }
            r1 = r27
            r1.add(r0)     // Catch:{ all -> 0x0500 }
            goto L_0x00d6
        L_0x01b2:
            r0 = -1
            goto L_0x00f1
        L_0x01b5:
            r3.close()     // Catch:{ all -> 0x0507 }
            r29.close()
            if (r21 == 0) goto L_0x0263
            r3 = r23
            X.1S0 r3 = (X.AnonymousClass1S0) r3
            java.util.Iterator r8 = r27.iterator()
        L_0x01c5:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x04ae
            java.lang.Object r6 = r8.next()
            X.2ns r6 = (X.C53912ns) r6
            java.lang.Long r5 = r6.A06
            X.2z0 r4 = r6.A05
            com.whatsapp.jid.Jid r0 = r6.A02
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A05(r0)
            X.2z0 r12 = r6.A04
            byte[] r1 = r6.A07
            long r13 = r6.A01
            com.whatsapp.jid.Jid r0 = r6.A03
            X.4uZ r6 = X.C106405Yw.A03(r0)
            if (r4 == 0) goto L_0x01fd
            if (r1 == 0) goto L_0x01fd
            if (r5 == 0) goto L_0x01fd
            X.1EU r0 = X.AnonymousClass1EU.A00(r1)     // Catch:{ 6u5 -> 0x01f6 }
            X.1EU r10 = X.C615231c.A00(r0)     // Catch:{ 6u5 -> 0x01f6 }
            goto L_0x0200
        L_0x01f6:
            r1 = move-exception
            java.lang.String r0 = "MessageOrphanCommentResolver/getProcessedFMessage/cannot convert raw byte to E2E message/"
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x01c5
        L_0x01fd:
            java.lang.String r0 = "MessageOrphanCommentResolver/resolveOrphanMessages/some required fields are null for the orphan message"
            goto L_0x0213
        L_0x0200:
            X.C162457s7.A0H(r10)
            X.2fy r0 = r3.A03
            X.2z0 r1 = r0.A00(r4)
            X.2qz r0 = r3.A04
            X.34x r7 = r0.A05(r1)
            if (r7 != 0) goto L_0x0217
            java.lang.String r0 = "MessageOrphanCommentResolver/getProcessedFMessage/parent message not found"
        L_0x0213:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x01c5
        L_0x0217:
            X.C18260x0.A0O(r10, r12)     // Catch:{ 24W -> 0x025b }
            X.2dX r9 = new X.2dX     // Catch:{ 24W -> 0x025b }
            r11 = r10
            r9.<init>(r10, r11, r12, r13)     // Catch:{ 24W -> 0x025b }
            r9.A04 = r6     // Catch:{ 24W -> 0x025b }
            java.lang.String r0 = r4.A01     // Catch:{ 24W -> 0x025b }
            r9.A08 = r0     // Catch:{ 24W -> 0x025b }
            r9.A05 = r2     // Catch:{ 24W -> 0x025b }
            X.2rC r1 = r9.A01()     // Catch:{ 24W -> 0x025b }
            X.3Le r0 = r3.A02     // Catch:{ 24W -> 0x025b }
            X.34x r4 = r0.A00(r1)     // Catch:{ 24W -> 0x025b }
            X.2pu r0 = r4.A0t()
            if (r0 != 0) goto L_0x0246
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r4.A1B(r0)
            X.2kn r2 = X.C52042kn.A00(r7)
            long r0 = r7.A1L
            X.C30211m5.A00(r4, r2, r0)
        L_0x0246:
            r4.A1J(r6)
            boolean r0 = X.C624134x.A0g(r4)
            if (r0 == 0) goto L_0x01c5
            r0 = r25
            r0.add(r5)
            X.3Lv r0 = r3.A00
            r0.A0V(r4)
            goto L_0x01c5
        L_0x025b:
            r1 = move-exception
            java.lang.String r0 = "MessageOrphanCommentResolver/getProcessedFMessage/BadMessage:"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x01c5
        L_0x0263:
            r0 = r23
            boolean r0 = r0 instanceof X.AnonymousClass1S2
            if (r0 == 0) goto L_0x038e
            r5 = r23
            X.1S2 r5 = (X.AnonymousClass1S2) r5
            java.util.Iterator r11 = r27.iterator()
        L_0x0271:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x04ae
            java.lang.Object r2 = r11.next()
            X.2ns r2 = (X.C53912ns) r2
            java.lang.Long r4 = r2.A06
            X.2z0 r6 = r2.A04
            com.whatsapp.jid.Jid r0 = r2.A03
            com.whatsapp.jid.UserJid r15 = X.AnonymousClass32Y.A05(r0)
            X.2z0 r10 = r2.A05
            com.whatsapp.jid.Jid r0 = r2.A02
            com.whatsapp.jid.UserJid r30 = X.AnonymousClass32Y.A05(r0)
            long r0 = r2.A01
            byte[] r7 = r2.A07
            byte[] r3 = r2.A08
            java.lang.String r9 = "MessageOrphanBotResolver/getEditTargetId/unexpected error while processing BotMessageInfo"
            r33 = 0
            if (r3 == 0) goto L_0x02c0
            X.1AW r2 = X.AnonymousClass1AW.DEFAULT_INSTANCE     // Catch:{ 24P | 6u5 -> 0x02bc }
            X.6cX r3 = X.C130786cX.A05(r2, r3)     // Catch:{ 24P | 6u5 -> 0x02bc }
            X.1AW r3 = (X.AnonymousClass1AW) r3     // Catch:{ 24P | 6u5 -> 0x02bc }
            int r2 = r3.bitField0_     // Catch:{ 24P | 6u5 -> 0x02bc }
            r2 = r2 & 1
            if (r2 == 0) goto L_0x02c0
            java.lang.String r8 = r3.editTargetId_     // Catch:{ 24P | 6u5 -> 0x02bc }
            X.C162457s7.A0D(r8)     // Catch:{ 24P | 6u5 -> 0x02bc }
            java.lang.String r2 = "[^a-zA-Z0-9]"
            X.5rB r3 = new X.5rB     // Catch:{ 24P | 6u5 -> 0x02bc }
            r3.<init>((java.lang.String) r2)     // Catch:{ 24P | 6u5 -> 0x02bc }
            java.lang.String r2 = ""
            java.lang.String r2 = r3.A00(r8, r2)     // Catch:{ 24P | 6u5 -> 0x02bc }
            goto L_0x02c2
        L_0x02bc:
            r2 = move-exception
            com.whatsapp.util.Log.e(r9, r2)
        L_0x02c0:
            r2 = r33
        L_0x02c2:
            if (r4 == 0) goto L_0x0387
            if (r10 == 0) goto L_0x0387
            if (r7 == 0) goto L_0x0387
            java.lang.String r3 = r10.A01
            X.C162457s7.A0C(r3)
            X.4uZ r14 = r10.A00
            X.2n5 r13 = new X.2n5
            r28 = r13
            r29 = r14
            r31 = r3
            r32 = r2
            r34 = r0
            r28.<init>(r29, r30, r31, r32, r33, r34)
            r3 = 5
            if (r14 == 0) goto L_0x02fa
            X.2pS r12 = r5.A05
            X.34x r16 = r12.A00(r13, r14)
            java.lang.String r8 = r6.A01
            r19 = r7
            r17 = r8
            r18 = r2
            byte[] r7 = r12.A02(r13, r14, r15, r16, r17, r18, r19)
            if (r7 != 0) goto L_0x030a
            java.lang.String r0 = "MessageOrphanBotResolver/getE2EMessageData/decrypted msmsg data is null"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x02fa:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageOrphanBotResolver/resolveOrphanedMessageSecretMessage/processed message is null: "
            r1.append(r0)
            java.lang.String r0 = r6.A01
            X.C18260x0.A1K(r1, r0)
            goto L_0x0271
        L_0x030a:
            X.1EU r7 = X.AnonymousClass1EU.A00(r7)     // Catch:{ 6u5 -> 0x033b }
            X.1EU r13 = X.C615231c.A00(r7)     // Catch:{ 6u5 -> 0x033b }
            X.C162457s7.A0H(r13)     // Catch:{ 6u5 -> 0x033b }
            if (r13 == 0) goto L_0x02fa
            X.2z0 r8 = new X.2z0     // Catch:{ 24W -> 0x0334 }
            r8.<init>(r6)     // Catch:{ 24W -> 0x0334 }
            X.2dX r7 = new X.2dX     // Catch:{ 24W -> 0x0334 }
            r12 = r7
            r14 = r13
            r15 = r8
            r16 = r0
            r12.<init>(r13, r14, r15, r16)     // Catch:{ 24W -> 0x0334 }
            r0 = 1
            r7.A0F = r0     // Catch:{ 24W -> 0x0334 }
            X.2rC r1 = r7.A01()     // Catch:{ 24W -> 0x0334 }
            X.3Le r0 = r5.A03     // Catch:{ 24W -> 0x0334 }
            X.34x r7 = r0.A00(r1)     // Catch:{ 24W -> 0x0334 }
            goto L_0x0342
        L_0x0334:
            r1 = move-exception
            java.lang.String r0 = "MessageOrphanBotResolver/getProcessedMessage/BadMessage:"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x02fa
        L_0x033b:
            r1 = move-exception
            java.lang.String r0 = "MessageOrphanBotResolver/getE2EMessageData/invalidProto/"
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x02fa
        L_0x0342:
            java.lang.String r0 = "MessageOrphanBotResolver/resolveOrphanedMessageSecretMessage/storing decrypted orphan"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r2 == 0) goto L_0x0351
            X.4uZ r1 = r6.A00
            boolean r0 = r6.A02
            X.2z0 r6 = X.AnonymousClass2z0.A05(r1, r2, r0)
        L_0x0351:
            X.2qz r0 = r5.A06
            X.34x r1 = r0.A05(r6)
            if (r1 == 0) goto L_0x0271
            boolean r0 = r1 instanceof X.C30351mJ
            if (r0 == 0) goto L_0x0371
            if (r2 != 0) goto L_0x0271
            boolean r0 = r5.A01(r7, r1)
            if (r0 == 0) goto L_0x0271
            X.3Lv r0 = r5.A00
            r0.A0b(r7, r3)
        L_0x036a:
            r0 = r25
            r0.add(r4)
            goto L_0x0271
        L_0x0371:
            if (r2 == 0) goto L_0x0271
            boolean r0 = r5.A01(r7, r1)
            if (r0 == 0) goto L_0x0271
            X.2dP r1 = r5.A04
            boolean r0 = X.C624134x.A0d(r7)
            if (r0 == 0) goto L_0x036a
            X.2qj r0 = r1.A05
            r0.A03(r7)
            goto L_0x036a
        L_0x0387:
            java.lang.String r0 = "MessageOrphanBotResolver/resolveOrphanedMessageSecretMessages/some required data to decrypt the msg is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0271
        L_0x038e:
            r4 = r23
            X.1S1 r4 = (X.AnonymousClass1S1) r4
            java.util.LinkedHashSet r3 = X.AnonymousClass0x9.A17()
            java.util.Iterator r16 = r27.iterator()
        L_0x039a:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x04ae
            java.lang.Object r2 = r16.next()
            X.2ns r2 = (X.C53912ns) r2
            java.lang.Long r6 = r2.A06
            X.2z0 r9 = r2.A05
            com.whatsapp.jid.Jid r0 = r2.A02
            X.4uZ r8 = X.C106405Yw.A03(r0)
            if (r6 == 0) goto L_0x0493
            if (r9 == 0) goto L_0x0499
            X.4uZ r0 = r9.A00
            if (r0 == 0) goto L_0x0495
            boolean r0 = r3.contains(r9)
            if (r0 != 0) goto L_0x0495
            X.2qz r1 = r4.A05
            X.34x r7 = r1.A05(r9)
            if (r7 != 0) goto L_0x03e1
            X.2jy r0 = r4.A00
            android.database.Cursor r5 = r0.A00(r9)
            if (r5 == 0) goto L_0x03dd
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x03d8
            X.34x r7 = r1.A03(r5)     // Catch:{ all -> 0x04f8 }
        L_0x03d8:
            r5.close()
            if (r7 != 0) goto L_0x03e1
        L_0x03dd:
            r3.add(r9)
            goto L_0x039a
        L_0x03e1:
            X.2eA r5 = r4.A01
            long r0 = r7.A1L
            byte[] r11 = r5.A01(r0)
            X.2z0 r14 = r2.A04
            com.whatsapp.jid.Jid r0 = r2.A03
            X.4uZ r10 = X.C106405Yw.A03(r0)
            long r0 = r2.A01
            byte[] r5 = r2.A07
            byte[] r15 = r2.A08
            java.lang.String r2 = "MessageAddOnOrphanResolver/buildFMessageAddOn/failed to parse orphan message"
            r12 = 0
            X.1EU r13 = X.AnonymousClass1EU.A00(r5)     // Catch:{ 6u5 -> 0x048d }
            X.C162457s7.A0H(r13)     // Catch:{ 6u5 -> 0x048d }
            if (r15 == 0) goto L_0x0413
            X.1BY r5 = X.AnonymousClass1BY.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x040c }
            X.6cX r12 = X.C130786cX.A05(r5, r15)     // Catch:{ 6u5 -> 0x040c }
            X.1BY r12 = (X.AnonymousClass1BY) r12     // Catch:{ 6u5 -> 0x040c }
            goto L_0x0413
        L_0x040c:
            r1 = move-exception
            java.lang.String r0 = "MessageAddOnOrphanResolver/buildFMessageAddOn/failed to parse orphan stanza data"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x039a
        L_0x0413:
            X.C18260x0.A0O(r13, r14)
            X.2dX r5 = new X.2dX
            r30 = r13
            r28 = r5
            r29 = r13
            r31 = r14
            r32 = r0
            r28.<init>(r29, r30, r31, r32)
            r5.A04 = r10
            if (r12 == 0) goto L_0x0433
            int r0 = r12.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0433
            int r0 = r12.editVersion_
            r5.A01 = r0
        L_0x0433:
            X.3Le r1 = r4.A04     // Catch:{  }
            X.2rC r0 = r5.A01()     // Catch:{  }
            X.34x r5 = r1.A00(r0)     // Catch:{  }
            boolean r0 = r5 instanceof X.C30331mH     // Catch:{  }
            if (r0 == 0) goto L_0x039a
            X.1mH r5 = (X.C30331mH) r5     // Catch:{  }
            if (r5 == 0) goto L_0x039a
            r5.A1J(r10)
            X.C30331mH.A03(r8, r5, r9)
            if (r11 == 0) goto L_0x044f
            r5.A1a = r11
        L_0x044f:
            boolean r0 = r7 instanceof X.C30351mJ
            if (r0 == 0) goto L_0x0459
            boolean r0 = r5 instanceof X.C30591mh
            if (r0 == 0) goto L_0x0459
            goto L_0x039a
        L_0x0459:
            boolean r0 = r7 instanceof X.C30531mb
            if (r0 == 0) goto L_0x0463
            X.2kn r0 = X.C52042kn.A00(r7)
            r5.A05 = r0
        L_0x0463:
            X.33f r2 = r4.A02
            r0 = 0
            int r1 = r2.A03(r5, r0)
            boolean r0 = X.AnonymousClass31T.A00(r1)
            if (r0 != 0) goto L_0x0473
            r0 = 5
            if (r1 != r0) goto L_0x0478
        L_0x0473:
            r0 = r25
            r0.add(r6)
        L_0x0478:
            r0 = 8
            if (r1 == r0) goto L_0x0480
            r0 = 9
            if (r1 != r0) goto L_0x039a
        L_0x0480:
            boolean r0 = r5 instanceof X.C30561me
            if (r0 == 0) goto L_0x039a
            X.2pk r0 = r2.A0L
            X.1me r5 = (X.C30561me) r5
            r0.A03(r5)
            goto L_0x039a
        L_0x048d:
            r0 = move-exception
            com.whatsapp.util.Log.e(r2, r0)
            goto L_0x039a
        L_0x0493:
            if (r9 == 0) goto L_0x0499
        L_0x0495:
            java.lang.String r2 = r9.A01
            if (r2 != 0) goto L_0x049b
        L_0x0499:
            java.lang.String r2 = ""
        L_0x049b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageAddOnOrphanResolver/resolveOrphanedMessageAddOns/ignoring orphanId="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " id="
            X.C18260x0.A0t(r0, r2, r1)
            goto L_0x039a
        L_0x04ae:
            int r1 = r27.size()
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 >= r0) goto L_0x04b8
            r22 = 0
        L_0x04b8:
            boolean r0 = r27.isEmpty()
            if (r0 != 0) goto L_0x04ff
            java.lang.Object r0 = X.C73723fy.A05(r27)
            X.2ns r0 = (X.C53912ns) r0
            java.lang.Long r0 = r0.A06
            if (r0 == 0) goto L_0x04ff
            long r1 = r0.longValue()
            if (r22 == 0) goto L_0x04ff
            goto L_0x0020
        L_0x04d0:
            r0 = r23
            boolean r0 = r0 instanceof X.AnonymousClass1S2
            if (r0 == 0) goto L_0x04e0
            r0 = r23
            X.1S2 r0 = (X.AnonymousClass1S2) r0
            X.2h9 r4 = r0.A01
            r30 = 2
            goto L_0x002a
        L_0x04e0:
            r0 = r23
            X.1S1 r0 = (X.AnonymousClass1S1) r0
            X.2h9 r4 = r0.A03
            r30 = 1
            goto L_0x002a
        L_0x04ea:
            r0 = r23
            boolean r0 = r0 instanceof X.AnonymousClass1S2
            if (r0 == 0) goto L_0x04f4
            java.lang.String r0 = "MessageOrphanBotResolver"
            goto L_0x0010
        L_0x04f4:
            java.lang.String r0 = "MessageAddOnOrphanResolver"
            goto L_0x0010
        L_0x04f8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x04fa }
        L_0x04fa:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)
            throw r0
        L_0x04ff:
            return r25
        L_0x0500:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0502 }
        L_0x0502:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x0507 }
            throw r0     // Catch:{ all -> 0x0507 }
        L_0x0507:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0509 }
        L_0x0509:
            r1 = move-exception
            r0 = r29
            X.AnonymousClass2A8.A00(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54242oP.A00():java.util.Set");
    }
}
