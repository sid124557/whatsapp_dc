package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2ow  reason: invalid class name and case insensitive filesystem */
public class C54572ow {
    public final C56922sm A00;
    public final C54762pF A01;
    public final C72303dV A02;

    public void A00(C85284Fq r8, GroupJid groupJid, boolean z) {
        if (!z) {
            String[] strArr = new String[1];
            C56922sm.A01(this.A00, groupJid, strArr);
            ContentValues A06 = AnonymousClass0x9.A06();
            AnonymousClass3H0.A01(A06, r8, "invalid_state", 1).A05(A06, "message_poll", "message_row_id IN (SELECT _id FROM available_message_view WHERE (available_message_view.chat_row_id = ? AND available_message_view.message_type = 66))", "message_poll.INVALIDATE_POLL_MESSAGES", strArr);
            C70093Zw.A01(r8, this, groupJid, 45);
        }
    }

    public void A01(C30451mT r14) {
        Cursor A0E;
        Cursor A0E2;
        C72303dV r5 = this.A02;
        AnonymousClass4GK A03 = r5.get();
        try {
            C56862sg r4 = ((AnonymousClass3H0) A03).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1Y(A1Y, r14.A1L);
            A0E = r4.A0E("SELECT selectable_options_count, invalid_state, poll_logging_id FROM message_poll WHERE message_row_id = ?", "GET_MESSAGE_POLL_SQL", A1Y);
            if (A0E.moveToLast()) {
                int columnIndexOrThrow = A0E.getColumnIndexOrThrow("selectable_options_count");
                int columnIndexOrThrow2 = A0E.getColumnIndexOrThrow("invalid_state");
                int columnIndexOrThrow3 = A0E.getColumnIndexOrThrow("poll_logging_id");
                r14.A01 = A0E.getInt(columnIndexOrThrow);
                r14.A00 = A0E.getInt(columnIndexOrThrow2);
                r14.A02 = A0E.getLong(columnIndexOrThrow3);
            }
            A0E.close();
            A03.close();
            AnonymousClass4GK A032 = r5.get();
            try {
                C56862sg r42 = ((AnonymousClass3H0) A032).A03;
                String[] A1Y2 = AnonymousClass0x9.A1Y();
                C18260x0.A1Y(A1Y2, r14.A1L);
                A0E2 = r42.A0E("SELECT _id, option_sha256, option_name, vote_total FROM message_poll_option WHERE message_row_id = ?", "GET_MESSAGE_POLL_OPTION_SQL", A1Y2);
                if (!A0E2.moveToFirst()) {
                    A0E2.close();
                    A032.close();
                    return;
                }
                ArrayList A0s = AnonymousClass001.A0s();
                int A022 = AnonymousClass0x7.A02(A0E2);
                int columnIndexOrThrow4 = A0E2.getColumnIndexOrThrow("option_name");
                int columnIndexOrThrow5 = A0E2.getColumnIndexOrThrow("option_sha256");
                int columnIndexOrThrow6 = A0E2.getColumnIndexOrThrow("vote_total");
                do {
                    long j = A0E2.getLong(A022);
                    String string = A0E2.getString(columnIndexOrThrow4);
                    String string2 = A0E2.getString(columnIndexOrThrow5);
                    int i = A0E2.getInt(columnIndexOrThrow6);
                    C60142y4 r0 = new C60142y4(string, string2);
                    r0.A01 = j;
                    r0.A00 = i;
                    A0s.add(r0);
                } while (A0E2.moveToNext());
                A0E2.close();
                A032.close();
                List list = r14.A05;
                list.clear();
                list.addAll(A0s);
                return;
            } catch (Throwable th) {
                th = th;
                try {
                    A032.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
            throw th;
        } catch (Throwable th3) {
            th = th3;
            A03.close();
            throw th;
        }
    }

    public void A02(C30451mT r12) {
        Log.d("PollMessageStore/insertOrUpdateMessagePoll");
        C72303dV r6 = this.A02;
        C85284Fq A04 = r6.A04();
        try {
            ContentValues A06 = C18300x5.A06();
            C18270x1.A0c(A06, "message_row_id", r12.A1L);
            C18270x1.A0b(A06, "selectable_options_count", r12.A01);
            C18270x1.A0b(A06, "invalid_state", r12.A00);
            if (AnonymousClass3H0.A02(A06, A04, "poll_logging_id", r12.A02).A0C("message_poll", "insertOrUpdateMessagePoll/INSERT_MESSAGE_POLL", A06, 5) < 0) {
                Log.e(C624134x.A0C(r12, "PollMessageStore/insertOrUpdateMessagePoll/insert error, rowId=", AnonymousClass001.A0o()));
            }
            A04.close();
            A04 = r6.A04();
            try {
                Iterator it = r12.A05.iterator();
                while (it.hasNext()) {
                    C60142y4 A0Z = AnonymousClass0x9.A0Z(it);
                    ContentValues A07 = AnonymousClass0x9.A07(5);
                    C18270x1.A0c(A07, "message_row_id", r12.A1L);
                    A07.put("option_sha256", A0Z.A02);
                    A07.put("option_name", A0Z.A03);
                    C18270x1.A0b(A07, "vote_total", A0Z.A00);
                    long j = A0Z.A01;
                    if (j != -1) {
                        C18270x1.A0c(A07, "_id", j);
                    }
                    long A0C = ((AnonymousClass3H0) A04).A03.A0C("message_poll_option", "PollMessageStore/insertOrUpdatePollOptionTable", A07, 5);
                    if (A0C != -1) {
                        A0Z.A01 = A0C;
                    } else {
                        throw new SQLException("PollMessageStore/insertOrUpdatePollOptionTable the row was not updated");
                    }
                }
                A04.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        } finally {
            th = th;
            A04.close();
        }
    }

    public void A03(C30451mT r14) {
        C69833Yo Axl;
        C85284Fq A04 = this.A02.A04();
        try {
            Axl = A04.Axl();
            Iterator it = r14.A05.iterator();
            while (it.hasNext()) {
                C60142y4 A0Z = AnonymousClass0x9.A0Z(it);
                ContentValues A07 = AnonymousClass0x9.A07(1);
                C56862sg A012 = AnonymousClass3H0.A01(A07, A04, "vote_total", A0Z.A00);
                String[] strArr = new String[1];
                C18260x0.A1X(strArr, A0Z.A01);
                if (A012.A05(A07, "message_poll_option", "_id = ?", "PollMessageStore/MESSAGE_POLL_OPTION_UPDATE_VOTE_TOTAL", strArr) != 1) {
                    throw new SQLException("updatePollOptionVoteTotals/updatePollOptionVoteTotals the row was not updated");
                }
            }
            Axl.A00();
            Axl.close();
            A04.close();
            return;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C54572ow(C56922sm r1, C54762pF r2, C72303dV r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
