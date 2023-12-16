package X;

/* renamed from: X.3KH  reason: invalid class name */
public class AnonymousClass3KH implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("wa_contact_storage_usage_index", " CREATE INDEX IF NOT EXISTS wa_contact_storage_usage_index ON wa_contact_storage_usage (jid, conversation_size DESC)");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0s = C54912pU.A0s(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        boolean A0m = C54912pU.A0m(A00, r2, A0s);
        A00.A02 = "jid";
        C54912pU.A0c(A00, AnonymousClass220.TEXT, A0s, A0m);
        C54912pU.A0W(A00, r2, "conversation_size", A0s, A0m);
        C54912pU.A0X(A00, r2, "conversation_message_count", A0s, A0m);
        r7.A0E("wa_contact_storage_usage", A0s);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
