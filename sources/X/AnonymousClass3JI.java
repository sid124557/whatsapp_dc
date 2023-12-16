package X;

/* renamed from: X.3JI  reason: invalid class name */
public class AnonymousClass3JI implements AnonymousClass4ED {
    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0w = C54912pU.A0w(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        boolean A0o = C54912pU.A0o(A00, r2, A0w);
        C54912pU.A0V(A00, r2, "to_jid_row_id", A0w, A0o);
        C54912pU.A0A(A00, r2, "participant_jid_row_id", A0w);
        A00.A02 = "message_id";
        C54912pU.A0f(A00, AnonymousClass220.TEXT, A0w, A0o);
        r7.A0E("played_self_receipt", A0w);
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A03(r6, "message", "played_self_receipt", "message_row_id=old._id");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
