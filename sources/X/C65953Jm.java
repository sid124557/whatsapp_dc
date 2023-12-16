package X;

/* renamed from: X.3Jm  reason: invalid class name and case insensitive filesystem */
public class C65953Jm implements AnonymousClass4ED {
    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0w = C54912pU.A0w(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        C54912pU.A0V(A00, r2, "customer_message_row_id", A0w, C54912pU.A0o(A00, r2, A0w));
        A00.A02 = "tokenized_customer_message";
        C54912pU.A0Y(A00, AnonymousClass220.STRING, A0w);
        A00.A02 = "customer_message_embedding";
        C54912pU.A0Z(A00, AnonymousClass220.BLOB, A0w);
        r7.A0E("suggested_replies", A0w);
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A03(r6, "message", "suggested_replies", "message_row_id=old._id OR customer_message_row_id=old._id");
        r6.A0C("suggested_replies_delete_oldest_trigger", "CREATE TRIGGER IF NOT EXISTS suggested_replies_delete_oldest_trigger BEFORE INSERT ON suggested_replies FOR EACH ROW WHEN (SELECT COUNT(*) FROM suggested_replies ) > 2000 BEGIN DELETE FROM suggested_replies WHERE message_row_id = (SELECT MIN(message_row_id) FROM suggested_replies); END;");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
