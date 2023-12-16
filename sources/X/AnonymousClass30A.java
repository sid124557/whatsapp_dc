package X;

import com.whatsapp.R;

/* renamed from: X.30A  reason: invalid class name */
public final class AnonymousClass30A {
    public final C614930z A00;
    public final C613630k A01;
    public final AnonymousClass35Q A02;
    public final C47822ds A03;
    public final C97024xV A04;
    public final C61192zr A05;
    public final C34461vC A06;
    public final C620633i A07;
    public final C56612sH A08;
    public final C54292oU A09;
    public final C34171uL A0A;

    public final String A01(C53892nq r7) {
        String A052 = C54292oU.A05(this.A09, this.A00.A02(r7.A06), AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
        C162457s7.A0D(A052);
        return A052;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.3d3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: X.3Z0} */
    /* JADX WARNING: type inference failed for: r2v11, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0088, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008f, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "InactiveAccountNotificationManager/clearRenderedNotificationsForAccount"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.21w r4 = X.C373421w.RINGING_CALL
            java.util.List r7 = X.C18290x4.A12(r4)
            X.21w[] r6 = X.C373421w.values()
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            int r3 = r6.length
            r2 = 0
        L_0x0015:
            if (r2 >= r3) goto L_0x0027
            r1 = r6[r2]
            boolean r0 = r7.contains(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0024
            r5.add(r1)
        L_0x0024:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0027:
            java.util.Iterator r2 = r5.iterator()
        L_0x002b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0041
            java.lang.Object r0 = r2.next()
            X.21w r0 = (X.C373421w) r0
            X.2zr r1 = r8.A05
            java.lang.String r0 = A00(r0, r9)
            r1.A04(r0)
            goto L_0x002b
        L_0x0041:
            X.2ds r2 = r8.A03
            r1 = 0
            java.lang.String r0 = "InactiveNotificationsStore/readRingingCallIds"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String[] r3 = X.AnonymousClass0x7.A1a(r9, r1)
            r1 = 1
            java.lang.String r0 = "1"
            r3[r1] = r0
            X.4GK r5 = X.C18630y0.A00(r2)     // Catch:{ all -> 0x0090 }
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0089 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = "SELECT call_id FROM notifications WHERE account_lid = ? AND call_status = ? "
            java.lang.String r0 = "GET_CALL_IDS_FOR_LID"
            android.database.Cursor r3 = X.C56862sg.A02(r2, r1, r0, r3)     // Catch:{ all -> 0x0089 }
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "call_id"
            int r1 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0082 }
        L_0x006d:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = X.C18320x8.A0c(r3, r1)     // Catch:{ all -> 0x0082 }
            r2.add(r0)     // Catch:{ all -> 0x0082 }
            goto L_0x006d
        L_0x007b:
            r3.close()     // Catch:{ all -> 0x0089 }
            r5.close()     // Catch:{ all -> 0x0090 }
            goto L_0x0095
        L_0x0082:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x0089 }
            throw r0     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008b }
        L_0x008b:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ all -> 0x0090 }
            throw r0     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r0 = move-exception
            X.3Z0 r2 = X.AnonymousClass3Z0.A01(r0)
        L_0x0095:
            java.lang.Throwable r1 = X.AnonymousClass3Z9.A00(r2)
            if (r1 == 0) goto L_0x00a0
            java.lang.String r0 = "InactiveNotificationsStore/readRingingCallIds/failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00a0:
            X.3d3 r1 = X.C72023d3.A00
            boolean r0 = r2 instanceof X.AnonymousClass3Z0
            if (r0 == 0) goto L_0x00a7
            r2 = r1
        L_0x00a7:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r3 = r2.iterator()
        L_0x00ad:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00ce
            java.lang.String r1 = X.AnonymousClass001.A0m(r3)
            java.lang.String r0 = "InactiveAccountNotificationManager/clearRenderedNotificationsForAccount/cleared ringing call notification"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2zr r2 = r8.A05
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r1)
            java.lang.String r0 = A00(r4, r9)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            r2.A04(r0)
            goto L_0x00ad
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30A.A04(java.lang.String):void");
    }

    public AnonymousClass30A(C614930z r2, C613630k r3, AnonymousClass35Q r4, C47822ds r5, C97024xV r6, C61192zr r7, C34461vC r8, C620633i r9, C56612sH r10, C54292oU r11, C34171uL r12) {
        C18260x0.A0f(r10, r11, r9, r2, r12);
        C18260x0.A0g(r8, r3, r5, r4, r7);
        C162457s7.A0J(r6, 11);
        this.A08 = r10;
        this.A09 = r11;
        this.A07 = r9;
        this.A00 = r2;
        this.A0A = r12;
        this.A06 = r8;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
        this.A05 = r7;
        this.A04 = r6;
    }

    public static final String A00(C373421w r2, String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(r2.tag);
        return AnonymousClass000.A0X(C627236i.A04(str), A0o);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x024f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0253, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0256, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x025a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A02(X.C53892nq r16, java.lang.String r17) {
        /*
            r15 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "InactiveAccountNotificationManager/getNameForJid/"
            r1.append(r0)
            r0 = r16
            java.lang.String r5 = r0.A07
            java.lang.String r0 = X.C57072t2.A01(r5)
            X.C18260x0.A1L(r1, r0)
            r6 = r17
            com.whatsapp.jid.Jid r9 = X.AnonymousClass32W.A00(r6)
            if (r9 == 0) goto L_0x0278
            boolean r0 = X.C627336j.A0L(r9)
            if (r0 == 0) goto L_0x0135
            java.lang.String r0 = "InactiveAccountNotificationManager/getNameForJid/isLidJid:true"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.35Q r2 = r15.A02
            java.io.File r1 = r2.A03(r5)
            if (r1 == 0) goto L_0x0110
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0110
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.String r7 = "msgstore.db"
            java.io.File r12 = X.C18330xA.A04(r0, r7)
            X.2ao r4 = r2.A06
            X.2zT r3 = r2.A05
            java.lang.String r2 = r12.getAbsolutePath()
            r1 = 0
            r0 = 0
            android.database.sqlite.SQLiteDatabase r2 = android.database.sqlite.SQLiteDatabase.openDatabase(r2, r1, r0)
            X.2sg r0 = X.C626135u.A00(r2, r3, r4, r7)     // Catch:{ all -> 0x0104 }
            long r0 = X.C623334p.A00(r0, r9)     // Catch:{ all -> 0x0104 }
            if (r2 == 0) goto L_0x005b
            r2.close()
        L_0x005b:
            java.lang.String r8 = r12.getAbsolutePath()
            r2 = 0
            r11 = 0
            android.database.sqlite.SQLiteDatabase r2 = android.database.sqlite.SQLiteDatabase.openDatabase(r8, r2, r11)
            X.2sg r10 = X.C626135u.A00(r2, r3, r4, r7)     // Catch:{ all -> 0x0104 }
            java.lang.String r9 = "SELECT jid_row_id FROM jid_map WHERE lid_row_id = ?"
            java.lang.String[] r8 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0104 }
            X.AnonymousClass0x2.A1S(r8, r11, r0)     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = "JidMapStore/GET_JID_BY_LID"
            android.database.Cursor r8 = r10.A0E(r9, r0, r8)     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = "jid_row_id"
            int r1 = r8.getColumnIndex(r0)     // Catch:{ all -> 0x00f8 }
            if (r1 < 0) goto L_0x008f
            boolean r0 = r8.moveToFirst()     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x008f
            int r0 = r8.getInt(r1)     // Catch:{ all -> 0x00f8 }
            long r0 = (long) r0     // Catch:{ all -> 0x00f8 }
            r8.close()     // Catch:{ all -> 0x0104 }
            goto L_0x009a
        L_0x008f:
            r8.close()     // Catch:{ all -> 0x0104 }
            if (r2 == 0) goto L_0x0097
            r2.close()
        L_0x0097:
            r0 = -1
            goto L_0x009f
        L_0x009a:
            if (r2 == 0) goto L_0x009f
            r2.close()
        L_0x009f:
            java.lang.String r12 = r12.getAbsolutePath()
            r10 = 0
            r9 = 0
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x012e
            r8 = 0
            android.database.sqlite.SQLiteDatabase r2 = android.database.sqlite.SQLiteDatabase.openDatabase(r12, r9, r8)
            X.2sg r7 = X.C626135u.A00(r2, r3, r4, r7)     // Catch:{ all -> 0x0104 }
            java.lang.String r4 = "SELECT user, server, agent, device, type, raw_string FROM jid WHERE _id = ?"
            java.lang.String[] r3 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0104 }
            X.C18280x3.A1R(r3, r8, r0)     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = "GET_JID_BY_ROW_ID_SQL"
            android.database.Cursor r8 = r7.A0E(r4, r0, r3)     // Catch:{ all -> 0x0104 }
            boolean r0 = r8.moveToLast()     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00f4
            java.lang.String r0 = "user"
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "server"
            int r10 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "agent"
            int r11 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "device"
            int r12 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "type"
            int r13 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "raw_string"
            int r14 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f8 }
            com.whatsapp.jid.Jid r9 = X.C623334p.A01(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00f8 }
        L_0x00f4:
            r8.close()     // Catch:{ all -> 0x0104 }
            goto L_0x0129
        L_0x00f8:
            r1 = move-exception
            if (r8 == 0) goto L_0x0103
            r8.close()     // Catch:{ all -> 0x00ff }
            goto L_0x0103
        L_0x00ff:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0104 }
        L_0x0103:
            throw r1     // Catch:{ all -> 0x0104 }
        L_0x0104:
            r1 = move-exception
            if (r2 == 0) goto L_0x010f
            r2.close()     // Catch:{ all -> 0x010b }
            throw r1
        L_0x010b:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x010f:
            throw r1
        L_0x0110:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSwitchingFileManager/getLidFromJidFromInactiveAccount/account "
            X.C57072t2.A03(r0, r5, r1)
            java.lang.String r0 = " databases dir does not exist"
            X.C18260x0.A1L(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSwitchingFileManager/getLidFromJidFromInactiveAccount/stagingDirLogString/"
            X.C57072t2.A02(r2, r0, r1)
            r9 = 0
            goto L_0x012e
        L_0x0129:
            if (r2 == 0) goto L_0x012e
            r2.close()
        L_0x012e:
            if (r9 == 0) goto L_0x0204
            java.lang.String r0 = "InactiveAccountNotificationManager/getNameForJid/lid mapping found"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0135:
            X.35Q r3 = r15.A02
            java.io.File r1 = r3.A03(r5)
            if (r1 == 0) goto L_0x01b0
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x01b0
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.String r6 = "wa.db"
            java.io.File r0 = X.C18330xA.A04(r0, r6)
            X.1vC r8 = r3.A01
            X.2ao r2 = r3.A06
            X.2zT r1 = r3.A05
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.String r4 = "contact-mgr-db/getContactByJidFromInactiveAccount/"
            r3 = 0
            r5 = 0
            android.database.sqlite.SQLiteDatabase r7 = android.database.sqlite.SQLiteDatabase.openDatabase(r0, r3, r5)     // Catch:{ IllegalStateException -> 0x01aa, SQLiteException -> 0x01a4 }
            X.2sg r6 = X.C626135u.A00(r7, r1, r2, r6)     // Catch:{ all -> 0x0198 }
            java.lang.String r2 = X.C58142um.A04     // Catch:{ all -> 0x0198 }
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0198 }
            X.C18280x3.A0w(r9, r1, r5)     // Catch:{ all -> 0x0198 }
            java.lang.String r0 = "CONTACTS_FOR_INACTIVE_ACCOUNT"
            android.database.Cursor r2 = r6.A0E(r2, r0, r1)     // Catch:{ all -> 0x0198 }
            r6 = r3
        L_0x0174:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x018c }
            if (r0 == 0) goto L_0x0183
            X.3ZH r0 = X.AnonymousClass25S.A00(r2)     // Catch:{ all -> 0x018c }
            X.3ZH r6 = X.C34461vC.A01(r0, r6)     // Catch:{ all -> 0x018c }
            goto L_0x0174
        L_0x0183:
            r2.close()     // Catch:{ all -> 0x0198 }
            if (r7 == 0) goto L_0x01c9
            r7.close()     // Catch:{ IllegalStateException -> 0x01aa, SQLiteException -> 0x01a4 }
            goto L_0x01c9
        L_0x018c:
            r1 = move-exception
            if (r2 == 0) goto L_0x0197
            r2.close()     // Catch:{ all -> 0x0193 }
            goto L_0x0197
        L_0x0193:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0198 }
        L_0x0197:
            throw r1     // Catch:{ all -> 0x0198 }
        L_0x0198:
            r1 = move-exception
            if (r7 == 0) goto L_0x01a3
            r7.close()     // Catch:{ all -> 0x019f }
            goto L_0x01a3
        L_0x019f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalStateException -> 0x01aa, SQLiteException -> 0x01a4 }
        L_0x01a3:
            throw r1     // Catch:{ IllegalStateException -> 0x01aa, SQLiteException -> 0x01a4 }
        L_0x01a4:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)
            r6 = r3
            goto L_0x01e5
        L_0x01aa:
            r0 = move-exception
            X.C34461vC.A04(r0, r4, r5, r5)
            r6 = r3
            goto L_0x01e5
        L_0x01b0:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "getContactFromInactiveAccount/account "
            X.C57072t2.A03(r0, r5, r1)
            java.lang.String r0 = " databases dir does not exist"
            X.C18260x0.A1K(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSwitchingFileManager/getContactFromInactiveAccount/stagingDirLogString/"
            X.C57072t2.A02(r3, r0, r1)
            r6 = 0
            goto L_0x01e5
        L_0x01c9:
            if (r6 == 0) goto L_0x01d4
            X.33j r0 = r8.A06
            java.util.Locale r0 = X.C620733j.A02(r0)
            r8.A0P(r6, r0)
        L_0x01d4:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "contact-mgr-db/contact fetched by jid="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " from inactive account"
            X.C18260x0.A1J(r1, r0)
        L_0x01e5:
            if (r6 == 0) goto L_0x01ed
            java.lang.String r4 = r6.A0J()
            if (r4 != 0) goto L_0x0286
        L_0x01ed:
            X.1vC r0 = r15.A06
            X.3ZH r0 = r0.A0B(r9)
            if (r0 == 0) goto L_0x01fb
            java.lang.String r4 = r0.A0J()
            if (r4 != 0) goto L_0x0286
        L_0x01fb:
            X.30z r1 = r15.A00
            java.lang.String r0 = r9.user
            java.lang.String r4 = r1.A02(r0)
            return r4
        L_0x0204:
            java.lang.String r0 = "InactiveAccountNotificationManager/getNameForJid/lid mapping not found"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2ds r2 = r15.A03
            r1 = 0
            r0 = 1
            X.C162457s7.A0J(r6, r0)
            java.lang.String r0 = "InactiveNotificationsStore/readDisplayName"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r4 = ""
            java.lang.String[] r3 = X.AnonymousClass0x9.A1a()
            r3[r1] = r5
            X.C18300x5.A1K(r6, r4, r3)
            X.4GK r5 = X.C18630y0.A00(r2)     // Catch:{ all -> 0x025b }
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0254 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0254 }
            java.lang.String r1 = "SELECT display_name FROM notifications WHERE account_lid = ? AND sender_jid = ? AND group_jid = ? "
            java.lang.String r0 = "GET_DISPLAY_NAME_FOR_SENDER_LID"
            android.database.Cursor r3 = X.C56862sg.A02(r2, r1, r0, r3)     // Catch:{ all -> 0x0254 }
            java.lang.String r0 = "display_name"
            int r1 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x024d }
            boolean r0 = r3.moveToLast()     // Catch:{ all -> 0x024d }
            if (r0 == 0) goto L_0x0245
            java.lang.String r2 = r3.getString(r1)     // Catch:{ all -> 0x024d }
            X.C162457s7.A0H(r2)     // Catch:{ all -> 0x024d }
            goto L_0x0246
        L_0x0245:
            r2 = r4
        L_0x0246:
            r3.close()     // Catch:{ all -> 0x0254 }
            r5.close()     // Catch:{ all -> 0x025b }
            goto L_0x0260
        L_0x024d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x024f }
        L_0x024f:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x0254 }
            throw r0     // Catch:{ all -> 0x0254 }
        L_0x0254:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0256 }
        L_0x0256:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ all -> 0x025b }
            throw r0     // Catch:{ all -> 0x025b }
        L_0x025b:
            r0 = move-exception
            X.3Z0 r2 = X.AnonymousClass3Z0.A01(r0)
        L_0x0260:
            java.lang.Throwable r1 = X.AnonymousClass3Z9.A00(r2)
            if (r1 == 0) goto L_0x026b
            java.lang.String r0 = "InactiveNotificationsStore/readDisplayName/failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x026b:
            boolean r0 = r2 instanceof X.AnonymousClass3Z0
            if (r0 != 0) goto L_0x0270
            r4 = r2
        L_0x0270:
            java.lang.String r4 = (java.lang.String) r4
            int r0 = r4.length()
            if (r0 != 0) goto L_0x0286
        L_0x0278:
            java.lang.String r0 = "InactiveAccountNotificationManager/getUnknownJidPlaceholder/"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.2oU r1 = r15.A09
            r0 = 2131890401(0x7f1210e1, float:1.9415493E38)
            java.lang.String r4 = X.C54292oU.A04(r1, r0)
        L_0x0286:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30A.A02(X.2nq, java.lang.String):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v178, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v181, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: type inference failed for: r4v22 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x046a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x046e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0471, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0475, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c3, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C53892nq r23, boolean r24, boolean r25) {
        /*
            r22 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "InactiveAccountNotificationManager/showNotificationsForAccount isCall:"
            r1.append(r0)
            r7 = r24
            r1.append(r7)
            java.lang.String r0 = " shouldBuzz:"
            r12 = r25
            X.C18260x0.A1E(r0, r1, r12)
            r6 = r22
            r10 = r23
            if (r24 == 0) goto L_0x00c4
            X.2ds r4 = r6.A03
            r8 = 0
            java.lang.String[] r11 = new java.lang.String[r8]
            java.lang.String[] r3 = new java.lang.String[r8]
            r9 = 1
            java.lang.String r0 = "InactiveNotificationsStore/readDistinctCallersForAccount"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "voip_call_offer_1on1"
            java.lang.String r0 = "voip_call_offer_group"
            java.lang.String[] r2 = new java.lang.String[]{r1, r0}
            java.lang.String r0 = "0"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            java.lang.String[] r0 = new java.lang.String[r9]
            java.lang.String r5 = r10.A07
            r0[r8] = r5
            java.lang.Object[] r0 = X.C73713fx.A06(r0, r1)
            java.lang.Object[] r0 = X.C73713fx.A06(r0, r2)
            java.lang.Object[] r0 = X.C73713fx.A06(r0, r11)
            java.lang.Object[] r3 = X.C73713fx.A06(r0, r3)
            java.lang.String[] r2 = new java.lang.String[r9]
            long r0 = r10.A04
            X.AnonymousClass0x2.A1S(r2, r8, r0)
            java.lang.Object[] r3 = X.C73713fx.A06(r3, r2)
            java.lang.String[] r3 = (java.lang.String[]) r3
            X.4GK r4 = X.C18630y0.A00(r4)     // Catch:{ all -> 0x0490 }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00bd }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x00bd }
            r8 = 2
            java.lang.String r0 = "SELECT sender_jid FROM notifications WHERE account_lid = ? AND "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = "call_status = ? AND "
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x00bd }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = "notification_type IN "
            X.C57212tH.A02(r0, r1, r8)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = " AND "
            java.lang.StringBuilder r0 = X.C18290x4.A0w(r0, r1)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = X.C18290x4.A0o(r0)     // Catch:{ all -> 0x00bd }
            r1.append(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = "timestamp >= ? GROUP BY sender_jid ORDER BY MAX(timestamp) DESC"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = "GET_DISTINCT_CALL_SENDERS_FOR_LID_BY_TYPE"
            android.database.Cursor r3 = X.C56862sg.A02(r2, r1, r0, r3)     // Catch:{ all -> 0x00bd }
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x00b6 }
            java.lang.String r1 = "sender_jid"
            int r2 = r3.getColumnIndex(r1)     // Catch:{ all -> 0x00b6 }
        L_0x00a0:
            boolean r1 = r3.moveToNext()     // Catch:{ all -> 0x00b6 }
            if (r1 == 0) goto L_0x00ae
            java.lang.String r1 = X.C18320x8.A0c(r3, r2)     // Catch:{ all -> 0x00b6 }
            r0.add(r1)     // Catch:{ all -> 0x00b6 }
            goto L_0x00a0
        L_0x00ae:
            r3.close()     // Catch:{ all -> 0x00bd }
            r4.close()     // Catch:{ all -> 0x0490 }
            goto L_0x0495
        L_0x00b6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x00bd }
            throw r0     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ all -> 0x0490 }
            throw r0     // Catch:{ all -> 0x0490 }
        L_0x00c4:
            X.35Q r2 = r6.A02
            java.lang.String r5 = r10.A07
            java.io.File r1 = r2.A03(r5)
            if (r1 == 0) goto L_0x0155
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0155
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.String r13 = "chatsettings.db"
            java.io.File r0 = X.C18330xA.A04(r0, r13)
            X.2ao r11 = r2.A06
            X.2zT r9 = r2.A05
            java.lang.String r8 = r0.getAbsolutePath()
            java.lang.String r3 = "ChatStore/getInactiveAccountMutedChatsList"
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            r0 = 0
            r1 = 0
            android.database.sqlite.SQLiteDatabase r8 = android.database.sqlite.SQLiteDatabase.openDatabase(r8, r0, r1)     // Catch:{ SQLiteException -> 0x016f }
            X.2sg r13 = X.C626135u.A00(r8, r9, r11, r13)     // Catch:{ all -> 0x0149 }
            java.lang.String r11 = "SELECT jid, mute_end FROM settings WHERE muted_notifications = ? AND (mute_end > ? OR mute_end = ? ) ORDER BY jid ASC"
            java.lang.String[] r9 = X.AnonymousClass0x9.A1a()     // Catch:{ SQLiteException -> 0x013f }
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ SQLiteException -> 0x013f }
            r9[r1] = r0     // Catch:{ SQLiteException -> 0x013f }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ SQLiteException -> 0x013f }
            X.C18270x1.A1R(r9, r0)     // Catch:{ SQLiteException -> 0x013f }
            r0 = -1
            X.C18280x3.A1O(r9, r0)     // Catch:{ SQLiteException -> 0x013f }
            java.lang.String r0 = "GET_INACTIVE_ACCOUNT_MUTED_CHAT_JID_WITH_END_TIME_SORTED"
            android.database.Cursor r9 = r13.A0E(r11, r0, r9)     // Catch:{ SQLiteException -> 0x013f }
            java.lang.String r0 = "jid"
            int r1 = r9.getColumnIndex(r0)     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = "mute_end"
            r9.getColumnIndex(r0)     // Catch:{ all -> 0x0133 }
        L_0x011f:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0133 }
            if (r0 == 0) goto L_0x012f
            X.4uZ r0 = X.AnonymousClass0x2.A0K(r9, r1)     // Catch:{ all -> 0x0133 }
            if (r0 == 0) goto L_0x011f
            r4.add(r0)     // Catch:{ all -> 0x0133 }
            goto L_0x011f
        L_0x012f:
            r9.close()     // Catch:{ SQLiteException -> 0x013f }
            goto L_0x0143
        L_0x0133:
            r1 = move-exception
            if (r9 == 0) goto L_0x013e
            r9.close()     // Catch:{ all -> 0x013a }
            goto L_0x013e
        L_0x013a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteException -> 0x013f }
        L_0x013e:
            throw r1     // Catch:{ SQLiteException -> 0x013f }
        L_0x013f:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)     // Catch:{ all -> 0x0149 }
        L_0x0143:
            if (r8 == 0) goto L_0x0173
            r8.close()     // Catch:{ SQLiteException -> 0x016f }
            goto L_0x0173
        L_0x0149:
            r1 = move-exception
            if (r8 == 0) goto L_0x0154
            r8.close()     // Catch:{ all -> 0x0150 }
            goto L_0x0154
        L_0x0150:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteException -> 0x016f }
        L_0x0154:
            throw r1     // Catch:{ SQLiteException -> 0x016f }
        L_0x0155:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSwitchingFileManager/getInactiveAccountMutedChats/account "
            X.C57072t2.A03(r0, r5, r1)
            java.lang.String r0 = " databases dir does not exist"
            X.C18260x0.A1L(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSwitchingFileManager/getInactiveAccountMutedChats/stagingDirLogString/"
            X.C57072t2.A02(r2, r0, r1)
            X.3d3 r4 = X.C72023d3.A00
            goto L_0x0173
        L_0x016f:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
        L_0x0173:
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r4.iterator()
        L_0x017f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0194
            java.lang.Object r1 = r3.next()
            r0 = r1
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            boolean r0 = X.C627336j.A0M(r0)
            X.C18300x5.A1M(r1, r9, r8, r0)
            goto L_0x017f
        L_0x0194:
            X.3Z6 r3 = X.AnonymousClass3Z6.A02(r9, r8)
            java.io.File r1 = r2.A03(r5)
            if (r1 == 0) goto L_0x020c
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x020c
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.String r15 = "msgstore.db"
            java.io.File r0 = X.C18330xA.A04(r0, r15)
            X.2ao r14 = r2.A06
            X.2zT r11 = r2.A05
            java.lang.String r1 = r0.getAbsolutePath()
            java.lang.String r4 = "ChatStore/getInactiveAccountArchivedChatsList"
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            r0 = 0
            r13 = 0
            android.database.sqlite.SQLiteDatabase r9 = android.database.sqlite.SQLiteDatabase.openDatabase(r1, r13, r0)     // Catch:{ SQLiteException -> 0x0226 }
            X.2sg r11 = X.C626135u.A00(r9, r11, r14, r15)     // Catch:{ all -> 0x0200 }
            java.lang.String r1 = "SELECT jid.raw_string FROM chat LEFT JOIN jid ON chat.jid_row_id = jid._id WHERE archived = 1"
            java.lang.String r0 = "GET_INACTIVE_ACCOUNT_ARCHIVED_CHAT_JID"
            android.database.Cursor r11 = r11.A0E(r1, r0, r13)     // Catch:{ SQLiteException -> 0x01f6 }
            java.lang.String r0 = "raw_string"
            int r1 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01ea }
        L_0x01d6:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x01ea }
            if (r0 == 0) goto L_0x01e6
            X.4uZ r0 = X.AnonymousClass0x2.A0K(r11, r1)     // Catch:{ all -> 0x01ea }
            if (r0 == 0) goto L_0x01d6
            r8.add(r0)     // Catch:{ all -> 0x01ea }
            goto L_0x01d6
        L_0x01e6:
            r11.close()     // Catch:{ SQLiteException -> 0x01f6 }
            goto L_0x01fa
        L_0x01ea:
            r1 = move-exception
            if (r11 == 0) goto L_0x01f5
            r11.close()     // Catch:{ all -> 0x01f1 }
            goto L_0x01f5
        L_0x01f1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteException -> 0x01f6 }
        L_0x01f5:
            throw r1     // Catch:{ SQLiteException -> 0x01f6 }
        L_0x01f6:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)     // Catch:{ all -> 0x0200 }
        L_0x01fa:
            if (r9 == 0) goto L_0x022a
            r9.close()     // Catch:{ SQLiteException -> 0x0226 }
            goto L_0x022a
        L_0x0200:
            r1 = move-exception
            if (r9 == 0) goto L_0x020b
            r9.close()     // Catch:{ all -> 0x0207 }
            goto L_0x020b
        L_0x0207:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteException -> 0x0226 }
        L_0x020b:
            throw r1     // Catch:{ SQLiteException -> 0x0226 }
        L_0x020c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSwitchingFileManager/getInactiveAccountArchivedChats/account "
            X.C57072t2.A03(r0, r5, r1)
            java.lang.String r0 = " databases dir does not exist"
            X.C18260x0.A1L(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSwitchingFileManager/getInactiveAccountArchivedChats/stagingDirLogString/"
            X.C57072t2.A02(r2, r0, r1)
            X.3d3 r8 = X.C72023d3.A00
            goto L_0x022a
        L_0x0226:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)
        L_0x022a:
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.util.Iterator r4 = r8.iterator()
        L_0x0236:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x024b
            java.lang.Object r1 = r4.next()
            r0 = r1
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            boolean r0 = X.C627336j.A0M(r0)
            X.C18300x5.A1M(r1, r11, r9, r0)
            goto L_0x0236
        L_0x024b:
            X.3Z6 r9 = X.AnonymousClass3Z6.A02(r11, r9)
            java.io.File r1 = r2.A03(r5)
            if (r1 == 0) goto L_0x02c3
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x02c3
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.String r15 = "msgstore.db"
            java.io.File r0 = X.C18330xA.A04(r0, r15)
            X.2ao r14 = r2.A06
            X.2zT r11 = r2.A05
            java.lang.String r1 = r0.getAbsolutePath()
            java.lang.String r2 = "ChatStore/getInactiveAccountLockedChatsList"
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            r0 = 0
            r13 = 0
            android.database.sqlite.SQLiteDatabase r8 = android.database.sqlite.SQLiteDatabase.openDatabase(r1, r13, r0)     // Catch:{ SQLiteException -> 0x02dd }
            X.2sg r11 = X.C626135u.A00(r8, r11, r14, r15)     // Catch:{ all -> 0x02b7 }
            java.lang.String r1 = "SELECT jid.raw_string FROM chat LEFT JOIN jid ON chat.jid_row_id = jid._id WHERE chat_lock > 0"
            java.lang.String r0 = "GET_INACTIVE_ACCOUNT_LOCKED_CHAT_JID"
            android.database.Cursor r11 = r11.A0E(r1, r0, r13)     // Catch:{ SQLiteException -> 0x02ad }
            java.lang.String r0 = "raw_string"
            int r1 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02a1 }
        L_0x028d:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x02a1 }
            if (r0 == 0) goto L_0x029d
            X.4uZ r0 = X.AnonymousClass0x2.A0K(r11, r1)     // Catch:{ all -> 0x02a1 }
            if (r0 == 0) goto L_0x028d
            r4.add(r0)     // Catch:{ all -> 0x02a1 }
            goto L_0x028d
        L_0x029d:
            r11.close()     // Catch:{ SQLiteException -> 0x02ad }
            goto L_0x02b1
        L_0x02a1:
            r1 = move-exception
            if (r11 == 0) goto L_0x02ac
            r11.close()     // Catch:{ all -> 0x02a8 }
            goto L_0x02ac
        L_0x02a8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteException -> 0x02ad }
        L_0x02ac:
            throw r1     // Catch:{ SQLiteException -> 0x02ad }
        L_0x02ad:
            r0 = move-exception
            com.whatsapp.util.Log.e(r2, r0)     // Catch:{ all -> 0x02b7 }
        L_0x02b1:
            if (r8 == 0) goto L_0x02e1
            r8.close()     // Catch:{ SQLiteException -> 0x02dd }
            goto L_0x02e1
        L_0x02b7:
            r1 = move-exception
            if (r8 == 0) goto L_0x02c2
            r8.close()     // Catch:{ all -> 0x02be }
            goto L_0x02c2
        L_0x02be:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteException -> 0x02dd }
        L_0x02c2:
            throw r1     // Catch:{ SQLiteException -> 0x02dd }
        L_0x02c3:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSwitchingFileManager/getInactiveAccountLockedChats/account "
            X.C57072t2.A03(r0, r5, r1)
            java.lang.String r0 = " databases dir does not exist"
            X.C18260x0.A1L(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSwitchingFileManager/getInactiveAccountLockedChats/stagingDirLogString/"
            X.C57072t2.A02(r2, r0, r1)
            X.3d3 r4 = X.C72023d3.A00
            goto L_0x02e1
        L_0x02dd:
            r0 = move-exception
            com.whatsapp.util.Log.e(r2, r0)
        L_0x02e1:
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r4.iterator()
        L_0x02ed:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0302
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            boolean r0 = X.C627336j.A0M(r0)
            X.C18300x5.A1M(r1, r11, r8, r0)
            goto L_0x02ed
        L_0x0302:
            X.3Z6 r8 = X.AnonymousClass3Z6.A02(r11, r8)
            java.lang.Object r0 = r3.first
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = X.C73783g4.A0d(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0312:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x031c
            X.C18270x1.A1L(r2, r1)
            goto L_0x0312
        L_0x031c:
            r13 = 0
            java.lang.String[] r0 = new java.lang.String[r13]
            java.lang.Object[] r4 = r2.toArray(r0)
            java.lang.Object r0 = r9.first
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = X.C73783g4.A0d(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x032f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0339
            X.C18270x1.A1L(r2, r1)
            goto L_0x032f
        L_0x0339:
            java.lang.String[] r0 = new java.lang.String[r13]
            java.lang.Object[] r0 = r2.toArray(r0)
            java.lang.Object[] r4 = X.C73713fx.A06(r4, r0)
            java.lang.Object r0 = r8.first
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = X.C73783g4.A0d(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x034f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0359
            X.C18270x1.A1L(r2, r1)
            goto L_0x034f
        L_0x0359:
            java.lang.String[] r0 = new java.lang.String[r13]
            java.lang.Object[] r0 = r2.toArray(r0)
            java.lang.Object[] r4 = X.C73713fx.A06(r4, r0)
            java.lang.Object r0 = r3.second
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = X.C73783g4.A0d(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x036f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0379
            X.C18270x1.A1L(r2, r1)
            goto L_0x036f
        L_0x0379:
            java.lang.String[] r0 = new java.lang.String[r13]
            java.lang.Object[] r3 = r2.toArray(r0)
            java.lang.Object r0 = r9.second
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = X.C73783g4.A0d(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x038b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0395
            X.C18270x1.A1L(r2, r1)
            goto L_0x038b
        L_0x0395:
            java.lang.String[] r0 = new java.lang.String[r13]
            java.lang.Object[] r0 = r2.toArray(r0)
            java.lang.Object[] r3 = X.C73713fx.A06(r3, r0)
            java.lang.Object r0 = r8.second
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = X.C73783g4.A0d(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x03ab:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03b5
            X.C18270x1.A1L(r2, r1)
            goto L_0x03ab
        L_0x03b5:
            java.lang.String[] r0 = new java.lang.String[r13]
            java.lang.Object[] r0 = r2.toArray(r0)
            java.lang.Object[] r0 = X.C73713fx.A06(r3, r0)
            X.3Z6 r0 = X.AnonymousClass3Z6.A02(r4, r0)
            X.2ds r4 = r6.A03
            java.lang.Object r11 = r0.first
            java.lang.String[] r11 = (java.lang.String[]) r11
            java.lang.Object r8 = r0.second
            java.lang.String[] r8 = (java.lang.String[]) r8
            r2 = 1
            int r9 = X.C18300x5.A05(r11, r8, r2)
            java.lang.String r0 = "InactiveNotificationsStore/readDistinctMessageSendersForAccount"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "message"
            java.lang.String r0 = "group_message"
            java.lang.String[] r1 = new java.lang.String[]{r1, r0}
            java.lang.String[] r0 = new java.lang.String[r2]
            r0[r13] = r5
            java.lang.Object[] r0 = X.C73713fx.A06(r0, r1)
            java.lang.Object[] r0 = X.C73713fx.A06(r0, r11)
            java.lang.Object[] r3 = X.C73713fx.A06(r0, r8)
            java.lang.String[] r2 = new java.lang.String[r2]
            long r0 = r10.A04
            X.AnonymousClass0x2.A1S(r2, r13, r0)
            java.lang.Object[] r3 = X.C73713fx.A06(r3, r2)
            java.lang.String[] r3 = (java.lang.String[]) r3
            X.4GK r4 = X.C18630y0.A00(r4)     // Catch:{ all -> 0x0476 }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x046f }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x046f }
            int r13 = r11.length     // Catch:{ all -> 0x046f }
            int r11 = r8.length     // Catch:{ all -> 0x046f }
            java.lang.String r0 = "SELECT sender_jid FROM notifications WHERE account_lid = ? AND "
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0l(r0)     // Catch:{ all -> 0x046f }
            java.lang.String r0 = "notification_type IN "
            X.C57212tH.A02(r0, r8, r9)     // Catch:{ all -> 0x046f }
            java.lang.String r9 = " AND "
            java.lang.StringBuilder r1 = X.C18290x4.A0w(r9, r8)     // Catch:{ all -> 0x046f }
            if (r13 <= 0) goto L_0x042a
            java.lang.String r0 = "CASE WHEN group_jid IS NULL OR group_jid == '' "
            r1.append(r0)     // Catch:{ all -> 0x046f }
            java.lang.String r0 = "THEN sender_jid NOT IN "
            X.C57212tH.A02(r0, r1, r13)     // Catch:{ all -> 0x046f }
            java.lang.String r0 = "ELSE 1 END AND "
            r1.append(r0)     // Catch:{ all -> 0x046f }
        L_0x042a:
            if (r11 <= 0) goto L_0x0434
            java.lang.String r0 = "group_jid NOT IN "
            X.C57212tH.A02(r0, r1, r11)     // Catch:{ all -> 0x046f }
            r1.append(r9)     // Catch:{ all -> 0x046f }
        L_0x0434:
            java.lang.String r0 = X.C18290x4.A0o(r1)     // Catch:{ all -> 0x046f }
            r8.append(r0)     // Catch:{ all -> 0x046f }
            java.lang.String r0 = "timestamp >= ? GROUP BY sender_jid ORDER BY MAX(timestamp) DESC"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r8)     // Catch:{ all -> 0x046f }
            java.lang.String r0 = "GET_DISTINCT_SENDERS_FOR_LID_BY_TYPE"
            android.database.Cursor r3 = X.C56862sg.A02(r2, r1, r0, r3)     // Catch:{ all -> 0x046f }
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0468 }
            java.lang.String r1 = "sender_jid"
            int r2 = r3.getColumnIndex(r1)     // Catch:{ all -> 0x0468 }
        L_0x0453:
            boolean r1 = r3.moveToNext()     // Catch:{ all -> 0x0468 }
            if (r1 == 0) goto L_0x0461
            java.lang.String r1 = X.C18320x8.A0c(r3, r2)     // Catch:{ all -> 0x0468 }
            r0.add(r1)     // Catch:{ all -> 0x0468 }
            goto L_0x0453
        L_0x0461:
            r3.close()     // Catch:{ all -> 0x046f }
            r4.close()     // Catch:{ all -> 0x0476 }
            goto L_0x047b
        L_0x0468:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x046a }
        L_0x046a:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x046f }
            throw r0     // Catch:{ all -> 0x046f }
        L_0x046f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0471 }
        L_0x0471:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ all -> 0x0476 }
            throw r0     // Catch:{ all -> 0x0476 }
        L_0x0476:
            r0 = move-exception
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)
        L_0x047b:
            java.lang.Throwable r2 = X.AnonymousClass3Z9.A00(r0)
            if (r2 == 0) goto L_0x0486
            java.lang.String r1 = "InactiveNotificationsStore/readDistinctMessageSendersForAccount/failed"
            com.whatsapp.util.Log.e(r1, r2)
        L_0x0486:
            X.3d3 r2 = X.C72023d3.A00
            boolean r1 = r0 instanceof X.AnonymousClass3Z0
            if (r1 == 0) goto L_0x048d
            r0 = r2
        L_0x048d:
            java.util.List r0 = (java.util.List) r0
            goto L_0x04a9
        L_0x0490:
            r0 = move-exception
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)
        L_0x0495:
            java.lang.Throwable r2 = X.AnonymousClass3Z9.A00(r0)
            if (r2 == 0) goto L_0x04a0
            java.lang.String r1 = "InactiveNotificationsStore/readDistinctCallersForAccount/failed"
            com.whatsapp.util.Log.e(r1, r2)
        L_0x04a0:
            X.3d3 r2 = X.C72023d3.A00
            boolean r1 = r0 instanceof X.AnonymousClass3Z0
            if (r1 == 0) goto L_0x04a7
            r0 = r2
        L_0x04a7:
            java.util.List r0 = (java.util.List) r0
        L_0x04a9:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x05e2
            r1 = 3
            if (r24 == 0) goto L_0x04b3
            r1 = 4
        L_0x04b3:
            X.2oU r11 = r6.A09
            android.content.Context r9 = r11.A00
            android.content.Intent r14 = X.C627736r.A0z(r9, r5, r1, r7)
            if (r24 == 0) goto L_0x05de
            X.21w r1 = X.C373421w.MISSED_CALLS
        L_0x04bf:
            X.2zr r13 = r6.A05
            java.lang.String r16 = A00(r1, r5)
            java.lang.String r17 = r6.A01(r10)
            java.lang.Object r8 = X.C73723fy.A03(r0)
            java.lang.String r8 = (java.lang.String) r8
            int r2 = r0.size()
            r4 = 0
            r3 = 1
            if (r2 == r3) goto L_0x05cc
            r1 = 2
            if (r2 == r1) goto L_0x05b2
            r2 = 2131891345(0x7f121491, float:1.9417407E38)
            if (r24 == 0) goto L_0x04e2
            r2 = 2131891285(0x7f121455, float:1.9417286E38)
        L_0x04e2:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r8 = r6.A02(r10, r8)
            r1[r4] = r8
            int r0 = X.AnonymousClass002.A04(r0, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x04f2:
            r1[r3] = r0
        L_0x04f4:
            android.content.res.Resources r0 = X.C54292oU.A00(r11)
            java.lang.String r18 = r0.getString(r2, r1)
            X.C162457s7.A0H(r18)
            r1 = 2131886280(0x7f1200c8, float:1.9407134E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r11)
            java.lang.String r1 = r0.getString(r1)
            android.app.PendingIntent r0 = X.C624735e.A04(r9, r14, r4)
            X.0Tm r15 = new X.0Tm
            r15.<init>(r4, r1, r0)
            r19 = 3
            if (r24 == 0) goto L_0x0519
            r19 = 4
        L_0x0519:
            r20 = r4
            r21 = r12
            r13.A03(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.String r0 = "InactiveAccountNotificationManager/updateShouldBadge"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.30k r8 = r6.A01
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSwitchingDataRepo/incrementInactiveBadgeCount/"
            X.C57072t2.A04(r0, r5, r1)
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            X.5SO r7 = r8.A02()
            java.util.List r0 = r7.A01
            r9.addAll(r0)
            boolean r0 = X.C613630k.A01(r5, r9)
            if (r0 != 0) goto L_0x055e
            java.lang.String r0 = "AccountSwitchingDataRepo/incrementInactiveBadgeCount/Account doesn't exists"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0548:
            X.4xV r0 = r6.A04
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x054e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05e2
            java.lang.Object r0 = r1.next()
            X.5Lg r0 = (X.C103045Lg) r0
            r0.A00()
            goto L_0x054e
        L_0x055e:
            java.util.Iterator r2 = r9.iterator()
        L_0x0562:
            boolean r0 = r2.hasNext()
            r4 = 0
            if (r0 == 0) goto L_0x05b0
            java.lang.Object r1 = r2.next()
            boolean r0 = X.C53892nq.A00(r1, r5)
            if (r0 == 0) goto L_0x0562
        L_0x0573:
            X.2nq r1 = (X.C53892nq) r1
            if (r1 == 0) goto L_0x05ae
            int r0 = r1.A00
            int r0 = r0 + 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x057f:
            java.util.Iterator r2 = r9.iterator()
        L_0x0583:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0594
            java.lang.Object r1 = r2.next()
            boolean r0 = X.C53892nq.A00(r1, r5)
            if (r0 == 0) goto L_0x0583
            r4 = r1
        L_0x0594:
            X.2nq r4 = (X.C53892nq) r4
            if (r4 == 0) goto L_0x059e
            int r0 = X.C18310x6.A06(r3)
            r4.A00 = r0
        L_0x059e:
            X.5SO r0 = X.C18310x6.A0P(r7, r9)
            boolean r0 = r8.A09(r0)
            if (r0 != 0) goto L_0x0548
            java.lang.String r0 = "AccountSwitchingDataRepo/incrementInactiveBadgeCount/Failed to update inactiveAccounts"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0548
        L_0x05ae:
            r3 = r4
            goto L_0x057f
        L_0x05b0:
            r1 = r4
            goto L_0x0573
        L_0x05b2:
            r2 = 2131891347(0x7f121493, float:1.9417411E38)
            if (r24 == 0) goto L_0x05ba
            r2 = 2131891287(0x7f121457, float:1.941729E38)
        L_0x05ba:
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r3)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r8 = r6.A02(r10, r8)
            r1[r4] = r8
            java.lang.String r0 = r6.A02(r10, r0)
            goto L_0x04f2
        L_0x05cc:
            r2 = 2131891346(0x7f121492, float:1.941741E38)
            if (r24 == 0) goto L_0x05d4
            r2 = 2131891286(0x7f121456, float:1.9417288E38)
        L_0x05d4:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = r6.A02(r10, r8)
            r1[r4] = r0
            goto L_0x04f4
        L_0x05de:
            X.21w r1 = X.C373421w.MESSAGES
            goto L_0x04bf
        L_0x05e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30A.A03(X.2nq, boolean, boolean):void");
    }
}
