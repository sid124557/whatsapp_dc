package X;

/* renamed from: X.3KS  reason: invalid class name */
public final class AnonymousClass3KS implements AnonymousClass4ED {
    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A01 = C54912pU.A01(r8);
        C59422wt[] r2 = new C59422wt[8];
        A01.A02 = "group_jid";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        A01.A00 = r1;
        A01.A04 = true;
        C54912pU.A0i(A01, r2, 0);
        C54912pU.A0V(A01, r1, "parent_group_jid", r2, true);
        C54912pU.A0W(A01, r1, "subject", r2, true);
        C54912pU.A0B(A01, r1, "description", r2);
        A01.A02 = "creator_jid";
        C54912pU.A0g(A01, r1, r2, true);
        A01.A02 = "request_creation_time";
        AnonymousClass220 r12 = AnonymousClass220.INTEGER;
        C54912pU.A0h(A01, r12, r2, true);
        r2[6] = C54912pU.A05(A01, r12, "participant_count", 0, true);
        A01.A02 = "is_existing_group";
        A01.A00 = AnonymousClass220.BOOLEAN;
        A01.A04 = true;
        A01.A01 = Integer.toString(0);
        r2[7] = A01.A0x();
        r8.A0D("member_suggested_groups_v2", AnonymousClass8UF.A0p(r2), AnonymousClass8UF.A0p("PRIMARY KEY (parent_group_jid,group_jid,creator_jid)"));
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
