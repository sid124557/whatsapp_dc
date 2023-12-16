package X;

/* renamed from: X.1Rh  reason: invalid class name and case insensitive filesystem */
public class C23101Rh extends AnonymousClass31D {
    public final C54432oi A00;
    public final C55762qs A01;
    public final AnonymousClass35R A02;
    public final C52862mA A03;
    public final C56562sC A04;
    public final C613830m A05;
    public final C53132mb A06;
    public final C51552k0 A07;
    public final C48002eB A08;
    public final C54582ox A09;
    public final C66393Lg A0A;
    public final C55342qC A0B;
    public final C614530v A0C;
    public final AnonymousClass2WA A0D;

    public C23101Rh(C54432oi r4, C55762qs r5, AnonymousClass35R r6, C52862mA r7, C56562sC r8, C613830m r9, C53132mb r10, C51552k0 r11, C48002eB r12, C54582ox r13, C66393Lg r14, C55342qC r15, C614530v r16, AnonymousClass2WA r17, AnonymousClass2U4 r18) {
        super(r18, "message_quoted", 2);
        this.A04 = r8;
        this.A0B = r15;
        this.A07 = r11;
        this.A0A = r14;
        this.A0C = r16;
        this.A00 = r4;
        this.A09 = r13;
        this.A06 = r10;
        this.A03 = r7;
        this.A05 = r9;
        this.A0D = r17;
        this.A02 = r6;
        this.A01 = r5;
        this.A08 = r12;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x02da */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass32H A0D(android.database.Cursor r34) {
        /*
            r33 = this;
            java.lang.String r0 = "parent_row_id"
            r9 = r34
            int r32 = r9.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "parent_key_remote_jid"
            int r31 = r9.getColumnIndexOrThrow(r0)
            int r30 = X.AnonymousClass0x7.A02(r9)
            r8 = r33
            X.4Fq r29 = X.AnonymousClass31D.A03(r8)
            r4 = -1
            r28 = 0
            r10 = 0
        L_0x001f:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x02f4 }
            if (r0 == 0) goto L_0x02e9
            r0 = r32
            long r4 = r9.getLong(r0)     // Catch:{ all -> 0x02f4 }
            r0 = r30
            boolean r0 = r9.isNull(r0)     // Catch:{ all -> 0x02f4 }
            if (r0 != 0) goto L_0x02e5
            r0 = r30
            long r6 = r9.getLong(r0)     // Catch:{ all -> 0x02f4 }
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x02e5
            r0 = r31
            X.4uZ r27 = X.AnonymousClass0x2.A0K(r9, r0)     // Catch:{ all -> 0x02f4 }
            if (r27 != 0) goto L_0x0051
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02f4 }
            java.lang.String r0 = "QuotedMessageStore/QuotedMessageDatabaseMigration/processBatch/missing chatJid; rowId="
            X.C18260x0.A11(r0, r1, r4)     // Catch:{ all -> 0x02f4 }
            goto L_0x001f
        L_0x0051:
            X.2sC r0 = r8.A04     // Catch:{ all -> 0x02f4 }
            X.34x r7 = r0.A00(r9)     // Catch:{ all -> 0x02f4 }
            if (r7 != 0) goto L_0x0063
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02f4 }
            java.lang.String r0 = "QuotedMessageStore/QuotedMessageDatabaseMigration/processBatch/missing quotedMessage; rowId="
            X.C18260x0.A11(r0, r1, r4)     // Catch:{ all -> 0x02f4 }
            goto L_0x001f
        L_0x0063:
            X.2z0 r0 = r7.A1J     // Catch:{ all -> 0x02f4 }
            X.4uZ r0 = r0.A00     // Catch:{ all -> 0x02f4 }
            if (r0 != 0) goto L_0x006e
            java.lang.String r0 = "QuotedMessageStore/processBatch/null remote jid"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x02f4 }
        L_0x006e:
            r0 = 2
            r7.A1H(r0)     // Catch:{ all -> 0x02f4 }
            X.3Lg r6 = r8.A0A     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x02da }
            X.3dV r0 = r6.A0D     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x02da }
            X.4GK r26 = r0.get()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x02da }
            boolean r0 = r7 instanceof X.C30471mV     // Catch:{ all -> 0x02d0 }
            r25 = r0
            if (r0 == 0) goto L_0x0095
            X.30m r3 = r6.A0A     // Catch:{ all -> 0x02d0 }
            r0 = r7
            X.1mV r0 = (X.C30471mV) r0     // Catch:{ all -> 0x02d0 }
            X.33C r2 = r0.A01     // Catch:{ all -> 0x02d0 }
            if (r2 == 0) goto L_0x0095
            java.io.File r1 = r2.A0F     // Catch:{ all -> 0x02d0 }
            if (r1 == 0) goto L_0x0095
            X.310 r0 = r3.A01     // Catch:{ all -> 0x02d0 }
            java.io.File r0 = r0.A06(r1)     // Catch:{ all -> 0x02d0 }
            r2.A0F = r0     // Catch:{ all -> 0x02d0 }
        L_0x0095:
            boolean r0 = r7 instanceof X.C30771mz     // Catch:{ all -> 0x02d0 }
            r24 = r0
            if (r0 == 0) goto L_0x00a7
            X.2ox r3 = r6.A0H     // Catch:{ all -> 0x02d0 }
            r2 = r7
            X.1mz r2 = (X.C30771mz) r2     // Catch:{ all -> 0x02d0 }
            java.lang.String r1 = "SELECT message_row_id, business_owner_jid, product_id, title, description, currency_code, amount_1000, retailer_id, url, product_image_count, sale_amount_1000, body, footer FROM quoted_message_product WHERE message_row_id = ?"
            java.lang.String r0 = "GET_QUOTED_PRODUCT_MESSAGE_SQL_DEPRECATED"
            r3.A03(r2, r1, r0)     // Catch:{ all -> 0x02d0 }
        L_0x00a7:
            boolean r0 = r7 instanceof X.C30761my     // Catch:{ all -> 0x02d0 }
            r23 = r0
            if (r0 == 0) goto L_0x00b9
            X.2oi r3 = r6.A03     // Catch:{ all -> 0x02d0 }
            r2 = r7
            X.1my r2 = (X.C30761my) r2     // Catch:{ all -> 0x02d0 }
            java.lang.String r1 = "SELECT message_row_id, business_owner_jid, title, description FROM quoted_message_product WHERE message_row_id = ?"
            java.lang.String r0 = "GET_QUOTED_CATALOG_MESSAGE_SQL_DEPRECATED"
            r3.A03(r2, r1, r0)     // Catch:{ all -> 0x02d0 }
        L_0x00b9:
            boolean r0 = r7 instanceof X.C30391mN     // Catch:{ all -> 0x02d0 }
            r22 = r0
            if (r0 == 0) goto L_0x016f
            X.2qs r13 = r6.A05     // Catch:{ all -> 0x02d0 }
            r11 = r7
            X.1mN r11 = (X.C30391mN) r11     // Catch:{ all -> 0x02d0 }
            java.lang.String[] r3 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x02d0 }
            long r0 = r11.A1L     // Catch:{ all -> 0x02d0 }
            X.C18260x0.A1Y(r3, r0)     // Catch:{ all -> 0x02d0 }
            X.3dV r0 = r13.A02     // Catch:{ all -> 0x02d0 }
            X.4GK r21 = r0.get()     // Catch:{ all -> 0x02d0 }
            r0 = r21
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0162 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "SELECT group_jid_row_id, admin_jid_row_id, group_name, invite_code, expiration, expired, group_type FROM message_quoted_group_invite_legacy WHERE message_row_id = ?"
            java.lang.String r0 = "GET_QUOTED_GROUP_INVITE_MESSAGE_BY_ROW_ID_LEGACY_SQL"
            android.database.Cursor r12 = r2.A0E(r1, r0, r3)     // Catch:{ all -> 0x0162 }
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x0147
            java.lang.String r0 = "expiration"
            long r19 = X.AnonymousClass0x2.A0C(r12, r0)     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "group_jid_row_id"
            long r2 = X.AnonymousClass0x2.A0C(r12, r0)     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "admin_jid_row_id"
            long r0 = X.AnonymousClass0x2.A0C(r12, r0)     // Catch:{ all -> 0x0156 }
            java.lang.String r14 = "group_name"
            java.lang.String r18 = X.AnonymousClass0x2.A0Z(r12, r14)     // Catch:{ all -> 0x0156 }
            java.lang.String r14 = "invite_code"
            java.lang.String r17 = X.AnonymousClass0x2.A0Z(r12, r14)     // Catch:{ all -> 0x0156 }
            java.lang.String r14 = "expired"
            int r16 = X.AnonymousClass0x2.A04(r12, r14)     // Catch:{ all -> 0x0156 }
            java.lang.String r14 = "group_type"
            int r15 = X.AnonymousClass0x2.A04(r12, r14)     // Catch:{ all -> 0x0156 }
            X.34p r13 = r13.A01     // Catch:{ all -> 0x0156 }
            java.lang.Class<X.1fJ> r14 = X.C27991fJ.class
            com.whatsapp.jid.Jid r3 = r13.A0B(r14, r2)     // Catch:{ all -> 0x0156 }
            X.1fJ r3 = (X.C27991fJ) r3     // Catch:{ all -> 0x0156 }
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.UserJid r0 = X.C623334p.A02(r13, r2, r0)     // Catch:{ all -> 0x0156 }
            if (r3 == 0) goto L_0x013e
            if (r0 == 0) goto L_0x013e
            boolean r2 = X.AnonymousClass000.A1S(r16)
            r11.A02 = r3     // Catch:{ all -> 0x0156 }
            r11.A03 = r0     // Catch:{ all -> 0x0156 }
            r0 = r18
            r11.A05 = r0     // Catch:{ all -> 0x0156 }
            r0 = r17
            r11.A06 = r0     // Catch:{ all -> 0x0156 }
            r0 = r19
            r11.A01 = r0     // Catch:{ all -> 0x0156 }
            r11.A07 = r2     // Catch:{ all -> 0x0156 }
            r11.A00 = r15     // Catch:{ all -> 0x0156 }
            goto L_0x0143
        L_0x013e:
            java.lang.String r0 = "GroupInviteMessageStore/fillQuotedGroupInviteInfoLegacy/could not fill group invite data as groupJid and/or adminJid are null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0156 }
        L_0x0143:
            r12.close()     // Catch:{ all -> 0x0162 }
            goto L_0x016c
        L_0x0147:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "GroupInviteMessageStore/fillQuotedGroupInviteInfoLegacy/missing group invite info for quoted message; rowId="
            java.lang.String r0 = X.C624134x.A0C(r11, r0, r1)     // Catch:{ all -> 0x0156 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ all -> 0x0156 }
            throw r0     // Catch:{ all -> 0x0156 }
        L_0x0156:
            r1 = move-exception
            if (r12 == 0) goto L_0x0161
            r12.close()     // Catch:{ all -> 0x015d }
            goto L_0x0161
        L_0x015d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0162 }
        L_0x0161:
            throw r1     // Catch:{ all -> 0x0162 }
        L_0x0162:
            r1 = move-exception
            r21.close()     // Catch:{ all -> 0x0167 }
            goto L_0x016b
        L_0x0167:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x02d0 }
        L_0x016b:
            throw r1     // Catch:{ all -> 0x02d0 }
        L_0x016c:
            r21.close()     // Catch:{ all -> 0x02d0 }
        L_0x016f:
            boolean r3 = r7 instanceof X.C30821nD     // Catch:{ all -> 0x02d0 }
            if (r3 == 0) goto L_0x0180
            X.2k0 r12 = r6.A0E     // Catch:{ all -> 0x02d0 }
            r11 = r7
            X.1nD r11 = (X.C30821nD) r11     // Catch:{ all -> 0x02d0 }
            java.lang.String r2 = "GET_QUOTED_ORDER_MESSAGE_SQL_LEGACY"
            r1 = 1
            java.lang.String r0 = "SELECT message_row_id, order_id, thumbnail, order_title, item_count, status, surface, message, seller_jid, token, currency_code, total_amount_1000, message_version FROM quoted_message_order WHERE message_row_id=?"
            r12.A03(r11, r0, r2, r1)     // Catch:{ all -> 0x02d0 }
        L_0x0180:
            boolean r0 = r7 instanceof X.AnonymousClass4FG     // Catch:{ all -> 0x02d0 }
            if (r0 == 0) goto L_0x018c
            X.302 r1 = r6.A0J     // Catch:{ all -> 0x02d0 }
            r0 = r7
            X.4FG r0 = (X.AnonymousClass4FG) r0     // Catch:{ all -> 0x02d0 }
            r1.A05(r0, r4)     // Catch:{ all -> 0x02d0 }
        L_0x018c:
            boolean r0 = X.C624134x.A0c(r7)     // Catch:{ all -> 0x02d0 }
            if (r0 == 0) goto L_0x019b
            X.35R r11 = r6.A06     // Catch:{ all -> 0x02d0 }
            long r0 = r7.A1L     // Catch:{ all -> 0x02d0 }
            java.lang.String r2 = "SELECT element_type, element_content FROM message_quoted_ui_elements WHERE message_row_id = ?"
            r11.A07(r7, r2, r0)     // Catch:{ all -> 0x02d0 }
        L_0x019b:
            boolean r12 = r7 instanceof X.AnonymousClass4DV     // Catch:{ all -> 0x02d0 }
            if (r12 == 0) goto L_0x01ab
            X.35R r13 = r6.A06     // Catch:{ all -> 0x02d0 }
            r11 = r7
            X.4DV r11 = (X.AnonymousClass4DV) r11     // Catch:{ all -> 0x02d0 }
            long r0 = r7.A1L     // Catch:{ all -> 0x02d0 }
            java.lang.String r2 = "SELECT element_type, element_content FROM message_quoted_ui_elements WHERE message_row_id = ?"
            r13.A0H(r11, r2, r0)     // Catch:{ all -> 0x02d0 }
        L_0x01ab:
            boolean r14 = r7 instanceof X.C30431mR     // Catch:{ all -> 0x02d0 }
            if (r14 == 0) goto L_0x01bb
            X.2eB r11 = r6.A0F     // Catch:{ all -> 0x02d0 }
            r2 = r7
            X.1mR r2 = (X.C30431mR) r2     // Catch:{ all -> 0x02d0 }
            java.lang.String r1 = "SELECT message_row_id, service, expiration_timestamp FROM messages_quotes_payment_invite_legacy WHERE message_row_id = ?"
            java.lang.String r0 = "GET_QUOTED_PAYMENT_INVITE_LEGACY"
            r11.A00(r2, r1, r0)     // Catch:{ all -> 0x02d0 }
        L_0x01bb:
            boolean r13 = r7 instanceof X.C31901p2     // Catch:{ all -> 0x02d0 }
            if (r13 == 0) goto L_0x01cb
            X.35R r11 = r6.A06     // Catch:{ all -> 0x02d0 }
            r2 = r7
            X.1p2 r2 = (X.C31901p2) r2     // Catch:{ all -> 0x02d0 }
            java.lang.String r1 = "SELECT message_row_id, element_type, reply_values, reply_description FROM message_quoted_ui_elements_reply_legacy WHERE message_row_id=?"
            java.lang.String r0 = "GET_QUOTED_REPLY_MESSAGE_SQL"
            r11.A0E(r2, r1, r0)     // Catch:{ all -> 0x02d0 }
        L_0x01cb:
            boolean r11 = r7 instanceof X.C31911p3     // Catch:{ all -> 0x02d0 }
            if (r11 == 0) goto L_0x01dd
            X.35R r0 = r6.A06     // Catch:{ all -> 0x02d0 }
            r15 = r0
            r0 = r7
            X.1p3 r0 = (X.C31911p3) r0     // Catch:{ all -> 0x02d0 }
            r2 = r0
            java.lang.String r1 = "SELECT message_row_id, element_type, reply_values, reply_description FROM message_quoted_ui_elements_reply_legacy WHERE message_row_id=?"
            java.lang.String r0 = "GET_QUOTED_RESPONSE_BUTTONS_MESSAGE_SQL"
            r15.A0B(r2, r1, r0)     // Catch:{ all -> 0x02d0 }
        L_0x01dd:
            r26.close()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x02da }
            X.C626936e.A06(r27)     // Catch:{ all -> 0x02f4 }
            r0 = r27
            android.content.ContentValues r6 = r6.A00(r0, r7, r4)     // Catch:{ all -> 0x02f4 }
            r0 = r29
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x02f4 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x02f4 }
            java.lang.String r1 = "message_quoted"
            java.lang.String r0 = "INSERT_TABLE_MESSAGE_QUOTED"
            r2.A0B(r1, r0, r6)     // Catch:{ all -> 0x02f4 }
            X.30w r0 = r7.A0y()     // Catch:{ all -> 0x02f4 }
            if (r0 == 0) goto L_0x020c
            X.30w r1 = r7.A0y()     // Catch:{ all -> 0x02f4 }
            X.30w r0 = r7.A0y()     // Catch:{ all -> 0x02f4 }
            byte[] r0 = r0.A08()     // Catch:{ all -> 0x02f4 }
            r1.A02(r0)     // Catch:{ all -> 0x02f4 }
        L_0x020c:
            if (r24 == 0) goto L_0x0216
            X.2ox r1 = r8.A09     // Catch:{ all -> 0x02f4 }
            r0 = r7
            X.1mz r0 = (X.C30771mz) r0     // Catch:{ all -> 0x02f4 }
            r1.A02(r0, r4)     // Catch:{ all -> 0x02f4 }
        L_0x0216:
            if (r23 == 0) goto L_0x0220
            X.2oi r1 = r8.A00     // Catch:{ all -> 0x02f4 }
            r0 = r7
            X.1my r0 = (X.C30761my) r0     // Catch:{ all -> 0x02f4 }
            r1.A02(r0, r4)     // Catch:{ all -> 0x02f4 }
        L_0x0220:
            if (r22 == 0) goto L_0x022a
            X.2qs r1 = r8.A01     // Catch:{ all -> 0x02f4 }
            r0 = r7
            X.1mN r0 = (X.C30391mN) r0     // Catch:{ all -> 0x02f4 }
            r1.A05(r0, r4)     // Catch:{ all -> 0x02f4 }
        L_0x022a:
            if (r3 == 0) goto L_0x0234
            X.2k0 r1 = r8.A07     // Catch:{ all -> 0x02f4 }
            r0 = r7
            X.1nD r0 = (X.C30821nD) r0     // Catch:{ all -> 0x02f4 }
            r1.A02(r0, r4)     // Catch:{ all -> 0x02f4 }
        L_0x0234:
            if (r12 == 0) goto L_0x023e
            X.35R r1 = r8.A02     // Catch:{ all -> 0x02f4 }
            r0 = r7
            X.4DV r0 = (X.AnonymousClass4DV) r0     // Catch:{ all -> 0x02f4 }
            r1.A0G(r0, r4)     // Catch:{ all -> 0x02f4 }
        L_0x023e:
            boolean r0 = X.C624134x.A0c(r7)     // Catch:{ all -> 0x02f4 }
            if (r0 == 0) goto L_0x0250
            X.35R r2 = r8.A02     // Catch:{ all -> 0x02f4 }
            X.2Ot r1 = X.C40802Hu.A01(r7)     // Catch:{ all -> 0x02f4 }
            java.lang.String r0 = "message_quoted_ui_elements"
            r2.A08(r1, r0, r4)     // Catch:{ all -> 0x02f4 }
        L_0x0250:
            if (r13 == 0) goto L_0x025a
            X.35R r1 = r8.A02     // Catch:{ all -> 0x02f4 }
            r0 = r7
            X.1p2 r0 = (X.C31901p2) r0     // Catch:{ all -> 0x02f4 }
            r1.A0D(r0, r4)     // Catch:{ all -> 0x02f4 }
        L_0x025a:
            if (r11 == 0) goto L_0x0264
            X.35R r1 = r8.A02     // Catch:{ all -> 0x02f4 }
            r0 = r7
            X.1p3 r0 = (X.C31911p3) r0     // Catch:{ all -> 0x02f4 }
            r1.A0A(r0, r4)     // Catch:{ all -> 0x02f4 }
        L_0x0264:
            boolean r0 = r7 instanceof X.C30361mK     // Catch:{ all -> 0x02f4 }
            if (r0 == 0) goto L_0x0270
            X.2mA r1 = r8.A03     // Catch:{ all -> 0x02f4 }
            r0 = r7
            X.1mK r0 = (X.C30361mK) r0     // Catch:{ all -> 0x02f4 }
            r1.A03(r0, r4)     // Catch:{ all -> 0x02f4 }
        L_0x0270:
            if (r25 == 0) goto L_0x027a
            X.30m r1 = r8.A05     // Catch:{ all -> 0x02f4 }
            r0 = r7
            X.1mV r0 = (X.C30471mV) r0     // Catch:{ all -> 0x02f4 }
            r1.A08(r0, r4)     // Catch:{ all -> 0x02f4 }
        L_0x027a:
            boolean r0 = r7.A1m()     // Catch:{ all -> 0x02f4 }
            if (r0 == 0) goto L_0x0285
            X.2mb r0 = r8.A06     // Catch:{ all -> 0x02f4 }
            r0.A02(r7, r4)     // Catch:{ all -> 0x02f4 }
        L_0x0285:
            boolean r0 = r7 instanceof X.C30421mQ     // Catch:{ all -> 0x02f4 }
            if (r0 == 0) goto L_0x02a6
            X.30v r2 = r8.A0C     // Catch:{ all -> 0x02f4 }
            r0 = r7
            X.1mQ r0 = (X.C30421mQ) r0     // Catch:{ all -> 0x02f4 }
            java.lang.String r1 = r0.A1v()     // Catch:{ all -> 0x02f4 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x02f4 }
            if (r0 != 0) goto L_0x029b
            r2.A06(r1, r4)     // Catch:{ all -> 0x02f4 }
        L_0x029b:
            boolean r0 = r7 instanceof X.C30481mW     // Catch:{ all -> 0x02f4 }
            if (r0 == 0) goto L_0x02b3
            X.2qC r1 = r8.A0B     // Catch:{ all -> 0x02f4 }
            r0 = 0
            r1.A00(r7, r4, r0)     // Catch:{ all -> 0x02f4 }
            goto L_0x02b3
        L_0x02a6:
            boolean r0 = r7 instanceof X.C30411mP     // Catch:{ all -> 0x02f4 }
            if (r0 == 0) goto L_0x029b
            X.30v r1 = r8.A0C     // Catch:{ all -> 0x02f4 }
            r0 = r7
            X.1mP r0 = (X.C30411mP) r0     // Catch:{ all -> 0x02f4 }
            r1.A03(r0, r4)     // Catch:{ all -> 0x02f4 }
            goto L_0x029b
        L_0x02b3:
            if (r14 == 0) goto L_0x02c1
            X.2eB r3 = r8.A08     // Catch:{ all -> 0x02f4 }
            r2 = r7
            X.1mR r2 = (X.C30431mR) r2     // Catch:{ all -> 0x02f4 }
            java.lang.String r1 = "SELECT message_row_id, service, expiration_timestamp FROM message_quoted_payment_invite WHERE message_row_id = ?"
            java.lang.String r0 = "GET_QUOTED_PAYMENT_INVITE"
            r3.A00(r2, r1, r0)     // Catch:{ all -> 0x02f4 }
        L_0x02c1:
            boolean r0 = r7 instanceof X.C30941nT     // Catch:{ all -> 0x02f4 }
            if (r0 == 0) goto L_0x02cc
            X.2WA r0 = r8.A0D     // Catch:{ all -> 0x02f4 }
            X.1nT r7 = (X.C30941nT) r7     // Catch:{ all -> 0x02f4 }
            r0.A00(r7, r4)     // Catch:{ all -> 0x02f4 }
        L_0x02cc:
            int r28 = r28 + 1
            goto L_0x001f
        L_0x02d0:
            r1 = move-exception
            r26.close()     // Catch:{ all -> 0x02d5 }
            goto L_0x02d9
        L_0x02d5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x02da }
        L_0x02d9:
            throw r1     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x02da }
        L_0x02da:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02f4 }
            java.lang.String r0 = "QuotedMessageStore/QuotedMessageDatabaseMigration/processBatch/missing information, skipping; rowId="
            X.C18260x0.A11(r0, r1, r4)     // Catch:{ all -> 0x02f4 }
            goto L_0x001f
        L_0x02e5:
            int r10 = r10 + 1
            goto L_0x001f
        L_0x02e9:
            r29.close()
            X.32H r1 = new X.32H
            r0 = r28
            r1.<init>(r0, r4, r10)
            return r1
        L_0x02f4:
            r1 = move-exception
            r29.close()     // Catch:{ all -> 0x02f9 }
            throw r1
        L_0x02f9:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23101Rh.A0D(android.database.Cursor):X.32H");
    }
}
