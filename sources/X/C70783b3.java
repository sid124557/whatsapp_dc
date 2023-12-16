package X;

/* renamed from: X.3b3  reason: invalid class name and case insensitive filesystem */
public class C70783b3 implements Runnable {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public final int A06;

    public C70783b3(Object obj, Object obj2, Object obj3, String str, int i, int i2, long j) {
        this.A06 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A00 = i;
        this.A01 = j;
        this.A04 = obj3;
        this.A05 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x03bd, code lost:
        if (r4.compareTo((com.whatsapp.jid.Jid) r3) < 0) goto L_0x03bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f5, code lost:
        if ((r0.A1J.A00 instanceof com.whatsapp.jid.UserJid) == false) goto L_0x00f7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r37 = this;
            r2 = r37
            int r0 = r2.A06
            if (r0 == 0) goto L_0x003a
            java.lang.Object r7 = r2.A02
            X.2qJ r7 = (X.C55412qJ) r7
            java.lang.Object r6 = r2.A03
            X.4uZ r6 = (X.C95814uZ) r6
            java.lang.String r5 = r2.A05
            long r0 = r2.A01
            java.lang.Object r4 = r2.A04
            X.2fO r4 = (X.C48742fO) r4
            int r3 = r2.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.2ss r1 = r7.A02
            X.31A r0 = X.C56982ss.A00(r1, r6)
            if (r0 != 0) goto L_0x002e
            X.31A r0 = new X.31A
            r0.<init>((X.C95814uZ) r6)
            r0.A0h = r5
            r1.A0H(r0, r6)
        L_0x002e:
            r0.A0h = r5
            r0.A02 = r3
            if (r4 == 0) goto L_0x0036
            r0.A0e = r4
        L_0x0036:
            r7.A03(r0, r6, r2)
        L_0x0039:
            return
        L_0x003a:
            java.lang.Object r1 = r2.A02
            X.3Lv r1 = (X.C66543Lv) r1
            java.lang.Object r8 = r2.A03
            X.2z0 r8 = (X.AnonymousClass2z0) r8
            int r6 = r2.A00
            long r3 = r2.A01
            java.lang.Object r7 = r2.A04
            X.34x r7 = (X.C624134x) r7
            java.lang.String r0 = r2.A05
            r36 = r0
            long r16 = android.os.SystemClock.uptimeMillis()
            X.34x r0 = X.C55832qz.A00(r1, r8)
            if (r0 != 0) goto L_0x0087
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/receivedbyserver/nosuchmessage: "
            r3.append(r0)
            r3.append(r8)
        L_0x0064:
            X.AnonymousClass0x2.A19(r3)
        L_0x0067:
            if (r7 == 0) goto L_0x0039
            X.2WW r0 = r1.A1y
            boolean r0 = r0.A00(r7)
            if (r0 == 0) goto L_0x0039
            boolean r0 = android.text.TextUtils.isEmpty(r36)
            if (r0 != 0) goto L_0x0039
            X.1mW r7 = (X.C30481mW) r7
            r0 = r36
            r7.A03 = r0
            X.2qC r0 = r1.A1e
            X.3dV r0 = r0.A01
            X.4Fq r2 = r0.A04()
            goto L_0x0459
        L_0x0087:
            boolean r2 = r8.A02
            if (r2 != 0) goto L_0x00aa
            X.2sr r2 = r1.A09
            boolean r2 = X.C627636p.A0R(r2, r0)
            if (r2 != 0) goto L_0x00aa
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/receivedbyserver/error "
            r2.append(r0)
            X.4uZ r0 = r8.A00
            r2.append(r0)
            X.AnonymousClass001.A1L(r2)
            java.lang.String r0 = r8.A01
            X.C18260x0.A1K(r2, r0)
            goto L_0x0067
        L_0x00aa:
            int r2 = r0.A0D
            r5 = 4
            int r2 = X.AnonymousClass358.A00(r2, r5)
            boolean r2 = X.AnonymousClass001.A1U(r2)
            if (r2 == 0) goto L_0x00d1
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "CoreMessageStore/receivedbyserver/statusdowngrade: "
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = " current:"
            X.C624134x.A0O(r0, r2, r3)
            java.lang.String r0 = " new:"
            r3.append(r0)
            r3.append(r5)
            goto L_0x0064
        L_0x00d1:
            X.2sr r2 = r1.A09
            boolean r2 = X.C627636p.A0T(r2, r0)
            if (r2 == 0) goto L_0x016f
            r2 = 13
            r0.A1G(r2)
        L_0x00de:
            r0.A0J = r3
            X.8qC r2 = r1.A2J
            X.2sS r2 = X.C18320x8.A0I(r2)
            boolean r2 = r2.A04(r0)
            if (r2 == 0) goto L_0x016c
            if (r6 != 0) goto L_0x00f7
            X.2z0 r2 = r0.A1J
            X.4uZ r2 = r2.A00
            boolean r5 = r2 instanceof com.whatsapp.jid.UserJid
            r2 = 2
            if (r5 != 0) goto L_0x00f9
        L_0x00f7:
            int r2 = r6 + 1
        L_0x00f9:
            r0.A0B = r2
        L_0x00fb:
            X.2z0 r2 = r0.A1J
            X.4uZ r8 = r2.A00
            boolean r5 = r8 instanceof X.C135166kE
            r21 = r5
            r13 = 0
            if (r5 == 0) goto L_0x0169
            X.33e r5 = r1.A1b
            X.34r r12 = r5.A04()
            if (r12 == 0) goto L_0x0169
            long r10 = r12.A04()
            long r5 = r0.A1M
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x0169
            r12.A0A(r3)
            r20 = 1
        L_0x011d:
            X.2lf r5 = r1.A1z
            java.util.Set r6 = r5.A02
            boolean r35 = r6.contains(r2)
            X.2qB r5 = r1.A1N
            java.util.Set r10 = r5.A01(r2)
            X.36E r9 = r1.A0A
            X.2wf r5 = r1.A1S
            int r26 = r5.A01(r0)
            X.2qk r5 = r1.A06
            int r27 = X.C627336j.A00(r5, r10)
            int r28 = r10.size()
            r10 = 1
            r15 = 1
            r24 = 0
            r30 = r13
            r31 = r13
            r32 = r13
            r33 = r10
            r34 = r13
            r22 = r9
            r23 = r0
            r25 = r10
            r29 = r13
            r22.A0N(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            if (r35 == 0) goto L_0x015b
            r6.remove(r2)
        L_0x015b:
            X.2hU r9 = r1.A0q
            r6 = 24
            r9.A00(r0, r6)
            X.3dV r6 = r1.A18
            X.4Fq r19 = r6.A04()
            goto L_0x0174
        L_0x0169:
            r20 = 0
            goto L_0x011d
        L_0x016c:
            r0.A0B = r6
            goto L_0x00fb
        L_0x016f:
            r0.A1G(r5)
            goto L_0x00de
        L_0x0174:
            X.3Yo r18 = r19.Axl()     // Catch:{ all -> 0x04b0 }
            boolean r14 = r8 instanceof X.AnonymousClass1fS     // Catch:{ all -> 0x04a6 }
            if (r14 == 0) goto L_0x02dc
            if (r21 != 0) goto L_0x02dc
            java.util.List r11 = r0.A19()     // Catch:{ all -> 0x04a6 }
            if (r11 == 0) goto L_0x01d2
            int r9 = r11.size()     // Catch:{ all -> 0x04a6 }
            int r6 = r0.A0B     // Catch:{ all -> 0x04a6 }
            if (r9 < r6) goto L_0x01d2
            android.content.ContentValues r9 = X.C18290x4.A0E()     // Catch:{ all -> 0x04a6 }
            int r5 = r0.A0D     // Catch:{ all -> 0x04a6 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x04a6 }
            java.lang.String r6 = "status"
            r9.put(r6, r5)     // Catch:{ all -> 0x04a6 }
            java.lang.String r5 = "receipt_server_timestamp"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x04a6 }
            r9.put(r5, r3)     // Catch:{ all -> 0x04a6 }
            X.C624134x.A0I(r9, r0)     // Catch:{ all -> 0x04a6 }
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r11)     // Catch:{ all -> 0x04a6 }
            r4.add(r8)     // Catch:{ all -> 0x04a6 }
            int r5 = r4.size()     // Catch:{ all -> 0x04a6 }
            int r5 = r5 + 1
            java.util.ArrayList r8 = X.AnonymousClass002.A0I(r5)     // Catch:{ all -> 0x04a6 }
            java.util.Iterator r11 = r4.iterator()     // Catch:{ all -> 0x04a6 }
        L_0x01be:
            boolean r4 = r11.hasNext()     // Catch:{ all -> 0x04a6 }
            if (r4 == 0) goto L_0x0232
            X.4uZ r5 = X.C18300x5.A0P(r11)     // Catch:{ all -> 0x04a6 }
            X.2sm r4 = r1.A0W     // Catch:{ all -> 0x04a6 }
            long r4 = r4.A07(r5)     // Catch:{ all -> 0x04a6 }
            X.C18280x3.A1K(r8, r4)     // Catch:{ all -> 0x04a6 }
            goto L_0x01be
        L_0x01d2:
            java.lang.String r8 = "message-table-scan"
            java.lang.String r6 = "broadcast-ack"
            r5.A0A(r8, r10, r6)     // Catch:{ all -> 0x04a6 }
            java.lang.String r5 = "CoreMessageStore/updateMessageTableForBroadcastAck falling back to table scan"
            com.whatsapp.util.Log.w((java.lang.String) r5)     // Catch:{ all -> 0x04a6 }
            X.2sC r5 = r1.A0v     // Catch:{ all -> 0x04a6 }
            X.3dV r5 = r5.A05     // Catch:{ all -> 0x04a6 }
            X.4Fq r5 = r5.A04()     // Catch:{ all -> 0x04a6 }
            android.content.ContentValues r8 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x049c }
            java.lang.String r6 = "status"
            int r9 = r0.A0D     // Catch:{ all -> 0x049c }
            X.C18270x1.A0b(r8, r6, r9)     // Catch:{ all -> 0x049c }
            java.lang.String r9 = "receipt_server_timestamp"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x049c }
            r8.put(r9, r3)     // Catch:{ all -> 0x049c }
            java.lang.String r9 = "recipient_count"
            int r4 = r0.A0B     // Catch:{ all -> 0x049c }
            X.C18270x1.A0b(r8, r9, r4)     // Catch:{ all -> 0x049c }
            java.lang.String[] r4 = X.AnonymousClass0x9.A1a()     // Catch:{ all -> 0x049c }
            long r11 = r0.A0K     // Catch:{ all -> 0x049c }
            java.lang.String r9 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x049c }
            r11 = 0
            r4[r13] = r9     // Catch:{ all -> 0x049c }
            boolean r9 = r2.A02     // Catch:{ all -> 0x049c }
            if (r9 == 0) goto L_0x0216
            r11 = 1
        L_0x0216:
            X.C18280x3.A1Q(r4, r11, r10)     // Catch:{ all -> 0x049c }
            java.lang.String r11 = r2.A01     // Catch:{ all -> 0x049c }
            r9 = 2
            X.2sg r22 = X.AnonymousClass3H0.A04(r11, r5, r4, r9)     // Catch:{ all -> 0x049c }
            java.lang.String r24 = "message"
            java.lang.String r25 = "timestamp = ? AND from_me = ? AND key_id = ?"
            java.lang.String r26 = "UPDATE_RCV_BROADCAST_SERVER_SQL"
            r23 = r8
            r27 = r4
            r22.A05(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x049c }
            r5.close()     // Catch:{ all -> 0x04a6 }
            goto L_0x0270
        L_0x0232:
            java.lang.String r4 = r2.A01     // Catch:{ all -> 0x04a6 }
            r8.add(r4)     // Catch:{ all -> 0x04a6 }
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04a6 }
            java.lang.String r4 = "chat_row_id IN "
            r11.append(r4)     // Catch:{ all -> 0x04a6 }
            int r4 = X.AnonymousClass0x9.A03(r8, r10)     // Catch:{ all -> 0x04a6 }
            java.lang.String r4 = X.C57212tH.A00(r4)     // Catch:{ all -> 0x04a6 }
            java.lang.String r5 = X.C18310x6.A0p(r4, r11)     // Catch:{ all -> 0x04a6 }
            java.lang.String r4 = "from_me = 1"
            r11.append(r4)     // Catch:{ all -> 0x04a6 }
            r11.append(r5)     // Catch:{ all -> 0x04a6 }
            java.lang.String r4 = "key_id = ?"
            java.lang.String r25 = X.AnonymousClass000.A0X(r4, r11)     // Catch:{ all -> 0x04a6 }
            r4 = r19
            X.3H0 r4 = (X.AnonymousClass3H0) r4     // Catch:{ all -> 0x04a6 }
            X.2sg r4 = r4.A03     // Catch:{ all -> 0x04a6 }
            java.lang.String r24 = "message"
            java.lang.String[] r27 = X.C18300x5.A1b(r8)     // Catch:{ all -> 0x04a6 }
            java.lang.String r26 = "updateBroadcastAckInMessageTable/UPDATE_MESSAGE"
            r22 = r4
            r23 = r9
            r22.A05(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x04a6 }
        L_0x0270:
            X.313 r4 = r1.A0g     // Catch:{ all -> 0x04a6 }
            X.34U r4 = r4.A06     // Catch:{ all -> 0x04a6 }
            X.0PJ r8 = r4.A03(r0)     // Catch:{ all -> 0x04a6 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04a6 }
            java.lang.String r4 = "SELECT _id FROM message_view"
            r5.append(r4)     // Catch:{ all -> 0x04a6 }
            java.lang.Object r4 = r8.A00     // Catch:{ all -> 0x04a6 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x04a6 }
            java.lang.String r5 = X.AnonymousClass000.A0X(r4, r5)     // Catch:{ all -> 0x04a6 }
            java.lang.Object r4 = r8.A01     // Catch:{ all -> 0x04a6 }
            X.0PJ r8 = X.AnonymousClass0x9.A0G(r5, r4)     // Catch:{ all -> 0x04a6 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x04a6 }
            java.lang.String r4 = "UPDATE message_ephemeral SET expire_timestamp=? + ?*(SELECT duration FROM message_ephemeral t2 WHERE message_ephemeral.message_row_id=t2.message_row_id)"
            r5.append(r4)     // Catch:{ all -> 0x04a6 }
            java.lang.String r4 = " WHERE message_row_id IN ("
            r5.append(r4)     // Catch:{ all -> 0x04a6 }
            java.lang.Object r4 = r8.A00     // Catch:{ all -> 0x04a6 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x04a6 }
            r5.append(r4)     // Catch:{ all -> 0x04a6 }
            java.lang.String r5 = X.AnonymousClass000.A0e(r5)     // Catch:{ all -> 0x04a6 }
            java.lang.Object r4 = r8.A01     // Catch:{ all -> 0x04a6 }
            X.0PJ r9 = X.AnonymousClass0x9.A0G(r5, r4)     // Catch:{ all -> 0x04a6 }
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x04a6 }
            long r4 = r0.A0J     // Catch:{ all -> 0x04a6 }
            X.AnonymousClass0x2.A1Q(r8, r4)     // Catch:{ all -> 0x04a6 }
            r4 = 1000(0x3e8, double:4.94E-321)
            X.AnonymousClass0x2.A1Q(r8, r4)     // Catch:{ all -> 0x04a6 }
            java.lang.Object r4 = r9.A01     // Catch:{ all -> 0x04a6 }
            X.C626936e.A06(r4)     // Catch:{ all -> 0x04a6 }
            java.util.Collection r4 = (java.util.Collection) r4     // Catch:{ all -> 0x04a6 }
            r8.addAll(r4)     // Catch:{ all -> 0x04a6 }
            r4 = r19
            X.3H0 r4 = (X.AnonymousClass3H0) r4     // Catch:{ all -> 0x04a6 }
            X.2sg r5 = r4.A03     // Catch:{ all -> 0x04a6 }
            java.lang.Object r9 = r9.A00     // Catch:{ all -> 0x04a6 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x04a6 }
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ all -> 0x04a6 }
            java.lang.Object[] r8 = r8.toArray(r4)     // Catch:{ all -> 0x04a6 }
            java.lang.String r4 = "UPDATE_TIMESTAMPS_FOR_BROADCAST_MESSAGE_CLONES"
            r5.A0I(r9, r4, r8)     // Catch:{ all -> 0x04a6 }
            goto L_0x0316
        L_0x02dc:
            X.2sC r9 = r1.A0v     // Catch:{ all -> 0x04a6 }
            X.3dV r5 = r9.A05     // Catch:{ all -> 0x04a6 }
            X.4Fq r5 = r5.A04()     // Catch:{ all -> 0x04a6 }
            android.content.ContentValues r8 = X.C18290x4.A0E()     // Catch:{ all -> 0x049c }
            java.lang.String r6 = "status"
            int r10 = r0.A0D     // Catch:{ all -> 0x049c }
            X.C18270x1.A0b(r8, r6, r10)     // Catch:{ all -> 0x049c }
            java.lang.String r10 = "receipt_server_timestamp"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x049c }
            r8.put(r10, r3)     // Catch:{ all -> 0x049c }
            java.lang.String r10 = "recipient_count"
            int r4 = r0.A0B     // Catch:{ all -> 0x049c }
            X.2sg r22 = X.AnonymousClass3H0.A01(r8, r5, r10, r4)     // Catch:{ all -> 0x049c }
            java.lang.String r24 = "message"
            java.lang.String r25 = "chat_row_id = ? AND from_me = ? AND key_id = ?"
            java.lang.String[] r27 = r9.A09(r2)     // Catch:{ all -> 0x049c }
            java.lang.String r26 = "UPDATE_RCV_SERVER_SQL"
            r23 = r8
            r22.A05(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x049c }
            r5.close()     // Catch:{ all -> 0x04a6 }
            r10 = 0
        L_0x0316:
            if (r20 == 0) goto L_0x0344
            X.33e r8 = r1.A1b     // Catch:{ all -> 0x04a6 }
            X.3dV r4 = r8.A03     // Catch:{ all -> 0x04a6 }
            X.4Fq r4 = r4.A04()     // Catch:{ all -> 0x04a6 }
            android.content.ContentValues r5 = X.AnonymousClass0x9.A07(r15)     // Catch:{ all -> 0x048d }
            java.lang.String r9 = "timestamp"
            X.2sg r22 = X.AnonymousClass3H0.A00(r5, r3, r4, r9)     // Catch:{ all -> 0x048d }
            java.lang.String r25 = "jid_row_id=?"
            X.1fY r3 = X.AnonymousClass1fY.A00     // Catch:{ all -> 0x048d }
            java.lang.String[] r27 = r8.A0I(r3)     // Catch:{ all -> 0x048d }
            java.lang.String r3 = "updateMyTimestamp/UPDATE"
            java.lang.String r26 = X.C620233e.A00(r3)     // Catch:{ all -> 0x048d }
            r23 = r5
            r24 = r6
            r22.A05(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x048d }
            r4.close()     // Catch:{ all -> 0x04a6 }
        L_0x0344:
            byte r5 = r0.A1I     // Catch:{ all -> 0x04a6 }
            boolean r3 = X.C627636p.A0I(r5)     // Catch:{ all -> 0x04a6 }
            if (r3 == 0) goto L_0x0354
            X.30m r4 = r1.A0w     // Catch:{ all -> 0x04a6 }
            r3 = r0
            X.1mV r3 = (X.C30471mV) r3     // Catch:{ all -> 0x04a6 }
            r4.A09(r3, r15, r13)     // Catch:{ all -> 0x04a6 }
        L_0x0354:
            if (r14 == 0) goto L_0x0360
            X.2pF r4 = r1.A0y     // Catch:{ all -> 0x04a6 }
            X.3GW r3 = new X.3GW     // Catch:{ all -> 0x04a6 }
            r3.<init>(r0, r10)     // Catch:{ all -> 0x04a6 }
            r4.A00(r3)     // Catch:{ all -> 0x04a6 }
        L_0x0360:
            r3 = 36
            if (r5 != r3) goto L_0x0386
            r11 = r0
            X.1mF r11 = (X.C30311mF) r11     // Catch:{ all -> 0x04a6 }
            X.2rw r10 = r1.A0h     // Catch:{ all -> 0x04a6 }
            X.31A r9 = r10.A01(r11)     // Catch:{ all -> 0x04a6 }
            if (r9 == 0) goto L_0x03bf
            X.2zV r12 = r10.A07     // Catch:{ all -> 0x04a6 }
            X.3Z2 r3 = r9.A0b     // Catch:{ all -> 0x04a6 }
            X.2z0 r8 = r11.A1J     // Catch:{ all -> 0x04a6 }
            boolean r4 = r8.A02     // Catch:{ all -> 0x04a6 }
            if (r4 == 0) goto L_0x03bf
            long r5 = r11.A0J     // Catch:{ all -> 0x04a6 }
            long r3 = r3.ephemeralSettingTimestamp     // Catch:{ all -> 0x04a6 }
            int r14 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r14 > 0) goto L_0x03c3
            int r14 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r14 != 0) goto L_0x03bf
            goto L_0x03ab
        L_0x0386:
            int r3 = r0.A05     // Catch:{ all -> 0x04a6 }
            if (r3 <= 0) goto L_0x03bf
            X.313 r9 = r1.A0g     // Catch:{ all -> 0x04a6 }
            boolean r3 = r2.A02     // Catch:{ all -> 0x04a6 }
            if (r3 == 0) goto L_0x03bf
            X.3dV r3 = r9.A04     // Catch:{ all -> 0x04a6 }
            X.4Fq r8 = r3.A04()     // Catch:{ all -> 0x04a6 }
            long r5 = r0.A0J     // Catch:{ all -> 0x0492 }
            int r3 = r0.A05     // Catch:{ all -> 0x0492 }
            long r3 = X.C18290x4.A0A(r3)     // Catch:{ all -> 0x0492 }
            java.lang.Long r3 = X.AnonymousClass0x9.A0n(r5, r3)     // Catch:{ all -> 0x0492 }
            r0.A0r = r3     // Catch:{ all -> 0x0492 }
            r9.A00(r8, r0)     // Catch:{ all -> 0x0492 }
            r8.close()     // Catch:{ all -> 0x04a6 }
            goto L_0x03bf
        L_0x03ab:
            X.4uZ r4 = X.AnonymousClass2z0.A01(r8)     // Catch:{ all -> 0x04a6 }
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4     // Catch:{ all -> 0x04a6 }
            X.2sr r3 = r12.A00     // Catch:{ all -> 0x04a6 }
            com.whatsapp.jid.PhoneUserJid r3 = X.C56972sr.A04(r3)     // Catch:{ all -> 0x04a6 }
            if (r3 == 0) goto L_0x03c3
            int r3 = r4.compareTo((com.whatsapp.jid.Jid) r3)     // Catch:{ all -> 0x04a6 }
            if (r3 >= 0) goto L_0x03c3
        L_0x03bf:
            r18.A00()     // Catch:{ all -> 0x04a6 }
            goto L_0x03e9
        L_0x03c3:
            X.3Z2 r3 = r9.A0b     // Catch:{ all -> 0x04a6 }
            int r3 = r3.expiration     // Catch:{ all -> 0x04a6 }
            int r8 = r11.A00     // Catch:{ all -> 0x04a6 }
            if (r3 == r8) goto L_0x03d1
            long r3 = r0.A0J     // Catch:{ all -> 0x04a6 }
            r1.A0u(r0, r3)     // Catch:{ all -> 0x04a6 }
            goto L_0x03bf
        L_0x03d1:
            long r3 = r11.A0J     // Catch:{ all -> 0x04a6 }
            int r6 = r11.A04     // Catch:{ all -> 0x04a6 }
            java.lang.Boolean r5 = r11.A0o     // Catch:{ all -> 0x04a6 }
            r22 = r10
            r23 = r9
            r24 = r5
            r25 = r8
            r26 = r13
            r27 = r6
            r28 = r3
            r22.A05(r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x04a6 }
            goto L_0x03bf
        L_0x03e9:
            r18.close()     // Catch:{ all -> 0x04b0 }
            r19.close()
            X.34w r3 = r0.A0P
            if (r3 == 0) goto L_0x0439
            X.1S4 r3 = r3.A0A
            if (r3 == 0) goto L_0x0439
            java.lang.String r5 = r3.A0K()
            if (r5 == 0) goto L_0x0439
            X.8EA r4 = r1.A1l
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 != 0) goto L_0x0439
            X.1RD r3 = r4.A00
            X.4Fq r10 = r3.A0C()
            r3 = r10
            X.3H0 r3 = (X.AnonymousClass3H0) r3     // Catch:{ all -> 0x0497 }
            X.2sg r9 = r3.A03     // Catch:{ all -> 0x0497 }
            java.lang.String r8 = "tmp_transactions"
            java.lang.String r6 = "tmp_id=?"
            java.lang.String[] r4 = new java.lang.String[r15]     // Catch:{ all -> 0x0497 }
            r4[r13] = r5     // Catch:{ all -> 0x0497 }
            java.lang.String r3 = "removePaymentTransactionTmpInfo/DELETE_SCHEMA_PAY_TRANSACTIONS_TMP"
            int r3 = r9.A07(r8, r6, r3, r4)     // Catch:{ all -> 0x0497 }
            if (r3 != r15) goto L_0x042d
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0497 }
            java.lang.String r3 = "PAY: PaymentStore removePaymentTransactionTmpInfo deleted: "
            X.C18260x0.A0q(r3, r5, r4)     // Catch:{ all -> 0x0497 }
            goto L_0x0436
        L_0x042d:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0497 }
            java.lang.String r3 = "PAY: PaymentStore removePaymentTransactionTmpInfo could not delete: "
            X.C18260x0.A0t(r3, r5, r4)     // Catch:{ all -> 0x0497 }
        L_0x0436:
            r10.close()
        L_0x0439:
            if (r21 == 0) goto L_0x044c
            boolean r2 = r2.A02
            if (r2 == 0) goto L_0x044c
            boolean r2 = X.C627636p.A0m(r0)
            if (r2 == 0) goto L_0x044c
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.A0j(r0)
        L_0x044c:
            X.2ga r4 = r1.A0d
            long r2 = X.C18310x6.A0A(r16)
            java.lang.String r0 = "CoreMessageStore/updateMessageReceivedByServerInBackground"
            r4.A02(r0, r2)
            goto L_0x0067
        L_0x0459:
            android.content.ContentValues r4 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0488 }
            java.lang.String r1 = r7.A03     // Catch:{ all -> 0x0488 }
            java.lang.String r0 = "counter_abuse_token"
            if (r1 == 0) goto L_0x0480
            r4.put(r0, r1)     // Catch:{ all -> 0x0488 }
        L_0x0466:
            r0 = r2
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0488 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0488 }
            java.lang.String r5 = "message_text"
            java.lang.String r6 = "message_row_id = ?"
            java.lang.String[] r8 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0488 }
            long r0 = r7.A1L     // Catch:{ all -> 0x0488 }
            X.C18260x0.A1X(r8, r0)     // Catch:{ all -> 0x0488 }
            java.lang.String r7 = "UPDATE_CONTENT_BINDING_SQL"
            r3.A05(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0488 }
            goto L_0x0484
        L_0x0480:
            r4.putNull(r0)     // Catch:{ all -> 0x0488 }
            goto L_0x0466
        L_0x0484:
            r2.close()
            return
        L_0x0488:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x04b5 }
            throw r1
        L_0x048d:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x04a1 }
            goto L_0x04a5
        L_0x0492:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x04a1 }
            goto L_0x04a5
        L_0x0497:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x04b5 }
            throw r1
        L_0x049c:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x04a1 }
            goto L_0x04a5
        L_0x04a1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x04a6 }
        L_0x04a5:
            throw r1     // Catch:{ all -> 0x04a6 }
        L_0x04a6:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x04ab }
            goto L_0x04af
        L_0x04ab:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x04b0 }
        L_0x04af:
            throw r1     // Catch:{ all -> 0x04b0 }
        L_0x04b0:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x04b5 }
            throw r1
        L_0x04b5:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70783b3.run():void");
    }
}
