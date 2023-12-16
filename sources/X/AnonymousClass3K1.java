package X;

/* renamed from: X.3K1  reason: invalid class name */
public final class AnonymousClass3K1 implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        C162457s7.A0J(r5, 0);
        r5.A0B("message_parent_last_comment_index", "\n          CREATE INDEX IF NOT EXISTS \n          message_parent_last_comment_index \n          ON message_comment_parent (chat_row_id, last_comment_message_row_id)\n        ");
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C162457s7.A0J(r4, 0);
        C56622sI.A00(r4, "message_comment_parent");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A01 = C54912pU.A01(r7);
        C59422wt[] r3 = new C59422wt[5];
        AnonymousClass220 A02 = AnonymousClass220.A02(A01);
        boolean A0n = C54912pU.A0n(A01, A02, r3);
        C54912pU.A0U(A01, A02, "chat_row_id", r3, A0n ? 1 : 0);
        C54912pU.A0W(A01, A02, "number_of_comments", r3, A0n);
        C54912pU.A0B(A01, A02, "last_comment_ts", r3);
        C54912pU.A0C(A01, A02, "last_comment_message_row_id", r3);
        r7.A0E("message_comment_parent", r3);
    }
}
