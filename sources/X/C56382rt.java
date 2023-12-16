package X;

import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.2rt  reason: invalid class name and case insensitive filesystem */
public class C56382rt {
    public final C56612sH A00;
    public final C56922sm A01;
    public final C56982ss A02;
    public final C49472ga A03;
    public final C55272q5 A04;
    public final C72303dV A05;
    public final C56362rr A06;
    public final AnonymousClass1VX A07;

    public long A05(C95814uZ r8, int[] iArr, long j) {
        String str;
        Cursor A0E;
        long j2;
        AnonymousClass33M r5 = new AnonymousClass33M(false);
        r5.A0A("rowidstore/getRowIdByTimestampExcludeTypes");
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SELECT _id FROM available_message_view WHERE chat_row_id = ? AND ");
        if (iArr.length != 0) {
            str = AnonymousClass000.A0V(AnonymousClass34U.A00(iArr), " AND ", AnonymousClass001.A0o());
        } else {
            str = "";
        }
        A0o.append(str);
        A0o.append("timestamp > 0");
        A0o.append(" AND ");
        A0o.append("timestamp <= ?");
        String A0X = AnonymousClass000.A0X(" ORDER BY sort_id DESC LIMIT 1", A0o);
        AnonymousClass4GK A032 = this.A05.get();
        try {
            C56862sg r2 = ((AnonymousClass3H0) A032).A03;
            String[] A1Z = AnonymousClass0x9.A1Z();
            C56922sm.A02(this.A01, r8, A1Z, 0);
            C18280x3.A1T(A1Z, j);
            A0E = r2.A0E(A0X, "GET_ROW_ID_BY_TIMESTAMP_EXCLUDE_TYPES", A1Z);
            if (A0E.moveToNext()) {
                j2 = C18270x1.A01(A0E);
            } else {
                j2 = 0;
            }
            A0E.close();
            StringBuilder A0f = C18280x3.A0f(A032);
            A0f.append("rowidstore/getRowIdByTimestampExcludeTypes ");
            A0f.append(j2);
            AnonymousClass33M.A05(r5, " | time spent:", A0f);
            return j2;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public boolean A06(C95814uZ r7) {
        Cursor A0E;
        boolean z = true;
        String[] strArr = new String[1];
        C56922sm.A01(this.A01, r7, strArr);
        AnonymousClass4GK A032 = this.A05.get();
        try {
            A0E = ((AnonymousClass3H0) A032).A03.A0E("SELECT  1 FROM available_message_view WHERE chat_row_id = ? AND message_type NOT IN ('7','87') AND from_me = 1 LIMIT 1", "OUTGOING_MESSAGE_EXISTS_RAW_SQL", strArr);
            if (A0E.getCount() <= 0) {
                z = false;
            }
            A0E.close();
            A032.close();
            return z;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public long A01() {
        Cursor A012;
        long j;
        AnonymousClass4GK A032 = this.A05.get();
        try {
            A012 = C56862sg.A01(((AnonymousClass3H0) A032).A03, " SELECT _id FROM available_message_view ORDER BY sort_id DESC LIMIT 1", "LAST_MESSAGE_ID_SQL");
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A1G(A0o, AnonymousClass0x9.A02(A012, "msgstore/lastmsgid/count ", A0o));
            if (A012.moveToNext()) {
                j = C18270x1.A01(A012);
            } else {
                j = 1;
            }
            A012.close();
            A032.close();
            return j;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public long A02(C95814uZ r7) {
        String str;
        String str2;
        Cursor A032;
        long j;
        boolean A0Y = this.A07.A0Y(C58422vE.A02, 6579);
        String[] strArr = new String[1];
        C56922sm r1 = this.A01;
        boolean A033 = C56922sm.A03(r1, r7, strArr);
        String[] A1Z = AnonymousClass0x9.A1Z();
        C56922sm.A02(r1, r7, A1Z, A033 ? 1 : 0);
        AnonymousClass0x2.A1S(A1Z, 1, this.A00.A0H());
        if (A0Y) {
            strArr = A1Z;
            str = "   SELECT _id FROM available_message_view WHERE chat_row_id = ? AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  ORDER BY sort_id DESC LIMIT 1";
            str2 = "LAST_CHAT_MESSAGE_ID_SQL_SKIP_EXPIRED_DM";
        } else {
            str = "   SELECT _id FROM available_message_view WHERE chat_row_id = ? ORDER BY sort_id DESC LIMIT 1";
            str2 = "LAST_CHAT_MESSAGE_ID_SQL";
        }
        AnonymousClass4GK A034 = this.A05.get();
        try {
            A032 = C56862sg.A03(A034, str, str2, strArr);
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A1G(A0o, AnonymousClass0x9.A02(A032, "msgstore/lastmsgid/count ", A0o));
            if (A032.moveToNext()) {
                j = C18270x1.A01(A032);
            } else {
                j = 1;
            }
            A032.close();
            A034.close();
            return j;
        } catch (Throwable th) {
            try {
                A034.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (X.C627336j.A0K(r7) != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A04(X.C95814uZ r18, int r19, long r20, long r22) {
        /*
            r17 = this;
            r4 = r20
            r3 = r17
            X.2ss r0 = r3.A02
            r7 = r18
            X.31A r0 = X.C56982ss.A00(r0, r7)
            r10 = 1
            if (r0 != 0) goto L_0x0011
            return r10
        L_0x0011:
            long r15 = android.os.SystemClock.uptimeMillis()
            boolean r0 = r7 instanceof X.AnonymousClass1fS
            r13 = 1
            r12 = 0
            if (r0 != 0) goto L_0x0022
            boolean r0 = X.C627336j.A0K(r7)
            r6 = 1
            if (r0 == 0) goto L_0x0023
        L_0x0022:
            r6 = 0
        L_0x0023:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "msgstore/startref "
            java.lang.String r0 = X.AnonymousClass000.A0P(r7, r0, r1)
            X.33M r14 = X.AnonymousClass33M.A01(r0)
            java.lang.String r0 = "   SELECT _id FROM available_message_view WHERE chat_row_id = ?"
            java.lang.StringBuilder r2 = X.C18330xA.A0A(r0)
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            if (r6 == 0) goto L_0x0043
            r0 = 8
            X.AnonymousClass001.A1O(r1, r0)
        L_0x0043:
            X.AnonymousClass34U.A01(r2, r1)
            java.lang.String r0 = " AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1) "
            r2.append(r0)
            java.lang.String r1 = " "
            int r0 = (r20 > r10 ? 1 : (r20 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0059
            r2.append(r1)
            java.lang.String r0 = " AND sort_id < ?"
            r2.append(r0)
        L_0x0059:
            r2.append(r1)
            java.lang.String r0 = " ORDER BY sort_id DESC"
            r2.append(r0)
            java.lang.String r0 = " LIMIT ?"
            java.lang.String r9 = X.AnonymousClass000.A0X(r0, r2)
            int r0 = (r20 > r10 ? 1 : (r20 == r10 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1W(r0)
            r6 = 2
            r11 = 3
            r1 = r22
            r10 = r19
            if (r0 == 0) goto L_0x008d
            r0 = 4
            java.lang.String[] r8 = new java.lang.String[r0]
            X.2sm r0 = r3.A01
            X.C56922sm.A02(r0, r7, r8, r12)
            X.AnonymousClass0x2.A1S(r8, r13, r1)
            X.2rr r0 = r3.A06
            long r0 = r0.A04(r4)
            X.AnonymousClass0x2.A1S(r8, r6, r0)
            X.C18280x3.A1Q(r8, r10, r11)
            goto L_0x009a
        L_0x008d:
            java.lang.String[] r8 = new java.lang.String[r11]
            X.2sm r0 = r3.A01
            X.C56922sm.A02(r0, r7, r8, r12)
            X.AnonymousClass0x2.A1S(r8, r13, r1)
            X.C18280x3.A1Q(r8, r10, r6)
        L_0x009a:
            X.3dV r0 = r3.A05     // Catch:{ SQLiteDatabaseCorruptException -> 0x00e5 }
            X.4GK r6 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00e5 }
            r0 = r6
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00db }
            X.2sg r1 = r0.A03     // Catch:{ all -> 0x00db }
            java.lang.String r0 = "ROW_ID_STORE_GET_START_REF"
            android.database.Cursor r2 = r1.A0E(r9, r0, r8)     // Catch:{ all -> 0x00db }
            boolean r0 = r2.moveToLast()     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x00bd
            int r0 = X.AnonymousClass0x7.A02(r2)     // Catch:{ all -> 0x00cf }
            long r4 = r2.getLong(r0)     // Catch:{ all -> 0x00cf }
        L_0x00b9:
            r14.A07()     // Catch:{ all -> 0x00cf }
            goto L_0x00c8
        L_0x00bd:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = "msgstore/startref can't get value for "
            X.C18260x0.A1S(r1, r0, r7)     // Catch:{ all -> 0x00cf }
            goto L_0x00b9
        L_0x00c8:
            r2.close()     // Catch:{ all -> 0x00db }
            r6.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00e5 }
            goto L_0x00ee
        L_0x00cf:
            r1 = move-exception
            if (r2 == 0) goto L_0x00da
            r2.close()     // Catch:{ all -> 0x00d6 }
            goto L_0x00da
        L_0x00d6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00db }
        L_0x00da:
            throw r1     // Catch:{ all -> 0x00db }
        L_0x00db:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x00e0 }
            goto L_0x00e4
        L_0x00e0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00e5 }
        L_0x00e4:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x00e5 }
        L_0x00e5:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.2q5 r0 = r3.A04
            r0.A04()
        L_0x00ee:
            X.2ga r3 = r3.A03
            long r1 = X.C18310x6.A0A(r15)
            java.lang.String r0 = "RowIdStore/getStartRef"
            r3.A02(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56382rt.A04(X.4uZ, int, long, long):long");
    }

    public boolean A07(C95814uZ r6) {
        boolean A1W;
        AnonymousClass31A A012;
        C56982ss r1 = this.A02;
        if (!r1.A0Q(r6) && (A012 = C56982ss.A01(r1, r6)) != null && A012.A0N != 1) {
            return true;
        }
        C56922sm r12 = this.A01;
        synchronized (r12) {
            A1W = AnonymousClass000.A1W(r12.A0A.get(r6));
        }
        if (!A1W || A02(r6) == 1) {
            return false;
        }
        return true;
    }

    public C56382rt(C56612sH r1, C56922sm r2, C56982ss r3, C49472ga r4, C55272q5 r5, C72303dV r6, C56362rr r7, AnonymousClass1VX r8) {
        this.A00 = r1;
        this.A07 = r8;
        this.A03 = r4;
        this.A01 = r2;
        this.A06 = r7;
        this.A02 = r3;
        this.A05 = r6;
        this.A04 = r5;
    }

    @Deprecated
    public int A00(long j, long j2) {
        Cursor A0E;
        String str;
        String[] A1Z = AnonymousClass0x9.A1Z();
        int i = 0;
        A1Z[0] = Long.toString(j);
        C18280x3.A1R(A1Z, 1, j2);
        AnonymousClass4GK A032 = this.A05.get();
        try {
            A0E = ((AnonymousClass3H0) A032).A03.A0E("SELECT COUNT(*) as count FROM available_message_view WHERE (message_type != '8') AND _id > ? AND _id <= ?", "GET_MESSAGE_COUNT_RANGE_SQL", A1Z);
            if (A0E.moveToNext()) {
                i = AnonymousClass0x2.A03(A0E);
                str = AnonymousClass000.A0Y("msgstore/getmessagesatid/pos:", AnonymousClass001.A0o(), i);
            } else {
                str = "msgstore/getmessagesatid/db no messages";
            }
            Log.i(str);
            A0E.close();
            A032.close();
            return i;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public long A03(C95814uZ r6, int i) {
        Cursor A0E;
        long j;
        String[] A1Z = AnonymousClass0x9.A1Z();
        C56922sm.A01(this.A01, r6, A1Z);
        C18280x3.A1Q(A1Z, i + 1, 1);
        AnonymousClass4GK A032 = this.A05.get();
        try {
            A0E = ((AnonymousClass3H0) A032).A03.A0E(" SELECT _id FROM available_message_view WHERE chat_row_id = ? AND message_type != 7 ORDER BY sort_id DESC LIMIT ?", "CHAT_LAST_OFFSET_MESSAGE_ID_SQL", A1Z);
            if (A0E.moveToLast()) {
                j = C18270x1.A01(A0E);
            } else {
                j = 1;
            }
            A0E.close();
            A032.close();
            return j;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
