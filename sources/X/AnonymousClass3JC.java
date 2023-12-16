package X;

/* renamed from: X.3JC  reason: invalid class name */
public class AnonymousClass3JC implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("parent_group_participants_parent_jid_index", "CREATE INDEX IF NOT EXISTS parent_group_participants_parent_jid_index ON parent_group_participants (parent_group_jid_row_id)");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[2];
        A00.A02 = "parent_group_jid_row_id";
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        A00.A00 = r2;
        C54912pU.A0j(A00, r3, true);
        C54912pU.A0V(A00, r2, "user_jid_row_id", r3, true);
        r7.A0E("parent_group_participants", r3);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
