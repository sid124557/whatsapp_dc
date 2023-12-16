package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2qK  reason: invalid class name and case insensitive filesystem */
public class C55422qK {
    public final C56972sr A00;
    public final C56612sH A01;
    public final C52852m9 A02;
    public final C56922sm A03;
    public final C623334p A04;
    public final C72303dV A05;

    public C50392i6 A02(C95814uZ r6, String str) {
        Cursor A0E;
        String[] A1a = C18300x5.A1a(str, 2);
        C18270x1.A1R(A1a, this.A03.A07(r6));
        AnonymousClass4GK A032 = this.A05.get();
        try {
            A0E = ((AnonymousClass3H0) A032).A03.A0E("SELECT creation_message_row_id, key_id, key_from_me, key_chat_row_id, call_type, scheduled_timestamp, call_title, creator_jid_row_id, is_upcoming, call_log_row_id FROM scheduled_calls WHERE key_id = ?  AND key_chat_row_id = ? ", "ScheduledCallsStore/GET_SCHEDULED_CALL_BY_KEY_ID_AND_CHAT", A1a);
            if (!A0E.moveToLast()) {
                A0E.close();
                A032.close();
                return null;
            }
            C50392i6 A012 = A01(A0E);
            A0E.close();
            A032.close();
            return A012;
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

    public C50392i6 A00(long j) {
        Cursor A0E;
        AnonymousClass4GK A032 = this.A05.get();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A032).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1Y(A1Y, j);
            A0E = r3.A0E("SELECT creation_message_row_id, key_id, key_from_me, key_chat_row_id, call_type, scheduled_timestamp, call_title, creator_jid_row_id, is_upcoming, call_log_row_id FROM scheduled_calls WHERE creation_message_row_id = ? ", "ScheduledCallsStore/GET_SCHEDULED_CALL_BY_ROW_ID", A1Y);
            if (!A0E.moveToFirst()) {
                A0E.close();
                A032.close();
                return null;
            }
            C50392i6 A012 = A01(A0E);
            A0E.close();
            A032.close();
            return A012;
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

    public final C50392i6 A01(Cursor cursor) {
        long j;
        Cursor cursor2 = cursor;
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("creation_message_row_id");
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("key_id");
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("key_from_me");
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("key_chat_row_id");
        int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow("call_type");
        int columnIndexOrThrow6 = cursor2.getColumnIndexOrThrow("scheduled_timestamp");
        int columnIndexOrThrow7 = cursor2.getColumnIndexOrThrow("call_title");
        int columnIndexOrThrow8 = cursor2.getColumnIndexOrThrow("creator_jid_row_id");
        int columnIndexOrThrow9 = cursor2.getColumnIndexOrThrow("is_upcoming");
        int columnIndexOrThrow10 = cursor2.getColumnIndexOrThrow("call_log_row_id");
        long j2 = cursor2.getLong(columnIndexOrThrow);
        String string = cursor2.getString(columnIndexOrThrow2);
        boolean A1T = AnonymousClass000.A1T((cursor2.getLong(columnIndexOrThrow3) > 1 ? 1 : (cursor2.getLong(columnIndexOrThrow3) == 1 ? 0 : -1)));
        C95814uZ A0B = this.A03.A0B(cursor2.getLong(columnIndexOrThrow4));
        int i = cursor2.getInt(columnIndexOrThrow5);
        long j3 = cursor2.getLong(columnIndexOrThrow6);
        String string2 = cursor2.getString(columnIndexOrThrow7);
        UserJid userJid = (UserJid) this.A04.A08(cursor2.getLong(columnIndexOrThrow8));
        boolean A1U = AnonymousClass000.A1U(cursor2.getInt(columnIndexOrThrow9), 1);
        if (cursor2.isNull(columnIndexOrThrow10)) {
            j = -1;
        } else {
            j = cursor2.getLong(columnIndexOrThrow10);
        }
        if (A0B == null || userJid == null) {
            return null;
        }
        return new C50392i6(A0B, userJid, string, string2, i, j2, j3, j, A1U, A1T);
    }

    public String A03(AnonymousClass3ZF r4) {
        C50392i6 A022;
        if (r4.A0J == null || r4.A05 == null || (A022 = A02(r4.A05, r4.A0J.A00)) == null) {
            return null;
        }
        return A022.A06;
    }

    public C55422qK(C56972sr r1, C56612sH r2, C52852m9 r3, C56922sm r4, C623334p r5, C72303dV r6) {
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A05 = r6;
    }

    public List A04() {
        Cursor A0E;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass4GK A032 = this.A05.get();
        try {
            C56862sg r6 = ((AnonymousClass3H0) A032).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1Y(A1Y, System.currentTimeMillis() - 900000);
            A0E = r6.A0E("SELECT creation_message_row_id, key_id, key_from_me, key_chat_row_id, call_type, scheduled_timestamp, call_title, creator_jid_row_id, is_upcoming, call_log_row_id FROM scheduled_calls WHERE is_upcoming = 1  AND scheduled_timestamp >= ?  ORDER BY scheduled_timestamp ASC ", "SELECT_ALL_UPCOMING_CALLS", A1Y);
            while (A0E.moveToNext()) {
                C50392i6 A012 = A01(A0E);
                if (A012 != null) {
                    A0s.add(A012);
                }
            }
            A0E.close();
            A032.close();
            return A0s;
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
