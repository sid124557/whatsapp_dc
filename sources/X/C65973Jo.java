package X;

/* renamed from: X.3Jo  reason: invalid class name and case insensitive filesystem */
public class C65973Jo implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("group_past_participant_user_timestamp_index", "CREATE INDEX IF NOT EXISTS group_past_participant_user_timestamp_index ON group_past_participant_user (timestamp)");
        r5.A0B("group_past_participant_user_index", "CREATE UNIQUE INDEX IF NOT EXISTS group_past_participant_user_index ON group_past_participant_user (group_jid_row_id, user_jid_row_id)");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0t = C54912pU.A0t(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        boolean A0m = C54912pU.A0m(A00, r2, A0t);
        C54912pU.A0V(A00, r2, "group_jid_row_id", A0t, A0m);
        C54912pU.A0W(A00, r2, "user_jid_row_id", A0t, A0m);
        C54912pU.A0X(A00, r2, "is_leave", A0t, A0m);
        C54912pU.A0C(A00, r2, "timestamp", A0t);
        r7.A0E("group_past_participant_user", A0t);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
