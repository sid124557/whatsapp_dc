package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Lg  reason: invalid class name and case insensitive filesystem */
public class C66393Lg implements AnonymousClass485 {
    public final C55682qk A00;
    public final C49392gS A01;
    public final AnonymousClass310 A02;
    public final C54432oi A03;
    public final C56922sm A04;
    public final C55762qs A05;
    public final AnonymousClass35R A06;
    public final C623334p A07;
    public final C52862mA A08;
    public final C56562sC A09;
    public final C613830m A0A;
    public final C53132mb A0B;
    public final C54762pF A0C;
    public final C72303dV A0D;
    public final C51552k0 A0E;
    public final C48002eB A0F;
    public final AnonymousClass36F A0G;
    public final C54582ox A0H;
    public final C56082rO A0I;
    public final AnonymousClass302 A0J;
    public final C55342qC A0K;
    public final C614530v A0L;
    public final AnonymousClass2WA A0M;
    public final C59932xj A0N;
    public final AnonymousClass2YF A0O;

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x015a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015b, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C624134x r14, boolean r15) {
        /*
            r13 = this;
            r0 = 1
            X.C626936e.A0C(r0)
            X.34x r4 = r14.A0w()
            boolean r0 = r4 instanceof X.C30361mK
            if (r0 == 0) goto L_0x0016
            X.2mA r3 = r13.A08
            r2 = r4
            X.1mK r2 = (X.C30361mK) r2
            long r0 = r14.A1L
            r3.A03(r2, r0)
        L_0x0016:
            boolean r0 = r4 instanceof X.C30471mV
            if (r0 == 0) goto L_0x0024
            X.30m r3 = r13.A0A
            r2 = r4
            X.1mV r2 = (X.C30471mV) r2
            long r0 = r14.A1L
            r3.A08(r2, r0)
        L_0x0024:
            boolean r0 = r4 instanceof X.C30771mz
            if (r0 == 0) goto L_0x0032
            X.2ox r3 = r13.A0H
            r2 = r4
            X.1mz r2 = (X.C30771mz) r2
            long r0 = r14.A1L
            r3.A02(r2, r0)
        L_0x0032:
            boolean r0 = r4 instanceof X.C30761my
            if (r0 == 0) goto L_0x0040
            X.2oi r3 = r13.A03
            r2 = r4
            X.1my r2 = (X.C30761my) r2
            long r0 = r14.A1L
            r3.A02(r2, r0)
        L_0x0040:
            boolean r0 = r4 instanceof X.C30391mN
            if (r0 == 0) goto L_0x004e
            X.2qs r3 = r13.A05
            r2 = r4
            X.1mN r2 = (X.C30391mN) r2
            long r0 = r14.A1L
            r3.A05(r2, r0)
        L_0x004e:
            boolean r0 = r4 instanceof X.C30821nD
            if (r0 == 0) goto L_0x005c
            X.2k0 r3 = r13.A0E
            r2 = r4
            X.1nD r2 = (X.C30821nD) r2
            long r0 = r14.A1L
            r3.A02(r2, r0)
        L_0x005c:
            boolean r0 = r4 instanceof X.AnonymousClass4DV
            if (r0 == 0) goto L_0x006a
            X.35R r3 = r13.A06
            r2 = r4
            X.4DV r2 = (X.AnonymousClass4DV) r2
            long r0 = r14.A1L
            r3.A0G(r2, r0)
        L_0x006a:
            boolean r0 = r4 instanceof X.C31901p2
            if (r0 == 0) goto L_0x0078
            X.35R r3 = r13.A06
            r2 = r4
            X.1p2 r2 = (X.C31901p2) r2
            long r0 = r14.A1L
            r3.A0D(r2, r0)
        L_0x0078:
            boolean r0 = r4 instanceof X.C31911p3
            if (r0 == 0) goto L_0x0086
            X.35R r3 = r13.A06
            r2 = r4
            X.1p3 r2 = (X.C31911p3) r2
            long r0 = r14.A1L
            r3.A0A(r2, r0)
        L_0x0086:
            if (r4 == 0) goto L_0x00a9
            boolean r0 = r4.A1m()
            if (r0 == 0) goto L_0x0095
            X.2mb r2 = r13.A0B
            long r0 = r14.A1L
            r2.A02(r4, r0)
        L_0x0095:
            boolean r0 = X.C624134x.A0c(r4)
            if (r0 == 0) goto L_0x00a9
            X.35R r5 = r13.A06
            X.2Ot r3 = X.C40802Hu.A01(r4)
            long r0 = r14.A1L
            java.lang.String r2 = "message_quoted_ui_elements"
            r5.A08(r3, r2, r0)
        L_0x00a9:
            boolean r0 = r4 instanceof X.C30421mQ
            if (r0 == 0) goto L_0x010b
            X.30v r5 = r13.A0L
            r2 = r4
            X.1mQ r2 = (X.C30421mQ) r2
            long r0 = r14.A1L
            java.lang.String r3 = r2.A1v()
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x00c1
            r5.A06(r3, r0)
        L_0x00c1:
            boolean r0 = r4 instanceof X.C30481mW
            if (r0 == 0) goto L_0x00cc
            X.2qC r2 = r13.A0K
            long r0 = r14.A1L
            r2.A00(r4, r0, r15)
        L_0x00cc:
            boolean r0 = r4 instanceof X.C30431mR
            if (r0 == 0) goto L_0x00e3
            X.2eB r5 = r13.A0F
            r0 = r4
            X.1mR r0 = (X.C30431mR) r0
            long r9 = r14.A1L
            java.lang.String r6 = "message_quoted_payment_invite"
            int r8 = r0.A00
            long r11 = r0.A01
            java.lang.String r7 = "INSERT_QUOTED_PAYMENT_INVITE"
            r5.A01(r6, r7, r8, r9, r11)
        L_0x00e3:
            boolean r0 = r4 instanceof X.C30941nT
            if (r0 == 0) goto L_0x00f1
            X.2WA r3 = r13.A0M
            r2 = r4
            X.1nT r2 = (X.C30941nT) r2
            long r0 = r14.A1L
            r3.A00(r2, r0)
        L_0x00f1:
            boolean r0 = r4 instanceof X.C30401mO
            if (r0 == 0) goto L_0x010a
            X.2gS r3 = r13.A01
            X.1mO r4 = (X.C30401mO) r4
            long r0 = r14.A1L
            r2 = 0
            X.C162457s7.A0J(r4, r2)
            X.2Vg r2 = r3.A00
            X.3ZF r5 = r4.A01
            if (r5 != 0) goto L_0x011a
            java.lang.String r0 = "MessageCallLogStore/insertOrUpdateQuotedMessageCallLog call log is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x010a:
            return
        L_0x010b:
            boolean r0 = r4 instanceof X.C30411mP
            if (r0 == 0) goto L_0x00c1
            X.30v r3 = r13.A0L
            r2 = r4
            X.1mP r2 = (X.C30411mP) r2
            long r0 = r14.A1L
            r3.A03(r2, r0)
            goto L_0x00c1
        L_0x011a:
            X.3dV r2 = r2.A00
            X.4Fq r3 = r2.A04()
            android.content.ContentValues r6 = X.C18290x4.A0E()     // Catch:{ all -> 0x0158 }
            X.C18270x1.A0a(r6, r0)     // Catch:{ all -> 0x0158 }
            java.lang.String r1 = "video_call"
            boolean r0 = r5.A0L     // Catch:{ all -> 0x0158 }
            X.AnonymousClass0x2.A0o(r6, r1, r0)     // Catch:{ all -> 0x0158 }
            java.lang.String r1 = "call_result"
            int r0 = r5.A00     // Catch:{ all -> 0x0158 }
            X.2sg r5 = X.AnonymousClass3H0.A01(r6, r3, r1, r0)     // Catch:{ all -> 0x0158 }
            java.lang.String r2 = "message_quoted_call_log"
            r1 = 5
            java.lang.String r0 = "INSERT_OR_UPDATE_QUOTED_CALL_LOG_MESSAGE"
            long r5 = r5.A0C(r2, r0, r6, r1)     // Catch:{ all -> 0x0158 }
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0154
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0158 }
            java.lang.String r0 = "MessageCallLogStore/insertOrUpdateQuotedMessageCallLog/insert error, rowId="
            java.lang.String r0 = X.C624134x.A0C(r4, r0, r1)     // Catch:{ all -> 0x0158 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0158 }
        L_0x0154:
            r3.close()
            return
        L_0x0158:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x015a }
        L_0x015a:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66393Lg.A03(X.34x, boolean):void");
    }

    public void A01(C624134x r32) {
        Throwable th;
        Cursor A0E2;
        Throwable th2;
        AnonymousClass4GK r5;
        Cursor cursor;
        AnonymousClass4GK r8;
        Throwable th3;
        File file;
        Cursor A0E3;
        Cursor A0E4;
        C624134x r13 = r32;
        try {
            C72303dV r0 = this.A0D;
            AnonymousClass4GK A032 = r0.get();
            try {
                long j = r13.A1L;
                AnonymousClass4GK A033 = r0.get();
                try {
                    C56862sg r6 = ((AnonymousClass3H0) A033).A03;
                    boolean z = true;
                    String[] strArr = new String[1];
                    C18260x0.A1X(strArr, j);
                    A0E2 = r6.A0E("SELECT chat_row_id, from_me, sender_jid_row_id, key_id, timestamp, message_type, origin, text_data, payment_transaction_id, lookup_tables FROM message_quoted WHERE message_row_id = ?", "GET_QUOTED_CORE_MESSAGE_BY_ROW_ID_SQL", strArr);
                    if (A0E2.moveToLast()) {
                        C95814uZ A0B2 = this.A04.A0B(AnonymousClass0x2.A0C(A0E2, "chat_row_id"));
                        if (A0B2 != null) {
                            if (AnonymousClass0x2.A04(A0E2, "from_me") <= 0) {
                                z = false;
                            }
                            String A0Z = AnonymousClass0x2.A0Z(A0E2, "key_id");
                            long A0C2 = AnonymousClass0x2.A0C(A0E2, "timestamp");
                            C624134x A002 = this.A0O.A00(AnonymousClass2z0.A05(A0B2, A0Z, z), (byte) AnonymousClass0x2.A04(A0E2, "message_type"), A0C2);
                            A002.A1J(AnonymousClass32Y.A02(this.A07, AnonymousClass0x2.A0C(A0E2, "sender_jid_row_id")));
                            A002.A09 = AnonymousClass0x2.A04(A0E2, "origin");
                            A002.A1f(AnonymousClass0x2.A0Z(A0E2, "text_data"));
                            A002.A1L = j;
                            A002.A15 = AnonymousClass0x2.A0Z(A0E2, "payment_transaction_id");
                            A002.A1P = AnonymousClass0x2.A0C(A0E2, "lookup_tables");
                            A0E2.close();
                            A033.close();
                            AnonymousClass2z0 r2 = A002.A1J;
                            if (r2.A00 == null) {
                                Log.d("QuotedMessageStore/fillQuote/null remote jid");
                            }
                            A002.A1H(2);
                            r13.A1R(A002);
                            if (!TextUtils.isEmpty(A002.A15)) {
                                A002.A0P = AnonymousClass36F.A05(this.A0G, r2.A01, A002.A15);
                            }
                            long j2 = r13.A1L;
                            AnonymousClass4GK A034 = r0.get();
                            try {
                                if (A002 instanceof AnonymousClass4FG) {
                                    this.A0J.A05((AnonymousClass4FG) A002, j2);
                                }
                                if (C624134x.A0c(A002)) {
                                    this.A06.A07(A002, "SELECT element_type, element_content FROM message_quoted_ui_elements WHERE message_row_id = ?", A002.A1L);
                                }
                                if ((A002.A1P & 1) == 1) {
                                    C53132mb r9 = this.A0B;
                                    ArrayList A0s = AnonymousClass001.A0s();
                                    A032 = r9.A03.get();
                                    try {
                                        C56862sg r3 = ((AnonymousClass3H0) A032).A03;
                                        String[] A1Y = AnonymousClass0x9.A1Y();
                                        C18260x0.A1Y(A1Y, j2);
                                        A0E4 = r3.A0E("SELECT jid_row_id, display_name FROM message_quoted_mentions WHERE message_row_id = ?", "GET_JIDS_FROM_MESSAGE_QUOTED_MENTIONS_TABLE_SQL", A1Y);
                                        int columnIndexOrThrow = A0E4.getColumnIndexOrThrow("jid_row_id");
                                        int columnIndexOrThrow2 = A0E4.getColumnIndexOrThrow("display_name");
                                        while (A0E4.moveToNext()) {
                                            long j3 = A0E4.getLong(columnIndexOrThrow);
                                            String string = A0E4.getString(columnIndexOrThrow2);
                                            C95814uZ A035 = C106405Yw.A03(r9.A02.A08(j3));
                                            if (A035 != null) {
                                                A0s.add(new AnonymousClass3ZM(A035, string));
                                            }
                                        }
                                        A0E4.close();
                                        A032.close();
                                        A002.A1g(A0s);
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        throw th2;
                                    }
                                }
                                if (A002 instanceof C30771mz) {
                                    this.A0H.A03((C30771mz) A002, "SELECT message_row_id, business_owner_jid, product_id, title, description, currency_code, amount_1000, retailer_id, url, product_image_count, sale_amount_1000, body, footer FROM message_quoted_product WHERE message_row_id=?", "GET_QUOTED_PRODUCT_MESSAGE_SQL");
                                }
                                if (A002 instanceof C30761my) {
                                    this.A03.A03((C30761my) A002, "SELECT message_row_id, business_owner_jid, title, description FROM message_quoted_product WHERE message_row_id = ?", "GET_QUOTED_CATALOG_MESSAGE_SQL_DEPRECATED");
                                }
                                if (A002 instanceof C30391mN) {
                                    C55762qs r14 = this.A05;
                                    C30391mN r10 = (C30391mN) A002;
                                    String[] A1Y2 = AnonymousClass0x9.A1Y();
                                    C18260x0.A1Y(A1Y2, r10.A1L);
                                    AnonymousClass4GK A036 = r14.A02.get();
                                    try {
                                        A0E3 = ((AnonymousClass3H0) A036).A03.A0E("SELECT group_jid_row_id, admin_jid_row_id, group_name, invite_code, expiration, expired, group_type FROM message_quoted_group_invite WHERE message_row_id = ?", "GET_QUOTED_GROUP_INVITE_MESSAGE_BY_ROW_ID_SQL", A1Y2);
                                        if (A0E3.moveToNext()) {
                                            long A0C3 = AnonymousClass0x2.A0C(A0E3, "expiration");
                                            long A0C4 = AnonymousClass0x2.A0C(A0E3, "group_jid_row_id");
                                            long A0C5 = AnonymousClass0x2.A0C(A0E3, "admin_jid_row_id");
                                            String A0Z2 = AnonymousClass0x2.A0Z(A0E3, "group_name");
                                            String A0Z3 = AnonymousClass0x2.A0Z(A0E3, "invite_code");
                                            int A042 = AnonymousClass0x2.A04(A0E3, "expired");
                                            int A043 = AnonymousClass0x2.A04(A0E3, "group_type");
                                            C623334p r02 = r14.A01;
                                            C27991fJ r4 = (C27991fJ) r02.A0B(C27991fJ.class, A0C4);
                                            UserJid A022 = C623334p.A02(r02, UserJid.class, A0C5);
                                            if (r4 == null || A022 == null) {
                                                Log.e("GroupInviteMessageStore/fillQuotedGroupInviteInfo/could not fill group invite data as groupJid and/or adminJid are null");
                                            } else {
                                                boolean A1S = AnonymousClass000.A1S(A042);
                                                r10.A02 = r4;
                                                r10.A03 = A022;
                                                r10.A05 = A0Z2;
                                                r10.A06 = A0Z3;
                                                r10.A01 = A0C3;
                                                r10.A07 = A1S;
                                                r10.A00 = A043;
                                            }
                                        }
                                        A0E3.close();
                                        A036.close();
                                    } catch (Throwable th5) {
                                        th2 = th5;
                                        A036.close();
                                        throw th2;
                                    }
                                }
                                if (A002 instanceof C30821nD) {
                                    this.A0E.A03((C30821nD) A002, "SELECT message_row_id, order_id, thumbnail, order_title, item_count, status, surface, message, seller_jid, token, currency_code, total_amount_1000, message_version FROM message_quoted_order WHERE message_row_id=?", "GET_QUOTED_ORDER_MESSAGE_SQL", true);
                                }
                                if (A002 instanceof AnonymousClass4DV) {
                                    this.A06.A0H((AnonymousClass4DV) A002, "SELECT element_type, element_content FROM message_quoted_ui_elements WHERE message_row_id = ?", A002.A1L);
                                }
                                if (A002 instanceof C31901p2) {
                                    this.A06.A0E((C31901p2) A002, "SELECT message_row_id, element_type, reply_values, reply_description FROM message_quoted_ui_elements_reply WHERE message_row_id=?", "GET_QUOTED_REPLY_MESSAGE_SQL");
                                }
                                if (A002 instanceof C31911p3) {
                                    this.A06.A0B((C31911p3) A002, "SELECT message_row_id, element_type, reply_values, reply_description FROM message_quoted_ui_elements_reply WHERE message_row_id=?", "GET_QUOTED_RESPONSE_BUTTONS_MESSAGE_SQL");
                                }
                                if (A002 instanceof C30361mK) {
                                    C52862mA r52 = this.A08;
                                    C30361mK r42 = (C30361mK) A002;
                                    C624134x.A0V(r42, "LocationMessageStore/fillLocationInfoForQuotedMessage/message must have row_id set; key=", AnonymousClass001.A0o(), AnonymousClass001.A1W((r42.A1L > 0 ? 1 : (r42.A1L == 0 ? 0 : -1))));
                                    String[] strArr2 = new String[1];
                                    C624134x.A0X(r42, strArr2);
                                    r5 = r52.A02.get();
                                    cursor = ((AnonymousClass3H0) r5).A03.A0E("SELECT latitude, longitude, place_name, place_address, url, thumbnail FROM message_quoted_location WHERE message_row_id = ?", "GET_QUOTED_LOCATION_MESSAGE_BY_ROW_ID_SQL", strArr2);
                                    try {
                                        if (cursor.moveToNext()) {
                                            r42.A1v(cursor);
                                        }
                                        cursor.close();
                                        r5.close();
                                    } catch (Throwable th6) {
                                        th2 = th6;
                                        r5.close();
                                        throw th2;
                                    }
                                }
                                if (A002 instanceof C30471mV) {
                                    C613830m r53 = this.A0A;
                                    C30471mV r43 = (C30471mV) A002;
                                    C624134x.A0V(r43, "MediaCoreMessageStore/fillMediaInfoForQuotedMessage/message must have row_id set; key=", AnonymousClass001.A0o(), AnonymousClass001.A1W((r43.A1L > 0 ? 1 : (r43.A1L == 0 ? 0 : -1))));
                                    String[] strArr3 = new String[1];
                                    C624134x.A0X(r43, strArr3);
                                    r8 = r53.A04.get();
                                    Cursor A0E5 = ((AnonymousClass3H0) r8).A03.A0E("SELECT message_row_id, media_job_uuid, transferred, file_path, file_size, media_key, media_key_timestamp, width, height, direct_path, message_url, mime_type, file_length, media_name, file_hash, media_duration, page_count, enc_file_hash, thumbnail, media_caption FROM message_quoted_media WHERE message_row_id= ?", "GET_QUOTED_MESSAGE_MEDIA_SQL", strArr3);
                                    try {
                                        if (A0E5.moveToNext()) {
                                            AnonymousClass33C r22 = new AnonymousClass33C();
                                            r22.A0I = AnonymousClass0x2.A0Z(A0E5, "media_job_uuid");
                                            r22.A0R = C626135u.A05(A0E5, "transferred");
                                            r22.A0A = AnonymousClass0x2.A0C(A0E5, "file_size");
                                            r22.A0W = C18280x3.A1Z(A0E5, "media_key");
                                            r22.A0B = AnonymousClass0x2.A0C(A0E5, "media_key_timestamp");
                                            r22.A08 = AnonymousClass0x2.A04(A0E5, "width");
                                            r22.A06 = AnonymousClass0x2.A04(A0E5, "height");
                                            r22.A0G = AnonymousClass0x2.A0Z(A0E5, "direct_path");
                                            String A0Z4 = AnonymousClass0x2.A0Z(A0E5, "file_path");
                                            if (A0Z4 == null) {
                                                file = null;
                                            } else {
                                                file = AnonymousClass002.A0B(A0Z4);
                                            }
                                            r22.A0F = r53.A01.A06(file);
                                            r43.A1z(A0E5, r22);
                                        }
                                        try {
                                            A0E5.close();
                                            r8.close();
                                        } catch (Throwable th7) {
                                            th2 = th7;
                                            r8.close();
                                            throw th2;
                                        }
                                    } catch (Throwable th8) {
                                        th3.addSuppressed(th8);
                                    }
                                }
                                if (A002 instanceof C30421mQ) {
                                    C30421mQ r23 = (C30421mQ) A002;
                                    List A012 = this.A0L.A01(j2, true);
                                    if (!A012.isEmpty()) {
                                        r23.A1w((String) C18290x4.A0k(A012));
                                    }
                                } else if (A002 instanceof C30411mP) {
                                    C30411mP r24 = (C30411mP) A002;
                                    List A013 = this.A0L.A01(j2, true);
                                    if (!A013.isEmpty()) {
                                        r24.A1w(A013);
                                    }
                                }
                                if (A002 instanceof C30481mW) {
                                    C55342qC r54 = this.A0K;
                                    C30481mW r44 = (C30481mW) A002;
                                    C624134x.A0V(r44, "TextMessageStore/fillTextInfoForQuotedMessage/message must have row_id set; key=", AnonymousClass001.A0o(), AnonymousClass001.A1W((r44.A1L > 0 ? 1 : (r44.A1L == 0 ? 0 : -1))));
                                    String[] strArr4 = new String[1];
                                    C624134x.A0X(r44, strArr4);
                                    r5 = r54.A01.get();
                                    cursor = ((AnonymousClass3H0) r5).A03.A0E("SELECT thumbnail FROM message_quoted_text WHERE message_row_id = ?", "GET_QUOTED_TEXT_MESSAGE_BY_ROW_ID_SQL", strArr4);
                                    if (cursor.moveToNext()) {
                                        r44.A1y(C18280x3.A1Z(cursor, "thumbnail"));
                                    }
                                    cursor.close();
                                    r5.close();
                                }
                                if (A002 instanceof C30431mR) {
                                    this.A0F.A00((C30431mR) A002, "SELECT message_row_id, service, expiration_timestamp FROM message_quoted_payment_invite WHERE message_row_id = ?", "GET_QUOTED_PAYMENT_INVITE");
                                }
                                if (A002 instanceof C30941nT) {
                                    C30941nT r45 = (C30941nT) A002;
                                    r8 = this.A0M.A00.get();
                                    C56862sg r33 = ((AnonymousClass3H0) r8).A03;
                                    String[] A1Y3 = AnonymousClass0x9.A1Y();
                                    C18260x0.A1Y(A1Y3, j2);
                                    Cursor A0E6 = r33.A0E("SELECT message_row_id, parent_group_jid, group_subject FROM message_quoted_blank_reply WHERE message_row_id = ?", "GET_QUOTED_BLANK_REPLY_MESSAGE", A1Y3);
                                    try {
                                        if (A0E6.moveToLast()) {
                                            r45.A01 = AnonymousClass0x2.A0Z(A0E6, "parent_group_jid");
                                            r45.A00 = AnonymousClass0x2.A0Z(A0E6, "group_subject");
                                        }
                                        A0E6.close();
                                        r8.close();
                                    } catch (Throwable th9) {
                                        th3 = th9;
                                        if (A0E6 != null) {
                                            A0E6.close();
                                        }
                                        throw th3;
                                    }
                                }
                                if (A002 instanceof C30401mO) {
                                    C49392gS r1 = this.A01;
                                    C30401mO r11 = (C30401mO) A002;
                                    C162457s7.A0J(r11, 0);
                                    AnonymousClass2ND r62 = r1.A01;
                                    C44252Vg r55 = r1.A00;
                                    C55832qz r46 = (C55832qz) C18300x5.A0b(r1.A03);
                                    C80083xf r34 = new C80083xf(r1, r13);
                                    C162457s7.A0J(r46, 2);
                                    r62.A01.BkP(new C71723cZ(r62, r55, r46, r11, r13, r34, 2));
                                }
                                A034.close();
                                A032.close();
                                return;
                            } catch (Throwable th10) {
                                th = th10;
                                try {
                                    A034.close();
                                } catch (Throwable th11) {
                                    th.addSuppressed(th11);
                                }
                                throw th;
                            }
                        }
                    } else {
                        C18270x1.A1B("QuotedMessageStore/readQuotedMessage/no quote; rowId=", AnonymousClass001.A0o(), j);
                    }
                    A0E2.close();
                    A033.close();
                    A032.close();
                    return;
                    throw th;
                    throw th;
                    throw th;
                    throw th;
                } catch (Throwable th12) {
                    th = th12;
                    A033.close();
                    throw th;
                }
            } finally {
                A032.close();
            }
        } catch (IllegalArgumentException | IllegalStateException e) {
            r13.A0d = null;
            this.A00.A0A("QuotedMessageStore/fillQuotedMessage/failed to load quoted message", true, e.toString());
        } catch (Throwable th13) {
            th.addSuppressed(th13);
        }
    }

    public C66393Lg(C55682qk r2, C49392gS r3, AnonymousClass310 r4, C54432oi r5, C56922sm r6, C55762qs r7, AnonymousClass35R r8, C623334p r9, C52862mA r10, C56562sC r11, C613830m r12, C53132mb r13, C54762pF r14, C72303dV r15, C51552k0 r16, C48002eB r17, AnonymousClass36F r18, C54582ox r19, C56082rO r20, AnonymousClass302 r21, C55342qC r22, C614530v r23, AnonymousClass2WA r24, C59932xj r25, AnonymousClass2YF r26) {
        this.A07 = r9;
        this.A04 = r6;
        this.A00 = r2;
        this.A02 = r4;
        this.A09 = r11;
        this.A0K = r22;
        this.A0N = r25;
        this.A0E = r16;
        this.A0I = r20;
        this.A0L = r23;
        this.A03 = r5;
        this.A0B = r13;
        this.A0C = r14;
        this.A0D = r15;
        this.A0H = r19;
        this.A08 = r10;
        this.A0J = r21;
        this.A0A = r12;
        this.A0M = r24;
        this.A06 = r8;
        this.A05 = r7;
        this.A0G = r18;
        this.A0O = r26;
        this.A0F = r17;
        this.A01 = r3;
    }

    public final ContentValues A00(C95814uZ r7, C624134x r8, long j) {
        long A052;
        ContentValues A062 = AnonymousClass0x9.A06();
        C18270x1.A0a(A062, j);
        C56922sm r3 = this.A04;
        long A072 = r3.A07(r7);
        C18270x1.A0c(A062, "parent_message_chat_row_id", A072);
        AnonymousClass2z0 r5 = r8.A1J;
        C95814uZ r0 = r5.A00;
        if (r0 != null) {
            C626936e.A06(r0);
            A072 = r3.A07(r0);
        } else {
            C626936e.A0D(r7 instanceof UserJid, "Quoted message chatJid is not specified, parentJid is not a UserJid.");
        }
        C18270x1.A0c(A062, "chat_row_id", A072);
        A062.put("from_me", Integer.valueOf(r5.A02 ? 1 : 0));
        C95814uZ A0n = r8.A0n();
        if (A0n == null) {
            A052 = 0;
        } else {
            A052 = this.A07.A05(A0n);
        }
        A062.put("sender_jid_row_id", Long.valueOf(A052));
        A062.put("key_id", r5.A01);
        C18290x4.A19(A062, r8.A0K);
        A062.put("message_type", Byte.valueOf(r8.A1I));
        A062.put("origin", Integer.valueOf(r8.A09));
        A062.put("text_data", r8.A18());
        A062.put("payment_transaction_id", r8.A15);
        A062.put("lookup_tables", Long.valueOf(r8.A0m()));
        return A062;
    }

    public void A02(C624134x r12) {
        C85284Fq A042;
        C624134x A0w = r12.A0w();
        if (A0w != null) {
            C626936e.A0C(AnonymousClass000.A1U(A0w.A0l(), 2));
            C85284Fq A043 = this.A0D.A04();
            try {
                C69833Yo Axl = A043.Axl();
                try {
                    ((AnonymousClass3H0) A043).A03.A0B("message_quoted", "INSERT_TABLE_MESSAGE_QUOTED", A00(AnonymousClass2z0.A00(r12), A0w, r12.A1L));
                    A03(r12, false);
                    if (A0w instanceof AnonymousClass4FG) {
                        AnonymousClass302 r5 = this.A0J;
                        AnonymousClass4FG r8 = (AnonymousClass4FG) A0w;
                        long j = r12.A1L;
                        boolean z = true;
                        C626936e.A0E(AnonymousClass001.A1W((j > 0 ? 1 : (j == 0 ? 0 : -1))), "TemplateMessageStore/fillQuotedTemplateData/parent message row must be set");
                        A042 = r5.A01.A04();
                        C47142cm BDY = r8.BDY();
                        ContentValues A0E2 = C18290x4.A0E();
                        C18270x1.A0a(A0E2, j);
                        A0E2.put("content_text_data", BDY.A02);
                        if (j != AnonymousClass3H0.A03(A0E2, A042, "footer_text_data", BDY.A03).A0C("message_template_quoted", "INSERT_TEMPLATE_QUOTED_SQL", A0E2, 5)) {
                            z = false;
                        }
                        C626936e.A0F(z, "TemplateMessageStore/insertOrUpdateTemplateQuotedData/inserted row should have same row_id");
                        A042.close();
                    }
                    Axl.A00();
                    Axl.close();
                    A043.close();
                    return;
                } catch (Throwable th) {
                    Axl.close();
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    A043.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } else {
            return;
        }
        throw th;
    }
}
