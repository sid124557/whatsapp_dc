package X;

import android.content.ContentValues;
import java.util.Collections;

/* renamed from: X.3L0  reason: invalid class name */
public class AnonymousClass3L0 implements AnonymousClass4ED, C838049v {
    public void B3j(C41492Kl r2, C56622sI r3) {
        r3.A09(this, "message");
    }

    public void B17(C56862sg r12, C41492Kl r13) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[21];
        A00.A02 = "_id";
        AnonymousClass220 r8 = AnonymousClass220.INTEGER;
        A00.A00 = r8;
        boolean A0q = C54912pU.A0q(A00, r3);
        C54912pU.A0V(A00, r8, "chat_row_id", r3, true);
        C54912pU.A0W(A00, r8, "from_me", r3, true);
        A00.A02 = "key_id";
        AnonymousClass220 r10 = AnonymousClass220.TEXT;
        C54912pU.A0f(A00, r10, r3, true);
        C54912pU.A0C(A00, r8, "sender_jid_row_id", r3);
        C54912pU.A0D(A00, r8, "status", r3);
        C54912pU.A0E(A00, r8, "broadcast", r3);
        C54912pU.A0F(A00, r8, "recipient_count", r3);
        C54912pU.A0G(A00, r10, "participant_hash", r3);
        C54912pU.A0H(A00, r8, "origination_flags", r3);
        C54912pU.A0I(A00, r8, "origin", r3);
        C54912pU.A0J(A00, r8, "timestamp", r3);
        C54912pU.A0K(A00, r8, "received_timestamp", r3);
        C54912pU.A0L(A00, r8, "receipt_server_timestamp", r3);
        C54912pU.A0M(A00, r8, "message_type", r3);
        C54912pU.A0N(A00, r10, "text_data", r3);
        C54912pU.A0O(A00, r8, "starred", r3);
        C54912pU.A0P(A00, r8, "lookup_tables", r3);
        C54912pU.A0Q(A00, r8, "message_add_on_flags", r3);
        C54912pU.A0R(A00, r8, "view_mode", r3);
        if (C626235v.A06(r12, "message", AnonymousClass0x9.A1A(C54912pU.A05(A00, r8, "sort_id", A0q ? 1 : 0, true), r3, 20), Collections.emptyList())) {
            ContentValues A06 = AnonymousClass0x9.A06();
            C18270x1.A0c(A06, "_id", 1);
            C18270x1.A0b(A06, "chat_row_id", -1);
            C18270x1.A0b(A06, "from_me", 0);
            A06.put("key_id", "-1");
            r12.A08("message", "INSERT_TABLE_MESSAGE_FIRST_MESSAGE", A06);
        }
    }

    public /* synthetic */ void B3g(C56862sg r6, C41492Kl r7, C56622sI r8) {
        r8.A0B("message_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_key_index ON message (chat_row_id, from_me, key_id, sender_jid_row_id)");
        r8.A0B("message_sort_id_index", "CREATE INDEX IF NOT EXISTS message_sort_id_index ON message (sort_id)");
        r8.A0B("message_starred_index", "CREATE INDEX IF NOT EXISTS message_starred_index ON message(starred)");
        r8.A0B("message_type_chat_index", "CREATE INDEX IF NOT EXISTS message_type_chat_index ON message(chat_row_id, message_type)");
        r8.A0B("message_chat_id_index", "CREATE INDEX IF NOT EXISTS message_chat_id_index ON message (chat_row_id,_id)");
        r8.A0B("message_type_index", "CREATE INDEX IF NOT EXISTS message_type_index ON message(message_type)");
        if (r7.A01) {
            r8.A0B("message_chat_sort_id_index", "CREATE INDEX IF NOT EXISTS message_chat_sort_id_index ON message (chat_row_id, sort_id)");
            r8.A0B("message_starred_sort_id_index", "CREATE INDEX IF NOT EXISTS message_starred_sort_id_index ON message (starred, sort_id)");
            return;
        }
        r8.A0A("message_chat_sort_id_index", "CREATE INDEX IF NOT EXISTS message_chat_sort_id_index ON message (chat_row_id, sort_id)");
        r8.A0A("message_starred_sort_id_index", "CREATE INDEX IF NOT EXISTS message_starred_sort_id_index ON message (starred, sort_id)");
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
