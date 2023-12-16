package X;

import android.text.TextUtils;

/* renamed from: X.1Hv  reason: invalid class name */
public class AnonymousClass1Hv extends AnonymousClass3OH {
    public final C55682qk A00;
    public final C56972sr A01;
    public final C56982ss A02;
    public final AnonymousClass1VX A03;
    public final C53482nA A04;
    public final C49092fy A05;
    public final C43252Rj A06;
    public final C183538qC A07;
    public final C183538qC A08;
    public final C183538qC A09;
    public final C183538qC A0A;

    public static final C30571mf A00(C21631Co r4, AnonymousClass1ET r5, AnonymousClass2z0 r6, long j) {
        C30571mf r2 = new C30571mf(r6, j);
        C95814uZ A0S = C18310x6.A0S(r5.remoteJid_);
        C626936e.A06(A0S);
        AnonymousClass2z0 A052 = AnonymousClass2z0.A05(A0S, r5.id_, r5.fromMe_);
        AnonymousClass1ET r0 = r4.key_;
        if (r0 == null) {
            r0 = AnonymousClass1ET.DEFAULT_INSTANCE;
        }
        C30331mH.A03(AnonymousClass32Y.A08(r0.participant_), r2, A052);
        String str = r4.text_;
        r2.A01 = str;
        boolean isEmpty = TextUtils.isEmpty(str);
        int i = 0;
        if (isEmpty) {
            i = 7;
        }
        r2.A01 = i;
        r2.A00 = r4.senderTimestampMs_;
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0145, code lost:
        if (r10 == null) goto L_0x0147;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C624134x A02(X.C55962rC r24) {
        /*
            r23 = this;
            r6 = r24
            X.1EU r8 = r6.A0B
            X.2z0 r5 = r6.A0D
            int r2 = r6.A01
            int r0 = r8.bitField1_
            r0 = r0 & 16
            r4 = r23
            if (r0 == 0) goto L_0x002b
            X.1Co r1 = r8.reactionMessage_
            if (r1 != 0) goto L_0x0016
            X.1Co r1 = X.C21631Co.DEFAULT_INSTANCE
        L_0x0016:
            if (r2 == 0) goto L_0x00de
            int r0 = r1.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x00de
            java.lang.String r0 = r1.text_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00de
            java.lang.String r0 = "MessageUtils/hasValidReactionMessage edit version and text message are both set"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x002b:
            X.1VX r3 = r4.A03
            X.2sr r13 = r4.A01
            int r0 = r8.bitField1_
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x02b1
            X.1C4 r2 = r8.encReactionMessage_
            if (r2 != 0) goto L_0x003b
            X.1C4 r2 = X.AnonymousClass1C4.DEFAULT_INSTANCE
        L_0x003b:
            int r1 = r2.bitField0_
            r0 = r1 & 2
            if (r0 == 0) goto L_0x02b1
            r0 = r1 & 4
            if (r0 == 0) goto L_0x02b1
            X.1ET r0 = r2.targetMessageKey_
            if (r0 != 0) goto L_0x004b
            X.1ET r0 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x004b:
            boolean r0 = X.AnonymousClass3OH.A01(r0)
            if (r0 == 0) goto L_0x02b1
            r1 = 6771(0x1a73, float:9.488E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0137
            X.1C4 r9 = r8.encReactionMessage_
            if (r9 != 0) goto L_0x0061
            X.1C4 r9 = X.AnonymousClass1C4.DEFAULT_INSTANCE
        L_0x0061:
            X.4uZ r11 = r6.A08
            X.2nA r10 = r4.A04
            X.1ET r0 = r9.targetMessageKey_
            if (r0 != 0) goto L_0x006b
            X.1ET r0 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x006b:
            X.2kn r7 = r10.A00(r11, r0, r5)
            X.8qC r0 = r4.A08
            java.lang.Object r2 = r0.get()
            X.2qz r2 = (X.C55832qz) r2
            X.2fy r1 = r4.A05
            X.2z0 r0 = r7.A01
            X.2z0 r0 = r1.A00(r0)
            X.34x r0 = r2.A05(r0)
            if (r0 != 0) goto L_0x0093
            long r0 = r6.A05
            byte[] r2 = r8.A0F()
            X.1mf r6 = new X.1mf
            r6.<init>(r5, r2, r0)
        L_0x0090:
            r6.A05 = r7
            return r6
        L_0x0093:
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x00ba
            X.1fH r3 = r13.A0I()
        L_0x009b:
            X.8Lq r2 = r9.encIv_
            X.8Lq r1 = r9.encPayload_
            X.1ET r0 = r9.targetMessageKey_
            if (r0 != 0) goto L_0x00a5
            X.1ET r0 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x00a5:
            java.lang.String r19 = "Enc Reaction"
            X.2nT r12 = new X.2nT
            r13 = r2
            r14 = r1
            r15 = r11
            r16 = r3
            r17 = r0
            r18 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            byte[] r1 = r10.A02(r12)
            goto L_0x00c6
        L_0x00ba:
            boolean r0 = X.C627336j.A0L(r11)
            if (r0 == 0) goto L_0x00c4
            r3 = r11
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            goto L_0x009b
        L_0x00c4:
            r3 = 0
            goto L_0x009b
        L_0x00c6:
            X.1Co r0 = X.C21631Co.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x012c }
            X.6cX r3 = X.C130786cX.A05(r0, r1)     // Catch:{ 6u5 -> 0x012c }
            X.1Co r3 = (X.C21631Co) r3     // Catch:{ 6u5 -> 0x012c }
            r4.A03(r3)
            long r1 = r6.A05
            X.1ET r0 = r9.targetMessageKey_
            if (r0 != 0) goto L_0x00d9
            X.1ET r0 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x00d9:
            X.1mf r6 = A00(r3, r0, r5, r1)
            goto L_0x0090
        L_0x00de:
            X.1ET r0 = r1.key_
            if (r0 != 0) goto L_0x00e4
            X.1ET r0 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x00e4:
            boolean r0 = X.AnonymousClass3OH.A01(r0)
            if (r0 == 0) goto L_0x002b
            X.1Co r7 = r8.reactionMessage_
            if (r7 != 0) goto L_0x00f0
            X.1Co r7 = X.C21631Co.DEFAULT_INSTANCE
        L_0x00f0:
            X.4uZ r8 = r6.A08
            long r1 = r6.A05
            X.1ET r0 = r7.key_
            if (r0 != 0) goto L_0x00fa
            X.1ET r0 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x00fa:
            X.1mf r6 = A00(r7, r0, r5, r1)
            X.2sr r3 = r4.A01
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x012a
            if (r8 == 0) goto L_0x012a
        L_0x0106:
            X.1ET r2 = r7.key_
            r0 = r2
            if (r2 != 0) goto L_0x010d
            X.1ET r2 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x010d:
            if (r0 != 0) goto L_0x0111
            X.1ET r0 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x0111:
            java.lang.String r0 = r0.participant_
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A08(r0)
            X.8qC r0 = r4.A07
            r0.get()
            boolean r0 = X.C155477ey.A00(r1)
            X.2kn r0 = X.C33051sM.A00(r3, r8, r2, r5, r0)
            r6.A05 = r0
            r4.A03(r7)
            return r6
        L_0x012a:
            r8 = 0
            goto L_0x0106
        L_0x012c:
            java.lang.String r0 = "FMessageReactionProtobuf/parseEncReaction: failed to parse payload into protobuf"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            X.24W r0 = X.AnonymousClass24W.A00(r0)
            throw r0
        L_0x0137:
            X.1C4 r7 = r8.encReactionMessage_
            if (r7 != 0) goto L_0x013d
            X.1C4 r7 = X.AnonymousClass1C4.DEFAULT_INSTANCE
        L_0x013d:
            X.4uZ r10 = r6.A08
            boolean r2 = r5.A02
            r15 = 0
            if (r2 != 0) goto L_0x0147
            r1 = r10
            if (r10 != 0) goto L_0x0148
        L_0x0147:
            r1 = r15
        L_0x0148:
            X.1ET r0 = r7.targetMessageKey_
            if (r0 != 0) goto L_0x014e
            X.1ET r0 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x014e:
            r9 = 0
            X.2kn r3 = X.C33051sM.A00(r13, r1, r0, r5, r9)
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A03(r10)
            if (r2 == 0) goto L_0x015a
            goto L_0x0162
        L_0x015a:
            boolean r0 = X.C627336j.A0L(r1)     // Catch:{ 1pE -> 0x02a3 }
            if (r0 == 0) goto L_0x0166
            r15 = r1
            goto L_0x0166
        L_0x0162:
            X.1fH r15 = r13.A0I()     // Catch:{ 1pE -> 0x02a3 }
        L_0x0166:
            X.8qC r14 = r4.A08     // Catch:{ 1pE -> 0x02a3 }
            java.lang.Object r0 = r14.get()     // Catch:{ 1pE -> 0x02a3 }
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch:{ 1pE -> 0x02a3 }
            if (r0 == 0) goto L_0x0267
            X.8qC r11 = r4.A0A     // Catch:{ 1pE -> 0x02a3 }
            if (r11 == 0) goto L_0x0267
            X.8qC r10 = r4.A09     // Catch:{ 1pE -> 0x02a3 }
            if (r10 == 0) goto L_0x0267
            X.2fy r12 = r4.A05     // Catch:{ 1pE -> 0x02a3 }
            X.2z0 r0 = r3.A01     // Catch:{ 1pE -> 0x02a3 }
            X.2z0 r12 = r12.A00(r0)     // Catch:{ 1pE -> 0x02a3 }
            java.lang.Object r0 = r14.get()     // Catch:{ 1pE -> 0x02a3 }
            X.2qz r0 = (X.C55832qz) r0     // Catch:{ 1pE -> 0x02a3 }
            X.34x r12 = r0.A05(r12)     // Catch:{ 1pE -> 0x02a3 }
            if (r12 == 0) goto L_0x025c
            X.2z0 r0 = r12.A1J     // Catch:{ 1pE -> 0x02a3 }
            X.C626936e.A06(r0)     // Catch:{ 1pE -> 0x02a3 }
            boolean r0 = r0.A02     // Catch:{ 1pE -> 0x02a3 }
            if (r0 == 0) goto L_0x019d
            com.whatsapp.jid.PhoneUserJid r14 = X.C56972sr.A04(r13)     // Catch:{ 1pE -> 0x02a3 }
            goto L_0x01a3
        L_0x019d:
            X.4uZ r14 = r12.A0n()     // Catch:{ 1pE -> 0x02a3 }
            com.whatsapp.jid.UserJid r14 = (com.whatsapp.jid.UserJid) r14     // Catch:{ 1pE -> 0x02a3 }
        L_0x01a3:
            if (r14 == 0) goto L_0x0243
            if (r15 == 0) goto L_0x0243
            java.lang.Object r11 = r11.get()     // Catch:{ 1pE -> 0x02a3 }
            X.2eA r11 = (X.C47992eA) r11     // Catch:{ 1pE -> 0x02a3 }
            long r0 = r12.A1L     // Catch:{ 1pE -> 0x02a3 }
            byte[] r22 = r11.A01(r0)     // Catch:{ 1pE -> 0x02a3 }
            X.8Lq r0 = r7.encIv_     // Catch:{ 1pE -> 0x02a3 }
            byte[] r19 = r0.A07()     // Catch:{ 1pE -> 0x02a3 }
            X.8Lq r0 = r7.encPayload_     // Catch:{ 1pE -> 0x02a3 }
            byte[] r20 = r0.A07()     // Catch:{ 1pE -> 0x02a3 }
            java.lang.Object r0 = r10.get()     // Catch:{ 1pE -> 0x02a3 }
            com.whatsapp.wamsys.JniBridge r0 = (com.whatsapp.wamsys.JniBridge) r0     // Catch:{ 1pE -> 0x02a3 }
            X.1ET r1 = r7.targetMessageKey_     // Catch:{ 1pE -> 0x02a3 }
            if (r1 != 0) goto L_0x01cb
            X.1ET r1 = X.AnonymousClass1ET.DEFAULT_INSTANCE     // Catch:{ 1pE -> 0x02a3 }
        L_0x01cb:
            java.lang.String r1 = r1.id_     // Catch:{ 1pE -> 0x02a3 }
            r10 = 2
            X.C162457s7.A0J(r0, r10)     // Catch:{ 1pE -> 0x02a3 }
            r21 = 0
            if (r1 == 0) goto L_0x020e
            if (r22 == 0) goto L_0x020e
            java.lang.String r18 = "Enc Reaction"
            r16 = r0
            r17 = r1
            byte[] r1 = X.C57512tl.A01(r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ 1pE -> 0x02a3 }
            if (r1 != 0) goto L_0x01e9
            java.lang.String r0 = "MessageAddOnEncReactionUtils/decryptEncReactionMessage: unable to decrypt payload"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1pE -> 0x02a3 }
            goto L_0x023d
        L_0x01e9:
            X.1Co r0 = X.C21631Co.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x0208 }
            X.6cX r9 = X.C130786cX.A05(r0, r1)     // Catch:{ 6u5 -> 0x0208 }
            X.1Co r9 = (X.C21631Co) r9     // Catch:{ 6u5 -> 0x0208 }
            X.C162457s7.A0H(r9)     // Catch:{ 6u5 -> 0x0208 }
            if (r9 == 0) goto L_0x023d
            long r0 = r6.A05
            X.1ET r2 = r7.targetMessageKey_
            if (r2 != 0) goto L_0x01fe
            X.1ET r2 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x01fe:
            X.1mf r6 = A00(r9, r2, r5, r0)
            r6.A05 = r3
            r4.A03(r9)
            return r6
        L_0x0208:
            java.lang.String r0 = "MessageAddOnEncReactionUtils/decryptEncReactionMessage: failed to parse payload into protobuf"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1pE -> 0x02a3 }
            goto L_0x023d
        L_0x020e:
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ 1pE -> 0x02a3 }
            java.lang.String r0 = "MessageAddOnEncReactionUtils/decryptEncReactionMessage: one of the params is null, encIv is null = "
            r7.append(r0)     // Catch:{ 1pE -> 0x02a3 }
            r4 = 1
            r7.append(r9)     // Catch:{ 1pE -> 0x02a3 }
            java.lang.String r0 = " encPayload is null = "
            r7.append(r0)     // Catch:{ 1pE -> 0x02a3 }
            r7.append(r9)     // Catch:{ 1pE -> 0x02a3 }
            java.lang.String r0 = " targetMessageId is null = "
            r7.append(r0)     // Catch:{ 1pE -> 0x02a3 }
            boolean r0 = X.AnonymousClass000.A1X(r1)
            r7.append(r0)     // Catch:{ 1pE -> 0x02a3 }
            java.lang.String r0 = " messageSecret is null = "
            r7.append(r0)     // Catch:{ 1pE -> 0x02a3 }
            if (r22 == 0) goto L_0x0237
            r4 = 0
        L_0x0237:
            r7.append(r4)     // Catch:{ 1pE -> 0x02a3 }
            X.C18280x3.A13(r7)     // Catch:{ 1pE -> 0x02a3 }
        L_0x023d:
            X.24W r0 = new X.24W
            r0.<init>(r2)
            throw r0
        L_0x0243:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ 1pE -> 0x02a3 }
            java.lang.String r0 = "FMessageReactionProtobuf/decryptReactionMessage: one of the params is null, targetSenderUserJid is null = "
            r4.append(r0)     // Catch:{ 1pE -> 0x02a3 }
            boolean r0 = X.AnonymousClass000.A1X(r14)
            r4.append(r0)     // Catch:{ 1pE -> 0x02a3 }
            java.lang.String r0 = ", senderLid is null = "
            r4.append(r0)     // Catch:{ 1pE -> 0x02a3 }
            if (r15 == 0) goto L_0x0297
            r1 = 0
            goto L_0x0297
        L_0x025c:
            java.lang.String r0 = "FMessageReactionProtobuf/decryptReactionMessage: targetMessage is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1pE -> 0x02a3 }
            X.1pE r0 = new X.1pE     // Catch:{ 1pE -> 0x02a3 }
            r0.<init>()     // Catch:{ 1pE -> 0x02a3 }
            goto L_0x02a2
        L_0x0267:
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ 1pE -> 0x02a3 }
            java.lang.String r0 = "FMessageReactionProtobuf/decryptReactionMessage: one of the params is null, fMessageDatabase is null = "
            r7.append(r0)     // Catch:{ 1pE -> 0x02a3 }
            r7.append(r9)     // Catch:{ 1pE -> 0x02a3 }
            java.lang.String r0 = ", messageSecretStore is null = "
            r7.append(r0)     // Catch:{ 1pE -> 0x02a3 }
            X.8qC r0 = r4.A0A     // Catch:{ 1pE -> 0x02a3 }
            boolean r0 = X.AnonymousClass000.A1X(r0)
            r7.append(r0)     // Catch:{ 1pE -> 0x02a3 }
            java.lang.String r0 = ", jniBridge is null = "
            r7.append(r0)     // Catch:{ 1pE -> 0x02a3 }
            X.8qC r0 = r4.A09     // Catch:{ 1pE -> 0x02a3 }
            if (r0 == 0) goto L_0x028b
            r1 = 0
        L_0x028b:
            r7.append(r1)     // Catch:{ 1pE -> 0x02a3 }
            X.C18280x3.A13(r7)     // Catch:{ 1pE -> 0x02a3 }
            X.24W r0 = new X.24W     // Catch:{ 1pE -> 0x02a3 }
            r0.<init>(r2)     // Catch:{ 1pE -> 0x02a3 }
            goto L_0x02a2
        L_0x0297:
            r4.append(r1)     // Catch:{ 1pE -> 0x02a3 }
            X.C18280x3.A13(r4)     // Catch:{ 1pE -> 0x02a3 }
            X.24W r0 = new X.24W     // Catch:{ 1pE -> 0x02a3 }
            r0.<init>(r2)     // Catch:{ 1pE -> 0x02a3 }
        L_0x02a2:
            throw r0     // Catch:{ 1pE -> 0x02a3 }
        L_0x02a3:
            long r0 = r6.A05
            byte[] r2 = r8.A0F()
            X.1mf r6 = new X.1mf
            r6.<init>(r5, r2, r0)
            r6.A05 = r3
            return r6
        L_0x02b1:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Hv.A02(X.2rC):X.34x");
    }

    public void A03(C21631Co r5) {
        String str = r5.text_;
        if (str == null || new C106655Zv(str).A00.length > 30) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("FMessageReactionProtobuf/validateReactionMessageText/reaction text failed validation key=");
            AnonymousClass1ET r0 = r5.key_;
            if (r0 == null) {
                r0 = AnonymousClass1ET.DEFAULT_INSTANCE;
            }
            C18260x0.A0n(r0, A0o);
            this.A00.A0A("reaction text failed validation", false, (String) null);
            throw AnonymousClass24W.A00(68);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0222, code lost:
        if (r0 == true) goto L_0x0224;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x026e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AyD(X.C55032pg r20, X.C624134x r21) {
        /*
            r19 = this;
            r3 = r21
            boolean r0 = r3 instanceof X.C30571mf
            if (r0 == 0) goto L_0x0276
            X.1mf r3 = (X.C30571mf) r3
            java.lang.String r1 = r3.A01
            r5 = r19
            r2 = r20
            if (r1 == 0) goto L_0x0253
            X.5Zv r0 = new X.5Zv
            r0.<init>((java.lang.String) r1)
            int[] r0 = r0.A00
            int r1 = r0.length
            r0 = 30
            if (r1 > r0) goto L_0x0253
        L_0x001c:
            X.1A4 r1 = r2.A00
            X.6cX r0 = r1.A00
            X.1EU r0 = (X.AnonymousClass1EU) r0
            X.1Co r0 = r0.reactionMessage_
            if (r0 != 0) goto L_0x0028
            X.1Co r0 = X.C21631Co.DEFAULT_INSTANCE
        L_0x0028:
            X.6c9 r4 = r0.A0H()
            X.6cX r0 = r4.A00
            X.1Co r0 = (X.C21631Co) r0
            X.1ET r0 = r0.key_
            if (r0 != 0) goto L_0x0036
            X.1ET r0 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x0036:
            X.1A1 r8 = X.AnonymousClass0x9.A0X(r0)
            X.2z0 r9 = r3.A1v()
            X.4uZ r7 = X.C30331mH.A00(r3)
            X.2kn r6 = r3.A04
            if (r6 == 0) goto L_0x004d
            X.2z0 r0 = r6.A01
            if (r0 == 0) goto L_0x004d
            r9 = r0
            X.4uZ r7 = r6.A00
        L_0x004d:
            X.C626936e.A06(r9)
            X.8qC r0 = r5.A07
            r0.get()
            boolean r0 = X.C155477ey.A00(r7)
            X.C33051sM.A02(r7, r8, r9, r0)
            X.6cX r6 = X.C18320x8.A0C(r4)
            X.1Co r6 = (X.C21631Co) r6
            X.1ET r0 = X.C18290x4.A0V(r8)
            r6.key_ = r0
            int r0 = r6.bitField0_
            r0 = r0 | 1
            r6.bitField0_ = r0
            java.lang.String r0 = r3.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x024f
            java.lang.String r7 = r3.A01
        L_0x0078:
            X.6cX r6 = X.C18320x8.A0C(r4)
            X.1Co r6 = (X.C21631Co) r6
            r7.getClass()
            int r0 = r6.bitField0_
            r0 = r0 | 2
            r6.bitField0_ = r0
            r6.text_ = r7
            long r6 = r3.A00
            X.6cX r9 = X.C18320x8.A0C(r4)
            X.1Co r9 = (X.C21631Co) r9
            int r0 = r9.bitField0_
            r0 = r0 | 8
            r9.bitField0_ = r0
            r9.senderTimestampMs_ = r6
            X.2z0 r0 = r3.A1J
            X.4uZ r6 = r0.A00
            boolean r0 = r6 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x023a
            X.2ss r0 = r5.A02
            com.whatsapp.jid.GroupJid r6 = (com.whatsapp.jid.GroupJid) r6
            int r6 = r0.A06(r6)
            r0 = 3
            if (r6 != r0) goto L_0x023a
            X.1VX r7 = r5.A03
            r6 = 6771(0x1a73, float:9.488E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r7.A0Y(r0, r6)
            if (r0 == 0) goto L_0x013e
            X.6cX r2 = X.C18320x8.A0C(r4)
            X.1Co r2 = (X.C21631Co) r2
            r0 = 0
            r2.key_ = r0
            int r0 = r2.bitField0_
            r0 = r0 & -2
            r2.bitField0_ = r0
            X.2sr r0 = r5.A01
            X.1fH r7 = r0.A0I()
            byte[] r10 = X.C18290x4.A1Z(r4)
            X.2z0 r8 = r3.A1v()
            boolean r11 = X.C624134x.A0g(r3)
            java.lang.String r9 = "Enc Reaction"
            X.2mh r6 = new X.2mh
            r6.<init>(r7, r8, r9, r10, r11)
            X.2nA r0 = r5.A04
            X.3Z1 r5 = r0.A01(r6)
            X.1C4 r0 = X.AnonymousClass1C4.DEFAULT_INSTANCE
            X.6c9 r4 = r0.A0G()
            java.lang.Object r3 = r5.first
            X.8Lq r3 = (X.C172548Lq) r3
            X.6cX r2 = X.C18320x8.A0C(r4)
            X.1C4 r2 = (X.AnonymousClass1C4) r2
            r3.getClass()
            int r0 = r2.bitField0_
            r0 = r0 | 4
            r2.bitField0_ = r0
            r2.encIv_ = r3
            java.lang.Object r3 = r5.second
            X.8Lq r3 = (X.C172548Lq) r3
            X.6cX r2 = X.C18320x8.A0C(r4)
            X.1C4 r2 = (X.AnonymousClass1C4) r2
            r3.getClass()
            int r0 = r2.bitField0_
            r0 = r0 | 2
            r2.bitField0_ = r0
            r2.encPayload_ = r3
            java.lang.Object r0 = r5.third
            X.1ET r0 = (X.AnonymousClass1ET) r0
            X.6cX r2 = X.C18320x8.A0C(r4)
            X.1C4 r2 = (X.AnonymousClass1C4) r2
            r0.getClass()
            r2.targetMessageKey_ = r0
            int r0 = r2.bitField0_
            r0 = r0 | 1
            r2.bitField0_ = r0
            X.6cX r0 = r4.A06()
        L_0x012f:
            X.1C4 r0 = (X.AnonymousClass1C4) r0
            X.1EU r1 = X.AnonymousClass0x2.A0L(r1, r0)
            r1.encReactionMessage_ = r0
            int r0 = r1.bitField1_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
        L_0x013b:
            r1.bitField1_ = r0
            return
        L_0x013e:
            X.2Rj r7 = r5.A06
            r9 = 1
            X.2z0 r0 = r3.A1v()
            X.C626936e.A06(r0)
            X.6cX r0 = r1.A00
            X.1EU r0 = (X.AnonymousClass1EU) r0
            X.1C4 r0 = r0.encReactionMessage_
            if (r0 != 0) goto L_0x0152
            X.1C4 r0 = X.AnonymousClass1C4.DEFAULT_INSTANCE
        L_0x0152:
            X.6c9 r10 = r0.A0H()
            X.2eA r0 = r7.A02
            long r5 = r3.A02
            byte[] r16 = r0.A01(r5)
            X.2z0 r6 = r3.A1v()
            X.2qz r0 = r7.A03
            X.34x r5 = r0.A05(r6)
            if (r6 == 0) goto L_0x022c
            boolean r0 = r6.A02
            if (r0 != r9) goto L_0x0222
            if (r5 == 0) goto L_0x0224
            boolean r0 = X.C624134x.A0g(r5)
            if (r0 != r9) goto L_0x0224
            X.2sr r0 = r7.A00
            X.1fH r11 = r0.A0H()
        L_0x017c:
            if (r11 == 0) goto L_0x026e
            X.2sr r0 = r7.A00
            X.1fH r12 = r0.A0H()
            if (r12 == 0) goto L_0x0266
            X.6cX r5 = X.C18320x8.A0C(r10)
            X.1C4 r5 = (X.AnonymousClass1C4) r5
            X.6cX r0 = r8.A06()
            X.1ET r0 = (X.AnonymousClass1ET) r0
            r0.getClass()
            r5.targetMessageKey_ = r0
            int r0 = r5.bitField0_
            r0 = r0 | 1
            r5.bitField0_ = r0
            X.6cX r5 = X.C18320x8.A0C(r4)
            X.1Co r5 = (X.C21631Co) r5
            r0 = 0
            r5.key_ = r0
            int r0 = r5.bitField0_
            r0 = r0 & -2
            r5.bitField0_ = r0
            com.whatsapp.wamsys.JniBridge r13 = r7.A04
            X.2z0 r0 = r3.A1v()
            if (r0 == 0) goto L_0x0220
            java.lang.String r14 = r0.A01
        L_0x01b6:
            X.6cX r3 = r4.A06()
            r0 = 5
            X.C162457s7.A0J(r3, r0)
            r4 = 1
            if (r14 == 0) goto L_0x01f7
            if (r16 == 0) goto L_0x01f7
            r17 = 0
            byte[] r18 = r3.A0F()
            java.lang.String r15 = "Enc Reaction"
            X.2Lv r4 = X.C57512tl.A00(r11, r12, r13, r14, r15, r16, r17, r18)
            if (r4 == 0) goto L_0x0215
            X.8Lq r3 = r4.A00
            X.6cX r2 = X.C18320x8.A0C(r10)
            X.1C4 r2 = (X.AnonymousClass1C4) r2
            int r0 = r2.bitField0_
            r0 = r0 | 4
            r2.bitField0_ = r0
            r2.encIv_ = r3
            X.8Lq r3 = r4.A01
            X.6cX r2 = X.C18320x8.A0C(r10)
            X.1C4 r2 = (X.AnonymousClass1C4) r2
            int r0 = r2.bitField0_
            r0 = r0 | 2
            r2.bitField0_ = r0
            r2.encPayload_ = r3
        L_0x01f1:
            X.6cX r0 = r10.A06()
            goto L_0x012f
        L_0x01f7:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageAddOnEncReactionUtils/encryptEncReactionMessage: one of the params is null, targetMessageId is null = "
            r3.append(r0)
            boolean r0 = X.AnonymousClass000.A1X(r14)
            r3.append(r0)
            java.lang.String r0 = "messageSecret is null = "
            r3.append(r0)
            if (r16 == 0) goto L_0x020f
            r4 = 0
        L_0x020f:
            r3.append(r4)
            X.C18280x3.A13(r3)
        L_0x0215:
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x01f1
            r0 = 67
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        L_0x0220:
            r14 = 0
            goto L_0x01b6
        L_0x0222:
            if (r0 != r9) goto L_0x022c
        L_0x0224:
            X.2sr r0 = r7.A00
            com.whatsapp.jid.PhoneUserJid r11 = X.C56972sr.A04(r0)
            goto L_0x017c
        L_0x022c:
            X.4uZ r11 = X.C30331mH.A00(r3)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C162457s7.A0K(r11, r0)
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
            goto L_0x017c
        L_0x023a:
            X.1EU r1 = X.C18290x4.A0T(r1)
            X.6cX r0 = r4.A06()
            X.1Co r0 = (X.C21631Co) r0
            r0.getClass()
            r1.reactionMessage_ = r0
            int r0 = r1.bitField1_
            r0 = r0 | 16
            goto L_0x013b
        L_0x024f:
            java.lang.String r7 = ""
            goto L_0x0078
        L_0x0253:
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x001c
            X.1VX r0 = r5.A03
            boolean r0 = X.C56952sp.A0E(r0)
            if (r0 == 0) goto L_0x001c
            r0 = 68
            X.24A r0 = X.AnonymousClass24A.A00(r0)
            throw r0
        L_0x0266:
            java.lang.String r0 = "reactionSenderUserLid is NULL"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x026e:
            java.lang.String r0 = "targetSenderUserJid is NULL"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0276:
            java.lang.String r0 = "FMessageReactionProtobuf/not supported message"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Hv.AyD(X.2pg, X.34x):void");
    }

    public AnonymousClass1Hv(C55682qk r1, C56972sr r2, C56982ss r3, AnonymousClass1VX r4, C53482nA r5, C49092fy r6, C43252Rj r7, C183538qC r8, C183538qC r9, C183538qC r10, C183538qC r11) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A09 = r8;
        this.A02 = r3;
        this.A07 = r9;
        this.A08 = r10;
        this.A0A = r11;
        this.A05 = r6;
        this.A04 = r5;
        this.A06 = r7;
    }
}
