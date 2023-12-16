package X;

import android.text.TextUtils;

/* renamed from: X.3Kx  reason: invalid class name and case insensitive filesystem */
public class C66323Kx implements AnonymousClass4ED, C838049v {
    public void B17(C56862sg r10, C41492Kl r11) {
        C56862sg r3 = r10;
        String A00 = C626235v.A00(r10, "table", "group_participant_user");
        if (!TextUtils.isEmpty(A00)) {
            if (C626235v.A07(A00, "admin", "INTEGER")) {
                C626235v.A03(r10, "TableGroupParticipantUser", "group_participant_user");
            } else {
                C626235v.A05(r3, A00, "group_participant_user", "rank", "INTEGER", "TableGroupParticipantUser");
                C626235v.A05(r3, A00, "group_participant_user", "pending", "INTEGER", "TableGroupParticipantUser");
                return;
            }
        }
        r10.A0H("CREATE TABLE group_participant_user (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_jid_row_id INTEGER NOT NULL, user_jid_row_id INTEGER NOT NULL, rank INTEGER, pending INTEGER)", "CREATE_GROUP_PARTICIPANT_USER_TABLE");
    }

    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("group_participant_user_index", "CREATE UNIQUE INDEX IF NOT EXISTS group_participant_user_index ON group_participant_user (group_jid_row_id, user_jid_row_id)");
    }

    public void B3j(C41492Kl r2, C56622sI r3) {
        r3.A09(this, "group_participant_user");
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
