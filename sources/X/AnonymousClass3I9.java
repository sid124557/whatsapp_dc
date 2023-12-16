package X;

@Deprecated
/* renamed from: X.3I9  reason: invalid class name */
public class AnonymousClass3I9 implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("message_link_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_link_index ON message_link (message_row_id, link_index)");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0s = C54912pU.A0s(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        C54912pU.A0U(A00, r2, "chat_row_id", A0s, C54912pU.A0m(A00, r2, A0s) ? 1 : 0);
        C54912pU.A0A(A00, r2, "message_row_id", A0s);
        C54912pU.A0B(A00, r2, "link_index", A0s);
        r7.A0E("message_link", A0s);
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A00(r6, "message_link");
        C56622sI.A05(r6, "chat", "message_link", "chat_row_id=old._id");
    }
}
