package X;

/* renamed from: X.3HI  reason: invalid class name */
public final class AnonymousClass3HI implements AnonymousClass4ED {
    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A01 = C54912pU.A01(r8);
        C59422wt[] r3 = new C59422wt[3];
        A01.A02 = "chat_row_id";
        boolean A0n = C54912pU.A0n(A01, AnonymousClass220.INTEGER, r3);
        A01.A02 = "pip_enabled";
        AnonymousClass220 r1 = AnonymousClass220.BOOLEAN;
        A01.A00 = r1;
        A01.A01 = Integer.toString(0);
        C54912pU.A0i(A01, r3, A0n ? 1 : 0);
        C54912pU.A0A(A01, r1, "welcome_request_message_sent", r3);
        r8.A0E("bot_chat_info", r3);
    }

    public /* synthetic */ void B3l(C56862sg r3, C41492Kl r4, C56622sI r5) {
        C162457s7.A0J(r5, 0);
        r5.A0C("chat_bd_for_bot_chat_info_trigger", "CREATE TRIGGER chat_bd_for_bot_chat_info_trigger BEFORE DELETE ON chat BEGIN DELETE FROM bot_chat_info WHERE chat_row_id = old._id; END");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
