package X;

/* renamed from: X.3Ka  reason: invalid class name and case insensitive filesystem */
public class C66093Ka implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("subgroup_raw_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS subgroup_raw_jid_index ON subgroup_info (subgroup_raw_jid)");
    }

    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r4 = new C59422wt[4];
        A00.A02 = "subgroup_raw_jid";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        A00.A00 = r1;
        C54912pU.A0j(A00, r4, true);
        C54912pU.A0V(A00, r1, "subject", r4, true);
        A00.A02 = "subject_ts";
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        r4[2] = C54912pU.A02(A00, r2);
        r4[3] = C54912pU.A05(A00, r2, "group_type", 2, true);
        r8.A0E("subgroup_info", r4);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
