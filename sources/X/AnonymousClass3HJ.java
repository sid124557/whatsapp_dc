package X;

/* renamed from: X.3HJ  reason: invalid class name */
public class AnonymousClass3HJ implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("bot_message_info_target_id_index", " CREATE INDEX IF NOT EXISTS bot_message_info_target_id_index ON bot_message_info(target_id);");
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A03(r6, "message", "bot_message_info", "message_row_id=old._id");
    }

    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0v = C54912pU.A0v(A00);
        AnonymousClass220 r3 = AnonymousClass220.INTEGER;
        A00.A00 = r3;
        boolean A0p = C54912pU.A0p(A00, A0v);
        A00.A02 = "target_id";
        C54912pU.A0b(A00, AnonymousClass220.TEXT, A0v, 1);
        A0v[2] = C54912pU.A04(A00, r3, "message_state", A0p ? 1 : 0);
        r8.A0E("bot_message_info", A0v);
    }
}
