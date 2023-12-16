package X;

import android.text.TextUtils;

/* renamed from: X.3OH  reason: invalid class name */
public abstract class AnonymousClass3OH implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public static boolean A01(AnonymousClass1ET r1) {
        if (r1 == null || (r1.bitField0_ & 4) == 0 || TextUtils.isEmpty(r1.id_) || (r1.bitField0_ & 1) == 0 || TextUtils.isEmpty(r1.remoteJid_) || C18310x6.A0S(r1.remoteJid_) == null) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0176, code lost:
        if (r1 != 2) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0251, code lost:
        if (r4.encIv_ == null) goto L_0x0253;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x012c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C624134x A02(X.C55962rC r12) {
        /*
            r11 = this;
            boolean r0 = r11 instanceof X.AnonymousClass1Hs
            if (r0 == 0) goto L_0x00b7
            r2 = r11
            X.1Hs r2 = (X.AnonymousClass1Hs) r2
            X.1EU r6 = r12.A0B
            int r1 = r6.bitField1_
            r0 = 1048576(0x100000, float:1.469368E-39)
            boolean r0 = X.C18270x1.A1T(r1, r0)
            r5 = 0
            if (r0 == 0) goto L_0x0099
            X.1VX r3 = r2.A01
            r1 = 4164(0x1044, float:5.835E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0099
            X.1BP r4 = r6.scheduledCallEditMessage_
            if (r4 != 0) goto L_0x0026
            X.1BP r4 = X.AnonymousClass1BP.DEFAULT_INSTANCE
        L_0x0026:
            int r3 = r4.bitField0_
            boolean r0 = X.AnonymousClass0x2.A1X(r3)
            java.lang.Integer r1 = X.C18300x5.A0Z()
            if (r0 == 0) goto L_0x00af
            r0 = r3 & 2
            if (r0 == 0) goto L_0x00a7
            X.1ET r0 = r4.key_
            if (r0 != 0) goto L_0x003c
            X.1ET r0 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x003c:
            boolean r0 = A01(r0)
            if (r0 == 0) goto L_0x009f
            X.1BP r6 = r6.scheduledCallEditMessage_
            if (r6 != 0) goto L_0x0048
            X.1BP r6 = X.AnonymousClass1BP.DEFAULT_INSTANCE
        L_0x0048:
            X.2z0 r4 = r12.A0D
            long r0 = r12.A05
            X.1mg r5 = new X.1mg
            r5.<init>(r4, r0)
            X.1ET r7 = r6.key_
            if (r7 != 0) goto L_0x0057
            X.1ET r7 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x0057:
            java.lang.String r0 = r7.remoteJid_
            X.4uZ r3 = X.C18310x6.A0S(r0)
            X.C626936e.A06(r3)
            boolean r1 = r7.fromMe_
            java.lang.String r0 = r7.id_
            X.2z0 r1 = X.AnonymousClass2z0.A05(r3, r0, r1)
            java.lang.String r0 = r7.participant_
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A08(r0)
            X.C30331mH.A03(r0, r5, r1)
            int r1 = r6.editType_
            if (r1 == 0) goto L_0x009c
            r0 = 1
            if (r1 != r0) goto L_0x009c
            X.22Y r1 = X.AnonymousClass22Y.CANCEL
        L_0x007a:
            X.22Y r0 = X.AnonymousClass22Y.CANCEL
            boolean r0 = X.AnonymousClass000.A1Y(r1, r0)
            r5.A00 = r0
            X.4uZ r3 = r12.A08
            X.2sr r2 = r2.A00
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x009a
            if (r3 == 0) goto L_0x009a
        L_0x008c:
            X.1ET r1 = r6.key_
            if (r1 != 0) goto L_0x0092
            X.1ET r1 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x0092:
            r0 = 0
            X.2kn r0 = X.C33051sM.A00(r2, r3, r1, r4, r0)
            r5.A05 = r0
        L_0x0099:
            return r5
        L_0x009a:
            r3 = 0
            goto L_0x008c
        L_0x009c:
            X.22Y r1 = X.AnonymousClass22Y.UNKNOWN
            goto L_0x007a
        L_0x009f:
            java.lang.String r0 = "scheduled_call_edit_add_on_invalid_parent_key"
            X.24W r0 = X.AnonymousClass24W.A01(r1, r0)
            throw r0
        L_0x00a7:
            java.lang.String r0 = "scheduled_call_edit_add_on_missing_edit_type"
            X.24W r0 = X.AnonymousClass24W.A01(r1, r0)
            throw r0
        L_0x00af:
            java.lang.String r0 = "scheduled_call_edit_add_on_missing_creation_message_key"
            X.24W r0 = X.AnonymousClass24W.A01(r1, r0)
            throw r0
        L_0x00b7:
            boolean r0 = r11 instanceof X.AnonymousClass1Hr
            if (r0 == 0) goto L_0x0203
            r7 = r11
            X.1Hr r7 = (X.AnonymousClass1Hr) r7
            X.1EU r4 = X.C55962rC.A01(r12)
            int r1 = r4.bitField1_
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0201
            int r5 = r12.A01
            r2 = 2
            java.lang.Integer r3 = X.C18300x5.A0Z()
            if (r5 != r2) goto L_0x01f2
            X.1CE r6 = r4.pinInChatMessage_
            if (r6 != 0) goto L_0x00d8
            X.1CE r6 = X.AnonymousClass1CE.DEFAULT_INSTANCE
        L_0x00d8:
            int r0 = r6.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x01eb
            int r1 = r6.type_
            if (r1 == 0) goto L_0x0101
            r0 = 1
            if (r1 == r0) goto L_0x00fe
            if (r1 != r2) goto L_0x0101
            X.22l r5 = X.AnonymousClass22l.UNPIN_FOR_ALL
        L_0x00e9:
            X.22l r2 = X.AnonymousClass22l.UNPIN_FOR_ALL
            if (r5 != r2) goto L_0x0104
            X.1Dk r0 = r4.messageContextInfo_
            if (r0 != 0) goto L_0x00f3
            X.1Dk r0 = X.C21851Dk.DEFAULT_INSTANCE
        L_0x00f3:
            int r0 = r0.messageAddOnDurationInSecs_
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "Unpin request had expiration."
            X.24W r0 = X.AnonymousClass24W.A01(r3, r0)
            throw r0
        L_0x00fe:
            X.22l r5 = X.AnonymousClass22l.PIN_FOR_ALL
            goto L_0x00e9
        L_0x0101:
            X.22l r5 = X.AnonymousClass22l.UNKNOWN_TYPE
            goto L_0x00e9
        L_0x0104:
            X.22l r9 = X.AnonymousClass22l.PIN_FOR_ALL
            if (r5 != r9) goto L_0x012c
            X.1Dk r0 = r4.messageContextInfo_
            r5 = r0
            if (r0 != 0) goto L_0x010f
            X.1Dk r0 = X.C21851Dk.DEFAULT_INSTANCE
        L_0x010f:
            int r1 = r0.messageAddOnDurationInSecs_
            r0 = 5184000(0x4f1a00, float:7.264331E-39)
            if (r1 > r0) goto L_0x0125
            if (r5 != 0) goto L_0x011a
            X.1Dk r5 = X.C21851Dk.DEFAULT_INSTANCE
        L_0x011a:
            int r0 = r5.messageAddOnDurationInSecs_
            if (r0 > 0) goto L_0x013f
            java.lang.String r0 = "Pin request did not have expiration."
            X.24W r0 = X.AnonymousClass24W.A01(r3, r0)
            throw r0
        L_0x0125:
            java.lang.String r0 = "Pin request exceeded max expiration."
            X.24W r0 = X.AnonymousClass24W.A01(r3, r0)
            throw r0
        L_0x012c:
            if (r5 == r9) goto L_0x013f
            if (r5 == r2) goto L_0x013f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unsupported pin type: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r5, r0, r1)
            X.24W r0 = X.AnonymousClass24W.A01(r3, r0)
            throw r0
        L_0x013f:
            X.1ET r0 = r6.key_
            if (r0 != 0) goto L_0x0145
            X.1ET r0 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x0145:
            boolean r0 = A01(r0)
            if (r0 == 0) goto L_0x01e4
            X.1VX r3 = r7.A01
            r1 = 3139(0xc43, float:4.399E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r1)
            if (r0 == 0) goto L_0x01dd
            X.1CE r6 = r4.pinInChatMessage_
            if (r6 != 0) goto L_0x015d
            X.1CE r6 = X.AnonymousClass1CE.DEFAULT_INSTANCE
        L_0x015d:
            X.2z0 r5 = r12.A0D
            X.4uZ r4 = r12.A08
            long r0 = r12.A05
            X.C162457s7.A0H(r6)
            r8 = 2
            X.C162457s7.A0J(r6, r8)
            X.1me r3 = new X.1me
            r3.<init>(r5, r0)
            int r1 = r6.type_
            if (r1 == 0) goto L_0x0178
            r0 = 1
            if (r1 == r0) goto L_0x01db
            if (r1 == r8) goto L_0x017a
        L_0x0178:
            X.22l r2 = X.AnonymousClass22l.UNKNOWN_TYPE
        L_0x017a:
            int r1 = r2.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0193
            if (r1 == r8) goto L_0x0192
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessagePinInChatProtobuf Unhandled pin type "
            r1.append(r0)
            r1.append(r2)
            X.C18270x1.A0z(r1)
        L_0x0192:
            r0 = 0
        L_0x0193:
            r3.A00 = r0
            long r0 = r6.senderTimestampMs_
            r3.A01 = r0
            X.1ET r8 = r6.key_
            if (r8 != 0) goto L_0x019f
            X.1ET r8 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x019f:
            X.5Yw r1 = X.C95814uZ.A00
            java.lang.String r0 = r8.remoteJid_
            X.4uZ r2 = r1.A05(r0)
            X.C626936e.A06(r2)
            boolean r1 = r8.fromMe_
            java.lang.String r0 = r8.id_
            X.2z0 r2 = X.AnonymousClass2z0.A05(r2, r0, r1)
            X.32Y r1 = com.whatsapp.jid.UserJid.Companion
            X.1ET r0 = r6.key_
            if (r0 != 0) goto L_0x01ba
            X.1ET r0 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x01ba:
            java.lang.String r0 = r0.participant_
            com.whatsapp.jid.UserJid r0 = r1.A0E(r0)
            X.C30331mH.A03(r0, r3, r2)
            X.2sr r2 = r7.A00
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x01d9
            if (r4 == 0) goto L_0x01d9
        L_0x01cb:
            X.1ET r1 = r6.key_
            if (r1 != 0) goto L_0x01d1
            X.1ET r1 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x01d1:
            r0 = 0
            X.2kn r0 = X.C33051sM.A00(r2, r4, r1, r5, r0)
            r3.A05 = r0
            return r3
        L_0x01d9:
            r4 = 0
            goto L_0x01cb
        L_0x01db:
            r2 = r9
            goto L_0x017a
        L_0x01dd:
            r0 = 79
            X.1mJ r3 = r12.A03(r0)
            return r3
        L_0x01e4:
            java.lang.String r0 = "Invalid parent message key."
            X.24W r0 = X.AnonymousClass24W.A01(r3, r0)
            throw r0
        L_0x01eb:
            java.lang.String r0 = "Missing pin-in-chat type."
            X.24W r0 = X.AnonymousClass24W.A01(r3, r0)
            throw r0
        L_0x01f2:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid edited version: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r5)
            X.24W r0 = X.AnonymousClass24W.A01(r3, r0)
            throw r0
        L_0x0201:
            r3 = 0
            return r3
        L_0x0203:
            boolean r0 = r11 instanceof X.AnonymousClass1Ht
            if (r0 == 0) goto L_0x02ac
            r3 = r11
            X.1Ht r3 = (X.AnonymousClass1Ht) r3
            X.1EU r4 = X.C55962rC.A01(r12)
            int r1 = r4.bitField1_
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x02aa
            X.1VX r2 = r3.A03
            r1 = 5563(0x15bb, float:7.795E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 != 0) goto L_0x0228
            r0 = 85
            X.1mJ r4 = r12.A03(r0)
            return r4
        L_0x0228:
            X.1C3 r4 = r4.encEventResponseMessage_
            if (r4 != 0) goto L_0x022e
            X.1C3 r4 = X.AnonymousClass1C3.DEFAULT_INSTANCE
        L_0x022e:
            X.C162457s7.A0H(r4)
            int r0 = r4.bitField0_
            boolean r0 = X.AnonymousClass0x2.A1X(r0)
            r2 = 1
            if (r0 == 0) goto L_0x02a8
            X.1ET r0 = r4.eventCreationMessageKey_
            if (r0 != 0) goto L_0x0242
            X.1ET r0 = X.AnonymousClass1ET.DEFAULT_INSTANCE
            if (r0 == 0) goto L_0x02a8
        L_0x0242:
            r1 = 1
        L_0x0243:
            X.40m r0 = X.C816340m.A00
            X.AnonymousClass272.A00(r0, r1)
            int r0 = r4.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0253
            X.8Lq r0 = r4.encIv_
            r1 = 1
            if (r0 != 0) goto L_0x0254
        L_0x0253:
            r1 = 0
        L_0x0254:
            X.40n r0 = X.C816440n.A00
            X.AnonymousClass272.A00(r0, r1)
            X.8Lq r0 = r4.encIv_
            int r1 = r0.A03()
            r0 = 12
            boolean r1 = X.AnonymousClass000.A1U(r1, r0)
            X.40o r0 = X.C816540o.A00
            X.AnonymousClass272.A00(r0, r1)
            int r0 = r4.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x02a6
            X.8Lq r0 = r4.encPayload_
            if (r0 == 0) goto L_0x02a6
        L_0x0274:
            X.40p r0 = X.C816640p.A00
            X.AnonymousClass272.A00(r0, r2)
            X.2sr r3 = r3.A00
            X.2z0 r5 = r12.A0D
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x02a4
            X.4uZ r2 = r5.A00
            if (r2 == 0) goto L_0x02a4
        L_0x0285:
            X.1ET r1 = r4.eventCreationMessageKey_
            if (r1 != 0) goto L_0x028b
            X.1ET r1 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x028b:
            r0 = 0
            X.2kn r6 = X.C33051sM.A00(r3, r2, r1, r5, r0)
            long r9 = r12.A05
            X.8Lq r0 = r4.encIv_
            byte[] r7 = r0.A07()
            X.8Lq r0 = r4.encPayload_
            byte[] r8 = r0.A07()
            X.1mi r4 = new X.1mi
            r4.<init>((X.AnonymousClass2z0) r5, (X.C52042kn) r6, (byte[]) r7, (byte[]) r8, (long) r9)
            return r4
        L_0x02a4:
            r2 = 0
            goto L_0x0285
        L_0x02a6:
            r2 = 0
            goto L_0x0274
        L_0x02a8:
            r1 = 0
            goto L_0x0243
        L_0x02aa:
            r4 = 0
            return r4
        L_0x02ac:
            r2 = r11
            X.1Hq r2 = (X.AnonymousClass1Hq) r2
            X.1EU r5 = r12.A0B
            int r0 = r5.bitField1_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0357
            int r0 = r12.A01
            X.1CA r4 = r5.keepInChatMessage_
            if (r4 != 0) goto L_0x02bf
            X.1CA r4 = X.AnonymousClass1CA.DEFAULT_INSTANCE
        L_0x02bf:
            java.lang.Integer r3 = X.C18300x5.A0Z()
            if (r0 == 0) goto L_0x02e5
            int r0 = r4.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x02e5
            int r0 = r4.keepType_
            X.23B r1 = X.AnonymousClass23B.A00(r0)
            if (r1 != 0) goto L_0x02d5
            X.23B r1 = X.AnonymousClass23B.UNKNOWN
        L_0x02d5:
            X.23B r0 = X.AnonymousClass23B.KEEP_FOR_ALL
            if (r1 != r0) goto L_0x02e5
            java.lang.String r0 = "MessageUtils/hasValidKeepInChatMessage edit version and keeptype as kept are both set"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r0 = "edit version and keeptype as kept are both set"
            X.24W r0 = X.AnonymousClass24W.A01(r3, r0)
            throw r0
        L_0x02e5:
            X.1ET r0 = r4.key_
            if (r0 != 0) goto L_0x02eb
            X.1ET r0 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x02eb:
            boolean r0 = A01(r0)
            if (r0 == 0) goto L_0x0350
            X.1CA r6 = r5.keepInChatMessage_
            if (r6 != 0) goto L_0x02f7
            X.1CA r6 = X.AnonymousClass1CA.DEFAULT_INSTANCE
        L_0x02f7:
            X.2z0 r5 = r12.A0D
            long r0 = r12.A05
            X.1md r4 = new X.1md
            r4.<init>(r5, r0)
            X.1ET r7 = r6.key_
            if (r7 != 0) goto L_0x0306
            X.1ET r7 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x0306:
            java.lang.String r0 = r7.remoteJid_
            X.4uZ r3 = X.C18310x6.A0S(r0)
            X.C626936e.A06(r3)
            boolean r1 = r7.fromMe_
            java.lang.String r0 = r7.id_
            X.2z0 r1 = X.AnonymousClass2z0.A05(r3, r0, r1)
            java.lang.String r0 = r7.participant_
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A08(r0)
            X.C30331mH.A03(r0, r4, r1)
            int r0 = r6.keepType_
            X.23B r1 = X.AnonymousClass23B.A00(r0)
            if (r1 != 0) goto L_0x032a
            X.23B r1 = X.AnonymousClass23B.UNKNOWN
        L_0x032a:
            X.23B r0 = X.AnonymousClass23B.KEEP_FOR_ALL
            boolean r0 = X.AnonymousClass000.A1Y(r1, r0)
            r4.A01 = r0
            long r0 = r6.timestampMs_
            r4.A02 = r0
            X.4uZ r3 = r12.A08
            X.2sr r2 = r2.A00
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x034e
            if (r3 == 0) goto L_0x034e
        L_0x0340:
            X.1ET r1 = r6.key_
            if (r1 != 0) goto L_0x0346
            X.1ET r1 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x0346:
            r0 = 0
            X.2kn r0 = X.C33051sM.A00(r2, r3, r1, r5, r0)
            r4.A05 = r0
            return r4
        L_0x034e:
            r3 = 0
            goto L_0x0340
        L_0x0350:
            java.lang.String r0 = "Invalid parent key."
            X.24W r0 = X.AnonymousClass24W.A01(r3, r0)
            throw r0
        L_0x0357:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3OH.A02(X.2rC):X.34x");
    }

    public final C624134x BgW(C55962rC r5) {
        C624134x A02 = A02(r5);
        if (A02 == null) {
            return null;
        }
        if (A02 instanceof C30331mH) {
            AnonymousClass1EU r2 = r5.A0B;
            if (AnonymousClass000.A1S(r2.bitField0_ & 67108864)) {
                C21851Dk r0 = r2.messageContextInfo_;
                C21851Dk r1 = r0;
                if (r0 == null) {
                    r0 = C21851Dk.DEFAULT_INSTANCE;
                }
                if ((r0.bitField0_ & 16) != 0) {
                    C30331mH r22 = (C30331mH) A02;
                    if (r1 == null) {
                        r1 = C21851Dk.DEFAULT_INSTANCE;
                    }
                    int i = r1.messageAddOnDurationInSecs_;
                    if (r22 instanceof C30561me) {
                        r22.A00 = i;
                        r22.A1w();
                    }
                }
            }
            ((C30331mH) A02).A1x(A02.A0K);
        }
        return A02;
    }
}
