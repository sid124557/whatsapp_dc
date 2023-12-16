package X;

/* renamed from: X.3Hz  reason: invalid class name and case insensitive filesystem */
public final class C65563Hz implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        C162457s7.A0J(r5, 0);
        r5.A0B("message_bot_feedback_index", "CREATE INDEX IF NOT EXISTS message_bot_feedback_index ON message_bot_feedback (bot_feedback_key_remote_jid, bot_feedback_key_from_me, bot_feedback_key_id)");
    }

    public void B3j(C41492Kl r8, C56622sI r9) {
        C54912pU A01 = C54912pU.A01(r9);
        C59422wt[] r3 = new C59422wt[8];
        AnonymousClass220 A02 = AnonymousClass220.A02(A01);
        boolean A0n = C54912pU.A0n(A01, A02, r3);
        C54912pU.A0V(A01, A02, "bot_feedback_kind", r3, A0n);
        A01.A02 = "bot_feedback_text";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0e(A01, r1, r3, A0n);
        C54912pU.A0X(A01, r1, "bot_feedback_key_remote_jid", r3, A0n);
        A01.A02 = "bot_feedback_key_from_me";
        C54912pU.A0g(A01, A02, r3, A0n);
        A01.A02 = "bot_feedback_key_id";
        C54912pU.A0h(A01, r1, r3, A0n);
        r3[6] = C54912pU.A05(A01, A02, "bot_feedback_kind_positive", 0, A0n);
        r3[7] = C54912pU.A05(A01, A02, "bot_feedback_kind_negative", 0, A0n);
        r9.A0E("message_bot_feedback", r3);
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C162457s7.A0J(r6, 0);
        C56622sI.A04(r6, "message", "message_bot_feedback", "message_row_id=old._id");
    }
}
