package X;

/* renamed from: X.3K2  reason: invalid class name */
public final class AnonymousClass3K2 implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        C162457s7.A0J(r5, 0);
        r5.A0B("message_comment_parent_message_row_id_unique_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_comment_parent_message_row_id_unique_index ON message_comment (parent_message_row_id, message_row_id)");
        r5.A0B("message_comment_message_row_id_index", "CREATE INDEX IF NOT EXISTS message_comment_message_row_id_index ON message_comment (message_row_id)");
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C162457s7.A0J(r6, 0);
        C56622sI.A03(r6, "message", "message_comment", "message_row_id=old._id");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A01 = C54912pU.A01(r7);
        C59422wt[] A0r = C54912pU.A0r(A01);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        C54912pU.A0U(A01, r2, "parent_message_row_id", A0r, C54912pU.A0l(A01, r2, A0r) ? 1 : 0);
        C54912pU.A0A(A01, r2, "message_row_id", A0r);
        r7.A0E("message_comment", A0r);
    }
}
