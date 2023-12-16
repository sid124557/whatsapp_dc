package X;

/* renamed from: X.3HA  reason: invalid class name */
public class AnonymousClass3HA implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("chat_assignee_index", "CREATE INDEX IF NOT EXISTS chat_assignee_index ON agent_chat_assignment (agent_id)");
    }

    public void B3j(C41492Kl r5, C56622sI r6) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r2 = new C59422wt[3];
        A00.A02 = "jid_row_id";
        boolean A0o = C54912pU.A0o(A00, AnonymousClass220.INTEGER, r2);
        A00.A02 = "agent_id";
        C54912pU.A0c(A00, AnonymousClass220.TEXT, r2, A0o);
        A00.A02 = "is_opened";
        C54912pU.A0Y(A00, AnonymousClass220.BOOLEAN, r2);
        r6.A0E("agent_chat_assignment", r2);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
