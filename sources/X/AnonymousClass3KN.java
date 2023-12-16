package X;

/* renamed from: X.3KN  reason: invalid class name */
public class AnonymousClass3KN implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("group_relationship_parent_raw_jid_index", "CREATE INDEX IF NOT EXISTS group_relationship_parent_raw_jid_index ON group_relationship (parent_raw_jid)");
        r5.A0B("group_relationship_subgroup_raw_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS group_relationship_subgroup_raw_jid_index ON group_relationship (subgroup_raw_id)");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[2];
        A00.A02 = "parent_raw_jid";
        AnonymousClass220 r2 = AnonymousClass220.TEXT;
        A00.A00 = r2;
        C54912pU.A0j(A00, r3, true);
        C54912pU.A0V(A00, r2, "subgroup_raw_id", r3, true);
        r7.A0E("group_relationship", r3);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
