package X;

/* renamed from: X.3I5  reason: invalid class name */
public class AnonymousClass3I5 implements AnonymousClass4ED {
    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[3];
        A00.A02 = "chat_jid";
        boolean A0k = C54912pU.A0k(A00, AnonymousClass220.TEXT);
        C54912pU.A0j(A00, r3, A0k);
        A00.A02 = "last_sync_response_sent_timestamp";
        AnonymousClass220 r1 = AnonymousClass220.INTEGER;
        C54912pU.A0c(A00, r1, r3, A0k);
        r3[2] = C54912pU.A06(A00, r1, "no_of_retries_sent_already", A0k);
        r7.A0E("message_ephemeral_sync_response", r3);
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
