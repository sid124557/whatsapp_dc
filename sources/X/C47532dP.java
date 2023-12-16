package X;

/* renamed from: X.2dP  reason: invalid class name and case insensitive filesystem */
public class C47532dP {
    public final C116985rC A00;
    public final AnonymousClass4F4 A01;
    public final C66543Lv A02;
    public final AnonymousClass2R5 A03;
    public final AnonymousClass30G A04;
    public final C55672qj A05;
    public final C56412rw A06;
    public final C620333f A07;
    public final C50562iN A08;
    public final C620133d A09;
    public final AnonymousClass2TN A0A;
    public final AnonymousClass33Y A0B;
    public final C55892r5 A0C;
    public final C55832qz A0D;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v93, resolved type: X.1nL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v113, resolved type: X.1nL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v114, resolved type: X.1nL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v115, resolved type: X.1nL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v116, resolved type: X.1nL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v117, resolved type: X.1nL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v121, resolved type: X.1nL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v123, resolved type: X.1nL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v130, resolved type: X.1nL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v131, resolved type: X.1nL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v134, resolved type: X.1nL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v137, resolved type: X.1nL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v141, resolved type: X.1nM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v142, resolved type: X.1nK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v143, resolved type: X.1nI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v144, resolved type: X.1nI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v145, resolved type: X.1nJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v146, resolved type: X.1nJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v147, resolved type: X.1nJ} */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0a44, code lost:
        if (r10 > 0) goto L_0x0a46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0c45, code lost:
        if (r3 == 3) goto L_0x0c47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0da5, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x0da9, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x0e0f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:594:0x0e10, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:0x0e13, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0183, code lost:
        if (r6 == null) goto L_0x0187;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:486:0x0c31, B:539:0x0d23] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C624134x r55, X.AnonymousClass3ST r56) {
        /*
            r54 = this;
            r6 = r56
            r0 = r55
            java.lang.String r2 = r6.A0i
            java.lang.String r1 = "peer"
            boolean r2 = r1.equals(r2)
            r1 = r54
            if (r2 == 0) goto L_0x0d0a
            X.2TN r12 = r1.A0A
            if (r55 == 0) goto L_0x120e
            com.whatsapp.jid.DeviceJid r2 = r0.A1R
            if (r2 == 0) goto L_0x00ea
            X.2sr r1 = r12.A00
            boolean r1 = X.C56972sr.A09(r1, r2)
            if (r1 == 0) goto L_0x00ea
            boolean r1 = r0 instanceof X.C30851nJ
            if (r1 == 0) goto L_0x0afe
            X.1nJ r0 = (X.C30851nJ) r0
            java.lang.String r1 = "PeerMessageHandler/handleKeyShareMessage"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.2sZ r4 = r12.A05     // Catch:{ 1Sf -> 0x00d5 }
            com.whatsapp.jid.DeviceJid r7 = r0.A1R     // Catch:{ 1Sf -> 0x00d5 }
            r9 = 0
            if (r7 == 0) goto L_0x0b26
            java.util.HashMap r2 = r0.A1v()     // Catch:{ 1Sf -> 0x00d5 }
            java.util.Collection r1 = r2.values()     // Catch:{ 1Sf -> 0x00d5 }
            java.util.HashSet r3 = X.AnonymousClass0x9.A15(r1)     // Catch:{ 1Sf -> 0x00d5 }
            r1 = 0
            r3.remove(r1)     // Catch:{ 1Sf -> 0x00d5 }
            r4.A09(r3)     // Catch:{ 1Sf -> 0x00d5 }
            java.util.Set r6 = r2.keySet()     // Catch:{ 1Sf -> 0x00d5 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ 1Sf -> 0x00d5 }
            java.lang.String r1 = "SyncdKeyManager/handleAppStateSyncKeyShareMessage syncdKeyIds = "
            X.C18260x0.A1R(r2, r1, r6)     // Catch:{ 1Sf -> 0x00d5 }
            int r2 = r6.size()     // Catch:{ 1Sf -> 0x00d5 }
            int r1 = r3.size()     // Catch:{ 1Sf -> 0x00d5 }
            if (r2 != r1) goto L_0x005e
            r9 = 1
        L_0x005e:
            X.2rl r5 = r4.A08     // Catch:{ 1Sf -> 0x00d5 }
            r1 = 39
            java.util.List r1 = r5.A04(r1)     // Catch:{ 1Sf -> 0x00d5 }
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()     // Catch:{ 1Sf -> 0x00d5 }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ 1Sf -> 0x00d5 }
        L_0x006e:
            boolean r1 = r8.hasNext()     // Catch:{ 1Sf -> 0x00d5 }
            if (r1 == 0) goto L_0x0096
            java.lang.Object r2 = r8.next()     // Catch:{ 1Sf -> 0x00d5 }
            X.1nI r2 = (X.C30841nI) r2     // Catch:{ 1Sf -> 0x00d5 }
            if (r9 != 0) goto L_0x0084
            com.whatsapp.jid.DeviceJid r1 = r2.A00     // Catch:{ 1Sf -> 0x00d5 }
            boolean r1 = r7.equals(r1)     // Catch:{ 1Sf -> 0x00d5 }
            if (r1 == 0) goto L_0x006e
        L_0x0084:
            java.util.Set r1 = r2.A00     // Catch:{ 1Sf -> 0x00d5 }
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)     // Catch:{ 1Sf -> 0x00d5 }
            boolean r1 = r6.equals(r1)     // Catch:{ 1Sf -> 0x00d5 }
            if (r1 == 0) goto L_0x006e
            long r1 = r2.A1L     // Catch:{ 1Sf -> 0x00d5 }
            X.AnonymousClass0x2.A1Q(r3, r1)     // Catch:{ 1Sf -> 0x00d5 }
            goto L_0x006e
        L_0x0096:
            r5.A06(r3)     // Catch:{ 1Sf -> 0x00d5 }
            X.2WC r1 = r4.A0A     // Catch:{ 1Sf -> 0x00d5 }
            java.util.Set r3 = r1.A00()     // Catch:{ 1Sf -> 0x00d5 }
            boolean r1 = r3.isEmpty()     // Catch:{ 1Sf -> 0x00d5 }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x00c2
            java.util.Set r1 = r4.A04()     // Catch:{ 1Sf -> 0x00d5 }
            boolean r1 = r1.isEmpty()     // Catch:{ 1Sf -> 0x00d5 }
            if (r1 == 0) goto L_0x00c2
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ 1Sf -> 0x00d5 }
            java.lang.String r1 = "SyncdKeyManager/isKeyMissingOnAllClients: key(s) missing on all the clients for collection(s): "
            X.C18260x0.A1Q(r2, r1, r3)     // Catch:{ 1Sf -> 0x00d5 }
            r2 = 30
            r1 = 0
            X.1Sf r1 = X.C23341Sf.A00(r1, r2)     // Catch:{ 1Sf -> 0x00d5 }
            throw r1     // Catch:{ 1Sf -> 0x00d5 }
        L_0x00c2:
            java.lang.String r1 = "PeerMessageHandler/handleKeyShareMessage trySync"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 1Sf -> 0x00d5 }
            X.4FS r3 = r12.A07     // Catch:{ 1Sf -> 0x00d5 }
            X.3Gp r2 = r12.A04     // Catch:{ 1Sf -> 0x00d5 }
            java.util.Objects.requireNonNull(r2)     // Catch:{ 1Sf -> 0x00d5 }
            r1 = 41
            X.C70013Zn.A01(r3, r2, r1)     // Catch:{ 1Sf -> 0x00d5 }
            goto L_0x0b26
        L_0x00d5:
            r1 = move-exception
            X.3Gp r2 = r12.A04     // Catch:{ all -> 0x00e3 }
            int r1 = r1.errorCode     // Catch:{ all -> 0x00e3 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00e3 }
            r2.A0J(r1)     // Catch:{ all -> 0x00e3 }
            goto L_0x0b26
        L_0x00e3:
            r2 = move-exception
            X.33Y r1 = r12.A06
            r1.A04(r0)
            throw r2
        L_0x00ea:
            java.lang.String r1 = "PeerMessageHandler/ received peer message from unknown device"
            goto L_0x010a
        L_0x00ed:
            boolean r1 = r0 instanceof X.C30891nN
            if (r1 == 0) goto L_0x0343
            X.1nN r0 = (X.C30891nN) r0
            java.lang.String r1 = "PeerMessageHandler/handleNonMessageDataRequestMessage"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.3Fe r1 = r12.A01
            int r3 = r0.A00
            com.whatsapp.jid.DeviceJid r9 = r0.A1R
            if (r9 != 0) goto L_0x010f
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "NonMessageDataRequestManager/handleNonMessageDataRequestMessage no remoteDeviceJid, requestType = "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r1, r2, r3)
        L_0x010a:
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x0b26
        L_0x010f:
            if (r3 != 0) goto L_0x02a4
            X.1VX r4 = r1.A0C
            r3 = 1829(0x725, float:2.563E-42)
            X.2vE r2 = X.C58422vE.A02
            int r3 = r4.A0O(r2, r3)
            r2 = 4
            if (r3 < r2) goto L_0x02a0
            X.2z0 r2 = r0.A1J
            java.lang.String r5 = r2.A01
            java.util.Set r4 = r0.A01
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "NonMessageDataRequestManager/handleStickerReUploadRequest handle sticker upload request, id="
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = "; size="
            X.C18290x4.A1P(r2, r3, r4)
            java.lang.String r2 = "; remoteDeviceJid"
            X.C18260x0.A1R(r3, r2, r9)
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L_0x0b26
            X.2cp r10 = new X.2cp
            r10.<init>(r1, r9, r5, r4)
            X.4FS r2 = r1.A0J
            r9 = 0
            X.3dI r8 = new X.3dI
            r8.<init>(r2, r9)
            java.util.Set r2 = r10.A07
            java.util.Iterator r18 = r2.iterator()
        L_0x0153:
            boolean r2 = r18.hasNext()
            if (r2 == 0) goto L_0x0b26
            java.lang.String r7 = X.AnonymousClass001.A0m(r18)
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 == 0) goto L_0x0174
            java.lang.String r2 = "NonMessageDataRequestManager/uploadSticker/empty file hash"
            com.whatsapp.util.Log.e((java.lang.String) r2)
        L_0x0168:
            X.23E r3 = X.AnonymousClass23E.NOT_FOUND
            r6 = 0
        L_0x016b:
            X.3cN r2 = new X.3cN
            r2.<init>(r10, r3, r6, r7)
            r8.execute(r2)
            goto L_0x0153
        L_0x0174:
            X.1sO r3 = r1.A0I
            monitor-enter(r3)
            X.0Qw r2 = r3.A00     // Catch:{ all -> 0x0c0d }
            if (r2 != 0) goto L_0x017c
            goto L_0x0186
        L_0x017c:
            java.lang.Object r6 = r2.A04(r7)     // Catch:{ all -> 0x0c0d }
            X.39M r6 = (X.AnonymousClass39M) r6     // Catch:{ all -> 0x0c0d }
            monitor-exit(r3)
            if (r6 != 0) goto L_0x01a7
            goto L_0x0187
        L_0x0186:
            monitor-exit(r3)
        L_0x0187:
            X.8qC r2 = r1.A0K
            X.1el r2 = X.AnonymousClass0x9.A0a(r2)
            java.util.List r2 = r2.A0D()
            java.util.Iterator r3 = r2.iterator()
        L_0x0195:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x020e
            X.39M r6 = X.AnonymousClass0x7.A0b(r3)
            java.lang.String r2 = r6.A0D
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0195
        L_0x01a7:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "rmr_sticker_upload_job_id_"
            java.lang.String r2 = X.AnonymousClass000.A0V(r2, r7, r3)
            byte[] r2 = r2.getBytes()
            java.util.UUID r2 = java.util.UUID.nameUUIDFromBytes(r2)
            java.lang.String r5 = r2.toString()
            X.2YS r4 = r1.A0F
            X.2qx r2 = r4.A01
            X.5LM r13 = r2.A02(r5, r9)
            java.lang.String r11 = "; jobId="
            if (r13 == 0) goto L_0x0221
            r16 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r13.A05
            long r14 = X.AnonymousClass0x9.A05(r2)
            int r2 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r2 >= 0) goto L_0x01e9
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "NonMessageDataRequestManager/uploadSticker upload within one day, hash"
            r3.append(r2)
            r3.append(r7)
            X.C18260x0.A0q(r11, r5, r3)
        L_0x01e6:
            X.23E r3 = X.AnonymousClass23E.SUCCESS
            goto L_0x016b
        L_0x01e9:
            long r16 = java.lang.System.currentTimeMillis()
            long r2 = r13.A04
            long r16 = r16 - r2
            r14 = 86400000(0x5265c00, double:4.2687272E-316)
            int r2 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r2 >= 0) goto L_0x0221
            int r3 = r13.A01
            r2 = 15
            if (r3 < r2) goto L_0x0221
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "NonMessageDataRequestManager/uploadSticker has reached the maximum retry in a day, hash="
            r3.append(r2)
            r3.append(r7)
            X.C18260x0.A0t(r11, r5, r3)
            goto L_0x01e6
        L_0x020e:
            X.2pZ r2 = r1.A0H
            X.39M r6 = r2.A00(r7)
            if (r6 != 0) goto L_0x01a7
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "NonMessageDataRequestManager/uploadSticker not find the sticker. hash="
            X.C18260x0.A0t(r2, r7, r3)
            goto L_0x0168
        L_0x0221:
            X.2rq r2 = r1.A01
            java.io.File r13 = r2.A02(r7)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "NonMessageDataRequestManager/uploadSticker start upload the sticker, hash="
            r3.append(r2)
            r3.append(r7)
            X.C18260x0.A0s(r11, r5, r3)
            r2 = 32
            byte[] r2 = new byte[r2]
            X.8qC r3 = r1.A0L
            java.lang.Object r3 = r3.get()
            java.util.Random r3 = (java.util.Random) r3
            r3.nextBytes(r2)
            r3 = 1
            X.7iO r11 = new X.7iO
            r11.<init>(r9, r9, r3)
            X.38t r23 = X.C633138t.A0b
            android.net.Uri r19 = android.net.Uri.fromFile(r13)
            r21 = 0
            r29 = 1
            X.2sH r3 = r1.A07
            long r13 = r3.A0H()
            X.32B r3 = new X.32B
            r3.<init>(r2, r13)
            r27 = r9
            r28 = r9
            r24 = r21
            r25 = r5
            r26 = r9
            r20 = r3
            r22 = r11
            X.32J r3 = X.AnonymousClass32J.A00(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.33c r11 = r1.A0E
            X.3QO r5 = r11.A04(r3, r9)
            java.lang.String r3 = "mms"
            r5.A0W = r3
            X.5LM r3 = r5.A0L
            r4.A00(r3)
            X.3X5 r3 = new X.3X5
            r19 = r3
            r20 = r10
            r21 = r1
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r2
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r5.A04(r3, r8)
            java.lang.String r2 = "rmr upload sticker"
            r11.A0E(r5, r2)
            goto L_0x0153
        L_0x02a0:
            java.lang.String r1 = "NonMessageDataRequestManager/handleNonMessageDataRequestMessage abprop not enabled"
            goto L_0x05d9
        L_0x02a4:
            r2 = 1
            if (r3 != r2) goto L_0x05c2
            X.2z0 r2 = r0.A1J
            java.lang.String r6 = r2.A01
            X.1VX r4 = r1.A0C
            r3 = 1829(0x725, float:2.563E-42)
            X.2vE r2 = X.C58422vE.A02
            int r3 = r4.A0O(r2, r3)
            r2 = 3
            boolean r4 = X.C18280x3.A1U(r3, r2)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "NonMessageDataRequestManager/handleRecentStickerInitRequest jid="
            r3.append(r2)
            r3.append(r9)
            java.lang.String r2 = "; enabled="
            X.C18260x0.A1E(r2, r3, r4)
            if (r4 == 0) goto L_0x0b26
            X.2RU r2 = new X.2RU
            r2.<init>(r9)
            r4 = 1
            r2.A03 = r4
            X.30s r13 = r1.A0G
            r17 = 0
            com.whatsapp.jid.DeviceJid r5 = r2.A04
            X.2jp r3 = r2.A00
            boolean r9 = r2.A02
            boolean r8 = r2.A01
            X.2sr r2 = r13.A02
            boolean r2 = r2.A0Y()
            if (r2 == 0) goto L_0x0304
            java.lang.String r2 = "history-sync-send-methods/sendNonBlockingDataMessages no support for companionMode"
            com.whatsapp.util.Log.d((java.lang.String) r2)
        L_0x02ee:
            X.2dx r1 = r1.A03
            r16 = 0
            r18 = r16
            r19 = r16
            r20 = r16
            r21 = r16
            r17 = r16
            r13 = r1
            r14 = r6
            r15 = r4
            r13.A01(r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0b26
        L_0x0304:
            X.1A0 r2 = X.AnonymousClass0x7.A0Z()     // Catch:{ Exception -> 0x033c }
            X.23J r7 = X.AnonymousClass23J.NON_BLOCKING_DATA     // Catch:{ Exception -> 0x033c }
            r2.A0D(r7)     // Catch:{ Exception -> 0x033c }
            r13.A09(r2)     // Catch:{ Exception -> 0x033c }
            if (r9 == 0) goto L_0x0315
            r13.A07(r2)     // Catch:{ Exception -> 0x033c }
        L_0x0315:
            if (r8 == 0) goto L_0x031a
            r13.A08(r2)     // Catch:{ Exception -> 0x033c }
        L_0x031a:
            r23 = 0
            r19 = 0
            r20 = 5
            r21 = 100
            r25 = -1
            r29 = r25
            r33 = r23
            r35 = r25
            r37 = r19
            r18 = r17
            r22 = r19
            r27 = r25
            r31 = r23
            r14 = r3
            r15 = r5
            r16 = r2
            r13.A01(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r27, r29, r31, r33, r35, r37)     // Catch:{ Exception -> 0x033c }
            goto L_0x02ee
        L_0x033c:
            r3 = move-exception
            java.lang.String r2 = "history-sync-send-methods/sendNonBlockingDataMessages: error"
            com.whatsapp.util.Log.e(r2, r3)
            goto L_0x02ee
        L_0x0343:
            boolean r1 = r0 instanceof X.C30871nL
            if (r1 == 0) goto L_0x0b26
            X.1nL r0 = (X.C30871nL) r0
            java.lang.String r1 = "PeerMessageHandler/handleNonMessageDataRequestResponseMessage"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            boolean r1 = r0 instanceof X.AnonymousClass1OS
            if (r1 == 0) goto L_0x0ae2
            X.3Fe r8 = r12.A01
            r7 = r0
            X.1OS r7 = (X.AnonymousClass1OS) r7
            X.1VX r3 = r8.A0C
            r2 = 2155(0x86b, float:3.02E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r1 = r3.A0Y(r1, r2)
            if (r1 == 0) goto L_0x05bf
            X.2sH r1 = r8.A07
            long r3 = r1.A0H()
            java.util.Map r1 = r7.A00
            java.util.Iterator r22 = X.AnonymousClass000.A0q(r1)
            r6 = 0
            r21 = 0
            r20 = 0
            r19 = 0
            r18 = 0
        L_0x0378:
            boolean r1 = r22.hasNext()
            if (r1 == 0) goto L_0x0583
            java.util.Map$Entry r10 = X.AnonymousClass001.A0w(r22)
            java.lang.String r9 = X.C18310x6.A0q(r10)
            java.lang.Object r1 = r10.getValue()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r2 = r1.first
            X.23E r1 = X.AnonymousClass23E.SUCCESS
            if (r2 != r1) goto L_0x0478
            int r21 = r21 + 1
            java.lang.Object r1 = r10.getValue()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r2 = r1.second
            X.1EA r2 = (X.AnonymousClass1EA) r2
            if (r2 != 0) goto L_0x03aa
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "NonMessageDataRequestManager/handleNonMessageDataRequestResponseMessage no sticker for successful fileHash="
            X.C18260x0.A0r(r1, r9, r2)
            goto L_0x0378
        L_0x03aa:
            X.39M r10 = new X.39M
            r10.<init>()
            int r5 = r2.bitField0_
            r1 = r5 & 1
            if (r1 == 0) goto L_0x03b9
            java.lang.String r1 = r2.url_
            r10.A0G = r1
        L_0x03b9:
            r1 = r5 & 2
            boolean r1 = X.AnonymousClass000.A1S(r1)
            r5 = 2
            if (r1 == 0) goto L_0x03ca
            X.8Lq r1 = r2.fileSha256_
            java.lang.String r1 = X.C18320x8.A0d(r1, r5)
            r10.A0D = r1
        L_0x03ca:
            int r1 = r2.bitField0_
            r1 = r1 & 4
            if (r1 == 0) goto L_0x03d8
            X.8Lq r1 = r2.fileEncSha256_
            java.lang.String r1 = X.C18320x8.A0d(r1, r5)
            r10.A08 = r1
        L_0x03d8:
            int r1 = r2.bitField0_
            r1 = r1 & 8
            if (r1 == 0) goto L_0x03eb
            X.8Lq r1 = r2.mediaKey_
            byte[] r5 = r1.A07()
            r1 = 1
            java.lang.String r1 = android.util.Base64.encodeToString(r5, r1)
            r10.A0B = r1
        L_0x03eb:
            int r5 = r2.bitField0_
            r1 = r5 & 16
            if (r1 == 0) goto L_0x03f5
            java.lang.String r1 = r2.mimetype_
            r10.A0C = r1
        L_0x03f5:
            int r1 = r2.height_
            r10.A02 = r1
            int r1 = r2.width_
            r10.A03 = r1
            r1 = r5 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0405
            java.lang.String r1 = r2.directPath_
            r10.A06 = r1
        L_0x0405:
            long r1 = r2.fileLength_
            int r5 = (int) r1
            r10.A00 = r5
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "NonMessageDataRequestManager/handleNonMessageDataRequestResponseMessage success fileHash="
            r2.append(r1)
            java.lang.String r1 = r10.A0D
            X.C18260x0.A1J(r2, r1)
            X.3Gp r13 = r8.A06
            if (r13 == 0) goto L_0x0425
            java.lang.String r1 = r10.A0D
            if (r1 != 0) goto L_0x0431
            java.lang.String r1 = "SyncManager/onReceiveRmrFavoriteResponse receive empty fileHash"
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x0425:
            X.2wL r1 = r8.A0B
            X.C626936e.A00()
            X.1RE r1 = r1.A00
            X.4Fq r5 = r1.A0C()
            goto L_0x0460
        L_0x0431:
            X.2j3 r2 = r13.A0c
            java.lang.String r1 = "favoriteSticker"
            X.2sc r1 = r2.A00(r1)
            if (r1 == 0) goto L_0x0425
            boolean r1 = r13.A0Q()
            if (r1 == 0) goto L_0x0425
            X.4FS r11 = r13.A0h
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "rmrFavoriteStickerResponse_"
            r2.append(r1)
            java.lang.String r1 = r10.A0D
            java.lang.String r5 = X.AnonymousClass000.A0X(r1, r2)
            r2 = 34
            X.3a6 r1 = new X.3a6
            r1.<init>(r13, r2, r10)
            r11.BkN(r1, r5)
            int r20 = r20 + 1
            goto L_0x0425
        L_0x0460:
            r1 = r5
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x0c30 }
            X.2sg r13 = r1.A03     // Catch:{ all -> 0x0c30 }
            java.lang.String r11 = "rmr_response_error"
            java.lang.String r10 = "file_key = ?  AND rmr_source =? "
            java.lang.String[] r2 = X.AnonymousClass0x7.A1a(r9, r6)     // Catch:{ all -> 0x0c30 }
            X.C18270x1.A1P(r2, r6)     // Catch:{ all -> 0x0c30 }
            java.lang.String r1 = "RequestMediaReUploadResponseErrorStore.deleteResponseError"
            r13.A07(r11, r10, r1, r2)     // Catch:{ all -> 0x0c30 }
            goto L_0x055b
        L_0x0478:
            X.23E r1 = X.AnonymousClass23E.GENERAL_ERROR
            java.lang.String r5 = "; result="
            if (r2 != r1) goto L_0x0560
            int r19 = r19 + 1
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "NonMessageDataRequestManager/handleNonMessageDataRequestResponseMessage general fail fileHash="
            X.AnonymousClass001.A1K(r1, r9, r5, r2)
            java.lang.Object r1 = r10.getValue()
            X.C18260x0.A0n(r1, r2)
            com.whatsapp.jid.DeviceJid r1 = r7.A1R
            X.2wL r2 = r8.A0B
            if (r1 == 0) goto L_0x04a9
            int r1 = r1.getDevice()
        L_0x049a:
            X.32I r11 = new X.32I
            r11.<init>(r1, r9, r3)
            X.C626936e.A00()
            X.1RE r1 = r2.A00
            X.4Fq r5 = r1.A0C()
            goto L_0x04ab
        L_0x04a9:
            r1 = 0
            goto L_0x049a
        L_0x04ab:
            X.3Yo r17 = r5.Axl()     // Catch:{ all -> 0x0c30 }
            java.lang.String r13 = r11.A04     // Catch:{ all -> 0x0c26 }
            int r9 = r11.A02     // Catch:{ all -> 0x0c26 }
            X.C626936e.A00()     // Catch:{ all -> 0x0c26 }
            X.4GK r16 = r1.get()     // Catch:{ all -> 0x0c26 }
            r1 = r16
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x0c1c }
            X.2sg r14 = r1.A03     // Catch:{ all -> 0x0c1c }
            java.lang.String r10 = "SELECT file_key, rmr_source, failure_count, response_device_id, last_fetch_timestamp FROM rmr_response_error WHERE file_key = ?  AND rmr_source =?  AND response_device_id =? "
            java.lang.String[] r2 = X.AnonymousClass0x9.A1a()     // Catch:{ all -> 0x0c1c }
            r2[r6] = r13     // Catch:{ all -> 0x0c1c }
            X.C18270x1.A1P(r2, r6)     // Catch:{ all -> 0x0c1c }
            X.C18280x3.A1O(r2, r9)     // Catch:{ all -> 0x0c1c }
            java.lang.String r1 = "RequestMediaReUploadResponseErrorStore.GET_RESPONSE_FROM_FILE_ID"
            android.database.Cursor r2 = r14.A0E(r10, r1, r2)     // Catch:{ all -> 0x0c1c }
            boolean r1 = r2.moveToNext()     // Catch:{ all -> 0x0c10 }
            if (r1 == 0) goto L_0x04e5
            X.32I r15 = X.AnonymousClass32I.A00(r2)     // Catch:{ all -> 0x0c10 }
            r2.close()     // Catch:{ all -> 0x0c1c }
            r16.close()     // Catch:{ all -> 0x0c26 }
            goto L_0x04ec
        L_0x04e5:
            r2.close()     // Catch:{ all -> 0x0c1c }
            r16.close()     // Catch:{ all -> 0x0c26 }
            r15 = 0
        L_0x04ec:
            r2 = 1
            if (r15 == 0) goto L_0x04f2
            int r1 = r15.A00     // Catch:{ all -> 0x0c26 }
            int r2 = r2 + r1
        L_0x04f2:
            r11.A00 = r2     // Catch:{ all -> 0x0c26 }
            if (r15 == 0) goto L_0x0518
            java.lang.String r14 = r15.A04     // Catch:{ all -> 0x0c26 }
            int r10 = r15.A03     // Catch:{ all -> 0x0c26 }
            int r2 = r15.A02     // Catch:{ all -> 0x0c26 }
            r1 = r5
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x0c26 }
            X.2sg r15 = r1.A03     // Catch:{ all -> 0x0c26 }
            r1 = 3
            java.lang.String[] r14 = X.C18300x5.A1a(r14, r1)     // Catch:{ all -> 0x0c26 }
            r1 = 1
            X.C18280x3.A1Q(r14, r10, r1)     // Catch:{ all -> 0x0c26 }
            r1 = 2
            X.C18280x3.A1Q(r14, r2, r1)     // Catch:{ all -> 0x0c26 }
            java.lang.String r10 = "RequestMediaReUploadResponseErrorStore.deleteResponseErrorWithDeviceId"
            java.lang.String r2 = "rmr_response_error"
            java.lang.String r1 = "file_key = ?  AND rmr_source =?  AND response_device_id =? "
            r15.A07(r2, r1, r10, r14)     // Catch:{ all -> 0x0c26 }
        L_0x0518:
            r1 = 5
            android.content.ContentValues r10 = X.AnonymousClass0x9.A07(r1)     // Catch:{ all -> 0x0c26 }
            java.lang.String r1 = "file_key"
            r10.put(r1, r13)     // Catch:{ all -> 0x0c26 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0c26 }
            java.lang.String r1 = "rmr_source"
            r10.put(r1, r2)     // Catch:{ all -> 0x0c26 }
            int r1 = r11.A00     // Catch:{ all -> 0x0c26 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0c26 }
            java.lang.String r1 = "failure_count"
            r10.put(r1, r2)     // Catch:{ all -> 0x0c26 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0c26 }
            java.lang.String r1 = "response_device_id"
            r10.put(r1, r2)     // Catch:{ all -> 0x0c26 }
            long r1 = r11.A01     // Catch:{ all -> 0x0c26 }
            java.lang.Long r2 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0c26 }
            java.lang.String r1 = "last_fetch_timestamp"
            X.2sg r9 = X.AnonymousClass3H0.A00(r10, r2, r5, r1)     // Catch:{ all -> 0x0c26 }
            java.lang.String r2 = "RequestMediaReUploadResponseErrorStore.insertResponseError"
            java.lang.String r1 = "rmr_response_error"
            r9.A08(r1, r2, r10)     // Catch:{ all -> 0x0c26 }
            r17.A00()     // Catch:{ all -> 0x0c26 }
            r17.close()     // Catch:{ all -> 0x0c30 }
        L_0x055b:
            r5.close()
            goto L_0x0378
        L_0x0560:
            int r18 = r18 + 1
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "NonMessageDataRequestManager/handleNonMessageDataRequestResponseMessage non-retry fail fileHash="
            X.AnonymousClass001.A1K(r1, r9, r5, r2)
            java.lang.Object r1 = r10.getValue()
            X.C18260x0.A0n(r1, r2)
            com.whatsapp.jid.DeviceJid r1 = r7.A1R
            X.2wL r2 = r8.A0B
            if (r1 == 0) goto L_0x0581
            int r1 = r1.getDevice()
        L_0x057c:
            r2.A00(r9, r6, r1)
            goto L_0x0378
        L_0x0581:
            r1 = 0
            goto L_0x057c
        L_0x0583:
            X.2dx r5 = r8.A03
            java.util.Map r1 = r7.A00
            int r4 = r1.size()
            java.lang.String r3 = r7.A00
            X.1aB r2 = new X.1aB
            r2.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r2.A00 = r1
            java.lang.Long r1 = X.AnonymousClass0x9.A0m(r4)
            r2.A03 = r1
            java.lang.Long r1 = X.AnonymousClass0x9.A0m(r21)
            r2.A05 = r1
            java.lang.Long r1 = X.AnonymousClass0x9.A0m(r20)
            r2.A04 = r1
            java.lang.Long r1 = X.AnonymousClass0x9.A0m(r19)
            r2.A01 = r1
            java.lang.Long r1 = X.AnonymousClass0x9.A0m(r18)
            r2.A02 = r1
            r2.A06 = r3
            X.4FV r1 = r5.A00
            r1.BhD(r2)
            goto L_0x0b26
        L_0x05bf:
            java.lang.String r1 = "NonMessageDataRequestManager/handleNonMessageDataRequestResponseMessage not enabled"
            goto L_0x05d9
        L_0x05c2:
            r2 = 2
            if (r3 != r2) goto L_0x05de
            X.2z0 r2 = r0.A1J
            java.lang.String r5 = r2.A01
            java.util.Set r4 = r0.A01
            X.1VX r6 = r1.A0C
            r3 = 2156(0x86c, float:3.021E-42)
            X.2vE r2 = X.C58422vE.A02
            boolean r2 = r6.A0Y(r2, r3)
            if (r2 != 0) goto L_0x0840
            java.lang.String r1 = "NonMessageDataRequestManager/handleLinkPreviewRequest abprop disabled"
        L_0x05d9:
            com.whatsapp.util.Log.w((java.lang.String) r1)
            goto L_0x0b26
        L_0x05de:
            r2 = 3
            if (r3 != r2) goto L_0x0619
            X.2z0 r2 = r0.A1J
            java.lang.String r2 = r2.A01
            r32 = r2
            java.util.Set r5 = r0.A01
            long r2 = r0.A0K
            r38 = r2
            X.1VX r3 = r1.A0C
            r2 = 4135(0x1027, float:5.794E-42)
            X.2vE r8 = X.C58422vE.A02
            boolean r2 = r3.A0Y(r8, r2)
            if (r2 != 0) goto L_0x0604
            r2 = 3337(0xd09, float:4.676E-42)
            boolean r2 = r3.A0Y(r8, r2)
            if (r2 != 0) goto L_0x0604
            java.lang.String r1 = "NonMessageDataRequestManager/handleHistorySyncOnDemandRequest not enabled"
            goto L_0x05d9
        L_0x0604:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "NonMessageDataRequestManager/handleHistorySyncOnDemandRequest sessionId="
            r2 = r32
            X.C18260x0.A0s(r3, r2, r4)
            int r3 = r5.size()
            r2 = 1
            if (r3 == r2) goto L_0x086a
            java.lang.String r1 = "NonMessageDataRequestManager/handleHistorySyncOnDemandRequest dataIdentifiers size is not 1"
            goto L_0x05d9
        L_0x0619:
            r2 = 4
            if (r3 != r2) goto L_0x0834
            X.2Sl r6 = r1.A05
            X.2z0 r1 = r0.A1J
            java.lang.String r14 = r1.A01
            java.util.Set r15 = r0.A01
            r1 = 1
            X.C162457s7.A0J(r14, r1)
            X.1VX r13 = r6.A04
            r1 = 3579(0xdfb, float:5.015E-42)
            X.2vE r11 = X.C58422vE.A02
            boolean r1 = r13.A0Y(r11, r1)
            if (r1 != 0) goto L_0x0637
            java.lang.String r1 = "PlaceholderMessageResendHelper/handlePlaceholderMessageResendRequest abprop disabled"
            goto L_0x05d9
        L_0x0637:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "PlaceholderMessageResendHelper/handlePlaceholderMessageResendRequest size="
            X.C18290x4.A1P(r1, r2, r15)
            java.lang.String r1 = "; jid="
            X.C18260x0.A1R(r2, r1, r9)
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L_0x064f
            java.lang.String r1 = "PlaceholderMessageResendHelper/handlePlaceholderMessageResendRequest msg key list is empty"
            goto L_0x010a
        L_0x064f:
            java.util.ArrayList r5 = X.C73783g4.A0c(r15)
            java.util.Iterator r18 = r15.iterator()
        L_0x0657:
            boolean r1 = r18.hasNext()
            if (r1 == 0) goto L_0x077c
            java.lang.String r2 = X.AnonymousClass001.A0m(r18)
            java.lang.String r10 = "PlaceholderMessageResendHelper/handlePlaceholderMessageResendRequest error in parsing request"
            r1 = 2
            r8 = 0
            byte[] r2 = android.util.Base64.decode(r2, r1)     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.1ET r1 = X.AnonymousClass1ET.DEFAULT_INSTANCE     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.6cX r4 = X.C130786cX.A05(r1, r2)     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.1ET r4 = (X.AnonymousClass1ET) r4     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            if (r4 != 0) goto L_0x0681
            java.lang.String r1 = "PlaceholderMessageResendHelper/handlePlaceholderMessageResendRequest no message key in request"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.23E r1 = X.AnonymousClass23E.GENERAL_ERROR     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.2jo r2 = new X.2jo     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            r2.<init>(r8, r1)     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            goto L_0x0777
        L_0x0681:
            int r2 = r4.bitField0_     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            r1 = r2 & 1
            if (r1 == 0) goto L_0x0747
            r1 = r2 & 2
            if (r1 == 0) goto L_0x0747
            r1 = r2 & 4
            if (r1 == 0) goto L_0x0747
            java.lang.String r1 = r4.id_     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            if (r1 == 0) goto L_0x0747
            java.lang.String r1 = r4.remoteJid_     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.4uZ r3 = X.C106405Yw.A04(r1)     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            boolean r2 = r4.fromMe_     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            java.lang.String r1 = r4.id_     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.2z0 r2 = X.AnonymousClass2z0.A05(r3, r1, r2)     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.2qz r1 = r6.A06     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.34x r7 = r1.A05(r2)     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            if (r7 != 0) goto L_0x06b7
            java.lang.String r1 = "NonMessageDataRequestManager/handlePlaceholderMessageResendRequest message not found"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.23E r1 = X.AnonymousClass23E.NOT_FOUND     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.2jo r2 = new X.2jo     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            r2.<init>(r8, r1)     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            goto L_0x0777
        L_0x06b7:
            X.1iB r2 = r6.A03     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            int r1 = r9.getDevice()     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.33G r1 = r2.A09(r1)     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            if (r1 == 0) goto L_0x073a
            long r3 = r1.A05     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            long r1 = r7.A0K     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 > 0) goto L_0x073a
            r1 = 3639(0xe37, float:5.1E-42)
            int r1 = r13.A0O(r11, r1)     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            r2 = 14
            if (r1 <= r2) goto L_0x06d7
            r1 = 14
        L_0x06d7:
            X.2sH r2 = r6.A02     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            long r16 = X.C56612sH.A04(r2, r7)     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            long r1 = (long) r1     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            long r1 = r1 * r3
            int r3 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x073a
            X.33H r2 = r6.A05     // Catch:{ 24A -> 0x0727 }
            X.20z r3 = X.C371120z.FOR_COMPANION_SYNC     // Catch:{ 24A -> 0x0727 }
            r1 = 0
            X.C162457s7.A0J(r3, r1)     // Catch:{ 24A -> 0x0727 }
            X.2av r1 = new X.2av     // Catch:{ 24A -> 0x0727 }
            r1.<init>(r3)     // Catch:{ 24A -> 0x0727 }
            X.2mJ r1 = r1.A00()     // Catch:{ 24A -> 0x0727 }
            X.1A3 r2 = r2.A02(r1, r7)     // Catch:{ 24A -> 0x0727 }
            if (r2 == 0) goto L_0x072d
            X.23E r3 = X.AnonymousClass23E.SUCCESS     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.1AT r1 = X.AnonymousClass1AT.DEFAULT_INSTANCE     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.6c9 r7 = r1.A0G()     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.6cX r1 = r2.A06()     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.8Lq r4 = r1.Bql()     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.6cX r2 = X.C18320x8.A0C(r7)     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.1AT r2 = (X.AnonymousClass1AT) r2     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            int r1 = r2.bitField0_     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            r1 = r1 | 1
            r2.bitField0_ = r1     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            r2.webMessageInfoBytes_ = r4     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.6cX r1 = r7.A06()     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.1AT r1 = (X.AnonymousClass1AT) r1     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.2jo r2 = new X.2jo     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            r2.<init>(r1, r3)     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            goto L_0x0777
        L_0x0727:
            r2 = move-exception
            java.lang.String r1 = "PlaceholderMessageResendHelper/handlePlaceholderMessageResendRequest invalid message"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
        L_0x072d:
            java.lang.String r1 = "PlaceholderMessageResendHelper/handlePlaceholderMessageResendRequest fail to convert to web message info"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.23E r1 = X.AnonymousClass23E.GENERAL_ERROR     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.2jo r2 = new X.2jo     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            r2.<init>(r8, r1)     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            goto L_0x0777
        L_0x073a:
            java.lang.String r1 = "NonMessageDataRequestManager/handlePlaceholderMessageResendRequest message not within time boundary"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.23E r1 = X.AnonymousClass23E.GENERAL_ERROR     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.2jo r2 = new X.2jo     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            r2.<init>(r8, r1)     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            goto L_0x0777
        L_0x0747:
            java.lang.String r1 = "NonMessageDataRequestManager/handlePlaceholderMessageResendRequest missing required fields in message key"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.23E r1 = X.AnonymousClass23E.GENERAL_ERROR     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            X.2jo r2 = new X.2jo     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            r2.<init>(r8, r1)     // Catch:{ IllegalArgumentException -> 0x0760, 6u5 -> 0x076c, 24P -> 0x0754 }
            goto L_0x0777
        L_0x0754:
            r1 = move-exception
            com.whatsapp.util.Log.e(r10, r1)
            X.23E r1 = X.AnonymousClass23E.GENERAL_ERROR
            X.2jo r2 = new X.2jo
            r2.<init>(r8, r1)
            goto L_0x0777
        L_0x0760:
            r1 = move-exception
            com.whatsapp.util.Log.e(r10, r1)
            X.23E r1 = X.AnonymousClass23E.GENERAL_ERROR
            X.2jo r2 = new X.2jo
            r2.<init>(r8, r1)
            goto L_0x0777
        L_0x076c:
            r1 = move-exception
            com.whatsapp.util.Log.e(r10, r1)
            X.23E r1 = X.AnonymousClass23E.GENERAL_ERROR
            X.2jo r2 = new X.2jo
            r2.<init>(r8, r1)
        L_0x0777:
            r5.add(r2)
            goto L_0x0657
        L_0x077c:
            X.2dx r3 = r6.A00
            int r16 = r15.size()
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x0810
            r17 = 0
        L_0x078a:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x07ec
            r20 = 0
        L_0x0792:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x07c8
            r21 = 0
        L_0x079a:
            r15 = 4
            r18 = 0
            r19 = r18
            r13 = r3
            r13.A01(r14, r15, r16, r17, r18, r19, r20, r21)
            X.2cT r7 = r6.A01
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "NonMessageDataRequestSendMethod/sendPlaceholderResendResponseMessage placeholder message resend stanzaId="
            r2.append(r1)
            r2.append(r14)
            java.lang.String r1 = "; remoteDeviceJid"
            r2.append(r1)
            r2.append(r9)
            java.lang.String r1 = "; placeholderMessageResendResponseResultSize="
            X.C18260x0.A1B(r1, r2, r5)
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x0aaa
            java.lang.String r1 = "NonMessageDataRequestSendMethod/sendPlaceholderResendResponseMessage placeholder message resend result is empty"
            goto L_0x05d9
        L_0x07c8:
            java.util.Iterator r4 = r5.iterator()
            r21 = 0
        L_0x07ce:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x079a
            java.lang.Object r1 = r4.next()
            X.2jo r1 = (X.C51432jo) r1
            X.23E r2 = r1.A01
            X.23E r1 = X.AnonymousClass23E.NOT_FOUND
            if (r2 != r1) goto L_0x07ce
            int r21 = r21 + 1
            if (r21 >= 0) goto L_0x07ce
            X.AnonymousClass8UF.A0q()
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0L()
            throw r0
        L_0x07ec:
            java.util.Iterator r4 = r5.iterator()
            r20 = 0
        L_0x07f2:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0792
            java.lang.Object r1 = r4.next()
            X.2jo r1 = (X.C51432jo) r1
            X.23E r2 = r1.A01
            X.23E r1 = X.AnonymousClass23E.GENERAL_ERROR
            if (r2 != r1) goto L_0x07f2
            int r20 = r20 + 1
            if (r20 >= 0) goto L_0x07f2
            X.AnonymousClass8UF.A0q()
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0L()
            throw r0
        L_0x0810:
            java.util.Iterator r4 = r5.iterator()
            r17 = 0
        L_0x0816:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x078a
            java.lang.Object r1 = r4.next()
            X.2jo r1 = (X.C51432jo) r1
            X.23E r2 = r1.A01
            X.23E r1 = X.AnonymousClass23E.SUCCESS
            if (r2 != r1) goto L_0x0816
            int r17 = r17 + 1
            if (r17 >= 0) goto L_0x0816
            X.AnonymousClass8UF.A0q()
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0L()
            throw r0
        L_0x0834:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "NonMessageDataRequestManager/handleNonMessageDataRequestMessage unknown type="
            java.lang.String r1 = X.AnonymousClass000.A0Y(r1, r2, r3)
            goto L_0x05d9
        L_0x0840:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "NonMessageDataRequestManager/handleLinkPreviewRequest size="
            X.C18290x4.A1P(r2, r3, r4)
            java.lang.String r2 = "; jid="
            X.C18260x0.A1R(r3, r2, r9)
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x0858
            java.lang.String r1 = "NonMessageDataRequestManager/handleLinkPreviewRequest urls is empty"
            goto L_0x010a
        L_0x0858:
            X.4FS r3 = r1.A0J
            r11 = 10
            X.3cN r2 = new X.3cN
            r6 = r2
            r7 = r1
            r8 = r4
            r10 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            r3.BkP(r2)
            goto L_0x0b26
        L_0x086a:
            r3 = 0
            java.lang.String[] r2 = new java.lang.String[r3]
            java.lang.Object[] r2 = r5.toArray(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r3 = r2[r3]
            r2 = 2
            byte[] r3 = android.util.Base64.decode(r3, r2)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.1DE r2 = X.AnonymousClass1DE.DEFAULT_INSTANCE     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.6cX r4 = X.C130786cX.A05(r2, r3)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.1DE r4 = (X.AnonymousClass1DE) r4     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            int r3 = r4.bitField0_     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            r2 = r3 & 1
            if (r2 == 0) goto L_0x0a91
            r2 = r3 & 2
            if (r2 == 0) goto L_0x0a91
            r2 = r3 & 4
            if (r2 == 0) goto L_0x0a91
            r2 = r3 & 8
            if (r2 == 0) goto L_0x0a91
            java.lang.String r2 = r4.chatJid_     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.4uZ r6 = X.C106405Yw.A04(r2)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            java.lang.String r7 = r4.oldestMsgId_     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            boolean r5 = r4.oldestMsgFromMe_     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            int r4 = r4.onDemandMsgCount_     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.30s r3 = r1.A0G     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            boolean r1 = r6 instanceof X.C95804uY     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            if (r1 != 0) goto L_0x0b26
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            java.lang.String r2 = "HistorySyncSendMethods/sendHistorySyncOnDemandResponse sessionId="
            r1 = r32
            X.C18260x0.A0s(r2, r1, r10)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.1iB r2 = r3.A0O     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            int r1 = r9.getDevice()     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.33G r14 = r2.A09(r1)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            r22 = 4
            r21 = 3
            if (r14 != 0) goto L_0x08de
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            java.lang.String r1 = "HistorySyncSendMethods/sendHistorySyncOnDemandResponse no device info for device id "
            r2.append(r1)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            int r1 = r9.getDevice()     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.C18270x1.A1F(r2, r1)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.2dx r3 = r3.A05     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r22)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
        L_0x08d7:
            r1 = r32
            r3.A00(r2, r1)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            goto L_0x0b26
        L_0x08de:
            long r1 = r14.A05     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            r19 = r1
            X.2Xj r1 = r3.A04     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.1VX r2 = r1.A01     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            r1 = 3642(0xe3a, float:5.104E-42)
            int r2 = r2.A0O(r8, r1)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            r1 = 365(0x16d, float:5.11E-43)
            int r2 = java.lang.Math.min(r2, r1)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            r1 = 0
            int r1 = java.lang.Math.max(r2, r1)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            long r1 = (long) r1     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            long r1 = r1 * r10
            long r30 = r19 - r1
            if (r7 == 0) goto L_0x0918
            X.2z0 r2 = X.AnonymousClass2z0.A05(r6, r7, r5)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.2qz r1 = r3.A0a     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.34x r1 = r1.A05(r2)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            if (r1 != 0) goto L_0x091b
            java.lang.String r1 = "HistorySyncSendMethods/sendHistorySyncOnDemandResponse failed to find oldest message on companion"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.2dx r3 = r3.A05     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            goto L_0x08d7
        L_0x0918:
            r1 = 1
            goto L_0x091d
        L_0x091b:
            long r1 = r1.A1L     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
        L_0x091d:
            X.3Lv r10 = r3.A0D     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.2sH r5 = r3.A09     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            long r17 = r5.A0H()     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            r5 = 5000(0x1388, float:7.006E-42)
            int r25 = java.lang.Math.min(r4, r5)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.2rt r4 = r10.A1P     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            r24 = r6
            r26 = r1
            r28 = r17
            r23 = r4
            long r7 = r23.A04(r24, r25, r26, r28)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            r15 = 1
            int r4 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            boolean r11 = X.AnonymousClass001.A1W(r4)
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            java.lang.String r4 = X.C58162uo.A0K     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            r5.append(r4)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            java.lang.String r4 = " AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1) "
            r5.append(r4)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            java.lang.String r4 = " AND _id >= ? "
            r5.append(r4)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            if (r11 == 0) goto L_0x095b
            java.lang.String r4 = " AND _id < ? "
            r5.append(r4)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
        L_0x095b:
            java.lang.String r4 = " ORDER BY _id DESC"
            java.lang.String r16 = X.AnonymousClass000.A0X(r4, r5)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            r15 = 2
            if (r11 == 0) goto L_0x0983
            r4 = r22
            java.lang.String[] r11 = new java.lang.String[r4]     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.2sm r5 = r10.A0W     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            r4 = 0
            X.C56922sm.A02(r5, r6, r11, r4)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            r13 = 1
            r4 = r17
            X.AnonymousClass0x2.A1S(r11, r13, r4)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.AnonymousClass0x2.A1S(r11, r15, r7)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            r4 = r21
            X.AnonymousClass0x2.A1S(r11, r4, r1)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
        L_0x097c:
            X.3dV r1 = r10.A18     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.4GK r7 = r1.get()     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            goto L_0x0997
        L_0x0983:
            r1 = r21
            java.lang.String[] r11 = new java.lang.String[r1]     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.2sm r2 = r10.A0W     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            r1 = 0
            X.C56922sm.A02(r2, r6, r11, r1)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            r4 = 1
            r1 = r17
            X.AnonymousClass0x2.A1S(r11, r4, r1)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.AnonymousClass0x2.A1S(r11, r15, r7)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            goto L_0x097c
        L_0x0997:
            r1 = r7
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x0a87 }
            X.2sg r4 = r1.A03     // Catch:{ all -> 0x0a87 }
            java.lang.String r2 = "GET_HISTORY_MESSAGE_FOR_JID"
            r1 = r16
            android.database.Cursor r5 = r4.A0E(r1, r2, r11)     // Catch:{ all -> 0x0a87 }
            r7.close()     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.2mJ r28 = r3.A02(r14)     // Catch:{ all -> 0x0a80 }
            X.2zv r8 = r3.A0X     // Catch:{ all -> 0x0a80 }
            r14 = 0
            r26 = r8
            r27 = r5
            r29 = r14
            java.util.Map r7 = r26.A01(r27, r28, r29, r30)     // Catch:{ all -> 0x0a80 }
            boolean r1 = r5.moveToFirst()     // Catch:{ all -> 0x0a80 }
            if (r1 == 0) goto L_0x09e1
            X.2qz r1 = r3.A0a     // Catch:{ all -> 0x0a80 }
            X.34x r1 = r1.A03(r5)     // Catch:{ all -> 0x0a80 }
            if (r1 == 0) goto L_0x09e1
            long r1 = r1.A0K     // Catch:{ all -> 0x0a80 }
            int r4 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r4 <= 0) goto L_0x09e1
            java.lang.String r1 = "HistorySyncSendMethods/sendHistorySyncOnDemandResponse fetch message with ts after device pairing unexpectedly"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0a80 }
            X.2dx r3 = r3.A05     // Catch:{ all -> 0x0a80 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x0a80 }
            r1 = r32
            r3.A00(r2, r1)     // Catch:{ all -> 0x0a80 }
            r5.close()     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            goto L_0x0b26
        L_0x09e1:
            boolean r1 = r5.moveToLast()     // Catch:{ all -> 0x0a80 }
            r4 = 0
            if (r1 == 0) goto L_0x0a01
            X.2qz r1 = r3.A0a     // Catch:{ all -> 0x0a80 }
            X.34x r10 = r1.A03(r5)     // Catch:{ all -> 0x0a80 }
            if (r10 == 0) goto L_0x0a01
            X.2rr r11 = r3.A0H     // Catch:{ all -> 0x0a80 }
            long r1 = r10.A1M     // Catch:{ all -> 0x0a80 }
            boolean r13 = r11.A07(r6, r1)     // Catch:{ all -> 0x0a80 }
            long r1 = r10.A0K     // Catch:{ all -> 0x0a80 }
            int r10 = (r1 > r30 ? 1 : (r1 == r30 ? 0 : -1))
            boolean r11 = X.AnonymousClass001.A1V(r10)
            goto L_0x0a03
        L_0x0a01:
            r11 = 0
            r13 = 0
        L_0x0a03:
            int r10 = r5.getCount()     // Catch:{ all -> 0x0a80 }
            r5.close()     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.1A0 r1 = X.AnonymousClass0x7.A0Z()     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.23J r2 = X.AnonymousClass23J.ON_DEMAND     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            r1.A0D(r2)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            r1.A09(r4)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            r2 = 100
            r1.A0A(r2)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            java.lang.Object r2 = r7.get(r6)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            if (r2 == 0) goto L_0x0a36
            java.lang.Object r5 = X.C18320x8.A0Z(r7, r6)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.19z r5 = (X.C209619z) r5     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.6cX r2 = r5.A00     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.1EG r2 = (X.AnonymousClass1EG) r2     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.8ya r2 = r2.messages_     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            int r4 = r2.size()     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            if (r11 != 0) goto L_0x0a46
            if (r13 == 0) goto L_0x0a49
            goto L_0x0a4c
        L_0x0a36:
            X.2sK r2 = r3.A08     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            java.util.Map r5 = r2.A06()     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            java.util.Map r2 = r2.A07()     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.19z r5 = r8.A00(r6, r5, r2)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            if (r10 <= 0) goto L_0x0a49
        L_0x0a46:
            X.22o r2 = X.C374222o.COMPLETE_ON_DEMAND_SYNC_BUT_MORE_MSG_REMAIN_ON_PRIMARY     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            goto L_0x0a4e
        L_0x0a49:
            X.22o r2 = X.C374222o.COMPLETE_AND_NO_MORE_MESSAGE_REMAIN_ON_PRIMARY     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            goto L_0x0a4e
        L_0x0a4c:
            X.22o r2 = X.C374222o.COMPLETE_BUT_MORE_MESSAGES_REMAIN_ON_PRIMARY     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
        L_0x0a4e:
            r5.A09(r2)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.6cX r2 = r5.A06()     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            X.1EG r2 = (X.AnonymousClass1EG) r2     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            r1.A0C(r2)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            r20 = 6
            r21 = 100
            r25 = -1
            long r4 = (long) r4     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            r33 = 0
            r19 = 0
            r29 = r25
            r35 = r25
            r37 = r19
            r15 = r9
            r16 = r1
            r17 = r32
            r18 = r14
            r22 = r19
            r23 = r38
            r27 = r25
            r31 = r4
            r13 = r3
            r13.A01(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r27, r29, r31, r33, r35, r37)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            goto L_0x0b26
        L_0x0a80:
            r2 = move-exception
            if (r5 == 0) goto L_0x0a90
            r5.close()     // Catch:{ all -> 0x0a8c }
            goto L_0x0a90
        L_0x0a87:
            r2 = move-exception
            r7.close()     // Catch:{ all -> 0x0a8c }
            goto L_0x0a90
        L_0x0a8c:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
        L_0x0a90:
            throw r2     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
        L_0x0a91:
            X.2dx r3 = r1.A03     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            java.lang.Integer r2 = X.C18290x4.A0b()     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            r1 = r32
            r3.A00(r2, r1)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            java.lang.String r1 = "NonMessageDataRequestManager/handleHistorySyncOnDemandRequest missing required fields in request"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 24P | 6u5 | IllegalArgumentException -> 0x0aa3 }
            goto L_0x0b26
        L_0x0aa3:
            r2 = move-exception
            java.lang.String r1 = "NonMessageDataRequestManager/handleHistorySyncOnDemandRequest error in parsing request"
            com.whatsapp.util.Log.e(r1, r2)
            goto L_0x0b26
        L_0x0aaa:
            X.2sr r1 = r7.A00
            com.whatsapp.jid.PhoneUserJid r4 = X.C56972sr.A04(r1)
            if (r4 != 0) goto L_0x0ab6
            java.lang.String r1 = "NonMessageDataRequestSendMethod/sendPlaceholderResendResponseMessage myUserJid is null"
            goto L_0x010a
        L_0x0ab6:
            X.35J r3 = r7.A06
            X.2sH r1 = r7.A03
            long r1 = r1.A0H()
            X.2z0 r3 = X.AnonymousClass35J.A01(r4, r3)
            X.1OQ r6 = new X.1OQ
            r6.<init>(r3, r14, r1)
            r6.A00 = r9
            r6.A1v(r5)
            X.2rl r1 = r7.A04
            long r4 = r1.A00(r6)
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0adc
            java.lang.String r1 = "NonMessageDataRequestSendMethod/sendPlaceholderResendResponseMessage unable to add placeholder message resend peer message"
            goto L_0x010a
        L_0x0adc:
            X.2gy r1 = r7.A01
            X.C49712gy.A00(r1, r9, r6)
            goto L_0x0b26
        L_0x0ae2:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "PeerMessageHandler/handleNonMessageDataRequestResponseMessage unexpected type="
            r2.append(r1)
            boolean r1 = r0 instanceof X.AnonymousClass1OP
            if (r1 == 0) goto L_0x0af6
            r1 = -1
        L_0x0af0:
            java.lang.String r1 = X.AnonymousClass000.A0h(r2, r1)
            goto L_0x010a
        L_0x0af6:
            boolean r1 = r0 instanceof X.AnonymousClass1OQ
            if (r1 == 0) goto L_0x0afc
            r1 = 4
            goto L_0x0af0
        L_0x0afc:
            r1 = 2
            goto L_0x0af0
        L_0x0afe:
            boolean r1 = r0 instanceof X.C30841nI
            if (r1 == 0) goto L_0x0b2c
            X.1nI r0 = (X.C30841nI) r0
            java.lang.String r1 = "PeerMessageHandler/handleKeyRequestMessage"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.2sZ r6 = r12.A05
            com.whatsapp.jid.DeviceJid r5 = r0.A1R
            r4 = 0
            if (r5 == 0) goto L_0x0b26
            java.util.Set r1 = r0.A00
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
            java.util.HashMap r3 = r6.A03(r1)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SyncdKeyManager/handleAppStateSyncKeyRequestMessage syncdKeyMap = "
            X.C18260x0.A1R(r2, r1, r3)
            r6.A08(r5, r3, r4)
        L_0x0b26:
            X.33Y r1 = r12.A06
            r1.A04(r0)
            return
        L_0x0b2c:
            boolean r1 = r0 instanceof X.C30861nK
            if (r1 == 0) goto L_0x0b9a
            X.1nK r0 = (X.C30861nK) r0
            java.lang.Object[] r3 = X.AnonymousClass002.A0M()
            long r1 = r0.A00
            X.C18280x3.A1S(r3, r1)
            r1 = 1
            java.util.Set r6 = r0.A01
            r3[r1] = r6
            java.lang.String r1 = "PeerMessageHandler/handleFatalExceptionNotificationMessage: time = %s; collectionNames=%s"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.3Gp r5 = r12.A04
            monitor-enter(r5)
            com.whatsapp.jid.DeviceJid r1 = r0.A1R     // Catch:{ all -> 0x0c35 }
            if (r1 == 0) goto L_0x0b88
            X.1iB r2 = r5.A0X     // Catch:{ all -> 0x0c35 }
            int r1 = r1.getDevice()     // Catch:{ all -> 0x0c35 }
            X.33G r3 = r2.A09(r1)     // Catch:{ all -> 0x0c35 }
            if (r3 == 0) goto L_0x0b88
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0c35 }
            java.lang.String r1 = "sync-manager/handleFatalExceptionOnCompanion companion: "
            r2.append(r1)     // Catch:{ all -> 0x0c35 }
            com.whatsapp.jid.DeviceJid r1 = r3.A07     // Catch:{ all -> 0x0c35 }
            int r1 = r1.getDevice()     // Catch:{ all -> 0x0c35 }
            r2.append(r1)     // Catch:{ all -> 0x0c35 }
            java.lang.String r1 = "; ["
            r2.append(r1)     // Catch:{ all -> 0x0c35 }
            X.23P r1 = r3.A08     // Catch:{ all -> 0x0c35 }
            r2.append(r1)     // Catch:{ all -> 0x0c35 }
            r1 = 40
            r2.append(r1)     // Catch:{ all -> 0x0c35 }
            java.lang.String r1 = r3.A09     // Catch:{ all -> 0x0c35 }
            r2.append(r1)     // Catch:{ all -> 0x0c35 }
            java.lang.String r1 = ")]"
            X.C18260x0.A1L(r2, r1)     // Catch:{ all -> 0x0c35 }
        L_0x0b88:
            X.2qk r4 = r5.A05     // Catch:{ all -> 0x0c35 }
            java.lang.String r3 = "app-sate-sync-handle-fatal-exception-on-companion"
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x0c35 }
            r1 = 0
            r4.A0A(r3, r1, r2)     // Catch:{ all -> 0x0c35 }
            r1 = 0
            r5.A0J(r1)     // Catch:{ all -> 0x0c35 }
            monitor-exit(r5)     // Catch:{ all -> 0x0c35 }
            goto L_0x0b26
        L_0x0b9a:
            boolean r1 = r0 instanceof X.C30881nM
            if (r1 == 0) goto L_0x0bed
            X.1nM r0 = (X.C30881nM) r0
            java.lang.String r1 = "PeerMessageHandler/handleInitialSecurityNotificationSettingSyncMessage"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.2Qw r7 = r12.A03
            java.lang.Object r5 = r7.A04
            monitor-enter(r5)
            X.2sr r1 = r7.A00     // Catch:{ all -> 0x0c3b }
            boolean r1 = r1.A0Y()     // Catch:{ all -> 0x0c3b }
            if (r1 != 0) goto L_0x0bba
            java.lang.String r1 = "ReceiveSecurityNotificationSettingManager/ received in primary mode"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0c3b }
        L_0x0bb7:
            monitor-exit(r5)     // Catch:{ all -> 0x0c3b }
            goto L_0x0b26
        L_0x0bba:
            X.2q4 r6 = r7.A02     // Catch:{ all -> 0x0c3b }
            android.content.SharedPreferences r1 = r6.A01()     // Catch:{ all -> 0x0c3b }
            java.lang.String r4 = "has_received_security_notification_setting"
            boolean r1 = X.C18280x3.A1W(r1, r4)     // Catch:{ all -> 0x0c3b }
            if (r1 != 0) goto L_0x0bb7
            X.33p r1 = r7.A03     // Catch:{ all -> 0x0c3b }
            boolean r3 = r0.A00     // Catch:{ all -> 0x0c3b }
            android.content.SharedPreferences$Editor r2 = X.C18270x1.A03(r1)     // Catch:{ all -> 0x0c3b }
            java.lang.String r1 = "security_notifications"
            X.C18270x1.A0l(r2, r1, r3)     // Catch:{ all -> 0x0c3b }
            android.content.SharedPreferences$Editor r1 = X.C55262q4.A00(r6)     // Catch:{ all -> 0x0c3b }
            X.C18270x1.A0f(r1, r4)     // Catch:{ all -> 0x0c3b }
            X.2FS r3 = r7.A01     // Catch:{ all -> 0x0c3b }
            monitor-enter(r3)     // Catch:{ all -> 0x0c3b }
            X.2K4 r1 = r3.A00     // Catch:{ all -> 0x0c38 }
            if (r1 == 0) goto L_0x0beb
            X.3XA r2 = r1.A00     // Catch:{ all -> 0x0c38 }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0c38 }
            r2.A05(r1)     // Catch:{ all -> 0x0c38 }
        L_0x0beb:
            monitor-exit(r3)     // Catch:{ all -> 0x0c3b }
            goto L_0x0bb7
        L_0x0bed:
            boolean r1 = r0 instanceof X.AnonymousClass1nO
            if (r1 == 0) goto L_0x00ed
            X.1nO r0 = (X.AnonymousClass1nO) r0
            java.lang.String r1 = "PeerMessageHandler/handleHistorySyncNoticationMessage"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.2yM r4 = r12.A02
            X.2sr r1 = r4.A00
            boolean r1 = r1.A0Y()
            if (r1 != 0) goto L_0x0c3e
            java.lang.String r1 = "ReceiveHistorySyncManager/ Received history sync as primary device"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.33Y r1 = r4.A0A
            r1.A04(r0)
            return
        L_0x0c0d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0c10:
            r1 = move-exception
            if (r2 == 0) goto L_0x0c1b
            r2.close()     // Catch:{ all -> 0x0c17 }
            goto L_0x0c1b
        L_0x0c17:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0c1c }
        L_0x0c1b:
            throw r1     // Catch:{ all -> 0x0c1c }
        L_0x0c1c:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x0c21 }
            goto L_0x0c25
        L_0x0c21:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0c26 }
        L_0x0c25:
            throw r1     // Catch:{ all -> 0x0c26 }
        L_0x0c26:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x0c2b }
            goto L_0x0c2f
        L_0x0c2b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0c30 }
        L_0x0c2f:
            throw r1     // Catch:{ all -> 0x0c30 }
        L_0x0c30:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0e0f }
            throw r1
        L_0x0c35:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0c35 }
            throw r0
        L_0x0c38:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0c3b }
            throw r0     // Catch:{ all -> 0x0c3b }
        L_0x0c3b:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0c3b }
            throw r0
        L_0x0c3e:
            int r3 = r0.A03
            r1 = 2
            if (r3 == r1) goto L_0x0c47
            r1 = 3
            r9 = 0
            if (r3 != r1) goto L_0x0c48
        L_0x0c47:
            r9 = 1
        L_0x0c48:
            X.2ha r8 = r4.A02
            int r1 = r0.A01
            long r5 = (long) r1
            int r7 = r0.A00
            X.1Zm r2 = new X.1Zm
            r2.<init>()
            java.lang.String r1 = r8.A00()
            r2.A05 = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r2.A03 = r1
            X.2sH r1 = r8.A03
            java.lang.Long r1 = X.C56612sH.A09(r1)
            r2.A04 = r1
            java.lang.Integer r1 = X.C64663Ek.A01(r3)
            r2.A00 = r1
            java.lang.Integer r1 = X.C64663Ek.A00(r3)
            r2.A01 = r1
            java.lang.Long r1 = X.AnonymousClass0x9.A0m(r7)
            r2.A02 = r1
            X.4FV r1 = r8.A06
            r1.BhD(r2)
            long r5 = r0.A05
            if (r9 == 0) goto L_0x0cc4
            int r2 = r0.A00
        L_0x0c85:
            byte[] r14 = r0.A0J
            r9 = 0
            java.lang.String r10 = r0.A0D
            java.lang.String r11 = r0.A0B
            java.lang.String r12 = r0.A0C
            X.2z0 r1 = r0.A1J
            java.lang.String r13 = r1.A01
            byte[] r15 = r0.A0I
            X.2sH r1 = r4.A06
            long r20 = r1.A0H()
            r1 = 0
            X.2w2 r8 = new X.2w2
            r17 = r2
            r18 = r5
            r16 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20)
            if (r3 != 0) goto L_0x0cbd
            X.2q4 r5 = r4.A05
            org.json.JSONObject r2 = r5.A02()
            if (r2 != 0) goto L_0x0cbd
            org.json.JSONObject r3 = X.C60322yM.A00(r1, r1)
            android.content.SharedPreferences$Editor r2 = X.C55262q4.A00(r5)
            java.lang.String r1 = "history_sync_companion_state"
            X.C18270x1.A0e(r2, r3, r1)
        L_0x0cbd:
            X.2xv r7 = r4.A09
            X.C626936e.A00()
            r6 = 1
            goto L_0x0cc6
        L_0x0cc4:
            r2 = 0
            goto L_0x0c85
        L_0x0cc6:
            X.1RE r1 = r7.A01     // Catch:{ SQLiteConstraintException -> 0x0cea }
            X.4Fq r5 = r1.A0C()     // Catch:{ SQLiteConstraintException -> 0x0cea }
            X.2fs r3 = r7.A02     // Catch:{ all -> 0x0ce0 }
            java.lang.String r2 = "INSERT INTO history_sync_companion (message_id, sync_type, chunk_order, media_key, media_hash, media_enc_hash, file_size, direct_path, local_path, start_time, inline_payload) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
            java.lang.String r1 = "HistorySyncCompanionStore.INSERT_CHUNK"
            X.2sQ r1 = r3.A00(r2, r1, r6)     // Catch:{ all -> 0x0ce0 }
            X.C60052xv.A00(r1, r8)     // Catch:{ all -> 0x0ce0 }
            r1.A01()     // Catch:{ all -> 0x0ce0 }
            r5.close()     // Catch:{ SQLiteConstraintException -> 0x0cea }
            goto L_0x0d06
        L_0x0ce0:
            r2 = move-exception
            r5.close()     // Catch:{ all -> 0x0ce5 }
            goto L_0x0ce9
        L_0x0ce5:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ SQLiteConstraintException -> 0x0cea }
        L_0x0ce9:
            throw r2     // Catch:{ SQLiteConstraintException -> 0x0cea }
        L_0x0cea:
            r5 = move-exception
            X.2fs r3 = r7.A02
            java.lang.String r2 = "UPDATE history_sync_companion SET message_id = ?, sync_type = ?, chunk_order = ?, media_key = ?, media_hash = ?, media_enc_hash = ?, file_size = ?, direct_path = ?, local_path = ?, start_time = ?, inline_payload = ?  WHERE message_id = ?"
            java.lang.String r1 = "HistorySyncCompanionStore.UPDATE_CHUNK"
            X.2sQ r3 = r3.A00(r2, r1, r6)
            X.C60052xv.A00(r3, r8)
            r2 = 12
            java.lang.String r1 = r8.A08
            r3.A07(r2, r1)
            int r1 = r3.A00()
            if (r1 == r6) goto L_0x0d06
            throw r5
        L_0x0d06:
            r4.A01(r0)
            return
        L_0x0d0a:
            X.2r5 r5 = r1.A0C
            long r3 = r6.A07
            r2 = 0
            X.2rb r3 = r5.A01(r2, r3)
            if (r3 == 0) goto L_0x0d19
            r2 = 4
            r3.A03(r2)
        L_0x0d19:
            if (r55 != 0) goto L_0x0daa
            X.2R5 r4 = r1.A03
            X.3dV r0 = r4.A02
            X.4Fq r7 = r0.A04()
            X.2qz r5 = r4.A04     // Catch:{ all -> 0x0da5 }
            X.2z0 r0 = X.AnonymousClass3ST.A00(r6)     // Catch:{ all -> 0x0da5 }
            X.34x r0 = r5.A05(r0)     // Catch:{ all -> 0x0da5 }
            if (r0 == 0) goto L_0x0d51
            r7.close()
            boolean r3 = r6.A12
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DecryptMessageHandlerplaceholder already existed; message.key="
            r2.append(r0)
            X.2z0 r0 = X.AnonymousClass3ST.A00(r6)
            X.AnonymousClass000.A1B(r0, r2)
            java.lang.String r0 = "; retry="
            X.C18260x0.A1D(r0, r2, r3)
            if (r3 != 0) goto L_0x120e
            X.33Y r0 = r1.A0B
            r0.A07(r6)
            return
        L_0x0d51:
            X.2z0 r2 = X.AnonymousClass3ST.A00(r6)     // Catch:{ all -> 0x0da5 }
            long r0 = r6.A16     // Catch:{ all -> 0x0da5 }
            X.1nS r3 = new X.1nS     // Catch:{ all -> 0x0da5 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x0da5 }
            r6.A02(r3)     // Catch:{ all -> 0x0da5 }
            int r0 = r6.A04     // Catch:{ all -> 0x0da5 }
            r3.A00 = r0     // Catch:{ all -> 0x0da5 }
            java.lang.String r0 = r6.A0j     // Catch:{ all -> 0x0da5 }
            if (r0 == 0) goto L_0x0d9c
            com.whatsapp.jid.UserJid r1 = r6.A0K     // Catch:{ all -> 0x0da5 }
            if (r1 == 0) goto L_0x0d9c
            X.2z0 r0 = X.AnonymousClass3ST.A00(r6)     // Catch:{ all -> 0x0da5 }
            X.4uZ r2 = r0.A00     // Catch:{ all -> 0x0da5 }
            X.2sr r0 = r4.A00     // Catch:{ all -> 0x0da5 }
            boolean r1 = r0.A0a(r1)     // Catch:{ all -> 0x0da5 }
            java.lang.String r0 = r6.A0j     // Catch:{ all -> 0x0da5 }
            X.2z0 r1 = X.AnonymousClass2z0.A05(r2, r0, r1)     // Catch:{ all -> 0x0da5 }
            X.2fy r0 = r4.A03     // Catch:{ all -> 0x0da5 }
            X.2z0 r1 = r0.A00(r1)     // Catch:{ all -> 0x0da5 }
            com.whatsapp.jid.UserJid r0 = r6.A0K     // Catch:{ all -> 0x0da5 }
            X.2kn r2 = new X.2kn     // Catch:{ all -> 0x0da5 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0da5 }
            X.2z0 r0 = r2.A01     // Catch:{ all -> 0x0da5 }
            X.34x r0 = r5.A05(r0)     // Catch:{ all -> 0x0da5 }
            if (r0 == 0) goto L_0x0d9c
            long r0 = r0.A1L     // Catch:{ all -> 0x0da5 }
            X.C30211m5.A00(r3, r2, r0)     // Catch:{ all -> 0x0da5 }
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r3.A1B(r0)     // Catch:{ all -> 0x0da5 }
        L_0x0d9c:
            X.3Lv r0 = r4.A01     // Catch:{ all -> 0x0da5 }
            r0.A08(r3)     // Catch:{ all -> 0x0da5 }
            r7.close()
            return
        L_0x0da5:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0e0f }
            throw r1
        L_0x0daa:
            boolean r2 = X.C627636p.A0l(r0)
            if (r2 == 0) goto L_0x0dba
            X.30G r2 = r1.A04
            X.C626936e.A06(r0)
            r1 = 1
            r2.A05(r0, r1)
            return
        L_0x0dba:
            boolean r2 = r0 instanceof X.C30311mF
            if (r2 == 0) goto L_0x0e14
            X.2rw r7 = r1.A06
            r5 = r0
            X.1mF r5 = (X.C30311mF) r5
            X.2zV r8 = r7.A07
            int r2 = r5.A00
            boolean r2 = r8.A02(r2)
            if (r2 == 0) goto L_0x11de
            X.31A r4 = r7.A01(r5)
            if (r4 == 0) goto L_0x0e14
            X.3Z2 r10 = r4.A0b
            X.2z0 r2 = r5.A1J
            X.4uZ r9 = r2.A00
            long r13 = r5.A0K
            int r12 = r5.A00
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            boolean r2 = r8.A03(r9, r10, r11, r12, r13)
            if (r2 != 0) goto L_0x0e14
            int r2 = r5.A0C
            if (r2 != 0) goto L_0x0e14
            X.3dV r2 = r7.A05
            X.4Fq r3 = r2.A04()
            X.3Yo r2 = r3.Axl()     // Catch:{ all -> 0x0e0a }
            r7.A04(r4, r5)     // Catch:{ all -> 0x0e00 }
            r2.A00()     // Catch:{ all -> 0x0e00 }
            r2.close()     // Catch:{ all -> 0x0e0a }
            goto L_0x11db
        L_0x0e00:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0e05 }
            goto L_0x0e09
        L_0x0e05:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0e0a }
        L_0x0e09:
            throw r1     // Catch:{ all -> 0x0e0a }
        L_0x0e0a:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0e0f }
            throw r1
        L_0x0e0f:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0e14:
            boolean r2 = r0 instanceof X.C30521ma
            if (r2 == 0) goto L_0x0ec5
            X.2rw r10 = r1.A06
            r11 = r0
            X.1ma r11 = (X.C30521ma) r11
            X.2z0 r2 = r11.A1J
            X.4uZ r9 = r2.A00
            r5 = 1
            if (r9 != 0) goto L_0x0e30
            java.lang.String r2 = "EphemeralSettingMessageStore/incomingEphemeralSyncResponse/no chat"
        L_0x0e26:
            com.whatsapp.util.Log.w((java.lang.String) r2)
        L_0x0e29:
            java.lang.String r2 = "DecryptMessageHandler/incomingEphemeralSyncResponse/do not process ESR"
            com.whatsapp.util.Log.w((java.lang.String) r2)
            goto L_0x11de
        L_0x0e30:
            X.1VX r4 = r10.A09
            r3 = 2714(0xa9a, float:3.803E-42)
            X.2vE r2 = X.C58422vE.A02
            boolean r2 = r4.A0Y(r2, r3)
            if (r2 != 0) goto L_0x0e4b
            java.lang.String r2 = "EphemeralSettingMessageStore/incomingEphemeralSyncResponse/esr abprop off"
            com.whatsapp.util.Log.w((java.lang.String) r2)
            X.7kW r3 = r10.A08
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
        L_0x0e47:
            r3.A02(r9, r2)
            goto L_0x0e29
        L_0x0e4b:
            X.2zV r3 = r10.A07
            int r2 = r11.A00
            boolean r2 = r3.A02(r2)
            if (r2 != 0) goto L_0x0e61
            X.7kW r3 = r10.A08
            java.lang.Integer r2 = X.C18300x5.A0Y()
            r3.A02(r9, r2)
            java.lang.String r2 = "EphemeralSettingMessageStore/incomingEphemeralSyncResponse/invalid duration"
            goto L_0x0e26
        L_0x0e61:
            X.31A r2 = r10.A01(r11)
            if (r2 != 0) goto L_0x0e74
            java.lang.String r2 = "EphemeralSettingMessageStore/incomingEphemeralSyncResponse/not a user or no chat"
            com.whatsapp.util.Log.w((java.lang.String) r2)
            X.7kW r3 = r10.A08
            r2 = 7
        L_0x0e6f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0e47
        L_0x0e74:
            X.3Z2 r4 = r2.A0b
            int r8 = r11.A00
            long r2 = r11.A01
            int r7 = r11.A00
            X.3Z2 r5 = new X.3Z2
            r5.<init>(r8, r2, r7)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "EphemeralSettingMessageStore/incomingEphemeralSyncResponse/current ephemeral info "
            X.C18260x0.A1R(r3, r2, r4)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "EphemeralSettingMessageStore/incomingEphemeralSyncResponse/incoming ephemeral info "
            X.C18260x0.A1R(r3, r2, r5)
            long r7 = r11.A01
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            boolean r2 = r9 instanceof com.whatsapp.jid.UserJid
            r5 = 0
            if (r2 != 0) goto L_0x0ea9
            java.lang.String r2 = "EphemeralSettingMessageUtils/incomingEphemeralSyncResponse/not one-to-one chat"
        L_0x0ea0:
            com.whatsapp.util.Log.w((java.lang.String) r2)
            if (r5 != 0) goto L_0x0ec5
            X.7kW r3 = r10.A08
            r2 = 4
            goto L_0x0e6f
        L_0x0ea9:
            if (r3 != 0) goto L_0x0eae
            java.lang.String r2 = "EphemeralSettingMessageUtils/incomingEphemeralSyncResponse/no EST timestamp"
            goto L_0x0ea0
        L_0x0eae:
            if (r4 != 0) goto L_0x0eb3
            java.lang.String r2 = "EphemeralSettingMessageUtils/incomingEphemeralSyncResponse/no ephemeral info"
            goto L_0x0ea0
        L_0x0eb3:
            long r3 = r4.ephemeralSettingTimestamp
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x0eba
            r5 = 1
        L_0x0eba:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "EphemeralSettingMessageUtils/incomingEphemeralSyncResponse/newer EST "
            java.lang.String r2 = X.AnonymousClass000.A0b(r2, r3, r5)
            goto L_0x0ea0
        L_0x0ec5:
            boolean r2 = r0 instanceof X.C30331mH
            if (r2 == 0) goto L_0x0eda
            X.2iN r4 = r1.A08
            X.2m9 r3 = r4.A04
            r2 = 10
            X.3bx r1 = new X.3bx
            r1.<init>(r4, r2, r0)
            r0 = 52
            r3.A01(r1, r0)
            return
        L_0x0eda:
            boolean r2 = r0 instanceof X.C30511mZ
            r15 = 0
            if (r2 == 0) goto L_0x1165
            X.1mZ r0 = (X.C30511mZ) r0
            java.lang.String r4 = r0.A03
            java.lang.String r3 = r0.A01
            java.lang.String r10 = r0.A02
            long r7 = r0.A00
            r52 = r7
            if (r4 == 0) goto L_0x1152
            if (r3 == 0) goto L_0x1152
            if (r10 == 0) goto L_0x1152
            X.33d r2 = r1.A09
            long r8 = r0.A0K
            X.1VX r0 = r2.A0K
            r26 = r0
            boolean r0 = X.C56952sp.A0I(r26)
            if (r0 != 0) goto L_0x0f0c
            java.lang.String r0 = "MediaDownloadManager/queueExpressPathDownload skip due to ABProps not enabled"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x0f04:
            X.33Y r1 = r1.A0B
            java.lang.String r0 = "medianotify"
            r1.A09(r6, r0, r15)
            return
        L_0x0f0c:
            boolean r0 = X.C617832f.A00(r4)
            if (r0 != 0) goto L_0x0f1f
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ExpressPathUtils/getMmsTypeFromExpressPathUrl Receive non express path url in media notify message. url = "
            X.C18260x0.A0r(r0, r4, r2)
        L_0x0f1b:
            java.lang.String r0 = "mediadownloadmanager/queueexpresspathdownload invalid expressPathUrl stop"
            goto L_0x1154
        L_0x0f1f:
            java.lang.String r0 = "/document/"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x0f36
            X.38t r5 = X.C633138t.A09
        L_0x0f29:
            X.32f r0 = r2.A0f
            r7 = 0
            boolean r0 = r0.A01(r5, r7)
            if (r0 == 0) goto L_0x0f6d
            java.lang.String r0 = "mediadownloadmanager/queueexpresspathdownload force_ip is set"
            goto L_0x1154
        L_0x0f36:
            java.lang.String r0 = "/image/"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x0f41
            X.38t r5 = X.C633138t.A0C
            goto L_0x0f29
        L_0x0f41:
            java.lang.String r0 = "/video/"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x0f4c
            X.38t r5 = X.C633138t.A0g
            goto L_0x0f29
        L_0x0f4c:
            java.lang.String r0 = "/audio/"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x0f57
            X.38t r5 = X.C633138t.A05
            goto L_0x0f29
        L_0x0f57:
            java.lang.String r0 = "/gif/"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x0f62
            X.38t r5 = X.C633138t.A04
            goto L_0x0f29
        L_0x0f62:
            java.lang.String r0 = "/sticker/"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x0f1b
            X.38t r5 = X.C633138t.A0b
            goto L_0x0f29
        L_0x0f6d:
            X.2qZ r0 = r2.A0O
            r34 = 1
            r22 = r7
            r23 = r7
            r24 = r7
            r25 = r7
            r16 = r0
            r17 = r5
            r18 = r7
            r19 = r52
            r21 = r34
            boolean r0 = r16.A02(r17, r18, r19, r21, r22, r23, r24, r25)
            if (r0 != 0) goto L_0x0fc8
            java.lang.String r0 = "mediadownloadmanager/queueexpresspathdownload auto download not enabled, ignore ep download  "
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.36E r3 = r2.A08
            r0 = 24
        L_0x0f92:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.1bV r4 = new X.1bV
            r4.<init>()
            java.lang.Integer r2 = X.C18290x4.A0b()
            r4.A0E = r2
            r4.A0H = r0
            byte r0 = r5.A00
            int r0 = X.C106495Zf.A00(r0, r7, r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0I = r0
            X.C626936e.A06(r2)
            java.lang.Integer r0 = r4.A0H
            X.C626936e.A06(r0)
            X.4FV r3 = r3.A0G
            r2 = 2810(0xafa, float:3.938E-42)
            r0 = r26
            boolean r0 = X.C56952sp.A0J(r0, r2)
            if (r0 != 0) goto L_0x1033
            r3.BhD(r4)
            goto L_0x0f04
        L_0x0fc8:
            X.1i8 r11 = r2.A0Z
            java.lang.Object r14 = r11.A0I
            monitor-enter(r14)
            android.net.Uri r0 = android.net.Uri.parse(r4)     // Catch:{ all -> 0x1162 }
            java.lang.String r13 = r0.getHost()     // Catch:{ all -> 0x1162 }
            X.5LI r0 = r11.A00     // Catch:{ all -> 0x1162 }
            if (r0 == 0) goto L_0x1023
            if (r13 == 0) goto L_0x1023
            java.util.List r0 = r0.A0A     // Catch:{ all -> 0x1162 }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x1162 }
        L_0x0fe1:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x1162 }
            if (r0 == 0) goto L_0x1023
            java.lang.Object r0 = r16.next()     // Catch:{ all -> 0x1162 }
            X.2dM r0 = (X.C47502dM) r0     // Catch:{ all -> 0x1162 }
            java.lang.String r12 = r0.A04     // Catch:{ all -> 0x1162 }
            boolean r11 = r13.equals(r12)     // Catch:{ all -> 0x1162 }
            if (r11 != 0) goto L_0x1021
            java.lang.String r11 = r0.A00     // Catch:{ all -> 0x1162 }
            boolean r0 = r13.equals(r11)     // Catch:{ all -> 0x1162 }
            if (r0 != 0) goto L_0x1021
            if (r12 == 0) goto L_0x100f
            java.lang.String r0 = "^media-([a-zA-Z]{3})([0-9]*-[0-9]*)\\.cdn.whatsapp.net$"
            boolean r0 = r12.matches(r0)     // Catch:{ all -> 0x1162 }
            if (r0 == 0) goto L_0x100f
            r0 = 9
            boolean r0 = r13.regionMatches(r7, r12, r7, r0)     // Catch:{ all -> 0x1162 }
            if (r0 != 0) goto L_0x1021
        L_0x100f:
            if (r11 == 0) goto L_0x0fe1
            java.lang.String r0 = "^media-([a-zA-Z]{3})([0-9]*-[0-9]*)\\.cdn.whatsapp.net$"
            boolean r0 = r11.matches(r0)     // Catch:{ all -> 0x1162 }
            if (r0 == 0) goto L_0x0fe1
            r0 = 9
            boolean r0 = r13.regionMatches(r7, r11, r7, r0)     // Catch:{ all -> 0x1162 }
            if (r0 == 0) goto L_0x0fe1
        L_0x1021:
            monitor-exit(r14)     // Catch:{ all -> 0x1162 }
            goto L_0x103a
        L_0x1023:
            monitor-exit(r14)     // Catch:{ all -> 0x1162 }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediadownloadmanager/queueexpresspathdownload sender and receiver not connect to the same PoP, ignore ep download for enc file hash: "
            X.C18260x0.A0q(r0, r3, r4)
            X.36E r3 = r2.A08
            r0 = 23
            goto L_0x0f92
        L_0x1033:
            X.5ZC r0 = X.C617832f.A04
            r3.BhC(r4, r0)
            goto L_0x0f04
        L_0x103a:
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediadownloadmanager/createmediadownloadforexpresspath Sender initiated express upload at unixtime: "
            X.C18260x0.A10(r0, r11, r8)
            java.util.HashMap r8 = r2.A0l
            monitor-enter(r8)
            boolean r0 = r8.containsKey(r10)     // Catch:{ all -> 0x115f }
            if (r0 == 0) goto L_0x105f
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x115f }
            java.lang.String r0 = "MediaDownloadManager/isExpressPathDownloadDuplicated Existing regular download job "
            r2.append(r0)     // Catch:{ all -> 0x115f }
            java.lang.Object r0 = r8.get(r10)     // Catch:{ all -> 0x115f }
            X.C18260x0.A0o(r0, r2)     // Catch:{ all -> 0x115f }
            monitor-exit(r8)     // Catch:{ all -> 0x115f }
            goto L_0x0f04
        L_0x105f:
            monitor-exit(r8)     // Catch:{ all -> 0x115f }
            java.util.HashMap r0 = r2.A0m
            monitor-enter(r0)
            boolean r8 = r0.containsKey(r3)     // Catch:{ all -> 0x115c }
            if (r8 == 0) goto L_0x107c
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x115c }
            java.lang.String r2 = "MediaDownloadManager/isExpressPathDownloadDuplicated Existing express path download job "
            r4.append(r2)     // Catch:{ all -> 0x115c }
            java.lang.Object r2 = r0.get(r3)     // Catch:{ all -> 0x115c }
            X.C18260x0.A0o(r2, r4)     // Catch:{ all -> 0x115c }
            monitor-exit(r0)     // Catch:{ all -> 0x115c }
            goto L_0x0f04
        L_0x107c:
            monitor-exit(r0)     // Catch:{ all -> 0x115c }
            X.3Dh r9 = r2.A05
            java.lang.String r24 = "application/octet-stream"
            X.38t r8 = X.C633138t.A09
            r33 = 8
            if (r5 == r8) goto L_0x108d
            X.38t r8 = X.C633138t.A0g
            if (r5 != r8) goto L_0x1100
            r33 = 3
        L_0x108d:
            r13 = r9
            r14 = r5
            r16 = r3
            r17 = r10
            r18 = r4
            r19 = r7
            java.io.File r18 = r13.A0L(r14, r15, r16, r17, r18, r19)
            r38 = 0
            java.lang.String r22 = X.C18280x3.A0Y()
            r32 = 2
            r35 = 3
            X.2dc r11 = new X.2dc
            r13 = r15
            r16 = r15
            r25 = r15
            r26 = r15
            r27 = r15
            r28 = r15
            r29 = r15
            r31 = r7
            r40 = r7
            r41 = r7
            r42 = r7
            r43 = r7
            r44 = r7
            r45 = r7
            r46 = r7
            r47 = r7
            r48 = r7
            r49 = r7
            r50 = r7
            r51 = r7
            r12 = r15
            r19 = r4
            r20 = r10
            r21 = r15
            r23 = r3
            r30 = r7
            r36 = r52
            r17 = r15
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            X.2VS r5 = r2.A04
            android.os.ConditionVariable r4 = r2.A01
            r21 = -1
            r20 = r34
            r23 = r34
            r17 = r4
            r18 = r11
            r19 = r34
            r16 = r5
            X.1I7 r7 = r16.A00(r17, r18, r19, r20, r21, r23)
            X.3QJ r4 = new X.3QJ
            r4.<init>(r7, r2, r3)
            r7.AwR(r4)
            monitor-enter(r0)
            goto L_0x111e
        L_0x1100:
            X.38t r8 = X.C633138t.A0C
            if (r5 != r8) goto L_0x1107
            r33 = 2
            goto L_0x108d
        L_0x1107:
            X.38t r8 = X.C633138t.A05
            if (r5 != r8) goto L_0x110e
            r33 = 4
            goto L_0x108d
        L_0x110e:
            X.38t r8 = X.C633138t.A04
            if (r5 != r8) goto L_0x1116
            r33 = 11
            goto L_0x108d
        L_0x1116:
            X.38t r8 = X.C633138t.A0b
            if (r5 != r8) goto L_0x108d
            r33 = 16
            goto L_0x108d
        L_0x111e:
            boolean r4 = r0.containsKey(r3)     // Catch:{ all -> 0x1159 }
            if (r4 != 0) goto L_0x1140
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x1159 }
            java.lang.String r4 = "mediadownloadmanager/queueexpresspathdownload enqueue media job: "
            r5.append(r4)     // Catch:{ all -> 0x1159 }
            r5.append(r7)     // Catch:{ all -> 0x1159 }
            java.lang.String r4 = " enc hash: "
            X.C18260x0.A0s(r4, r3, r5)     // Catch:{ all -> 0x1159 }
            r0.put(r3, r7)     // Catch:{ all -> 0x1159 }
            X.4FS r2 = r2.A0h     // Catch:{ all -> 0x1159 }
            r2.BkM(r7)     // Catch:{ all -> 0x1159 }
        L_0x113d:
            monitor-exit(r0)     // Catch:{ all -> 0x1159 }
            goto L_0x0f04
        L_0x1140:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x1159 }
            java.lang.String r2 = "mediadownloadmanager/queueexpresspathdownload media job: "
            r4.append(r2)     // Catch:{ all -> 0x1159 }
            r4.append(r7)     // Catch:{ all -> 0x1159 }
            java.lang.String r2 = " already exists enc hash: "
            X.C18260x0.A0s(r2, r3, r4)     // Catch:{ all -> 0x1159 }
            goto L_0x113d
        L_0x1152:
            java.lang.String r0 = "DecryptMessageHandler/handleMediaNotifyMessage wrong data in medianotify message"
        L_0x1154:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0f04
        L_0x1159:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x1159 }
            throw r1
        L_0x115c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x115c }
            throw r1
        L_0x115f:
            r1 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x115f }
            throw r1
        L_0x1162:
            r1 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x1162 }
            throw r1
        L_0x1165:
            boolean r2 = X.C624134x.A0d(r0)
            if (r2 == 0) goto L_0x1171
            X.2qj r1 = r1.A05
            r1.A03(r0)
            return
        L_0x1171:
            X.5rC r3 = r1.A00
            boolean r2 = r3.A07()
            if (r2 == 0) goto L_0x11b1
            r3.A04()
            com.whatsapp.jid.UserJid r2 = r0.A0o()
            boolean r2 = X.C155477ey.A00(r2)
            if (r2 == 0) goto L_0x11b1
            X.2qz r2 = r1.A0D
            X.2z0 r4 = r0.A1J
            X.34x r2 = r2.A05(r4)
            if (r2 != 0) goto L_0x11a7
            X.2qj r2 = r1.A05
            X.34x r2 = r2.A01(r4)
            if (r2 != 0) goto L_0x11a7
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "DecryptMessageHandler/handleBotResponseFirstMessage/storing first msg: "
            X.C18260x0.A1R(r3, r2, r4)
            X.3Lv r1 = r1.A02
            r1.A08(r0)
            return
        L_0x11a7:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DecryptMessageHandler/handleBotResponseFirstMessage/first msg already stored: "
            X.C18260x0.A1R(r1, r0, r4)
            return
        L_0x11b1:
            X.4F4 r5 = r1.A01
            X.2pu r3 = r0.A0t()
            boolean r2 = X.C624134x.A0g(r0)
            if (r2 == 0) goto L_0x11e4
            if (r3 == 0) goto L_0x11e4
            java.lang.Long r2 = r3.A03()
            if (r2 == 0) goto L_0x11cf
            long r7 = r2.longValue()
            r3 = 0
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x11e4
        L_0x11cf:
            X.1EU r2 = r6.A0L
            if (r2 == 0) goto L_0x11d7
            byte[] r15 = r2.A0F()
        L_0x11d7:
            r5.BEv(r0, r15)
            goto L_0x11de
        L_0x11db:
            r3.close()
        L_0x11de:
            X.33Y r1 = r1.A0B
            r1.A04(r0)
            return
        L_0x11e4:
            X.3Lv r5 = r1.A02
            r5.A08(r0)
            X.2pu r2 = r0.A0t()
            if (r2 == 0) goto L_0x120e
            boolean r0 = r2 instanceof X.C30211m5
            if (r0 == 0) goto L_0x120e
            X.2kn r0 = r2.A02()
            if (r0 == 0) goto L_0x120e
            X.2qz r1 = r1.A0D
            X.2z0 r0 = r0.A01
            X.34x r4 = r1.A05(r0)
            if (r4 == 0) goto L_0x120e
            r0 = 16
            long r2 = r4.A1P
            long r0 = (long) r0
            long r2 = r2 | r0
            r4.A1P = r2
            r5.A0Y(r4)
        L_0x120e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47532dP.A00(X.34x, X.3ST):void");
    }

    public C47532dP(C116985rC r1, AnonymousClass4F4 r2, C66543Lv r3, AnonymousClass2R5 r4, AnonymousClass30G r5, C55672qj r6, C56412rw r7, C620333f r8, C50562iN r9, C620133d r10, AnonymousClass2TN r11, AnonymousClass33Y r12, C55892r5 r13, C55832qz r14) {
        this.A0B = r12;
        this.A02 = r3;
        this.A04 = r5;
        this.A0D = r14;
        this.A0A = r11;
        this.A0C = r13;
        this.A07 = r8;
        this.A00 = r1;
        this.A05 = r6;
        this.A09 = r10;
        this.A01 = r2;
        this.A03 = r4;
        this.A08 = r9;
        this.A06 = r7;
    }
}
