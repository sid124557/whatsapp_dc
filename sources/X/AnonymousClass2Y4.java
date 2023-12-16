package X;

import android.database.Cursor;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.HashSet;

/* renamed from: X.2Y4  reason: invalid class name */
public class AnonymousClass2Y4 {
    public final C53132mb A00;
    public final C66393Lg A01;

    public int A00(C95814uZ r9, long j) {
        Cursor A03;
        Cursor A0E;
        C66393Lg r1 = this.A01;
        HashSet A0K = AnonymousClass002.A0K();
        try {
            AnonymousClass4GK A032 = r1.A0D.get();
            try {
                C56862sg r3 = ((AnonymousClass3H0) A032).A03;
                String[] A1Z = AnonymousClass0x9.A1Z();
                C18260x0.A1X(A1Z, j);
                C18270x1.A1R(A1Z, r1.A04.A07(r9));
                A0E = r3.A0E("SELECT message._id as _id FROM message_quoted JOIN message_view AS message ON message_quoted.message_row_id = message._id WHERE message.sort_id > ? AND message.chat_row_id = ? AND message.message_type <> 15 AND message_quoted.from_me = 1 LIMIT 100", "GET_QUOTED_ME_MESSAGES_NEWER_THAN_REF_SQL", A1Z);
                int A02 = AnonymousClass0x7.A02(A0E);
                while (A0E.moveToNext()) {
                    C18260x0.A0H(A0E, A0K, A02);
                }
                A0E.close();
                A032.close();
                C53132mb r32 = this.A00;
                PhoneUserJid A04 = C56972sr.A04(r32.A00);
                HashSet A0K2 = AnonymousClass002.A0K();
                if (A04 != null) {
                    String[] A1a = AnonymousClass0x9.A1a();
                    AnonymousClass0x2.A1S(A1a, 0, j);
                    C56922sm.A02(r32.A01, r9, A1a, 1);
                    AnonymousClass0x2.A1S(A1a, 2, r32.A02.A05(A04));
                    try {
                        AnonymousClass4GK A033 = r32.A03.get();
                        try {
                            A03 = C56862sg.A03(A033, "SELECT message._id AS _id FROM message_mentions JOIN message_view AS message ON message_mentions.message_row_id == message._id WHERE message.sort_id > ? AND message.chat_row_id = ? AND message_mentions.jid_row_id = ? AND message.message_type <> 15 LIMIT 100", "GET_MENTIONED_ME_MESSAGES_NEWER_THAN_REF_SQL", A1a);
                            int A022 = AnonymousClass0x7.A02(A03);
                            while (A03.moveToNext()) {
                                C18260x0.A0H(A03, A0K2, A022);
                            }
                            A03.close();
                            A033.close();
                        } catch (Throwable th) {
                            A033.close();
                            throw th;
                        }
                    } catch (Exception e) {
                        Log.e("MentionMessageStore/getMentionImportantMessagesNewerThanCount", e);
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                A0K.addAll(A0K2);
                return A0K.size();
                throw th;
                throw th;
            } catch (Throwable th3) {
                A032.close();
                throw th3;
            }
        } catch (Exception e2) {
            Log.e("QuotedMessageStore/getQuotedImportantMessagesNewerThanCount", e2);
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
    }

    public AnonymousClass2Y4(C53132mb r1, C66393Lg r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
