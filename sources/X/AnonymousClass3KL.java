package X;

/* renamed from: X.3KL  reason: invalid class name */
public final class AnonymousClass3KL implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        C162457s7.A0J(r5, 0);
        r5.A0B("request_creation_time_index", " CREATE INDEX IF NOT EXISTS request_creation_time_index ON group_membership_approval_requests(request_creation_time);");
    }

    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A01 = C54912pU.A01(r8);
        C59422wt[] r3 = new C59422wt[6];
        A01.A02 = "group_jid";
        AnonymousClass220 r2 = AnonymousClass220.TEXT;
        A01.A00 = r2;
        A01.A04 = true;
        C54912pU.A0i(A01, r3, 0);
        C54912pU.A0V(A01, r2, "requester_jid", r3, true);
        C54912pU.A0W(A01, r2, "request_method", r3, true);
        A01.A02 = "request_creation_time";
        C54912pU.A0Z(A01, AnonymousClass220.INTEGER, r3);
        C54912pU.A0C(A01, r2, "parent_group_jid", r3);
        C54912pU.A0D(A01, r2, "requested_by_jid", r3);
        r8.A0D("group_membership_approval_requests", AnonymousClass8UF.A0p(r3), AnonymousClass8UF.A0p("PRIMARY KEY (group_jid,requester_jid)"));
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
