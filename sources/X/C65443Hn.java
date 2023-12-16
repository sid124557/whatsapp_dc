package X;

/* renamed from: X.3Hn  reason: invalid class name and case insensitive filesystem */
public class C65443Hn implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("labeled_messages_index", "CREATE UNIQUE INDEX IF NOT EXISTS labeled_messages_index ON labeled_messages (label_id, message_row_id)");
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A03(r6, "message", "labeled_messages", "message_row_id=old._id");
        C56622sI.A03(r6, "labels", "labeled_messages", "label_id=old._id");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0r = C54912pU.A0r(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        boolean A0m = C54912pU.A0m(A00, r2, A0r);
        C54912pU.A0V(A00, r2, "label_id", A0r, A0m);
        C54912pU.A0W(A00, r2, "message_row_id", A0r, A0m);
        r7.A0E("labeled_messages", A0r);
    }
}
