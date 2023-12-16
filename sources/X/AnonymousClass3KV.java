package X;

/* renamed from: X.3KV  reason: invalid class name */
public class AnonymousClass3KV implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("incoming_tc_token_timestamp_index", "CREATE INDEX IF NOT EXISTS incoming_tc_token_timestamp_index ON wa_trusted_contacts (incoming_tc_token_timestamp)");
    }

    public void B3j(C41492Kl r5, C56622sI r6) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r2 = new C59422wt[3];
        A00.A02 = "jid";
        boolean A0k = C54912pU.A0k(A00, AnonymousClass220.TEXT);
        C54912pU.A0j(A00, r2, A0k);
        A00.A02 = "incoming_tc_token";
        C54912pU.A0c(A00, AnonymousClass220.BLOB, r2, A0k);
        A00.A02 = "incoming_tc_token_timestamp";
        C54912pU.A0e(A00, AnonymousClass220.LONG, r2, A0k);
        r6.A0E("wa_trusted_contacts", r2);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
