package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.1pW  reason: invalid class name and case insensitive filesystem */
public class C32071pW extends C32151pe {
    public static final Set A04 = C18280x3.A0h(new String[]{"offer", "accept", "reject", "enc_rekey"});
    public final C56972sr A00;
    public final C56612sH A01;
    public final AnonymousClass2RV A02;
    public final AnonymousClass4BY A03;

    public C32071pW(C55682qk r10, C56972sr r11, C56612sH r12, AnonymousClass1VX r13, AnonymousClass4FV r14, C60592yo r15, C67813Qt r16, AnonymousClass31C r17, AnonymousClass2RV r18, AnonymousClass4BY r19, Map map) {
        super(r10, r13, r14, r15, r16, r17, map);
        this.A01 = r12;
        this.A00 = r11;
        this.A03 = r19;
        this.A02 = r18;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: X.2Ov} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r3v69, types: [X.2Ov] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02f9, code lost:
        if (r5.A00() != null) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0301, code lost:
        throw X.AnonymousClass24Y.A01("Sender receipts must have a recipient or participant jid");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0302, code lost:
        if (r10 == false) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0304, code lost:
        if (r13 != null) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x030e, code lost:
        if ((X.C627336j.A02(r5.A02) instanceof X.C95804uY) != false) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0316, code lost:
        throw X.AnonymousClass24Y.A01("Read-self receipts must have a recipient jid");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0317, code lost:
        r24 = r5.A02;
        r10 = X.C627336j.A02(r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x031f, code lost:
        if (r13 == null) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0325, code lost:
        if (X.C627336j.A0K(r10) != false) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0329, code lost:
        if ((r10 instanceof X.C135166kE) != false) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x032b, code lost:
        X.C626936e.A06(r13);
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0338, code lost:
        if ("delivery".equals(r9) == false) goto L_0x039e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x033a, code lost:
        r3 = r1.A0l("biz");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x033e, code lost:
        if (r3 == null) goto L_0x039e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0340, code lost:
        r22 = X.AnonymousClass36K.A0B(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0344, code lost:
        r3 = r1.A0k(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x034f, code lost:
        if (X.AnonymousClass36K.A0W(r3, "participants") == false) goto L_0x0421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0351, code lost:
        r21 = r3.A0q("key");
        r20 = X.AnonymousClass2z0.A05(r13, r21, r12);
        r14 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x035f, code lost:
        if (r14 == null) goto L_0x06f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0361, code lost:
        r13 = r14.length;
        r12 = X.AnonymousClass002.A0I(r13);
        r11 = new java.util.HashSet(r13);
        r3 = r0.A01.A0H() / 1000;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0376, code lost:
        if (r10 >= r13) goto L_0x03a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0378, code lost:
        r9 = r14[r10];
        r1 = r9.A0g(r28, "jid");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0382, code lost:
        if (r1 == null) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0384, code lost:
        r15 = com.whatsapp.jid.DeviceJid.of(r1);
        X.C18320x8.A1F(r15, java.lang.Long.valueOf(r9.A0e("t", r3) * 1000), r12);
        r11.add(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x039b, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x039e, code lost:
        r22 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03a1, code lost:
        r13 = r0.A03.BLb(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03a8, code lost:
        r1 = X.AnonymousClass0x9.A0C(r12, r11);
        r3 = (java.util.List) r1.first;
        r29.A02 = r21;
        r29.A03 = (java.util.Set) r1.second;
        r29.A03(2);
        r4 = r0.A04;
        r2 = X.AnonymousClass001.A0o();
        r2.append("ConnectionThreadRequestsImpl/receipt-from-multiple-targets id=");
        X.AnonymousClass2z0.A0A(r20, r2);
        r2.append("; remoteJid=");
        r2.append(r24);
        r2.append("; participant=");
        r2.append(com.whatsapp.jid.DeviceJid.of(r5.A01));
        r2.append("; status=");
        r2.append(r7);
        r2.append("; offline=");
        r2.append(r23);
        r2.append("; targetTimestampPairList=");
        r2.append(r3);
        X.C18260x0.A1R(r2, "; receiptPrivacyMode=", r22);
        r0 = r4.A01;
        r1 = X.C18290x4.A0J(1, new X.C67793Qr(r24, r20, r22, r5, r3, r7, X.AnonymousClass000.A1W(r23)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0425, code lost:
        if (X.AnonymousClass36K.A0W(r3, "biz") == false) goto L_0x04a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0427, code lost:
        r9 = new X.AnonymousClass2z0[]{X.AnonymousClass2z0.A05(r13, r4, r12)};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x042f, code lost:
        r3 = X.C615531h.A03(X.AnonymousClass36K.A0L(r1, "t")) * 1000;
        r29.A03(2);
        r10 = r0.A04;
        r6 = X.AnonymousClass001.A0o();
        r6.append("ConnectionThreadRequestsImpl/receipt-from-target keys=");
        X.C18320x8.A1P(r6, r9);
        r6.append("; remoteJid=");
        r6.append(r24);
        r6.append("; participant=");
        r2 = r5.A01;
        r6.append(com.whatsapp.jid.DeviceJid.of(r2));
        r6.append("; status=");
        r6.append(r7);
        r6.append("; timestamp=");
        r6.append(r3);
        r6.append("; offline=");
        r6.append(r23);
        X.C18260x0.A1R(r6, "; receiptPrivacyMode=", r22);
        r0 = r10.A01;
        r1 = X.C18290x4.A0J(1, new X.C67803Qs(com.whatsapp.jid.DeviceJid.of(r2), r24, r22, r5, r9, r7, r3, X.AnonymousClass000.A1W(r23)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x04a7, code lost:
        r9 = r1.A03;
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x04aa, code lost:
        if (r9 == null) goto L_0x04d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x04ad, code lost:
        if (r9.length != 1) goto L_0x04d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x04af, code lost:
        r9 = r9[0];
        X.AnonymousClass36K.A0N(r9, "list");
        r10 = r9.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x04b8, code lost:
        if (r10 == null) goto L_0x04d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x04ba, code lost:
        r9 = r10.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x04bb, code lost:
        r11 = new java.lang.String[(r9 + 1)];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x04bf, code lost:
        r11[r15] = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x04c1, code lost:
        if (r15 >= r9) goto L_0x04d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x04c3, code lost:
        r4 = r10[r15];
        X.AnonymousClass36K.A0N(r4, "item");
        r4 = X.AnonymousClass36K.A0L(r4, androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        r15 = r15 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x04d3, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x04d5, code lost:
        r11 = new java.lang.String[]{r4};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x04d9, code lost:
        r4 = r11.length;
        r9 = new X.AnonymousClass2z0[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x04dc, code lost:
        if (r14 >= r4) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04de, code lost:
        r9[r14] = X.AnonymousClass2z0.A05(r13, r11[r14], r12);
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x06ff, code lost:
        throw X.AnonymousClass24Y.A01("ReceiptStanzaHandler/handleSuccessfulMessageReceipt empty participants");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01b7, code lost:
        if (r0.A00.A0a(X.C627336j.A02(r5.A02)) == false) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x028f, code lost:
        throw X.AnonymousClass002.A0E("invalid type");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02bd, code lost:
        if (r9.equals(r3) == false) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02bf, code lost:
        r7 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02d8, code lost:
        r13 = r5.A03;
        r10 = "read-self".equals(r9);
        r3 = "sender".equals(r9);
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02e9, code lost:
        if (r13 == null) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02eb, code lost:
        if (r3 == false) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02ed, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02ee, code lost:
        if (r10 == false) goto L_0x02f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02f0, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02f1, code lost:
        if (r3 == false) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02f3, code lost:
        if (r13 != null) goto L_0x0302;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x06d1  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x06d5  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x06d9  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x06dd  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02cd  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.AnonymousClass36K r46, java.lang.Integer r47, java.util.Map r48) {
        /*
            r45 = this;
            long r43 = android.os.SystemClock.uptimeMillis()
            java.lang.Class<com.whatsapp.jid.Jid> r28 = com.whatsapp.jid.Jid.class
            java.lang.String r2 = "from"
            r1 = r46
            r0 = r28
            com.whatsapp.jid.Jid r14 = r1.A0g(r0, r2)
            java.lang.String r27 = "id"
            r0 = r27
            java.lang.String r4 = r1.A0q(r0)
            java.lang.String r26 = "type"
            java.lang.String r25 = "delivery"
            r2 = r26
            r0 = r25
            java.lang.String r3 = r1.A0r(r2, r0)
            java.lang.String r24 = "category"
            r6 = 0
            r0 = r24
            java.lang.String r22 = r1.A0r(r0, r6)
            java.lang.String r11 = "participant"
            r0 = r28
            com.whatsapp.jid.Jid r5 = r1.A0g(r0, r11)
            java.lang.Class<com.whatsapp.jid.UserJid> r21 = com.whatsapp.jid.UserJid.class
            java.lang.String r20 = "recipient"
            r2 = r21
            r0 = r20
            com.whatsapp.jid.UserJid r9 = X.AnonymousClass36K.A0A(r1, r2, r0)
            java.lang.String r0 = "edit"
            java.lang.String r19 = r1.A0r(r0, r6)
            java.lang.String r18 = "offline"
            r0 = r18
            java.lang.String r7 = r1.A0r(r0, r6)
            if (r7 == 0) goto L_0x0064
            java.lang.Integer r23 = java.lang.Integer.valueOf(r7)     // Catch:{ NumberFormatException -> 0x005a }
            goto L_0x0066
        L_0x005a:
            r6 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "connection/handleReceipt: got bad offline="
            X.C18260x0.A0u(r0, r7, r2, r6)
        L_0x0064:
            r23 = 0
        L_0x0066:
            X.4uZ r7 = X.C627336j.A02(r14)
            if (r9 == 0) goto L_0x06dd
            boolean r0 = X.C627336j.A0K(r7)
            if (r0 != 0) goto L_0x06dd
            r7 = r9
        L_0x0073:
            java.lang.String r10 = "retry"
            boolean r17 = r10.equals(r3)
            if (r17 == 0) goto L_0x06d9
            X.36K r6 = r1.A0m(r10)
            java.lang.String r2 = "v"
            java.lang.String r0 = "1"
            java.lang.String r38 = r6.A0r(r2, r0)
        L_0x0089:
            int r40 = X.AnonymousClass36M.A05(r7)
            if (r5 == 0) goto L_0x06d5
            r0 = 1
            com.whatsapp.jid.Jid[] r2 = new com.whatsapp.jid.Jid[r0]
            r0 = 0
            r2[r0] = r5
            java.util.HashSet r39 = X.C73833g9.A03(r2)
        L_0x0099:
            r0 = r45
            X.2RV r2 = r0.A02
            if (r3 != 0) goto L_0x06d1
            java.lang.String r37 = ""
        L_0x00a1:
            r8 = 1
            java.util.concurrent.atomic.AtomicLong r6 = r2.A04
            long r41 = r6.getAndIncrement()
            X.2sH r13 = r2.A01
            X.2qk r12 = r2.A00
            X.4FV r7 = r2.A02
            X.2r5 r6 = r2.A03
            X.1gT r2 = new X.1gT
            r35 = r47
            r29 = r2
            r30 = r12
            r31 = r13
            r32 = r7
            r33 = r6
            r34 = r23
            r36 = r4
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r43)
            r6.A06(r2)
            long r15 = r2.A03
            r6 = 2
            java.lang.Integer r31 = java.lang.Integer.valueOf(r6)
            r7 = 0
            java.lang.Integer r33 = java.lang.Integer.valueOf(r40)
            r34 = r7
            r29 = r0
            r30 = r23
            r32 = r7
            r35 = r3
            r29.A01(r30, r31, r32, r33, r34, r35)
            X.2i8 r14 = X.C50412i8.A00(r14)
            java.lang.String r13 = "receipt"
            r14.A05 = r13
            r14.A07 = r4
            r14.A08 = r3
            r12 = r22
            r14.A04 = r12
            r14.A01 = r5
            r14.A03 = r9
            r5 = r19
            r14.A06 = r5
            r14.A00 = r15
            X.39T r5 = r14.A01()
            r12 = r25
            boolean r12 = r12.equals(r3)
            java.lang.String r14 = "error"
            if (r12 == 0) goto L_0x0162
            r3 = 0
            X.36K r9 = r1.A0k(r3)
            if (r9 == 0) goto L_0x027d
            java.util.Set r7 = A04
            java.lang.String r3 = r9.A00
            boolean r3 = r7.contains(r3)
            if (r3 == 0) goto L_0x027d
            r2.A03(r6)
            com.whatsapp.jid.Jid r2 = r5.A02
            com.whatsapp.jid.DeviceJid r6 = com.whatsapp.jid.DeviceJid.of(r2)
            if (r6 == 0) goto L_0x06ea
            com.whatsapp.protocol.VoipStanzaChildNode r2 = com.whatsapp.protocol.VoipStanzaChildNode.fromProtocolTreeNode(r9)
            X.2yo r4 = r0.A04
            java.lang.String r1 = r5.A07
            X.C626936e.A06(r1)
            X.2Lr r3 = new X.2Lr
            r3.<init>(r6, r2)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "ConnectionThreadRequestsImpl/on-call-incoming-receipt tag="
            r2.append(r1)
            com.whatsapp.protocol.VoipStanzaChildNode r1 = r3.A01
            java.lang.String r1 = r1.tag
            r2.append(r1)
            java.lang.String r1 = " from="
            r2.append(r1)
            com.whatsapp.jid.DeviceJid r1 = r3.A00
            r2.append(r1)
            java.lang.String r1 = " type=delivery"
            X.C18260x0.A1L(r2, r1)
            X.4Ag r2 = r4.A01
            r1 = 197(0xc5, float:2.76E-43)
            X.AnonymousClass0x7.A19(r2, r3, r1)
        L_0x015c:
            X.31C r0 = r0.A01
            r0.A0H(r5)
            return
        L_0x0162:
            java.lang.String r12 = "inactive"
            boolean r12 = r12.equals(r3)
            if (r12 != 0) goto L_0x027d
            java.lang.String r12 = "sender"
            boolean r12 = r12.equals(r3)
            if (r12 != 0) goto L_0x027d
            java.lang.String r12 = "played"
            boolean r12 = r12.equals(r3)
            if (r12 != 0) goto L_0x027d
            java.lang.String r12 = "played-self"
            boolean r12 = r12.equals(r3)
            if (r12 != 0) goto L_0x027d
            java.lang.String r12 = "read"
            boolean r12 = r12.equals(r3)
            if (r12 != 0) goto L_0x027d
            java.lang.String r12 = "read-self"
            boolean r12 = r12.equals(r3)
            if (r12 != 0) goto L_0x027d
            java.lang.String r4 = "server-error"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x04e9
            java.lang.String r4 = "rmr"
            X.36K r12 = r1.A0l(r4)
            r10 = 1
            if (r12 != 0) goto L_0x01b9
            r10 = 0
            X.2sr r8 = r0.A00
            com.whatsapp.jid.Jid r4 = r5.A02
            X.4uZ r4 = X.C627336j.A02(r4)
            boolean r4 = r8.A0a(r4)
            if (r4 != 0) goto L_0x06b4
        L_0x01b9:
            com.whatsapp.jid.Jid r15 = r5.A02
            r9 = r15
            X.C626936e.A06(r15)
            com.whatsapp.jid.UserJid r4 = r5.A00()
            if (r10 == 0) goto L_0x027a
            java.lang.String r8 = "jid"
            r4 = r28
            com.whatsapp.jid.Jid r15 = r12.A0g(r4, r8)
            java.lang.String r4 = "from_me"
            boolean r8 = X.AnonymousClass36K.A0X(r12, r4, r7)
            r4 = r21
            com.whatsapp.jid.Jid r4 = r12.A0g(r4, r11)
        L_0x01d9:
            if (r15 == 0) goto L_0x06b4
            java.lang.String r3 = "encrypt"
            X.36K r3 = r1.A0l(r3)
            r2.A03(r6)
            X.2yo r1 = r0.A04
            java.lang.String r0 = "enc_p"
            r6 = 0
            if (r3 == 0) goto L_0x01f3
            X.36K r0 = r3.A0l(r0)
            if (r0 == 0) goto L_0x01f3
            byte[] r7 = r0.A01
        L_0x01f3:
            java.lang.String r12 = "enc_iv"
            if (r3 == 0) goto L_0x01ff
            X.36K r0 = r3.A0l(r12)
            if (r0 == 0) goto L_0x01ff
            byte[] r6 = r0.A01
        L_0x01ff:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/server-error-for-target remote_jid = "
            X.AnonymousClass0x7.A1G(r2, r0, r15)
            java.lang.String r14 = r5.A07
            r2.append(r14)
            java.lang.String r0 = "; participant="
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = "; recipient="
            r2.append(r0)
            com.whatsapp.jid.UserJid r13 = r5.A03
            r2.append(r13)
            java.lang.String r0 = "; fromMe="
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = "; isMdRmr="
            X.C18260x0.A1E(r0, r2, r10)
            X.4Ag r2 = r1.A01
            java.lang.String r3 = r5.A04
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            X.C384027k.A00(r1, r4, r11)
            java.lang.String r0 = "msgid"
            r1.putString(r0, r14)
            java.lang.String r0 = "remote_jid"
            X.C384027k.A00(r1, r15, r0)
            java.lang.String r0 = "from_me"
            r1.putBoolean(r0, r8)
            r0 = r20
            X.C384027k.A00(r1, r13, r0)
            java.lang.String r0 = "enc_data"
            r1.putByteArray(r0, r7)
            r1.putByteArray(r12, r6)
            java.lang.String r0 = "is_md_rmr"
            r1.putBoolean(r0, r10)
            r0 = r24
            r1.putString(r0, r3)
            java.lang.String r0 = "requester"
            X.C384027k.A00(r1, r9, r0)
            r0 = 69
            X.AnonymousClass0x7.A19(r2, r1, r0)
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "stanzaKey"
            r1.putParcelable(r0, r5)
            r0 = 85
            X.AnonymousClass0x7.A19(r2, r1, r0)
            return
        L_0x027a:
            r8 = 1
            goto L_0x01d9
        L_0x027d:
            java.lang.String r9 = r5.A08
            X.C626936e.A06(r9)
            int r3 = r9.hashCode()
            switch(r3) {
                case -1159650013: goto L_0x02cd;
                case -985752877: goto L_0x02c1;
                case -905962955: goto L_0x02b6;
                case 3496342: goto L_0x02aa;
                case 24665195: goto L_0x029f;
                case 110109190: goto L_0x0293;
                case 823466996: goto L_0x0290;
                default: goto L_0x0289;
            }
        L_0x0289:
            java.lang.String r0 = "invalid type"
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x0290:
            java.lang.String r3 = "delivery"
            goto L_0x02b9
        L_0x0293:
            java.lang.String r3 = "played-self"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0289
            r7 = 18
            goto L_0x02d8
        L_0x029f:
            java.lang.String r3 = "inactive"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0289
            r7 = 15
            goto L_0x02d8
        L_0x02aa:
            java.lang.String r3 = "read"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0289
            r7 = 13
            goto L_0x02d8
        L_0x02b6:
            java.lang.String r3 = "sender"
        L_0x02b9:
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0289
            r7 = 5
            goto L_0x02d8
        L_0x02c1:
            java.lang.String r3 = "played"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0289
            r7 = 8
            goto L_0x02d8
        L_0x02cd:
            java.lang.String r3 = "read-self"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0289
            r7 = 17
        L_0x02d8:
            com.whatsapp.jid.UserJid r13 = r5.A03
            java.lang.String r3 = "read-self"
            boolean r10 = r3.equals(r9)
            java.lang.String r3 = "sender"
            boolean r3 = r3.equals(r9)
            r14 = 0
            if (r13 == 0) goto L_0x02ed
            if (r3 == 0) goto L_0x02f0
        L_0x02ed:
            r12 = 1
            if (r10 == 0) goto L_0x02f1
        L_0x02f0:
            r12 = 0
        L_0x02f1:
            if (r3 == 0) goto L_0x0302
            if (r13 != 0) goto L_0x0302
            com.whatsapp.jid.UserJid r3 = r5.A00()
            if (r3 != 0) goto L_0x0302
            java.lang.String r0 = "Sender receipts must have a recipient or participant jid"
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            throw r0
        L_0x0302:
            if (r10 == 0) goto L_0x0317
            if (r13 != 0) goto L_0x0317
            com.whatsapp.jid.Jid r3 = r5.A02
            X.4uZ r3 = X.C627336j.A02(r3)
            boolean r3 = r3 instanceof X.C95804uY
            if (r3 != 0) goto L_0x0317
            java.lang.String r0 = "Read-self receipts must have a recipient jid"
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            throw r0
        L_0x0317:
            com.whatsapp.jid.Jid r3 = r5.A02
            r24 = r3
            X.4uZ r10 = X.C627336j.A02(r24)
            if (r13 == 0) goto L_0x03a1
            boolean r3 = X.C627336j.A0K(r10)
            if (r3 != 0) goto L_0x03a1
            boolean r3 = r10 instanceof X.C135166kE
            if (r3 != 0) goto L_0x03a1
        L_0x032b:
            X.C626936e.A06(r13)
            X.4uZ r13 = (X.C95814uZ) r13
            r3 = r25
            boolean r3 = r3.equals(r9)
            java.lang.String r10 = "biz"
            if (r3 == 0) goto L_0x039e
            X.36K r3 = r1.A0l(r10)
            if (r3 == 0) goto L_0x039e
            X.3ZC r22 = X.AnonymousClass36K.A0B(r3)
        L_0x0344:
            X.36K r3 = r1.A0k(r14)
            java.lang.String r9 = "participants"
            boolean r9 = X.AnonymousClass36K.A0W(r3, r9)
            if (r9 == 0) goto L_0x0421
            java.lang.String r1 = "key"
            java.lang.String r21 = r3.A0q(r1)
            r1 = r21
            X.2z0 r20 = X.AnonymousClass2z0.A05(r13, r1, r12)
            X.36K[] r14 = r3.A03
            if (r14 == 0) goto L_0x06f9
            int r13 = r14.length
            java.util.ArrayList r12 = X.AnonymousClass002.A0I(r13)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>(r13)
            X.2sH r1 = r0.A01
            long r3 = r1.A0H()
            r18 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r18
            r10 = 0
        L_0x0376:
            if (r10 >= r13) goto L_0x03a8
            r9 = r14[r10]
            java.lang.String r15 = "jid"
            r1 = r28
            com.whatsapp.jid.Jid r1 = r9.A0g(r1, r15)
            if (r1 == 0) goto L_0x039b
            com.whatsapp.jid.DeviceJid r15 = com.whatsapp.jid.DeviceJid.of(r1)
            java.lang.String r1 = "t"
            long r16 = r9.A0e(r1, r3)
            long r16 = r16 * r18
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            X.C18320x8.A1F(r15, r1, r12)
            r11.add(r15)
        L_0x039b:
            int r10 = r10 + 1
            goto L_0x0376
        L_0x039e:
            r22 = 0
            goto L_0x0344
        L_0x03a1:
            X.4BY r3 = r0.A03
            X.4uZ r13 = r3.BLb(r10)
            goto L_0x032b
        L_0x03a8:
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r12, r11)
            java.lang.Object r3 = r1.first
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r1.second
            java.util.Set r4 = (java.util.Set) r4
            r1 = r21
            r2.A02 = r1
            r2.A03 = r4
            r2.A03(r6)
            X.2yo r4 = r0.A04
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/receipt-from-multiple-targets id="
            r2.append(r0)
            r0 = r20
            X.AnonymousClass2z0.A0A(r0, r2)
            java.lang.String r0 = "; remoteJid="
            r2.append(r0)
            r0 = r24
            r2.append(r0)
            java.lang.String r0 = "; participant="
            r2.append(r0)
            com.whatsapp.jid.Jid r0 = r5.A01
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.of(r0)
            r2.append(r0)
            java.lang.String r0 = "; status="
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = "; offline="
            r2.append(r0)
            r0 = r23
            r2.append(r0)
            java.lang.String r0 = "; targetTimestampPairList="
            r2.append(r0)
            r2.append(r3)
            java.lang.String r1 = "; receiptPrivacyMode="
            r0 = r22
            X.C18260x0.A1R(r2, r1, r0)
            X.4Ag r0 = r4.A01
            boolean r16 = X.AnonymousClass000.A1W(r23)
            X.3Qr r1 = new X.3Qr
            r9 = r1
            r10 = r24
            r11 = r20
            r12 = r22
            r13 = r5
            r14 = r3
            r15 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            android.os.Message r1 = X.C18290x4.A0J(r8, r1)
            goto L_0x05c7
        L_0x0421:
            boolean r3 = X.AnonymousClass36K.A0W(r3, r10)
            if (r3 == 0) goto L_0x04a7
            X.2z0 r3 = X.AnonymousClass2z0.A05(r13, r4, r12)
            X.2z0[] r9 = new X.AnonymousClass2z0[r8]
            r9[r14] = r3
        L_0x042f:
            java.lang.String r3 = "t"
            java.lang.String r1 = X.AnonymousClass36K.A0L(r1, r3)
            long r3 = X.C615531h.A03(r1)
            r10 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r10
            r2.A03(r6)
            X.2yo r10 = r0.A04
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/receipt-from-target keys="
            r6.append(r0)
            X.C18320x8.A1P(r6, r9)
            java.lang.String r0 = "; remoteJid="
            r6.append(r0)
            r0 = r24
            r6.append(r0)
            java.lang.String r0 = "; participant="
            r6.append(r0)
            com.whatsapp.jid.Jid r2 = r5.A01
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.of(r2)
            r6.append(r0)
            java.lang.String r0 = "; status="
            r6.append(r0)
            r6.append(r7)
            java.lang.String r0 = "; timestamp="
            r6.append(r0)
            r6.append(r3)
            java.lang.String r0 = "; offline="
            r6.append(r0)
            r0 = r23
            r6.append(r0)
            java.lang.String r1 = "; receiptPrivacyMode="
            r0 = r22
            X.C18260x0.A1R(r6, r1, r0)
            X.4Ag r0 = r10.A01
            com.whatsapp.jid.DeviceJid r11 = com.whatsapp.jid.DeviceJid.of(r2)
            boolean r19 = X.AnonymousClass000.A1W(r23)
            X.3Qs r1 = new X.3Qs
            r10 = r1
            r12 = r24
            r13 = r22
            r14 = r5
            r15 = r9
            r16 = r7
            r17 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r19)
            android.os.Message r1 = X.C18290x4.A0J(r8, r1)
            goto L_0x05c7
        L_0x04a7:
            X.36K[] r9 = r1.A03
            r15 = 0
            if (r9 == 0) goto L_0x04d5
            int r3 = r9.length
            if (r3 != r8) goto L_0x04d5
            r9 = r9[r14]
            java.lang.String r3 = "list"
            X.AnonymousClass36K.A0N(r9, r3)
            X.36K[] r10 = r9.A03
            if (r10 == 0) goto L_0x04d3
            int r9 = r10.length
        L_0x04bb:
            int r3 = r9 + 1
            java.lang.String[] r11 = new java.lang.String[r3]
        L_0x04bf:
            r11[r15] = r4
            if (r15 >= r9) goto L_0x04d9
            r4 = r10[r15]
            java.lang.String r3 = "item"
            X.AnonymousClass36K.A0N(r4, r3)
            r3 = r27
            java.lang.String r4 = X.AnonymousClass36K.A0L(r4, r3)
            int r15 = r15 + 1
            goto L_0x04bf
        L_0x04d3:
            r9 = 0
            goto L_0x04bb
        L_0x04d5:
            java.lang.String[] r11 = new java.lang.String[r8]
            r11[r14] = r4
        L_0x04d9:
            int r4 = r11.length
            X.2z0[] r9 = new X.AnonymousClass2z0[r4]
        L_0x04dc:
            if (r14 >= r4) goto L_0x042f
            r3 = r11[r14]
            X.2z0 r3 = X.AnonymousClass2z0.A05(r13, r3, r12)
            r9[r14] = r3
            int r14 = r14 + 1
            goto L_0x04dc
        L_0x04e9:
            if (r17 == 0) goto L_0x05cf
            X.36K r4 = r1.A0m(r10)
            java.lang.String r10 = "registration"
            X.36K r10 = r1.A0m(r10)
            byte[] r12 = r10.A01
            if (r12 == 0) goto L_0x0708
            int r11 = r12.length
            r10 = 4
            if (r11 != r10) goto L_0x0708
            java.lang.String r10 = "v"
            java.lang.String r11 = "1"
            java.lang.String r10 = r4.A0r(r10, r11)
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x06b4
            java.lang.String r3 = "count"
            int r31 = r4.A0b(r3, r8)
            long r32 = X.AnonymousClass36K.A03(r4)
            r3 = r27
            java.lang.String r10 = r4.A0q(r3)
            if (r9 != 0) goto L_0x0525
            com.whatsapp.jid.Jid r3 = r5.A02
            X.4uZ r9 = X.C627336j.A02(r3)
        L_0x0525:
            X.2z0 r23 = X.AnonymousClass2z0.A05(r9, r10, r8)
            java.lang.String r3 = "mediareason"
            r9 = 0
            r4.A0r(r3, r7)
            java.lang.String r3 = "keys"
            X.36K r10 = r1.A0l(r3)
            r13 = 0
            if (r10 == 0) goto L_0x05cb
            java.lang.String r3 = "identity"
            X.36K r4 = r10.A0m(r3)
            r3 = r26
            X.36K r3 = r10.A0m(r3)
            byte[] r3 = r3.A01
            if (r3 == 0) goto L_0x0700
            int r3 = r3.length
            if (r3 != r8) goto L_0x0700
            byte[] r14 = r4.A01
            java.lang.String r3 = "key"
            X.36K r4 = r10.A0m(r3)
            r3 = r27
            X.36K r8 = r4.A0m(r3)
            java.lang.String r3 = "value"
            X.36K r4 = r4.A0m(r3)
            byte[] r8 = r8.A01
            byte[] r4 = r4.A01
            X.2Ov r9 = new X.2Ov
            r9.<init>(r8, r4, r7)
            java.lang.String r4 = "skey"
            X.36K r11 = r10.A0m(r4)
            r4 = r27
            X.36K r8 = r11.A0m(r4)
            X.36K r4 = r11.A0m(r3)
            java.lang.String r3 = "signature"
            X.36K r3 = r11.A0m(r3)
            byte[] r11 = r8.A01
            byte[] r8 = r4.A01
            byte[] r4 = r3.A01
            X.2Ov r3 = new X.2Ov
            r3.<init>(r11, r8, r4)
            java.lang.String r4 = "device-identity"
            X.36K r4 = r10.A0l(r4)
            if (r4 == 0) goto L_0x0596
            byte[] r13 = r4.A01
        L_0x0596:
            r30 = r13
            r13 = r3
        L_0x0599:
            r2.A03(r6)
            X.2yo r2 = r0.A04
            r0 = r18
            java.lang.String r0 = r1.A0r(r0, r7)
            boolean r34 = X.AnonymousClass000.A1W(r0)
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-message-retry-by-target"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4Ag r0 = r2.A01
            X.2Tp r2 = new X.2Tp
            r24 = r13
            r25 = r9
            r26 = r5
            r27 = r22
            r28 = r12
            r29 = r14
            r22 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34)
            r1 = 0
            android.os.Message r1 = android.os.Message.obtain(r7, r1, r6, r1, r2)
        L_0x05c7:
            r0.Bfr(r1)
            return
        L_0x05cb:
            r14 = r7
            r30 = r7
            goto L_0x0599
        L_0x05cf:
            java.lang.String r4 = "enc_rekey_retry"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x0638
            java.lang.String r3 = "registration"
            X.36K r3 = r1.A0m(r3)
            byte[] r4 = r3.A01
            if (r4 == 0) goto L_0x070f
            int r7 = r4.length
            r3 = 4
            if (r7 != r3) goto L_0x070f
            java.lang.String r3 = "enc_rekey"
            X.36K r3 = r1.A0m(r3)
            java.lang.String r1 = "call-id"
            java.lang.String r8 = r3.A0q(r1)
            java.lang.String r1 = "count"
            int r1 = X.AnonymousClass36K.A02(r3, r1)
            byte r7 = (byte) r1
            r2.A03(r6)
            X.2yo r3 = r0.A04
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "ConnectionThreadRequestsImpl/on-call-rekey stanzaKey="
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = " callId="
            r2.append(r1)
            r2.append(r8)
            java.lang.String r1 = " retry="
            X.C18260x0.A0y(r1, r2, r7)
            X.4Ag r3 = r3.A01
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            java.lang.String r1 = "stanzaKey"
            r2.putParcelable(r1, r5)
            java.lang.String r1 = "callId"
            r2.putString(r1, r8)
            java.lang.String r1 = "registrationId"
            r2.putByteArray(r1, r4)
            r2.putByte(r10, r7)
            r1 = 150(0x96, float:2.1E-43)
            X.AnonymousClass0x7.A19(r3, r2, r1)
            goto L_0x015c
        L_0x0638:
            boolean r4 = r14.equals(r3)
            if (r4 == 0) goto L_0x0667
            X.36K r6 = r1.A0m(r14)
            r1 = r26
            java.lang.String r2 = r6.A0q(r1)
            java.lang.String r1 = "enc-v2-unknown-tags"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x015c
            java.lang.String r4 = "feature-incapable"
            boolean r1 = r4.equals(r2)
            if (r1 == 0) goto L_0x06b4
            java.lang.String r1 = "reason"
            java.lang.String r3 = r6.A0r(r1, r7)
            X.2qk r2 = r0.A01
            r1 = 0
            r2.A0A(r4, r1, r3)
            goto L_0x015c
        L_0x0667:
            java.lang.String r1 = "peer_msg"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x068e
            r2.A03(r6)
            X.2yo r2 = r0.A04
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-peer-message-receipt stanza-id="
            r1.append(r0)
            java.lang.String r0 = r5.A07
            X.C18260x0.A1L(r1, r0)
            X.4Ag r0 = r2.A01
            r2 = 0
            r1 = 221(0xdd, float:3.1E-43)
            android.os.Message r1 = android.os.Message.obtain(r7, r2, r1, r2, r5)
            goto L_0x05c7
        L_0x068e:
            java.lang.String r1 = "hist_sync"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x06b4
            r2.A03(r6)
            X.2yo r2 = r0.A04
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConnectionThreadRequestsImpl/on-history-sync-receipt stanza-id="
            r1.append(r0)
            java.lang.String r0 = r5.A07
            X.C18260x0.A1L(r1, r0)
            X.4Ag r0 = r2.A01
            r2 = 0
            r1 = 212(0xd4, float:2.97E-43)
            android.os.Message r1 = android.os.Message.obtain(r7, r2, r1, r2, r5)
            goto L_0x05c7
        L_0x06b4:
            X.2i8 r2 = r5.A02()
            java.lang.String r1 = "487"
            r2.A02(r14, r1)
            X.39T r5 = r2.A01()
            X.1Xl r2 = new X.1Xl
            r2.<init>()
            r2.A00 = r13
            r2.A01 = r3
            X.4FV r1 = r0.A03
            r1.BhD(r2)
            goto L_0x015c
        L_0x06d1:
            r37 = r3
            goto L_0x00a1
        L_0x06d5:
            r39 = 0
            goto L_0x0099
        L_0x06d9:
            r38 = 0
            goto L_0x0089
        L_0x06dd:
            if (r7 != 0) goto L_0x0073
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ChatJid is null, receipt id="
            X.24Y r0 = X.AnonymousClass24Y.A02(r0, r4, r1)
            throw r0
        L_0x06ea:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CallReceipt from invalid jid "
            java.lang.String r0 = X.AnonymousClass000.A0P(r2, r0, r1)
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            throw r0
        L_0x06f9:
            java.lang.String r0 = "ReceiptStanzaHandler/handleSuccessfulMessageReceipt empty participants"
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            throw r0
        L_0x0700:
            java.lang.String r0 = "type node should contain exactly 1 byte"
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            throw r0
        L_0x0708:
            java.lang.String r0 = "invalid registration node"
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            throw r0
        L_0x070f:
            java.lang.String r0 = "invalid registration node"
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32071pW.A03(X.36K, java.lang.Integer, java.util.Map):void");
    }
}
