package X;

/* renamed from: X.3Ib  reason: invalid class name and case insensitive filesystem */
public class C65583Ib implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("message_system_chat_participant_index", "CREATE INDEX IF NOT EXISTS message_system_chat_participant_index ON message_system_chat_participant (message_row_id)");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0u = C54912pU.A0u(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        A0u[0] = C54912pU.A02(A00, r2);
        A0u[1] = C54912pU.A03(A00, r2, "user_jid_row_id");
        r7.A0E("message_system_chat_participant", A0u);
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A02(r4, "message_system_chat_participant");
    }
}
