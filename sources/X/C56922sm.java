package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2sm  reason: invalid class name and case insensitive filesystem */
public class C56922sm {
    public final C55682qk A00;
    public final C56972sr A01;
    public final C56982ss A02;
    public final AnonymousClass4EA A03;
    public final C623334p A04;
    public final C55272q5 A05;
    public final C72303dV A06;
    public final C56082rO A07;
    public final AnonymousClass1VX A08;
    public final C183538qC A09;
    public final Map A0A = AnonymousClass001.A0t();
    public final Map A0B = AnonymousClass001.A0t();

    public int A05(AnonymousClass31A r2) {
        return A04(r2.A04((Long) null), r2);
    }

    public long A07(C95814uZ r3) {
        synchronized (this) {
            Long l = (Long) this.A0A.get(r3);
            if (l != null) {
                long longValue = l.longValue();
                return longValue;
            }
            long A092 = A09(r3);
            A0M(r3, A092);
            return A092;
        }
    }

    public void A0F(AnonymousClass31A r5) {
        ContentValues A092;
        synchronized (r5) {
            A092 = C18280x3.A09();
            C18270x1.A0c(A092, "change_number_notified_message_row_id", r5.A0C);
        }
        A04(A092, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r3.A05.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(X.AnonymousClass31A r4) {
        /*
            r3 = this;
            monitor-enter(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x002b, Error | RuntimeException -> 0x0026 }
            android.content.ContentValues r2 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0023 }
            java.lang.String r1 = "archived"
            boolean r0 = r4.A0i     // Catch:{ all -> 0x0023 }
            X.AnonymousClass0x2.A0o(r2, r1, r0)     // Catch:{ all -> 0x0023 }
            monitor-exit(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x002b, Error | RuntimeException -> 0x0026 }
            int r0 = r3.A04(r2, r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x002b, Error | RuntimeException -> 0x0026 }
            if (r0 != 0) goto L_0x0034
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ SQLiteDatabaseCorruptException -> 0x002b, Error | RuntimeException -> 0x0026 }
            java.lang.String r0 = "msgstore/archive/did not update "
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x002b, Error | RuntimeException -> 0x0026 }
            X.4uZ r0 = r4.A0q     // Catch:{ SQLiteDatabaseCorruptException -> 0x002b, Error | RuntimeException -> 0x0026 }
            X.C18260x0.A0n(r0, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x002b, Error | RuntimeException -> 0x0026 }
            return
        L_0x0023:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x002b, Error | RuntimeException -> 0x0026 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x002b, Error | RuntimeException -> 0x0026 }
        L_0x0026:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            throw r0
        L_0x002b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.2q5 r0 = r3.A05
            r0.A04()
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56922sm.A0G(X.31A):void");
    }

    public void A0H(AnonymousClass31A r5) {
        ContentValues A062;
        synchronized (r5) {
            A062 = AnonymousClass0x9.A06();
            C18270x1.A0b(A062, "unseen_message_reaction_count", r5.A07);
            C18270x1.A0c(A062, "last_message_reaction_row_id", r5.A0M);
            C18270x1.A0c(A062, "last_seen_message_reaction_row_id", r5.A0T);
        }
        int A042 = A04(A062, r5);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("msgstore/updateChatLastMessageReactionInfo/");
        A0o.append(r5.A0q);
        A0o.append("/");
        A0o.append(r5.A08());
        C18260x0.A0y("/", A0o, A042);
    }

    public boolean A0O(AnonymousClass31A r5) {
        ContentValues A072;
        synchronized (r5) {
            A072 = AnonymousClass0x9.A07(5);
            C18270x1.A0c(A072, "display_message_row_id", r5.A0U);
            C18270x1.A0c(A072, "display_message_sort_id", r5.A0V);
            C18270x1.A0c(A072, "last_message_row_id", r5.A0N);
            C18270x1.A0c(A072, "last_message_sort_id", r5.A0O);
            C18270x1.A0c(A072, "sort_timestamp", r5.A0X);
        }
        return A0N(A072, r5);
    }

    public int A04(ContentValues contentValues, AnonymousClass31A r14) {
        C95814uZ r2 = r14.A0q;
        C85284Fq A042 = this.A06.A04();
        try {
            ContentValues contentValues2 = contentValues;
            if (!AnonymousClass000.A1U(r14.A02, 5)) {
                if (!(r2 instanceof C95804uY)) {
                    C18270x1.A0b(contentValues, "hidden", 0);
                    if (r14.A0o) {
                        r14.A0o = false;
                    }
                    long A052 = this.A04.A05(r2);
                    C56862sg r6 = ((AnonymousClass3H0) A042).A03;
                    String[] strArr = new String[1];
                    AnonymousClass0x2.A1S(strArr, 0, A052);
                    int A053 = r6.A05(contentValues2, "chat", "jid_row_id = ?", "updateChatTable/UPDATE_CHAT", strArr);
                    A042.close();
                    return A053;
                }
            }
            C18270x1.A0b(contentValues, "hidden", 1);
            long A0522 = this.A04.A05(r2);
            C56862sg r62 = ((AnonymousClass3H0) A042).A03;
            String[] strArr2 = new String[1];
            AnonymousClass0x2.A1S(strArr2, 0, A0522);
            int A0532 = r62.A05(contentValues2, "chat", "jid_row_id = ?", "updateChatTable/UPDATE_CHAT", strArr2);
            A042.close();
            return A0532;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public long A06(ContentValues contentValues) {
        C85284Fq A042 = this.A06.A04();
        try {
            long A082 = AnonymousClass3H0.A01(contentValues, A042, "hidden", 0).A08("chat", "insertIntoChatTable/INSERT_CHAT", contentValues);
            A042.close();
            return A082;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public final long A08(C95814uZ r12) {
        Cursor A0E;
        long j;
        long A052 = this.A04.A05(r12);
        if (A052 < 0) {
            C18260x0.A11("ChatStore/getOrCreateChatRowId/invalid jidRowId=", AnonymousClass001.A0o(), A052);
            return -1;
        }
        AnonymousClass4GK A032 = this.A06.get();
        try {
            C56862sg r5 = ((AnonymousClass3H0) A032).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1Y(A1Y, A052);
            A0E = r5.A0E("SELECT _id FROM chat WHERE jid_row_id = ?", "GET_ROW_ID_FOR_CHAT", A1Y);
            if (A0E.moveToNext()) {
                j = C18270x1.A01(A0E);
            } else {
                j = -1;
            }
            A0E.close();
            A032.close();
            if (j == -1) {
                j = A0A(r12);
                if (j <= 0) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("ChatStore/getOrCreateChatRowId/error inserting a hidden chat; jid=");
                    A0o.append(r12);
                    C18260x0.A11("; rowId=", A0o, j);
                }
            }
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

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        if (r3 == -1) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        r3 = A0A(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r3 > 0) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("ChatStore/getRowIdForChatHelperMAT/error inserting a hidden chat; jid=");
        r1.append(r9);
        X.C18260x0.A11("; rowId=", r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r3 > 0) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A09(X.C95814uZ r9) {
        /*
            r8 = this;
            X.2sr r0 = r8.A01
            boolean r0 = r0.A0a(r9)
            if (r0 != 0) goto L_0x0092
            X.1VX r2 = r8.A08
            r0 = 2939(0xb7b, float:4.118E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 == 0) goto L_0x0092
            r0 = 2479(0x9af, float:3.474E-42)
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 == 0) goto L_0x0092
            X.2ss r0 = r8.A02
            X.31A r0 = X.C56982ss.A00(r0, r9)
            r6 = 0
            java.lang.String r5 = "; rowId="
            if (r0 == 0) goto L_0x002f
            long r3 = r0.A0W
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x002f
        L_0x002e:
            return r3
        L_0x002f:
            X.4EA r3 = r8.A03
            java.util.List r0 = r3.B8r(r9)
            r4 = 0
            java.util.Map r2 = r8.A0E(r0, r4)
            java.util.Iterator r1 = r0.iterator()
        L_0x003e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0070
            java.lang.Object r0 = r1.next()
            java.lang.Number r0 = X.AnonymousClass0x9.A0q(r0, r2)
            if (r0 == 0) goto L_0x003e
        L_0x004e:
            long r3 = r0.longValue()
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002e
        L_0x0058:
            long r3 = r8.A0A(r9)
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x002e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ChatStore/getRowIdForChatHelperMAT/error inserting a hidden chat; jid="
            r1.append(r0)
            r1.append(r9)
            X.C18260x0.A11(r5, r1, r3)
            return r3
        L_0x0070:
            java.util.List r3 = r3.B8q(r9)
            r1 = 1
            java.util.List r0 = r3.subList(r4, r1)
            java.util.Map r2 = r8.A0E(r0, r1)
            java.util.Iterator r1 = r3.iterator()
        L_0x0081:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0058
            java.lang.Object r0 = r1.next()
            java.lang.Number r0 = X.AnonymousClass0x9.A0q(r0, r2)
            if (r0 == 0) goto L_0x0081
            goto L_0x004e
        L_0x0092:
            X.2ss r0 = r8.A02
            X.31A r0 = X.C56982ss.A00(r0, r9)
            if (r0 == 0) goto L_0x00a3
            long r3 = r0.A0W
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a3
            return r3
        L_0x00a3:
            long r3 = r8.A08(r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56922sm.A09(X.4uZ):long");
    }

    public final long A0A(C95814uZ r8) {
        C85284Fq A042;
        long A052 = this.A04.A05(r8);
        if (A052 == -1) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "ChatStore/insertHiddenChat/jid row id not found; jid=", r8);
            return -1;
        }
        C371321b A002 = ((AnonymousClass2Y0) this.A09.get()).A00(r8);
        int i = 2;
        if (A002 != null) {
            i = 3;
        }
        ContentValues A072 = AnonymousClass0x9.A07(i);
        C18270x1.A0c(A072, "jid_row_id", A052);
        A072.put("hidden", AnonymousClass001.A0f());
        if (A002 != null) {
            A072.put("chat_origin", A002.origin);
        }
        try {
            A042 = this.A06.A04();
            long A092 = ((AnonymousClass3H0) A042).A03.A09("chat", "insertHiddenChat/INSERT_CHAT", A072);
            A042.close();
            return A092;
        } catch (SQLiteConstraintException e) {
            C18260x0.A0k(r8, "ChatStore/insertHiddenChat/row already exists but can't be read; jid=", AnonymousClass001.A0o(), e);
            return -1;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        r4 = r6.A06.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3 = ((X.AnonymousClass3H0) r4).A03;
        r1 = X.AnonymousClass0x9.A1Y();
        X.C18260x0.A1Y(r1, r7);
        r3 = r3.A0E("SELECT jid_row_id FROM chat WHERE _id = ?", "GET_CHAT_BY_ROW_ID_SQL", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r3.moveToLast() == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        r5 = X.C106405Yw.A03(r6.A04.A08(X.AnonymousClass0x2.A0C(r3, "jid_row_id")));
        A0M(r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r3 != null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0063, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0067, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0069, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006c, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C95814uZ A0B(long r7) {
        /*
            r6 = this;
            r1 = 0
            r5 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0070
            monitor-enter(r6)
            java.util.Map r2 = r6.A0B     // Catch:{ all -> 0x006d }
            java.lang.Long r1 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x006d }
            boolean r0 = r2.containsKey(r1)     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x001c
            java.lang.Object r5 = r2.get(r1)     // Catch:{ all -> 0x006d }
            X.4uZ r5 = (X.C95814uZ) r5     // Catch:{ all -> 0x006d }
            monitor-exit(r6)     // Catch:{ all -> 0x006d }
            return r5
        L_0x001c:
            monitor-exit(r6)     // Catch:{ all -> 0x006d }
            X.3dV r0 = r6.A06
            X.4GK r4 = r0.get()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0063 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0063 }
            java.lang.String r2 = "SELECT jid_row_id FROM chat WHERE _id = ?"
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0063 }
            X.C18260x0.A1Y(r1, r7)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "GET_CHAT_BY_ROW_ID_SQL"
            android.database.Cursor r3 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x0063 }
            boolean r0 = r3.moveToLast()     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0050
            X.34p r2 = r6.A04     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "jid_row_id"
            long r0 = X.AnonymousClass0x2.A0C(r3, r0)     // Catch:{ all -> 0x0057 }
            com.whatsapp.jid.Jid r0 = r2.A08(r0)     // Catch:{ all -> 0x0057 }
            X.4uZ r5 = X.C106405Yw.A03(r0)     // Catch:{ all -> 0x0057 }
            r6.A0M(r5, r7)     // Catch:{ all -> 0x0057 }
        L_0x0050:
            r3.close()     // Catch:{ all -> 0x0063 }
            r4.close()
            return r5
        L_0x0057:
            r1 = move-exception
            if (r3 == 0) goto L_0x0062
            r3.close()     // Catch:{ all -> 0x005e }
            goto L_0x0062
        L_0x005e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0063 }
        L_0x0062:
            throw r1     // Catch:{ all -> 0x0063 }
        L_0x0063:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0068 }
            throw r1
        L_0x0068:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x006d:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006d }
            throw r1
        L_0x0070:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56922sm.A0B(long):X.4uZ");
    }

    public C95814uZ A0C(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("chat_row_id");
        if (columnIndex >= 0) {
            return A0B(cursor.getLong(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex("key_remote_jid");
        if (columnIndex2 >= 0) {
            return AnonymousClass0x2.A0K(cursor, columnIndex2);
        }
        return null;
    }

    public Map A0D() {
        AnonymousClass33M A012 = AnonymousClass33M.A01("ChatsStore/getChats");
        HashMap A0t = AnonymousClass001.A0t();
        try {
            AnonymousClass4GK A032 = this.A06.get();
            try {
                Cursor A013 = C56862sg.A01(((AnonymousClass3H0) A032).A03, C39342Bp.A00, "GET_CHATS_SQL");
                try {
                    int A022 = AnonymousClass0x7.A02(A013);
                    int columnIndexOrThrow = A013.getColumnIndexOrThrow("raw_string_jid");
                    int columnIndexOrThrow2 = A013.getColumnIndexOrThrow("display_message_row_id");
                    int columnIndexOrThrow3 = A013.getColumnIndexOrThrow("display_message_sort_id");
                    int columnIndexOrThrow4 = A013.getColumnIndexOrThrow("last_read_message_row_id");
                    int columnIndexOrThrow5 = A013.getColumnIndexOrThrow("last_read_message_sort_id");
                    int columnIndexOrThrow6 = A013.getColumnIndexOrThrow("last_read_receipt_sent_message_row_id");
                    int columnIndexOrThrow7 = A013.getColumnIndexOrThrow("last_read_receipt_sent_message_sort_id");
                    int columnIndexOrThrow8 = A013.getColumnIndexOrThrow("archived");
                    int columnIndexOrThrow9 = A013.getColumnIndexOrThrow("sort_timestamp");
                    int columnIndexOrThrow10 = A013.getColumnIndexOrThrow("spam_detection");
                    int columnIndexOrThrow11 = A013.getColumnIndexOrThrow("plaintext_disabled");
                    int columnIndexOrThrow12 = A013.getColumnIndexOrThrow("vcard_ui_dismissed");
                    int columnIndexOrThrow13 = A013.getColumnIndexOrThrow("change_number_notified_message_row_id");
                    int columnIndexOrThrow14 = A013.getColumnIndexOrThrow("subject");
                    int columnIndexOrThrow15 = A013.getColumnIndexOrThrow("last_message_row_id");
                    int columnIndexOrThrow16 = A013.getColumnIndexOrThrow("last_message_sort_id");
                    int columnIndexOrThrow17 = A013.getColumnIndexOrThrow("last_important_message_row_id");
                    int columnIndexOrThrow18 = A013.getColumnIndexOrThrow("unseen_earliest_message_received_time");
                    int columnIndexOrThrow19 = A013.getColumnIndexOrThrow("unseen_message_count");
                    int columnIndexOrThrow20 = A013.getColumnIndexOrThrow("unseen_missed_calls_count");
                    int columnIndexOrThrow21 = A013.getColumnIndexOrThrow("unseen_row_count");
                    int columnIndexOrThrow22 = A013.getColumnIndexOrThrow("unseen_message_reaction_count");
                    int columnIndexOrThrow23 = A013.getColumnIndexOrThrow("unseen_comment_message_count");
                    int columnIndexOrThrow24 = A013.getColumnIndexOrThrow("last_message_reaction_row_id");
                    int columnIndexOrThrow25 = A013.getColumnIndexOrThrow("last_seen_message_reaction_row_id");
                    int columnIndexOrThrow26 = A013.getColumnIndexOrThrow("deleted_message_row_id");
                    int columnIndexOrThrow27 = A013.getColumnIndexOrThrow("deleted_starred_message_row_id");
                    int columnIndexOrThrow28 = A013.getColumnIndexOrThrow("deleted_categories_message_row_id");
                    int columnIndexOrThrow29 = A013.getColumnIndexOrThrow("deleted_categories_starred_message_row_id");
                    int columnIndexOrThrow30 = A013.getColumnIndexOrThrow("deleted_message_categories");
                    int columnIndexOrThrow31 = A013.getColumnIndexOrThrow("show_group_description");
                    int columnIndexOrThrow32 = A013.getColumnIndexOrThrow("ephemeral_expiration");
                    int columnIndexOrThrow33 = A013.getColumnIndexOrThrow("ephemeral_setting_timestamp");
                    int columnIndexOrThrow34 = A013.getColumnIndexOrThrow("ephemeral_displayed_exemptions");
                    int columnIndexOrThrow35 = A013.getColumnIndexOrThrow("ephemeral_disappearing_messages_initiator");
                    int columnIndexOrThrow36 = A013.getColumnIndexOrThrow("unseen_important_message_count");
                    int columnIndexOrThrow37 = A013.getColumnIndexOrThrow("group_type");
                    int columnIndexOrThrow38 = A013.getColumnIndexOrThrow("growth_lock_level");
                    int columnIndexOrThrow39 = A013.getColumnIndexOrThrow("growth_lock_expiration_ts");
                    int columnIndexOrThrow40 = A013.getColumnIndexOrThrow("has_new_community_admin_dialog_been_acknowledged");
                    int columnIndexOrThrow41 = A013.getColumnIndexOrThrow("history_sync_progress");
                    int columnIndexOrThrow42 = A013.getColumnIndexOrThrow("hidden");
                    int columnIndexOrThrow43 = A013.getColumnIndexOrThrow("chat_lock");
                    int columnIndexOrThrow44 = A013.getColumnIndexOrThrow("chat_origin");
                    while (A013.moveToNext()) {
                        C95814uZ A0K = AnonymousClass0x2.A0K(A013, columnIndexOrThrow);
                        if (A0K == null) {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("msgstore-manager/initialize/chats/could not parse raw chat jid: ");
                            C18260x0.A1M(A0o, A013.getString(columnIndexOrThrow));
                        } else if (!(A0K instanceof C135166kE) && A013.getInt(columnIndexOrThrow42) != 1 && !(A0K instanceof C95804uY)) {
                            AnonymousClass31A r4 = new AnonymousClass31A(A0K);
                            r4.A0W = A013.getLong(A022);
                            r4.A0U = A013.getLong(columnIndexOrThrow2);
                            r4.A0V = A013.getLong(columnIndexOrThrow3);
                            r4.A0P = A013.getLong(columnIndexOrThrow4);
                            r4.A0Q = A013.getLong(columnIndexOrThrow5);
                            r4.A0R = A013.getLong(columnIndexOrThrow6);
                            r4.A0S = A013.getLong(columnIndexOrThrow7);
                            r4.A0i = AnonymousClass000.A1U(A013.getInt(columnIndexOrThrow8), 1);
                            r4.A0X = A013.getLong(columnIndexOrThrow9);
                            r4.A04 = A013.getInt(columnIndexOrThrow10);
                            r4.A00 = A013.getInt(columnIndexOrThrow11);
                            r4.A0B = A013.getInt(columnIndexOrThrow12);
                            r4.A0C = A013.getLong(columnIndexOrThrow13);
                            r4.A0h = A013.getString(columnIndexOrThrow14);
                            r4.A0N = A013.getLong(columnIndexOrThrow15);
                            r4.A0O = A013.getLong(columnIndexOrThrow16);
                            long j = A013.getLong(columnIndexOrThrow17);
                            r4.A0L = j;
                            if (j == 0) {
                                r4.A0L = 1;
                            }
                            r4.A0Y = A013.getLong(columnIndexOrThrow18);
                            r4.A08 = A013.getInt(columnIndexOrThrow19);
                            r4.A09 = A013.getInt(columnIndexOrThrow20);
                            r4.A0A = A013.getInt(columnIndexOrThrow21);
                            r4.A07 = A013.getInt(columnIndexOrThrow22);
                            r4.A05 = A013.getInt(columnIndexOrThrow23);
                            r4.A0M = (long) A013.getInt(columnIndexOrThrow24);
                            r4.A0T = (long) A013.getInt(columnIndexOrThrow25);
                            long j2 = A013.getLong(columnIndexOrThrow26);
                            r4.A0F = j2;
                            if (j2 == 0) {
                                r4.A0F = Long.MIN_VALUE;
                            }
                            long j3 = A013.getLong(columnIndexOrThrow27);
                            r4.A0G = j3;
                            if (j3 == 0) {
                                r4.A0G = Long.MIN_VALUE;
                            }
                            r4.A0g = A013.getString(columnIndexOrThrow30);
                            long j4 = A013.getLong(columnIndexOrThrow28);
                            r4.A0D = j4;
                            if (j4 == 0) {
                                r4.A0D = Long.MIN_VALUE;
                            }
                            long j5 = A013.getLong(columnIndexOrThrow29);
                            r4.A0E = j5;
                            if (j5 == 0) {
                                r4.A0E = Long.MIN_VALUE;
                            }
                            r4.A0p = AnonymousClass001.A1T(A013.getInt(columnIndexOrThrow31));
                            r4.A03 = A013.getInt(columnIndexOrThrow41);
                            r4.A0j = AnonymousClass001.A1W(A013.getInt(columnIndexOrThrow43));
                            String string = A013.getString(columnIndexOrThrow44);
                            C371321b r14 = null;
                            if (string != null) {
                                C371321b[] values = C371321b.values();
                                int length = values.length;
                                int i = 0;
                                while (true) {
                                    if (i >= length) {
                                        break;
                                    }
                                    C371321b r1 = values[i];
                                    if (C162457s7.A0P(r1.origin, string)) {
                                        r14 = r1;
                                        break;
                                    }
                                    i++;
                                }
                            }
                            if (r4.A0Z == null) {
                                r4.A0Z = r14;
                            }
                            r4.A0o = AnonymousClass001.A1W(A013.getInt(columnIndexOrThrow42));
                            int i2 = A013.getInt(columnIndexOrThrow35);
                            int i3 = A013.getInt(columnIndexOrThrow32);
                            long j6 = A013.getLong(columnIndexOrThrow33);
                            int i4 = A013.getInt(columnIndexOrThrow34);
                            r4.A0b = new AnonymousClass3Z2(i3, j6, i2);
                            r4.A01 = i4;
                            r4.A06 = A013.getInt(columnIndexOrThrow36);
                            r4.A0k = AnonymousClass001.A1T(A013.getInt(columnIndexOrThrow40));
                            r4.A02 = A013.getInt(columnIndexOrThrow37);
                            r4.A0e = new C48742fO(A013.getInt(columnIndexOrThrow38), A013.getLong(columnIndexOrThrow39));
                            A0t.put(A0K, r4);
                        }
                    }
                    synchronized (this) {
                        Iterator A0u = AnonymousClass001.A0u(A0t);
                        while (A0u.hasNext()) {
                            Map.Entry A0w = AnonymousClass001.A0w(A0u);
                            A0M(C18320x8.A0N(A0w), ((AnonymousClass31A) A0w.getValue()).A0W);
                        }
                    }
                    A013.close();
                    A032.close();
                    A012.A07();
                    return A0t;
                } catch (Throwable th) {
                    if (A013 != null) {
                        A013.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                A032.close();
                throw th2;
            }
        } catch (Throwable th3) {
            A012.A07();
            throw th3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0075, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0076, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0079, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007b, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r5.A05.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0083, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(X.AnonymousClass31A r6) {
        /*
            r5 = this;
            java.lang.String r3 = "/"
            monitor-enter(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x007a, Error | RuntimeException -> 0x0075 }
            android.content.ContentValues r4 = r6.A03()     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = "last_read_message_row_id"
            long r0 = r6.A0P     // Catch:{ all -> 0x0072 }
            X.C18270x1.A0c(r4, r2, r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = "last_read_message_sort_id"
            long r0 = r6.A0Q     // Catch:{ all -> 0x0072 }
            X.C18270x1.A0c(r4, r2, r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = "last_message_row_id"
            long r0 = r6.A0N     // Catch:{ all -> 0x0072 }
            X.C18270x1.A0c(r4, r2, r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = "last_message_sort_id"
            long r0 = r6.A0O     // Catch:{ all -> 0x0072 }
            X.C18270x1.A0c(r4, r2, r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = "last_important_message_row_id"
            long r0 = r6.A0L     // Catch:{ all -> 0x0072 }
            X.C18270x1.A0c(r4, r2, r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = "unseen_important_message_count"
            int r0 = r6.A06     // Catch:{ all -> 0x0072 }
            X.C18270x1.A0b(r4, r1, r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = "unseen_message_reaction_count"
            int r0 = r6.A07     // Catch:{ all -> 0x0072 }
            X.C18270x1.A0b(r4, r1, r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = "unseen_comment_message_count"
            int r0 = r6.A05     // Catch:{ all -> 0x0072 }
            X.C18270x1.A0b(r4, r1, r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = "last_message_reaction_row_id"
            long r0 = r6.A0M     // Catch:{ all -> 0x0072 }
            X.C18270x1.A0c(r4, r2, r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = "last_seen_message_reaction_row_id"
            long r0 = r6.A0T     // Catch:{ all -> 0x0072 }
            X.C18270x1.A0c(r4, r2, r0)     // Catch:{ all -> 0x0072 }
            monitor-exit(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x007a, Error | RuntimeException -> 0x0075 }
            int r2 = r5.A04(r4, r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x007a, Error | RuntimeException -> 0x0075 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ SQLiteDatabaseCorruptException -> 0x007a, Error | RuntimeException -> 0x0075 }
            java.lang.String r0 = "msgstore/setchatseen/"
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x007a, Error | RuntimeException -> 0x0075 }
            X.4uZ r0 = r6.A0q     // Catch:{ SQLiteDatabaseCorruptException -> 0x007a, Error | RuntimeException -> 0x0075 }
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x007a, Error | RuntimeException -> 0x0075 }
            r1.append(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x007a, Error | RuntimeException -> 0x0075 }
            java.lang.String r0 = r6.A08()     // Catch:{ SQLiteDatabaseCorruptException -> 0x007a, Error | RuntimeException -> 0x0075 }
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x007a, Error | RuntimeException -> 0x0075 }
            X.C18260x0.A0y(r3, r1, r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x007a, Error | RuntimeException -> 0x0075 }
            return
        L_0x0072:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x007a, Error | RuntimeException -> 0x0075 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x007a, Error | RuntimeException -> 0x0075 }
        L_0x0075:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            throw r0
        L_0x007a:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.2q5 r0 = r5.A05
            r0.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56922sm.A0I(X.31A):void");
    }

    public void A0J(AnonymousClass31A r5) {
        try {
            int A042 = A04(r5.A03(), r5);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("msgstore/setchatunseen/");
            A0o.append(r5.A0q);
            A0o.append("/");
            A0o.append(r5.A08());
            C18260x0.A0y("/", A0o, A042);
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            this.A05.A04();
        } catch (Error | RuntimeException e2) {
            Log.e(e2);
            throw e2;
        }
    }

    public void A0K(C95814uZ r9) {
        C85284Fq A042 = this.A06.A04();
        try {
            C69833Yo Axl = A042.Axl();
            try {
                ((AnonymousClass3H0) A042).A03.A0I("DELETE FROM chat WHERE jid_row_id = ?", "DELETE_CHAT_BY_JID_ROW_ID", C18260x0.A1b(this.A04.A05(r9)));
                this.A02.A0I(r9);
                synchronized (this) {
                    Long l = (Long) this.A0A.remove(r9);
                    if (l != null) {
                        this.A0B.remove(l);
                    }
                }
                Axl.A00();
                Axl.close();
                A042.close();
            } catch (Throwable th) {
                Axl.close();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                A042.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public void A0L(C95814uZ r6, long j) {
        AnonymousClass31A A0A2 = this.A02.A0A(r6, false);
        if (A0A2 != null && A0A2.A0T <= j && j >= 1) {
            A0A2.A0T = j;
            if (A0A2.A0M < j) {
                A0A2.A0M = j;
            }
            A0A2.A07 = 0;
            A0H(A0A2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (X.C627336j.A0L(r2) == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M(X.C95814uZ r5, long r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0061
            r1 = -1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0061
            monitor-enter(r4)
            java.util.Map r0 = r4.A0A     // Catch:{ all -> 0x005e }
            java.lang.Long r3 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x005e }
            r0.put(r5, r3)     // Catch:{ all -> 0x005e }
            java.util.Map r1 = r4.A0B     // Catch:{ all -> 0x005e }
            java.lang.Object r2 = r1.get(r3)     // Catch:{ all -> 0x005e }
            X.4uZ r2 = (X.C95814uZ) r2     // Catch:{ all -> 0x005e }
            boolean r0 = r5.equals(r2)     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x0031
            if (r2 == 0) goto L_0x002e
            boolean r0 = X.C627336j.A0L(r5)     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x0033
            boolean r0 = X.C627336j.A0L(r2)     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x0042
        L_0x002e:
            r1.put(r3, r5)     // Catch:{ all -> 0x005e }
        L_0x0031:
            monitor-exit(r4)     // Catch:{ all -> 0x005e }
            goto L_0x005d
        L_0x0033:
            boolean r0 = X.C627336j.A0L(r2)     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0042
            X.2ss r0 = r4.A02     // Catch:{ all -> 0x005e }
            boolean r0 = r0.A0L(r5)     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0042
            goto L_0x002e
        L_0x0042:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x005e }
            java.lang.String r0 = "Attempted to overwrite cached JID "
            r1.append(r0)     // Catch:{ all -> 0x005e }
            r1.append(r2)     // Catch:{ all -> 0x005e }
            java.lang.String r0 = " with new JID "
            java.lang.String r1 = X.AnonymousClass000.A0P(r5, r0, r1)     // Catch:{ all -> 0x005e }
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch:{ all -> 0x005e }
            r0.<init>()     // Catch:{ all -> 0x005e }
            com.whatsapp.util.Log.e(r1, r0)     // Catch:{ all -> 0x005e }
            goto L_0x0031
        L_0x005d:
            return
        L_0x005e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005e }
            throw r0
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56922sm.A0M(X.4uZ, long):void");
    }

    public C56922sm(C55682qk r2, C56972sr r3, C56982ss r4, AnonymousClass4EA r5, C623334p r6, C55272q5 r7, C72303dV r8, C56082rO r9, AnonymousClass1VX r10, C183538qC r11) {
        this.A08 = r10;
        this.A04 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A09 = r11;
        this.A07 = r9;
        this.A03 = r5;
        this.A06 = r8;
        this.A05 = r7;
    }

    public static void A00(ContentValues contentValues, C56922sm r3, C95814uZ r4) {
        contentValues.put("chat_row_id", Long.valueOf(r3.A07(r4)));
    }

    public static void A01(C56922sm r0, C95814uZ r1, Object[] objArr) {
        objArr[0] = String.valueOf(r0.A07(r1));
    }

    public static void A02(C56922sm r0, C95814uZ r1, Object[] objArr, int i) {
        objArr[i] = String.valueOf(r0.A07(r1));
    }

    public static boolean A03(C56922sm r0, C95814uZ r1, Object[] objArr) {
        objArr[0] = String.valueOf(r0.A07(r1));
        return false;
    }

    public final Map A0E(List list, boolean z) {
        String str;
        Cursor A0E;
        HashMap hashMap = new HashMap(list.size());
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = String.valueOf(list.get(i));
        }
        AnonymousClass4GK A032 = this.A06.get();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A032).A03;
            int size = list.size();
            StringBuilder A0o = AnonymousClass001.A0o();
            C57212tH.A02("SELECT _id, jid_row_id FROM chat WHERE jid_row_id IN ", A0o, size);
            A0o.append(" AND ");
            C18300x5.A1O(A0o, "hidden");
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            A0E = r3.A0E(AnonymousClass000.A0X(str, A0o), "GET_ROW_ID_FOR_CHAT", strArr);
            int columnIndexOrThrow = A0E.getColumnIndexOrThrow("jid_row_id");
            int A022 = AnonymousClass0x7.A02(A0E);
            while (A0E.moveToNext()) {
                long j = A0E.getLong(columnIndexOrThrow);
                AnonymousClass0x2.A1J(Long.valueOf(j), hashMap, A0E.getLong(A022));
            }
            A0E.close();
            A032.close();
            return hashMap;
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

    public boolean A0N(ContentValues contentValues, AnonymousClass31A r8) {
        if (A04(contentValues, r8) != 0) {
            return true;
        }
        C18270x1.A0c(contentValues, "jid_row_id", this.A04.A05(r8.A0q));
        long A062 = A06(contentValues);
        r8.A0W = A062;
        if (A062 == -1) {
            return false;
        }
        return true;
    }
}
