package X;

import android.database.Cursor;
import android.os.SystemClock;

/* renamed from: X.2rr  reason: invalid class name and case insensitive filesystem */
public class C56362rr {
    public final C56612sH A00;
    public final C56922sm A01;
    public final C56982ss A02;
    public final C49472ga A03;
    public final C72303dV A04;
    public final AnonymousClass1VX A05;

    public int A01(C95814uZ r7, long j) {
        Cursor A0E;
        AnonymousClass4GK A032 = this.A04.get();
        try {
            C56862sg r4 = ((AnonymousClass3H0) A032).A03;
            String[] A1Z = AnonymousClass0x9.A1Z();
            int A033 = C56922sm.A03(this.A01, r7, A1Z);
            C18270x1.A1R(A1Z, j);
            A0E = r4.A0E("SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND sort_id > ? AND (message_type != '7') AND from_me = 0", "GET_CHAT_MESSAGES_COUNT_NEWER_THAN_REF_EXCLUDE_SYSTEM_MESSAGES_SQL", A1Z);
            if (A0E.moveToNext()) {
                A033 = AnonymousClass0x2.A03(A0E);
            } else {
                C18260x0.A1R(AnonymousClass001.A0o(), "msgstore/getnewercount/db no message for ", r7);
            }
            A0E.close();
            A032.close();
            return A033;
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

    public int A02(C95814uZ r7, long j) {
        Cursor A0E;
        AnonymousClass4GK A032 = this.A04.get();
        try {
            C56862sg r4 = ((AnonymousClass3H0) A032).A03;
            String[] A1Z = AnonymousClass0x9.A1Z();
            int A033 = C56922sm.A03(this.A01, r7, A1Z);
            C18270x1.A1R(A1Z, j);
            A0E = r4.A0E("SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND (message_type = '10') AND sort_id > ?", "GET_CHAT_MISSED_CALLS_COUNT_NEWER_THAN_REF_SQL", A1Z);
            if (A0E.moveToNext()) {
                A033 = AnonymousClass0x2.A03(A0E);
            } else {
                C18260x0.A1R(AnonymousClass001.A0o(), "msgstore/getnewercount/db no message for ", r7);
            }
            A0E.close();
            A032.close();
            return A033;
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

    public long A06(C95814uZ r7) {
        String str;
        String str2;
        Cursor A032;
        long j;
        boolean A0Y = this.A05.A0Y(C58422vE.A02, 6579);
        String[] strArr = new String[1];
        C56922sm r1 = this.A01;
        boolean A033 = C56922sm.A03(r1, r7, strArr);
        String[] A1Z = AnonymousClass0x9.A1Z();
        C56922sm.A02(r1, r7, A1Z, A033 ? 1 : 0);
        AnonymousClass0x2.A1S(A1Z, 1, this.A00.A0H());
        if (A0Y) {
            strArr = A1Z;
            str = "   SELECT sort_id FROM available_message_view WHERE chat_row_id = ? AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  ORDER BY sort_id DESC LIMIT 1";
            str2 = "LAST_CHAT_MESSAGE_SORT_ID_SQL_SKIP_EXPIRED_DM";
        } else {
            str = "   SELECT sort_id FROM available_message_view WHERE chat_row_id = ? ORDER BY sort_id DESC LIMIT 1";
            str2 = "LAST_CHAT_MESSAGE_SORT_ID_SQL";
        }
        AnonymousClass4GK A034 = this.A04.get();
        try {
            A032 = C56862sg.A03(A034, str, str2, strArr);
            if (A032.moveToNext()) {
                j = AnonymousClass0x2.A0C(A032, "sort_id");
            } else {
                j = Long.MIN_VALUE;
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

    public C56362rr(C56612sH r1, C56922sm r2, C56982ss r3, C49472ga r4, C72303dV r5, AnonymousClass1VX r6) {
        this.A00 = r1;
        this.A05 = r6;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }

    public int A00(C95814uZ r9, long j) {
        Cursor A0E;
        long uptimeMillis = SystemClock.uptimeMillis();
        AnonymousClass4GK A032 = this.A04.get();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A032).A03;
            String[] A1Z = AnonymousClass0x9.A1Z();
            int A033 = C56922sm.A03(this.A01, r9, A1Z);
            C18270x1.A1R(A1Z, j);
            A0E = r3.A0E("SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND sort_id > ?", "GET_CHAT_MESSAGES_COUNT_NEWER_THAN_SORT_REF_SQL", A1Z);
            if (A0E.moveToNext()) {
                A033 = AnonymousClass0x2.A03(A0E);
            } else {
                C18260x0.A1R(AnonymousClass001.A0o(), "msgstore/getnewercount/db no message for ", r9);
            }
            A0E.close();
            A032.close();
            this.A03.A02("SortIdStore/getMessagesNewerThanCount", C18310x6.A0A(uptimeMillis));
            return A033;
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

    public int A03(C95814uZ r7, long j, long j2) {
        Cursor A0E;
        String[] A1a = AnonymousClass0x9.A1a();
        int A032 = C56922sm.A03(this.A01, r7, A1a);
        C18280x3.A1R(A1a, 1, j);
        C18280x3.A1R(A1a, 2, j2);
        AnonymousClass4GK A033 = this.A04.get();
        try {
            A0E = ((AnonymousClass3H0) A033).A03.A0E("SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND sort_id > ? AND sort_id <= ?", "GET_CHAT_MESSAGE_COUNT_RANGE_BY_SORT_ID_SQL", A1a);
            if (A0E.moveToNext()) {
                A032 = AnonymousClass0x2.A03(A0E);
            }
            A0E.close();
            A033.close();
            return A032;
        } catch (Throwable th) {
            try {
                A033.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public long A04(long j) {
        Cursor A0E;
        long j2;
        String[] A1Y = AnonymousClass0x9.A1Y();
        C18270x1.A1S(A1Y, j);
        AnonymousClass4GK A032 = this.A04.get();
        try {
            A0E = ((AnonymousClass3H0) A032).A03.A0E("SELECT sort_id FROM message_view WHERE _id = ?", "GET_SORT_ID_OF_MESSAGE_SQL", A1Y);
            if (A0E.moveToNext()) {
                j2 = AnonymousClass0x2.A0C(A0E, "sort_id");
            } else {
                j2 = Long.MIN_VALUE;
            }
            A0E.close();
            A032.close();
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

    public long A05(C95814uZ r6) {
        Cursor A0E;
        String[] A1Y = AnonymousClass0x9.A1Y();
        C56922sm.A01(this.A01, r6, A1Y);
        AnonymousClass4GK A032 = this.A04.get();
        try {
            A0E = ((AnonymousClass3H0) A032).A03.A0E("   SELECT sort_id FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') ORDER BY sort_id ASC LIMIT 1", "GET_FIRST_SORT_REF_SQL", A1Y);
            if (A0E.moveToFirst()) {
                long A0C = AnonymousClass0x2.A0C(A0E, "sort_id");
                A0E.close();
                A032.close();
                return A0C;
            }
            A0E.close();
            C18260x0.A1S(C18280x3.A0f(A032), "SortIdStore/ getFirstSortId can't get value for ", r6);
            return Long.MIN_VALUE;
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

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r3 >= r7) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A07(X.C95814uZ r6, long r7) {
        /*
            r5 = this;
            X.C626936e.A06(r6)
            long r3 = r5.A05(r6)
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0012
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r1 = 1
            if (r0 < 0) goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            boolean r0 = r6 instanceof X.C95804uY
            if (r0 == 0) goto L_0x002f
            if (r1 != 0) goto L_0x002b
            X.2ss r0 = r5.A02
            X.31A r1 = X.C56982ss.A00(r0, r6)
            boolean r0 = r1 instanceof X.AnonymousClass1RL
            if (r0 == 0) goto L_0x002d
            X.1RL r1 = (X.AnonymousClass1RL) r1
            boolean r0 = r1.A0M
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002d
        L_0x002b:
            r0 = 1
            return r0
        L_0x002d:
            r0 = 0
            return r0
        L_0x002f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56362rr.A07(X.4uZ, long):boolean");
    }
}
