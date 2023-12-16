package X;

/* renamed from: X.3JL  reason: invalid class name */
public class AnonymousClass3JL implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("priority_inbox_chat_row_index", "CREATE INDEX IF NOT EXISTS priority_inbox_chat_row_index ON priority_inbox (chat_row_id)");
        r5.A0B("priority_inbox_time_created_index", "CREATE INDEX IF NOT EXISTS priority_inbox_time_created_index ON priority_inbox (time_created)");
        r5.A0B("priority_inbox_score_index", "CREATE INDEX IF NOT EXISTS priority_inbox_score_index ON priority_inbox (priority_score)");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[8];
        AnonymousClass220 A01 = AnonymousClass220.A01(A00);
        boolean A0m = C54912pU.A0m(A00, A01, r3);
        A00.A02 = "priority_score";
        C54912pU.A0c(A00, AnonymousClass220.DOUBLE, r3, A0m);
        C54912pU.A0W(A00, A01, "version", r3, A0m);
        C54912pU.A0X(A00, A01, "chat_row_id", r3, A0m);
        A00.A02 = "is_priority";
        AnonymousClass220 r1 = AnonymousClass220.BOOLEAN;
        C54912pU.A0a(A00, r1, r3);
        C54912pU.A0D(A00, r1, "label_removed", r3);
        C54912pU.A0E(A00, A01, "time_created", r3);
        C54912pU.A0F(A00, r1, "deep_conversion_rate", r3);
        r7.A0E("priority_inbox", r3);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
