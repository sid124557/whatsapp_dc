package X;

import android.database.Cursor;
import com.whatsapp.TextData;

/* renamed from: X.2qC  reason: invalid class name and case insensitive filesystem */
public class C55342qC {
    public final C56922sm A00;
    public final C72303dV A01;
    public final C56082rO A02;
    public final C612830a A03;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0039, code lost:
        if (r1 == 0) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C624134x r12, long r13, boolean r15) {
        /*
            r11 = this;
            boolean r2 = r12 instanceof X.C30481mW
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "TextMessageStore/insertOrUpdateQuotedTextMessage/message must be a text message; key="
            X.2z0 r4 = X.C624134x.A09(r12, r0, r1, r2)
            r1 = 0
            r3 = 1
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            boolean r2 = X.AnonymousClass001.A1W(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "TextMessageStore/insertOrUpdateQuotedTextMessage/message must have row_id set; key="
            X.C18260x0.A0l(r4, r0, r1, r2)
            int r1 = r12.A0l()
            r0 = 2
            if (r1 == r0) goto L_0x0026
            r3 = 0
        L_0x0026:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "TextMessageStore/insertOrUpdateQuotedTextMessage/message in main storage; key="
            X.C18260x0.A0l(r4, r0, r1, r3)
            X.1mW r12 = (X.C30481mW) r12
            byte[] r0 = r12.A1z()
            if (r0 == 0) goto L_0x003b
            int r1 = r0.length
            r0 = 1
            if (r1 != 0) goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            java.lang.String r7 = "message_quoted_text"
            r4 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0088
            X.3dV r0 = r11.A01
            X.4Fq r3 = r0.A04()
            android.content.ContentValues r6 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0083 }
            X.C18270x1.A0a(r6, r13)     // Catch:{ all -> 0x0083 }
            java.lang.String r2 = "thumbnail"
            byte[] r0 = r12.A1z()     // Catch:{ all -> 0x0083 }
            X.C621833x.A04(r6, r2, r0)     // Catch:{ all -> 0x0083 }
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0083 }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x0083 }
            java.lang.String r8 = "message_row_id = ?"
            java.lang.String[] r10 = new java.lang.String[r1]     // Catch:{ all -> 0x0083 }
            X.AnonymousClass0x2.A1S(r10, r4, r13)     // Catch:{ all -> 0x0083 }
            java.lang.String r9 = "UPDATE_MESSAGE_QUOTED_TEXT_SQL"
            int r0 = r5.A05(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0083 }
            if (r0 == r1) goto L_0x007f
            java.lang.String r0 = "INSERT_MESSAGE_QUOTED_TEXT_SQL"
            long r1 = r5.A09(r7, r0, r6)     // Catch:{ all -> 0x0083 }
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x007a
            r4 = 1
        L_0x007a:
            java.lang.String r0 = "TextMessageStore/insertOrUpdateQuotedTextMessage/inserted row should have same row_id"
            X.C626936e.A0F(r4, r0)     // Catch:{ all -> 0x0083 }
        L_0x007f:
            r3.close()
            return
        L_0x0083:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x00a8 }
            throw r1
        L_0x0088:
            if (r15 == 0) goto L_0x00b0
            X.3dV r0 = r11.A01
            X.4Fq r5 = r0.A04()
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00a3 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x00a3 }
            java.lang.String r2 = "message_row_id = ?"
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x00a3 }
            X.AnonymousClass0x2.A1S(r1, r4, r13)     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = "DELETE_MESSAGE_QUOTED_TEXT_SQL"
            r3.A07(r7, r2, r0, r1)     // Catch:{ all -> 0x00a3 }
            goto L_0x00ad
        L_0x00a3:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x00a8 }
            throw r1
        L_0x00a8:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x00ad:
            r5.close()
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55342qC.A00(X.34x, long, boolean):void");
    }

    public void A01(C30481mW r8) {
        Cursor A0E;
        if (this.A02.A00("text_ready", 0) == 1) {
            C624134x.A0V(r8, "TextMessageStore/fillTextInfo/message must have row_id set; key=", AnonymousClass001.A0o(), AnonymousClass001.A1W((r8.A1L > 0 ? 1 : (r8.A1L == 0 ? 0 : -1))));
            String[] strArr = new String[1];
            C624134x.A0X(r8, strArr);
            AnonymousClass4GK A032 = this.A01.get();
            try {
                A0E = ((AnonymousClass3H0) A032).A03.A0E("SELECT description, page_title, url, font_style, text_color, background_color, preview_type, invite_link_group_type, counter_abuse_token FROM message_text WHERE message_row_id = ?", "GET_TEXT_MESSAGE_BY_ROW_ID_SQL", strArr);
                if (A0E.moveToNext()) {
                    r8.A04 = AnonymousClass0x2.A0Z(A0E, "description");
                    r8.A06 = AnonymousClass0x2.A0Z(A0E, "page_title");
                    r8.A07 = AnonymousClass0x2.A0Z(A0E, "url");
                    if (!A0E.isNull(A0E.getColumnIndexOrThrow("font_style"))) {
                        TextData textData = new TextData();
                        textData.fontStyle = AnonymousClass0x2.A04(A0E, "font_style");
                        textData.textColor = AnonymousClass0x2.A04(A0E, "text_color");
                        textData.backgroundColor = AnonymousClass0x2.A04(A0E, "background_color");
                        r8.A1x(textData);
                    }
                    r8.A01 = AnonymousClass0x2.A04(A0E, "preview_type");
                    r8.A00 = AnonymousClass0x2.A04(A0E, "invite_link_group_type");
                    r8.A03 = AnonymousClass0x2.A0Z(A0E, "counter_abuse_token");
                }
                A0E.close();
                A032.close();
                r8.A1y(this.A03.A05(r8));
                return;
            } catch (Throwable th) {
                try {
                    A032.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r15.A03 != null) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C30481mW r15, boolean r16) {
        /*
            r14 = this;
            java.lang.String r0 = r15.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = r15.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = r15.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0029
            com.whatsapp.TextData r0 = r15.A02
            if (r0 != 0) goto L_0x0029
            int r0 = r15.A01
            if (r0 != 0) goto L_0x0029
            int r0 = r15.A00
            if (r0 != 0) goto L_0x0029
            java.lang.String r1 = r15.A03
            r0 = 0
            if (r1 == 0) goto L_0x002a
        L_0x0029:
            r0 = 1
        L_0x002a:
            java.lang.String r10 = "message_text"
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L_0x00e6
            X.3dV r0 = r14.A01
            X.4Fq r3 = r0.A04()
            android.content.ContentValues r9 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0101 }
            X.C624134x.A0F(r9, r15)     // Catch:{ SQLiteConstraintException -> 0x00cf }
            java.lang.String r0 = r15.A04     // Catch:{ SQLiteConstraintException -> 0x00cf }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ SQLiteConstraintException -> 0x00cf }
            java.lang.String r1 = "description"
            if (r0 != 0) goto L_0x00bf
            java.lang.String r0 = r15.A04     // Catch:{ SQLiteConstraintException -> 0x00cf }
            r9.put(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00cf }
        L_0x004d:
            java.lang.String r0 = r15.A06     // Catch:{ SQLiteConstraintException -> 0x00cf }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ SQLiteConstraintException -> 0x00cf }
            java.lang.String r1 = "page_title"
            if (r0 != 0) goto L_0x00bb
            java.lang.String r0 = r15.A06     // Catch:{ SQLiteConstraintException -> 0x00cf }
            r9.put(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00cf }
        L_0x005d:
            java.lang.String r0 = r15.A07     // Catch:{ SQLiteConstraintException -> 0x00cf }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ SQLiteConstraintException -> 0x00cf }
            java.lang.String r1 = "url"
            if (r0 != 0) goto L_0x00b7
            java.lang.String r0 = r15.A07     // Catch:{ SQLiteConstraintException -> 0x00cf }
            r9.put(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00cf }
        L_0x006d:
            com.whatsapp.TextData r0 = r15.A02     // Catch:{ SQLiteConstraintException -> 0x00cf }
            java.lang.String r4 = "background_color"
            java.lang.String r2 = "text_color"
            java.lang.String r1 = "font_style"
            if (r0 == 0) goto L_0x00b3
            int r0 = r0.fontStyle     // Catch:{ SQLiteConstraintException -> 0x00cf }
            X.C18270x1.A0b(r9, r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00cf }
            com.whatsapp.TextData r0 = r15.A02     // Catch:{ SQLiteConstraintException -> 0x00cf }
            int r0 = r0.textColor     // Catch:{ SQLiteConstraintException -> 0x00cf }
            X.C18270x1.A0b(r9, r2, r0)     // Catch:{ SQLiteConstraintException -> 0x00cf }
            com.whatsapp.TextData r0 = r15.A02     // Catch:{ SQLiteConstraintException -> 0x00cf }
            int r0 = r0.backgroundColor     // Catch:{ SQLiteConstraintException -> 0x00cf }
            X.C18270x1.A0b(r9, r4, r0)     // Catch:{ SQLiteConstraintException -> 0x00cf }
        L_0x008b:
            int r0 = r15.A01     // Catch:{ SQLiteConstraintException -> 0x00cf }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00cf }
            java.lang.String r0 = "preview_type"
            r9.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x00cf }
            int r0 = r15.A00     // Catch:{ SQLiteConstraintException -> 0x00cf }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00cf }
            java.lang.String r0 = "invite_link_group_type"
            r9.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x00cf }
            java.lang.String r1 = "counter_abuse_token"
            java.lang.String r0 = r15.A03     // Catch:{ SQLiteConstraintException -> 0x00cf }
            X.2sg r1 = X.AnonymousClass3H0.A03(r9, r3, r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00cf }
            java.lang.String r0 = "INSERT_MESSAGE_TEXT_SQL"
            long r7 = r1.A09(r10, r0, r9)     // Catch:{ SQLiteConstraintException -> 0x00cf }
            long r0 = r15.A1L     // Catch:{ SQLiteConstraintException -> 0x00cf }
            goto L_0x00c3
        L_0x00b3:
            X.C18310x6.A0w(r9, r1, r2, r4)     // Catch:{ SQLiteConstraintException -> 0x00cf }
            goto L_0x008b
        L_0x00b7:
            r9.putNull(r1)     // Catch:{ SQLiteConstraintException -> 0x00cf }
            goto L_0x006d
        L_0x00bb:
            r9.putNull(r1)     // Catch:{ SQLiteConstraintException -> 0x00cf }
            goto L_0x005d
        L_0x00bf:
            r9.putNull(r1)     // Catch:{ SQLiteConstraintException -> 0x00cf }
            goto L_0x004d
        L_0x00c3:
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1T(r2)
            java.lang.String r0 = "TextMessageStore/insertOrUpdateTextMessage/inserted row should has same row_id"
            X.C626936e.A0F(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00cf }
            goto L_0x010b
        L_0x00cf:
            r1 = move-exception
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0101 }
            X.2sg r8 = r0.A03     // Catch:{ all -> 0x0101 }
            java.lang.String r11 = "message_row_id = ?"
            java.lang.String[] r13 = new java.lang.String[r5]     // Catch:{ all -> 0x0101 }
            X.C624134x.A0Y(r15, r13, r6)     // Catch:{ all -> 0x0101 }
            java.lang.String r12 = "UPDATE_MESSAGE_TEXT_SQL"
            int r0 = r8.A05(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0101 }
            if (r0 == r5) goto L_0x010b
            throw r1     // Catch:{ all -> 0x0101 }
        L_0x00e6:
            if (r16 == 0) goto L_0x010e
            X.3dV r0 = r14.A01
            X.4Fq r3 = r0.A04()
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0101 }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x0101 }
            java.lang.String r2 = "message_row_id = ?"
            java.lang.String[] r1 = new java.lang.String[r5]     // Catch:{ all -> 0x0101 }
            X.C624134x.A0Y(r15, r1, r6)     // Catch:{ all -> 0x0101 }
            java.lang.String r0 = "DELETE_MESSAGE_TEXT_SQL"
            r4.A07(r10, r2, r0, r1)     // Catch:{ all -> 0x0101 }
            goto L_0x010b
        L_0x0101:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0106 }
            throw r1
        L_0x0106:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x010b:
            r3.close()
        L_0x010e:
            byte[] r1 = r15.A1z()
            if (r1 == 0) goto L_0x011d
            int r0 = r1.length
            if (r0 == 0) goto L_0x011d
            X.30a r0 = r14.A03
            r0.A03(r15, r1)
        L_0x011c:
            return
        L_0x011d:
            if (r16 == 0) goto L_0x011c
            X.30a r0 = r14.A03
            r0.A02(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55342qC.A03(X.1mW, boolean):void");
    }

    public final boolean A04(C30481mW r8) {
        boolean z = false;
        if (!AnonymousClass000.A1T((this.A02.A00("text_ready", 0) > 1 ? 1 : (this.A02.A00("text_ready", 0) == 1 ? 0 : -1)))) {
            return false;
        }
        AnonymousClass2z0 A09 = C624134x.A09(r8, "TextMessageStore/isValidMessage/message must have row_id set; key=", AnonymousClass001.A0o(), AnonymousClass001.A1W((r8.A1L > 0 ? 1 : (r8.A1L == 0 ? 0 : -1))));
        if (r8.A0l() == 1) {
            z = true;
        }
        C18260x0.A0l(A09, "TextMessageStore/isValidMessage/message in main storage; key=", AnonymousClass001.A0o(), z);
        return true;
    }

    public C55342qC(C56922sm r1, C72303dV r2, C56082rO r3, C612830a r4) {
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }

    public void A02(C30481mW r7) {
        if (A04(r7) || (r7.A1L > 0 && r7.A1L <= this.A02.A00("migration_message_text_index", 0))) {
            A03(r7, true);
        }
    }
}
